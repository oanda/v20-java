package com.oanda.v20.transaction;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.order.TimeInForce;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.primitives.DecimalNumber;

/**
 * TrailingStopLossDetails specifies the details of a Trailing Stop Loss Order
 * to be created on behalf of a client. This may happen when an Order is filled
 * that opens a Trade requiring a Trailing Stop Loss, or when a Trade's
 * dependent Trailing Stop Loss Order is modified directly through the Trade.
 */
public class TrailingStopLossDetails {

    /**
     * Default constructor.
     */
    public TrailingStopLossDetails() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the TrailingStopLossDetails to copy
     */
    public TrailingStopLossDetails(TrailingStopLossDetails other) {
        this.distance = other.distance;
        this.timeInForce = other.timeInForce;
        this.gtdTime = other.gtdTime;
        if (other.clientExtensions != null)
        {
            this.clientExtensions = new ClientExtensions(other.clientExtensions);
        }
    }

    @SerializedName("distance") private DecimalNumber distance;

    /**
     * Get the Trailing Price Distance
     * <p>
     * The distance (in price units) from the Trade's fill price that the
     * Trailing Stop Loss Order will be triggered at.
     * <p>
     * @return the Trailing Price Distance
     * @see DecimalNumber
     */
    public DecimalNumber getDistance() {
        return this.distance;
    }

    /**
     * Set the Trailing Price Distance
     * <p>
     * The distance (in price units) from the Trade's fill price that the
     * Trailing Stop Loss Order will be triggered at.
     * <p>
     * @param distance the Trailing Price Distance as a DecimalNumber
     * @return {@link TrailingStopLossDetails TrailingStopLossDetails}
     * @see DecimalNumber
     */
    public TrailingStopLossDetails setDistance(DecimalNumber distance) {
        this.distance = distance;
        return this;
    }
    /**
     * Set the Trailing Price Distance
     * <p>
     * The distance (in price units) from the Trade's fill price that the
     * Trailing Stop Loss Order will be triggered at.
     * <p>
     * @param distance the Trailing Price Distance as a String
     * @return {@link TrailingStopLossDetails TrailingStopLossDetails}
     * @see DecimalNumber
     */
    public TrailingStopLossDetails setDistance(String distance) {
        this.distance = new DecimalNumber(distance);
        return this;
    }
    /**
     * Set the Trailing Price Distance
     * <p>
     * The distance (in price units) from the Trade's fill price that the
     * Trailing Stop Loss Order will be triggered at.
     * <p>
     * @param distance the Trailing Price Distance as a double
     * @return {@link TrailingStopLossDetails TrailingStopLossDetails}
     * @see DecimalNumber
     */
    public TrailingStopLossDetails setDistance(double distance) {
        this.distance = new DecimalNumber(distance);
        return this;
    }
    /**
     * Set the Trailing Price Distance
     * <p>
     * The distance (in price units) from the Trade's fill price that the
     * Trailing Stop Loss Order will be triggered at.
     * <p>
     * @param distance the Trailing Price Distance as a BigDecimal
     * @return {@link TrailingStopLossDetails TrailingStopLossDetails}
     * @see DecimalNumber
     */
    public TrailingStopLossDetails setDistance(BigDecimal distance) {
        this.distance = new DecimalNumber(distance);
        return this;
    }

    @SerializedName("timeInForce") private TimeInForce timeInForce = TimeInForce.GTC;

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

    /**
     * Set the Time In Force
     * <p>
     * The time in force for the created Trailing Stop Loss Order. This may
     * only be GTC, GTD or GFD.
     * <p>
     * @param timeInForce the Time In Force as a TimeInForce
     * @return {@link TrailingStopLossDetails TrailingStopLossDetails}
     * @see TimeInForce
     */
    public TrailingStopLossDetails setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

    @SerializedName("gtdTime") private DateTime gtdTime;

    /**
     * Get the GTD Time
     * <p>
     * The date when the Trailing Stop Loss Order will be cancelled on if
     * timeInForce is GTD.
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
     * The date when the Trailing Stop Loss Order will be cancelled on if
     * timeInForce is GTD.
     * <p>
     * @param gtdTime the GTD Time as a DateTime
     * @return {@link TrailingStopLossDetails TrailingStopLossDetails}
     * @see DateTime
     */
    public TrailingStopLossDetails setGtdTime(DateTime gtdTime) {
        this.gtdTime = gtdTime;
        return this;
    }
    /**
     * Set the GTD Time
     * <p>
     * The date when the Trailing Stop Loss Order will be cancelled on if
     * timeInForce is GTD.
     * <p>
     * @param gtdTime the GTD Time as a String
     * @return {@link TrailingStopLossDetails TrailingStopLossDetails}
     * @see DateTime
     */
    public TrailingStopLossDetails setGtdTime(String gtdTime) {
        this.gtdTime = new DateTime(gtdTime);
        return this;
    }

    @SerializedName("clientExtensions") private ClientExtensions clientExtensions;

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

    /**
     * Set the Client Extensions
     * <p>
     * The Client Extensions to add to the Trailing Stop Loss Order when
     * created.
     * <p>
     * @param clientExtensions the Client Extensions as a ClientExtensions
     * @return {@link TrailingStopLossDetails TrailingStopLossDetails}
     * @see ClientExtensions
     */
    public TrailingStopLossDetails setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

    @Override
    public String toString() {
        return "TrailingStopLossDetails(" +
            "distance=" +
                (distance == null ? "null" : distance.toString()) + ", " +
            "timeInForce=" +
                (timeInForce == null ? "null" : timeInForce.toString()) + ", " +
            "gtdTime=" +
                (gtdTime == null ? "null" : gtdTime.toString()) + ", " +
            "clientExtensions=" +
                (clientExtensions == null ? "null" : clientExtensions.toString()) +
            ")";
    }
}
