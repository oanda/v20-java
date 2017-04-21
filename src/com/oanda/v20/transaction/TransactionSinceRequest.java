package com.oanda.v20.transaction;

import com.oanda.v20.Request;
import com.oanda.v20.account.AccountID;

/**
 * TransactionSinceRequest
 */
public class TransactionSinceRequest extends Request {

    /**
     * TransactionSinceRequest Constructor
     * <p>
     * Construct a new TransactionSinceRequest
     * <p>
     * @param accountID Account Identifier
     * @param id The ID of the last Transacion fetched. This query will return all Transactions newer than the TransactionID.
     */
    public TransactionSinceRequest(AccountID accountID, TransactionID id) {
        this.setPathParam("accountID", accountID);
        this.setQueryParam("id", id);

    }

    /**
     * Set the id
     * <p>
     * The ID of the last Transacion fetched. This query will return all
     * Transactions newer than the TransactionID.
     * <p>
     * @param id the id as a TransactionID
     * @return {@link TransactionSinceRequest TransactionSinceRequest}
     * @see TransactionID
     */
    public TransactionSinceRequest setId(TransactionID id)
    {
        this.queryParams.put("id", id);
        return this;
    }

    /**
     * Set the id
     * <p>
     * The ID of the last Transacion fetched. This query will return all
     * Transactions newer than the TransactionID.
     * <p>
     * @param id the id as a String
     * @return {@link TransactionSinceRequest TransactionSinceRequest}
     * @see TransactionID
     */
    public TransactionSinceRequest setId(String id)
    {
        this.queryParams.put("id", new TransactionID(id));
        return this;
    }
}
