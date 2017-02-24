package com.oanda.v20;

import com.oanda.v20.TimeInForce;
import com.google.gson.annotations.SerializedName;

/**
 * StopLossDetails specifies the details of a Stop Loss Order to be created on
 * behalf of a client. This may happen when an Order is filled that opens a
 * Trade requiring a Stop Loss, or when a Trade's dependent Stop Loss Order is
 * modified directly through the Trade.
 */
public class StopLossDetails {

    @SerializedName("price") private PriceValue price;

    /**
     * Set the Price
     * <p>
     * The price that the Stop Loss Order will be triggered at.
     * <p>
     * @param price the Price
     * @return {@link StopLossDetails StopLossDetails}
     * @see PriceValue
     */
    public StopLossDetails setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }

    /**
     * Get the Price
     * <p>
     * The price that the Stop Loss Order will be triggered at.
     * <p>
     * @return the Price
     * @see PriceValue
     */
    public double getPrice() {
        return this.price.getPriceValue();
    }

    @SerializedName("timeInForce") private TimeInForce timeInForce = TimeInForce.GTC;

    /**
     * Set the Time In Force
     * <p>
     * The time in force for the created Stop Loss Order. This may only be GTC,
     * GTD or GFD.
     * <p>
     * @param timeInForce the Time In Force
     * @return {@link StopLossDetails StopLossDetails}
     * @see TimeInForce
     */
    public StopLossDetails setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

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

    @SerializedName("gtdTime") private DateTime gtdTime;

    /**
     * Set the GTD Time
     * <p>
     * The date when the Stop Loss Order will be cancelled on if timeInForce is
     * GTD.
     * <p>
     * @param gtdTime the GTD Time
     * @return {@link StopLossDetails StopLossDetails}
     * @see DateTime
     */
    public StopLossDetails setGtdTime(String gtdTime) {
        this.gtdTime = new DateTime(gtdTime);
        return this;
    }

    /**
     * Get the GTD Time
     * <p>
     * The date when the Stop Loss Order will be cancelled on if timeInForce is
     * GTD.
     * <p>
     * @return the GTD Time
     * @see DateTime
     */
    public String getGtdTime() {
        return this.gtdTime.getDateTime();
    }

    @SerializedName("clientExtensions") private ClientExtensions clientExtensions;

    /**
     * Set the Client Extensions
     * <p>
     * The Client Extensions to add to the Stop Loss Order when created.
     * <p>
     * @param clientExtensions the Client Extensions
     * @return {@link StopLossDetails StopLossDetails}
     * @see ClientExtensions
     */
    public StopLossDetails setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

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
}
