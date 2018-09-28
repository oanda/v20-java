package com.oanda.v20.account;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.RequestException;
import com.oanda.v20.transaction.ClientConfigureRejectTransaction;
import com.oanda.v20.transaction.TransactionID;

/**
 * AccountConfigure403RequestException
 */
public class AccountConfigure403RequestException extends RequestException {

    private static final long serialVersionUID = -6940302184740441977L;

    /**
     * AccountConfigure403RequestException Constructor
     * <p>
     * Construct a new AccountConfigure403RequestException
     */
    private AccountConfigure403RequestException() {
    }

    @SerializedName("clientConfigureRejectTransaction") private ClientConfigureRejectTransaction clientConfigureRejectTransaction;

    /**
     * Get the clientConfigureRejectTransaction
     * <p>
     * The transaction that rejects the configuration of the Account.
     * <p>
     * @return the clientConfigureRejectTransaction
     * @see ClientConfigureRejectTransaction
     */
    public ClientConfigureRejectTransaction getClientConfigureRejectTransaction() {
        return this.clientConfigureRejectTransaction;
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
