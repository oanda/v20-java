package com.oanda.v20.primitives;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

/**
 * Full specification of an Instrument.
 */
public class Instrument {

    /**
     * Default constructor.
     */
    public Instrument() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the Instrument to copy
     */
    public Instrument(Instrument other) {
        this.name = other.name;
        this.type = other.type;
        this.displayName = other.displayName;
        if (other.pipLocation != null)
        {
            this.pipLocation = new Long(other.pipLocation);
        }
        if (other.displayPrecision != null)
        {
            this.displayPrecision = new Long(other.displayPrecision);
        }
        if (other.tradeUnitsPrecision != null)
        {
            this.tradeUnitsPrecision = new Long(other.tradeUnitsPrecision);
        }
        this.minimumTradeSize = other.minimumTradeSize;
        this.maximumTrailingStopDistance = other.maximumTrailingStopDistance;
        this.minimumTrailingStopDistance = other.minimumTrailingStopDistance;
        this.maximumPositionSize = other.maximumPositionSize;
        this.maximumOrderUnits = other.maximumOrderUnits;
        this.marginRate = other.marginRate;
        if (other.commission != null)
        {
            this.commission = new InstrumentCommission(other.commission);
        }
    }

    @SerializedName("name") private InstrumentName name;

    /**
     * Get the name
     * <p>
     * The name of the Instrument
     * <p>
     * @return the name
     * @see InstrumentName
     */
    public InstrumentName getName() {
        return this.name;
    }

    /**
     * Set the name
     * <p>
     * The name of the Instrument
     * <p>
     * @param name the name as an InstrumentName
     * @return {@link Instrument Instrument}
     * @see InstrumentName
     */
    public Instrument setName(InstrumentName name) {
        this.name = name;
        return this;
    }
    /**
     * Set the name
     * <p>
     * The name of the Instrument
     * <p>
     * @param name the name as a String
     * @return {@link Instrument Instrument}
     * @see InstrumentName
     */
    public Instrument setName(String name) {
        this.name = new InstrumentName(name);
        return this;
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

    /**
     * Set the type
     * <p>
     * The type of the Instrument
     * <p>
     * @param type the type as an InstrumentType
     * @return {@link Instrument Instrument}
     * @see InstrumentType
     */
    public Instrument setType(InstrumentType type) {
        this.type = type;
        return this;
    }

    @SerializedName("displayName") private String displayName;

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

    /**
     * Set the displayName
     * <p>
     * The display name of the Instrument
     * <p>
     * @param displayName the displayName as a String
     * @return {@link Instrument Instrument}
     */
    public Instrument setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    @SerializedName("pipLocation") private Long pipLocation;

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
    public Long getPipLocation() {
        return this.pipLocation;
    }

    /**
     * Set the pipLocation
     * <p>
     * The location of the "pip" for this instrument. The decimal position of
     * the pip in this Instrument's price can be found at 10 ^ pipLocation
     * (e.g. -4 pipLocation results in a decimal pip position of 10 ^ -4 =
     * 0.0001).
     * <p>
     * @param pipLocation the pipLocation as a Long
     * @return {@link Instrument Instrument}
     */
    public Instrument setPipLocation(Long pipLocation) {
        this.pipLocation = pipLocation;
        return this;
    }

    @SerializedName("displayPrecision") private Long displayPrecision;

    /**
     * Get the displayPrecision
     * <p>
     * The number of decimal places that should be used to display prices for
     * this instrument. (e.g. a displayPrecision of 5 would result in a price
     * of "1" being displayed as "1.00000")
     * <p>
     * @return the displayPrecision
     */
    public Long getDisplayPrecision() {
        return this.displayPrecision;
    }

    /**
     * Set the displayPrecision
     * <p>
     * The number of decimal places that should be used to display prices for
     * this instrument. (e.g. a displayPrecision of 5 would result in a price
     * of "1" being displayed as "1.00000")
     * <p>
     * @param displayPrecision the displayPrecision as a Long
     * @return {@link Instrument Instrument}
     */
    public Instrument setDisplayPrecision(Long displayPrecision) {
        this.displayPrecision = displayPrecision;
        return this;
    }

    @SerializedName("tradeUnitsPrecision") private Long tradeUnitsPrecision;

    /**
     * Get the tradeUnitsPrecision
     * <p>
     * The amount of decimal places that may be provided when specifying the
     * number of units traded for this instrument.
     * <p>
     * @return the tradeUnitsPrecision
     */
    public Long getTradeUnitsPrecision() {
        return this.tradeUnitsPrecision;
    }

    /**
     * Set the tradeUnitsPrecision
     * <p>
     * The amount of decimal places that may be provided when specifying the
     * number of units traded for this instrument.
     * <p>
     * @param tradeUnitsPrecision the tradeUnitsPrecision as a Long
     * @return {@link Instrument Instrument}
     */
    public Instrument setTradeUnitsPrecision(Long tradeUnitsPrecision) {
        this.tradeUnitsPrecision = tradeUnitsPrecision;
        return this;
    }

    @SerializedName("minimumTradeSize") private DecimalNumber minimumTradeSize;

    /**
     * Get the minimumTradeSize
     * <p>
     * The smallest number of units allowed to be traded for this instrument.
     * <p>
     * @return the minimumTradeSize
     * @see DecimalNumber
     */
    public DecimalNumber getMinimumTradeSize() {
        return this.minimumTradeSize;
    }

    /**
     * Set the minimumTradeSize
     * <p>
     * The smallest number of units allowed to be traded for this instrument.
     * <p>
     * @param minimumTradeSize the minimumTradeSize as a DecimalNumber
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMinimumTradeSize(DecimalNumber minimumTradeSize) {
        this.minimumTradeSize = minimumTradeSize;
        return this;
    }
    /**
     * Set the minimumTradeSize
     * <p>
     * The smallest number of units allowed to be traded for this instrument.
     * <p>
     * @param minimumTradeSize the minimumTradeSize as a String
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMinimumTradeSize(String minimumTradeSize) {
        this.minimumTradeSize = new DecimalNumber(minimumTradeSize);
        return this;
    }
    /**
     * Set the minimumTradeSize
     * <p>
     * The smallest number of units allowed to be traded for this instrument.
     * <p>
     * @param minimumTradeSize the minimumTradeSize as a double
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMinimumTradeSize(double minimumTradeSize) {
        this.minimumTradeSize = new DecimalNumber(minimumTradeSize);
        return this;
    }
    /**
     * Set the minimumTradeSize
     * <p>
     * The smallest number of units allowed to be traded for this instrument.
     * <p>
     * @param minimumTradeSize the minimumTradeSize as a BigDecimal
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMinimumTradeSize(BigDecimal minimumTradeSize) {
        this.minimumTradeSize = new DecimalNumber(minimumTradeSize);
        return this;
    }

    @SerializedName("maximumTrailingStopDistance") private DecimalNumber maximumTrailingStopDistance;

    /**
     * Get the maximumTrailingStopDistance
     * <p>
     * The maximum trailing stop distance allowed for a trailing stop loss
     * created for this instrument. Specified in price units.
     * <p>
     * @return the maximumTrailingStopDistance
     * @see DecimalNumber
     */
    public DecimalNumber getMaximumTrailingStopDistance() {
        return this.maximumTrailingStopDistance;
    }

    /**
     * Set the maximumTrailingStopDistance
     * <p>
     * The maximum trailing stop distance allowed for a trailing stop loss
     * created for this instrument. Specified in price units.
     * <p>
     * @param maximumTrailingStopDistance the maximumTrailingStopDistance as a
     * DecimalNumber
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMaximumTrailingStopDistance(DecimalNumber maximumTrailingStopDistance) {
        this.maximumTrailingStopDistance = maximumTrailingStopDistance;
        return this;
    }
    /**
     * Set the maximumTrailingStopDistance
     * <p>
     * The maximum trailing stop distance allowed for a trailing stop loss
     * created for this instrument. Specified in price units.
     * <p>
     * @param maximumTrailingStopDistance the maximumTrailingStopDistance as a
     * String
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMaximumTrailingStopDistance(String maximumTrailingStopDistance) {
        this.maximumTrailingStopDistance = new DecimalNumber(maximumTrailingStopDistance);
        return this;
    }
    /**
     * Set the maximumTrailingStopDistance
     * <p>
     * The maximum trailing stop distance allowed for a trailing stop loss
     * created for this instrument. Specified in price units.
     * <p>
     * @param maximumTrailingStopDistance the maximumTrailingStopDistance as a
     * double
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMaximumTrailingStopDistance(double maximumTrailingStopDistance) {
        this.maximumTrailingStopDistance = new DecimalNumber(maximumTrailingStopDistance);
        return this;
    }
    /**
     * Set the maximumTrailingStopDistance
     * <p>
     * The maximum trailing stop distance allowed for a trailing stop loss
     * created for this instrument. Specified in price units.
     * <p>
     * @param maximumTrailingStopDistance the maximumTrailingStopDistance as a
     * BigDecimal
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMaximumTrailingStopDistance(BigDecimal maximumTrailingStopDistance) {
        this.maximumTrailingStopDistance = new DecimalNumber(maximumTrailingStopDistance);
        return this;
    }

    @SerializedName("minimumTrailingStopDistance") private DecimalNumber minimumTrailingStopDistance;

    /**
     * Get the minimumTrailingStopDistance
     * <p>
     * The minimum trailing stop distance allowed for a trailing stop loss
     * created for this instrument. Specified in price units.
     * <p>
     * @return the minimumTrailingStopDistance
     * @see DecimalNumber
     */
    public DecimalNumber getMinimumTrailingStopDistance() {
        return this.minimumTrailingStopDistance;
    }

    /**
     * Set the minimumTrailingStopDistance
     * <p>
     * The minimum trailing stop distance allowed for a trailing stop loss
     * created for this instrument. Specified in price units.
     * <p>
     * @param minimumTrailingStopDistance the minimumTrailingStopDistance as a
     * DecimalNumber
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMinimumTrailingStopDistance(DecimalNumber minimumTrailingStopDistance) {
        this.minimumTrailingStopDistance = minimumTrailingStopDistance;
        return this;
    }
    /**
     * Set the minimumTrailingStopDistance
     * <p>
     * The minimum trailing stop distance allowed for a trailing stop loss
     * created for this instrument. Specified in price units.
     * <p>
     * @param minimumTrailingStopDistance the minimumTrailingStopDistance as a
     * String
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMinimumTrailingStopDistance(String minimumTrailingStopDistance) {
        this.minimumTrailingStopDistance = new DecimalNumber(minimumTrailingStopDistance);
        return this;
    }
    /**
     * Set the minimumTrailingStopDistance
     * <p>
     * The minimum trailing stop distance allowed for a trailing stop loss
     * created for this instrument. Specified in price units.
     * <p>
     * @param minimumTrailingStopDistance the minimumTrailingStopDistance as a
     * double
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMinimumTrailingStopDistance(double minimumTrailingStopDistance) {
        this.minimumTrailingStopDistance = new DecimalNumber(minimumTrailingStopDistance);
        return this;
    }
    /**
     * Set the minimumTrailingStopDistance
     * <p>
     * The minimum trailing stop distance allowed for a trailing stop loss
     * created for this instrument. Specified in price units.
     * <p>
     * @param minimumTrailingStopDistance the minimumTrailingStopDistance as a
     * BigDecimal
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMinimumTrailingStopDistance(BigDecimal minimumTrailingStopDistance) {
        this.minimumTrailingStopDistance = new DecimalNumber(minimumTrailingStopDistance);
        return this;
    }

    @SerializedName("maximumPositionSize") private DecimalNumber maximumPositionSize;

    /**
     * Get the maximumPositionSize
     * <p>
     * The maximum position size allowed for this instrument. Specified in
     * units.
     * <p>
     * @return the maximumPositionSize
     * @see DecimalNumber
     */
    public DecimalNumber getMaximumPositionSize() {
        return this.maximumPositionSize;
    }

    /**
     * Set the maximumPositionSize
     * <p>
     * The maximum position size allowed for this instrument. Specified in
     * units.
     * <p>
     * @param maximumPositionSize the maximumPositionSize as a DecimalNumber
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMaximumPositionSize(DecimalNumber maximumPositionSize) {
        this.maximumPositionSize = maximumPositionSize;
        return this;
    }
    /**
     * Set the maximumPositionSize
     * <p>
     * The maximum position size allowed for this instrument. Specified in
     * units.
     * <p>
     * @param maximumPositionSize the maximumPositionSize as a String
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMaximumPositionSize(String maximumPositionSize) {
        this.maximumPositionSize = new DecimalNumber(maximumPositionSize);
        return this;
    }
    /**
     * Set the maximumPositionSize
     * <p>
     * The maximum position size allowed for this instrument. Specified in
     * units.
     * <p>
     * @param maximumPositionSize the maximumPositionSize as a double
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMaximumPositionSize(double maximumPositionSize) {
        this.maximumPositionSize = new DecimalNumber(maximumPositionSize);
        return this;
    }
    /**
     * Set the maximumPositionSize
     * <p>
     * The maximum position size allowed for this instrument. Specified in
     * units.
     * <p>
     * @param maximumPositionSize the maximumPositionSize as a BigDecimal
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMaximumPositionSize(BigDecimal maximumPositionSize) {
        this.maximumPositionSize = new DecimalNumber(maximumPositionSize);
        return this;
    }

    @SerializedName("maximumOrderUnits") private DecimalNumber maximumOrderUnits;

    /**
     * Get the maximumOrderUnits
     * <p>
     * The maximum units allowed for an Order placed for this instrument.
     * Specified in units.
     * <p>
     * @return the maximumOrderUnits
     * @see DecimalNumber
     */
    public DecimalNumber getMaximumOrderUnits() {
        return this.maximumOrderUnits;
    }

    /**
     * Set the maximumOrderUnits
     * <p>
     * The maximum units allowed for an Order placed for this instrument.
     * Specified in units.
     * <p>
     * @param maximumOrderUnits the maximumOrderUnits as a DecimalNumber
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMaximumOrderUnits(DecimalNumber maximumOrderUnits) {
        this.maximumOrderUnits = maximumOrderUnits;
        return this;
    }
    /**
     * Set the maximumOrderUnits
     * <p>
     * The maximum units allowed for an Order placed for this instrument.
     * Specified in units.
     * <p>
     * @param maximumOrderUnits the maximumOrderUnits as a String
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMaximumOrderUnits(String maximumOrderUnits) {
        this.maximumOrderUnits = new DecimalNumber(maximumOrderUnits);
        return this;
    }
    /**
     * Set the maximumOrderUnits
     * <p>
     * The maximum units allowed for an Order placed for this instrument.
     * Specified in units.
     * <p>
     * @param maximumOrderUnits the maximumOrderUnits as a double
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMaximumOrderUnits(double maximumOrderUnits) {
        this.maximumOrderUnits = new DecimalNumber(maximumOrderUnits);
        return this;
    }
    /**
     * Set the maximumOrderUnits
     * <p>
     * The maximum units allowed for an Order placed for this instrument.
     * Specified in units.
     * <p>
     * @param maximumOrderUnits the maximumOrderUnits as a BigDecimal
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMaximumOrderUnits(BigDecimal maximumOrderUnits) {
        this.maximumOrderUnits = new DecimalNumber(maximumOrderUnits);
        return this;
    }

    @SerializedName("marginRate") private DecimalNumber marginRate;

    /**
     * Get the marginRate
     * <p>
     * The margin rate for this instrument.
     * <p>
     * @return the marginRate
     * @see DecimalNumber
     */
    public DecimalNumber getMarginRate() {
        return this.marginRate;
    }

    /**
     * Set the marginRate
     * <p>
     * The margin rate for this instrument.
     * <p>
     * @param marginRate the marginRate as a DecimalNumber
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMarginRate(DecimalNumber marginRate) {
        this.marginRate = marginRate;
        return this;
    }
    /**
     * Set the marginRate
     * <p>
     * The margin rate for this instrument.
     * <p>
     * @param marginRate the marginRate as a String
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMarginRate(String marginRate) {
        this.marginRate = new DecimalNumber(marginRate);
        return this;
    }
    /**
     * Set the marginRate
     * <p>
     * The margin rate for this instrument.
     * <p>
     * @param marginRate the marginRate as a double
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMarginRate(double marginRate) {
        this.marginRate = new DecimalNumber(marginRate);
        return this;
    }
    /**
     * Set the marginRate
     * <p>
     * The margin rate for this instrument.
     * <p>
     * @param marginRate the marginRate as a BigDecimal
     * @return {@link Instrument Instrument}
     * @see DecimalNumber
     */
    public Instrument setMarginRate(BigDecimal marginRate) {
        this.marginRate = new DecimalNumber(marginRate);
        return this;
    }

    @SerializedName("commission") private InstrumentCommission commission;

    /**
     * Get the commission
     * <p>
     * The commission structure for this instrument.
     * <p>
     * @return the commission
     * @see InstrumentCommission
     */
    public InstrumentCommission getCommission() {
        return this.commission;
    }

    /**
     * Set the commission
     * <p>
     * The commission structure for this instrument.
     * <p>
     * @param commission the commission as an InstrumentCommission
     * @return {@link Instrument Instrument}
     * @see InstrumentCommission
     */
    public Instrument setCommission(InstrumentCommission commission) {
        this.commission = commission;
        return this;
    }

    @Override
    public String toString() {
        return "Instrument(" +
            "name=" +
                (name == null ? "null" : name.toString()) + ", " +
            "type=" +
                (type == null ? "null" : type.toString()) + ", " +
            "displayName=" +
                (displayName == null ? "null" : displayName.toString()) + ", " +
            "pipLocation=" +
                (pipLocation == null ? "null" : pipLocation.toString()) + ", " +
            "displayPrecision=" +
                (displayPrecision == null ? "null" : displayPrecision.toString()) + ", " +
            "tradeUnitsPrecision=" +
                (tradeUnitsPrecision == null ? "null" : tradeUnitsPrecision.toString()) + ", " +
            "minimumTradeSize=" +
                (minimumTradeSize == null ? "null" : minimumTradeSize.toString()) + ", " +
            "maximumTrailingStopDistance=" +
                (maximumTrailingStopDistance == null ? "null" : maximumTrailingStopDistance.toString()) + ", " +
            "minimumTrailingStopDistance=" +
                (minimumTrailingStopDistance == null ? "null" : minimumTrailingStopDistance.toString()) + ", " +
            "maximumPositionSize=" +
                (maximumPositionSize == null ? "null" : maximumPositionSize.toString()) + ", " +
            "maximumOrderUnits=" +
                (maximumOrderUnits == null ? "null" : maximumOrderUnits.toString()) + ", " +
            "marginRate=" +
                (marginRate == null ? "null" : marginRate.toString()) + ", " +
            "commission=" +
                (commission == null ? "null" : commission.toString()) +
            ")";
    }
}
