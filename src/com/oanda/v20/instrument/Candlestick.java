package com.oanda.v20.instrument;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.primitives.DateTime;

/**
 * The Candlestick representation
 */
public class Candlestick {

    /**
     * Default constructor.
     */
    public Candlestick() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the Candlestick to copy
     */
    public Candlestick(Candlestick other) {
        this.time = other.time;
        if (other.bid != null)
        {
            this.bid = new CandlestickData(other.bid);
        }
        if (other.ask != null)
        {
            this.ask = new CandlestickData(other.ask);
        }
        if (other.mid != null)
        {
            this.mid = new CandlestickData(other.mid);
        }
        if (other.volume != null)
        {
            this.volume = new Long(other.volume);
        }
        if (other.complete != null)
        {
            this.complete = new Boolean(other.complete);
        }
    }

    @SerializedName("time") private DateTime time;

    /**
     * Get the time
     * <p>
     * The start time of the candlestick
     * <p>
     * @return the time
     * @see DateTime
     */
    public DateTime getTime() {
        return this.time;
    }

    /**
     * Set the time
     * <p>
     * The start time of the candlestick
     * <p>
     * @param time the time as a DateTime
     * @return {@link Candlestick Candlestick}
     * @see DateTime
     */
    public Candlestick setTime(DateTime time) {
        this.time = time;
        return this;
    }
    /**
     * Set the time
     * <p>
     * The start time of the candlestick
     * <p>
     * @param time the time as a String
     * @return {@link Candlestick Candlestick}
     * @see DateTime
     */
    public Candlestick setTime(String time) {
        this.time = new DateTime(time);
        return this;
    }

    @SerializedName("bid") private CandlestickData bid;

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

    /**
     * Set the bid
     * <p>
     * The candlestick data based on bids. Only provided if bid-based candles
     * were requested.
     * <p>
     * @param bid the bid as a CandlestickData
     * @return {@link Candlestick Candlestick}
     * @see CandlestickData
     */
    public Candlestick setBid(CandlestickData bid) {
        this.bid = bid;
        return this;
    }

    @SerializedName("ask") private CandlestickData ask;

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

    /**
     * Set the ask
     * <p>
     * The candlestick data based on asks. Only provided if ask-based candles
     * were requested.
     * <p>
     * @param ask the ask as a CandlestickData
     * @return {@link Candlestick Candlestick}
     * @see CandlestickData
     */
    public Candlestick setAsk(CandlestickData ask) {
        this.ask = ask;
        return this;
    }

    @SerializedName("mid") private CandlestickData mid;

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

    /**
     * Set the mid
     * <p>
     * The candlestick data based on midpoints. Only provided if midpoint-based
     * candles were requested.
     * <p>
     * @param mid the mid as a CandlestickData
     * @return {@link Candlestick Candlestick}
     * @see CandlestickData
     */
    public Candlestick setMid(CandlestickData mid) {
        this.mid = mid;
        return this;
    }

    @SerializedName("volume") private Long volume;

    /**
     * Get the volume
     * <p>
     * The number of prices created during the time-range represented by the
     * candlestick.
     * <p>
     * @return the volume
     */
    public Long getVolume() {
        return this.volume;
    }

    /**
     * Set the volume
     * <p>
     * The number of prices created during the time-range represented by the
     * candlestick.
     * <p>
     * @param volume the volume as a Long
     * @return {@link Candlestick Candlestick}
     */
    public Candlestick setVolume(Long volume) {
        this.volume = volume;
        return this;
    }

    @SerializedName("complete") private Boolean complete;

    /**
     * Get the complete
     * <p>
     * A flag indicating if the candlestick is complete. A complete candlestick
     * is one whose ending time is not in the future.
     * <p>
     * @return the complete
     */
    public Boolean getComplete() {
        return this.complete;
    }

    /**
     * Set the complete
     * <p>
     * A flag indicating if the candlestick is complete. A complete candlestick
     * is one whose ending time is not in the future.
     * <p>
     * @param complete the complete as a Boolean
     * @return {@link Candlestick Candlestick}
     */
    public Candlestick setComplete(Boolean complete) {
        this.complete = complete;
        return this;
    }

    @Override
    public String toString() {
        return "Candlestick(" +
            "time=" +
                (time == null ? "null" : time.toString()) + ", " +
            "bid=" +
                (bid == null ? "null" : bid.toString()) + ", " +
            "ask=" +
                (ask == null ? "null" : ask.toString()) + ", " +
            "mid=" +
                (mid == null ? "null" : mid.toString()) + ", " +
            "volume=" +
                (volume == null ? "null" : volume.toString()) + ", " +
            "complete=" +
                (complete == null ? "null" : complete.toString()) +
            ")";
    }
}
