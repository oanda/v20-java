package com.oanda.v20.order;

import java.util.HashMap;

import com.oanda.v20.Context;
import com.oanda.v20.ExecuteException;
import com.oanda.v20.Request;
import com.oanda.v20.RequestException;
import com.oanda.v20.account.AccountID;

public class OrderContext {

    private Context ctx;

    /**
     * Default constructor
     * <p>
     * @param ctx Context object
     * @see Context
     */
    public OrderContext(Context ctx) {
        this.ctx = ctx;
    }

    private HashMap<Integer, Class<?>> createResponseMap;


    /**
     * Create Order
     * <p>
     * Create an Order for an Account
     * <p>
     * @param request the OrderCreateRequest
     * @return {@link OrderCreateResponse OrderCreateResponse}
     * @throws OrderCreate400RequestException if the Order specification was
     *     invalid
     * @throws OrderCreate404RequestException if the Order or Account specified
     *     does not exist.
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see OrderCreate400RequestException
     * @see OrderCreate404RequestException
     * @see RequestException
     * @see ExecuteException
     */
    public OrderCreateResponse create(OrderCreateRequest request)
        throws OrderCreate400RequestException, OrderCreate404RequestException,
            RequestException, ExecuteException
    {
        if (createResponseMap == null) {
            createResponseMap = new HashMap<>();
            createResponseMap.put(201, OrderCreateResponse.class);
            createResponseMap.put(400, OrderCreate400RequestException.class);
            createResponseMap.put(404, OrderCreate404RequestException.class);
        }

        return (OrderCreateResponse) ctx.execute(
            "POST",
            "/v3/accounts/{accountID}/orders",
            request,
            createResponseMap
        );
    }

    private HashMap<Integer, Class<?>> listResponseMap;

    /**
     * List Orders
     * <p>
     * Get a list of Orders for an Account
     * <p>
     * @param accountID Account Identifier
     * @return {@link OrderListResponse OrderListResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see AccountID
     * @see RequestException
     * @see ExecuteException
     */
    public OrderListResponse list(AccountID accountID)
        throws RequestException, ExecuteException
    {
        OrderListRequest request = new OrderListRequest(accountID);
        return list(request);
    }

    /**
     * List Orders
     * <p>
     * Get a list of Orders for an Account
     * <p>
     * @param request the OrderListRequest
     * @return {@link OrderListResponse OrderListResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see RequestException
     * @see ExecuteException
     */
    public OrderListResponse list(OrderListRequest request)
        throws RequestException, ExecuteException
    {
        if (listResponseMap == null) {
            listResponseMap = new HashMap<>();
            listResponseMap.put(200, OrderListResponse.class);
        }

        return (OrderListResponse) ctx.execute(
            "GET",
            "/v3/accounts/{accountID}/orders",
            request,
            listResponseMap
        );
    }

    private HashMap<Integer, Class<?>> listPendingResponseMap;

    /**
     * Pending Orders
     * <p>
     * List all pending Orders in an Account
     * <p>
     * @param accountID Account Identifier
     * @return {@link OrderListPendingResponse OrderListPendingResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see AccountID
     * @see RequestException
     * @see ExecuteException
     */
    public OrderListPendingResponse listPending(AccountID accountID)
        throws RequestException, ExecuteException
    {
        Request request = new Request();
        request.setPathParam("accountID", accountID);

        if (listPendingResponseMap == null) {
            listPendingResponseMap = new HashMap<>();
            listPendingResponseMap.put(200, OrderListPendingResponse.class);
        }

        return (OrderListPendingResponse) ctx.execute(
            "GET",
            "/v3/accounts/{accountID}/pendingOrders",
            request,
            listPendingResponseMap
        );
    }

    private HashMap<Integer, Class<?>> getResponseMap;

    /**
     * Get Order
     * <p>
     * Get details for a single Order in an Account
     * <p>
     * @param accountID Account Identifier
     * @param orderSpecifier The Order Specifier
     * @return {@link OrderGetResponse OrderGetResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see AccountID
     * @see OrderSpecifier
     * @see RequestException
     * @see ExecuteException
     */
    public OrderGetResponse get(AccountID accountID, OrderSpecifier orderSpecifier)
        throws RequestException, ExecuteException
    {
        Request request = new Request();
        request.setPathParam("accountID", accountID);
        request.setPathParam("orderSpecifier", orderSpecifier);

        if (getResponseMap == null) {
            getResponseMap = new HashMap<>();
            getResponseMap.put(200, OrderGetResponse.class);
        }

        return (OrderGetResponse) ctx.execute(
            "GET",
            "/v3/accounts/{accountID}/orders/{orderSpecifier}",
            request,
            getResponseMap
        );
    }

    private HashMap<Integer, Class<?>> replaceResponseMap;


    /**
     * Replace Order
     * <p>
     * Replace an Order in an Account by simultaneously cancelling it and
     *     creating a replacement Order
     * <p>
     * @param request the OrderReplaceRequest
     * @return {@link OrderReplaceResponse OrderReplaceResponse}
     * @throws OrderReplace400RequestException if the Order specification was
     *     invalid
     * @throws OrderReplace404RequestException if the Account or Order
     *     specified does not exist.
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see OrderReplace400RequestException
     * @see OrderReplace404RequestException
     * @see RequestException
     * @see ExecuteException
     */
    public OrderReplaceResponse replace(OrderReplaceRequest request)
        throws OrderReplace400RequestException,
            OrderReplace404RequestException, RequestException, ExecuteException
    {
        if (replaceResponseMap == null) {
            replaceResponseMap = new HashMap<>();
            replaceResponseMap.put(201, OrderReplaceResponse.class);
            replaceResponseMap.put(400, OrderReplace400RequestException.class);
            replaceResponseMap.put(404, OrderReplace404RequestException.class);
        }

        return (OrderReplaceResponse) ctx.execute(
            "PUT",
            "/v3/accounts/{accountID}/orders/{orderSpecifier}",
            request,
            replaceResponseMap
        );
    }

    private HashMap<Integer, Class<?>> cancelResponseMap;

    /**
     * Cancel Order
     * <p>
     * Cancel a pending Order in an Account
     * <p>
     * @param accountID Account Identifier
     * @param orderSpecifier The Order Specifier
     * @return {@link OrderCancelResponse OrderCancelResponse}
     * @throws OrderCancel404RequestException if the Account or Order specified
     *     does not exist.
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see AccountID
     * @see OrderSpecifier
     * @see OrderCancel404RequestException
     * @see RequestException
     * @see ExecuteException
     */
    public OrderCancelResponse cancel(AccountID accountID, OrderSpecifier orderSpecifier)
        throws OrderCancel404RequestException, RequestException,
            ExecuteException
    {
        Request request = new Request();
        request.setPathParam("accountID", accountID);
        request.setPathParam("orderSpecifier", orderSpecifier);

        if (cancelResponseMap == null) {
            cancelResponseMap = new HashMap<>();
            cancelResponseMap.put(200, OrderCancelResponse.class);
            cancelResponseMap.put(404, OrderCancel404RequestException.class);
        }

        return (OrderCancelResponse) ctx.execute(
            "PUT",
            "/v3/accounts/{accountID}/orders/{orderSpecifier}/cancel",
            request,
            cancelResponseMap
        );
    }

    private HashMap<Integer, Class<?>> setClientExtensionsResponseMap;


    /**
     * Set Order Extensions
     * <p>
     * Update the Client Extensions for an Order in an Account. Do not set,
     *     modify, or delete clientExtensions if your account is associated
     *     with MT4.
     * <p>
     * @param request the OrderSetClientExtensionsRequest
     * @return {@link OrderSetClientExtensionsResponse
     *     OrderSetClientExtensionsResponse}
     * @throws OrderSetClientExtensions400RequestException if the Order Client
     *     Extensions specification was invalid
     * @throws OrderSetClientExtensions404RequestException if the Account or
     *     Order specified does not exist.
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see OrderSetClientExtensions400RequestException
     * @see OrderSetClientExtensions404RequestException
     * @see RequestException
     * @see ExecuteException
     */
    public OrderSetClientExtensionsResponse setClientExtensions(OrderSetClientExtensionsRequest request)
        throws OrderSetClientExtensions400RequestException,
            OrderSetClientExtensions404RequestException, RequestException,
            ExecuteException
    {
        if (setClientExtensionsResponseMap == null) {
            setClientExtensionsResponseMap = new HashMap<>();
            setClientExtensionsResponseMap.put(200, OrderSetClientExtensionsResponse.class);
            setClientExtensionsResponseMap.put(400, OrderSetClientExtensions400RequestException.class);
            setClientExtensionsResponseMap.put(404, OrderSetClientExtensions404RequestException.class);
        }

        return (OrderSetClientExtensionsResponse) ctx.execute(
            "PUT",
            "/v3/accounts/{accountID}/orders/{orderSpecifier}/clientExtensions",
            request,
            setClientExtensionsResponseMap
        );
    }
}
