package com.oanda.v20.pricing;

import com.oanda.v20.Request;
import com.oanda.v20.primitives.DateTime;

/**
 * PricingBasePricesRequest
 */
public class PricingBasePricesRequest extends Request {

    /**
     * PricingBasePricesRequest Constructor
     * <p>
     * Construct a new PricingBasePricesRequest
     */
    public PricingBasePricesRequest() {

    }

    /**
     * Set the time
     * <p>
     * The time at which the desired price for each instrument is in effect.
     * The current price for each instrument is returned if no time is
     * provided.
     * <p>
     * @param time the time as a DateTime
     * @return {@link PricingBasePricesRequest PricingBasePricesRequest}
     * @see DateTime
     */
    public PricingBasePricesRequest setTime(DateTime time)
    {
        this.queryParams.put("time", time);
        return this;
    }

    /**
     * Set the time
     * <p>
     * The time at which the desired price for each instrument is in effect.
     * The current price for each instrument is returned if no time is
     * provided.
     * <p>
     * @param time the time as a String
     * @return {@link PricingBasePricesRequest PricingBasePricesRequest}
     * @see DateTime
     */
    public PricingBasePricesRequest setTime(String time)
    {
        this.queryParams.put("time", new DateTime(time));
        return this;
    }
}
