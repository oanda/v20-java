package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A VWAP Receipt provides a record of how the price for an Order fill is
* constructed. If the Order is filled with multiple buckets in a depth of
* market, each bucket will be represented with a VWAP Receipt.
*/

public class VWAPReceipt {

    @SerializedName("units") private DecimalNumber _units;
    // Numeric stored as String
    public VWAPReceipt set_units(double __units) { 
        this._units = new DecimalNumber(__units); 
        return this;
    }
    /**
    * The number of units filled
    */

    public double get_units() {
        return this._units.get_DecimalNumber();
    }

    @SerializedName("price") private PriceValue _price;
    // Numeric stored as String
    public VWAPReceipt set_price(double __price) { 
        this._price = new PriceValue(__price); 
        return this;
    }
    /**
    * The price at which the units were filled
    */

    public double get_price() {
        return this._price.get_PriceValue();
    }
}
