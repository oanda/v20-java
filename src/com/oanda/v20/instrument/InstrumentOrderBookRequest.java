package com.oanda.v20.instrument;

import com.oanda.v20.Request;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.primitives.InstrumentName;

/**
 * InstrumentOrderBookRequest
 */
public class InstrumentOrderBookRequest extends Request {

    /**
     * InstrumentOrderBookRequest Constructor
     * <p>
     * Construct a new InstrumentOrderBookRequest
     * <p>
     * @param instrument Name of the Instrument
     */
    public InstrumentOrderBookRequest(InstrumentName instrument) {
        this.setPathParam("instrument", instrument);

    }

    /**
     * Set the time
     * <p>
     * The time of the snapshot to fetch. If not specified, then the most
     * recent snapshot is fetched.
     * <p>
     * @param time the time as a DateTime
     * @return {@link InstrumentOrderBookRequest InstrumentOrderBookRequest}
     * @see DateTime
     */
    public InstrumentOrderBookRequest setTime(DateTime time)
    {
        this.queryParams.put("time", time);
        return this;
    }

    /**
     * Set the time
     * <p>
     * The time of the snapshot to fetch. If not specified, then the most
     * recent snapshot is fetched.
     * <p>
     * @param time the time as a String
     * @return {@link InstrumentOrderBookRequest InstrumentOrderBookRequest}
     * @see DateTime
     */
    public InstrumentOrderBookRequest setTime(String time)
    {
        this.queryParams.put("time", new DateTime(time));
        return this;
    }
}
