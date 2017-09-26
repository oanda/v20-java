package com.oanda.v20.order;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.primitives.DecimalNumber;

/**
 * Representation of many units of an Instrument are available to be traded for
 * both long and short Orders.
 */
public class UnitsAvailableDetails {

    /**
     * Default constructor.
     */
    public UnitsAvailableDetails() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the UnitsAvailableDetails to copy
     */
    public UnitsAvailableDetails(UnitsAvailableDetails other) {
        this.longValue = other.longValue;
        this.shortValue = other.shortValue;
    }

    @SerializedName("long") private DecimalNumber longValue;

    /**
     * Get the Long
     * <p>
     * The units available for long Orders.
     * <p>
     * @return the Long
     * @see DecimalNumber
     */
    public DecimalNumber getLong() {
        return this.longValue;
    }

    /**
     * Set the Long
     * <p>
     * The units available for long Orders.
     * <p>
     * @param longValue the Long as a DecimalNumber
     * @return {@link UnitsAvailableDetails UnitsAvailableDetails}
     * @see DecimalNumber
     */
    public UnitsAvailableDetails setLong(DecimalNumber longValue) {
        this.longValue = longValue;
        return this;
    }
    /**
     * Set the Long
     * <p>
     * The units available for long Orders.
     * <p>
     * @param longValue the Long as a String
     * @return {@link UnitsAvailableDetails UnitsAvailableDetails}
     * @see DecimalNumber
     */
    public UnitsAvailableDetails setLong(String longValue) {
        this.longValue = new DecimalNumber(longValue);
        return this;
    }
    /**
     * Set the Long
     * <p>
     * The units available for long Orders.
     * <p>
     * @param longValue the Long as a double
     * @return {@link UnitsAvailableDetails UnitsAvailableDetails}
     * @see DecimalNumber
     */
    public UnitsAvailableDetails setLong(double longValue) {
        this.longValue = new DecimalNumber(longValue);
        return this;
    }
    /**
     * Set the Long
     * <p>
     * The units available for long Orders.
     * <p>
     * @param longValue the Long as a BigDecimal
     * @return {@link UnitsAvailableDetails UnitsAvailableDetails}
     * @see DecimalNumber
     */
    public UnitsAvailableDetails setLong(BigDecimal longValue) {
        this.longValue = new DecimalNumber(longValue);
        return this;
    }

    @SerializedName("short") private DecimalNumber shortValue;

    /**
     * Get the Short
     * <p>
     * The units available for short Orders.
     * <p>
     * @return the Short
     * @see DecimalNumber
     */
    public DecimalNumber getShort() {
        return this.shortValue;
    }

    /**
     * Set the Short
     * <p>
     * The units available for short Orders.
     * <p>
     * @param shortValue the Short as a DecimalNumber
     * @return {@link UnitsAvailableDetails UnitsAvailableDetails}
     * @see DecimalNumber
     */
    public UnitsAvailableDetails setShort(DecimalNumber shortValue) {
        this.shortValue = shortValue;
        return this;
    }
    /**
     * Set the Short
     * <p>
     * The units available for short Orders.
     * <p>
     * @param shortValue the Short as a String
     * @return {@link UnitsAvailableDetails UnitsAvailableDetails}
     * @see DecimalNumber
     */
    public UnitsAvailableDetails setShort(String shortValue) {
        this.shortValue = new DecimalNumber(shortValue);
        return this;
    }
    /**
     * Set the Short
     * <p>
     * The units available for short Orders.
     * <p>
     * @param shortValue the Short as a double
     * @return {@link UnitsAvailableDetails UnitsAvailableDetails}
     * @see DecimalNumber
     */
    public UnitsAvailableDetails setShort(double shortValue) {
        this.shortValue = new DecimalNumber(shortValue);
        return this;
    }
    /**
     * Set the Short
     * <p>
     * The units available for short Orders.
     * <p>
     * @param shortValue the Short as a BigDecimal
     * @return {@link UnitsAvailableDetails UnitsAvailableDetails}
     * @see DecimalNumber
     */
    public UnitsAvailableDetails setShort(BigDecimal shortValue) {
        this.shortValue = new DecimalNumber(shortValue);
        return this;
    }

    @Override
    public String toString() {
        return "UnitsAvailableDetails(" +
            "long=" +
                (longValue == null ? "null" : longValue.toString()) + ", " +
            "short=" +
                (shortValue == null ? "null" : shortValue.toString()) +
            ")";
    }
}
