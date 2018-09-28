package com.oanda.v20.account;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.order.Order;
import com.oanda.v20.position.Position;
import com.oanda.v20.trade.TradeSummary;
import com.oanda.v20.transaction.Transaction;

/**
 * An AccountChanges Object is used to represent the changes to an Account's
 * Orders, Trades and Positions since a specified Account TransactionID in the
 * past.
 */
public class AccountChanges {

    /**
     * Default constructor.
     */
    public AccountChanges() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the AccountChanges to copy
     */
    public AccountChanges(AccountChanges other) {
        if (other.ordersCreated != null)
        {
            this.ordersCreated = new ArrayList<Order>(other.ordersCreated);
        }
        if (other.ordersCancelled != null)
        {
            this.ordersCancelled = new ArrayList<Order>(other.ordersCancelled);
        }
        if (other.ordersFilled != null)
        {
            this.ordersFilled = new ArrayList<Order>(other.ordersFilled);
        }
        if (other.ordersTriggered != null)
        {
            this.ordersTriggered = new ArrayList<Order>(other.ordersTriggered);
        }
        if (other.tradesOpened != null)
        {
            this.tradesOpened = new ArrayList<TradeSummary>(other.tradesOpened);
        }
        if (other.tradesReduced != null)
        {
            this.tradesReduced = new ArrayList<TradeSummary>(other.tradesReduced);
        }
        if (other.tradesClosed != null)
        {
            this.tradesClosed = new ArrayList<TradeSummary>(other.tradesClosed);
        }
        if (other.positions != null)
        {
            this.positions = new ArrayList<Position>(other.positions);
        }
        if (other.transactions != null)
        {
            this.transactions = new ArrayList<Transaction>(other.transactions);
        }
    }

    @SerializedName("ordersCreated") private ArrayList<Order> ordersCreated;

    /**
     * Get the Orders Created
     * <p>
     * The Orders created. These Orders may have been filled, cancelled or
     * triggered in the same period.
     * <p>
     * @return the Orders Created
     * @see Order
     */
    public List<Order> getOrdersCreated() {
        return this.ordersCreated;
    }

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
    public AccountChanges setOrdersCreated(Collection<?> ordersCreated) {
        ArrayList<Order> newOrdersCreated = new ArrayList<Order>(ordersCreated.size());
        ordersCreated.forEach((item) -> {
            if (item instanceof Order)
            {
                newOrdersCreated.add((Order) item);
            }
            else
            {
                throw new IllegalArgumentException(
                    item.getClass().getName() + " cannot be converted to an Order"
                );
            }
        });
        this.ordersCreated = newOrdersCreated;
        return this;
    }

    @SerializedName("ordersCancelled") private ArrayList<Order> ordersCancelled;

    /**
     * Get the Orders Cancelled
     * <p>
     * The Orders cancelled.
     * <p>
     * @return the Orders Cancelled
     * @see Order
     */
    public List<Order> getOrdersCancelled() {
        return this.ordersCancelled;
    }

    /**
     * Set the Orders Cancelled
     * <p>
     * The Orders cancelled.
     * <p>
     * @param ordersCancelled the Orders Cancelled
     * @return {@link AccountChanges AccountChanges}
     * @see Order
     */
    public AccountChanges setOrdersCancelled(Collection<?> ordersCancelled) {
        ArrayList<Order> newOrdersCancelled = new ArrayList<Order>(ordersCancelled.size());
        ordersCancelled.forEach((item) -> {
            if (item instanceof Order)
            {
                newOrdersCancelled.add((Order) item);
            }
            else
            {
                throw new IllegalArgumentException(
                    item.getClass().getName() + " cannot be converted to an Order"
                );
            }
        });
        this.ordersCancelled = newOrdersCancelled;
        return this;
    }

    @SerializedName("ordersFilled") private ArrayList<Order> ordersFilled;

    /**
     * Get the Orders Filled
     * <p>
     * The Orders filled.
     * <p>
     * @return the Orders Filled
     * @see Order
     */
    public List<Order> getOrdersFilled() {
        return this.ordersFilled;
    }

    /**
     * Set the Orders Filled
     * <p>
     * The Orders filled.
     * <p>
     * @param ordersFilled the Orders Filled
     * @return {@link AccountChanges AccountChanges}
     * @see Order
     */
    public AccountChanges setOrdersFilled(Collection<?> ordersFilled) {
        ArrayList<Order> newOrdersFilled = new ArrayList<Order>(ordersFilled.size());
        ordersFilled.forEach((item) -> {
            if (item instanceof Order)
            {
                newOrdersFilled.add((Order) item);
            }
            else
            {
                throw new IllegalArgumentException(
                    item.getClass().getName() + " cannot be converted to an Order"
                );
            }
        });
        this.ordersFilled = newOrdersFilled;
        return this;
    }

    @SerializedName("ordersTriggered") private ArrayList<Order> ordersTriggered;

    /**
     * Get the Orders Triggered
     * <p>
     * The Orders triggered.
     * <p>
     * @return the Orders Triggered
     * @see Order
     */
    public List<Order> getOrdersTriggered() {
        return this.ordersTriggered;
    }

    /**
     * Set the Orders Triggered
     * <p>
     * The Orders triggered.
     * <p>
     * @param ordersTriggered the Orders Triggered
     * @return {@link AccountChanges AccountChanges}
     * @see Order
     */
    public AccountChanges setOrdersTriggered(Collection<?> ordersTriggered) {
        ArrayList<Order> newOrdersTriggered = new ArrayList<Order>(ordersTriggered.size());
        ordersTriggered.forEach((item) -> {
            if (item instanceof Order)
            {
                newOrdersTriggered.add((Order) item);
            }
            else
            {
                throw new IllegalArgumentException(
                    item.getClass().getName() + " cannot be converted to an Order"
                );
            }
        });
        this.ordersTriggered = newOrdersTriggered;
        return this;
    }

    @SerializedName("tradesOpened") private ArrayList<TradeSummary> tradesOpened;

    /**
     * Get the Trades Opened
     * <p>
     * The Trades opened.
     * <p>
     * @return the Trades Opened
     * @see TradeSummary
     */
    public List<TradeSummary> getTradesOpened() {
        return this.tradesOpened;
    }

    /**
     * Set the Trades Opened
     * <p>
     * The Trades opened.
     * <p>
     * @param tradesOpened the Trades Opened
     * @return {@link AccountChanges AccountChanges}
     * @see TradeSummary
     */
    public AccountChanges setTradesOpened(Collection<?> tradesOpened) {
        ArrayList<TradeSummary> newTradesOpened = new ArrayList<TradeSummary>(tradesOpened.size());
        tradesOpened.forEach((item) -> {
            if (item instanceof TradeSummary)
            {
                newTradesOpened.add((TradeSummary) item);
            }
            else
            {
                throw new IllegalArgumentException(
                    item.getClass().getName() + " cannot be converted to a TradeSummary"
                );
            }
        });
        this.tradesOpened = newTradesOpened;
        return this;
    }

    @SerializedName("tradesReduced") private ArrayList<TradeSummary> tradesReduced;

    /**
     * Get the Trades Reduced
     * <p>
     * The Trades reduced.
     * <p>
     * @return the Trades Reduced
     * @see TradeSummary
     */
    public List<TradeSummary> getTradesReduced() {
        return this.tradesReduced;
    }

    /**
     * Set the Trades Reduced
     * <p>
     * The Trades reduced.
     * <p>
     * @param tradesReduced the Trades Reduced
     * @return {@link AccountChanges AccountChanges}
     * @see TradeSummary
     */
    public AccountChanges setTradesReduced(Collection<?> tradesReduced) {
        ArrayList<TradeSummary> newTradesReduced = new ArrayList<TradeSummary>(tradesReduced.size());
        tradesReduced.forEach((item) -> {
            if (item instanceof TradeSummary)
            {
                newTradesReduced.add((TradeSummary) item);
            }
            else
            {
                throw new IllegalArgumentException(
                    item.getClass().getName() + " cannot be converted to a TradeSummary"
                );
            }
        });
        this.tradesReduced = newTradesReduced;
        return this;
    }

    @SerializedName("tradesClosed") private ArrayList<TradeSummary> tradesClosed;

    /**
     * Get the Trades Closed
     * <p>
     * The Trades closed.
     * <p>
     * @return the Trades Closed
     * @see TradeSummary
     */
    public List<TradeSummary> getTradesClosed() {
        return this.tradesClosed;
    }

    /**
     * Set the Trades Closed
     * <p>
     * The Trades closed.
     * <p>
     * @param tradesClosed the Trades Closed
     * @return {@link AccountChanges AccountChanges}
     * @see TradeSummary
     */
    public AccountChanges setTradesClosed(Collection<?> tradesClosed) {
        ArrayList<TradeSummary> newTradesClosed = new ArrayList<TradeSummary>(tradesClosed.size());
        tradesClosed.forEach((item) -> {
            if (item instanceof TradeSummary)
            {
                newTradesClosed.add((TradeSummary) item);
            }
            else
            {
                throw new IllegalArgumentException(
                    item.getClass().getName() + " cannot be converted to a TradeSummary"
                );
            }
        });
        this.tradesClosed = newTradesClosed;
        return this;
    }

    @SerializedName("positions") private ArrayList<Position> positions;

    /**
     * Get the Positions
     * <p>
     * The Positions changed.
     * <p>
     * @return the Positions
     * @see Position
     */
    public List<Position> getPositions() {
        return this.positions;
    }

    /**
     * Set the Positions
     * <p>
     * The Positions changed.
     * <p>
     * @param positions the Positions
     * @return {@link AccountChanges AccountChanges}
     * @see Position
     */
    public AccountChanges setPositions(Collection<?> positions) {
        ArrayList<Position> newPositions = new ArrayList<Position>(positions.size());
        positions.forEach((item) -> {
            if (item instanceof Position)
            {
                newPositions.add((Position) item);
            }
            else
            {
                throw new IllegalArgumentException(
                    item.getClass().getName() + " cannot be converted to a Position"
                );
            }
        });
        this.positions = newPositions;
        return this;
    }

    @SerializedName("transactions") private ArrayList<Transaction> transactions;

    /**
     * Get the Transactions
     * <p>
     * The Transactions that have been generated.
     * <p>
     * @return the Transactions
     * @see Transaction
     */
    public List<Transaction> getTransactions() {
        return this.transactions;
    }

    /**
     * Set the Transactions
     * <p>
     * The Transactions that have been generated.
     * <p>
     * @param transactions the Transactions
     * @return {@link AccountChanges AccountChanges}
     * @see Transaction
     */
    public AccountChanges setTransactions(Collection<?> transactions) {
        ArrayList<Transaction> newTransactions = new ArrayList<Transaction>(transactions.size());
        transactions.forEach((item) -> {
            if (item instanceof Transaction)
            {
                newTransactions.add((Transaction) item);
            }
            else
            {
                throw new IllegalArgumentException(
                    item.getClass().getName() + " cannot be converted to a Transaction"
                );
            }
        });
        this.transactions = newTransactions;
        return this;
    }

    @Override
    public String toString() {
        return "AccountChanges(" +
            "ordersCreated=" +
                (ordersCreated == null ? "null" : ordersCreated.toString()) + ", " +
            "ordersCancelled=" +
                (ordersCancelled == null ? "null" : ordersCancelled.toString()) + ", " +
            "ordersFilled=" +
                (ordersFilled == null ? "null" : ordersFilled.toString()) + ", " +
            "ordersTriggered=" +
                (ordersTriggered == null ? "null" : ordersTriggered.toString()) + ", " +
            "tradesOpened=" +
                (tradesOpened == null ? "null" : tradesOpened.toString()) + ", " +
            "tradesReduced=" +
                (tradesReduced == null ? "null" : tradesReduced.toString()) + ", " +
            "tradesClosed=" +
                (tradesClosed == null ? "null" : tradesClosed.toString()) + ", " +
            "positions=" +
                (positions == null ? "null" : positions.toString()) + ", " +
            "transactions=" +
                (transactions == null ? "null" : transactions.toString()) +
            ")";
    }
}
