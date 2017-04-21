package com.oanda.v20.transaction;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * TransactionRangeResponse
 */
public class TransactionRangeResponse {

    /**
     * TransactionRangeResponse Constructor
     * <p>
     * Construct a new TransactionRangeResponse
     */
    private TransactionRangeResponse() {
    }

    @SerializedName("transactions") private ArrayList<Transaction> transactions;

    /**
     * Get the transactions
     * <p>
     * The list of Transactions that satisfy the request.
     * <p>
     * @return the transactions
     * @see Transaction
     */
    public List<Transaction> getTransactions() {
        return this.transactions;
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
