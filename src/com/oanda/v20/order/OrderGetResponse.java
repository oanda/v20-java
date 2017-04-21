package com.oanda.v20.order;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.transaction.TransactionID;

/**
 * OrderGetResponse
 */
public class OrderGetResponse {

    /**
     * OrderGetResponse Constructor
     * <p>
     * Construct a new OrderGetResponse
     */
    private OrderGetResponse() {
    }

    @SerializedName("order") private Order order;

    /**
     * Get the order
     * <p>
     * The details of the Order requested
     * <p>
     * @return the order
     * @see Order
     */
    public Order getOrder() {
        return this.order;
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
