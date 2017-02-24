package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * A TradeReduce object represents a Trade for an instrument that was reduced
 * (either partially or fully) in an Account. It is found embedded in
 * Transactions that affect the position of an instrument in the account,
 * specifically the OrderFill Transaction.
 */
public class TradeReduce {

    @SerializedName("tradeID") private TradeID tradeID;

    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade that was reduced or closed
     * <p>
     * @param tradeID the Trade ID
     * @return {@link TradeReduce TradeReduce}
     * @see TradeID
     */
    public TradeReduce setTradeID(String tradeID) {
        this.tradeID = new TradeID(tradeID);
        return this;
    }

    /**
     * Get the Trade ID
     * <p>
     * The ID of the Trade that was reduced or closed
     * <p>
     * @return the Trade ID
     * @see TradeID
     */
    public String getTradeID() {
        return this.tradeID.getTradeID();
    }

    @SerializedName("units") private DecimalNumber units;

    /**
     * Set the Amount
     * <p>
     * The number of units that the Trade was reduced by
     * <p>
     * @param units the Amount
     * @return {@link TradeReduce TradeReduce}
     * @see DecimalNumber
     */
    public TradeReduce setUnits(double units) {
        this.units = new DecimalNumber(units);
        return this;
    }

    /**
     * Get the Amount
     * <p>
     * The number of units that the Trade was reduced by
     * <p>
     * @return the Amount
     * @see DecimalNumber
     */
    public double getUnits() {
        return this.units.getDecimalNumber();
    }

    @SerializedName("realizedPL") private AccountUnits realizedPL;

    /**
     * Set the Profit/Loss
     * <p>
     * The PL realized when reducing the Trade
     * <p>
     * @param realizedPL the Profit/Loss
     * @return {@link TradeReduce TradeReduce}
     * @see AccountUnits
     */
    public TradeReduce setRealizedPL(double realizedPL) {
        this.realizedPL = new AccountUnits(realizedPL);
        return this;
    }

    /**
     * Get the Profit/Loss
     * <p>
     * The PL realized when reducing the Trade
     * <p>
     * @return the Profit/Loss
     * @see AccountUnits
     */
    public double getRealizedPL() {
        return this.realizedPL.getAccountUnits();
    }

    @SerializedName("financing") private AccountUnits financing;

    /**
     * Set the Financing
     * <p>
     * The financing paid/collected when reducing the Trade
     * <p>
     * @param financing the Financing
     * @return {@link TradeReduce TradeReduce}
     * @see AccountUnits
     */
    public TradeReduce setFinancing(double financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }

    /**
     * Get the Financing
     * <p>
     * The financing paid/collected when reducing the Trade
     * <p>
     * @return the Financing
     * @see AccountUnits
     */
    public double getFinancing() {
        return this.financing.getAccountUnits();
    }
}
