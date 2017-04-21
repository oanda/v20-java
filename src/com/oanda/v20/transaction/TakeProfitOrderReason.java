package com.oanda.v20.transaction;

/**
 * The reason that the Take Profit Order was initiated
 */
public enum TakeProfitOrderReason {

    /**
     * The Take Profit Order was initiated at the request of a client
     */
    CLIENT_ORDER,

    /**
     * The Take Profit Order was initiated as a replacement for an existing
     * Order
     */
    REPLACEMENT,

    /**
     * The Take Profit Order was initiated automatically when an Order was
     * filled that opened a new Trade requiring a Take Profit Order.
     */
    ON_FILL
}
