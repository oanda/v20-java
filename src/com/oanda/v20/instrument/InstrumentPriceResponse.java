package com.oanda.v20.instrument;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.pricing_common.Price;

/**
 * InstrumentPriceResponse
 */
public class InstrumentPriceResponse {

    /**
     * InstrumentPriceResponse Constructor
     * <p>
     * Construct a new InstrumentPriceResponse
     */
    private InstrumentPriceResponse() {
    }

    @SerializedName("price") private Price price;

    /**
     * Get the price
     * <p>
     * The price that satisfies the request.
     * <p>
     * @return the price
     * @see Price
     */
    public Price getPrice() {
        return this.price;
    }
}
