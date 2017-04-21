package com.oanda.v20.transaction;

import java.util.HashMap;

import com.oanda.v20.Context;
import com.oanda.v20.ExecuteException;
import com.oanda.v20.Request;
import com.oanda.v20.RequestException;
import com.oanda.v20.account.AccountID;

public class TransactionContext {

    private Context ctx;

    /**
     * Default constructor
     * <p>
     * @param ctx Context object
     * @see Context
     */
    public TransactionContext(Context ctx) {
        this.ctx = ctx;
    }

    private HashMap<Integer, Class<?>> listResponseMap;

    /**
     * List Transactions
     * <p>
     * Get a list of Transactions pages that satisfy a time-based Transaction
     *     query.
     * <p>
     * @param accountID Account Identifier
     * @return {@link TransactionListResponse TransactionListResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see AccountID
     * @see RequestException
     * @see ExecuteException
     */
    public TransactionListResponse list(AccountID accountID)
        throws RequestException, ExecuteException
    {
        TransactionListRequest request = new TransactionListRequest(accountID);
        return list(request);
    }

    /**
     * List Transactions
     * <p>
     * Get a list of Transactions pages that satisfy a time-based Transaction
     *     query.
     * <p>
     * @param request the TransactionListRequest
     * @return {@link TransactionListResponse TransactionListResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see RequestException
     * @see ExecuteException
     */
    public TransactionListResponse list(TransactionListRequest request)
        throws RequestException, ExecuteException
    {
        if (listResponseMap == null) {
            listResponseMap = new HashMap<>();
            listResponseMap.put(200, TransactionListResponse.class);
        }

        return (TransactionListResponse) ctx.execute(
            "GET",
            "/v3/accounts/{accountID}/transactions",
            request,
            listResponseMap
        );
    }

    private HashMap<Integer, Class<?>> getResponseMap;

    /**
     * Transaction Details
     * <p>
     * Get the details of a single Account Transaction.
     * <p>
     * @param accountID Account Identifier
     * @param transactionID A Transaction ID
     * @return {@link TransactionGetResponse TransactionGetResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see AccountID
     * @see TransactionID
     * @see RequestException
     * @see ExecuteException
     */
    public TransactionGetResponse get(AccountID accountID, TransactionID transactionID)
        throws RequestException, ExecuteException
    {
        Request request = new Request();
        request.setPathParam("accountID", accountID);
        request.setPathParam("transactionID", transactionID);

        if (getResponseMap == null) {
            getResponseMap = new HashMap<>();
            getResponseMap.put(200, TransactionGetResponse.class);
        }

        return (TransactionGetResponse) ctx.execute(
            "GET",
            "/v3/accounts/{accountID}/transactions/{transactionID}",
            request,
            getResponseMap
        );
    }

    private HashMap<Integer, Class<?>> rangeResponseMap;

    /**
     * Transaction ID Range
     * <p>
     * Get a range of Transactions for an Account based on the Transaction IDs.
     * <p>
     * @param accountID Account Identifier
     * @param fromID The starting Transacion ID (inclusive) to fetch.
     * @param toID The ending Transaction ID (inclusive) to fetch.
     * @return {@link TransactionRangeResponse TransactionRangeResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see AccountID
     * @see TransactionID
     * @see TransactionID
     * @see RequestException
     * @see ExecuteException
     */
    public TransactionRangeResponse range(AccountID accountID, TransactionID fromID, TransactionID toID)
        throws RequestException, ExecuteException
    {
        TransactionRangeRequest request = new TransactionRangeRequest(accountID, fromID, toID);
        return range(request);
    }

    /**
     * Transaction ID Range
     * <p>
     * Get a range of Transactions for an Account based on the Transaction IDs.
     * <p>
     * @param request the TransactionRangeRequest
     * @return {@link TransactionRangeResponse TransactionRangeResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see RequestException
     * @see ExecuteException
     */
    public TransactionRangeResponse range(TransactionRangeRequest request)
        throws RequestException, ExecuteException
    {
        if (rangeResponseMap == null) {
            rangeResponseMap = new HashMap<>();
            rangeResponseMap.put(200, TransactionRangeResponse.class);
        }

        return (TransactionRangeResponse) ctx.execute(
            "GET",
            "/v3/accounts/{accountID}/transactions/idrange",
            request,
            rangeResponseMap
        );
    }

    private HashMap<Integer, Class<?>> sinceResponseMap;

    /**
     * Transactions Since ID
     * <p>
     * Get a range of Transactions for an Account starting at (but not
     *     including) a provided Transaction ID.
     * <p>
     * @param accountID Account Identifier
     * @param id The ID of the last Transacion fetched. This query will return
     *     all Transactions newer than the TransactionID.
     * @return {@link TransactionSinceResponse TransactionSinceResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see AccountID
     * @see TransactionID
     * @see RequestException
     * @see ExecuteException
     */
    public TransactionSinceResponse since(AccountID accountID, TransactionID id)
        throws RequestException, ExecuteException
    {
        Request request = new Request();
        request.setPathParam("accountID", accountID);
        request.setQueryParam("id", id);

        if (sinceResponseMap == null) {
            sinceResponseMap = new HashMap<>();
            sinceResponseMap.put(200, TransactionSinceResponse.class);
        }

        return (TransactionSinceResponse) ctx.execute(
            "GET",
            "/v3/accounts/{accountID}/transactions/sinceid",
            request,
            sinceResponseMap
        );
    }
}
