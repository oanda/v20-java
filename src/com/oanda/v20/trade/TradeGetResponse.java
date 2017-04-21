package com.oanda.v20.trade;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.transaction.TransactionID;

/**
 * TradeGetResponse
 */
public class TradeGetResponse {

    /**
     * TradeGetResponse Constructor
     * <p>
     * Construct a new TradeGetResponse
     */
    private TradeGetResponse() {
    }

    @SerializedName("trade") private Trade trade;

    /**
     * Get the trade
     * <p>
     * The Account's list of open Trades
     * <p>
     * @return the trade
     * @see Trade
     */
    public Trade getTrade() {
        return this.trade;
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
