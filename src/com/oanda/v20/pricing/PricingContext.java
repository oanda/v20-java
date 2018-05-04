package com.oanda.v20.pricing;

import java.util.Collection;
import java.util.HashMap;

import com.oanda.v20.Context;
import com.oanda.v20.ExecuteException;
import com.oanda.v20.RequestException;
import com.oanda.v20.account.AccountID;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.primitives.InstrumentName;

public class PricingContext {

    private Context ctx;

    /**
     * Default constructor
     * <p>
     * @param ctx Context object
     * @see Context
     */
    public PricingContext(Context ctx) {
        this.ctx = ctx;
    }

    private HashMap<Integer, Class<?>> basePricesResponseMap;

    /**
     * Get Base Prices
     * <p>
     * Get pricing information for a specified instrument. Accounts are not
     *     associated in any way with this endpoint.
     * <p>
     * @return {@link PricingBasePricesResponse PricingBasePricesResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see RequestException
     * @see ExecuteException
     */
    public PricingBasePricesResponse basePrices()
        throws RequestException, ExecuteException
    {
        PricingBasePricesRequest request = new PricingBasePricesRequest();
        return basePrices(request);
    }

    /**
     * Get Base Prices
     * <p>
     * Get pricing information for a specified instrument. Accounts are not
     *     associated in any way with this endpoint.
     * <p>
     * @param request the PricingBasePricesRequest
     * @return {@link PricingBasePricesResponse PricingBasePricesResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see RequestException
     * @see ExecuteException
     */
    public PricingBasePricesResponse basePrices(PricingBasePricesRequest request)
        throws RequestException, ExecuteException
    {
        if (basePricesResponseMap == null) {
            basePricesResponseMap = new HashMap<>();
            basePricesResponseMap.put(200, PricingBasePricesResponse.class);
        }

        return (PricingBasePricesResponse) ctx.execute(
            "GET",
            "/v3/pricing",
            request,
            basePricesResponseMap
        );
    }

    private HashMap<Integer, Class<?>> getPriceRangeResponseMap;

    /**
     * Get Price Range
     * <p>
     * Get pricing information for a specified range of prices. Accounts are
     *     not associated in any way with this endpoint.
     * <p>
     * @param instrument Name of the Instrument
     * @param fromTime The start of the time range to fetch prices for.
     * @return {@link PricingGetPriceRangeResponse
     *     PricingGetPriceRangeResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see InstrumentName
     * @see DateTime
     * @see RequestException
     * @see ExecuteException
     */
    public PricingGetPriceRangeResponse getPriceRange(InstrumentName instrument, DateTime fromTime)
        throws RequestException, ExecuteException
    {
        PricingGetPriceRangeRequest request = new PricingGetPriceRangeRequest(instrument, fromTime);
        return getPriceRange(request);
    }

    /**
     * Get Price Range
     * <p>
     * Get pricing information for a specified range of prices. Accounts are
     *     not associated in any way with this endpoint.
     * <p>
     * @param request the PricingGetPriceRangeRequest
     * @return {@link PricingGetPriceRangeResponse
     *     PricingGetPriceRangeResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see RequestException
     * @see ExecuteException
     */
    public PricingGetPriceRangeResponse getPriceRange(PricingGetPriceRangeRequest request)
        throws RequestException, ExecuteException
    {
        if (getPriceRangeResponseMap == null) {
            getPriceRangeResponseMap = new HashMap<>();
            getPriceRangeResponseMap.put(200, PricingGetPriceRangeResponse.class);
        }

        return (PricingGetPriceRangeResponse) ctx.execute(
            "GET",
            "/v3/pricing/range",
            request,
            getPriceRangeResponseMap
        );
    }

    private HashMap<Integer, Class<?>> getResponseMap;

    /**
     * Current Account Prices
     * <p>
     * Get pricing information for a specified list of Instruments within an
     *     Account.
     * <p>
     * @param accountID Account Identifier
     * @param instruments List of Instruments to get pricing for.
     * @return {@link PricingGetResponse PricingGetResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see AccountID
     * @see InstrumentName
     * @see RequestException
     * @see ExecuteException
     */
    public PricingGetResponse get(AccountID accountID, Collection<?> instruments)
        throws RequestException, ExecuteException
    {
        PricingGetRequest request = new PricingGetRequest(accountID, instruments);
        return get(request);
    }

    /**
     * Current Account Prices
     * <p>
     * Get pricing information for a specified list of Instruments within an
     *     Account.
     * <p>
     * @param request the PricingGetRequest
     * @return {@link PricingGetResponse PricingGetResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see RequestException
     * @see ExecuteException
     */
    public PricingGetResponse get(PricingGetRequest request)
        throws RequestException, ExecuteException
    {
        if (getResponseMap == null) {
            getResponseMap = new HashMap<>();
            getResponseMap.put(200, PricingGetResponse.class);
        }

        return (PricingGetResponse) ctx.execute(
            "GET",
            "/v3/accounts/{accountID}/pricing",
            request,
            getResponseMap
        );
    }

    private HashMap<Integer, Class<?>> candlesResponseMap;

    /**
     * Get Candlesticks
     * <p>
     * Fetch candlestick data for an instrument.
     * <p>
     * @param instrument Name of the Instrument
     * @return {@link PricingCandlesResponse PricingCandlesResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see InstrumentName
     * @see RequestException
     * @see ExecuteException
     */
    public PricingCandlesResponse candles(InstrumentName instrument)
        throws RequestException, ExecuteException
    {
        PricingCandlesRequest request = new PricingCandlesRequest(instrument);
        return candles(request);
    }

    /**
     * Get Candlesticks
     * <p>
     * Fetch candlestick data for an instrument.
     * <p>
     * @param request the PricingCandlesRequest
     * @return {@link PricingCandlesResponse PricingCandlesResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see RequestException
     * @see ExecuteException
     */
    public PricingCandlesResponse candles(PricingCandlesRequest request)
        throws RequestException, ExecuteException
    {
        if (candlesResponseMap == null) {
            candlesResponseMap = new HashMap<>();
            candlesResponseMap.put(200, PricingCandlesResponse.class);
        }

        return (PricingCandlesResponse) ctx.execute(
            "GET",
            "/v3/accounts/{accountID}/instruments/{instrument}/candles",
            request,
            candlesResponseMap
        );
    }
}
