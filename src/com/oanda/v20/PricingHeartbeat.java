package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * A PricingHeartbeat object is injected into the Pricing stream to ensure that
 * the HTTP connection remains active.
 * <p>
 * Pricing Heartbeat {time}
 */
public class PricingHeartbeat {

    @SerializedName("type") private String type;

    /**
     * Set the Type
     * <p>
     * The string "HEARTBEAT"
     * <p>
     * @param type the Type
     * @return {@link PricingHeartbeat PricingHeartbeat}
     */
    public PricingHeartbeat setType(String type) {
        this.type = type;
        return this;
    }

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

    @SerializedName("time") private DateTime time;

    /**
     * Set the Time
     * <p>
     * The date/time when the Heartbeat was created.
     * <p>
     * @param time the Time
     * @return {@link PricingHeartbeat PricingHeartbeat}
     * @see DateTime
     */
    public PricingHeartbeat setTime(String time) {
        this.time = new DateTime(time);
        return this;
    }

    /**
     * Get the Time
     * <p>
     * The date/time when the Heartbeat was created.
     * <p>
     * @return the Time
     * @see DateTime
     */
    public String getTime() {
        return this.time.getDateTime();
    }
}
