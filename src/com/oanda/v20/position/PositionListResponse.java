package com.oanda.v20.position;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.transaction.TransactionID;

/**
 * PositionListResponse
 */
public class PositionListResponse {

    /**
     * PositionListResponse Constructor
     * <p>
     * Construct a new PositionListResponse
     */
    private PositionListResponse() {
    }

    @SerializedName("positions") private ArrayList<Position> positions;

    /**
     * Get the positions
     * <p>
     * The list of Account Positions.
     * <p>
     * @return the positions
     * @see Position
     */
    public List<Position> getPositions() {
        return this.positions;
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
