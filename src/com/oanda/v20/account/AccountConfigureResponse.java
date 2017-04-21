package com.oanda.v20.account;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.transaction.ClientConfigureTransaction;
import com.oanda.v20.transaction.TransactionID;

/**
 * AccountConfigureResponse
 */
public class AccountConfigureResponse {

    /**
     * AccountConfigureResponse Constructor
     * <p>
     * Construct a new AccountConfigureResponse
     */
    private AccountConfigureResponse() {
    }

    @SerializedName("clientConfigureTransaction") private ClientConfigureTransaction clientConfigureTransaction;

    /**
     * Get the clientConfigureTransaction
     * <p>
     * The transaction that configures the Account.
     * <p>
     * @return the clientConfigureTransaction
     * @see ClientConfigureTransaction
     */
    public ClientConfigureTransaction getClientConfigureTransaction() {
        return this.clientConfigureTransaction;
    }

    @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

    /**
     * Get the lastTransactionID
     * <p>
     * The ID of the last Transaction created for the Account.
     * <p>
     * @return the lastTransactionID
     * @see TransactionID
     */
    public TransactionID getLastTransactionID() {
        return this.lastTransactionID;
    }
}
