package com.oanda.v20;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.*;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.oanda.v20.account.AccountContext;
import com.oanda.v20.order.OrderContext;
import com.oanda.v20.order.Order;
import com.oanda.v20.order.OrderAdapter;
import com.oanda.v20.position.PositionContext;
import com.oanda.v20.user.UserContext;
import com.oanda.v20.transaction.TransactionContext;
import com.oanda.v20.transaction.Transaction;
import com.oanda.v20.transaction.TransactionAdapter;
import com.oanda.v20.pricing.PricingContext;
import com.oanda.v20.trade.TradeContext;
import com.oanda.v20.instrument.InstrumentContext;

public class Context {
    public AccountContext account;
    public OrderContext order;
    public PositionContext position;
    public UserContext user;
    public TransactionContext transaction;
    public PricingContext pricing;
    public TradeContext trade;
    public InstrumentContext instrument;

    protected Gson gson;

    private HttpClient httpClient;
    private String uri;
    private String token;

    public Context(String uri, String token) {
        this(uri, token, HttpClients.createDefault());
    }

    public Context(String uri, String token, HttpClient httpClient) {
        this.uri = uri;
        this.token = token;
        this.httpClient = httpClient;

        this.gson = new GsonBuilder()
            .setPrettyPrinting()
            .registerTypeAdapter(Order.class, new OrderAdapter())
            .registerTypeAdapter(Transaction.class, new TransactionAdapter())
            .create();

        this.account = new AccountContext(this);
        this.order = new OrderContext(this);
        this.position = new PositionContext(this);
        this.user = new UserContext(this);
        this.transaction = new TransactionContext(this);
        this.pricing = new PricingContext(this);
        this.trade = new TradeContext(this);
        this.instrument = new InstrumentContext(this);
    }

    public Object execute(
        String method,
        String path,
        Request request,
        Map<Integer, Class<?>> responseMap
    ) throws ExecuteException, RequestException
    {
        // Set the path arguments
        for(Map.Entry<String,Object> entry : request.getPathParams().entrySet())
        {
            String keyname = '{' + entry.getKey() + '}';
            if (! path.contains(keyname)) {
                throw new ExecuteException(
                    "No key " + keyname + " found in path '" + path + "'",
                    null
                );
            }
            path = path.replace(keyname, entry.getValue().toString());
        }

        URIBuilder uriBuilder;

        try {
            uriBuilder = new URIBuilder(this.uri + path);
        } catch (URISyntaxException e) {
            throw new ExecuteException(e);
        }

        // Query Parameters
        request.getQueryParams().forEach( (key, value) -> {
            // Handle arrays
            if (value.getClass().isArray()) {
                String array = "";
                int length = Array.getLength(value);
                for (int i = 0; i < length; ++i) {
                    if (i != 0)
                        array += ",";
                    array += Array.get(value, i).toString();
                }
                uriBuilder.addParameter(key, array);
            }
            else {
                uriBuilder.addParameter(key, value.toString());
            }
        });

        HttpUriRequest httpReq;

        try {
            httpReq = newHttpRequest(method, uriBuilder.build());
        } catch (MethodNotSupportedException | URISyntaxException e) {
            throw new ExecuteException(e);
        }

        if (this.token != null && this.token != "") {
            httpReq.addHeader("Authorization","Bearer " + this.token);
        }
        httpReq.addHeader("Content-Type", "application/json");

        if (request.getBody() != null) {
            if (httpReq instanceof HttpEntityEnclosingRequestBase)
            {
                try {
                    ((HttpEntityEnclosingRequestBase) httpReq).setEntity(
                        new ByteArrayEntity(this.gson.toJson(
                                request.getBody()).getBytes("UTF-8")
                        )
                    );
                } catch (UnsupportedEncodingException e) {
                    throw new ExecuteException(e);
                }
            }
        }

        HttpResponse httpRes;

        try {
            httpRes = this.httpClient.execute(httpReq);
        } catch (IOException e) {
            throw new ExecuteException(e);
        }

        int statusCode = httpRes.getStatusLine().getStatusCode();
        HttpEntity entity = httpRes.getEntity();

        // Get the response body as text
        String responseBody;

        try {
            responseBody = EntityUtils.toString(entity);
        } catch (ParseException | IOException e) {
            throw new ExecuteException(e);
        }

        // Return a success response
        if (statusCode / 100 == 2) {
            if (! responseMap.containsKey(statusCode)) {
                throw new ExecuteException(
                    "Unknown success response code " + statusCode, null
                );
            }
            return gson.fromJson(responseBody, responseMap.get(statusCode));
        }

        // Throw an error response
        RequestException error;

        if (responseMap.containsKey(statusCode)) {
            error = (RequestException) gson.fromJson(
                responseBody, responseMap.get(statusCode)
            );
            error.status = statusCode;
        } else {
            error = new RequestException(statusCode);
        }

        throw error;
    }

    private HttpUriRequest newHttpRequest(String method, URI uri)
        throws MethodNotSupportedException
    {
        if (method == "GET")
            return new HttpGet(uri);
        if (method == "POST")
            return new HttpPost(uri);
        if (method == "PUT")
            return new HttpPut(uri);
        if (method == "DELETE")
            return new HttpDelete(uri);
        if (method == "PATCH")
            return new HttpPatch(uri);

        throw new MethodNotSupportedException(
            "Invalid method \"" + method + "\""
        );
    }
}
