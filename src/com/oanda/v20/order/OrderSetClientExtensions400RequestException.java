package com.oanda.v20.order;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.RequestException;
import com.oanda.v20.transaction.OrderClientExtensionsModifyRejectTransaction;
import com.oanda.v20.transaction.TransactionID;

/**
 * OrderSetClientExtensions400RequestException
 */
public class OrderSetClientExtensions400RequestException extends RequestException {

    private static final long serialVersionUID = 1293779676510183439L;

    /**
     * OrderSetClientExtensions400RequestException Constructor
     * <p>
     * Construct a new OrderSetClientExtensions400RequestException
     */
    private OrderSetClientExtensions400RequestException() {
    }

    @SerializedName("orderClientExtensionsModifyRejectTransaction") private OrderClientExtensionsModifyRejectTransaction orderClientExtensionsModifyRejectTransaction;

    /**
     * Get the orderClientExtensionsModifyRejectTransaction
     * <p>
     * The Transaction that rejected the modification of the Client Extensions
     * for the Order
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
