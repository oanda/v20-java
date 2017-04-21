package com.oanda.v20.order;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.transaction.OrderCancelTransaction;
import com.oanda.v20.transaction.OrderFillTransaction;
import com.oanda.v20.transaction.Transaction;
import com.oanda.v20.transaction.TransactionID;

/**
 * OrderReplaceResponse
 */
public class OrderReplaceResponse {

    /**
     * OrderReplaceResponse Constructor
     * <p>
     * Construct a new OrderReplaceResponse
     */
    private OrderReplaceResponse() {
    }

    @SerializedName("orderCancelTransaction") private OrderCancelTransaction orderCancelTransaction;

    /**
     * Get the orderCancelTransaction
     * <p>
     * The Transaction that cancelled the Order to be replaced.
     * <p>
     * @return the orderCancelTransaction
     * @see OrderCancelTransaction
     */
    public OrderCancelTransaction getOrderCancelTransaction() {
        return this.orderCancelTransaction;
    }

    @SerializedName("orderCreateTransaction") private Transaction orderCreateTransaction;

    /**
     * Get the orderCreateTransaction
     * <p>
     * The Transaction that created the replacing Order as requested.
     * <p>
     * @return the orderCreateTransaction
     * @see Transaction
     */
    public Transaction getOrderCreateTransaction() {
        return this.orderCreateTransaction;
    }

    @SerializedName("orderFillTransaction") private OrderFillTransaction orderFillTransaction;

    /**
     * Get the orderFillTransaction
     * <p>
     * The Transaction that filled the replacing Order. This is only provided
     * when the replacing Order was immediately filled.
     * <p>
     * @return the orderFillTransaction
     * @see OrderFillTransaction
     */
    public OrderFillTransaction getOrderFillTransaction() {
        return this.orderFillTransaction;
    }

    @SerializedName("orderReissueTransaction") private Transaction orderReissueTransaction;

    /**
     * Get the orderReissueTransaction
     * <p>
     * The Transaction that reissues the replacing Order. Only provided when
     * the replacing Order was partially filled immediately and is configured
     * to be reissued for its remaining units.
     * <p>
     * @return the orderReissueTransaction
     * @see Transaction
     */
    public Transaction getOrderReissueTransaction() {
        return this.orderReissueTransaction;
    }

    @SerializedName("orderReissueRejectTransaction") private Transaction orderReissueRejectTransaction;

    /**
     * Get the orderReissueRejectTransaction
     * <p>
     * The Transaction that rejects the reissue of the Order. Only provided
     * when the replacing Order was paritially filled immediately and was
     * configured to be reissued, however the reissue was rejected.
     * <p>
     * @return the orderReissueRejectTransaction
     * @see Transaction
     */
    public Transaction getOrderReissueRejectTransaction() {
        return this.orderReissueRejectTransaction;
    }

    @SerializedName("replacingOrderCancelTransaction") private OrderCancelTransaction replacingOrderCancelTransaction;

    /**
     * Get the replacingOrderCancelTransaction
     * <p>
     * The Transaction that cancelled the replacing Order. Only provided when
     * the replacing Order was immediately cancelled.
     * <p>
     * @return the replacingOrderCancelTransaction
     * @see OrderCancelTransaction
     */
    public OrderCancelTransaction getReplacingOrderCancelTransaction() {
        return this.replacingOrderCancelTransaction;
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
