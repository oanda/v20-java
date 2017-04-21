package com.oanda.v20.trade;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.transaction.MarketOrderTransaction;
import com.oanda.v20.transaction.OrderCancelTransaction;
import com.oanda.v20.transaction.OrderFillTransaction;
import com.oanda.v20.transaction.TransactionID;

/**
 * TradeCloseResponse
 */
public class TradeCloseResponse {

    /**
     * TradeCloseResponse Constructor
     * <p>
     * Construct a new TradeCloseResponse
     */
    private TradeCloseResponse() {
    }

    @SerializedName("orderCreateTransaction") private MarketOrderTransaction orderCreateTransaction;

    /**
     * Get the orderCreateTransaction
     * <p>
     * The MarketOrder Transaction created to close the Trade.
     * <p>
     * @return the orderCreateTransaction
     * @see MarketOrderTransaction
     */
    public MarketOrderTransaction getOrderCreateTransaction() {
        return this.orderCreateTransaction;
    }

    @SerializedName("orderFillTransaction") private OrderFillTransaction orderFillTransaction;

    /**
     * Get the orderFillTransaction
     * <p>
     * The OrderFill Transaction that fills the Trade-closing MarketOrder and
     * closes the Trade.
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
     * The OrderCancel Transaction that immediately cancelled the Trade-closing
     * MarketOrder.
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
