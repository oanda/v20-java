package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * OpenTradeFinancing is used to pay/collect daily financing charge for an open
 * Trade within an Account
 */
public class OpenTradeFinancing {

    @SerializedName("tradeID") private TradeID tradeID;

    /**
     * Set the tradeID
     * <p>
     * The ID of the Trade that financing is being paid/collected for.
     * <p>
     * @param tradeID the tradeID
     * @return {@link OpenTradeFinancing OpenTradeFinancing}
     * @see TradeID
     */
    public OpenTradeFinancing setTradeID(String tradeID) {
        this.tradeID = new TradeID(tradeID);
        return this;
    }

    /**
     * Get the tradeID
     * <p>
     * The ID of the Trade that financing is being paid/collected for.
     * <p>
     * @return the tradeID
     * @see TradeID
     */
    public String getTradeID() {
        return this.tradeID.getTradeID();
    }

    @SerializedName("financing") private AccountUnits financing;

    /**
     * Set the Financing
     * <p>
     * The amount of financing paid/collected for the Trade.
     * <p>
     * @param financing the Financing
     * @return {@link OpenTradeFinancing OpenTradeFinancing}
     * @see AccountUnits
     */
    public OpenTradeFinancing setFinancing(double financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }

    /**
     * Get the Financing
     * <p>
     * The amount of financing paid/collected for the Trade.
     * <p>
     * @return the Financing
     * @see AccountUnits
     */
    public double getFinancing() {
        return this.financing.getAccountUnits();
    }
}
