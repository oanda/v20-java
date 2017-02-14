package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* An AccountChanges Object is used to represent the changes to an Account's
* Orders, Trades and Positions since a specified Account TransactionID in the
* past.
*/

public class AccountChanges {
 
    @SerializedName("ordersCreated") private Order[] _ordersCreated;
    public AccountChanges set_ordersCreated(Order[] __ordersCreated) {
        this._ordersCreated = __ordersCreated;
        return this;
    }
    /**
    * The Orders created. These Orders may have been filled, cancelled or
    * triggered in the same period.
    */

    public Order[] get_ordersCreated() {
        return this._ordersCreated;
    }
 
    @SerializedName("ordersCancelled") private Order[] _ordersCancelled;
    public AccountChanges set_ordersCancelled(Order[] __ordersCancelled) {
        this._ordersCancelled = __ordersCancelled;
        return this;
    }
    /**
    * The Orders cancelled.
    */

    public Order[] get_ordersCancelled() {
        return this._ordersCancelled;
    }
 
    @SerializedName("ordersFilled") private Order[] _ordersFilled;
    public AccountChanges set_ordersFilled(Order[] __ordersFilled) {
        this._ordersFilled = __ordersFilled;
        return this;
    }
    /**
    * The Orders filled.
    */

    public Order[] get_ordersFilled() {
        return this._ordersFilled;
    }
 
    @SerializedName("ordersTriggered") private Order[] _ordersTriggered;
    public AccountChanges set_ordersTriggered(Order[] __ordersTriggered) {
        this._ordersTriggered = __ordersTriggered;
        return this;
    }
    /**
    * The Orders triggered.
    */

    public Order[] get_ordersTriggered() {
        return this._ordersTriggered;
    }
 
    @SerializedName("tradesOpened") private TradeSummary[] _tradesOpened;
    public AccountChanges set_tradesOpened(TradeSummary[] __tradesOpened) {
        this._tradesOpened = __tradesOpened;
        return this;
    }
    /**
    * The Trades opened.
    */

    public TradeSummary[] get_tradesOpened() {
        return this._tradesOpened;
    }
 
    @SerializedName("tradesReduced") private TradeSummary[] _tradesReduced;
    public AccountChanges set_tradesReduced(TradeSummary[] __tradesReduced) {
        this._tradesReduced = __tradesReduced;
        return this;
    }
    /**
    * The Trades reduced.
    */

    public TradeSummary[] get_tradesReduced() {
        return this._tradesReduced;
    }
 
    @SerializedName("tradesClosed") private TradeSummary[] _tradesClosed;
    public AccountChanges set_tradesClosed(TradeSummary[] __tradesClosed) {
        this._tradesClosed = __tradesClosed;
        return this;
    }
    /**
    * The Trades closed.
    */

    public TradeSummary[] get_tradesClosed() {
        return this._tradesClosed;
    }
 
    @SerializedName("positions") private Position[] _positions;
    public AccountChanges set_positions(Position[] __positions) {
        this._positions = __positions;
        return this;
    }
    /**
    * The Positions changed.
    */

    public Position[] get_positions() {
        return this._positions;
    }
 
    @SerializedName("transactions") private Transaction[] _transactions;
    public AccountChanges set_transactions(Transaction[] __transactions) {
        this._transactions = __transactions;
        return this;
    }
    /**
    * The Transactions that have been generated.
    */

    public Transaction[] get_transactions() {
        return this._transactions;
    }
}
