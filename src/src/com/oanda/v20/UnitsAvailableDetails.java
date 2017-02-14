package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* Representation of many units of an Instrument are available to be traded for
* both long and short Orders.
*/

public class UnitsAvailableDetails {

    @SerializedName("long") private DecimalNumber _long;
    // Numeric stored as String
    public UnitsAvailableDetails set_long(double __long) { 
        this._long = new DecimalNumber(__long); 
        return this;
    }
    /**
    * The units available for long Orders.
    */

    public double get_long() {
        return this._long.get_DecimalNumber();
    }

    @SerializedName("short") private DecimalNumber _short;
    // Numeric stored as String
    public UnitsAvailableDetails set_short(double __short) { 
        this._short = new DecimalNumber(__short); 
        return this;
    }
    /**
    * The units available for short Orders.
    */

    public double get_short() {
        return this._short.get_DecimalNumber();
    }
}
