package com.oanda.v20.order;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.RequestException;
import com.oanda.v20.transaction.OrderClientExtensionsModifyRejectTransaction;
import com.oanda.v20.transaction.TransactionID;

/**
 * OrderSetClientExtensions404RequestException
 */
public class OrderSetClientExtensions404RequestException extends RequestException {

    private static final long serialVersionUID = -5182388253952930048L;

    /**
     * OrderSetClientExtensions404RequestException Constructor
     * <p>
     * Construct a new OrderSetClientExtensions404RequestException
     */
    private OrderSetClientExtensions404RequestException() {
    }

    @SerializedName("orderClientExtensionsModifyRejectTransaction") private OrderClientExtensionsModifyRejectTransaction orderClientExtensionsModifyRejectTransaction;

    /**
     * Get the orderClientExtensionsModifyRejectTransaction
     * <p>
     * The Transaction that rejected the modification of the Client Extensions
     * for the Order. Only present if the Account exists.
     * <p>
     * @return the orderClientExtensionsModifyRejectTransaction
     * @see OrderClientExtensionsModifyRejectTransaction
     */
    public OrderClientExtensionsModifyRejectTransaction getOrderClientExtensionsModifyRejectTransaction() {
        return this.orderClientExtensionsModifyRejectTransaction;
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
}
