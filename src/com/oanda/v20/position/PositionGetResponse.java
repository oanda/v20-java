package com.oanda.v20.position;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.transaction.TransactionID;

/**
 * PositionGetResponse
 */
public class PositionGetResponse {

    /**
     * PositionGetResponse Constructor
     * <p>
     * Construct a new PositionGetResponse
     */
    private PositionGetResponse() {
    }

    @SerializedName("position") private Position position;

    /**
     * Get the position
     * <p>
     * The requested Position.
     * <p>
     * @return the position
     * @see Position
     */
    public Position getPosition() {
        return this.position;
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
}
