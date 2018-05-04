package com.oanda.v20.instrument;

import com.oanda.v20.Request;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.primitives.InstrumentName;

/**
 * InstrumentPriceRequest
 */
public class InstrumentPriceRequest extends Request {

    /**
     * InstrumentPriceRequest Constructor
     * <p>
     * Construct a new InstrumentPriceRequest
     * <p>
     * @param instrument Name of the Instrument
     */
    public InstrumentPriceRequest(InstrumentName instrument) {
        this.setPathParam("instrument", instrument);

    }

    /**
     * Set the time
     * <p>
     * The time at which the desired price is in effect. The current price is
     * returned if no time is provided.
     * <p>
     * @param time the time as a DateTime
     * @return {@link InstrumentPriceRequest InstrumentPriceRequest}
     * @see DateTime
     */
    public InstrumentPriceRequest setTime(DateTime time)
    {
        this.queryParams.put("time", time);
        return this;
    }

    /**
     * Set the time
     * <p>
     * The time at which the desired price is in effect. The current price is
     * returned if no time is provided.
     * <p>
     * @param time the time as a String
     * @return {@link InstrumentPriceRequest InstrumentPriceRequest}
     * @see DateTime
     */
    public InstrumentPriceRequest setTime(String time)
    {
        this.queryParams.put("time", new DateTime(time));
        return this;
    }
}
