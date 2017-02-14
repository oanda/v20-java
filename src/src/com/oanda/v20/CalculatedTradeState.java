package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* The dynamic (calculated) state of an open Trade
*/

public class CalculatedTradeState {

    @SerializedName("id") private TradeID _id;
    public CalculatedTradeState set_id(String __id) { 
        this._id = new TradeID(__id); 
        return this;
    }
    /**
    * The Trade's ID.
    */

    public String get_id() {
        return this._id.get_TradeID();
    }

    @SerializedName("unrealizedPL") private AccountUnits _unrealizedPL;
    // Numeric stored as String
    public CalculatedTradeState set_unrealizedPL(double __unrealizedPL) { 
        this._unrealizedPL = new AccountUnits(__unrealizedPL); 
        return this;
    }
    /**
    * The Trade's unrealized profit/loss.
    */

    public double get_unrealizedPL() {
        return this._unrealizedPL.get_AccountUnits();
    }
}
