package com.oanda.v20.position;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.primitives.AccountUnits;
import com.oanda.v20.primitives.InstrumentName;

/**
 * The specification of a Position within an Account.
 * <p>
 * {instrument}, {pl} PL {unrealizedPL} UPL
 */
public class Position {

    /**
     * Default constructor.
     */
    public Position() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the Position to copy
     */
    public Position(Position other) {
        this.instrument = other.instrument;
        this.pl = other.pl;
        this.unrealizedPL = other.unrealizedPL;
        this.resettablePL = other.resettablePL;
        this.commission = other.commission;
        if (other.longValue != null)
        {
            this.longValue = new PositionSide(other.longValue);
        }
        if (other.shortValue != null)
        {
            this.shortValue = new PositionSide(other.shortValue);
        }
    }

    @SerializedName("instrument") private InstrumentName instrument;

    /**
     * Get the Instrument
     * <p>
     * The Position's Instrument.
     * <p>
     * @return the Instrument
     * @see InstrumentName
     */
    public InstrumentName getInstrument() {
        return this.instrument;
    }

    /**
     * Set the Instrument
     * <p>
     * The Position's Instrument.
     * <p>
     * @param instrument the Instrument as an InstrumentName
     * @return {@link Position Position}
     * @see InstrumentName
     */
    public Position setInstrument(InstrumentName instrument) {
        this.instrument = instrument;
        return this;
    }
    /**
     * Set the Instrument
     * <p>
     * The Position's Instrument.
     * <p>
     * @param instrument the Instrument as a String
     * @return {@link Position Position}
     * @see InstrumentName
     */
    public Position setInstrument(String instrument) {
        this.instrument = new InstrumentName(instrument);
        return this;
    }

    @SerializedName("pl") private AccountUnits pl;

    /**
     * Get the Profit/Loss
     * <p>
     * Profit/loss realized by the Position over the lifetime of the Account.
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
     * Profit/loss realized by the Position over the lifetime of the Account.
     * <p>
     * @param pl the Profit/Loss as an AccountUnits
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setPl(AccountUnits pl) {
        this.pl = pl;
        return this;
    }
    /**
     * Set the Profit/Loss
     * <p>
     * Profit/loss realized by the Position over the lifetime of the Account.
     * <p>
     * @param pl the Profit/Loss as a String
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setPl(String pl) {
        this.pl = new AccountUnits(pl);
        return this;
    }
    /**
     * Set the Profit/Loss
     * <p>
     * Profit/loss realized by the Position over the lifetime of the Account.
     * <p>
     * @param pl the Profit/Loss as a double
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setPl(double pl) {
        this.pl = new AccountUnits(pl);
        return this;
    }
    /**
     * Set the Profit/Loss
     * <p>
     * Profit/loss realized by the Position over the lifetime of the Account.
     * <p>
     * @param pl the Profit/Loss as a BigDecimal
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setPl(BigDecimal pl) {
        this.pl = new AccountUnits(pl);
        return this;
    }

    @SerializedName("unrealizedPL") private AccountUnits unrealizedPL;

    /**
     * Get the Unrealized Profit/Loss
     * <p>
     * The unrealized profit/loss of all open Trades that contribute to this
     * Position.
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
     * Position.
     * <p>
     * @param unrealizedPL the Unrealized Profit/Loss as an AccountUnits
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setUnrealizedPL(AccountUnits unrealizedPL) {
        this.unrealizedPL = unrealizedPL;
        return this;
    }
    /**
     * Set the Unrealized Profit/Loss
     * <p>
     * The unrealized profit/loss of all open Trades that contribute to this
     * Position.
     * <p>
     * @param unrealizedPL the Unrealized Profit/Loss as a String
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setUnrealizedPL(String unrealizedPL) {
        this.unrealizedPL = new AccountUnits(unrealizedPL);
        return this;
    }
    /**
     * Set the Unrealized Profit/Loss
     * <p>
     * The unrealized profit/loss of all open Trades that contribute to this
     * Position.
     * <p>
     * @param unrealizedPL the Unrealized Profit/Loss as a double
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setUnrealizedPL(double unrealizedPL) {
        this.unrealizedPL = new AccountUnits(unrealizedPL);
        return this;
    }
    /**
     * Set the Unrealized Profit/Loss
     * <p>
     * The unrealized profit/loss of all open Trades that contribute to this
     * Position.
     * <p>
     * @param unrealizedPL the Unrealized Profit/Loss as a BigDecimal
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setUnrealizedPL(BigDecimal unrealizedPL) {
        this.unrealizedPL = new AccountUnits(unrealizedPL);
        return this;
    }

    @SerializedName("resettablePL") private AccountUnits resettablePL;

    /**
     * Get the Resettable Profit/Loss
     * <p>
     * Profit/loss realized by the Position since the Account's resettablePL
     * was last reset by the client.
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
     * Profit/loss realized by the Position since the Account's resettablePL
     * was last reset by the client.
     * <p>
     * @param resettablePL the Resettable Profit/Loss as an AccountUnits
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setResettablePL(AccountUnits resettablePL) {
        this.resettablePL = resettablePL;
        return this;
    }
    /**
     * Set the Resettable Profit/Loss
     * <p>
     * Profit/loss realized by the Position since the Account's resettablePL
     * was last reset by the client.
     * <p>
     * @param resettablePL the Resettable Profit/Loss as a String
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setResettablePL(String resettablePL) {
        this.resettablePL = new AccountUnits(resettablePL);
        return this;
    }
    /**
     * Set the Resettable Profit/Loss
     * <p>
     * Profit/loss realized by the Position since the Account's resettablePL
     * was last reset by the client.
     * <p>
     * @param resettablePL the Resettable Profit/Loss as a double
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setResettablePL(double resettablePL) {
        this.resettablePL = new AccountUnits(resettablePL);
        return this;
    }
    /**
     * Set the Resettable Profit/Loss
     * <p>
     * Profit/loss realized by the Position since the Account's resettablePL
     * was last reset by the client.
     * <p>
     * @param resettablePL the Resettable Profit/Loss as a BigDecimal
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setResettablePL(BigDecimal resettablePL) {
        this.resettablePL = new AccountUnits(resettablePL);
        return this;
    }

    @SerializedName("commission") private AccountUnits commission;

    /**
     * Get the Commission
     * <p>
     * The total amount of commission paid for this instrument over the
     * lifetime of the Account. Represented in the Account's home currency.
     * <p>
     * @return the Commission
     * @see AccountUnits
     */
    public AccountUnits getCommission() {
        return this.commission;
    }

    /**
     * Set the Commission
     * <p>
     * The total amount of commission paid for this instrument over the
     * lifetime of the Account. Represented in the Account's home currency.
     * <p>
     * @param commission the Commission as an AccountUnits
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setCommission(AccountUnits commission) {
        this.commission = commission;
        return this;
    }
    /**
     * Set the Commission
     * <p>
     * The total amount of commission paid for this instrument over the
     * lifetime of the Account. Represented in the Account's home currency.
     * <p>
     * @param commission the Commission as a String
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setCommission(String commission) {
        this.commission = new AccountUnits(commission);
        return this;
    }
    /**
     * Set the Commission
     * <p>
     * The total amount of commission paid for this instrument over the
     * lifetime of the Account. Represented in the Account's home currency.
     * <p>
     * @param commission the Commission as a double
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setCommission(double commission) {
        this.commission = new AccountUnits(commission);
        return this;
    }
    /**
     * Set the Commission
     * <p>
     * The total amount of commission paid for this instrument over the
     * lifetime of the Account. Represented in the Account's home currency.
     * <p>
     * @param commission the Commission as a BigDecimal
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setCommission(BigDecimal commission) {
        this.commission = new AccountUnits(commission);
        return this;
    }

    @SerializedName("long") private PositionSide longValue;

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

    /**
     * Set the Long Side
     * <p>
     * The details of the long side of the Position.
     * <p>
     * @param longValue the Long Side as a PositionSide
     * @return {@link Position Position}
     * @see PositionSide
     */
    public Position setLong(PositionSide longValue) {
        this.longValue = longValue;
        return this;
    }

    @SerializedName("short") private PositionSide shortValue;

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

    /**
     * Set the Short Side
     * <p>
     * The details of the short side of the Position.
     * <p>
     * @param shortValue the Short Side as a PositionSide
     * @return {@link Position Position}
     * @see PositionSide
     */
    public Position setShort(PositionSide shortValue) {
        this.shortValue = shortValue;
        return this;
    }

    @Override
    public String toString() {
        return "Position(" +
            "instrument=" +
                (instrument == null ? "null" : instrument.toString()) + ", " +
            "pl=" +
                (pl == null ? "null" : pl.toString()) + ", " +
            "unrealizedPL=" +
                (unrealizedPL == null ? "null" : unrealizedPL.toString()) + ", " +
            "resettablePL=" +
                (resettablePL == null ? "null" : resettablePL.toString()) + ", " +
            "commission=" +
                (commission == null ? "null" : commission.toString()) + ", " +
            "long=" +
                (longValue == null ? "null" : longValue.toString()) + ", " +
            "short=" +
                (shortValue == null ? "null" : shortValue.toString()) +
            ")";
    }
}
