package com.oanda.v20.position;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.transaction.TransactionID;

/**
 * PositionListOpenResponse
 */
public class PositionListOpenResponse {

    /**
     * PositionListOpenResponse Constructor
     * <p>
     * Construct a new PositionListOpenResponse
     */
    private PositionListOpenResponse() {
    }

    @SerializedName("positions") private ArrayList<Position> positions;

    /**
     * Get the positions
     * <p>
     * The list of open Positions in the Account.
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
