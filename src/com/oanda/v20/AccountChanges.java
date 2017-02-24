package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * An AccountChanges Object is used to represent the changes to an Account's
 * Orders, Trades and Positions since a specified Account TransactionID in the
 * past.
 */
public class AccountChanges {

    @SerializedName("ordersCreated") private Order[] ordersCreated;

    /**
     * Set the Orders Created
     * <p>
     * The Orders created. These Orders may have been filled, cancelled or
     * triggered in the same period.
     * <p>
     * @param ordersCreated the Orders Created
     * @return {@link AccountChanges AccountChanges}
     * @see Order
     */
    public AccountChanges setOrdersCreated(Order[] ordersCreated) {
        this.ordersCreated = ordersCreated;
        return this;
    }

    /**
     * Get the Orders Created
     * <p>
     * The Orders created. These Orders may have been filled, cancelled or
     * triggered in the same period.
     * <p>
     * @return the Orders Created
     * @see Order
     */
    public Order[] getOrdersCreated() {
        return this.ordersCreated;
    }

    @SerializedName("ordersCancelled") private Order[] ordersCancelled;

    /**
     * Set the Orders Cancelled
     * <p>
     * The Orders cancelled.
     * <p>
     * @param ordersCancelled the Orders Cancelled
     * @return {@link AccountChanges AccountChanges}
     * @see Order
     */
    public AccountChanges setOrdersCancelled(Order[] ordersCancelled) {
        this.ordersCancelled = ordersCancelled;
        return this;
    }

    /**
     * Get the Orders Cancelled
     * <p>
     * The Orders cancelled.
     * <p>
     * @return the Orders Cancelled
     * @see Order
     */
    public Order[] getOrdersCancelled() {
        return this.ordersCancelled;
    }

    @SerializedName("ordersFilled") private Order[] ordersFilled;

    /**
     * Set the Orders Filled
     * <p>
     * The Orders filled.
     * <p>
     * @param ordersFilled the Orders Filled
     * @return {@link AccountChanges AccountChanges}
     * @see Order
     */
    public AccountChanges setOrdersFilled(Order[] ordersFilled) {
        this.ordersFilled = ordersFilled;
        return this;
    }

    /**
     * Get the Orders Filled
     * <p>
     * The Orders filled.
     * <p>
     * @return the Orders Filled
     * @see Order
     */
    public Order[] getOrdersFilled() {
        return this.ordersFilled;
    }

    @SerializedName("ordersTriggered") private Order[] ordersTriggered;

    /**
     * Set the Orders Triggered
     * <p>
     * The Orders triggered.
     * <p>
     * @param ordersTriggered the Orders Triggered
     * @return {@link AccountChanges AccountChanges}
     * @see Order
     */
    public AccountChanges setOrdersTriggered(Order[] ordersTriggered) {
        this.ordersTriggered = ordersTriggered;
        return this;
    }

    /**
     * Get the Orders Triggered
     * <p>
     * The Orders triggered.
     * <p>
     * @return the Orders Triggered
     * @see Order
     */
    public Order[] getOrdersTriggered() {
        return this.ordersTriggered;
    }

    @SerializedName("tradesOpened") private TradeSummary[] tradesOpened;

    /**
     * Set the Trades Opened
     * <p>
     * The Trades opened.
     * <p>
     * @param tradesOpened the Trades Opened
     * @return {@link AccountChanges AccountChanges}
     * @see TradeSummary
     */
    public AccountChanges setTradesOpened(TradeSummary[] tradesOpened) {
        this.tradesOpened = tradesOpened;
        return this;
    }

    /**
     * Get the Trades Opened
     * <p>
     * The Trades opened.
     * <p>
     * @return the Trades Opened
     * @see TradeSummary
     */
    public TradeSummary[] getTradesOpened() {
        return this.tradesOpened;
    }

    @SerializedName("tradesReduced") private TradeSummary[] tradesReduced;

    /**
     * Set the Trades Reduced
     * <p>
     * The Trades reduced.
     * <p>
     * @param tradesReduced the Trades Reduced
     * @return {@link AccountChanges AccountChanges}
     * @see TradeSummary
     */
    public AccountChanges setTradesReduced(TradeSummary[] tradesReduced) {
        this.tradesReduced = tradesReduced;
        return this;
    }

    /**
     * Get the Trades Reduced
     * <p>
     * The Trades reduced.
     * <p>
     * @return the Trades Reduced
     * @see TradeSummary
     */
    public TradeSummary[] getTradesReduced() {
        return this.tradesReduced;
    }

    @SerializedName("tradesClosed") private TradeSummary[] tradesClosed;

    /**
     * Set the Trades Closed
     * <p>
     * The Trades closed.
     * <p>
     * @param tradesClosed the Trades Closed
     * @return {@link AccountChanges AccountChanges}
     * @see TradeSummary
     */
    public AccountChanges setTradesClosed(TradeSummary[] tradesClosed) {
        this.tradesClosed = tradesClosed;
        return this;
    }

    /**
     * Get the Trades Closed
     * <p>
     * The Trades closed.
     * <p>
     * @return the Trades Closed
     * @see TradeSummary
     */
    public TradeSummary[] getTradesClosed() {
        return this.tradesClosed;
    }

    @SerializedName("positions") private Position[] positions;

    /**
     * Set the Positions
     * <p>
     * The Positions changed.
     * <p>
     * @param positions the Positions
     * @return {@link AccountChanges AccountChanges}
     * @see Position
     */
    public AccountChanges setPositions(Position[] positions) {
        this.positions = positions;
        return this;
    }

    /**
     * Get the Positions
     * <p>
     * The Positions changed.
     * <p>
     * @return the Positions
     * @see Position
     */
    public Position[] getPositions() {
        return this.positions;
    }

    @SerializedName("transactions") private Transaction[] transactions;

    /**
     * Set the Transactions
     * <p>
     * The Transactions that have been generated.
     * <p>
     * @param transactions the Transactions
     * @return {@link AccountChanges AccountChanges}
     * @see Transaction
     */
    public AccountChanges setTransactions(Transaction[] transactions) {
        this.transactions = transactions;
        return this;
    }

    /**
     * Get the Transactions
     * <p>
     * The Transactions that have been generated.
     * <p>
     * @return the Transactions
     * @see Transaction
     */
    public Transaction[] getTransactions() {
        return this.transactions;
    }
}
