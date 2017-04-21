package com.oanda.v20.trade;

import java.util.HashMap;

import com.oanda.v20.Context;
import com.oanda.v20.ExecuteException;
import com.oanda.v20.Request;
import com.oanda.v20.RequestException;
import com.oanda.v20.account.AccountID;

public class TradeContext {

    private Context ctx;

    /**
     * Default constructor
     * <p>
     * @param ctx Context object
     * @see Context
     */
    public TradeContext(Context ctx) {
        this.ctx = ctx;
    }

    private HashMap<Integer, Class<?>> listResponseMap;

    /**
     * List Trades
     * <p>
     * Get a list of Trades for an Account
     * <p>
     * @param accountID Account Identifier
     * @return {@link TradeListResponse TradeListResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see AccountID
     * @see RequestException
     * @see ExecuteException
     */
    public TradeListResponse list(AccountID accountID)
        throws RequestException, ExecuteException
    {
        TradeListRequest request = new TradeListRequest(accountID);
        return list(request);
    }

    /**
     * List Trades
     * <p>
     * Get a list of Trades for an Account
     * <p>
     * @param request the TradeListRequest
     * @return {@link TradeListResponse TradeListResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see RequestException
     * @see ExecuteException
     */
    public TradeListResponse list(TradeListRequest request)
        throws RequestException, ExecuteException
    {
        if (listResponseMap == null) {
            listResponseMap = new HashMap<>();
            listResponseMap.put(200, TradeListResponse.class);
        }

        return (TradeListResponse) ctx.execute(
            "GET",
            "/v3/accounts/{accountID}/trades",
            request,
            listResponseMap
        );
    }

    private HashMap<Integer, Class<?>> listOpenResponseMap;

    /**
     * List Open Trades
     * <p>
     * Get the list of open Trades for an Account
     * <p>
     * @param accountID Account Identifier
     * @return {@link TradeListOpenResponse TradeListOpenResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see AccountID
     * @see RequestException
     * @see ExecuteException
     */
    public TradeListOpenResponse listOpen(AccountID accountID)
        throws RequestException, ExecuteException
    {
        Request request = new Request();
        request.setPathParam("accountID", accountID);

        if (listOpenResponseMap == null) {
            listOpenResponseMap = new HashMap<>();
            listOpenResponseMap.put(200, TradeListOpenResponse.class);
        }

        return (TradeListOpenResponse) ctx.execute(
            "GET",
            "/v3/accounts/{accountID}/openTrades",
            request,
            listOpenResponseMap
        );
    }

    private HashMap<Integer, Class<?>> getResponseMap;

    /**
     * Trade Details
     * <p>
     * Get the details of a specific Trade in an Account
     * <p>
     * @param accountID Account Identifier
     * @param tradeSpecifier Specifier for the Trade
     * @return {@link TradeGetResponse TradeGetResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see AccountID
     * @see TradeSpecifier
     * @see RequestException
     * @see ExecuteException
     */
    public TradeGetResponse get(AccountID accountID, TradeSpecifier tradeSpecifier)
        throws RequestException, ExecuteException
    {
        Request request = new Request();
        request.setPathParam("accountID", accountID);
        request.setPathParam("tradeSpecifier", tradeSpecifier);

        if (getResponseMap == null) {
            getResponseMap = new HashMap<>();
            getResponseMap.put(200, TradeGetResponse.class);
        }

        return (TradeGetResponse) ctx.execute(
            "GET",
            "/v3/accounts/{accountID}/trades/{tradeSpecifier}",
            request,
            getResponseMap
        );
    }

    private HashMap<Integer, Class<?>> closeResponseMap;


    /**
     * Close Trade
     * <p>
     * Close (partially or fully) a specific open Trade in an Account
     * <p>
     * @param request the TradeCloseRequest
     * @return {@link TradeCloseResponse TradeCloseResponse}
     * @throws TradeClose400RequestException if the Trade cannot be closed as
     *     requested.
     * @throws TradeClose404RequestException if the Account or Trade specified
     *     does not exist.
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see TradeClose400RequestException
     * @see TradeClose404RequestException
     * @see RequestException
     * @see ExecuteException
     */
    public TradeCloseResponse close(TradeCloseRequest request)
        throws TradeClose400RequestException, TradeClose404RequestException,
            RequestException, ExecuteException
    {
        if (closeResponseMap == null) {
            closeResponseMap = new HashMap<>();
            closeResponseMap.put(200, TradeCloseResponse.class);
            closeResponseMap.put(400, TradeClose400RequestException.class);
            closeResponseMap.put(404, TradeClose404RequestException.class);
        }

        return (TradeCloseResponse) ctx.execute(
            "PUT",
            "/v3/accounts/{accountID}/trades/{tradeSpecifier}/close",
            request,
            closeResponseMap
        );
    }

    private HashMap<Integer, Class<?>> setClientExtensionsResponseMap;


    /**
     * Set Trade Client Extensions
     * <p>
     * Update the Client Extensions for a Trade. Do not add, update, or delete
     *     the Client Extensions if your account is associated with MT4.
     * <p>
     * @param request the TradeSetClientExtensionsRequest
     * @return {@link TradeSetClientExtensionsResponse
     *     TradeSetClientExtensionsResponse}
     * @throws TradeSetClientExtensions400RequestException if the Trade's
     *     Client Extensions cannot be modified as requested.
     * @throws TradeSetClientExtensions404RequestException if the Account or
     *     Trade specified does not exist.
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see TradeSetClientExtensions400RequestException
     * @see TradeSetClientExtensions404RequestException
     * @see RequestException
     * @see ExecuteException
     */
    public TradeSetClientExtensionsResponse setClientExtensions(TradeSetClientExtensionsRequest request)
        throws TradeSetClientExtensions400RequestException,
            TradeSetClientExtensions404RequestException, RequestException,
            ExecuteException
    {
        if (setClientExtensionsResponseMap == null) {
            setClientExtensionsResponseMap = new HashMap<>();
            setClientExtensionsResponseMap.put(200, TradeSetClientExtensionsResponse.class);
            setClientExtensionsResponseMap.put(400, TradeSetClientExtensions400RequestException.class);
            setClientExtensionsResponseMap.put(404, TradeSetClientExtensions404RequestException.class);
        }

        return (TradeSetClientExtensionsResponse) ctx.execute(
            "PUT",
            "/v3/accounts/{accountID}/trades/{tradeSpecifier}/clientExtensions",
            request,
            setClientExtensionsResponseMap
        );
    }

    private HashMap<Integer, Class<?>> setDependentOrdersResponseMap;


    /**
     * Set Dependent Orders
     * <p>
     * Create, replace and cancel a Trade's dependent Orders (Take Profit, Stop
     *     Loss and Trailing Stop Loss) through the Trade itself
     * <p>
     * @param request the TradeSetDependentOrdersRequest
     * @return {@link TradeSetDependentOrdersResponse
     *     TradeSetDependentOrdersResponse}
     * @throws TradeSetDependentOrders400RequestException if the Trade's
     *     dependent Orders cannot be modified as requested.
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see TradeSetDependentOrders400RequestException
     * @see RequestException
     * @see ExecuteException
     */
    public TradeSetDependentOrdersResponse setDependentOrders(TradeSetDependentOrdersRequest request)
        throws TradeSetDependentOrders400RequestException, RequestException,
            ExecuteException
    {
        if (setDependentOrdersResponseMap == null) {
            setDependentOrdersResponseMap = new HashMap<>();
            setDependentOrdersResponseMap.put(200, TradeSetDependentOrdersResponse.class);
            setDependentOrdersResponseMap.put(400, TradeSetDependentOrders400RequestException.class);
        }

        return (TradeSetDependentOrdersResponse) ctx.execute(
            "PUT",
            "/v3/accounts/{accountID}/trades/{tradeSpecifier}/orders",
            request,
            setDependentOrdersResponseMap
        );
    }
}
