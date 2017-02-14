package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A TradeOpen object represents a Trade for an instrument that was opened in an
* Account. It is found embedded in Transactions that affect the position of an
* instrument in the Account, specifically the OrderFill Transaction.
*/

public class TradeOpen {

    @SerializedName("tradeID") private TradeID _tradeID;
    public TradeOpen set_tradeID(String __tradeID) { 
        this._tradeID = new TradeID(__tradeID); 
        return this;
    }
    /**
    * The ID of the Trade that was opened
    */

    public String get_tradeID() {
        return this._tradeID.get_TradeID();
    }

    @SerializedName("units") private DecimalNumber _units;
    // Numeric stored as String
    public TradeOpen set_units(double __units) { 
        this._units = new DecimalNumber(__units); 
        return this;
    }
    /**
    * The number of units opened by the Trade
    */

    public double get_units() {
        return this._units.get_DecimalNumber();
    }

    @SerializedName("clientExtensions") private ClientExtensions _clientExtensions;
    public TradeOpen set_clientExtensions(ClientExtensions __clientExtensions) { 
        this._clientExtensions = __clientExtensions;
        return this;
    }
    /**
    * The client extensions for the newly opened Trade
    */

    public ClientExtensions get_clientExtensions() {
        return this._clientExtensions;
    }
}
