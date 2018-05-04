package com.oanda.v20.pricing;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.pricing_common.Price;

/**
 * PricingGetPriceRangeResponse
 */
public class PricingGetPriceRangeResponse {

    /**
     * PricingGetPriceRangeResponse Constructor
     * <p>
     * Construct a new PricingGetPriceRangeResponse
     */
    private PricingGetPriceRangeResponse() {
    }

    @SerializedName("prices") private ArrayList<Price> prices;

    /**
     * Get the prices
     * <p>
     * The list of prices that satisfy the request.
     * <p>
     * @return the prices
     * @see Price
     */
    public List<Price> getPrices() {
        return this.prices;
    }
}
