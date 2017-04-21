package com.oanda.v20.trade;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.transaction.TransactionID;

/**
 * TradeListOpenResponse
 */
public class TradeListOpenResponse {

    /**
     * TradeListOpenResponse Constructor
     * <p>
     * Construct a new TradeListOpenResponse
     */
    private TradeListOpenResponse() {
    }

    @SerializedName("trades") private ArrayList<Trade> trades;

    /**
     * Get the trades
     * <p>
     * The Account's list of open Trades
     * <p>
     * @return the trades
     * @see Trade
     */
    public List<Trade> getTrades() {
        return this.trades;
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
