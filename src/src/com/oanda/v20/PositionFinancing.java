package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* OpenTradeFinancing is used to pay/collect daily financing charge for a
* Position within an Account
*/

public class PositionFinancing {

    @SerializedName("instrumentID") private InstrumentName _instrumentID;
    public PositionFinancing set_instrumentID(String __instrumentID) { 
        this._instrumentID = new InstrumentName(__instrumentID); 
        return this;
    }
    /**
    * The instrument of the Position that financing is being paid/collected
    * for.
    */

    public String get_instrumentID() {
        return this._instrumentID.get_InstrumentName();
    }

    @SerializedName("financing") private AccountUnits _financing;
    // Numeric stored as String
    public PositionFinancing set_financing(double __financing) { 
        this._financing = new AccountUnits(__financing); 
        return this;
    }
    /**
    * The amount of financing paid/collected for the Position.
    */

    public double get_financing() {
        return this._financing.get_AccountUnits();
    }
 
    @SerializedName("openTradeFinancings") private OpenTradeFinancing[] _openTradeFinancings;
    public PositionFinancing set_openTradeFinancings(OpenTradeFinancing[] __openTradeFinancings) {
        this._openTradeFinancings = __openTradeFinancings;
        return this;
    }
    /**
    * The financing paid/collecte for each open Trade within the Position.
    */

    public OpenTradeFinancing[] get_openTradeFinancings() {
        return this._openTradeFinancings;
    }
}
