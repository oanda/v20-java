package com.oanda.v20.order;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.RequestException;
import com.oanda.v20.transaction.OrderCancelRejectTransaction;
import com.oanda.v20.transaction.TransactionID;

/**
 * OrderCancel404RequestException
 */
public class OrderCancel404RequestException extends RequestException {

    private static final long serialVersionUID = 7026462237603014891L;

    /**
     * OrderCancel404RequestException Constructor
     * <p>
     * Construct a new OrderCancel404RequestException
     */
    private OrderCancel404RequestException() {
    }

    @SerializedName("orderCancelRejectTransaction") private OrderCancelRejectTransaction orderCancelRejectTransaction;

    /**
     * Get the orderCancelRejectTransaction
     * <p>
     * The Transaction that rejected the cancellation of the Order. Only
     * present if the Account exists.
     * <p>
     * @return the orderCancelRejectTransaction
     * @see OrderCancelRejectTransaction
     */
    public OrderCancelRejectTransaction getOrderCancelRejectTransaction() {
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
