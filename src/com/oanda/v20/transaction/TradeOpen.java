package com.oanda.v20.transaction;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.pricing_common.PriceValue;
import com.oanda.v20.primitives.AccountUnits;
import com.oanda.v20.primitives.DecimalNumber;
import com.oanda.v20.trade.TradeID;

/**
 * A TradeOpen object represents a Trade for an instrument that was opened in
 * an Account. It is found embedded in Transactions that affect the position of
 * an instrument in the Account, specifically the OrderFill Transaction.
 */
public class TradeOpen {

    /**
     * Default constructor.
     */
    public TradeOpen() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the TradeOpen to copy
     */
    public TradeOpen(TradeOpen other) {
        this.tradeID = other.tradeID;
        this.units = other.units;
        this.price = other.price;
        this.guaranteedExecutionFee = other.guaranteedExecutionFee;
        if (other.clientExtensions != null)
        {
            this.clientExtensions = new ClientExtensions(other.clientExtensions);
        }
        this.halfSpreadCost = other.halfSpreadCost;
        this.initialMarginRequired = other.initialMarginRequired;
    }

    @SerializedName("tradeID") private TradeID tradeID;

    /**
     * Get the Trade ID
     * <p>
     * The ID of the Trade that was opened
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
     * The ID of the Trade that was opened
     * <p>
     * @param tradeID the Trade ID as a TradeID
     * @return {@link TradeOpen TradeOpen}
     * @see TradeID
     */
    public TradeOpen setTradeID(TradeID tradeID) {
        this.tradeID = tradeID;
        return this;
    }
    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade that was opened
     * <p>
     * @param tradeID the Trade ID as a String
     * @return {@link TradeOpen TradeOpen}
     * @see TradeID
     */
    public TradeOpen setTradeID(String tradeID) {
        this.tradeID = new TradeID(tradeID);
        return this;
    }

    @SerializedName("units") private DecimalNumber units;

    /**
     * Get the Amount
     * <p>
     * The number of units opened by the Trade
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
     * The number of units opened by the Trade
     * <p>
     * @param units the Amount as a DecimalNumber
     * @return {@link TradeOpen TradeOpen}
     * @see DecimalNumber
     */
    public TradeOpen setUnits(DecimalNumber units) {
        this.units = units;
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The number of units opened by the Trade
     * <p>
     * @param units the Amount as a String
     * @return {@link TradeOpen TradeOpen}
     * @see DecimalNumber
     */
    public TradeOpen setUnits(String units) {
        this.units = new DecimalNumber(units);
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The number of units opened by the Trade
     * <p>
     * @param units the Amount as a double
     * @return {@link TradeOpen TradeOpen}
     * @see DecimalNumber
     */
    public TradeOpen setUnits(double units) {
        this.units = new DecimalNumber(units);
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The number of units opened by the Trade
     * <p>
     * @param units the Amount as a BigDecimal
     * @return {@link TradeOpen TradeOpen}
     * @see DecimalNumber
     */
    public TradeOpen setUnits(BigDecimal units) {
        this.units = new DecimalNumber(units);
        return this;
    }

    @SerializedName("price") private PriceValue price;

    /**
     * Get the Units Opened Price
     * <p>
     * The average price that the units were opened at.
     * <p>
     * @return the Units Opened Price
     * @see PriceValue
     */
    public PriceValue getPrice() {
        return this.price;
    }

    /**
     * Set the Units Opened Price
     * <p>
     * The average price that the units were opened at.
     * <p>
     * @param price the Units Opened Price as a PriceValue
     * @return {@link TradeOpen TradeOpen}
     * @see PriceValue
     */
    public TradeOpen setPrice(PriceValue price) {
        this.price = price;
        return this;
    }
    /**
     * Set the Units Opened Price
     * <p>
     * The average price that the units were opened at.
     * <p>
     * @param price the Units Opened Price as a String
     * @return {@link TradeOpen TradeOpen}
     * @see PriceValue
     */
    public TradeOpen setPrice(String price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Units Opened Price
     * <p>
     * The average price that the units were opened at.
     * <p>
     * @param price the Units Opened Price as a double
     * @return {@link TradeOpen TradeOpen}
     * @see PriceValue
     */
    public TradeOpen setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Units Opened Price
     * <p>
     * The average price that the units were opened at.
     * <p>
     * @param price the Units Opened Price as a BigDecimal
     * @return {@link TradeOpen TradeOpen}
     * @see PriceValue
     */
    public TradeOpen setPrice(BigDecimal price) {
        this.price = new PriceValue(price);
        return this;
    }

    @SerializedName("guaranteedExecutionFee") private AccountUnits guaranteedExecutionFee;

    /**
     * Get the Guranteed Execution Fee
     * <p>
     * This is the fee charged for opening the trade if it has a guaranteed
     * Stop Loss Order attached to it.
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
     * This is the fee charged for opening the trade if it has a guaranteed
     * Stop Loss Order attached to it.
     * <p>
     * @param guaranteedExecutionFee the Guranteed Execution Fee as an
     * AccountUnits
     * @return {@link TradeOpen TradeOpen}
     * @see AccountUnits
     */
    public TradeOpen setGuaranteedExecutionFee(AccountUnits guaranteedExecutionFee) {
        this.guaranteedExecutionFee = guaranteedExecutionFee;
        return this;
    }
    /**
     * Set the Guranteed Execution Fee
     * <p>
     * This is the fee charged for opening the trade if it has a guaranteed
     * Stop Loss Order attached to it.
     * <p>
     * @param guaranteedExecutionFee the Guranteed Execution Fee as a String
     * @return {@link TradeOpen TradeOpen}
     * @see AccountUnits
     */
    public TradeOpen setGuaranteedExecutionFee(String guaranteedExecutionFee) {
        this.guaranteedExecutionFee = new AccountUnits(guaranteedExecutionFee);
        return this;
    }
    /**
     * Set the Guranteed Execution Fee
     * <p>
     * This is the fee charged for opening the trade if it has a guaranteed
     * Stop Loss Order attached to it.
     * <p>
     * @param guaranteedExecutionFee the Guranteed Execution Fee as a double
     * @return {@link TradeOpen TradeOpen}
     * @see AccountUnits
     */
    public TradeOpen setGuaranteedExecutionFee(double guaranteedExecutionFee) {
        this.guaranteedExecutionFee = new AccountUnits(guaranteedExecutionFee);
        return this;
    }
    /**
     * Set the Guranteed Execution Fee
     * <p>
     * This is the fee charged for opening the trade if it has a guaranteed
     * Stop Loss Order attached to it.
     * <p>
     * @param guaranteedExecutionFee the Guranteed Execution Fee as a
     * BigDecimal
     * @return {@link TradeOpen TradeOpen}
     * @see AccountUnits
     */
    public TradeOpen setGuaranteedExecutionFee(BigDecimal guaranteedExecutionFee) {
        this.guaranteedExecutionFee = new AccountUnits(guaranteedExecutionFee);
        return this;
    }

    @SerializedName("clientExtensions") private ClientExtensions clientExtensions;

    /**
     * Get the Client Extensions
     * <p>
     * The client extensions for the newly opened Trade
     * <p>
     * @return the Client Extensions
     * @see ClientExtensions
     */
    public ClientExtensions getClientExtensions() {
        return this.clientExtensions;
    }

    /**
     * Set the Client Extensions
     * <p>
     * The client extensions for the newly opened Trade
     * <p>
     * @param clientExtensions the Client Extensions as a ClientExtensions
     * @return {@link TradeOpen TradeOpen}
     * @see ClientExtensions
     */
    public TradeOpen setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

    @SerializedName("halfSpreadCost") private AccountUnits halfSpreadCost;

    /**
     * Get the Half Spread Cost
     * <p>
     * The half spread cost for the trade open. This can be a positive or
     * negative value and is represented in the home currency of the Account.
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
     * The half spread cost for the trade open. This can be a positive or
     * negative value and is represented in the home currency of the Account.
     * <p>
     * @param halfSpreadCost the Half Spread Cost as an AccountUnits
     * @return {@link TradeOpen TradeOpen}
     * @see AccountUnits
     */
    public TradeOpen setHalfSpreadCost(AccountUnits halfSpreadCost) {
        this.halfSpreadCost = halfSpreadCost;
        return this;
    }
    /**
     * Set the Half Spread Cost
     * <p>
     * The half spread cost for the trade open. This can be a positive or
     * negative value and is represented in the home currency of the Account.
     * <p>
     * @param halfSpreadCost the Half Spread Cost as a String
     * @return {@link TradeOpen TradeOpen}
     * @see AccountUnits
     */
    public TradeOpen setHalfSpreadCost(String halfSpreadCost) {
        this.halfSpreadCost = new AccountUnits(halfSpreadCost);
        return this;
    }
    /**
     * Set the Half Spread Cost
     * <p>
     * The half spread cost for the trade open. This can be a positive or
     * negative value and is represented in the home currency of the Account.
     * <p>
     * @param halfSpreadCost the Half Spread Cost as a double
     * @return {@link TradeOpen TradeOpen}
     * @see AccountUnits
     */
    public TradeOpen setHalfSpreadCost(double halfSpreadCost) {
        this.halfSpreadCost = new AccountUnits(halfSpreadCost);
        return this;
    }
    /**
     * Set the Half Spread Cost
     * <p>
     * The half spread cost for the trade open. This can be a positive or
     * negative value and is represented in the home currency of the Account.
     * <p>
     * @param halfSpreadCost the Half Spread Cost as a BigDecimal
     * @return {@link TradeOpen TradeOpen}
     * @see AccountUnits
     */
    public TradeOpen setHalfSpreadCost(BigDecimal halfSpreadCost) {
        this.halfSpreadCost = new AccountUnits(halfSpreadCost);
        return this;
    }

    @SerializedName("initialMarginRequired") private AccountUnits initialMarginRequired;

    /**
     * Get the Initial Margin Required
     * <p>
     * The margin required at the time the Trade was created. Note, this is the
     * 'pure' margin required, it is not the 'effective' margin used that
     * factors in the trade risk if a GSLO is attached to the trade.
     * <p>
     * @return the Initial Margin Required
     * @see AccountUnits
     */
    public AccountUnits getInitialMarginRequired() {
        return this.initialMarginRequired;
    }

    /**
     * Set the Initial Margin Required
     * <p>
     * The margin required at the time the Trade was created. Note, this is the
     * 'pure' margin required, it is not the 'effective' margin used that
     * factors in the trade risk if a GSLO is attached to the trade.
     * <p>
     * @param initialMarginRequired the Initial Margin Required as an
     * AccountUnits
     * @return {@link TradeOpen TradeOpen}
     * @see AccountUnits
     */
    public TradeOpen setInitialMarginRequired(AccountUnits initialMarginRequired) {
        this.initialMarginRequired = initialMarginRequired;
        return this;
    }
    /**
     * Set the Initial Margin Required
     * <p>
     * The margin required at the time the Trade was created. Note, this is the
     * 'pure' margin required, it is not the 'effective' margin used that
     * factors in the trade risk if a GSLO is attached to the trade.
     * <p>
     * @param initialMarginRequired the Initial Margin Required as a String
     * @return {@link TradeOpen TradeOpen}
     * @see AccountUnits
     */
    public TradeOpen setInitialMarginRequired(String initialMarginRequired) {
        this.initialMarginRequired = new AccountUnits(initialMarginRequired);
        return this;
    }
    /**
     * Set the Initial Margin Required
     * <p>
     * The margin required at the time the Trade was created. Note, this is the
     * 'pure' margin required, it is not the 'effective' margin used that
     * factors in the trade risk if a GSLO is attached to the trade.
     * <p>
     * @param initialMarginRequired the Initial Margin Required as a double
     * @return {@link TradeOpen TradeOpen}
     * @see AccountUnits
     */
    public TradeOpen setInitialMarginRequired(double initialMarginRequired) {
        this.initialMarginRequired = new AccountUnits(initialMarginRequired);
        return this;
    }
    /**
     * Set the Initial Margin Required
     * <p>
     * The margin required at the time the Trade was created. Note, this is the
     * 'pure' margin required, it is not the 'effective' margin used that
     * factors in the trade risk if a GSLO is attached to the trade.
     * <p>
     * @param initialMarginRequired the Initial Margin Required as a BigDecimal
     * @return {@link TradeOpen TradeOpen}
     * @see AccountUnits
     */
    public TradeOpen setInitialMarginRequired(BigDecimal initialMarginRequired) {
        this.initialMarginRequired = new AccountUnits(initialMarginRequired);
        return this;
    }

    @Override
    public String toString() {
        return "TradeOpen(" +
            "tradeID=" +
                (tradeID == null ? "null" : tradeID.toString()) + ", " +
            "units=" +
                (units == null ? "null" : units.toString()) + ", " +
            "price=" +
                (price == null ? "null" : price.toString()) + ", " +
            "guaranteedExecutionFee=" +
                (guaranteedExecutionFee == null ? "null" : guaranteedExecutionFee.toString()) + ", " +
            "clientExtensions=" +
                (clientExtensions == null ? "null" : clientExtensions.toString()) + ", " +
            "halfSpreadCost=" +
                (halfSpreadCost == null ? "null" : halfSpreadCost.toString()) + ", " +
            "initialMarginRequired=" +
                (initialMarginRequired == null ? "null" : initialMarginRequired.toString()) +
            ")";
    }
}
