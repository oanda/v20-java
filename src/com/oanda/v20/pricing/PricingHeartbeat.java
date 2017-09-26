package com.oanda.v20.pricing;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.primitives.DateTime;

/**
 * A PricingHeartbeat object is injected into the Pricing stream to ensure that
 * the HTTP connection remains active.
 * <p>
 * Pricing Heartbeat {time}
 */
public class PricingHeartbeat {

    /**
     * Default constructor.
     */
    public PricingHeartbeat() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the PricingHeartbeat to copy
     */
    public PricingHeartbeat(PricingHeartbeat other) {
        this.type = other.type;
        this.time = other.time;
    }

    @SerializedName("type") private String type = "HEARTBEAT";

    /**
     * Get the Type
     * <p>
     * The string "HEARTBEAT"
     * <p>
     * @return the Type
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the Type
     * <p>
     * The string "HEARTBEAT"
     * <p>
     * @param type the Type as a String
     * @return {@link PricingHeartbeat PricingHeartbeat}
     */
    public PricingHeartbeat setType(String type) {
        this.type = type;
        return this;
    }

    @SerializedName("time") private DateTime time;

    /**
     * Get the Time
     * <p>
     * The date/time when the Heartbeat was created.
     * <p>
     * @return the Time
     * @see DateTime
     */
    public DateTime getTime() {
        return this.time;
    }

    /**
     * Set the Time
     * <p>
     * The date/time when the Heartbeat was created.
     * <p>
     * @param time the Time as a DateTime
     * @return {@link PricingHeartbeat PricingHeartbeat}
     * @see DateTime
     */
    public PricingHeartbeat setTime(DateTime time) {
        this.time = time;
        return this;
    }
    /**
     * Set the Time
     * <p>
     * The date/time when the Heartbeat was created.
     * <p>
     * @param time the Time as a String
     * @return {@link PricingHeartbeat PricingHeartbeat}
     * @see DateTime
     */
    public PricingHeartbeat setTime(String time) {
        this.time = new DateTime(time);
        return this;
    }

    @Override
    public String toString() {
        return "PricingHeartbeat(" +
            "type=" +
                (type == null ? "null" : type.toString()) + ", " +
            "time=" +
                (time == null ? "null" : time.toString()) +
            ")";
    }
}
