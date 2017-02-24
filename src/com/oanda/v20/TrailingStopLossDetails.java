package com.oanda.v20;

import com.oanda.v20.TimeInForce;
import com.google.gson.annotations.SerializedName;

/**
 * TrailingStopLossDetails specifies the details of a Trailing Stop Loss Order
 * to be created on behalf of a client. This may happen when an Order is filled
 * that opens a Trade requiring a Trailing Stop Loss, or when a Trade's
 * dependent Trailing Stop Loss Order is modified directly through the Trade.
 */
public class TrailingStopLossDetails {

    @SerializedName("distance") private PriceValue distance;

    /**
     * Set the Trailing Price Distance
     * <p>
     * The distance (in price units) from the Trade's fill price that the
     * Trailing Stop Loss Order will be triggered at.
     * <p>
     * @param distance the Trailing Price Distance
     * @return {@link TrailingStopLossDetails TrailingStopLossDetails}
     * @see PriceValue
     */
    public TrailingStopLossDetails setDistance(double distance) {
        this.distance = new PriceValue(distance);
        return this;
    }

    /**
     * Get the Trailing Price Distance
     * <p>
     * The distance (in price units) from the Trade's fill price that the
     * Trailing Stop Loss Order will be triggered at.
     * <p>
     * @return the Trailing Price Distance
     * @see PriceValue
     */
    public double getDistance() {
        return this.distance.getPriceValue();
    }

    @SerializedName("timeInForce") private TimeInForce timeInForce = TimeInForce.GTC;

    /**
     * Set the Time In Force
     * <p>
     * The time in force for the created Trailing Stop Loss Order. This may
     * only be GTC, GTD or GFD.
     * <p>
     * @param timeInForce the Time In Force
     * @return {@link TrailingStopLossDetails TrailingStopLossDetails}
     * @see TimeInForce
     */
    public TrailingStopLossDetails setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

    /**
     * Get the Time In Force
     * <p>
     * The time in force for the created Trailing Stop Loss Order. This may
     * only be GTC, GTD or GFD.
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
     * The date when the Trailing Stop Loss Order will be cancelled on if
     * timeInForce is GTD.
     * <p>
     * @param gtdTime the GTD Time
     * @return {@link TrailingStopLossDetails TrailingStopLossDetails}
     * @see DateTime
     */
    public TrailingStopLossDetails setGtdTime(String gtdTime) {
        this.gtdTime = new DateTime(gtdTime);
        return this;
    }

    /**
     * Get the GTD Time
     * <p>
     * The date when the Trailing Stop Loss Order will be cancelled on if
     * timeInForce is GTD.
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
     * The Client Extensions to add to the Trailing Stop Loss Order when
     * created.
     * <p>
     * @param clientExtensions the Client Extensions
     * @return {@link TrailingStopLossDetails TrailingStopLossDetails}
     * @see ClientExtensions
     */
    public TrailingStopLossDetails setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

    /**
     * Get the Client Extensions
     * <p>
     * The Client Extensions to add to the Trailing Stop Loss Order when
     * created.
     * <p>
     * @return the Client Extensions
     * @see ClientExtensions
     */
    public ClientExtensions getClientExtensions() {
        return this.clientExtensions;
    }
}
