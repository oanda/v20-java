package com.oanda.v20.account;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.RequestException;
import com.oanda.v20.transaction.ClientConfigureRejectTransaction;
import com.oanda.v20.transaction.TransactionID;

/**
 * AccountConfigure400RequestException
 */
public class AccountConfigure400RequestException extends RequestException {

    private static final long serialVersionUID = -6799520103822227394L;

    /**
     * AccountConfigure400RequestException Constructor
     * <p>
     * Construct a new AccountConfigure400RequestException
     */
    private AccountConfigure400RequestException() {
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
