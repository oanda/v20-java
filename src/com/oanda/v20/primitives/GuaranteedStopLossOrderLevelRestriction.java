package com.oanda.v20.primitives;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

/**
 * A GuaranteedStopLossOrderLevelRestriction represents the total position size
 * that can exist within a given price window for Trades with guaranteed Stop
 * Loss Orders attached for a specific Instrument.
 */
public class GuaranteedStopLossOrderLevelRestriction {

    /**
     * Default constructor.
     */
    public GuaranteedStopLossOrderLevelRestriction() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the GuaranteedStopLossOrderLevelRestriction to copy
     */
    public GuaranteedStopLossOrderLevelRestriction(GuaranteedStopLossOrderLevelRestriction other) {
        this.volume = other.volume;
        this.priceRange = other.priceRange;
    }

    @SerializedName("volume") private DecimalNumber volume;

    /**
     * Get the volume
     * <p>
     * Applies to Trades with a guaranteed Stop Loss Order attached for the
     * specified Instrument. This is the total allowed Trade volume that can
     * exist within the priceRange based on the trigger prices of the
     * guaranteed Stop Loss Orders.
     * <p>
     * @return the volume
     * @see DecimalNumber
     */
    public DecimalNumber getVolume() {
        return this.volume;
    }

    /**
     * Set the volume
     * <p>
     * Applies to Trades with a guaranteed Stop Loss Order attached for the
     * specified Instrument. This is the total allowed Trade volume that can
     * exist within the priceRange based on the trigger prices of the
     * guaranteed Stop Loss Orders.
     * <p>
     * @param volume the volume as a DecimalNumber
     * @return {@link GuaranteedStopLossOrderLevelRestriction
     * GuaranteedStopLossOrderLevelRestriction}
     * @see DecimalNumber
     */
    public GuaranteedStopLossOrderLevelRestriction setVolume(DecimalNumber volume) {
        this.volume = volume;
        return this;
    }
    /**
     * Set the volume
     * <p>
     * Applies to Trades with a guaranteed Stop Loss Order attached for the
     * specified Instrument. This is the total allowed Trade volume that can
     * exist within the priceRange based on the trigger prices of the
     * guaranteed Stop Loss Orders.
     * <p>
     * @param volume the volume as a String
     * @return {@link GuaranteedStopLossOrderLevelRestriction
     * GuaranteedStopLossOrderLevelRestriction}
     * @see DecimalNumber
     */
    public GuaranteedStopLossOrderLevelRestriction setVolume(String volume) {
        this.volume = new DecimalNumber(volume);
        return this;
    }
    /**
     * Set the volume
     * <p>
     * Applies to Trades with a guaranteed Stop Loss Order attached for the
     * specified Instrument. This is the total allowed Trade volume that can
     * exist within the priceRange based on the trigger prices of the
     * guaranteed Stop Loss Orders.
     * <p>
     * @param volume the volume as a double
     * @return {@link GuaranteedStopLossOrderLevelRestriction
     * GuaranteedStopLossOrderLevelRestriction}
     * @see DecimalNumber
     */
    public GuaranteedStopLossOrderLevelRestriction setVolume(double volume) {
        this.volume = new DecimalNumber(volume);
        return this;
    }
    /**
     * Set the volume
     * <p>
     * Applies to Trades with a guaranteed Stop Loss Order attached for the
     * specified Instrument. This is the total allowed Trade volume that can
     * exist within the priceRange based on the trigger prices of the
     * guaranteed Stop Loss Orders.
     * <p>
     * @param volume the volume as a BigDecimal
     * @return {@link GuaranteedStopLossOrderLevelRestriction
     * GuaranteedStopLossOrderLevelRestriction}
     * @see DecimalNumber
     */
    public GuaranteedStopLossOrderLevelRestriction setVolume(BigDecimal volume) {
        this.volume = new DecimalNumber(volume);
        return this;
    }

    @SerializedName("priceRange") private DecimalNumber priceRange;

    /**
     * Get the priceRange
     * <p>
     * The price range the volume applies to. This value is in price units.
     * <p>
     * @return the priceRange
     * @see DecimalNumber
     */
    public DecimalNumber getPriceRange() {
        return this.priceRange;
    }

    /**
     * Set the priceRange
     * <p>
     * The price range the volume applies to. This value is in price units.
     * <p>
     * @param priceRange the priceRange as a DecimalNumber
     * @return {@link GuaranteedStopLossOrderLevelRestriction
     * GuaranteedStopLossOrderLevelRestriction}
     * @see DecimalNumber
     */
    public GuaranteedStopLossOrderLevelRestriction setPriceRange(DecimalNumber priceRange) {
        this.priceRange = priceRange;
        return this;
    }
    /**
     * Set the priceRange
     * <p>
     * The price range the volume applies to. This value is in price units.
     * <p>
     * @param priceRange the priceRange as a String
     * @return {@link GuaranteedStopLossOrderLevelRestriction
     * GuaranteedStopLossOrderLevelRestriction}
     * @see DecimalNumber
     */
    public GuaranteedStopLossOrderLevelRestriction setPriceRange(String priceRange) {
        this.priceRange = new DecimalNumber(priceRange);
        return this;
    }
    /**
     * Set the priceRange
     * <p>
     * The price range the volume applies to. This value is in price units.
     * <p>
     * @param priceRange the priceRange as a double
     * @return {@link GuaranteedStopLossOrderLevelRestriction
     * GuaranteedStopLossOrderLevelRestriction}
     * @see DecimalNumber
     */
    public GuaranteedStopLossOrderLevelRestriction setPriceRange(double priceRange) {
        this.priceRange = new DecimalNumber(priceRange);
        return this;
    }
    /**
     * Set the priceRange
     * <p>
     * The price range the volume applies to. This value is in price units.
     * <p>
     * @param priceRange the priceRange as a BigDecimal
     * @return {@link GuaranteedStopLossOrderLevelRestriction
     * GuaranteedStopLossOrderLevelRestriction}
     * @see DecimalNumber
     */
    public GuaranteedStopLossOrderLevelRestriction setPriceRange(BigDecimal priceRange) {
        this.priceRange = new DecimalNumber(priceRange);
        return this;
    }

    @Override
    public String toString() {
        return "GuaranteedStopLossOrderLevelRestriction(" +
            "volume=" +
                (volume == null ? "null" : volume.toString()) + ", " +
            "priceRange=" +
                (priceRange == null ? "null" : priceRange.toString()) +
            ")";
    }
}
