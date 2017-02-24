package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * A VWAP Receipt provides a record of how the price for an Order fill is
 * constructed. If the Order is filled with multiple buckets in a depth of
 * market, each bucket will be represented with a VWAP Receipt.
 */
public class VWAPReceipt {

    @SerializedName("units") private DecimalNumber units;

    /**
     * Set the Fill Amount
     * <p>
     * The number of units filled
     * <p>
     * @param units the Fill Amount
     * @return {@link VWAPReceipt VWAPReceipt}
     * @see DecimalNumber
     */
    public VWAPReceipt setUnits(double units) {
        this.units = new DecimalNumber(units);
        return this;
    }

    /**
     * Get the Fill Amount
     * <p>
     * The number of units filled
     * <p>
     * @return the Fill Amount
     * @see DecimalNumber
     */
    public double getUnits() {
        return this.units.getDecimalNumber();
    }

    @SerializedName("price") private PriceValue price;

    /**
     * Set the Fill Price
     * <p>
     * The price at which the units were filled
     * <p>
     * @param price the Fill Price
     * @return {@link VWAPReceipt VWAPReceipt}
     * @see PriceValue
     */
    public VWAPReceipt setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }

    /**
     * Get the Fill Price
     * <p>
     * The price at which the units were filled
     * <p>
     * @return the Fill Price
     * @see PriceValue
     */
    public double getPrice() {
        return this.price.getPriceValue();
    }
}
