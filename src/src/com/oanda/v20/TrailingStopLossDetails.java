package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* TrailingStopLossDetails specifies the details of a Trailing Stop Loss Order
* to be created on behalf of a client. This may happen when an Order is filled
* that opens a Trade requiring a Trailing Stop Loss, or when a Trade's
* dependent Trailing Stop Loss Order is modified directly through the Trade.
*/

public class TrailingStopLossDetails {

    @SerializedName("distance") private PriceValue _distance;
    // Numeric stored as String
    public TrailingStopLossDetails set_distance(double __distance) { 
        this._distance = new PriceValue(__distance); 
        return this;
    }
    /**
    * The distance (in price units) from the Trade's fill price that the
    * Trailing Stop Loss Order will be triggered at.
    */

    public double get_distance() {
        return this._distance.get_PriceValue();
    }

    @SerializedName("timeInForce") private TimeInForce _timeInForce = TimeInForce.GTC;
    public TrailingStopLossDetails set_timeInForce(TimeInForce __timeInForce) { 
        this._timeInForce = __timeInForce;
        return this;
    }
    /**
    * The time in force for the created Trailing Stop Loss Order. This may only
    * be GTC, GTD or GFD.
    */

    public TimeInForce get_timeInForce() {
        return this._timeInForce;
    }

    @SerializedName("gtdTime") private DateTime _gtdTime;
    public TrailingStopLossDetails set_gtdTime(String __gtdTime) { 
        this._gtdTime = new DateTime(__gtdTime); 
        return this;
    }
    /**
    * The date when the Trailing Stop Loss Order will be cancelled on if
    * timeInForce is GTD.
    */

    public String get_gtdTime() {
        return this._gtdTime.get_DateTime();
    }

    @SerializedName("clientExtensions") private ClientExtensions _clientExtensions;
    public TrailingStopLossDetails set_clientExtensions(ClientExtensions __clientExtensions) { 
        this._clientExtensions = __clientExtensions;
        return this;
    }
    /**
    * The Client Extensions to add to the Trailing Stop Loss Order when
    * created.
    */

    public ClientExtensions get_clientExtensions() {
        return this._clientExtensions;
    }
}
