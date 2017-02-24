package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * The price data (open, high, low, close) for the Candlestick representation.
 */
public class CandlestickData {

    @SerializedName("o") private PriceValue o;

    /**
     * Set the o
     * <p>
     * The first (open) price in the time-range represented by the candlestick.
     * <p>
     * @param o the o
     * @return {@link CandlestickData CandlestickData}
     * @see PriceValue
     */
    public CandlestickData setO(double o) {
        this.o = new PriceValue(o);
        return this;
    }

    /**
     * Get the o
     * <p>
     * The first (open) price in the time-range represented by the candlestick.
     * <p>
     * @return the o
     * @see PriceValue
     */
    public double getO() {
        return this.o.getPriceValue();
    }

    @SerializedName("h") private PriceValue h;

    /**
     * Set the h
     * <p>
     * The highest price in the time-range represented by the candlestick.
     * <p>
     * @param h the h
     * @return {@link CandlestickData CandlestickData}
     * @see PriceValue
     */
    public CandlestickData setH(double h) {
        this.h = new PriceValue(h);
        return this;
    }

    /**
     * Get the h
     * <p>
     * The highest price in the time-range represented by the candlestick.
     * <p>
     * @return the h
     * @see PriceValue
     */
    public double getH() {
        return this.h.getPriceValue();
    }

    @SerializedName("l") private PriceValue l;

    /**
     * Set the l
     * <p>
     * The lowest price in the time-range represented by the candlestick.
     * <p>
     * @param l the l
     * @return {@link CandlestickData CandlestickData}
     * @see PriceValue
     */
    public CandlestickData setL(double l) {
        this.l = new PriceValue(l);
        return this;
    }

    /**
     * Get the l
     * <p>
     * The lowest price in the time-range represented by the candlestick.
     * <p>
     * @return the l
     * @see PriceValue
     */
    public double getL() {
        return this.l.getPriceValue();
    }

    @SerializedName("c") private PriceValue c;

    /**
     * Set the c
     * <p>
     * The last (closing) price in the time-range represented by the
     * candlestick.
     * <p>
     * @param c the c
     * @return {@link CandlestickData CandlestickData}
     * @see PriceValue
     */
    public CandlestickData setC(double c) {
        this.c = new PriceValue(c);
        return this;
    }

    /**
     * Get the c
     * <p>
     * The last (closing) price in the time-range represented by the
     * candlestick.
     * <p>
     * @return the c
     * @see PriceValue
     */
    public double getC() {
        return this.c.getPriceValue();
    }
}
