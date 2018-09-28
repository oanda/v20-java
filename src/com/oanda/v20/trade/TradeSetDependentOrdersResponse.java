package com.oanda.v20.trade;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.transaction.OrderCancelTransaction;
import com.oanda.v20.transaction.OrderFillTransaction;
import com.oanda.v20.transaction.StopLossOrderTransaction;
import com.oanda.v20.transaction.TakeProfitOrderTransaction;
import com.oanda.v20.transaction.TrailingStopLossOrderTransaction;
import com.oanda.v20.transaction.TransactionID;

/**
 * TradeSetDependentOrdersResponse
 */
public class TradeSetDependentOrdersResponse {

    /**
     * TradeSetDependentOrdersResponse Constructor
     * <p>
     * Construct a new TradeSetDependentOrdersResponse
     */
    private TradeSetDependentOrdersResponse() {
    }

    @SerializedName("takeProfitOrderCancelTransaction") private OrderCancelTransaction takeProfitOrderCancelTransaction;

    /**
     * Get the takeProfitOrderCancelTransaction
     * <p>
     * The Transaction created that cancels the Trade's existing Take Profit
     * Order.
     * <p>
     * @return the takeProfitOrderCancelTransaction
     * @see OrderCancelTransaction
     */
    public OrderCancelTransaction getTakeProfitOrderCancelTransaction() {
        return this.takeProfitOrderCancelTransaction;
    }

    @SerializedName("takeProfitOrderTransaction") private TakeProfitOrderTransaction takeProfitOrderTransaction;

    /**
     * Get the takeProfitOrderTransaction
     * <p>
     * The Transaction created that creates a new Take Profit Order for the
     * Trade.
     * <p>
     * @return the takeProfitOrderTransaction
     * @see TakeProfitOrderTransaction
     */
    public TakeProfitOrderTransaction getTakeProfitOrderTransaction() {
        return this.takeProfitOrderTransaction;
    }

    @SerializedName("takeProfitOrderFillTransaction") private OrderFillTransaction takeProfitOrderFillTransaction;

    /**
     * Get the takeProfitOrderFillTransaction
     * <p>
     * The Transaction created that immediately fills the Trade's new Take
     * Profit Order. Only provided if the new Take Profit Order was immediately
     * filled.
     * <p>
     * @return the takeProfitOrderFillTransaction
     * @see OrderFillTransaction
     */
    public OrderFillTransaction getTakeProfitOrderFillTransaction() {
        return this.takeProfitOrderFillTransaction;
    }

    @SerializedName("takeProfitOrderCreatedCancelTransaction") private OrderCancelTransaction takeProfitOrderCreatedCancelTransaction;

    /**
     * Get the takeProfitOrderCreatedCancelTransaction
     * <p>
     * The Transaction created that immediately cancels the Trade's new Take
     * Profit Order. Only provided if the new Take Profit Order was immediately
     * cancelled.
     * <p>
     * @return the takeProfitOrderCreatedCancelTransaction
     * @see OrderCancelTransaction
     */
    public OrderCancelTransaction getTakeProfitOrderCreatedCancelTransaction() {
        return this.takeProfitOrderCreatedCancelTransaction;
    }

    @SerializedName("stopLossOrderCancelTransaction") private OrderCancelTransaction stopLossOrderCancelTransaction;

    /**
     * Get the stopLossOrderCancelTransaction
     * <p>
     * The Transaction created that cancels the Trade's existing Stop Loss
     * Order.
     * <p>
     * @return the stopLossOrderCancelTransaction
     * @see OrderCancelTransaction
     */
    public OrderCancelTransaction getStopLossOrderCancelTransaction() {
        return this.stopLossOrderCancelTransaction;
    }

    @SerializedName("stopLossOrderTransaction") private StopLossOrderTransaction stopLossOrderTransaction;

    /**
     * Get the stopLossOrderTransaction
     * <p>
     * The Transaction created that creates a new Stop Loss Order for the
     * Trade.
     * <p>
     * @return the stopLossOrderTransaction
     * @see StopLossOrderTransaction
     */
    public StopLossOrderTransaction getStopLossOrderTransaction() {
        return this.stopLossOrderTransaction;
    }

    @SerializedName("stopLossOrderFillTransaction") private OrderFillTransaction stopLossOrderFillTransaction;

    /**
     * Get the stopLossOrderFillTransaction
     * <p>
     * The Transaction created that immediately fills the Trade's new Stop
     * Order. Only provided if the new Stop Loss Order was immediately filled.
     * <p>
     * @return the stopLossOrderFillTransaction
     * @see OrderFillTransaction
     */
    public OrderFillTransaction getStopLossOrderFillTransaction() {
        return this.stopLossOrderFillTransaction;
    }

    @SerializedName("stopLossOrderCreatedCancelTransaction") private OrderCancelTransaction stopLossOrderCreatedCancelTransaction;

    /**
     * Get the stopLossOrderCreatedCancelTransaction
     * <p>
     * The Transaction created that immediately cancels the Trade's new Stop
     * Loss Order. Only provided if the new Stop Loss Order was immediately
     * cancelled.
     * <p>
     * @return the stopLossOrderCreatedCancelTransaction
     * @see OrderCancelTransaction
     */
    public OrderCancelTransaction getStopLossOrderCreatedCancelTransaction() {
        return this.stopLossOrderCreatedCancelTransaction;
    }

    @SerializedName("trailingStopLossOrderCancelTransaction") private OrderCancelTransaction trailingStopLossOrderCancelTransaction;

    /**
     * Get the trailingStopLossOrderCancelTransaction
     * <p>
     * The Transaction created that cancels the Trade's existing Trailing Stop
     * Loss Order.
     * <p>
     * @return the trailingStopLossOrderCancelTransaction
     * @see OrderCancelTransaction
     */
    public OrderCancelTransaction getTrailingStopLossOrderCancelTransaction() {
        return this.trailingStopLossOrderCancelTransaction;
    }

    @SerializedName("trailingStopLossOrderTransaction") private TrailingStopLossOrderTransaction trailingStopLossOrderTransaction;

    /**
     * Get the trailingStopLossOrderTransaction
     * <p>
     * The Transaction created that creates a new Trailing Stop Loss Order for
     * the Trade.
     * <p>
     * @return the trailingStopLossOrderTransaction
     * @see TrailingStopLossOrderTransaction
     */
    public TrailingStopLossOrderTransaction getTrailingStopLossOrderTransaction() {
        return this.trailingStopLossOrderTransaction;
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
