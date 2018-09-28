package com.oanda.v20.trade;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.RequestException;
import com.oanda.v20.transaction.OrderCancelRejectTransaction;
import com.oanda.v20.transaction.StopLossOrderRejectTransaction;
import com.oanda.v20.transaction.TakeProfitOrderRejectTransaction;
import com.oanda.v20.transaction.TrailingStopLossOrderRejectTransaction;
import com.oanda.v20.transaction.TransactionID;

/**
 * TradeSetDependentOrders400RequestException
 */
public class TradeSetDependentOrders400RequestException extends RequestException {

    private static final long serialVersionUID = 379194315785145496L;

    /**
     * TradeSetDependentOrders400RequestException Constructor
     * <p>
     * Construct a new TradeSetDependentOrders400RequestException
     */
    private TradeSetDependentOrders400RequestException() {
    }

    @SerializedName("takeProfitOrderCancelRejectTransaction") private OrderCancelRejectTransaction takeProfitOrderCancelRejectTransaction;

    /**
     * Get the takeProfitOrderCancelRejectTransaction
     * <p>
     * An OrderCancelRejectTransaction represents the rejection of the
     * cancellation of an Order in the client's Account.
     * <p>
     * @return the takeProfitOrderCancelRejectTransaction
     * @see OrderCancelRejectTransaction
     */
    public OrderCancelRejectTransaction getTakeProfitOrderCancelRejectTransaction() {
        return this.takeProfitOrderCancelRejectTransaction;
    }

    @SerializedName("takeProfitOrderRejectTransaction") private TakeProfitOrderRejectTransaction takeProfitOrderRejectTransaction;

    /**
     * Get the takeProfitOrderRejectTransaction
     * <p>
     * A TakeProfitOrderRejectTransaction represents the rejection of the
     * creation of a TakeProfit Order.
     * <p>
     * @return the takeProfitOrderRejectTransaction
     * @see TakeProfitOrderRejectTransaction
     */
    public TakeProfitOrderRejectTransaction getTakeProfitOrderRejectTransaction() {
        return this.takeProfitOrderRejectTransaction;
    }

    @SerializedName("stopLossOrderCancelRejectTransaction") private OrderCancelRejectTransaction stopLossOrderCancelRejectTransaction;

    /**
     * Get the stopLossOrderCancelRejectTransaction
     * <p>
     * An OrderCancelRejectTransaction represents the rejection of the
     * cancellation of an Order in the client's Account.
     * <p>
     * @return the stopLossOrderCancelRejectTransaction
     * @see OrderCancelRejectTransaction
     */
    public OrderCancelRejectTransaction getStopLossOrderCancelRejectTransaction() {
        return this.stopLossOrderCancelRejectTransaction;
    }

    @SerializedName("stopLossOrderRejectTransaction") private StopLossOrderRejectTransaction stopLossOrderRejectTransaction;

    /**
     * Get the stopLossOrderRejectTransaction
     * <p>
     * A StopLossOrderRejectTransaction represents the rejection of the
     * creation of a StopLoss Order.
     * <p>
     * @return the stopLossOrderRejectTransaction
     * @see StopLossOrderRejectTransaction
     */
    public StopLossOrderRejectTransaction getStopLossOrderRejectTransaction() {
        return this.stopLossOrderRejectTransaction;
    }

    @SerializedName("trailingStopLossOrderCancelRejectTransaction") private OrderCancelRejectTransaction trailingStopLossOrderCancelRejectTransaction;

    /**
     * Get the trailingStopLossOrderCancelRejectTransaction
     * <p>
     * An OrderCancelRejectTransaction represents the rejection of the
     * cancellation of an Order in the client's Account.
     * <p>
     * @return the trailingStopLossOrderCancelRejectTransaction
     * @see OrderCancelRejectTransaction
     */
    public OrderCancelRejectTransaction getTrailingStopLossOrderCancelRejectTransaction() {
        return this.trailingStopLossOrderCancelRejectTransaction;
    }

    @SerializedName("trailingStopLossOrderRejectTransaction") private TrailingStopLossOrderRejectTransaction trailingStopLossOrderRejectTransaction;

    /**
     * Get the trailingStopLossOrderRejectTransaction
     * <p>
     * A TrailingStopLossOrderRejectTransaction represents the rejection of the
     * creation of a TrailingStopLoss Order.
     * <p>
     * @return the trailingStopLossOrderRejectTransaction
     * @see TrailingStopLossOrderRejectTransaction
     */
    public TrailingStopLossOrderRejectTransaction getTrailingStopLossOrderRejectTransaction() {
        return this.trailingStopLossOrderRejectTransaction;
    }

    @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

    /**
     * Get the lastTransactionID
     * <p>
     * The ID of the most recent Transaction created for the Account.
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
