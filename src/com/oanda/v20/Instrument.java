package com.oanda.v20;

import com.oanda.v20.InstrumentType;
import com.google.gson.annotations.SerializedName;

/**
 * Full specification of an Instrument.
 */
public class Instrument {

    @SerializedName("name") private InstrumentName name;

    /**
     * Set the name
     * <p>
     * The name of the Instrument
     * <p>
     * @param name the name
     * @return {@link Instrument Instrument}
     * @see InstrumentName
     */
    public Instrument setName(String name) {
        this.name = new InstrumentName(name);
        return this;
    }

    /**
     * Get the name
     * <p>
     * The name of the Instrument
     * <p>
     * @return the name
     * @see InstrumentName
     */
    public String getName() {
        return this.name.getInstrumentName();
    }

    @SerializedName("type") private InstrumentType type;

    /**
     * Get the type
     * <p>
     * The type of the Instrument
     * <p>
     * @return the type
     * @see InstrumentType
     */
    public InstrumentType getType() {
        return this.type;
    }

    @SerializedName("displayName") private String displayName;

    /**
     * Set the displayName
     * <p>
     * The display name of the Instrument
     * <p>
     * @param displayName the displayName
     * @return {@link Instrument Instrument}
     */
    public Instrument setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the displayName
     * <p>
     * The display name of the Instrument
     * <p>
     * @return the displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    @SerializedName("pipLocation") private Integer pipLocation;

    /**
     * Set the pipLocation
     * <p>
     * The location of the "pip" for this instrument. The decimal position of
     * the pip in this Instrument's price can be found at 10 ^ pipLocation
     * (e.g. -4 pipLocation results in a decimal pip position of 10 ^ -4 =
     * 0.0001).
     * <p>
     * @param pipLocation the pipLocation
     * @return {@link Instrument Instrument}
     */
    public Instrument setPipLocation(int pipLocation) {
        this.pipLocation = pipLocation;
        return this;
    }

    /**
     * Get the pipLocation
     * <p>
     * The location of the "pip" for this instrument. The decimal position of
     * the pip in this Instrument's price can be found at 10 ^ pipLocation
     * (e.g. -4 pipLocation results in a decimal pip position of 10 ^ -4 =
     * 0.0001).
     * <p>
     * @return the pipLocation
     */
    public int getPipLocation() {
        return this.pipLocation;
    }

    @SerializedName("displayPrecision") private Integer displayPrecision;

    /**
     * Set the displayPrecision
     * <p>
     * The number of decimal places that should be used to display prices for
     * this instrument. (e.g. a displayPrecision of 5 would result in a price
     * of "1" being displayed as "1.00000")
     * <p>
     * @param displayPrecision the displayPrecision
     * @return {@link Instrument Instrument}
     */
    public Instrument setDisplayPrecision(int displayPrecision) {
        this.displayPrecision = displayPrecision;
        return this;
    }

    /**
     * Get the displayPrecision
     * <p>
     * The number of decimal places that should be used to display prices for
     * this instrument. (e.g. a displayPrecision of 5 would result in a price
     * of "1" being displayed as "1.00000")
     * <p>
     * @return the displayPrecision
     */
    public int getDisplayPrecision() {
        return this.displayPrecision;
    }

    @SerializedName("tradeUnitsPrecision") private Integer tradeUnitsPrecision;

    /**
     * Set the tradeUnitsPrecision
     * <p>
     * The amount of decimal places that may be provided when specifying the
     * number of units traded for this instrument.
     * <p>
     * @param tradeUnitsPrecision the tradeUnitsPrecision
     * @return {@link Instrument Instrument}
     */
    public Instrument setTradeUnitsPrecision(int tradeUnitsPrecision) {
        this.tradeUnitsPrecision = tradeUnitsPrecision;
        return this;
    }

    /**
     * Get the tradeUnitsPrecision
     * <p>
     * The amount of decimal places that may be provided when specifying the
     * number of units traded for this instrument.
     * <p>
     * @return the tradeUnitsPrecision
     */
    public int getTradeUnitsPrecision() {
        return this.tradeUnitsPrecision;
    }

    @SerializedName("minimumTradeSize") private DecimalNumber minimumTradeSize;

    /**
     * Set the minimumTradeSize
     * <p>
     * The smallest number of units allowed to be traded for this instrument.
     * <p>
     * @param minimumTradeSize the minimumTradeSize
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMinimumTradeSize(double minimumTradeSize) {
        this.minimumTradeSize = new DecimalNumber(minimumTradeSize);
        return this;
    }

    /**
     * Get the minimumTradeSize
     * <p>
     * The smallest number of units allowed to be traded for this instrument.
     * <p>
     * @return the minimumTradeSize
     * @see DecimalNumber
     */
    public double getMinimumTradeSize() {
        return this.minimumTradeSize.getDecimalNumber();
    }

    @SerializedName("maximumTrailingStopDistance") private DecimalNumber maximumTrailingStopDistance;

    /**
     * Set the maximumTrailingStopDistance
     * <p>
     * The maximum trailing stop distance allowed for a trailing stop loss
     * created for this instrument. Specified in price units.
     * <p>
     * @param maximumTrailingStopDistance the maximumTrailingStopDistance
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMaximumTrailingStopDistance(double maximumTrailingStopDistance) {
        this.maximumTrailingStopDistance = new DecimalNumber(maximumTrailingStopDistance);
        return this;
    }

    /**
     * Get the maximumTrailingStopDistance
     * <p>
     * The maximum trailing stop distance allowed for a trailing stop loss
     * created for this instrument. Specified in price units.
     * <p>
     * @return the maximumTrailingStopDistance
     * @see DecimalNumber
     */
    public double getMaximumTrailingStopDistance() {
        return this.maximumTrailingStopDistance.getDecimalNumber();
    }

    @SerializedName("minimumTrailingStopDistance") private DecimalNumber minimumTrailingStopDistance;

    /**
     * Set the minimumTrailingStopDistance
     * <p>
     * The minimum trailing stop distance allowed for a trailing stop loss
     * created for this instrument. Specified in price units.
     * <p>
     * @param minimumTrailingStopDistance the minimumTrailingStopDistance
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMinimumTrailingStopDistance(double minimumTrailingStopDistance) {
        this.minimumTrailingStopDistance = new DecimalNumber(minimumTrailingStopDistance);
        return this;
    }

    /**
     * Get the minimumTrailingStopDistance
     * <p>
     * The minimum trailing stop distance allowed for a trailing stop loss
     * created for this instrument. Specified in price units.
     * <p>
     * @return the minimumTrailingStopDistance
     * @see DecimalNumber
     */
    public double getMinimumTrailingStopDistance() {
        return this.minimumTrailingStopDistance.getDecimalNumber();
    }

    @SerializedName("maximumPositionSize") private DecimalNumber maximumPositionSize;

    /**
     * Set the maximumPositionSize
     * <p>
     * The maximum position size allowed for this instrument. Specified in
     * units.
     * <p>
     * @param maximumPositionSize the maximumPositionSize
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMaximumPositionSize(double maximumPositionSize) {
        this.maximumPositionSize = new DecimalNumber(maximumPositionSize);
        return this;
    }

    /**
     * Get the maximumPositionSize
     * <p>
     * The maximum position size allowed for this instrument. Specified in
     * units.
     * <p>
     * @return the maximumPositionSize
     * @see DecimalNumber
     */
    public double getMaximumPositionSize() {
        return this.maximumPositionSize.getDecimalNumber();
    }

    @SerializedName("maximumOrderUnits") private DecimalNumber maximumOrderUnits;

    /**
     * Set the maximumOrderUnits
     * <p>
     * The maximum units allowed for an Order placed for this instrument.
     * Specified in units.
     * <p>
     * @param maximumOrderUnits the maximumOrderUnits
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMaximumOrderUnits(double maximumOrderUnits) {
        this.maximumOrderUnits = new DecimalNumber(maximumOrderUnits);
        return this;
    }

    /**
     * Get the maximumOrderUnits
     * <p>
     * The maximum units allowed for an Order placed for this instrument.
     * Specified in units.
     * <p>
     * @return the maximumOrderUnits
     * @see DecimalNumber
     */
    public double getMaximumOrderUnits() {
        return this.maximumOrderUnits.getDecimalNumber();
    }

    @SerializedName("marginRate") private DecimalNumber marginRate;

    /**
     * Set the marginRate
     * <p>
     * The margin rate for this instrument.
     * <p>
     * @param marginRate the marginRate
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMarginRate(double marginRate) {
        this.marginRate = new DecimalNumber(marginRate);
        return this;
    }

    /**
     * Get the marginRate
     * <p>
     * The margin rate for this instrument.
     * <p>
     * @return the marginRate
     * @see DecimalNumber
     */
    public double getMarginRate() {
        return this.marginRate.getDecimalNumber();
    }
}
