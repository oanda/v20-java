package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * The representation of a Position for a single direction (long or short).
 */
public class PositionSide {

    @SerializedName("units") private DecimalNumber units;

    /**
     * Set the Units
     * <p>
     * Number of units in the position (negative value indicates short
     * position, positive indicates long position).
     * <p>
     * @param units the Units
     * @return {@link PositionSide PositionSide}
     * @see DecimalNumber
     */
    public PositionSide setUnits(double units) {
        this.units = new DecimalNumber(units);
        return this;
    }

    /**
     * Get the Units
     * <p>
     * Number of units in the position (negative value indicates short
     * position, positive indicates long position).
     * <p>
     * @return the Units
     * @see DecimalNumber
     */
    public double getUnits() {
        return this.units.getDecimalNumber();
    }

    @SerializedName("averagePrice") private PriceValue averagePrice;

    /**
     * Set the Average Price
     * <p>
     * Volume-weighted average of the underlying Trade open prices for the
     * Position.
     * <p>
     * @param averagePrice the Average Price
     * @return {@link PositionSide PositionSide}
     * @see PriceValue
     */
    public PositionSide setAveragePrice(double averagePrice) {
        this.averagePrice = new PriceValue(averagePrice);
        return this;
    }

    /**
     * Get the Average Price
     * <p>
     * Volume-weighted average of the underlying Trade open prices for the
     * Position.
     * <p>
     * @return the Average Price
     * @see PriceValue
     */
    public double getAveragePrice() {
        return this.averagePrice.getPriceValue();
    }

    @SerializedName("tradeIDs") private TradeID[] tradeIDs;

    /**
     * Set the Trade IDs
     * <p>
     * List of the open Trade IDs which contribute to the open Position.
     * <p>
     * @param tradeIDs the Trade IDs
     * @return {@link PositionSide PositionSide}
     * @see TradeID
     */
    public PositionSide setTradeIDs(TradeID[] tradeIDs) {
        this.tradeIDs = tradeIDs;
        return this;
    }

    /**
     * Get the Trade IDs
     * <p>
     * List of the open Trade IDs which contribute to the open Position.
     * <p>
     * @return the Trade IDs
     * @see TradeID
     */
    public TradeID[] getTradeIDs() {
        return this.tradeIDs;
    }

    @SerializedName("pl") private AccountUnits pl;

    /**
     * Set the Profit/Loss
     * <p>
     * Profit/loss realized by the PositionSide over the lifetime of the
     * Account.
     * <p>
     * @param pl the Profit/Loss
     * @return {@link PositionSide PositionSide}
     * @see AccountUnits
     */
    public PositionSide setPl(double pl) {
        this.pl = new AccountUnits(pl);
        return this;
    }

    /**
     * Get the Profit/Loss
     * <p>
     * Profit/loss realized by the PositionSide over the lifetime of the
     * Account.
     * <p>
     * @return the Profit/Loss
     * @see AccountUnits
     */
    public double getPl() {
        return this.pl.getAccountUnits();
    }

    @SerializedName("unrealizedPL") private AccountUnits unrealizedPL;

    /**
     * Set the Unrealized Profit/Loss
     * <p>
     * The unrealized profit/loss of all open Trades that contribute to this
     * PositionSide.
     * <p>
     * @param unrealizedPL the Unrealized Profit/Loss
     * @return {@link PositionSide PositionSide}
     * @see AccountUnits
     */
    public PositionSide setUnrealizedPL(double unrealizedPL) {
        this.unrealizedPL = new AccountUnits(unrealizedPL);
        return this;
    }

    /**
     * Get the Unrealized Profit/Loss
     * <p>
     * The unrealized profit/loss of all open Trades that contribute to this
     * PositionSide.
     * <p>
     * @return the Unrealized Profit/Loss
     * @see AccountUnits
     */
    public double getUnrealizedPL() {
        return this.unrealizedPL.getAccountUnits();
    }

    @SerializedName("resettablePL") private AccountUnits resettablePL;

    /**
     * Set the Resettable Profit/Loss
     * <p>
     * Profit/loss realized by the PositionSide since the Account's
     * resettablePL was last reset by the client.
     * <p>
     * @param resettablePL the Resettable Profit/Loss
     * @return {@link PositionSide PositionSide}
     * @see AccountUnits
     */
    public PositionSide setResettablePL(double resettablePL) {
        this.resettablePL = new AccountUnits(resettablePL);
        return this;
    }

    /**
     * Get the Resettable Profit/Loss
     * <p>
     * Profit/loss realized by the PositionSide since the Account's
     * resettablePL was last reset by the client.
     * <p>
     * @return the Resettable Profit/Loss
     * @see AccountUnits
     */
    public double getResettablePL() {
        return this.resettablePL.getAccountUnits();
    }
}
