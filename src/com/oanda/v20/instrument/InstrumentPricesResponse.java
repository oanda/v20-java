package com.oanda.v20.instrument;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.pricing_common.Price;

/**
 * InstrumentPricesResponse
 */
public class InstrumentPricesResponse {

    /**
     * InstrumentPricesResponse Constructor
     * <p>
     * Construct a new InstrumentPricesResponse
     */
    private InstrumentPricesResponse() {
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
