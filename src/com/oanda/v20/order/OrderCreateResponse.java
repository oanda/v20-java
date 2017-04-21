package com.oanda.v20.order;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.transaction.OrderCancelTransaction;
import com.oanda.v20.transaction.OrderFillTransaction;
import com.oanda.v20.transaction.Transaction;
import com.oanda.v20.transaction.TransactionID;

/**
 * OrderCreateResponse
 */
public class OrderCreateResponse {

    /**
     * OrderCreateResponse Constructor
     * <p>
     * Construct a new OrderCreateResponse
     */
    private OrderCreateResponse() {
    }

    @SerializedName("orderCreateTransaction") private Transaction orderCreateTransaction;

    /**
     * Get the orderCreateTransaction
     * <p>
     * The Transaction that created the Order specified by the request.
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
     * The Transaction that filled the newly created Order. Only provided when
     * the Order was immediately filled.
     * <p>
     * @return the orderFillTransaction
     * @see OrderFillTransaction
     */
    public OrderFillTransaction getOrderFillTransaction() {
        return this.orderFillTransaction;
    }

    @SerializedName("orderCancelTransaction") private OrderCancelTransaction orderCancelTransaction;

    /**
     * Get the orderCancelTransaction
     * <p>
     * The Transaction that cancelled the newly created Order. Only provided
     * when the Order was immediately cancelled.
     * <p>
     * @return the orderCancelTransaction
     * @see OrderCancelTransaction
     */
    public OrderCancelTransaction getOrderCancelTransaction() {
        return this.orderCancelTransaction;
    }

    @SerializedName("orderReissueTransaction") private Transaction orderReissueTransaction;

    /**
     * Get the orderReissueTransaction
     * <p>
     * The Transaction that reissues the Order. Only provided when the Order is
     * configured to be reissued for its remaining units after a partial fill
     * and the reissue was successful.
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
     * when the Order is configured to be reissued for its remaining units
     * after a partial fill and the reissue was rejected.
     * <p>
     * @return the orderReissueRejectTransaction
     * @see Transaction
     */
    public Transaction getOrderReissueRejectTransaction() {
        return this.orderReissueRejectTransaction;
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
