package com.oanda.v20.account;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.transaction.TransactionID;

/**
 * AccountGetResponse
 */
public class AccountGetResponse {

    /**
     * AccountGetResponse Constructor
     * <p>
     * Construct a new AccountGetResponse
     */
    private AccountGetResponse() {
    }

    @SerializedName("account") private Account account;

    /**
     * Get the account
     * <p>
     * The full details of the requested Account.
     * <p>
     * @return the account
     * @see Account
     */
    public Account getAccount() {
        return this.account;
    }

    @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

    /**
     * Get the lastTransactionID
     * <p>
     * The ID of the most recent Transaction created for the Account.
     * <p>
     * @return the lastTransactionID
     * @see TransactionID
     */
    public TransactionID getLastTransactionID() {
        return this.lastTransactionID;
    }
}
