package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* OpenTradeFinancing is used to pay/collect daily financing charge for an open
* Trade within an Account
*/

public class OpenTradeFinancing {

    @SerializedName("tradeID") private TradeID _tradeID;
    public OpenTradeFinancing set_tradeID(String __tradeID) { 
        this._tradeID = new TradeID(__tradeID); 
        return this;
    }
    /**
    * The ID of the Trade that financing is being paid/collected for.
    */

    public String get_tradeID() {
        return this._tradeID.get_TradeID();
    }

    @SerializedName("financing") private AccountUnits _financing;
    // Numeric stored as String
    public OpenTradeFinancing set_financing(double __financing) { 
        this._financing = new AccountUnits(__financing); 
        return this;
    }
    /**
    * The amount of financing paid/collected for the Trade.
    */

    public double get_financing() {
        return this._financing.get_AccountUnits();
    }
}
