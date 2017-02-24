package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * The dynamic (calculated) state of a Position
 */
public class CalculatedPositionState {

    @SerializedName("instrument") private InstrumentName instrument;

    /**
     * Set the Instrument
     * <p>
     * The Position's Instrument.
     * <p>
     * @param instrument the Instrument
     * @return {@link CalculatedPositionState CalculatedPositionState}
     * @see InstrumentName
     */
    public CalculatedPositionState setInstrument(String instrument) {
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

    @SerializedName("netUnrealizedPL") private AccountUnits netUnrealizedPL;

    /**
     * Set the Net Unrealized Profit/Loss
     * <p>
     * The Position's net unrealized profit/loss
     * <p>
     * @param netUnrealizedPL the Net Unrealized Profit/Loss
     * @return {@link CalculatedPositionState CalculatedPositionState}
     * @see AccountUnits
     */
    public CalculatedPositionState setNetUnrealizedPL(double netUnrealizedPL) {
        this.netUnrealizedPL = new AccountUnits(netUnrealizedPL);
        return this;
    }

    /**
     * Get the Net Unrealized Profit/Loss
     * <p>
     * The Position's net unrealized profit/loss
     * <p>
     * @return the Net Unrealized Profit/Loss
     * @see AccountUnits
     */
    public double getNetUnrealizedPL() {
        return this.netUnrealizedPL.getAccountUnits();
    }

    @SerializedName("longUnrealizedPL") private AccountUnits longUnrealizedPL;

    /**
     * Set the Long Unrealized Profit/Loss
     * <p>
     * The unrealized profit/loss of the Position's long open Trades
     * <p>
     * @param longUnrealizedPL the Long Unrealized Profit/Loss
     * @return {@link CalculatedPositionState CalculatedPositionState}
     * @see AccountUnits
     */
    public CalculatedPositionState setLongUnrealizedPL(double longUnrealizedPL) {
        this.longUnrealizedPL = new AccountUnits(longUnrealizedPL);
        return this;
    }

    /**
     * Get the Long Unrealized Profit/Loss
     * <p>
     * The unrealized profit/loss of the Position's long open Trades
     * <p>
     * @return the Long Unrealized Profit/Loss
     * @see AccountUnits
     */
    public double getLongUnrealizedPL() {
        return this.longUnrealizedPL.getAccountUnits();
    }

    @SerializedName("shortUnrealizedPL") private AccountUnits shortUnrealizedPL;

    /**
     * Set the Short Unrealized Profit/Loss
     * <p>
     * The unrealized profit/loss of the Position's short open Trades
     * <p>
     * @param shortUnrealizedPL the Short Unrealized Profit/Loss
     * @return {@link CalculatedPositionState CalculatedPositionState}
     * @see AccountUnits
     */
    public CalculatedPositionState setShortUnrealizedPL(double shortUnrealizedPL) {
        this.shortUnrealizedPL = new AccountUnits(shortUnrealizedPL);
        return this;
    }

    /**
     * Get the Short Unrealized Profit/Loss
     * <p>
     * The unrealized profit/loss of the Position's short open Trades
     * <p>
     * @return the Short Unrealized Profit/Loss
     * @see AccountUnits
     */
    public double getShortUnrealizedPL() {
        return this.shortUnrealizedPL.getAccountUnits();
    }
}
