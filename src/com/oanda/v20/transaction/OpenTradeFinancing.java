package com.oanda.v20.transaction;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.primitives.AccountUnits;
import com.oanda.v20.trade.TradeID;

/**
 * OpenTradeFinancing is used to pay/collect daily financing charge for an open
 * Trade within an Account
 */
public class OpenTradeFinancing {

    /**
     * Default constructor.
     */
    public OpenTradeFinancing() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the OpenTradeFinancing to copy
     */
    public OpenTradeFinancing(OpenTradeFinancing other) {
        this.tradeID = other.tradeID;
        this.financing = other.financing;
    }

    @SerializedName("tradeID") private TradeID tradeID;

    /**
     * Get the tradeID
     * <p>
     * The ID of the Trade that financing is being paid/collected for.
     * <p>
     * @return the tradeID
     * @see TradeID
     */
    public TradeID getTradeID() {
        return this.tradeID;
    }

    /**
     * Set the tradeID
     * <p>
     * The ID of the Trade that financing is being paid/collected for.
     * <p>
     * @param tradeID the tradeID as a TradeID
     * @return {@link OpenTradeFinancing OpenTradeFinancing}
     * @see TradeID
     */
    public OpenTradeFinancing setTradeID(TradeID tradeID) {
        this.tradeID = tradeID;
        return this;
    }
    /**
     * Set the tradeID
     * <p>
     * The ID of the Trade that financing is being paid/collected for.
     * <p>
     * @param tradeID the tradeID as a String
     * @return {@link OpenTradeFinancing OpenTradeFinancing}
     * @see TradeID
     */
    public OpenTradeFinancing setTradeID(String tradeID) {
        this.tradeID = new TradeID(tradeID);
        return this;
    }

    @SerializedName("financing") private AccountUnits financing;

    /**
     * Get the Financing
     * <p>
     * The amount of financing paid/collected for the Trade.
     * <p>
     * @return the Financing
     * @see AccountUnits
     */
    public AccountUnits getFinancing() {
        return this.financing;
    }

    /**
     * Set the Financing
     * <p>
     * The amount of financing paid/collected for the Trade.
     * <p>
     * @param financing the Financing as an AccountUnits
     * @return {@link OpenTradeFinancing OpenTradeFinancing}
     * @see AccountUnits
     */
    public OpenTradeFinancing setFinancing(AccountUnits financing) {
        this.financing = financing;
        return this;
    }
    /**
     * Set the Financing
     * <p>
     * The amount of financing paid/collected for the Trade.
     * <p>
     * @param financing the Financing as a String
     * @return {@link OpenTradeFinancing OpenTradeFinancing}
     * @see AccountUnits
     */
    public OpenTradeFinancing setFinancing(String financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }
    /**
     * Set the Financing
     * <p>
     * The amount of financing paid/collected for the Trade.
     * <p>
     * @param financing the Financing as a double
     * @return {@link OpenTradeFinancing OpenTradeFinancing}
     * @see AccountUnits
     */
    public OpenTradeFinancing setFinancing(double financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }
    /**
     * Set the Financing
     * <p>
     * The amount of financing paid/collected for the Trade.
     * <p>
     * @param financing the Financing as a BigDecimal
     * @return {@link OpenTradeFinancing OpenTradeFinancing}
     * @see AccountUnits
     */
    public OpenTradeFinancing setFinancing(BigDecimal financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }

    @Override
    public String toString() {
        return "OpenTradeFinancing(" +
            "tradeID=" +
                (tradeID == null ? "null" : tradeID.toString()) + ", " +
            "financing=" +
                (financing == null ? "null" : financing.toString()) +
            ")";
    }
}
