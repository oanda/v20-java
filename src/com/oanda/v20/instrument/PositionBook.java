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
 * The representation of an instrument's position book at a point in time
 */
public class PositionBook {

    /**
     * Default constructor.
     */
    public PositionBook() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the PositionBook to copy
     */
    public PositionBook(PositionBook other) {
        this.instrument = other.instrument;
        this.time = other.time;
        this.price = other.price;
        this.bucketWidth = other.bucketWidth;
        if (other.buckets != null)
        {
            this.buckets = new ArrayList<PositionBookBucket>(other.buckets);
        }
    }

    @SerializedName("instrument") private InstrumentName instrument;

    /**
     * Get the instrument
     * <p>
     * The position book's instrument
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
     * The position book's instrument
     * <p>
     * @param instrument the instrument as an InstrumentName
     * @return {@link PositionBook PositionBook}
     * @see InstrumentName
     */
    public PositionBook setInstrument(InstrumentName instrument) {
        this.instrument = instrument;
        return this;
    }
    /**
     * Set the instrument
     * <p>
     * The position book's instrument
     * <p>
     * @param instrument the instrument as a String
     * @return {@link PositionBook PositionBook}
     * @see InstrumentName
     */
    public PositionBook setInstrument(String instrument) {
        this.instrument = new InstrumentName(instrument);
        return this;
    }

    @SerializedName("time") private DateTime time;

    /**
     * Get the time
     * <p>
     * The time when the position book snapshot was created
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
     * The time when the position book snapshot was created
     * <p>
     * @param time the time as a DateTime
     * @return {@link PositionBook PositionBook}
     * @see DateTime
     */
    public PositionBook setTime(DateTime time) {
        this.time = time;
        return this;
    }
    /**
     * Set the time
     * <p>
     * The time when the position book snapshot was created
     * <p>
     * @param time the time as a String
     * @return {@link PositionBook PositionBook}
     * @see DateTime
     */
    public PositionBook setTime(String time) {
        this.time = new DateTime(time);
        return this;
    }

    @SerializedName("price") private PriceValue price;

    /**
     * Get the price
     * <p>
     * The price (midpoint) for the position book's instrument at the time of
     * the position book snapshot
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
     * The price (midpoint) for the position book's instrument at the time of
     * the position book snapshot
     * <p>
     * @param price the price as a PriceValue
     * @return {@link PositionBook PositionBook}
     * @see PriceValue
     */
    public PositionBook setPrice(PriceValue price) {
        this.price = price;
        return this;
    }
    /**
     * Set the price
     * <p>
     * The price (midpoint) for the position book's instrument at the time of
     * the position book snapshot
     * <p>
     * @param price the price as a String
     * @return {@link PositionBook PositionBook}
     * @see PriceValue
     */
    public PositionBook setPrice(String price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the price
     * <p>
     * The price (midpoint) for the position book's instrument at the time of
     * the position book snapshot
     * <p>
     * @param price the price as a double
     * @return {@link PositionBook PositionBook}
     * @see PriceValue
     */
    public PositionBook setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the price
     * <p>
     * The price (midpoint) for the position book's instrument at the time of
     * the position book snapshot
     * <p>
     * @param price the price as a BigDecimal
     * @return {@link PositionBook PositionBook}
     * @see PriceValue
     */
    public PositionBook setPrice(BigDecimal price) {
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
     * @return {@link PositionBook PositionBook}
     * @see PriceValue
     */
    public PositionBook setBucketWidth(PriceValue bucketWidth) {
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
     * @return {@link PositionBook PositionBook}
     * @see PriceValue
     */
    public PositionBook setBucketWidth(String bucketWidth) {
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
     * @return {@link PositionBook PositionBook}
     * @see PriceValue
     */
    public PositionBook setBucketWidth(double bucketWidth) {
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
     * @return {@link PositionBook PositionBook}
     * @see PriceValue
     */
    public PositionBook setBucketWidth(BigDecimal bucketWidth) {
        this.bucketWidth = new PriceValue(bucketWidth);
        return this;
    }

    @SerializedName("buckets") private ArrayList<PositionBookBucket> buckets;

    /**
     * Get the buckets
     * <p>
     * The partitioned position book, divided into buckets using a default
     * bucket width. These buckets are only provided for price ranges which
     * actually contain order or position data.
     * <p>
     * @return the buckets
     * @see PositionBookBucket
     */
    public List<PositionBookBucket> getBuckets() {
        return this.buckets;
    }

    /**
     * Set the buckets
     * <p>
     * The partitioned position book, divided into buckets using a default
     * bucket width. These buckets are only provided for price ranges which
     * actually contain order or position data.
     * <p>
     * @param buckets the buckets
     * @return {@link PositionBook PositionBook}
     * @see PositionBookBucket
     */
    public PositionBook setBuckets(Collection<?> buckets) {
        ArrayList<PositionBookBucket> newBuckets = new ArrayList<PositionBookBucket>(buckets.size());
        buckets.forEach((item) -> {
            if (item instanceof PositionBookBucket)
            {
                newBuckets.add((PositionBookBucket) item);
            }
            else
            {
                throw new IllegalArgumentException(
                    item.getClass().getName() + " cannot be converted to a PositionBookBucket"
                );
            }
        });
        this.buckets = newBuckets;
        return this;
    }

    @Override
    public String toString() {
        return "PositionBook(" +
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
