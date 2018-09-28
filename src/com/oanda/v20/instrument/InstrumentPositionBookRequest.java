package com.oanda.v20.instrument;

import com.oanda.v20.Request;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.primitives.InstrumentName;

/**
 * InstrumentPositionBookRequest
 */
public class InstrumentPositionBookRequest extends Request {

    /**
     * InstrumentPositionBookRequest Constructor
     * <p>
     * Construct a new InstrumentPositionBookRequest
     * <p>
     * @param instrument Name of the Instrument
     */
    public InstrumentPositionBookRequest(InstrumentName instrument) {
        this.setPathParam("instrument", instrument);

    }

    /**
     * Set the time
     * <p>
     * The time of the snapshot to fetch. If not specified, then the most
     * recent snapshot is fetched.
     * <p>
     * @param time the time as a DateTime
     * @return {@link InstrumentPositionBookRequest
     * InstrumentPositionBookRequest}
     * @see DateTime
     */
    public InstrumentPositionBookRequest setTime(DateTime time)
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
     * @return {@link InstrumentPositionBookRequest
     * InstrumentPositionBookRequest}
     * @see DateTime
     */
    public InstrumentPositionBookRequest setTime(String time)
    {
        this.queryParams.put("time", new DateTime(time));
        return this;
    }
}
