package com.oanda.v20.pricing;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.primitives.DateTime;

/**
 * PricingGetResponse
 */
public class PricingGetResponse {

    /**
     * PricingGetResponse Constructor
     * <p>
     * Construct a new PricingGetResponse
     */
    private PricingGetResponse() {
    }

    @SerializedName("prices") private ArrayList<ClientPrice> prices;

    /**
     * Get the prices
     * <p>
     * The list of Price objects requested.
     * <p>
     * @return the prices
     * @see ClientPrice
     */
    public List<ClientPrice> getPrices() {
        return this.prices;
    }

    @SerializedName("homeConversions") private ArrayList<HomeConversions> homeConversions;

    /**
     * Get the homeConversions
     * <p>
     * The list of home currency conversion factors requested. This field will
     * only be present if includeHomeConversions was set to true in the
     * request.
     * <p>
     * @return the homeConversions
     * @see HomeConversions
     */
    public List<HomeConversions> getHomeConversions() {
        return this.homeConversions;
    }

    @SerializedName("time") private DateTime time;

    /**
     * Get the Time
     * <p>
     * The DateTime value to use for the "since" parameter in the next poll
     * request.
     * <p>
     * @return the Time
     * @see DateTime
     */
    public DateTime getTime() {
        return this.time;
    }
}
