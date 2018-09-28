package com.oanda.v20.instrument;

import com.google.gson.annotations.SerializedName;

/**
 * InstrumentOrderBookResponse
 */
public class InstrumentOrderBookResponse {

    /**
     * InstrumentOrderBookResponse Constructor
     * <p>
     * Construct a new InstrumentOrderBookResponse
     */
    private InstrumentOrderBookResponse() {
    }

    @SerializedName("orderBook") private OrderBook orderBook;

    /**
     * Get the orderBook
     * <p>
     * The instrument's order book
     * <p>
     * @return the orderBook
     * @see OrderBook
     */
    public OrderBook getOrderBook() {
        return this.orderBook;
    }
}
