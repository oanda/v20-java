package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * A Price Bucket represents a price available for an amount of liquidity
 */
public class PriceBucket {

    @SerializedName("price") private PriceValue price;

    /**
     * Set the Price
     * <p>
     * The Price offered by the PriceBucket
     * <p>
     * @param price the Price
     * @return {@link PriceBucket PriceBucket}
     * @see PriceValue
     */
    public PriceBucket setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }

    /**
     * Get the Price
     * <p>
     * The Price offered by the PriceBucket
     * <p>
     * @return the Price
     * @see PriceValue
     */
    public double getPrice() {
        return this.price.getPriceValue();
    }

    @SerializedName("liquidity") private Integer liquidity;

    /**
     * Set the Liquidity
     * <p>
     * The amount of liquidity offered by the PriceBucket
     * <p>
     * @param liquidity the Liquidity
     * @return {@link PriceBucket PriceBucket}
     */
    public PriceBucket setLiquidity(int liquidity) {
        this.liquidity = liquidity;
        return this;
    }

    /**
     * Get the Liquidity
     * <p>
     * The amount of liquidity offered by the PriceBucket
     * <p>
     * @return the Liquidity
     */
    public int getLiquidity() {
        return this.liquidity;
    }
}
