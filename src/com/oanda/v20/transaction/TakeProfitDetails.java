package com.oanda.v20.transaction;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.order.TimeInForce;
import com.oanda.v20.pricing_common.PriceValue;
import com.oanda.v20.primitives.DateTime;

/**
 * TakeProfitDetails specifies the details of a Take Profit Order to be created
 * on behalf of a client. This may happen when an Order is filled that opens a
 * Trade requiring a Take Profit, or when a Trade's dependent Take Profit Order
 * is modified directly through the Trade.
 */
public class TakeProfitDetails {

    /**
     * Default constructor.
     */
    public TakeProfitDetails() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the TakeProfitDetails to copy
     */
    public TakeProfitDetails(TakeProfitDetails other) {
        this.price = other.price;
        this.timeInForce = other.timeInForce;
        this.gtdTime = other.gtdTime;
        if (other.clientExtensions != null)
        {
            this.clientExtensions = new ClientExtensions(other.clientExtensions);
        }
    }

    @SerializedName("price") private PriceValue price;

    /**
     * Get the Price
     * <p>
     * The price that the Take Profit Order will be triggered at. Only one of
     * the price and distance fields may be specified.
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
     * The price that the Take Profit Order will be triggered at. Only one of
     * the price and distance fields may be specified.
     * <p>
     * @param price the Price as a PriceValue
     * @return {@link TakeProfitDetails TakeProfitDetails}
     * @see PriceValue
     */
    public TakeProfitDetails setPrice(PriceValue price) {
        this.price = price;
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price that the Take Profit Order will be triggered at. Only one of
     * the price and distance fields may be specified.
     * <p>
     * @param price the Price as a String
     * @return {@link TakeProfitDetails TakeProfitDetails}
     * @see PriceValue
     */
    public TakeProfitDetails setPrice(String price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price that the Take Profit Order will be triggered at. Only one of
     * the price and distance fields may be specified.
     * <p>
     * @param price the Price as a double
     * @return {@link TakeProfitDetails TakeProfitDetails}
     * @see PriceValue
     */
    public TakeProfitDetails setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price that the Take Profit Order will be triggered at. Only one of
     * the price and distance fields may be specified.
     * <p>
     * @param price the Price as a BigDecimal
     * @return {@link TakeProfitDetails TakeProfitDetails}
     * @see PriceValue
     */
    public TakeProfitDetails setPrice(BigDecimal price) {
        this.price = new PriceValue(price);
        return this;
    }

    @SerializedName("timeInForce") private TimeInForce timeInForce = TimeInForce.GTC;

    /**
     * Get the Time In Force
     * <p>
     * The time in force for the created Take Profit Order. This may only be
     * GTC, GTD or GFD.
     * <p>
     * @return the Time In Force
     * @see TimeInForce
     */
    public TimeInForce getTimeInForce() {
        return this.timeInForce;
    }

    /**
     * Set the Time In Force
     * <p>
     * The time in force for the created Take Profit Order. This may only be
     * GTC, GTD or GFD.
     * <p>
     * @param timeInForce the Time In Force as a TimeInForce
     * @return {@link TakeProfitDetails TakeProfitDetails}
     * @see TimeInForce
     */
    public TakeProfitDetails setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

    @SerializedName("gtdTime") private DateTime gtdTime;

    /**
     * Get the GTD Time
     * <p>
     * The date when the Take Profit Order will be cancelled on if timeInForce
     * is GTD.
     * <p>
     * @return the GTD Time
     * @see DateTime
     */
    public DateTime getGtdTime() {
        return this.gtdTime;
    }

    /**
     * Set the GTD Time
     * <p>
     * The date when the Take Profit Order will be cancelled on if timeInForce
     * is GTD.
     * <p>
     * @param gtdTime the GTD Time as a DateTime
     * @return {@link TakeProfitDetails TakeProfitDetails}
     * @see DateTime
     */
    public TakeProfitDetails setGtdTime(DateTime gtdTime) {
        this.gtdTime = gtdTime;
        return this;
    }
    /**
     * Set the GTD Time
     * <p>
     * The date when the Take Profit Order will be cancelled on if timeInForce
     * is GTD.
     * <p>
     * @param gtdTime the GTD Time as a String
     * @return {@link TakeProfitDetails TakeProfitDetails}
     * @see DateTime
     */
    public TakeProfitDetails setGtdTime(String gtdTime) {
        this.gtdTime = new DateTime(gtdTime);
        return this;
    }

    @SerializedName("clientExtensions") private ClientExtensions clientExtensions;

    /**
     * Get the Client Extensions
     * <p>
     * The Client Extensions to add to the Take Profit Order when created.
     * <p>
     * @return the Client Extensions
     * @see ClientExtensions
     */
    public ClientExtensions getClientExtensions() {
        return this.clientExtensions;
    }

    /**
     * Set the Client Extensions
     * <p>
     * The Client Extensions to add to the Take Profit Order when created.
     * <p>
     * @param clientExtensions the Client Extensions as a ClientExtensions
     * @return {@link TakeProfitDetails TakeProfitDetails}
     * @see ClientExtensions
     */
    public TakeProfitDetails setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

    @Override
    public String toString() {
        return "TakeProfitDetails(" +
            "price=" +
                (price == null ? "null" : price.toString()) + ", " +
            "timeInForce=" +
                (timeInForce == null ? "null" : timeInForce.toString()) + ", " +
            "gtdTime=" +
                (gtdTime == null ? "null" : gtdTime.toString()) + ", " +
            "clientExtensions=" +
                (clientExtensions == null ? "null" : clientExtensions.toString()) +
            ")";
    }
}
