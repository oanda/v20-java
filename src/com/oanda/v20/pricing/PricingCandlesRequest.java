package com.oanda.v20.pricing;

import java.math.BigDecimal;

import com.oanda.v20.Request;
import com.oanda.v20.instrument.CandlestickGranularity;
import com.oanda.v20.instrument.WeeklyAlignment;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.primitives.DecimalNumber;
import com.oanda.v20.primitives.InstrumentName;

/**
 * PricingCandlesRequest
 */
public class PricingCandlesRequest extends Request {

    /**
     * PricingCandlesRequest Constructor
     * <p>
     * Construct a new PricingCandlesRequest
     * <p>
     * @param instrument Name of the Instrument
     */
    public PricingCandlesRequest(InstrumentName instrument) {
        this.setPathParam("instrument", instrument);

    }

    /**
     * Set the price
     * <p>
     * The Price component(s) to get candlestick data for. Can contain any
     * combination of the characters "M" (midpoint candles) "B" (bid candles)
     * and "A" (ask candles).
     * <p>
     * @param price the price as a String
     * @return {@link PricingCandlesRequest PricingCandlesRequest}
     */
    public PricingCandlesRequest setPrice(String price)
    {
        this.queryParams.put("price", price);
        return this;
    }

    /**
     * Set the granularity
     * <p>
     * The granularity of the candlesticks to fetch
     * <p>
     * @param granularity the granularity as a CandlestickGranularity
     * @return {@link PricingCandlesRequest PricingCandlesRequest}
     * @see CandlestickGranularity
     */
    public PricingCandlesRequest setGranularity(CandlestickGranularity granularity)
    {
        this.queryParams.put("granularity", granularity);
        return this;
    }

    /**
     * Set the count
     * <p>
     * The number of candlesticks to return in the response. Count should not
     * be specified if both the start and end parameters are provided, as the
     * time range combined with the granularity will determine the number of
     * candlesticks to return.
     * <p>
     * @param count the count as a Long
     * @return {@link PricingCandlesRequest PricingCandlesRequest}
     */
    public PricingCandlesRequest setCount(Long count)
    {
        this.queryParams.put("count", count);
        return this;
    }

    /**
     * Set the from
     * <p>
     * The start of the time range to fetch candlesticks for.
     * <p>
     * @param from the from as a DateTime
     * @return {@link PricingCandlesRequest PricingCandlesRequest}
     * @see DateTime
     */
    public PricingCandlesRequest setFrom(DateTime from)
    {
        this.queryParams.put("from", from);
        return this;
    }

    /**
     * Set the from
     * <p>
     * The start of the time range to fetch candlesticks for.
     * <p>
     * @param from the from as a String
     * @return {@link PricingCandlesRequest PricingCandlesRequest}
     * @see DateTime
     */
    public PricingCandlesRequest setFrom(String from)
    {
        this.queryParams.put("from", new DateTime(from));
        return this;
    }

    /**
     * Set the to
     * <p>
     * The end of the time range to fetch candlesticks for.
     * <p>
     * @param to the to as a DateTime
     * @return {@link PricingCandlesRequest PricingCandlesRequest}
     * @see DateTime
     */
    public PricingCandlesRequest setTo(DateTime to)
    {
        this.queryParams.put("to", to);
        return this;
    }

    /**
     * Set the to
     * <p>
     * The end of the time range to fetch candlesticks for.
     * <p>
     * @param to the to as a String
     * @return {@link PricingCandlesRequest PricingCandlesRequest}
     * @see DateTime
     */
    public PricingCandlesRequest setTo(String to)
    {
        this.queryParams.put("to", new DateTime(to));
        return this;
    }

    /**
     * Set the smooth
     * <p>
     * A flag that controls whether the candlestick is "smoothed" or not.  A
     * smoothed candlestick uses the previous candle's close price as its open
     * price, while an unsmoothed candlestick uses the first price from its
     * time range as its open price.
     * <p>
     * @param smooth the smooth as a Boolean
     * @return {@link PricingCandlesRequest PricingCandlesRequest}
     */
    public PricingCandlesRequest setSmooth(Boolean smooth)
    {
        this.queryParams.put("smooth", smooth);
        return this;
    }

    /**
     * Set the includeFirst
     * <p>
     * A flag that controls whether the candlestick that is covered by the from
     * time should be included in the results. This flag enables clients to use
     * the timestamp of the last completed candlestick received to poll for
     * future candlesticks but avoid receiving the previous candlestick
     * repeatedly.
     * <p>
     * @param includeFirst the includeFirst as a Boolean
     * @return {@link PricingCandlesRequest PricingCandlesRequest}
     */
    public PricingCandlesRequest setIncludeFirst(Boolean includeFirst)
    {
        this.queryParams.put("includeFirst", includeFirst);
        return this;
    }

    /**
     * Set the dailyAlignment
     * <p>
     * The hour of the day (in the specified timezone) to use for granularities
     * that have daily alignments.
     * <p>
     * @param dailyAlignment the dailyAlignment as a Long
     * @return {@link PricingCandlesRequest PricingCandlesRequest}
     */
    public PricingCandlesRequest setDailyAlignment(Long dailyAlignment)
    {
        this.queryParams.put("dailyAlignment", dailyAlignment);
        return this;
    }

    /**
     * Set the alignmentTimezone
     * <p>
     * The timezone to use for the dailyAlignment parameter. Candlesticks with
     * daily alignment will be aligned to the dailyAlignment hour within the
     * alignmentTimezone.  Note that the returned times will still be
     * represented in UTC.
     * <p>
     * @param alignmentTimezone the alignmentTimezone as a String
     * @return {@link PricingCandlesRequest PricingCandlesRequest}
     */
    public PricingCandlesRequest setAlignmentTimezone(String alignmentTimezone)
    {
        this.queryParams.put("alignmentTimezone", alignmentTimezone);
        return this;
    }

    /**
     * Set the weeklyAlignment
     * <p>
     * The day of the week used for granularities that have weekly alignment.
     * <p>
     * @param weeklyAlignment the weeklyAlignment as a WeeklyAlignment
     * @return {@link PricingCandlesRequest PricingCandlesRequest}
     * @see WeeklyAlignment
     */
    public PricingCandlesRequest setWeeklyAlignment(WeeklyAlignment weeklyAlignment)
    {
        this.queryParams.put("weeklyAlignment", weeklyAlignment);
        return this;
    }

    /**
     * Set the units
     * <p>
     * The number of units used to calculate the volume-weighted average bid
     * and ask prices in the returned candles.
     * <p>
     * @param units the units as a DecimalNumber
     * @return {@link PricingCandlesRequest PricingCandlesRequest}
     * @see DecimalNumber
     */
    public PricingCandlesRequest setUnits(DecimalNumber units)
    {
        this.queryParams.put("units", units);
        return this;
    }

    /**
     * Set the units
     * <p>
     * The number of units used to calculate the volume-weighted average bid
     * and ask prices in the returned candles.
     * <p>
     * @param units the units as a String
     * @return {@link PricingCandlesRequest PricingCandlesRequest}
     * @see DecimalNumber
     */
    public PricingCandlesRequest setUnits(String units)
    {
        this.queryParams.put("units", new DecimalNumber(units));
        return this;
    }

    /**
     * Set the units
     * <p>
     * The number of units used to calculate the volume-weighted average bid
     * and ask prices in the returned candles.
     * <p>
     * @param units the units as a double
     * @return {@link PricingCandlesRequest PricingCandlesRequest}
     * @see DecimalNumber
     */
    public PricingCandlesRequest setUnits(double units)
    {
        this.queryParams.put("units", new DecimalNumber(units));
        return this;
    }

    /**
     * Set the units
     * <p>
     * The number of units used to calculate the volume-weighted average bid
     * and ask prices in the returned candles.
     * <p>
     * @param units the units as a BigDecimal
     * @return {@link PricingCandlesRequest PricingCandlesRequest}
     * @see DecimalNumber
     */
    public PricingCandlesRequest setUnits(BigDecimal units)
    {
        this.queryParams.put("units", new DecimalNumber(units));
        return this;
    }
}
