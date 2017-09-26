package com.oanda.v20.transaction;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.primitives.DateTime;

/**
 * A TransactionHeartbeat object is injected into the Transaction stream to
 * ensure that the HTTP connection remains active.
 * <p>
 * Transaction Heartbeat {time}
 */
public class TransactionHeartbeat {

    /**
     * Default constructor.
     */
    public TransactionHeartbeat() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the TransactionHeartbeat to copy
     */
    public TransactionHeartbeat(TransactionHeartbeat other) {
        this.type = other.type;
        this.lastTransactionID = other.lastTransactionID;
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
     * @return {@link TransactionHeartbeat TransactionHeartbeat}
     */
    public TransactionHeartbeat setType(String type) {
        this.type = type;
        return this;
    }

    @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

    /**
     * Get the lastTransactionID
     * <p>
     * The ID of the most recent Transaction created for the Account
     * <p>
     * @return the lastTransactionID
     * @see TransactionID
     */
    public TransactionID getLastTransactionID() {
        return this.lastTransactionID;
    }

    /**
     * Set the lastTransactionID
     * <p>
     * The ID of the most recent Transaction created for the Account
     * <p>
     * @param lastTransactionID the lastTransactionID as a TransactionID
     * @return {@link TransactionHeartbeat TransactionHeartbeat}
     * @see TransactionID
     */
    public TransactionHeartbeat setLastTransactionID(TransactionID lastTransactionID) {
        this.lastTransactionID = lastTransactionID;
        return this;
    }
    /**
     * Set the lastTransactionID
     * <p>
     * The ID of the most recent Transaction created for the Account
     * <p>
     * @param lastTransactionID the lastTransactionID as a String
     * @return {@link TransactionHeartbeat TransactionHeartbeat}
     * @see TransactionID
     */
    public TransactionHeartbeat setLastTransactionID(String lastTransactionID) {
        this.lastTransactionID = new TransactionID(lastTransactionID);
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
     * @return {@link TransactionHeartbeat TransactionHeartbeat}
     * @see DateTime
     */
    public TransactionHeartbeat setTime(DateTime time) {
        this.time = time;
        return this;
    }
    /**
     * Set the time
     * <p>
     * The date/time when the TransactionHeartbeat was created.
     * <p>
     * @param time the time as a String
     * @return {@link TransactionHeartbeat TransactionHeartbeat}
     * @see DateTime
     */
    public TransactionHeartbeat setTime(String time) {
        this.time = new DateTime(time);
        return this;
    }

    @Override
    public String toString() {
        return "TransactionHeartbeat(" +
            "type=" +
                (type == null ? "null" : type.toString()) + ", " +
            "lastTransactionID=" +
                (lastTransactionID == null ? "null" : lastTransactionID.toString()) + ", " +
            "time=" +
                (time == null ? "null" : time.toString()) +
            ")";
    }
}
