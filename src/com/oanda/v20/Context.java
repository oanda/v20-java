package com.oanda.v20;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

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
import com.google.gson.JsonSyntaxException;

import com.oanda.v20.instrument.InstrumentContext;
import com.oanda.v20.position.PositionContext;
import com.oanda.v20.trade.TradeContext;
import com.oanda.v20.account.AccountContext;
import com.oanda.v20.transaction.TransactionContext;
import com.oanda.v20.transaction.Transaction;
import com.oanda.v20.transaction.TransactionAdapter;
import com.oanda.v20.user.UserContext;
import com.oanda.v20.pricing.PricingContext;
import com.oanda.v20.order.OrderContext;
import com.oanda.v20.order.Order;
import com.oanda.v20.order.OrderAdapter;
import com.oanda.v20.primitives.NullableTypeAdapterFactory;
import com.oanda.v20.primitives.AcceptDatetimeFormat;

public class Context {
    public InstrumentContext instrument;
    public PositionContext position;
    public TradeContext trade;
    public AccountContext account;
    public TransactionContext transaction;
    public UserContext user;
    public PricingContext pricing;
    public OrderContext order;

    protected Gson gson;

    private HttpClient httpClient;
    private String uri;
    private String token;
    private HashMap<String, Object> headers = new HashMap<>();

    /**
     * Constructs the Context object.
     *
     * @param      uri    The uri
     * @param      token  The token
     * @deprecated Use ContextBuilder instead.
     */
    @Deprecated
    public Context(String uri, String token) {
        this(uri, token, "", AcceptDatetimeFormat.RFC3339, HttpClients.createDefault());
    }

    /**
     * Constructs the Context object.
     *
     * @param      uri             The uri
     * @param      token           The token
     * @param      application     The application
     * @param      datetimeFormat  The datetime format
     * @param      httpClient      The http client
     */
    public Context(
        String uri,
        String token,
        String application,
        AcceptDatetimeFormat datetimeFormat,
        HttpClient httpClient
    ) {
        this.uri = uri;
        this.token = token;
        this.httpClient = httpClient;

        String extensions = null;

        if (application.length() != 0) {
            extensions = new String(" (" + application + ")");
        }

        String oandaAgent = new String(
            "v20-java/3.0.25" + extensions
        );

        this.headers.put("Content-Type", "application/json");
        this.headers.put("OANDA-Agent", oandaAgent);
        this.setDatetimeFormat(datetimeFormat);

        this.gson = new GsonBuilder()
            .setPrettyPrinting()
            .registerTypeAdapter(Transaction.class, new TransactionAdapter())
            .registerTypeAdapter(Order.class, new OrderAdapter())
            .registerTypeAdapterFactory(
                new NullableTypeAdapterFactory<com.oanda.v20.transaction.TakeProfitDetails>(
                    com.oanda.v20.transaction.TakeProfitDetails.class
                )
            )
            .registerTypeAdapterFactory(
                new NullableTypeAdapterFactory<com.oanda.v20.transaction.StopLossDetails>(
                    com.oanda.v20.transaction.StopLossDetails.class
                )
            )
            .registerTypeAdapterFactory(
                new NullableTypeAdapterFactory<com.oanda.v20.transaction.TrailingStopLossDetails>(
                    com.oanda.v20.transaction.TrailingStopLossDetails.class
                )
            )
            .create();

        this.instrument = new InstrumentContext(this);
        this.position = new PositionContext(this);
        this.trade = new TradeContext(this);
        this.account = new AccountContext(this);
        this.transaction = new TransactionContext(this);
        this.user = new UserContext(this);
        this.pricing = new PricingContext(this);
        this.order = new OrderContext(this);
    }

    /**
     * Set the Accept-Datetime-Format header to an acceptable value
     * <p>
     * @param  format  the format
     */
    public void setDatetimeFormat(AcceptDatetimeFormat format) throws IllegalArgumentException {
        if (format == AcceptDatetimeFormat.UNIX) {
            setHeader("Accept-Datetime-Format", "UNIX");
        } else if (format == AcceptDatetimeFormat.RFC3339) {
            setHeader("Accept-Datetime-Format", "RFC3339");
        } else {
            throw new IllegalArgumentException(
                "Unexpected format type for Accept-Datetime-Format header"
            );
        }
    }

    /**
     * Set the datetime format for the context to UNIX
     */
    public void setDatetimeFormatUnix() {
        setDatetimeFormat(AcceptDatetimeFormat.UNIX);
    }

    /**
     * Set the datetime format for the context to RFC3339
     */
    public void setDatetimeFormatRFC3339() {
        setDatetimeFormat(AcceptDatetimeFormat.RFC3339);
    }

    /**
     * Set an HTTP header for all requests to the v20 API using
     * this context
     * <p>
     * @param key header key to set
     * @param value header value
     */
    public void setHeader(String key, Object value) {
        headers.put(key, value);
    }

    /**
     * Remove an HTTP header from the context
     * <p>
     * @param key header key to remove
     */
    public void deleteHeader(String key) {
        headers.remove(key);
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
            if (value instanceof Collection<?>) {
                Iterator<?> iter = ((Collection<?>) value).iterator();
                String csv = "";
                if (iter.hasNext ()) {
                    csv = iter.next().toString();
                    while (iter.hasNext())
                        csv += "," + iter.next().toString();
                }
                uriBuilder.addParameter(key, csv);
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
        this.headers.forEach((key, value) -> {
            httpReq.addHeader(key, value.toString());
        });

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
            try {
                error = (RequestException) gson.fromJson(
                    responseBody, RequestException.class
                );
                error.status = statusCode;
            } catch (JsonSyntaxException e) {
                error = new RequestException(statusCode);
            }
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
