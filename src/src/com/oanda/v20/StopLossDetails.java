package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* StopLossDetails specifies the details of a Stop Loss Order to be created on
* behalf of a client. This may happen when an Order is filled that opens a
* Trade requiring a Stop Loss, or when a Trade's dependent Stop Loss Order is
* modified directly through the Trade.
*/

public class StopLossDetails {

    @SerializedName("price") private PriceValue _price;
    // Numeric stored as String
    public StopLossDetails set_price(double __price) { 
        this._price = new PriceValue(__price); 
        return this;
    }
    /**
    * The price that the Stop Loss Order will be triggered at.
    */

    public double get_price() {
        return this._price.get_PriceValue();
    }

    @SerializedName("timeInForce") private TimeInForce _timeInForce = TimeInForce.GTC;
    public StopLossDetails set_timeInForce(TimeInForce __timeInForce) { 
        this._timeInForce = __timeInForce;
        return this;
    }
    /**
    * The time in force for the created Stop Loss Order. This may only be GTC,
    * GTD or GFD.
    */

    public TimeInForce get_timeInForce() {
        return this._timeInForce;
    }

    @SerializedName("gtdTime") private DateTime _gtdTime;
    public StopLossDetails set_gtdTime(String __gtdTime) { 
        this._gtdTime = new DateTime(__gtdTime); 
        return this;
    }
    /**
    * The date when the Stop Loss Order will be cancelled on if timeInForce is
    * GTD.
    */

    public String get_gtdTime() {
        return this._gtdTime.get_DateTime();
    }

    @SerializedName("clientExtensions") private ClientExtensions _clientExtensions;
    public StopLossDetails set_clientExtensions(ClientExtensions __clientExtensions) { 
        this._clientExtensions = __clientExtensions;
        return this;
    }
    /**
    * The Client Extensions to add to the Stop Loss Order when created.
    */

    public ClientExtensions get_clientExtensions() {
        return this._clientExtensions;
    }
}
