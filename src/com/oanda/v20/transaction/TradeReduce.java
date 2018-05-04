package com.oanda.v20.transaction;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.pricing_common.PriceValue;
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
        this.price = other.price;
        this.realizedPL = other.realizedPL;
        this.financing = other.financing;
        this.guaranteedExecutionFee = other.guaranteedExecutionFee;
        this.halfSpreadCost = other.halfSpreadCost;
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

    @SerializedName("price") private PriceValue price;

    /**
     * Get the Units Closed Price
     * <p>
     * The average price that the units were closed at. This price may be
     * clamped for guaranteed Stop Loss Orders.
     * <p>
     * @return the Units Closed Price
     * @see PriceValue
     */
    public PriceValue getPrice() {
        return this.price;
    }

    /**
     * Set the Units Closed Price
     * <p>
     * The average price that the units were closed at. This price may be
     * clamped for guaranteed Stop Loss Orders.
     * <p>
     * @param price the Units Closed Price as a PriceValue
     * @return {@link TradeReduce TradeReduce}
     * @see PriceValue
     */
    public TradeReduce setPrice(PriceValue price) {
        this.price = price;
        return this;
    }
    /**
     * Set the Units Closed Price
     * <p>
     * The average price that the units were closed at. This price may be
     * clamped for guaranteed Stop Loss Orders.
     * <p>
     * @param price the Units Closed Price as a String
     * @return {@link TradeReduce TradeReduce}
     * @see PriceValue
     */
    public TradeReduce setPrice(String price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Units Closed Price
     * <p>
     * The average price that the units were closed at. This price may be
     * clamped for guaranteed Stop Loss Orders.
     * <p>
     * @param price the Units Closed Price as a double
     * @return {@link TradeReduce TradeReduce}
     * @see PriceValue
     */
    public TradeReduce setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Units Closed Price
     * <p>
     * The average price that the units were closed at. This price may be
     * clamped for guaranteed Stop Loss Orders.
     * <p>
     * @param price the Units Closed Price as a BigDecimal
     * @return {@link TradeReduce TradeReduce}
     * @see PriceValue
     */
    public TradeReduce setPrice(BigDecimal price) {
        this.price = new PriceValue(price);
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

    @SerializedName("guaranteedExecutionFee") private AccountUnits guaranteedExecutionFee;

    /**
     * Get the Guranteed Execution Fee
     * <p>
     * This is the fee that is charged for closing the Trade if it has a
     * guaranteed Stop Loss Order attached to it.
     * <p>
     * @return the Guranteed Execution Fee
     * @see AccountUnits
     */
    public AccountUnits getGuaranteedExecutionFee() {
        return this.guaranteedExecutionFee;
    }

    /**
     * Set the Guranteed Execution Fee
     * <p>
     * This is the fee that is charged for closing the Trade if it has a
     * guaranteed Stop Loss Order attached to it.
     * <p>
     * @param guaranteedExecutionFee the Guranteed Execution Fee as an
     * AccountUnits
     * @return {@link TradeReduce TradeReduce}
     * @see AccountUnits
     */
    public TradeReduce setGuaranteedExecutionFee(AccountUnits guaranteedExecutionFee) {
        this.guaranteedExecutionFee = guaranteedExecutionFee;
        return this;
    }
    /**
     * Set the Guranteed Execution Fee
     * <p>
     * This is the fee that is charged for closing the Trade if it has a
     * guaranteed Stop Loss Order attached to it.
     * <p>
     * @param guaranteedExecutionFee the Guranteed Execution Fee as a String
     * @return {@link TradeReduce TradeReduce}
     * @see AccountUnits
     */
    public TradeReduce setGuaranteedExecutionFee(String guaranteedExecutionFee) {
        this.guaranteedExecutionFee = new AccountUnits(guaranteedExecutionFee);
        return this;
    }
    /**
     * Set the Guranteed Execution Fee
     * <p>
     * This is the fee that is charged for closing the Trade if it has a
     * guaranteed Stop Loss Order attached to it.
     * <p>
     * @param guaranteedExecutionFee the Guranteed Execution Fee as a double
     * @return {@link TradeReduce TradeReduce}
     * @see AccountUnits
     */
    public TradeReduce setGuaranteedExecutionFee(double guaranteedExecutionFee) {
        this.guaranteedExecutionFee = new AccountUnits(guaranteedExecutionFee);
        return this;
    }
    /**
     * Set the Guranteed Execution Fee
     * <p>
     * This is the fee that is charged for closing the Trade if it has a
     * guaranteed Stop Loss Order attached to it.
     * <p>
     * @param guaranteedExecutionFee the Guranteed Execution Fee as a
     * BigDecimal
     * @return {@link TradeReduce TradeReduce}
     * @see AccountUnits
     */
    public TradeReduce setGuaranteedExecutionFee(BigDecimal guaranteedExecutionFee) {
        this.guaranteedExecutionFee = new AccountUnits(guaranteedExecutionFee);
        return this;
    }

    @SerializedName("halfSpreadCost") private AccountUnits halfSpreadCost;

    /**
     * Get the Half Spread Cost
     * <p>
     * The half spread cost for the trade reduce/close. This can be a positive
     * or negative value and is represented in the home currency of the
     * Account.
     * <p>
     * @return the Half Spread Cost
     * @see AccountUnits
     */
    public AccountUnits getHalfSpreadCost() {
        return this.halfSpreadCost;
    }

    /**
     * Set the Half Spread Cost
     * <p>
     * The half spread cost for the trade reduce/close. This can be a positive
     * or negative value and is represented in the home currency of the
     * Account.
     * <p>
     * @param halfSpreadCost the Half Spread Cost as an AccountUnits
     * @return {@link TradeReduce TradeReduce}
     * @see AccountUnits
     */
    public TradeReduce setHalfSpreadCost(AccountUnits halfSpreadCost) {
        this.halfSpreadCost = halfSpreadCost;
        return this;
    }
    /**
     * Set the Half Spread Cost
     * <p>
     * The half spread cost for the trade reduce/close. This can be a positive
     * or negative value and is represented in the home currency of the
     * Account.
     * <p>
     * @param halfSpreadCost the Half Spread Cost as a String
     * @return {@link TradeReduce TradeReduce}
     * @see AccountUnits
     */
    public TradeReduce setHalfSpreadCost(String halfSpreadCost) {
        this.halfSpreadCost = new AccountUnits(halfSpreadCost);
        return this;
    }
    /**
     * Set the Half Spread Cost
     * <p>
     * The half spread cost for the trade reduce/close. This can be a positive
     * or negative value and is represented in the home currency of the
     * Account.
     * <p>
     * @param halfSpreadCost the Half Spread Cost as a double
     * @return {@link TradeReduce TradeReduce}
     * @see AccountUnits
     */
    public TradeReduce setHalfSpreadCost(double halfSpreadCost) {
        this.halfSpreadCost = new AccountUnits(halfSpreadCost);
        return this;
    }
    /**
     * Set the Half Spread Cost
     * <p>
     * The half spread cost for the trade reduce/close. This can be a positive
     * or negative value and is represented in the home currency of the
     * Account.
     * <p>
     * @param halfSpreadCost the Half Spread Cost as a BigDecimal
     * @return {@link TradeReduce TradeReduce}
     * @see AccountUnits
     */
    public TradeReduce setHalfSpreadCost(BigDecimal halfSpreadCost) {
        this.halfSpreadCost = new AccountUnits(halfSpreadCost);
        return this;
    }

    @Override
    public String toString() {
        return "TradeReduce(" +
            "tradeID=" +
                (tradeID == null ? "null" : tradeID.toString()) + ", " +
            "units=" +
                (units == null ? "null" : units.toString()) + ", " +
            "price=" +
                (price == null ? "null" : price.toString()) + ", " +
            "realizedPL=" +
                (realizedPL == null ? "null" : realizedPL.toString()) + ", " +
            "financing=" +
                (financing == null ? "null" : financing.toString()) + ", " +
            "guaranteedExecutionFee=" +
                (guaranteedExecutionFee == null ? "null" : guaranteedExecutionFee.toString()) + ", " +
            "halfSpreadCost=" +
                (halfSpreadCost == null ? "null" : halfSpreadCost.toString()) +
            ")";
    }
}
