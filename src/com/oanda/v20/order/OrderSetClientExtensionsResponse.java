package com.oanda.v20.order;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.transaction.OrderClientExtensionsModifyTransaction;
import com.oanda.v20.transaction.TransactionID;

/**
 * OrderSetClientExtensionsResponse
 */
public class OrderSetClientExtensionsResponse {

    /**
     * OrderSetClientExtensionsResponse Constructor
     * <p>
     * Construct a new OrderSetClientExtensionsResponse
     */
    private OrderSetClientExtensionsResponse() {
    }

    @SerializedName("orderClientExtensionsModifyTransaction") private OrderClientExtensionsModifyTransaction orderClientExtensionsModifyTransaction;

    /**
     * Get the orderClientExtensionsModifyTransaction
     * <p>
     * The Transaction that modified the Client Extensions for the Order
     * <p>
     * @return the orderClientExtensionsModifyTransaction
     * @see OrderClientExtensionsModifyTransaction
     */
    public OrderClientExtensionsModifyTransaction getOrderClientExtensionsModifyTransaction() {
        return this.orderClientExtensionsModifyTransaction;
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
}
