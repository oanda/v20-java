package com.oanda.v20.instrument;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.primitives.InstrumentName;

/**
 * InstrumentCandlesResponse
 */
public class InstrumentCandlesResponse {

    /**
     * InstrumentCandlesResponse Constructor
     * <p>
     * Construct a new InstrumentCandlesResponse
     */
    private InstrumentCandlesResponse() {
    }

    @SerializedName("instrument") private InstrumentName instrument;

    /**
     * Get the instrument
     * <p>
     * The instrument whose Prices are represented by the candlesticks.
     * <p>
     * @return the instrument
     * @see InstrumentName
     */
    public InstrumentName getInstrument() {
        return this.instrument;
    }

    @SerializedName("granularity") private CandlestickGranularity granularity;

    /**
     * Get the granularity
     * <p>
     * The granularity of the candlesticks provided.
     * <p>
     * @return the granularity
     * @see CandlestickGranularity
     */
    public CandlestickGranularity getGranularity() {
        return this.granularity;
    }

    @SerializedName("candles") private ArrayList<Candlestick> candles;

    /**
     * Get the candles
     * <p>
     * The list of candlesticks that satisfy the request.
     * <p>
     * @return the candles
     * @see Candlestick
     */
    public List<Candlestick> getCandles() {
        return this.candles;
    }
}
