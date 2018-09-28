package com.oanda.v20.instrument;

import java.util.HashMap;

import com.oanda.v20.Context;
import com.oanda.v20.ExecuteException;
import com.oanda.v20.RequestException;
import com.oanda.v20.primitives.DateTime;
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

    private HashMap<Integer, Class<?>> priceResponseMap;

    /**
     * Price
     * <p>
     * Fetch a price for an instrument. Accounts are not associated in any way
     *     with this endpoint.
     * <p>
     * @param instrument Name of the Instrument
     * @return {@link InstrumentPriceResponse InstrumentPriceResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see InstrumentName
     * @see RequestException
     * @see ExecuteException
     */
    public InstrumentPriceResponse price(InstrumentName instrument)
        throws RequestException, ExecuteException
    {
        InstrumentPriceRequest request = new InstrumentPriceRequest(instrument);
        return price(request);
    }

    /**
     * Price
     * <p>
     * Fetch a price for an instrument. Accounts are not associated in any way
     *     with this endpoint.
     * <p>
     * @param request the InstrumentPriceRequest
     * @return {@link InstrumentPriceResponse InstrumentPriceResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see RequestException
     * @see ExecuteException
     */
    public InstrumentPriceResponse price(InstrumentPriceRequest request)
        throws RequestException, ExecuteException
    {
        if (priceResponseMap == null) {
            priceResponseMap = new HashMap<>();
            priceResponseMap.put(200, InstrumentPriceResponse.class);
        }

        return (InstrumentPriceResponse) ctx.execute(
            "GET",
            "/v3/instruments/{instrument}/price",
            request,
            priceResponseMap
        );
    }

    private HashMap<Integer, Class<?>> pricesResponseMap;

    /**
     * Get Prices
     * <p>
     * Fetch a range of prices for an instrument. Accounts are not associated
     *     in any way with this endpoint.
     * <p>
     * @param instrument Name of the Instrument
     * @param fromTime The start of the time range to fetch prices for.
     * @return {@link InstrumentPricesResponse InstrumentPricesResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see InstrumentName
     * @see DateTime
     * @see RequestException
     * @see ExecuteException
     */
    public InstrumentPricesResponse prices(InstrumentName instrument, DateTime fromTime)
        throws RequestException, ExecuteException
    {
        InstrumentPricesRequest request = new InstrumentPricesRequest(instrument, fromTime);
        return prices(request);
    }

    /**
     * Get Prices
     * <p>
     * Fetch a range of prices for an instrument. Accounts are not associated
     *     in any way with this endpoint.
     * <p>
     * @param request the InstrumentPricesRequest
     * @return {@link InstrumentPricesResponse InstrumentPricesResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see RequestException
     * @see ExecuteException
     */
    public InstrumentPricesResponse prices(InstrumentPricesRequest request)
        throws RequestException, ExecuteException
    {
        if (pricesResponseMap == null) {
            pricesResponseMap = new HashMap<>();
            pricesResponseMap.put(200, InstrumentPricesResponse.class);
        }

        return (InstrumentPricesResponse) ctx.execute(
            "GET",
            "/v3/instruments/{instrument}/price/range",
            request,
            pricesResponseMap
        );
    }

    private HashMap<Integer, Class<?>> orderBookResponseMap;

    /**
     * Get Order Book
     * <p>
     * Fetch an order book for an instrument.
     * <p>
     * @param instrument Name of the Instrument
     * @return {@link InstrumentOrderBookResponse InstrumentOrderBookResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see InstrumentName
     * @see RequestException
     * @see ExecuteException
     */
    public InstrumentOrderBookResponse orderBook(InstrumentName instrument)
        throws RequestException, ExecuteException
    {
        InstrumentOrderBookRequest request = new InstrumentOrderBookRequest(instrument);
        return orderBook(request);
    }

    /**
     * Get Order Book
     * <p>
     * Fetch an order book for an instrument.
     * <p>
     * @param request the InstrumentOrderBookRequest
     * @return {@link InstrumentOrderBookResponse InstrumentOrderBookResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see RequestException
     * @see ExecuteException
     */
    public InstrumentOrderBookResponse orderBook(InstrumentOrderBookRequest request)
        throws RequestException, ExecuteException
    {
        if (orderBookResponseMap == null) {
            orderBookResponseMap = new HashMap<>();
            orderBookResponseMap.put(200, InstrumentOrderBookResponse.class);
        }

        return (InstrumentOrderBookResponse) ctx.execute(
            "GET",
            "/v3/instruments/{instrument}/orderBook",
            request,
            orderBookResponseMap
        );
    }

    private HashMap<Integer, Class<?>> positionBookResponseMap;

    /**
     * Get Position Book
     * <p>
     * Fetch a position book for an instrument.
     * <p>
     * @param instrument Name of the Instrument
     * @return {@link InstrumentPositionBookResponse
     *     InstrumentPositionBookResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see InstrumentName
     * @see RequestException
     * @see ExecuteException
     */
    public InstrumentPositionBookResponse positionBook(InstrumentName instrument)
        throws RequestException, ExecuteException
    {
        InstrumentPositionBookRequest request = new InstrumentPositionBookRequest(instrument);
        return positionBook(request);
    }

    /**
     * Get Position Book
     * <p>
     * Fetch a position book for an instrument.
     * <p>
     * @param request the InstrumentPositionBookRequest
     * @return {@link InstrumentPositionBookResponse
     *     InstrumentPositionBookResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see RequestException
     * @see ExecuteException
     */
    public InstrumentPositionBookResponse positionBook(InstrumentPositionBookRequest request)
        throws RequestException, ExecuteException
    {
        if (positionBookResponseMap == null) {
            positionBookResponseMap = new HashMap<>();
            positionBookResponseMap.put(200, InstrumentPositionBookResponse.class);
        }

        return (InstrumentPositionBookResponse) ctx.execute(
            "GET",
            "/v3/instruments/{instrument}/positionBook",
            request,
            positionBookResponseMap
        );
    }
}
