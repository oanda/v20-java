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
        this.marginUsed = other.marginUsed;
        this.resettablePL = other.resettablePL;
        this.financing = other.financing;
        this.commission = other.commission;
        this.guaranteedExecutionFees = other.guaranteedExecutionFees;
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

    @SerializedName("marginUsed") private AccountUnits marginUsed;

    /**
     * Get the Margin Used
     * <p>
     * Margin currently used by the Position.
     * <p>
     * @return the Margin Used
     * @see AccountUnits
     */
    public AccountUnits getMarginUsed() {
        return this.marginUsed;
    }

    /**
     * Set the Margin Used
     * <p>
     * Margin currently used by the Position.
     * <p>
     * @param marginUsed the Margin Used as an AccountUnits
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setMarginUsed(AccountUnits marginUsed) {
        this.marginUsed = marginUsed;
        return this;
    }
    /**
     * Set the Margin Used
     * <p>
     * Margin currently used by the Position.
     * <p>
     * @param marginUsed the Margin Used as a String
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setMarginUsed(String marginUsed) {
        this.marginUsed = new AccountUnits(marginUsed);
        return this;
    }
    /**
     * Set the Margin Used
     * <p>
     * Margin currently used by the Position.
     * <p>
     * @param marginUsed the Margin Used as a double
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setMarginUsed(double marginUsed) {
        this.marginUsed = new AccountUnits(marginUsed);
        return this;
    }
    /**
     * Set the Margin Used
     * <p>
     * Margin currently used by the Position.
     * <p>
     * @param marginUsed the Margin Used as a BigDecimal
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setMarginUsed(BigDecimal marginUsed) {
        this.marginUsed = new AccountUnits(marginUsed);
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

    @SerializedName("financing") private AccountUnits financing;

    /**
     * Get the Financing
     * <p>
     * The total amount of financing paid/collected for this instrument over
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
     * The total amount of financing paid/collected for this instrument over
     * the lifetime of the Account.
     * <p>
     * @param financing the Financing as an AccountUnits
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setFinancing(AccountUnits financing) {
        this.financing = financing;
        return this;
    }
    /**
     * Set the Financing
     * <p>
     * The total amount of financing paid/collected for this instrument over
     * the lifetime of the Account.
     * <p>
     * @param financing the Financing as a String
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setFinancing(String financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }
    /**
     * Set the Financing
     * <p>
     * The total amount of financing paid/collected for this instrument over
     * the lifetime of the Account.
     * <p>
     * @param financing the Financing as a double
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setFinancing(double financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }
    /**
     * Set the Financing
     * <p>
     * The total amount of financing paid/collected for this instrument over
     * the lifetime of the Account.
     * <p>
     * @param financing the Financing as a BigDecimal
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setFinancing(BigDecimal financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }

    @SerializedName("commission") private AccountUnits commission;

    /**
     * Get the Commission
     * <p>
     * The total amount of commission paid for this instrument over the
     * lifetime of the Account.
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
     * lifetime of the Account.
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
     * lifetime of the Account.
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
     * lifetime of the Account.
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
     * lifetime of the Account.
     * <p>
     * @param commission the Commission as a BigDecimal
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setCommission(BigDecimal commission) {
        this.commission = new AccountUnits(commission);
        return this;
    }

    @SerializedName("guaranteedExecutionFees") private AccountUnits guaranteedExecutionFees;

    /**
     * Get the Guranteed Execution Fee
     * <p>
     * The total amount of fees charged over the lifetime of the Account for
     * the execution of guaranteed Stop Loss Orders for this instrument.
     * <p>
     * @return the Guranteed Execution Fee
     * @see AccountUnits
     */
    public AccountUnits getGuaranteedExecutionFees() {
        return this.guaranteedExecutionFees;
    }

    /**
     * Set the Guranteed Execution Fee
     * <p>
     * The total amount of fees charged over the lifetime of the Account for
     * the execution of guaranteed Stop Loss Orders for this instrument.
     * <p>
     * @param guaranteedExecutionFees the Guranteed Execution Fee as an
     * AccountUnits
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setGuaranteedExecutionFees(AccountUnits guaranteedExecutionFees) {
        this.guaranteedExecutionFees = guaranteedExecutionFees;
        return this;
    }
    /**
     * Set the Guranteed Execution Fee
     * <p>
     * The total amount of fees charged over the lifetime of the Account for
     * the execution of guaranteed Stop Loss Orders for this instrument.
     * <p>
     * @param guaranteedExecutionFees the Guranteed Execution Fee as a String
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setGuaranteedExecutionFees(String guaranteedExecutionFees) {
        this.guaranteedExecutionFees = new AccountUnits(guaranteedExecutionFees);
        return this;
    }
    /**
     * Set the Guranteed Execution Fee
     * <p>
     * The total amount of fees charged over the lifetime of the Account for
     * the execution of guaranteed Stop Loss Orders for this instrument.
     * <p>
     * @param guaranteedExecutionFees the Guranteed Execution Fee as a double
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setGuaranteedExecutionFees(double guaranteedExecutionFees) {
        this.guaranteedExecutionFees = new AccountUnits(guaranteedExecutionFees);
        return this;
    }
    /**
     * Set the Guranteed Execution Fee
     * <p>
     * The total amount of fees charged over the lifetime of the Account for
     * the execution of guaranteed Stop Loss Orders for this instrument.
     * <p>
     * @param guaranteedExecutionFees the Guranteed Execution Fee as a
     * BigDecimal
     * @return {@link Position Position}
     * @see AccountUnits
     */
    public Position setGuaranteedExecutionFees(BigDecimal guaranteedExecutionFees) {
        this.guaranteedExecutionFees = new AccountUnits(guaranteedExecutionFees);
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
            "marginUsed=" +
                (marginUsed == null ? "null" : marginUsed.toString()) + ", " +
            "resettablePL=" +
                (resettablePL == null ? "null" : resettablePL.toString()) + ", " +
            "financing=" +
                (financing == null ? "null" : financing.toString()) + ", " +
            "commission=" +
                (commission == null ? "null" : commission.toString()) + ", " +
            "guaranteedExecutionFees=" +
                (guaranteedExecutionFees == null ? "null" : guaranteedExecutionFees.toString()) + ", " +
            "long=" +
                (longValue == null ? "null" : longValue.toString()) + ", " +
            "short=" +
                (shortValue == null ? "null" : shortValue.toString()) +
            ")";
    }
}
