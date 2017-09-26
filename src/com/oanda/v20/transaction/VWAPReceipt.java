package com.oanda.v20.transaction;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.pricing.PriceValue;
import com.oanda.v20.primitives.DecimalNumber;

/**
 * A VWAP Receipt provides a record of how the price for an Order fill is
 * constructed. If the Order is filled with multiple buckets in a depth of
 * market, each bucket will be represented with a VWAP Receipt.
 */
public class VWAPReceipt {

    /**
     * Default constructor.
     */
    public VWAPReceipt() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the VWAPReceipt to copy
     */
    public VWAPReceipt(VWAPReceipt other) {
        this.units = other.units;
        this.price = other.price;
    }

    @SerializedName("units") private DecimalNumber units;

    /**
     * Get the Fill Amount
     * <p>
     * The number of units filled
     * <p>
     * @return the Fill Amount
     * @see DecimalNumber
     */
    public DecimalNumber getUnits() {
        return this.units;
    }

    /**
     * Set the Fill Amount
     * <p>
     * The number of units filled
     * <p>
     * @param units the Fill Amount as a DecimalNumber
     * @return {@link VWAPReceipt VWAPReceipt}
     * @see DecimalNumber
     */
    public VWAPReceipt setUnits(DecimalNumber units) {
        this.units = units;
        return this;
    }
    /**
     * Set the Fill Amount
     * <p>
     * The number of units filled
     * <p>
     * @param units the Fill Amount as a String
     * @return {@link VWAPReceipt VWAPReceipt}
     * @see DecimalNumber
     */
    public VWAPReceipt setUnits(String units) {
        this.units = new DecimalNumber(units);
        return this;
    }
    /**
     * Set the Fill Amount
     * <p>
     * The number of units filled
     * <p>
     * @param units the Fill Amount as a double
     * @return {@link VWAPReceipt VWAPReceipt}
     * @see DecimalNumber
     */
    public VWAPReceipt setUnits(double units) {
        this.units = new DecimalNumber(units);
        return this;
    }
    /**
     * Set the Fill Amount
     * <p>
     * The number of units filled
     * <p>
     * @param units the Fill Amount as a BigDecimal
     * @return {@link VWAPReceipt VWAPReceipt}
     * @see DecimalNumber
     */
    public VWAPReceipt setUnits(BigDecimal units) {
        this.units = new DecimalNumber(units);
        return this;
    }

    @SerializedName("price") private PriceValue price;

    /**
     * Get the Fill Price
     * <p>
     * The price at which the units were filled
     * <p>
     * @return the Fill Price
     * @see PriceValue
     */
    public PriceValue getPrice() {
        return this.price;
    }

    /**
     * Set the Fill Price
     * <p>
     * The price at which the units were filled
     * <p>
     * @param price the Fill Price as a PriceValue
     * @return {@link VWAPReceipt VWAPReceipt}
     * @see PriceValue
     */
    public VWAPReceipt setPrice(PriceValue price) {
        this.price = price;
        return this;
    }
    /**
     * Set the Fill Price
     * <p>
     * The price at which the units were filled
     * <p>
     * @param price the Fill Price as a String
     * @return {@link VWAPReceipt VWAPReceipt}
     * @see PriceValue
     */
    public VWAPReceipt setPrice(String price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Fill Price
     * <p>
     * The price at which the units were filled
     * <p>
     * @param price the Fill Price as a double
     * @return {@link VWAPReceipt VWAPReceipt}
     * @see PriceValue
     */
    public VWAPReceipt setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Fill Price
     * <p>
     * The price at which the units were filled
     * <p>
     * @param price the Fill Price as a BigDecimal
     * @return {@link VWAPReceipt VWAPReceipt}
     * @see PriceValue
     */
    public VWAPReceipt setPrice(BigDecimal price) {
        this.price = new PriceValue(price);
        return this;
    }

    @Override
    public String toString() {
        return "VWAPReceipt(" +
            "units=" +
                (units == null ? "null" : units.toString()) + ", " +
            "price=" +
                (price == null ? "null" : price.toString()) +
            ")";
    }
}
