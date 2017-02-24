package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of many units of an Instrument are available to be traded for
 * both long and short Orders.
 */
public class UnitsAvailableDetails {

    @SerializedName("long") private DecimalNumber longValue;

    /**
     * Set the Long
     * <p>
     * The units available for long Orders.
     * <p>
     * @param longValue the Long
     * @return {@link UnitsAvailableDetails UnitsAvailableDetails}
     * @see DecimalNumber
     */
    public UnitsAvailableDetails setLong(double longValue) {
        this.longValue = new DecimalNumber(longValue);
        return this;
    }

    /**
     * Get the Long
     * <p>
     * The units available for long Orders.
     * <p>
     * @return the Long
     * @see DecimalNumber
     */
    public double getLong() {
        return this.longValue.getDecimalNumber();
    }

    @SerializedName("short") private DecimalNumber shortValue;

    /**
     * Set the Short
     * <p>
     * The units available for short Orders.
     * <p>
     * @param shortValue the Short
     * @return {@link UnitsAvailableDetails UnitsAvailableDetails}
     * @see DecimalNumber
     */
    public UnitsAvailableDetails setShort(double shortValue) {
        this.shortValue = new DecimalNumber(shortValue);
        return this;
    }

    /**
     * Get the Short
     * <p>
     * The units available for short Orders.
     * <p>
     * @return the Short
     * @see DecimalNumber
     */
    public double getShort() {
        return this.shortValue.getDecimalNumber();
    }
}
