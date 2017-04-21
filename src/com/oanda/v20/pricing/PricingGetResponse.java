package com.oanda.v20.pricing;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

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

    @SerializedName("prices") private ArrayList<Price> prices;

    /**
     * Get the prices
     * <p>
     * The list of Price objects requested
     * <p>
     * @return the prices
     * @see Price
     */
    public List<Price> getPrices() {
        return this.prices;
    }
}
