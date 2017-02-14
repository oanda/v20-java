package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* The Candlestick representation
*/

public class Candlestick {

    @SerializedName("time") private DateTime _time;
    public Candlestick set_time(String __time) { 
        this._time = new DateTime(__time); 
        return this;
    }
    /**
    * The start time of the candlestick
    */

    public String get_time() {
        return this._time.get_DateTime();
    }

    @SerializedName("bid") private CandlestickData _bid;
    public Candlestick set_bid(CandlestickData __bid) { 
        this._bid = __bid;
        return this;
    }
    /**
    * The candlestick data based on bids. Only provided if bid-based candles
    * were requested.
    */

    public CandlestickData get_bid() {
        return this._bid;
    }

    @SerializedName("ask") private CandlestickData _ask;
    public Candlestick set_ask(CandlestickData __ask) { 
        this._ask = __ask;
        return this;
    }
    /**
    * The candlestick data based on asks. Only provided if ask-based candles
    * were requested.
    */

    public CandlestickData get_ask() {
        return this._ask;
    }

    @SerializedName("mid") private CandlestickData _mid;
    public Candlestick set_mid(CandlestickData __mid) { 
        this._mid = __mid;
        return this;
    }
    /**
    * The candlestick data based on midpoints. Only provided if midpoint-based
    * candles were requested.
    */

    public CandlestickData get_mid() {
        return this._mid;
    }

    @SerializedName("volume") private Integer _volume;
    public Candlestick set_volume(int __volume) {
        this._volume = __volume;
        return this;
    }
    /**
    * The number of prices created during the time-range represented by the
    * candlestick.
    */

    public int get_volume() {
        return this._volume;
    }

    @SerializedName("complete") private Boolean _complete;
    public Candlestick set_complete(boolean __complete) {
        this._complete = __complete;
        return this;
    }
    /**
    * A flag indicating if the candlestick is complete. A complete candlestick
    * is one whose ending time is not in the future.
    */

    public boolean get_complete() {
        return this._complete;
    }
}
