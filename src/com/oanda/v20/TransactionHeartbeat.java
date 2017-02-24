package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * A TransactionHeartbeat object is injected into the Transaction stream to
 * ensure that the HTTP connection remains active.
 * <p>
 * Transaction Heartbeat {time}
 */
public class TransactionHeartbeat {

    @SerializedName("type") private String type;

    /**
     * Set the type
     * <p>
     * The string "HEARTBEAT"
     * <p>
     * @param type the type
     * @return {@link TransactionHeartbeat TransactionHeartbeat}
     */
    public TransactionHeartbeat setType(String type) {
        this.type = type;
        return this;
    }

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

    @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

    /**
     * Set the lastTransactionID
     * <p>
     * The ID of the most recent Transaction created for the Account
     * <p>
     * @param lastTransactionID the lastTransactionID
     * @return {@link TransactionHeartbeat TransactionHeartbeat}
     * @see TransactionID
     */
    public TransactionHeartbeat setLastTransactionID(String lastTransactionID) {
        this.lastTransactionID = new TransactionID(lastTransactionID);
        return this;
    }

    /**
     * Get the lastTransactionID
     * <p>
     * The ID of the most recent Transaction created for the Account
     * <p>
     * @return the lastTransactionID
     * @see TransactionID
     */
    public String getLastTransactionID() {
        return this.lastTransactionID.getTransactionID();
    }

    @SerializedName("time") private DateTime time;

    /**
     * Set the time
     * <p>
     * The date/time when the TransactionHeartbeat was created.
     * <p>
     * @param time the time
     * @return {@link TransactionHeartbeat TransactionHeartbeat}
     * @see DateTime
     */
    public TransactionHeartbeat setTime(String time) {
        this.time = new DateTime(time);
        return this;
    }

    /**
     * Get the time
     * <p>
     * The date/time when the TransactionHeartbeat was created.
     * <p>
     * @return the time
     * @see DateTime
     */
    public String getTime() {
        return this.time.getDateTime();
    }
}
