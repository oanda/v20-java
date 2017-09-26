package com.oanda.v20.transaction;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.primitives.InstrumentName;

/**
 * A MarketOrderPositionCloseout specifies the extensions to a Market Order
 * when it has been created to closeout a specific Position.
 */
public class MarketOrderPositionCloseout {

    /**
     * Default constructor.
     */
    public MarketOrderPositionCloseout() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the MarketOrderPositionCloseout to copy
     */
    public MarketOrderPositionCloseout(MarketOrderPositionCloseout other) {
        this.instrument = other.instrument;
        this.units = other.units;
    }

    @SerializedName("instrument") private InstrumentName instrument;

    /**
     * Get the Instrument
     * <p>
     * The instrument of the Position being closed out.
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
     * The instrument of the Position being closed out.
     * <p>
     * @param instrument the Instrument as an InstrumentName
     * @return {@link MarketOrderPositionCloseout MarketOrderPositionCloseout}
     * @see InstrumentName
     */
    public MarketOrderPositionCloseout setInstrument(InstrumentName instrument) {
        this.instrument = instrument;
        return this;
    }
    /**
     * Set the Instrument
     * <p>
     * The instrument of the Position being closed out.
     * <p>
     * @param instrument the Instrument as a String
     * @return {@link MarketOrderPositionCloseout MarketOrderPositionCloseout}
     * @see InstrumentName
     */
    public MarketOrderPositionCloseout setInstrument(String instrument) {
        this.instrument = new InstrumentName(instrument);
        return this;
    }

    @SerializedName("units") private String units;

    /**
     * Get the Amount
     * <p>
     * Indication of how much of the Position to close. Either "ALL", or a
     * DecimalNumber reflection a partial close of the Trade. The DecimalNumber
     * must always be positive, and represent a number that doesn't exceed the
     * absolute size of the Position.
     * <p>
     * @return the Amount
     */
    public String getUnits() {
        return this.units;
    }

    /**
     * Set the Amount
     * <p>
     * Indication of how much of the Position to close. Either "ALL", or a
     * DecimalNumber reflection a partial close of the Trade. The DecimalNumber
     * must always be positive, and represent a number that doesn't exceed the
     * absolute size of the Position.
     * <p>
     * @param units the Amount as a String
     * @return {@link MarketOrderPositionCloseout MarketOrderPositionCloseout}
     */
    public MarketOrderPositionCloseout setUnits(String units) {
        this.units = units;
        return this;
    }

    @Override
    public String toString() {
        return "MarketOrderPositionCloseout(" +
            "instrument=" +
                (instrument == null ? "null" : instrument.toString()) + ", " +
            "units=" +
                (units == null ? "null" : units.toString()) +
            ")";
    }
}
