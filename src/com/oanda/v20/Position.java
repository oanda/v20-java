package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * The specification of a Position within an Account.
 * <p>
 * {instrument}, {pl} PL {unrealizedPL} UPL
 */
public class Position {

    @SerializedName("instrument") private InstrumentName instrument;

    /**
     * Set the Instrument
     * <p>
     * The Position's Instrument.
     * <p>
     * @param instrument the Instrument
     * @return {@link Position Position}
     * @see InstrumentName
     */
    public Position setInstrument(String instrument) {
        this.instrument = new InstrumentName(instrument);
        return this;
    }

    /**
     * Get the Instrument
     * <p>
     * The Position's Instrument.
     * <p>
     * @return the Instrument
     * @see InstrumentName
     */
    public String getInstrument() {
        return this.instrument.getInstrumentName();
    }

    @SerializedName("pl") private AccountUnits pl;

    /**
     * Set the Profit/Loss
     * <p>
     * Profit/loss realized by the Position over the lifetime of the Account.
     * <p>
     * @param pl the Profit/Loss
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setPl(double pl) {
        this.pl = new AccountUnits(pl);
        return this;
    }

    /**
     * Get the Profit/Loss
     * <p>
     * Profit/loss realized by the Position over the lifetime of the Account.
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
     * Position.
     * <p>
     * @param unrealizedPL the Unrealized Profit/Loss
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setUnrealizedPL(double unrealizedPL) {
        this.unrealizedPL = new AccountUnits(unrealizedPL);
        return this;
    }

    /**
     * Get the Unrealized Profit/Loss
     * <p>
     * The unrealized profit/loss of all open Trades that contribute to this
     * Position.
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
     * Profit/loss realized by the Position since the Account's resettablePL
     * was last reset by the client.
     * <p>
     * @param resettablePL the Resettable Profit/Loss
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setResettablePL(double resettablePL) {
        this.resettablePL = new AccountUnits(resettablePL);
        return this;
    }

    /**
     * Get the Resettable Profit/Loss
     * <p>
     * Profit/loss realized by the Position since the Account's resettablePL
     * was last reset by the client.
     * <p>
     * @return the Resettable Profit/Loss
     * @see AccountUnits
     */
    public double getResettablePL() {
        return this.resettablePL.getAccountUnits();
    }

    @SerializedName("long") private PositionSide longValue;

    /**
     * Set the Long Side
     * <p>
     * The details of the long side of the Position.
     * <p>
     * @param longValue the Long Side
     * @return {@link Position Position}
     * @see PositionSide
     */
    public Position setLong(PositionSide longValue) {
        this.longValue = longValue;
        return this;
    }

    /**
     * Get the Long Side
     * <p>
     * The details of the long side of the Position.
     * <p>
     * @return the Long Side
     * @see PositionSide
     */
    public PositionSide getLong() {
        return this.longValue;
    }

    @SerializedName("short") private PositionSide shortValue;

    /**
     * Set the Short Side
     * <p>
     * The details of the short side of the Position.
     * <p>
     * @param shortValue the Short Side
     * @return {@link Position Position}
     * @see PositionSide
     */
    public Position setShort(PositionSide shortValue) {
        this.shortValue = shortValue;
        return this;
    }

    /**
     * Get the Short Side
     * <p>
     * The details of the short side of the Position.
     * <p>
     * @return the Short Side
     * @see PositionSide
     */
    public PositionSide getShort() {
        return this.shortValue;
    }
}
