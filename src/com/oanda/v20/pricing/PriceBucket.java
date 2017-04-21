package com.oanda.v20.pricing;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

/**
 * A Price Bucket represents a price available for an amount of liquidity
 */
public class PriceBucket {

    /**
     * Default constructor.
     */
    public PriceBucket() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the PriceBucket to copy
     */
    public PriceBucket(PriceBucket other) {
        this.price = other.price;
        if (other.liquidity != null)
        {
            this.liquidity = new Integer(other.liquidity);
        }
    }

    @SerializedName("price") private PriceValue price;

    /**
     * Get the Price
     * <p>
     * The Price offered by the PriceBucket
     * <p>
     * @return the Price
     * @see PriceValue
     */
    public PriceValue getPrice() {
        return this.price;
    }

    /**
     * Set the Price
     * <p>
     * The Price offered by the PriceBucket
     * <p>
     * @param price the Price as a PriceValue
     * @return {@link PriceBucket PriceBucket}
     * @see PriceValue
     */
    public PriceBucket setPrice(PriceValue price) {
        this.price = price;
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The Price offered by the PriceBucket
     * <p>
     * @param price the Price as a String
     * @return {@link PriceBucket PriceBucket}
     * @see PriceValue
     */
    public PriceBucket setPrice(String price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The Price offered by the PriceBucket
     * <p>
     * @param price the Price as a double
     * @return {@link PriceBucket PriceBucket}
     * @see PriceValue
     */
    public PriceBucket setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The Price offered by the PriceBucket
     * <p>
     * @param price the Price as a BigDecimal
     * @return {@link PriceBucket PriceBucket}
     * @see PriceValue
     */
    public PriceBucket setPrice(BigDecimal price) {
        this.price = new PriceValue(price);
        return this;
    }

    @SerializedName("liquidity") private Integer liquidity;

    /**
     * Get the Liquidity
     * <p>
     * The amount of liquidity offered by the PriceBucket
     * <p>
     * @return the Liquidity
     */
    public Integer getLiquidity() {
        return this.liquidity;
    }

    /**
     * Set the Liquidity
     * <p>
     * The amount of liquidity offered by the PriceBucket
     * <p>
     * @param liquidity the Liquidity as an Integer
     * @return {@link PriceBucket PriceBucket}
     */
    public PriceBucket setLiquidity(Integer liquidity) {
        this.liquidity = liquidity;
        return this;
    }
}
