package com.oanda.v20.transaction;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.order.TimeInForce;
import com.oanda.v20.pricing.PriceValue;
import com.oanda.v20.primitives.DateTime;

/**
 * StopLossDetails specifies the details of a Stop Loss Order to be created on
 * behalf of a client. This may happen when an Order is filled that opens a
 * Trade requiring a Stop Loss, or when a Trade's dependent Stop Loss Order is
 * modified directly through the Trade.
 */
public class StopLossDetails {

    /**
     * Default constructor.
     */
    public StopLossDetails() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the StopLossDetails to copy
     */
    public StopLossDetails(StopLossDetails other) {
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
     * The price that the Stop Loss Order will be triggered at.
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
     * The price that the Stop Loss Order will be triggered at.
     * <p>
     * @param price the Price as a PriceValue
     * @return {@link StopLossDetails StopLossDetails}
     * @see PriceValue
     */
    public StopLossDetails setPrice(PriceValue price) {
        this.price = price;
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price that the Stop Loss Order will be triggered at.
     * <p>
     * @param price the Price as a String
     * @return {@link StopLossDetails StopLossDetails}
     * @see PriceValue
     */
    public StopLossDetails setPrice(String price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price that the Stop Loss Order will be triggered at.
     * <p>
     * @param price the Price as a double
     * @return {@link StopLossDetails StopLossDetails}
     * @see PriceValue
     */
    public StopLossDetails setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price that the Stop Loss Order will be triggered at.
     * <p>
     * @param price the Price as a BigDecimal
     * @return {@link StopLossDetails StopLossDetails}
     * @see PriceValue
     */
    public StopLossDetails setPrice(BigDecimal price) {
        this.price = new PriceValue(price);
        return this;
    }

    @SerializedName("timeInForce") private TimeInForce timeInForce = TimeInForce.GTC;

    /**
     * Get the Time In Force
     * <p>
     * The time in force for the created Stop Loss Order. This may only be GTC,
     * GTD or GFD.
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
     * The time in force for the created Stop Loss Order. This may only be GTC,
     * GTD or GFD.
     * <p>
     * @param timeInForce the Time In Force as a TimeInForce
     * @return {@link StopLossDetails StopLossDetails}
     * @see TimeInForce
     */
    public StopLossDetails setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

    @SerializedName("gtdTime") private DateTime gtdTime;

    /**
     * Get the GTD Time
     * <p>
     * The date when the Stop Loss Order will be cancelled on if timeInForce is
     * GTD.
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
     * The date when the Stop Loss Order will be cancelled on if timeInForce is
     * GTD.
     * <p>
     * @param gtdTime the GTD Time as a DateTime
     * @return {@link StopLossDetails StopLossDetails}
     * @see DateTime
     */
    public StopLossDetails setGtdTime(DateTime gtdTime) {
        this.gtdTime = gtdTime;
        return this;
    }
    /**
     * Set the GTD Time
     * <p>
     * The date when the Stop Loss Order will be cancelled on if timeInForce is
     * GTD.
     * <p>
     * @param gtdTime the GTD Time as a String
     * @return {@link StopLossDetails StopLossDetails}
     * @see DateTime
     */
    public StopLossDetails setGtdTime(String gtdTime) {
        this.gtdTime = new DateTime(gtdTime);
        return this;
    }

    @SerializedName("clientExtensions") private ClientExtensions clientExtensions;

    /**
     * Get the Client Extensions
     * <p>
     * The Client Extensions to add to the Stop Loss Order when created.
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
     * The Client Extensions to add to the Stop Loss Order when created.
     * <p>
     * @param clientExtensions the Client Extensions as a ClientExtensions
     * @return {@link StopLossDetails StopLossDetails}
     * @see ClientExtensions
     */
    public StopLossDetails setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

    @Override
    public String toString() {
        return "StopLossDetails(" +
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
