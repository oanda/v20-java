package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * A MarketOrderPositionCloseout specifies the extensions to a Market Order
 * when it has been created to closeout a specific Position.
 */
public class MarketOrderPositionCloseout {

    @SerializedName("instrument") private InstrumentName instrument;

    /**
     * Set the Instrument
     * <p>
     * The instrument of the Position being closed out.
     * <p>
     * @param instrument the Instrument
     * @return {@link MarketOrderPositionCloseout MarketOrderPositionCloseout}
     * @see InstrumentName
     */
    public MarketOrderPositionCloseout setInstrument(String instrument) {
        this.instrument = new InstrumentName(instrument);
        return this;
    }

    /**
     * Get the Instrument
     * <p>
     * The instrument of the Position being closed out.
     * <p>
     * @return the Instrument
     * @see InstrumentName
     */
    public String getInstrument() {
        return this.instrument.getInstrumentName();
    }

    @SerializedName("units") private String units;

    /**
     * Set the Amount
     * <p>
     * Indication of how much of the Position to close. Either "ALL", or a
     * DecimalNumber reflection a partial close of the Trade. The DecimalNumber
     * must always be positive, and represent a number that doesn't exceed the
     * absolute size of the Position.
     * <p>
     * @param units the Amount
     * @return {@link MarketOrderPositionCloseout MarketOrderPositionCloseout}
     */
    public MarketOrderPositionCloseout setUnits(String units) {
        this.units = units;
        return this;
    }

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
}
