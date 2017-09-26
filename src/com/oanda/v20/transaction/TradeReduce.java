package com.oanda.v20.transaction;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.primitives.AccountUnits;
import com.oanda.v20.primitives.DecimalNumber;
import com.oanda.v20.trade.TradeID;

/**
 * A TradeReduce object represents a Trade for an instrument that was reduced
 * (either partially or fully) in an Account. It is found embedded in
 * Transactions that affect the position of an instrument in the account,
 * specifically the OrderFill Transaction.
 */
public class TradeReduce {

    /**
     * Default constructor.
     */
    public TradeReduce() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the TradeReduce to copy
     */
    public TradeReduce(TradeReduce other) {
        this.tradeID = other.tradeID;
        this.units = other.units;
        this.realizedPL = other.realizedPL;
        this.financing = other.financing;
    }

    @SerializedName("tradeID") private TradeID tradeID;

    /**
     * Get the Trade ID
     * <p>
     * The ID of the Trade that was reduced or closed
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
     * The ID of the Trade that was reduced or closed
     * <p>
     * @param tradeID the Trade ID as a TradeID
     * @return {@link TradeReduce TradeReduce}
     * @see TradeID
     */
    public TradeReduce setTradeID(TradeID tradeID) {
        this.tradeID = tradeID;
        return this;
    }
    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade that was reduced or closed
     * <p>
     * @param tradeID the Trade ID as a String
     * @return {@link TradeReduce TradeReduce}
     * @see TradeID
     */
    public TradeReduce setTradeID(String tradeID) {
        this.tradeID = new TradeID(tradeID);
        return this;
    }

    @SerializedName("units") private DecimalNumber units;

    /**
     * Get the Amount
     * <p>
     * The number of units that the Trade was reduced by
     * <p>
     * @return the Amount
     * @see DecimalNumber
     */
    public DecimalNumber getUnits() {
        return this.units;
    }

    /**
     * Set the Amount
     * <p>
     * The number of units that the Trade was reduced by
     * <p>
     * @param units the Amount as a DecimalNumber
     * @return {@link TradeReduce TradeReduce}
     * @see DecimalNumber
     */
    public TradeReduce setUnits(DecimalNumber units) {
        this.units = units;
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The number of units that the Trade was reduced by
     * <p>
     * @param units the Amount as a String
     * @return {@link TradeReduce TradeReduce}
     * @see DecimalNumber
     */
    public TradeReduce setUnits(String units) {
        this.units = new DecimalNumber(units);
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The number of units that the Trade was reduced by
     * <p>
     * @param units the Amount as a double
     * @return {@link TradeReduce TradeReduce}
     * @see DecimalNumber
     */
    public TradeReduce setUnits(double units) {
        this.units = new DecimalNumber(units);
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The number of units that the Trade was reduced by
     * <p>
     * @param units the Amount as a BigDecimal
     * @return {@link TradeReduce TradeReduce}
     * @see DecimalNumber
     */
    public TradeReduce setUnits(BigDecimal units) {
        this.units = new DecimalNumber(units);
        return this;
    }

    @SerializedName("realizedPL") private AccountUnits realizedPL;

    /**
     * Get the Profit/Loss
     * <p>
     * The PL realized when reducing the Trade
     * <p>
     * @return the Profit/Loss
     * @see AccountUnits
     */
    public AccountUnits getRealizedPL() {
        return this.realizedPL;
    }

    /**
     * Set the Profit/Loss
     * <p>
     * The PL realized when reducing the Trade
     * <p>
     * @param realizedPL the Profit/Loss as an AccountUnits
     * @return {@link TradeReduce TradeReduce}
     * @see AccountUnits
     */
    public TradeReduce setRealizedPL(AccountUnits realizedPL) {
        this.realizedPL = realizedPL;
        return this;
    }
    /**
     * Set the Profit/Loss
     * <p>
     * The PL realized when reducing the Trade
     * <p>
     * @param realizedPL the Profit/Loss as a String
     * @return {@link TradeReduce TradeReduce}
     * @see AccountUnits
     */
    public TradeReduce setRealizedPL(String realizedPL) {
        this.realizedPL = new AccountUnits(realizedPL);
        return this;
    }
    /**
     * Set the Profit/Loss
     * <p>
     * The PL realized when reducing the Trade
     * <p>
     * @param realizedPL the Profit/Loss as a double
     * @return {@link TradeReduce TradeReduce}
     * @see AccountUnits
     */
    public TradeReduce setRealizedPL(double realizedPL) {
        this.realizedPL = new AccountUnits(realizedPL);
        return this;
    }
    /**
     * Set the Profit/Loss
     * <p>
     * The PL realized when reducing the Trade
     * <p>
     * @param realizedPL the Profit/Loss as a BigDecimal
     * @return {@link TradeReduce TradeReduce}
     * @see AccountUnits
     */
    public TradeReduce setRealizedPL(BigDecimal realizedPL) {
        this.realizedPL = new AccountUnits(realizedPL);
        return this;
    }

    @SerializedName("financing") private AccountUnits financing;

    /**
     * Get the Financing
     * <p>
     * The financing paid/collected when reducing the Trade
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
     * The financing paid/collected when reducing the Trade
     * <p>
     * @param financing the Financing as an AccountUnits
     * @return {@link TradeReduce TradeReduce}
     * @see AccountUnits
     */
    public TradeReduce setFinancing(AccountUnits financing) {
        this.financing = financing;
        return this;
    }
    /**
     * Set the Financing
     * <p>
     * The financing paid/collected when reducing the Trade
     * <p>
     * @param financing the Financing as a String
     * @return {@link TradeReduce TradeReduce}
     * @see AccountUnits
     */
    public TradeReduce setFinancing(String financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }
    /**
     * Set the Financing
     * <p>
     * The financing paid/collected when reducing the Trade
     * <p>
     * @param financing the Financing as a double
     * @return {@link TradeReduce TradeReduce}
     * @see AccountUnits
     */
    public TradeReduce setFinancing(double financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }
    /**
     * Set the Financing
     * <p>
     * The financing paid/collected when reducing the Trade
     * <p>
     * @param financing the Financing as a BigDecimal
     * @return {@link TradeReduce TradeReduce}
     * @see AccountUnits
     */
    public TradeReduce setFinancing(BigDecimal financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }

    @Override
    public String toString() {
        return "TradeReduce(" +
            "tradeID=" +
                (tradeID == null ? "null" : tradeID.toString()) + ", " +
            "units=" +
                (units == null ? "null" : units.toString()) + ", " +
            "realizedPL=" +
                (realizedPL == null ? "null" : realizedPL.toString()) + ", " +
            "financing=" +
                (financing == null ? "null" : financing.toString()) +
            ")";
    }
}
