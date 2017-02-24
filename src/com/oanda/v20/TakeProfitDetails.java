package com.oanda.v20;

import com.oanda.v20.TimeInForce;
import com.google.gson.annotations.SerializedName;

/**
 * TakeProfitDetails specifies the details of a Take Profit Order to be created
 * on behalf of a client. This may happen when an Order is filled that opens a
 * Trade requiring a Take Profit, or when a Trade's dependent Take Profit Order
 * is modified directly through the Trade.
 */
public class TakeProfitDetails {

    @SerializedName("price") private PriceValue price;

    /**
     * Set the Price
     * <p>
     * The price that the Take Profit Order will be triggered at.
     * <p>
     * @param price the Price
     * @return {@link TakeProfitDetails TakeProfitDetails}
     * @see PriceValue
     */
    public TakeProfitDetails setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }

    /**
     * Get the Price
     * <p>
     * The price that the Take Profit Order will be triggered at.
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
     * The time in force for the created Take Profit Order. This may only be
     * GTC, GTD or GFD.
     * <p>
     * @param timeInForce the Time In Force
     * @return {@link TakeProfitDetails TakeProfitDetails}
     * @see TimeInForce
     */
    public TakeProfitDetails setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

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

    @SerializedName("gtdTime") private DateTime gtdTime;

    /**
     * Set the GTD Time
     * <p>
     * The date when the Take Profit Order will be cancelled on if timeInForce
     * is GTD.
     * <p>
     * @param gtdTime the GTD Time
     * @return {@link TakeProfitDetails TakeProfitDetails}
     * @see DateTime
     */
    public TakeProfitDetails setGtdTime(String gtdTime) {
        this.gtdTime = new DateTime(gtdTime);
        return this;
    }

    /**
     * Get the GTD Time
     * <p>
     * The date when the Take Profit Order will be cancelled on if timeInForce
     * is GTD.
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
     * The Client Extensions to add to the Take Profit Order when created.
     * <p>
     * @param clientExtensions the Client Extensions
     * @return {@link TakeProfitDetails TakeProfitDetails}
     * @see ClientExtensions
     */
    public TakeProfitDetails setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

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
}
