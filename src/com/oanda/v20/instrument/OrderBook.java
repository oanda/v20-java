package com.oanda.v20.instrument;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.pricing_common.PriceValue;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.primitives.InstrumentName;

/**
 * The representation of an instrument's order book at a point in time
 */
public class OrderBook {

    /**
     * Default constructor.
     */
    public OrderBook() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the OrderBook to copy
     */
    public OrderBook(OrderBook other) {
        this.instrument = other.instrument;
        this.time = other.time;
        this.price = other.price;
        this.bucketWidth = other.bucketWidth;
        if (other.buckets != null)
        {
            this.buckets = new ArrayList<OrderBookBucket>(other.buckets);
        }
    }

    @SerializedName("instrument") private InstrumentName instrument;

    /**
     * Get the instrument
     * <p>
     * The order book's instrument
     * <p>
     * @return the instrument
     * @see InstrumentName
     */
    public InstrumentName getInstrument() {
        return this.instrument;
    }

    /**
     * Set the instrument
     * <p>
     * The order book's instrument
     * <p>
     * @param instrument the instrument as an InstrumentName
     * @return {@link OrderBook OrderBook}
     * @see InstrumentName
     */
    public OrderBook setInstrument(InstrumentName instrument) {
        this.instrument = instrument;
        return this;
    }
    /**
     * Set the instrument
     * <p>
     * The order book's instrument
     * <p>
     * @param instrument the instrument as a String
     * @return {@link OrderBook OrderBook}
     * @see InstrumentName
     */
    public OrderBook setInstrument(String instrument) {
        this.instrument = new InstrumentName(instrument);
        return this;
    }

    @SerializedName("time") private DateTime time;

    /**
     * Get the time
     * <p>
     * The time when the order book snapshot was created.
     * <p>
     * @return the time
     * @see DateTime
     */
    public DateTime getTime() {
        return this.time;
    }

    /**
     * Set the time
     * <p>
     * The time when the order book snapshot was created.
     * <p>
     * @param time the time as a DateTime
     * @return {@link OrderBook OrderBook}
     * @see DateTime
     */
    public OrderBook setTime(DateTime time) {
        this.time = time;
        return this;
    }
    /**
     * Set the time
     * <p>
     * The time when the order book snapshot was created.
     * <p>
     * @param time the time as a String
     * @return {@link OrderBook OrderBook}
     * @see DateTime
     */
    public OrderBook setTime(String time) {
        this.time = new DateTime(time);
        return this;
    }

    @SerializedName("price") private PriceValue price;

    /**
     * Get the price
     * <p>
     * The price (midpoint) for the order book's instrument at the time of the
     * order book snapshot
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
     * The price (midpoint) for the order book's instrument at the time of the
     * order book snapshot
     * <p>
     * @param price the price as a PriceValue
     * @return {@link OrderBook OrderBook}
     * @see PriceValue
     */
    public OrderBook setPrice(PriceValue price) {
        this.price = price;
        return this;
    }
    /**
     * Set the price
     * <p>
     * The price (midpoint) for the order book's instrument at the time of the
     * order book snapshot
     * <p>
     * @param price the price as a String
     * @return {@link OrderBook OrderBook}
     * @see PriceValue
     */
    public OrderBook setPrice(String price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the price
     * <p>
     * The price (midpoint) for the order book's instrument at the time of the
     * order book snapshot
     * <p>
     * @param price the price as a double
     * @return {@link OrderBook OrderBook}
     * @see PriceValue
     */
    public OrderBook setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the price
     * <p>
     * The price (midpoint) for the order book's instrument at the time of the
     * order book snapshot
     * <p>
     * @param price the price as a BigDecimal
     * @return {@link OrderBook OrderBook}
     * @see PriceValue
     */
    public OrderBook setPrice(BigDecimal price) {
        this.price = new PriceValue(price);
        return this;
    }

    @SerializedName("bucketWidth") private PriceValue bucketWidth;

    /**
     * Get the bucketWidth
     * <p>
     * The price width for each bucket. Each bucket covers the price range from
     * the bucket's price to the bucket's price + bucketWidth.
     * <p>
     * @return the bucketWidth
     * @see PriceValue
     */
    public PriceValue getBucketWidth() {
        return this.bucketWidth;
    }

    /**
     * Set the bucketWidth
     * <p>
     * The price width for each bucket. Each bucket covers the price range from
     * the bucket's price to the bucket's price + bucketWidth.
     * <p>
     * @param bucketWidth the bucketWidth as a PriceValue
     * @return {@link OrderBook OrderBook}
     * @see PriceValue
     */
    public OrderBook setBucketWidth(PriceValue bucketWidth) {
        this.bucketWidth = bucketWidth;
        return this;
    }
    /**
     * Set the bucketWidth
     * <p>
     * The price width for each bucket. Each bucket covers the price range from
     * the bucket's price to the bucket's price + bucketWidth.
     * <p>
     * @param bucketWidth the bucketWidth as a String
     * @return {@link OrderBook OrderBook}
     * @see PriceValue
     */
    public OrderBook setBucketWidth(String bucketWidth) {
        this.bucketWidth = new PriceValue(bucketWidth);
        return this;
    }
    /**
     * Set the bucketWidth
     * <p>
     * The price width for each bucket. Each bucket covers the price range from
     * the bucket's price to the bucket's price + bucketWidth.
     * <p>
     * @param bucketWidth the bucketWidth as a double
     * @return {@link OrderBook OrderBook}
     * @see PriceValue
     */
    public OrderBook setBucketWidth(double bucketWidth) {
        this.bucketWidth = new PriceValue(bucketWidth);
        return this;
    }
    /**
     * Set the bucketWidth
     * <p>
     * The price width for each bucket. Each bucket covers the price range from
     * the bucket's price to the bucket's price + bucketWidth.
     * <p>
     * @param bucketWidth the bucketWidth as a BigDecimal
     * @return {@link OrderBook OrderBook}
     * @see PriceValue
     */
    public OrderBook setBucketWidth(BigDecimal bucketWidth) {
        this.bucketWidth = new PriceValue(bucketWidth);
        return this;
    }

    @SerializedName("buckets") private ArrayList<OrderBookBucket> buckets;

    /**
     * Get the buckets
     * <p>
     * The partitioned order book, divided into buckets using a default bucket
     * width. These buckets are only provided for price ranges which actually
     * contain order or position data.
     * <p>
     * @return the buckets
     * @see OrderBookBucket
     */
    public List<OrderBookBucket> getBuckets() {
        return this.buckets;
    }

    /**
     * Set the buckets
     * <p>
     * The partitioned order book, divided into buckets using a default bucket
     * width. These buckets are only provided for price ranges which actually
     * contain order or position data.
     * <p>
     * @param buckets the buckets
     * @return {@link OrderBook OrderBook}
     * @see OrderBookBucket
     */
    public OrderBook setBuckets(Collection<?> buckets) {
        ArrayList<OrderBookBucket> newBuckets = new ArrayList<OrderBookBucket>(buckets.size());
        buckets.forEach((item) -> {
            if (item instanceof OrderBookBucket)
            {
                newBuckets.add((OrderBookBucket) item);
            }
            else
            {
                throw new IllegalArgumentException(
                    item.getClass().getName() + " cannot be converted to an OrderBookBucket"
                );
            }
        });
        this.buckets = newBuckets;
        return this;
    }

    @Override
    public String toString() {
        return "OrderBook(" +
            "instrument=" +
                (instrument == null ? "null" : instrument.toString()) + ", " +
            "time=" +
                (time == null ? "null" : time.toString()) + ", " +
            "price=" +
                (price == null ? "null" : price.toString()) + ", " +
            "bucketWidth=" +
                (bucketWidth == null ? "null" : bucketWidth.toString()) + ", " +
            "buckets=" +
                (buckets == null ? "null" : buckets.toString()) +
            ")";
    }
}
