package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * A MarketOrderTradeClose specifies the extensions to a Market Order that has
 * been created specifically to close a Trade.
 */
public class MarketOrderTradeClose {

    @SerializedName("tradeID") private TradeID tradeID;

    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade requested to be closed
     * <p>
     * @param tradeID the Trade ID
     * @return {@link MarketOrderTradeClose MarketOrderTradeClose}
     * @see TradeID
     */
    public MarketOrderTradeClose setTradeID(String tradeID) {
        this.tradeID = new TradeID(tradeID);
        return this;
    }

    /**
     * Get the Trade ID
     * <p>
     * The ID of the Trade requested to be closed
     * <p>
     * @return the Trade ID
     * @see TradeID
     */
    public String getTradeID() {
        return this.tradeID.getTradeID();
    }

    @SerializedName("clientTradeID") private String clientTradeID;

    /**
     * Set the Client Trade ID
     * <p>
     * The client ID of the Trade requested to be closed
     * <p>
     * @param clientTradeID the Client Trade ID
     * @return {@link MarketOrderTradeClose MarketOrderTradeClose}
     */
    public MarketOrderTradeClose setClientTradeID(String clientTradeID) {
        this.clientTradeID = clientTradeID;
        return this;
    }

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

    @SerializedName("units") private String units;

    /**
     * Set the Amount
     * <p>
     * Indication of how much of the Trade to close. Either "ALL", or a
     * DecimalNumber reflection a partial close of the Trade.
     * <p>
     * @param units the Amount
     * @return {@link MarketOrderTradeClose MarketOrderTradeClose}
     */
    public MarketOrderTradeClose setUnits(String units) {
        this.units = units;
        return this;
    }

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
}
