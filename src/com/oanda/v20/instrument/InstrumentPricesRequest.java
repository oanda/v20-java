package com.oanda.v20.instrument;

import com.oanda.v20.Request;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.primitives.InstrumentName;

/**
 * InstrumentPricesRequest
 */
public class InstrumentPricesRequest extends Request {

    /**
     * InstrumentPricesRequest Constructor
     * <p>
     * Construct a new InstrumentPricesRequest
     * <p>
     * @param instrument Name of the Instrument
     * @param fromTime The start of the time range to fetch prices for.
     */
    public InstrumentPricesRequest(InstrumentName instrument, DateTime fromTime) {
        this.setPathParam("instrument", instrument);
        this.setQueryParam("from", fromTime);

    }

    /**
     * Set the from
     * <p>
     * The start of the time range to fetch prices for.
     * <p>
     * @param from the from as a DateTime
     * @return {@link InstrumentPricesRequest InstrumentPricesRequest}
     * @see DateTime
     */
    public InstrumentPricesRequest setFrom(DateTime from)
    {
        this.queryParams.put("from", from);
        return this;
    }

    /**
     * Set the from
     * <p>
     * The start of the time range to fetch prices for.
     * <p>
     * @param from the from as a String
     * @return {@link InstrumentPricesRequest InstrumentPricesRequest}
     * @see DateTime
     */
    public InstrumentPricesRequest setFrom(String from)
    {
        this.queryParams.put("from", new DateTime(from));
        return this;
    }

    /**
     * Set the to
     * <p>
     * The end of the time range to fetch prices for. The current time is used
     * if this parameter is not provided.
     * <p>
     * @param to the to as a DateTime
     * @return {@link InstrumentPricesRequest InstrumentPricesRequest}
     * @see DateTime
     */
    public InstrumentPricesRequest setTo(DateTime to)
    {
        this.queryParams.put("to", to);
        return this;
    }

    /**
     * Set the to
     * <p>
     * The end of the time range to fetch prices for. The current time is used
     * if this parameter is not provided.
     * <p>
     * @param to the to as a String
     * @return {@link InstrumentPricesRequest InstrumentPricesRequest}
     * @see DateTime
     */
    public InstrumentPricesRequest setTo(String to)
    {
        this.queryParams.put("to", new DateTime(to));
        return this;
    }
}
