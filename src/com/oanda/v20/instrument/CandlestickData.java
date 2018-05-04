package com.oanda.v20.instrument;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.pricing_common.PriceValue;

/**
 * The price data (open, high, low, close) for the Candlestick representation.
 */
public class CandlestickData {

    /**
     * Default constructor.
     */
    public CandlestickData() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the CandlestickData to copy
     */
    public CandlestickData(CandlestickData other) {
        this.o = other.o;
        this.h = other.h;
        this.l = other.l;
        this.c = other.c;
    }

    @SerializedName("o") private PriceValue o;

    /**
     * Get the o
     * <p>
     * The first (open) price in the time-range represented by the candlestick.
     * <p>
     * @return the o
     * @see PriceValue
     */
    public PriceValue getO() {
        return this.o;
    }

    /**
     * Set the o
     * <p>
     * The first (open) price in the time-range represented by the candlestick.
     * <p>
     * @param o the o as a PriceValue
     * @return {@link CandlestickData CandlestickData}
     * @see PriceValue
     */
    public CandlestickData setO(PriceValue o) {
        this.o = o;
        return this;
    }
    /**
     * Set the o
     * <p>
     * The first (open) price in the time-range represented by the candlestick.
     * <p>
     * @param o the o as a String
     * @return {@link CandlestickData CandlestickData}
     * @see PriceValue
     */
    public CandlestickData setO(String o) {
        this.o = new PriceValue(o);
        return this;
    }
    /**
     * Set the o
     * <p>
     * The first (open) price in the time-range represented by the candlestick.
     * <p>
     * @param o the o as a double
     * @return {@link CandlestickData CandlestickData}
     * @see PriceValue
     */
    public CandlestickData setO(double o) {
        this.o = new PriceValue(o);
        return this;
    }
    /**
     * Set the o
     * <p>
     * The first (open) price in the time-range represented by the candlestick.
     * <p>
     * @param o the o as a BigDecimal
     * @return {@link CandlestickData CandlestickData}
     * @see PriceValue
     */
    public CandlestickData setO(BigDecimal o) {
        this.o = new PriceValue(o);
        return this;
    }

    @SerializedName("h") private PriceValue h;

    /**
     * Get the h
     * <p>
     * The highest price in the time-range represented by the candlestick.
     * <p>
     * @return the h
     * @see PriceValue
     */
    public PriceValue getH() {
        return this.h;
    }

    /**
     * Set the h
     * <p>
     * The highest price in the time-range represented by the candlestick.
     * <p>
     * @param h the h as a PriceValue
     * @return {@link CandlestickData CandlestickData}
     * @see PriceValue
     */
    public CandlestickData setH(PriceValue h) {
        this.h = h;
        return this;
    }
    /**
     * Set the h
     * <p>
     * The highest price in the time-range represented by the candlestick.
     * <p>
     * @param h the h as a String
     * @return {@link CandlestickData CandlestickData}
     * @see PriceValue
     */
    public CandlestickData setH(String h) {
        this.h = new PriceValue(h);
        return this;
    }
    /**
     * Set the h
     * <p>
     * The highest price in the time-range represented by the candlestick.
     * <p>
     * @param h the h as a double
     * @return {@link CandlestickData CandlestickData}
     * @see PriceValue
     */
    public CandlestickData setH(double h) {
        this.h = new PriceValue(h);
        return this;
    }
    /**
     * Set the h
     * <p>
     * The highest price in the time-range represented by the candlestick.
     * <p>
     * @param h the h as a BigDecimal
     * @return {@link CandlestickData CandlestickData}
     * @see PriceValue
     */
    public CandlestickData setH(BigDecimal h) {
        this.h = new PriceValue(h);
        return this;
    }

    @SerializedName("l") private PriceValue l;

    /**
     * Get the l
     * <p>
     * The lowest price in the time-range represented by the candlestick.
     * <p>
     * @return the l
     * @see PriceValue
     */
    public PriceValue getL() {
        return this.l;
    }

    /**
     * Set the l
     * <p>
     * The lowest price in the time-range represented by the candlestick.
     * <p>
     * @param l the l as a PriceValue
     * @return {@link CandlestickData CandlestickData}
     * @see PriceValue
     */
    public CandlestickData setL(PriceValue l) {
        this.l = l;
        return this;
    }
    /**
     * Set the l
     * <p>
     * The lowest price in the time-range represented by the candlestick.
     * <p>
     * @param l the l as a String
     * @return {@link CandlestickData CandlestickData}
     * @see PriceValue
     */
    public CandlestickData setL(String l) {
        this.l = new PriceValue(l);
        return this;
    }
    /**
     * Set the l
     * <p>
     * The lowest price in the time-range represented by the candlestick.
     * <p>
     * @param l the l as a double
     * @return {@link CandlestickData CandlestickData}
     * @see PriceValue
     */
    public CandlestickData setL(double l) {
        this.l = new PriceValue(l);
        return this;
    }
    /**
     * Set the l
     * <p>
     * The lowest price in the time-range represented by the candlestick.
     * <p>
     * @param l the l as a BigDecimal
     * @return {@link CandlestickData CandlestickData}
     * @see PriceValue
     */
    public CandlestickData setL(BigDecimal l) {
        this.l = new PriceValue(l);
        return this;
    }

    @SerializedName("c") private PriceValue c;

    /**
     * Get the c
     * <p>
     * The last (closing) price in the time-range represented by the
     * candlestick.
     * <p>
     * @return the c
     * @see PriceValue
     */
    public PriceValue getC() {
        return this.c;
    }

    /**
     * Set the c
     * <p>
     * The last (closing) price in the time-range represented by the
     * candlestick.
     * <p>
     * @param c the c as a PriceValue
     * @return {@link CandlestickData CandlestickData}
     * @see PriceValue
     */
    public CandlestickData setC(PriceValue c) {
        this.c = c;
        return this;
    }
    /**
     * Set the c
     * <p>
     * The last (closing) price in the time-range represented by the
     * candlestick.
     * <p>
     * @param c the c as a String
     * @return {@link CandlestickData CandlestickData}
     * @see PriceValue
     */
    public CandlestickData setC(String c) {
        this.c = new PriceValue(c);
        return this;
    }
    /**
     * Set the c
     * <p>
     * The last (closing) price in the time-range represented by the
     * candlestick.
     * <p>
     * @param c the c as a double
     * @return {@link CandlestickData CandlestickData}
     * @see PriceValue
     */
    public CandlestickData setC(double c) {
        this.c = new PriceValue(c);
        return this;
    }
    /**
     * Set the c
     * <p>
     * The last (closing) price in the time-range represented by the
     * candlestick.
     * <p>
     * @param c the c as a BigDecimal
     * @return {@link CandlestickData CandlestickData}
     * @see PriceValue
     */
    public CandlestickData setC(BigDecimal c) {
        this.c = new PriceValue(c);
        return this;
    }

    @Override
    public String toString() {
        return "CandlestickData(" +
            "o=" +
                (o == null ? "null" : o.toString()) + ", " +
            "h=" +
                (h == null ? "null" : h.toString()) + ", " +
            "l=" +
                (l == null ? "null" : l.toString()) + ", " +
            "c=" +
                (c == null ? "null" : c.toString()) +
            ")";
    }
}
