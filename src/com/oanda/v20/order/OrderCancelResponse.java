package com.oanda.v20.order;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.transaction.OrderCancelTransaction;
import com.oanda.v20.transaction.TransactionID;

/**
 * OrderCancelResponse
 */
public class OrderCancelResponse {

    /**
     * OrderCancelResponse Constructor
     * <p>
     * Construct a new OrderCancelResponse
     */
    private OrderCancelResponse() {
    }

    @SerializedName("orderCancelTransaction") private OrderCancelTransaction orderCancelTransaction;

    /**
     * Get the orderCancelTransaction
     * <p>
     * The Transaction that cancelled the Order
     * <p>
     * @return the orderCancelTransaction
     * @see OrderCancelTransaction
     */
    public OrderCancelTransaction getOrderCancelTransaction() {
        return this.orderCancelTransaction;
    }

    @SerializedName("relatedTransactionIDs") private ArrayList<TransactionID> relatedTransactionIDs;

    /**
     * Get the relatedTransactionIDs
     * <p>
     * The IDs of all Transactions that were created while satisfying the
     * request.
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
     * The ID of the most recent Transaction created for the Account
     * <p>
     * @return the lastTransactionID
     * @see TransactionID
     */
    public TransactionID getLastTransactionID() {
        return this.lastTransactionID;
    }
}
