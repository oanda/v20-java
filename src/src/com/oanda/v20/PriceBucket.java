package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A Price Bucket represents a price available for an amount of liquidity
*/

public class PriceBucket {

    @SerializedName("price") private PriceValue _price;
    // Numeric stored as String
    public PriceBucket set_price(double __price) { 
        this._price = new PriceValue(__price); 
        return this;
    }
    /**
    * The Price offered by the PriceBucket
    */

    public double get_price() {
        return this._price.get_PriceValue();
    }

    @SerializedName("liquidity") private Integer _liquidity;
    public PriceBucket set_liquidity(int __liquidity) {
        this._liquidity = __liquidity;
        return this;
    }
    /**
    * The amount of liquidity offered by the PriceBucket
    */

    public int get_liquidity() {
        return this._liquidity;
    }
}
