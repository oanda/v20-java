package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A TradeReduce object represents a Trade for an instrument that was reduced
* (either partially or fully) in an Account. It is found embedded in
* Transactions that affect the position of an instrument in the account,
* specifically the OrderFill Transaction.
*/

public class TradeReduce {

    @SerializedName("tradeID") private TradeID _tradeID;
    public TradeReduce set_tradeID(String __tradeID) { 
        this._tradeID = new TradeID(__tradeID); 
        return this;
    }
    /**
    * The ID of the Trade that was reduced or closed
    */

    public String get_tradeID() {
        return this._tradeID.get_TradeID();
    }

    @SerializedName("units") private DecimalNumber _units;
    // Numeric stored as String
    public TradeReduce set_units(double __units) { 
        this._units = new DecimalNumber(__units); 
        return this;
    }
    /**
    * The number of units that the Trade was reduced by
    */

    public double get_units() {
        return this._units.get_DecimalNumber();
    }

    @SerializedName("realizedPL") private AccountUnits _realizedPL;
    // Numeric stored as String
    public TradeReduce set_realizedPL(double __realizedPL) { 
        this._realizedPL = new AccountUnits(__realizedPL); 
        return this;
    }
    /**
    * The PL realized when reducing the Trade
    */

    public double get_realizedPL() {
        return this._realizedPL.get_AccountUnits();
    }

    @SerializedName("financing") private AccountUnits _financing;
    // Numeric stored as String
    public TradeReduce set_financing(double __financing) { 
        this._financing = new AccountUnits(__financing); 
        return this;
    }
    /**
    * The financing paid/collected when reducing the Trade
    */

    public double get_financing() {
        return this._financing.get_AccountUnits();
    }
}
