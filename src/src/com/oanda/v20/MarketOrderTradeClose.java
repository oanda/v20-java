package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A MarketOrderTradeClose specifies the extensions to a Market Order that has
* been created specifically to close a Trade.
*/

public class MarketOrderTradeClose {

    @SerializedName("tradeID") private TradeID _tradeID;
    public MarketOrderTradeClose set_tradeID(String __tradeID) { 
        this._tradeID = new TradeID(__tradeID); 
        return this;
    }
    /**
    * The ID of the Trade requested to be closed
    */

    public String get_tradeID() {
        return this._tradeID.get_TradeID();
    }

    @SerializedName("clientTradeID") private String _clientTradeID;
    public MarketOrderTradeClose set_clientTradeID(String __clientTradeID) {
        this._clientTradeID = __clientTradeID;
        return this;
    }
    /**
    * The client ID of the Trade requested to be closed
    */

    public String get_clientTradeID() {
        return this._clientTradeID;
    }

    @SerializedName("units") private String _units;
    public MarketOrderTradeClose set_units(String __units) {
        this._units = __units;
        return this;
    }
    /**
    * Indication of how much of the Trade to close. Either "ALL", or a
    * DecimalNumber reflection a partial close of the Trade.
    */

    public String get_units() {
        return this._units;
    }
}
