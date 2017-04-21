package com.oanda.v20.instrument;

import java.util.HashMap;

import com.oanda.v20.Context;
import com.oanda.v20.ExecuteException;
import com.oanda.v20.RequestException;
import com.oanda.v20.primitives.InstrumentName;

public class InstrumentContext {

    private Context ctx;

    /**
     * Default constructor
     * <p>
     * @param ctx Context object
     * @see Context
     */
    public InstrumentContext(Context ctx) {
        this.ctx = ctx;
    }

    private HashMap<Integer, Class<?>> candlesResponseMap;

    /**
     * Get Candlesticks
     * <p>
     * Fetch candlestick data for an instrument.
     * <p>
     * @param instrument Name of the Instrument
     * @return {@link InstrumentCandlesResponse InstrumentCandlesResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see InstrumentName
     * @see RequestException
     * @see ExecuteException
     */
    public InstrumentCandlesResponse candles(InstrumentName instrument)
        throws RequestException, ExecuteException
    {
        InstrumentCandlesRequest request = new InstrumentCandlesRequest(instrument);
        return candles(request);
    }

    /**
     * Get Candlesticks
     * <p>
     * Fetch candlestick data for an instrument.
     * <p>
     * @param request the InstrumentCandlesRequest
     * @return {@link InstrumentCandlesResponse InstrumentCandlesResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see RequestException
     * @see ExecuteException
     */
    public InstrumentCandlesResponse candles(InstrumentCandlesRequest request)
        throws RequestException, ExecuteException
    {
        if (candlesResponseMap == null) {
            candlesResponseMap = new HashMap<>();
            candlesResponseMap.put(200, InstrumentCandlesResponse.class);
        }

        return (InstrumentCandlesResponse) ctx.execute(
            "GET",
            "/v3/instruments/{instrument}/candles",
            request,
            candlesResponseMap
        );
    }
}
