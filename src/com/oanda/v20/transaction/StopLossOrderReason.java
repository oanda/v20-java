package com.oanda.v20.transaction;

/**
 * The reason that the Stop Loss Order was initiated
 */
public enum StopLossOrderReason {

    /**
     * The Stop Loss Order was initiated at the request of a client
     */
    CLIENT_ORDER,

    /**
     * The Stop Loss Order was initiated as a replacement for an existing Order
     */
    REPLACEMENT,

    /**
     * The Stop Loss Order was initiated automatically when an Order was filled
     * that opened a new Trade requiring a Stop Loss Order.
     */
    ON_FILL
}
