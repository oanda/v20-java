package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* The price data (open, high, low, close) for the Candlestick representation.
*/

public class CandlestickData {

    @SerializedName("o") private PriceValue _o;
    // Numeric stored as String
    public CandlestickData set_o(double __o) { 
        this._o = new PriceValue(__o); 
        return this;
    }
    /**
    * The first (open) price in the time-range represented by the candlestick.
    */

    public double get_o() {
        return this._o.get_PriceValue();
    }

    @SerializedName("h") private PriceValue _h;
    // Numeric stored as String
    public CandlestickData set_h(double __h) { 
        this._h = new PriceValue(__h); 
        return this;
    }
    /**
    * The highest price in the time-range represented by the candlestick.
    */

    public double get_h() {
        return this._h.get_PriceValue();
    }

    @SerializedName("l") private PriceValue _l;
    // Numeric stored as String
    public CandlestickData set_l(double __l) { 
        this._l = new PriceValue(__l); 
        return this;
    }
    /**
    * The lowest price in the time-range represented by the candlestick.
    */

    public double get_l() {
        return this._l.get_PriceValue();
    }

    @SerializedName("c") private PriceValue _c;
    // Numeric stored as String
    public CandlestickData set_c(double __c) { 
        this._c = new PriceValue(__c); 
        return this;
    }
    /**
    * The last (closing) price in the time-range represented by the
    * candlestick.
    */

    public double get_c() {
        return this._c.get_PriceValue();
    }
}
