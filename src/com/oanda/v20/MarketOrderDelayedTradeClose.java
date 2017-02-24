package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * Details for the Market Order extensions specific to a Market Order placed
 * with the intent of fully closing a specific open trade that should have
 * already been closed but wasn't due to halted market conditions
 */
public class MarketOrderDelayedTradeClose {

    @SerializedName("tradeID") private TradeID tradeID;

    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade being closed
     * <p>
     * @param tradeID the Trade ID
     * @return {@link MarketOrderDelayedTradeClose
     * MarketOrderDelayedTradeClose}
     * @see TradeID
     */
    public MarketOrderDelayedTradeClose setTradeID(String tradeID) {
        this.tradeID = new TradeID(tradeID);
        return this;
    }

    /**
     * Get the Trade ID
     * <p>
     * The ID of the Trade being closed
     * <p>
     * @return the Trade ID
     * @see TradeID
     */
    public String getTradeID() {
        return this.tradeID.getTradeID();
    }

    @SerializedName("clientTradeID") private TradeID clientTradeID;

    /**
     * Set the Client Trade ID
     * <p>
     * The Client ID of the Trade being closed
     * <p>
     * @param clientTradeID the Client Trade ID
     * @return {@link MarketOrderDelayedTradeClose
     * MarketOrderDelayedTradeClose}
     * @see TradeID
     */
    public MarketOrderDelayedTradeClose setClientTradeID(String clientTradeID) {
        this.clientTradeID = new TradeID(clientTradeID);
        return this;
    }

    /**
     * Get the Client Trade ID
     * <p>
     * The Client ID of the Trade being closed
     * <p>
     * @return the Client Trade ID
     * @see TradeID
     */
    public String getClientTradeID() {
        return this.clientTradeID.getTradeID();
    }

    @SerializedName("sourceTransactionID") private TransactionID sourceTransactionID;

    /**
     * Set the Source Transaction ID
     * <p>
     * The Transaction ID of the DelayedTradeClosure transaction to which this
     * Delayed Trade Close belongs to
     * <p>
     * @param sourceTransactionID the Source Transaction ID
     * @return {@link MarketOrderDelayedTradeClose
     * MarketOrderDelayedTradeClose}
     * @see TransactionID
     */
    public MarketOrderDelayedTradeClose setSourceTransactionID(String sourceTransactionID) {
        this.sourceTransactionID = new TransactionID(sourceTransactionID);
        return this;
    }

    /**
     * Get the Source Transaction ID
     * <p>
     * The Transaction ID of the DelayedTradeClosure transaction to which this
     * Delayed Trade Close belongs to
     * <p>
     * @return the Source Transaction ID
     * @see TransactionID
     */
    public String getSourceTransactionID() {
        return this.sourceTransactionID.getTransactionID();
    }
}
