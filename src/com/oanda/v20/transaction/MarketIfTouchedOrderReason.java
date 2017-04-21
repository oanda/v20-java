package com.oanda.v20.transaction;

/**
 * The reason that the Market-if-touched Order was initiated
 */
public enum MarketIfTouchedOrderReason {

    /**
     * The Market-if-touched Order was initiated at the request of a client
     */
    CLIENT_ORDER,

    /**
     * The Market-if-touched Order was initiated as a replacement for an
     * existing Order
     */
    REPLACEMENT
}
