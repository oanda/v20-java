package com.oanda.v20.pricing;

/**
 * The status of the Price.
 */
public enum PriceStatus {

    /**
     * The Instrument's price is tradeable.
     */
    tradeable,

    /**
     * The Instrument's price is not tradeable.
     */
    non_tradeable,

    /**
     * The Instrument of the price is invalid or there is no valid Price for
     * the Instrument.
     */
    invalid
}
