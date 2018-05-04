package com.oanda.v20.instrument;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.pricing_common.PriceValue;
import com.oanda.v20.primitives.DecimalNumber;

/**
 * The order book data for a partition of the instrument's prices.
 */
public class OrderBookBucket {

    /**
     * Default constructor.
     */
    public OrderBookBucket() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the OrderBookBucket to copy
     */
    public OrderBookBucket(OrderBookBucket other) {
        this.price = other.price;
        this.longCountPercent = other.longCountPercent;
        this.shortCountPercent = other.shortCountPercent;
    }

    @SerializedName("price") private PriceValue price;

    /**
     * Get the price
     * <p>
     * The lowest price (inclusive) covered by the bucket. The bucket covers
     * the price range from the price to price + the order book's bucketWidth.
     * <p>
     * @return the price
     * @see PriceValue
     */
    public PriceValue getPrice() {
        return this.price;
    }

    /**
     * Set the price
     * <p>
     * The lowest price (inclusive) covered by the bucket. The bucket covers
     * the price range from the price to price + the order book's bucketWidth.
     * <p>
     * @param price the price as a PriceValue
     * @return {@link OrderBookBucket OrderBookBucket}
     * @see PriceValue
     */
    public OrderBookBucket setPrice(PriceValue price) {
        this.price = price;
        return this;
    }
    /**
     * Set the price
     * <p>
     * The lowest price (inclusive) covered by the bucket. The bucket covers
     * the price range from the price to price + the order book's bucketWidth.
     * <p>
     * @param price the price as a String
     * @return {@link OrderBookBucket OrderBookBucket}
     * @see PriceValue
     */
    public OrderBookBucket setPrice(String price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the price
     * <p>
     * The lowest price (inclusive) covered by the bucket. The bucket covers
     * the price range from the price to price + the order book's bucketWidth.
     * <p>
     * @param price the price as a double
     * @return {@link OrderBookBucket OrderBookBucket}
     * @see PriceValue
     */
    public OrderBookBucket setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the price
     * <p>
     * The lowest price (inclusive) covered by the bucket. The bucket covers
     * the price range from the price to price + the order book's bucketWidth.
     * <p>
     * @param price the price as a BigDecimal
     * @return {@link OrderBookBucket OrderBookBucket}
     * @see PriceValue
     */
    public OrderBookBucket setPrice(BigDecimal price) {
        this.price = new PriceValue(price);
        return this;
    }

    @SerializedName("longCountPercent") private DecimalNumber longCountPercent;

    /**
     * Get the longCountPercent
     * <p>
     * The percentage of the total number of orders represented by the long
     * orders found in this bucket.
     * <p>
     * @return the longCountPercent
     * @see DecimalNumber
     */
    public DecimalNumber getLongCountPercent() {
        return this.longCountPercent;
    }

    /**
     * Set the longCountPercent
     * <p>
     * The percentage of the total number of orders represented by the long
     * orders found in this bucket.
     * <p>
     * @param longCountPercent the longCountPercent as a DecimalNumber
     * @return {@link OrderBookBucket OrderBookBucket}
     * @see DecimalNumber
     */
    public OrderBookBucket setLongCountPercent(DecimalNumber longCountPercent) {
        this.longCountPercent = longCountPercent;
        return this;
    }
    /**
     * Set the longCountPercent
     * <p>
     * The percentage of the total number of orders represented by the long
     * orders found in this bucket.
     * <p>
     * @param longCountPercent the longCountPercent as a String
     * @return {@link OrderBookBucket OrderBookBucket}
     * @see DecimalNumber
     */
    public OrderBookBucket setLongCountPercent(String longCountPercent) {
        this.longCountPercent = new DecimalNumber(longCountPercent);
        return this;
    }
    /**
     * Set the longCountPercent
     * <p>
     * The percentage of the total number of orders represented by the long
     * orders found in this bucket.
     * <p>
     * @param longCountPercent the longCountPercent as a double
     * @return {@link OrderBookBucket OrderBookBucket}
     * @see DecimalNumber
     */
    public OrderBookBucket setLongCountPercent(double longCountPercent) {
        this.longCountPercent = new DecimalNumber(longCountPercent);
        return this;
    }
    /**
     * Set the longCountPercent
     * <p>
     * The percentage of the total number of orders represented by the long
     * orders found in this bucket.
     * <p>
     * @param longCountPercent the longCountPercent as a BigDecimal
     * @return {@link OrderBookBucket OrderBookBucket}
     * @see DecimalNumber
     */
    public OrderBookBucket setLongCountPercent(BigDecimal longCountPercent) {
        this.longCountPercent = new DecimalNumber(longCountPercent);
        return this;
    }

    @SerializedName("shortCountPercent") private DecimalNumber shortCountPercent;

    /**
     * Get the shortCountPercent
     * <p>
     * The percentage of the total number of orders represented by the short
     * orders found in this bucket.
     * <p>
     * @return the shortCountPercent
     * @see DecimalNumber
     */
    public DecimalNumber getShortCountPercent() {
        return this.shortCountPercent;
    }

    /**
     * Set the shortCountPercent
     * <p>
     * The percentage of the total number of orders represented by the short
     * orders found in this bucket.
     * <p>
     * @param shortCountPercent the shortCountPercent as a DecimalNumber
     * @return {@link OrderBookBucket OrderBookBucket}
     * @see DecimalNumber
     */
    public OrderBookBucket setShortCountPercent(DecimalNumber shortCountPercent) {
        this.shortCountPercent = shortCountPercent;
        return this;
    }
    /**
     * Set the shortCountPercent
     * <p>
     * The percentage of the total number of orders represented by the short
     * orders found in this bucket.
     * <p>
     * @param shortCountPercent the shortCountPercent as a String
     * @return {@link OrderBookBucket OrderBookBucket}
     * @see DecimalNumber
     */
    public OrderBookBucket setShortCountPercent(String shortCountPercent) {
        this.shortCountPercent = new DecimalNumber(shortCountPercent);
        return this;
    }
    /**
     * Set the shortCountPercent
     * <p>
     * The percentage of the total number of orders represented by the short
     * orders found in this bucket.
     * <p>
     * @param shortCountPercent the shortCountPercent as a double
     * @return {@link OrderBookBucket OrderBookBucket}
     * @see DecimalNumber
     */
    public OrderBookBucket setShortCountPercent(double shortCountPercent) {
        this.shortCountPercent = new DecimalNumber(shortCountPercent);
        return this;
    }
    /**
     * Set the shortCountPercent
     * <p>
     * The percentage of the total number of orders represented by the short
     * orders found in this bucket.
     * <p>
     * @param shortCountPercent the shortCountPercent as a BigDecimal
     * @return {@link OrderBookBucket OrderBookBucket}
     * @see DecimalNumber
     */
    public OrderBookBucket setShortCountPercent(BigDecimal shortCountPercent) {
        this.shortCountPercent = new DecimalNumber(shortCountPercent);
        return this;
    }

    @Override
    public String toString() {
        return "OrderBookBucket(" +
            "price=" +
                (price == null ? "null" : price.toString()) + ", " +
            "longCountPercent=" +
                (longCountPercent == null ? "null" : longCountPercent.toString()) + ", " +
            "shortCountPercent=" +
                (shortCountPercent == null ? "null" : shortCountPercent.toString()) +
            ")";
    }
}
