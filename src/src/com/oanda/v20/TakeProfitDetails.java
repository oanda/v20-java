package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* TakeProfitDetails specifies the details of a Take Profit Order to be created
* on behalf of a client. This may happen when an Order is filled that opens a
* Trade requiring a Take Profit, or when a Trade's dependent Take Profit Order
* is modified directly through the Trade.
*/

public class TakeProfitDetails {

    @SerializedName("price") private PriceValue _price;
    // Numeric stored as String
    public TakeProfitDetails set_price(double __price) { 
        this._price = new PriceValue(__price); 
        return this;
    }
    /**
    * The price that the Take Profit Order will be triggered at.
    */

    public double get_price() {
        return this._price.get_PriceValue();
    }

    @SerializedName("timeInForce") private TimeInForce _timeInForce = TimeInForce.GTC;
    public TakeProfitDetails set_timeInForce(TimeInForce __timeInForce) { 
        this._timeInForce = __timeInForce;
        return this;
    }
    /**
    * The time in force for the created Take Profit Order. This may only be
    * GTC, GTD or GFD.
    */

    public TimeInForce get_timeInForce() {
        return this._timeInForce;
    }

    @SerializedName("gtdTime") private DateTime _gtdTime;
    public TakeProfitDetails set_gtdTime(String __gtdTime) { 
        this._gtdTime = new DateTime(__gtdTime); 
        return this;
    }
    /**
    * The date when the Take Profit Order will be cancelled on if timeInForce
    * is GTD.
    */

    public String get_gtdTime() {
        return this._gtdTime.get_DateTime();
    }

    @SerializedName("clientExtensions") private ClientExtensions _clientExtensions;
    public TakeProfitDetails set_clientExtensions(ClientExtensions __clientExtensions) { 
        this._clientExtensions = __clientExtensions;
        return this;
    }
    /**
    * The Client Extensions to add to the Take Profit Order when created.
    */

    public ClientExtensions get_clientExtensions() {
        return this._clientExtensions;
    }
}
