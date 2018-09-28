package com.oanda.v20.order;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.RequestException;
import com.oanda.v20.transaction.Transaction;
import com.oanda.v20.transaction.TransactionID;

/**
 * OrderReplace404RequestException
 */
public class OrderReplace404RequestException extends RequestException {

    private static final long serialVersionUID = -3059274072633093346L;

    /**
     * OrderReplace404RequestException Constructor
     * <p>
     * Construct a new OrderReplace404RequestException
     */
    private OrderReplace404RequestException() {
    }

    @SerializedName("orderCancelRejectTransaction") private Transaction orderCancelRejectTransaction;

    /**
     * Get the orderCancelRejectTransaction
     * <p>
     * The Transaction that rejected the cancellation of the Order to be
     * replaced. Only present if the Account exists.
     * <p>
     * @return the orderCancelRejectTransaction
     * @see Transaction
     */
    public Transaction getOrderCancelRejectTransaction() {
        return this.orderCancelRejectTransaction;
    }

    @SerializedName("relatedTransactionIDs") private ArrayList<TransactionID> relatedTransactionIDs;

    /**
     * Get the relatedTransactionIDs
     * <p>
     * The IDs of all Transactions that were created while satisfying the
     * request. Only present if the Account exists.
     * <p>
     * @return the relatedTransactionIDs
     * @see TransactionID
     */
    public List<TransactionID> getRelatedTransactionIDs() {
        return this.relatedTransactionIDs;
    }

    @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

    /**
     * Get the lastTransactionID
     * <p>
     * The ID of the most recent Transaction created for the Account. Only
     * present if the Account exists.
     * <p>
     * @return the lastTransactionID
     * @see TransactionID
     */
    public TransactionID getLastTransactionID() {
        return this.lastTransactionID;
    }
}
