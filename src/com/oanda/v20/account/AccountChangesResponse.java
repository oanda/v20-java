package com.oanda.v20.account;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.transaction.TransactionID;

/**
 * AccountChangesResponse
 */
public class AccountChangesResponse {

    /**
     * AccountChangesResponse Constructor
     * <p>
     * Construct a new AccountChangesResponse
     */
    private AccountChangesResponse() {
    }

    @SerializedName("changes") private AccountChanges changes;

    /**
     * Get the changes
     * <p>
     * The changes to the Account's Orders, Trades and Positions since the
     * specified Transaction ID. Only provided if the sinceTransactionID is
     * supplied to the poll request.
     * <p>
     * @return the changes
     * @see AccountChanges
     */
    public AccountChanges getChanges() {
        return this.changes;
    }

    @SerializedName("state") private AccountChangesState state;

    /**
     * Get the state
     * <p>
     * The Account's current price-dependent state.
     * <p>
     * @return the state
     * @see AccountChangesState
     */
    public AccountChangesState getState() {
        return this.state;
    }

    @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

    /**
     * Get the lastTransactionID
     * <p>
     * The ID of the last Transaction created for the Account.  This
     * Transaction ID should be used for future poll requests, as the client
     * has already observed all changes up to and including it.
     * <p>
     * @return the lastTransactionID
     * @see TransactionID
     */
    public TransactionID getLastTransactionID() {
        return this.lastTransactionID;
    }
}
