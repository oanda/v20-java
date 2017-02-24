package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * The Candlestick representation
 */
public class Candlestick {

    @SerializedName("time") private DateTime time;

    /**
     * Set the time
     * <p>
     * The start time of the candlestick
     * <p>
     * @param time the time
     * @return {@link Candlestick Candlestick}
     * @see DateTime
     */
    public Candlestick setTime(String time) {
        this.time = new DateTime(time);
        return this;
    }

    /**
     * Get the time
     * <p>
     * The start time of the candlestick
     * <p>
     * @return the time
     * @see DateTime
     */
    public String getTime() {
        return this.time.getDateTime();
    }

    @SerializedName("bid") private CandlestickData bid;

    /**
     * Set the bid
     * <p>
     * The candlestick data based on bids. Only provided if bid-based candles
     * were requested.
     * <p>
     * @param bid the bid
     * @return {@link Candlestick Candlestick}
     * @see CandlestickData
     */
    public Candlestick setBid(CandlestickData bid) {
        this.bid = bid;
        return this;
    }

    /**
     * Get the bid
     * <p>
     * The candlestick data based on bids. Only provided if bid-based candles
     * were requested.
     * <p>
     * @return the bid
     * @see CandlestickData
     */
    public CandlestickData getBid() {
        return this.bid;
    }

    @SerializedName("ask") private CandlestickData ask;

    /**
     * Set the ask
     * <p>
     * The candlestick data based on asks. Only provided if ask-based candles
     * were requested.
     * <p>
     * @param ask the ask
     * @return {@link Candlestick Candlestick}
     * @see CandlestickData
     */
    public Candlestick setAsk(CandlestickData ask) {
        this.ask = ask;
        return this;
    }

    /**
     * Get the ask
     * <p>
     * The candlestick data based on asks. Only provided if ask-based candles
     * were requested.
     * <p>
     * @return the ask
     * @see CandlestickData
     */
    public CandlestickData getAsk() {
        return this.ask;
    }

    @SerializedName("mid") private CandlestickData mid;

    /**
     * Set the mid
     * <p>
     * The candlestick data based on midpoints. Only provided if midpoint-based
     * candles were requested.
     * <p>
     * @param mid the mid
     * @return {@link Candlestick Candlestick}
     * @see CandlestickData
     */
    public Candlestick setMid(CandlestickData mid) {
        this.mid = mid;
        return this;
    }

    /**
     * Get the mid
     * <p>
     * The candlestick data based on midpoints. Only provided if midpoint-based
     * candles were requested.
     * <p>
     * @return the mid
     * @see CandlestickData
     */
    public CandlestickData getMid() {
        return this.mid;
    }

    @SerializedName("volume") private Integer volume;

    /**
     * Set the volume
     * <p>
     * The number of prices created during the time-range represented by the
     * candlestick.
     * <p>
     * @param volume the volume
     * @return {@link Candlestick Candlestick}
     */
    public Candlestick setVolume(int volume) {
        this.volume = volume;
        return this;
    }

    /**
     * Get the volume
     * <p>
     * The number of prices created during the time-range represented by the
     * candlestick.
     * <p>
     * @return the volume
     */
    public int getVolume() {
        return this.volume;
    }

    @SerializedName("complete") private Boolean complete;

    /**
     * Set the complete
     * <p>
     * A flag indicating if the candlestick is complete. A complete candlestick
     * is one whose ending time is not in the future.
     * <p>
     * @param complete the complete
     * @return {@link Candlestick Candlestick}
     */
    public Candlestick setComplete(boolean complete) {
        this.complete = complete;
        return this;
    }

    /**
     * Get the complete
     * <p>
     * A flag indicating if the candlestick is complete. A complete candlestick
     * is one whose ending time is not in the future.
     * <p>
     * @return the complete
     */
    public boolean getComplete() {
        return this.complete;
    }
}
