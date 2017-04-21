package com.oanda.v20.instrument;

/**
 * The granularity of a candlestick
 */
public enum CandlestickGranularity {

    /**
     * 5 second candlesticks, minute alignment
     */
    S5,

    /**
     * 10 second candlesticks, minute alignment
     */
    S10,

    /**
     * 15 second candlesticks, minute alignment
     */
    S15,

    /**
     * 30 second candlesticks, minute alignment
     */
    S30,

    /**
     * 1 minute candlesticks, minute alignment
     */
    M1,

    /**
     * 2 minute candlesticks, hour alignment
     */
    M2,

    /**
     * 4 minute candlesticks, hour alignment
     */
    M4,

    /**
     * 5 minute candlesticks, hour alignment
     */
    M5,

    /**
     * 10 minute candlesticks, hour alignment
     */
    M10,

    /**
     * 15 minute candlesticks, hour alignment
     */
    M15,

    /**
     * 30 minute candlesticks, hour alignment
     */
    M30,

    /**
     * 1 hour candlesticks, hour alignment
     */
    H1,

    /**
     * 2 hour candlesticks, day alignment
     */
    H2,

    /**
     * 3 hour candlesticks, day alignment
     */
    H3,

    /**
     * 4 hour candlesticks, day alignment
     */
    H4,

    /**
     * 6 hour candlesticks, day alignment
     */
    H6,

    /**
     * 8 hour candlesticks, day alignment
     */
    H8,

    /**
     * 12 hour candlesticks, day alignment
     */
    H12,

    /**
     * 1 day candlesticks, day alignment
     */
    D,

    /**
     * 1 week candlesticks, aligned to start of week
     */
    W,

    /**
     * 1 month candlesticks, aligned to first day of the month
     */
    M
}
