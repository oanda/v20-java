package com.oanda.v20.account;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.transaction.TransactionID;

/**
 * AccountSummaryResponse
 */
public class AccountSummaryResponse {

    /**
     * AccountSummaryResponse Constructor
     * <p>
     * Construct a new AccountSummaryResponse
     */
    private AccountSummaryResponse() {
    }

    @SerializedName("account") private AccountSummary account;

    /**
     * Get the account
     * <p>
     * The summary of the requested Account.
     * <p>
     * @return the account
     * @see AccountSummary
     */
    public AccountSummary getAccount() {
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
