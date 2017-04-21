package com.oanda.v20.transaction;

import com.google.gson.annotations.SerializedName;

/**
 * TransactionGetResponse
 */
public class TransactionGetResponse {

    /**
     * TransactionGetResponse Constructor
     * <p>
     * Construct a new TransactionGetResponse
     */
    private TransactionGetResponse() {
    }

    @SerializedName("transaction") private Transaction transaction;

    /**
     * Get the transaction
     * <p>
     * The details of the Transaction requested
     * <p>
     * @return the transaction
     * @see Transaction
     */
    public Transaction getTransaction() {
        return this.transaction;
    }

    @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

    /**
     * Get the lastTransactionID
     * <p>
     * The ID of the most recent Transaction created for the Account
     * <p>
     * @return the lastTransactionID
     * @see TransactionID
     */
    public TransactionID getLastTransactionID() {
        return this.lastTransactionID;
    }
}
