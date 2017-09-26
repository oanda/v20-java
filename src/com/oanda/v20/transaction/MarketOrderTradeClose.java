package com.oanda.v20.transaction;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.trade.TradeID;

/**
 * A MarketOrderTradeClose specifies the extensions to a Market Order that has
 * been created specifically to close a Trade.
 */
public class MarketOrderTradeClose {

    /**
     * Default constructor.
     */
    public MarketOrderTradeClose() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the MarketOrderTradeClose to copy
     */
    public MarketOrderTradeClose(MarketOrderTradeClose other) {
        this.tradeID = other.tradeID;
        this.clientTradeID = other.clientTradeID;
        this.units = other.units;
    }

    @SerializedName("tradeID") private TradeID tradeID;

    /**
     * Get the Trade ID
     * <p>
     * The ID of the Trade requested to be closed
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
     * The ID of the Trade requested to be closed
     * <p>
     * @param tradeID the Trade ID as a TradeID
     * @return {@link MarketOrderTradeClose MarketOrderTradeClose}
     * @see TradeID
     */
    public MarketOrderTradeClose setTradeID(TradeID tradeID) {
        this.tradeID = tradeID;
        return this;
    }
    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade requested to be closed
     * <p>
     * @param tradeID the Trade ID as a String
     * @return {@link MarketOrderTradeClose MarketOrderTradeClose}
     * @see TradeID
     */
    public MarketOrderTradeClose setTradeID(String tradeID) {
        this.tradeID = new TradeID(tradeID);
        return this;
    }

    @SerializedName("clientTradeID") private String clientTradeID;

    /**
     * Get the Client Trade ID
     * <p>
     * The client ID of the Trade requested to be closed
     * <p>
     * @return the Client Trade ID
     */
    public String getClientTradeID() {
        return this.clientTradeID;
    }

    /**
     * Set the Client Trade ID
     * <p>
     * The client ID of the Trade requested to be closed
     * <p>
     * @param clientTradeID the Client Trade ID as a String
     * @return {@link MarketOrderTradeClose MarketOrderTradeClose}
     */
    public MarketOrderTradeClose setClientTradeID(String clientTradeID) {
        this.clientTradeID = clientTradeID;
        return this;
    }

    @SerializedName("units") private String units;

    /**
     * Get the Amount
     * <p>
     * Indication of how much of the Trade to close. Either "ALL", or a
     * DecimalNumber reflection a partial close of the Trade.
     * <p>
     * @return the Amount
     */
    public String getUnits() {
        return this.units;
    }

    /**
     * Set the Amount
     * <p>
     * Indication of how much of the Trade to close. Either "ALL", or a
     * DecimalNumber reflection a partial close of the Trade.
     * <p>
     * @param units the Amount as a String
     * @return {@link MarketOrderTradeClose MarketOrderTradeClose}
     */
    public MarketOrderTradeClose setUnits(String units) {
        this.units = units;
        return this;
    }

    @Override
    public String toString() {
        return "MarketOrderTradeClose(" +
            "tradeID=" +
                (tradeID == null ? "null" : tradeID.toString()) + ", " +
            "clientTradeID=" +
                (clientTradeID == null ? "null" : clientTradeID.toString()) + ", " +
            "units=" +
                (units == null ? "null" : units.toString()) +
            ")";
    }
}
