package com.oanda.v20.position;

import java.util.ArrayList;
import java.math.BigDecimal;
import java.util.List;
import java.util.Collection;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.pricing_common.PriceValue;
import com.oanda.v20.primitives.AccountUnits;
import com.oanda.v20.primitives.DecimalNumber;
import com.oanda.v20.trade.TradeID;

/**
 * The representation of a Position for a single direction (long or short).
 * <p>
 * {units} @ {averagePrice}, {pl} PL {unrealizedPL} UPL
 */
public class PositionSide {

    /**
     * Default constructor.
     */
    public PositionSide() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the PositionSide to copy
     */
    public PositionSide(PositionSide other) {
        this.units = other.units;
        this.averagePrice = other.averagePrice;
        if (other.tradeIDs != null)
        {
            this.tradeIDs = new ArrayList<TradeID>(other.tradeIDs);
        }
        this.pl = other.pl;
        this.unrealizedPL = other.unrealizedPL;
        this.resettablePL = other.resettablePL;
        this.financing = other.financing;
        this.guaranteedExecutionFees = other.guaranteedExecutionFees;
    }

    @SerializedName("units") private DecimalNumber units;

    /**
     * Get the Units
     * <p>
     * Number of units in the position (negative value indicates short
     * position, positive indicates long position).
     * <p>
     * @return the Units
     * @see DecimalNumber
     */
    public DecimalNumber getUnits() {
        return this.units;
    }

    /**
     * Set the Units
     * <p>
     * Number of units in the position (negative value indicates short
     * position, positive indicates long position).
     * <p>
     * @param units the Units as a DecimalNumber
     * @return {@link PositionSide PositionSide}
     * @see DecimalNumber
     */
    public PositionSide setUnits(DecimalNumber units) {
        this.units = units;
        return this;
    }
    /**
     * Set the Units
     * <p>
     * Number of units in the position (negative value indicates short
     * position, positive indicates long position).
     * <p>
     * @param units the Units as a String
     * @return {@link PositionSide PositionSide}
     * @see DecimalNumber
     */
    public PositionSide setUnits(String units) {
        this.units = new DecimalNumber(units);
        return this;
    }
    /**
     * Set the Units
     * <p>
     * Number of units in the position (negative value indicates short
     * position, positive indicates long position).
     * <p>
     * @param units the Units as a double
     * @return {@link PositionSide PositionSide}
     * @see DecimalNumber
     */
    public PositionSide setUnits(double units) {
        this.units = new DecimalNumber(units);
        return this;
    }
    /**
     * Set the Units
     * <p>
     * Number of units in the position (negative value indicates short
     * position, positive indicates long position).
     * <p>
     * @param units the Units as a BigDecimal
     * @return {@link PositionSide PositionSide}
     * @see DecimalNumber
     */
    public PositionSide setUnits(BigDecimal units) {
        this.units = new DecimalNumber(units);
        return this;
    }

    @SerializedName("averagePrice") private PriceValue averagePrice;

    /**
     * Get the Average Price
     * <p>
     * Volume-weighted average of the underlying Trade open prices for the
     * Position.
     * <p>
     * @return the Average Price
     * @see PriceValue
     */
    public PriceValue getAveragePrice() {
        return this.averagePrice;
    }

    /**
     * Set the Average Price
     * <p>
     * Volume-weighted average of the underlying Trade open prices for the
     * Position.
     * <p>
     * @param averagePrice the Average Price as a PriceValue
     * @return {@link PositionSide PositionSide}
     * @see PriceValue
     */
    public PositionSide setAveragePrice(PriceValue averagePrice) {
        this.averagePrice = averagePrice;
        return this;
    }
    /**
     * Set the Average Price
     * <p>
     * Volume-weighted average of the underlying Trade open prices for the
     * Position.
     * <p>
     * @param averagePrice the Average Price as a String
     * @return {@link PositionSide PositionSide}
     * @see PriceValue
     */
    public PositionSide setAveragePrice(String averagePrice) {
        this.averagePrice = new PriceValue(averagePrice);
        return this;
    }
    /**
     * Set the Average Price
     * <p>
     * Volume-weighted average of the underlying Trade open prices for the
     * Position.
     * <p>
     * @param averagePrice the Average Price as a double
     * @return {@link PositionSide PositionSide}
     * @see PriceValue
     */
    public PositionSide setAveragePrice(double averagePrice) {
        this.averagePrice = new PriceValue(averagePrice);
        return this;
    }
    /**
     * Set the Average Price
     * <p>
     * Volume-weighted average of the underlying Trade open prices for the
     * Position.
     * <p>
     * @param averagePrice the Average Price as a BigDecimal
     * @return {@link PositionSide PositionSide}
     * @see PriceValue
     */
    public PositionSide setAveragePrice(BigDecimal averagePrice) {
        this.averagePrice = new PriceValue(averagePrice);
        return this;
    }

    @SerializedName("tradeIDs") private ArrayList<TradeID> tradeIDs;

    /**
     * Get the Trade IDs
     * <p>
     * List of the open Trade IDs which contribute to the open Position.
     * <p>
     * @return the Trade IDs
     * @see TradeID
     */
    public List<TradeID> getTradeIDs() {
        return this.tradeIDs;
    }

    /**
     * Set the Trade IDs
     * <p>
     * List of the open Trade IDs which contribute to the open Position.
     * <p>
     * @param tradeIDs the Trade IDs
     * @return {@link PositionSide PositionSide}
     * @see TradeID
     */
    public PositionSide setTradeIDs(Collection<?> tradeIDs) {
        ArrayList<TradeID> newTradeIDs = new ArrayList<TradeID>(tradeIDs.size());
        tradeIDs.forEach((item) -> {
            if (item instanceof TradeID)
            {
                newTradeIDs.add((TradeID) item);
            }
            else if (item instanceof String)
            {
                newTradeIDs.add(new TradeID((String) item));
            }
            else
            {
                throw new IllegalArgumentException(
                    item.getClass().getName() + " cannot be converted to a TradeID"
                );
            }
        });
        this.tradeIDs = newTradeIDs;
        return this;
    }

    @SerializedName("pl") private AccountUnits pl;

    /**
     * Get the Profit/Loss
     * <p>
     * Profit/loss realized by the PositionSide over the lifetime of the
     * Account.
     * <p>
     * @return the Profit/Loss
     * @see AccountUnits
     */
    public AccountUnits getPl() {
        return this.pl;
    }

    /**
     * Set the Profit/Loss
     * <p>
     * Profit/loss realized by the PositionSide over the lifetime of the
     * Account.
     * <p>
     * @param pl the Profit/Loss as an AccountUnits
     * @return {@link PositionSide PositionSide}
     * @see AccountUnits
     */
    public PositionSide setPl(AccountUnits pl) {
        this.pl = pl;
        return this;
    }
    /**
     * Set the Profit/Loss
     * <p>
     * Profit/loss realized by the PositionSide over the lifetime of the
     * Account.
     * <p>
     * @param pl the Profit/Loss as a String
     * @return {@link PositionSide PositionSide}
     * @see AccountUnits
     */
    public PositionSide setPl(String pl) {
        this.pl = new AccountUnits(pl);
        return this;
    }
    /**
     * Set the Profit/Loss
     * <p>
     * Profit/loss realized by the PositionSide over the lifetime of the
     * Account.
     * <p>
     * @param pl the Profit/Loss as a double
     * @return {@link PositionSide PositionSide}
     * @see AccountUnits
     */
    public PositionSide setPl(double pl) {
        this.pl = new AccountUnits(pl);
        return this;
    }
    /**
     * Set the Profit/Loss
     * <p>
     * Profit/loss realized by the PositionSide over the lifetime of the
     * Account.
     * <p>
     * @param pl the Profit/Loss as a BigDecimal
     * @return {@link PositionSide PositionSide}
     * @see AccountUnits
     */
    public PositionSide setPl(BigDecimal pl) {
        this.pl = new AccountUnits(pl);
        return this;
    }

    @SerializedName("unrealizedPL") private AccountUnits unrealizedPL;

    /**
     * Get the Unrealized Profit/Loss
     * <p>
     * The unrealized profit/loss of all open Trades that contribute to this
     * PositionSide.
     * <p>
     * @return the Unrealized Profit/Loss
     * @see AccountUnits
     */
    public AccountUnits getUnrealizedPL() {
        return this.unrealizedPL;
    }

    /**
     * Set the Unrealized Profit/Loss
     * <p>
     * The unrealized profit/loss of all open Trades that contribute to this
     * PositionSide.
     * <p>
     * @param unrealizedPL the Unrealized Profit/Loss as an AccountUnits
     * @return {@link PositionSide PositionSide}
     * @see AccountUnits
     */
    public PositionSide setUnrealizedPL(AccountUnits unrealizedPL) {
        this.unrealizedPL = unrealizedPL;
        return this;
    }
    /**
     * Set the Unrealized Profit/Loss
     * <p>
     * The unrealized profit/loss of all open Trades that contribute to this
     * PositionSide.
     * <p>
     * @param unrealizedPL the Unrealized Profit/Loss as a String
     * @return {@link PositionSide PositionSide}
     * @see AccountUnits
     */
    public PositionSide setUnrealizedPL(String unrealizedPL) {
        this.unrealizedPL = new AccountUnits(unrealizedPL);
        return this;
    }
    /**
     * Set the Unrealized Profit/Loss
     * <p>
     * The unrealized profit/loss of all open Trades that contribute to this
     * PositionSide.
     * <p>
     * @param unrealizedPL the Unrealized Profit/Loss as a double
     * @return {@link PositionSide PositionSide}
     * @see AccountUnits
     */
    public PositionSide setUnrealizedPL(double unrealizedPL) {
        this.unrealizedPL = new AccountUnits(unrealizedPL);
        return this;
    }
    /**
     * Set the Unrealized Profit/Loss
     * <p>
     * The unrealized profit/loss of all open Trades that contribute to this
     * PositionSide.
     * <p>
     * @param unrealizedPL the Unrealized Profit/Loss as a BigDecimal
     * @return {@link PositionSide PositionSide}
     * @see AccountUnits
     */
    public PositionSide setUnrealizedPL(BigDecimal unrealizedPL) {
        this.unrealizedPL = new AccountUnits(unrealizedPL);
        return this;
    }

    @SerializedName("resettablePL") private AccountUnits resettablePL;

    /**
     * Get the Resettable Profit/Loss
     * <p>
     * Profit/loss realized by the PositionSide since the Account's
     * resettablePL was last reset by the client.
     * <p>
     * @return the Resettable Profit/Loss
     * @see AccountUnits
     */
    public AccountUnits getResettablePL() {
        return this.resettablePL;
    }

    /**
     * Set the Resettable Profit/Loss
     * <p>
     * Profit/loss realized by the PositionSide since the Account's
     * resettablePL was last reset by the client.
     * <p>
     * @param resettablePL the Resettable Profit/Loss as an AccountUnits
     * @return {@link PositionSide PositionSide}
     * @see AccountUnits
     */
    public PositionSide setResettablePL(AccountUnits resettablePL) {
        this.resettablePL = resettablePL;
        return this;
    }
    /**
     * Set the Resettable Profit/Loss
     * <p>
     * Profit/loss realized by the PositionSide since the Account's
     * resettablePL was last reset by the client.
     * <p>
     * @param resettablePL the Resettable Profit/Loss as a String
     * @return {@link PositionSide PositionSide}
     * @see AccountUnits
     */
    public PositionSide setResettablePL(String resettablePL) {
        this.resettablePL = new AccountUnits(resettablePL);
        return this;
    }
    /**
     * Set the Resettable Profit/Loss
     * <p>
     * Profit/loss realized by the PositionSide since the Account's
     * resettablePL was last reset by the client.
     * <p>
     * @param resettablePL the Resettable Profit/Loss as a double
     * @return {@link PositionSide PositionSide}
     * @see AccountUnits
     */
    public PositionSide setResettablePL(double resettablePL) {
        this.resettablePL = new AccountUnits(resettablePL);
        return this;
    }
    /**
     * Set the Resettable Profit/Loss
     * <p>
     * Profit/loss realized by the PositionSide since the Account's
     * resettablePL was last reset by the client.
     * <p>
     * @param resettablePL the Resettable Profit/Loss as a BigDecimal
     * @return {@link PositionSide PositionSide}
     * @see AccountUnits
     */
    public PositionSide setResettablePL(BigDecimal resettablePL) {
        this.resettablePL = new AccountUnits(resettablePL);
        return this;
    }

    @SerializedName("financing") private AccountUnits financing;

    /**
     * Get the Financing
     * <p>
     * The total amount of financing paid/collected for this PositionSide over
     * the lifetime of the Account.
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
     * The total amount of financing paid/collected for this PositionSide over
     * the lifetime of the Account.
     * <p>
     * @param financing the Financing as an AccountUnits
     * @return {@link PositionSide PositionSide}
     * @see AccountUnits
     */
    public PositionSide setFinancing(AccountUnits financing) {
        this.financing = financing;
        return this;
    }
    /**
     * Set the Financing
     * <p>
     * The total amount of financing paid/collected for this PositionSide over
     * the lifetime of the Account.
     * <p>
     * @param financing the Financing as a String
     * @return {@link PositionSide PositionSide}
     * @see AccountUnits
     */
    public PositionSide setFinancing(String financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }
    /**
     * Set the Financing
     * <p>
     * The total amount of financing paid/collected for this PositionSide over
     * the lifetime of the Account.
     * <p>
     * @param financing the Financing as a double
     * @return {@link PositionSide PositionSide}
     * @see AccountUnits
     */
    public PositionSide setFinancing(double financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }
    /**
     * Set the Financing
     * <p>
     * The total amount of financing paid/collected for this PositionSide over
     * the lifetime of the Account.
     * <p>
     * @param financing the Financing as a BigDecimal
     * @return {@link PositionSide PositionSide}
     * @see AccountUnits
     */
    public PositionSide setFinancing(BigDecimal financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }

    @SerializedName("guaranteedExecutionFees") private AccountUnits guaranteedExecutionFees;

    /**
     * Get the Guranteed Execution Fees
     * <p>
     * The total amount of fees charged over the lifetime of the Account for
     * the execution of guaranteed Stop Loss Orders attached to Trades for this
     * PositionSide.
     * <p>
     * @return the Guranteed Execution Fees
     * @see AccountUnits
     */
    public AccountUnits getGuaranteedExecutionFees() {
        return this.guaranteedExecutionFees;
    }

    /**
     * Set the Guranteed Execution Fees
     * <p>
     * The total amount of fees charged over the lifetime of the Account for
     * the execution of guaranteed Stop Loss Orders attached to Trades for this
     * PositionSide.
     * <p>
     * @param guaranteedExecutionFees the Guranteed Execution Fees as an
     * AccountUnits
     * @return {@link PositionSide PositionSide}
     * @see AccountUnits
     */
    public PositionSide setGuaranteedExecutionFees(AccountUnits guaranteedExecutionFees) {
        this.guaranteedExecutionFees = guaranteedExecutionFees;
        return this;
    }
    /**
     * Set the Guranteed Execution Fees
     * <p>
     * The total amount of fees charged over the lifetime of the Account for
     * the execution of guaranteed Stop Loss Orders attached to Trades for this
     * PositionSide.
     * <p>
     * @param guaranteedExecutionFees the Guranteed Execution Fees as a String
     * @return {@link PositionSide PositionSide}
     * @see AccountUnits
     */
    public PositionSide setGuaranteedExecutionFees(String guaranteedExecutionFees) {
        this.guaranteedExecutionFees = new AccountUnits(guaranteedExecutionFees);
        return this;
    }
    /**
     * Set the Guranteed Execution Fees
     * <p>
     * The total amount of fees charged over the lifetime of the Account for
     * the execution of guaranteed Stop Loss Orders attached to Trades for this
     * PositionSide.
     * <p>
     * @param guaranteedExecutionFees the Guranteed Execution Fees as a double
     * @return {@link PositionSide PositionSide}
     * @see AccountUnits
     */
    public PositionSide setGuaranteedExecutionFees(double guaranteedExecutionFees) {
        this.guaranteedExecutionFees = new AccountUnits(guaranteedExecutionFees);
        return this;
    }
    /**
     * Set the Guranteed Execution Fees
     * <p>
     * The total amount of fees charged over the lifetime of the Account for
     * the execution of guaranteed Stop Loss Orders attached to Trades for this
     * PositionSide.
     * <p>
     * @param guaranteedExecutionFees the Guranteed Execution Fees as a
     * BigDecimal
     * @return {@link PositionSide PositionSide}
     * @see AccountUnits
     */
    public PositionSide setGuaranteedExecutionFees(BigDecimal guaranteedExecutionFees) {
        this.guaranteedExecutionFees = new AccountUnits(guaranteedExecutionFees);
        return this;
    }

    @Override
    public String toString() {
        return "PositionSide(" +
            "units=" +
                (units == null ? "null" : units.toString()) + ", " +
            "averagePrice=" +
                (averagePrice == null ? "null" : averagePrice.toString()) + ", " +
            "tradeIDs=" +
                (tradeIDs == null ? "null" : tradeIDs.toString()) + ", " +
            "pl=" +
                (pl == null ? "null" : pl.toString()) + ", " +
            "unrealizedPL=" +
                (unrealizedPL == null ? "null" : unrealizedPL.toString()) + ", " +
            "resettablePL=" +
                (resettablePL == null ? "null" : resettablePL.toString()) + ", " +
            "financing=" +
                (financing == null ? "null" : financing.toString()) + ", " +
            "guaranteedExecutionFees=" +
                (guaranteedExecutionFees == null ? "null" : guaranteedExecutionFees.toString()) +
            ")";
    }
}
