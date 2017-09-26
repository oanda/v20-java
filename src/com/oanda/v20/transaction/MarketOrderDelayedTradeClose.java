package com.oanda.v20.transaction;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.trade.TradeID;

/**
 * Details for the Market Order extensions specific to a Market Order placed
 * with the intent of fully closing a specific open trade that should have
 * already been closed but wasn't due to halted market conditions
 */
public class MarketOrderDelayedTradeClose {

    /**
     * Default constructor.
     */
    public MarketOrderDelayedTradeClose() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the MarketOrderDelayedTradeClose to copy
     */
    public MarketOrderDelayedTradeClose(MarketOrderDelayedTradeClose other) {
        this.tradeID = other.tradeID;
        this.clientTradeID = other.clientTradeID;
        this.sourceTransactionID = other.sourceTransactionID;
    }

    @SerializedName("tradeID") private TradeID tradeID;

    /**
     * Get the Trade ID
     * <p>
     * The ID of the Trade being closed
     * <p>
     * @return the Trade ID
     * @see TradeID
     */
    public TradeID getTradeID() {
        return this.tradeID;
    }

    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade being closed
     * <p>
     * @param tradeID the Trade ID as a TradeID
     * @return {@link MarketOrderDelayedTradeClose
     * MarketOrderDelayedTradeClose}
     * @see TradeID
     */
    public MarketOrderDelayedTradeClose setTradeID(TradeID tradeID) {
        this.tradeID = tradeID;
        return this;
    }
    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade being closed
     * <p>
     * @param tradeID the Trade ID as a String
     * @return {@link MarketOrderDelayedTradeClose
     * MarketOrderDelayedTradeClose}
     * @see TradeID
     */
    public MarketOrderDelayedTradeClose setTradeID(String tradeID) {
        this.tradeID = new TradeID(tradeID);
        return this;
    }

    @SerializedName("clientTradeID") private TradeID clientTradeID;

    /**
     * Get the Client Trade ID
     * <p>
     * The Client ID of the Trade being closed
     * <p>
     * @return the Client Trade ID
     * @see TradeID
     */
    public TradeID getClientTradeID() {
        return this.clientTradeID;
    }

    /**
     * Set the Client Trade ID
     * <p>
     * The Client ID of the Trade being closed
     * <p>
     * @param clientTradeID the Client Trade ID as a TradeID
     * @return {@link MarketOrderDelayedTradeClose
     * MarketOrderDelayedTradeClose}
     * @see TradeID
     */
    public MarketOrderDelayedTradeClose setClientTradeID(TradeID clientTradeID) {
        this.clientTradeID = clientTradeID;
        return this;
    }
    /**
     * Set the Client Trade ID
     * <p>
     * The Client ID of the Trade being closed
     * <p>
     * @param clientTradeID the Client Trade ID as a String
     * @return {@link MarketOrderDelayedTradeClose
     * MarketOrderDelayedTradeClose}
     * @see TradeID
     */
    public MarketOrderDelayedTradeClose setClientTradeID(String clientTradeID) {
        this.clientTradeID = new TradeID(clientTradeID);
        return this;
    }

    @SerializedName("sourceTransactionID") private TransactionID sourceTransactionID;

    /**
     * Get the Source Transaction ID
     * <p>
     * The Transaction ID of the DelayedTradeClosure transaction to which this
     * Delayed Trade Close belongs to
     * <p>
     * @return the Source Transaction ID
     * @see TransactionID
     */
    public TransactionID getSourceTransactionID() {
        return this.sourceTransactionID;
    }

    /**
     * Set the Source Transaction ID
     * <p>
     * The Transaction ID of the DelayedTradeClosure transaction to which this
     * Delayed Trade Close belongs to
     * <p>
     * @param sourceTransactionID the Source Transaction ID as a TransactionID
     * @return {@link MarketOrderDelayedTradeClose
     * MarketOrderDelayedTradeClose}
     * @see TransactionID
     */
    public MarketOrderDelayedTradeClose setSourceTransactionID(TransactionID sourceTransactionID) {
        this.sourceTransactionID = sourceTransactionID;
        return this;
    }
    /**
     * Set the Source Transaction ID
     * <p>
     * The Transaction ID of the DelayedTradeClosure transaction to which this
     * Delayed Trade Close belongs to
     * <p>
     * @param sourceTransactionID the Source Transaction ID as a String
     * @return {@link MarketOrderDelayedTradeClose
     * MarketOrderDelayedTradeClose}
     * @see TransactionID
     */
    public MarketOrderDelayedTradeClose setSourceTransactionID(String sourceTransactionID) {
        this.sourceTransactionID = new TransactionID(sourceTransactionID);
        return this;
    }

    @Override
    public String toString() {
        return "MarketOrderDelayedTradeClose(" +
            "tradeID=" +
                (tradeID == null ? "null" : tradeID.toString()) + ", " +
            "clientTradeID=" +
                (clientTradeID == null ? "null" : clientTradeID.toString()) + ", " +
            "sourceTransactionID=" +
                (sourceTransactionID == null ? "null" : sourceTransactionID.toString()) +
            ")";
    }
}
