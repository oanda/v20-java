package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* Details for the Market Order extensions specific to a Market Order placed
* with the intent of fully closing a specific open trade that should have
* already been closed but wasn't due to halted market conditions
*/

public class MarketOrderDelayedTradeClose {

    @SerializedName("tradeID") private TradeID _tradeID;
    public MarketOrderDelayedTradeClose set_tradeID(String __tradeID) { 
        this._tradeID = new TradeID(__tradeID); 
        return this;
    }
    /**
    * The ID of the Trade being closed
    */

    public String get_tradeID() {
        return this._tradeID.get_TradeID();
    }

    @SerializedName("clientTradeID") private TradeID _clientTradeID;
    public MarketOrderDelayedTradeClose set_clientTradeID(String __clientTradeID) { 
        this._clientTradeID = new TradeID(__clientTradeID); 
        return this;
    }
    /**
    * The Client ID of the Trade being closed
    */

    public String get_clientTradeID() {
        return this._clientTradeID.get_TradeID();
    }

    @SerializedName("sourceTransactionID") private TransactionID _sourceTransactionID;
    public MarketOrderDelayedTradeClose set_sourceTransactionID(String __sourceTransactionID) { 
        this._sourceTransactionID = new TransactionID(__sourceTransactionID); 
        return this;
    }
    /**
    * The Transaction ID of the DelayedTradeClosure transaction to which this
    * Delayed Trade Close belongs to
    */

    public String get_sourceTransactionID() {
        return this._sourceTransactionID.get_TransactionID();
    }
}
