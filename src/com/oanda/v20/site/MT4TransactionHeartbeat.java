package com.oanda.v20.site;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.primitives.DateTime;

/**
 * A TransactionHeartbeat object is injected into the Transaction stream to
 * ensure that the HTTP connection remains active.
 * <p>
 * Transaction Heartbeat {time}
 */
public class MT4TransactionHeartbeat {

    /**
     * Default constructor.
     */
    public MT4TransactionHeartbeat() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the MT4TransactionHeartbeat to copy
     */
    public MT4TransactionHeartbeat(MT4TransactionHeartbeat other) {
        this.type = other.type;
        this.time = other.time;
    }

    @SerializedName("type") private String type = "HEARTBEAT";

    /**
     * Get the type
     * <p>
     * The string "HEARTBEAT"
     * <p>
     * @return the type
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type
     * <p>
     * The string "HEARTBEAT"
     * <p>
     * @param type the type as a String
     * @return {@link MT4TransactionHeartbeat MT4TransactionHeartbeat}
     */
    public MT4TransactionHeartbeat setType(String type) {
        this.type = type;
        return this;
    }

    @SerializedName("time") private DateTime time;

    /**
     * Get the time
     * <p>
     * The date/time when the TransactionHeartbeat was created.
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
     * The date/time when the TransactionHeartbeat was created.
     * <p>
     * @param time the time as a DateTime
     * @return {@link MT4TransactionHeartbeat MT4TransactionHeartbeat}
     * @see DateTime
     */
    public MT4TransactionHeartbeat setTime(DateTime time) {
        this.time = time;
        return this;
    }
    /**
     * Set the time
     * <p>
     * The date/time when the TransactionHeartbeat was created.
     * <p>
     * @param time the time as a String
     * @return {@link MT4TransactionHeartbeat MT4TransactionHeartbeat}
     * @see DateTime
     */
    public MT4TransactionHeartbeat setTime(String time) {
        this.time = new DateTime(time);
        return this;
    }

    @Override
    public String toString() {
        return "MT4TransactionHeartbeat(" +
            "type=" +
                (type == null ? "null" : type.toString()) + ", " +
            "time=" +
                (time == null ? "null" : time.toString()) +
            ")";
    }
}
