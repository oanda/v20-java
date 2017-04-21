package com.oanda.v20.transaction;

/**
 * The reason that the Trailing Stop Loss Order was initiated
 */
public enum TrailingStopLossOrderReason {

    /**
     * The Trailing Stop Loss Order was initiated at the request of a client
     */
    CLIENT_ORDER,

    /**
     * The Trailing Stop Loss Order was initiated as a replacement for an
     * existing Order
     */
    REPLACEMENT,

    /**
     * The Trailing Stop Loss Order was initiated automatically when an Order
     * was filled that opened a new Trade requiring a Trailing Stop Loss Order.
     */
    ON_FILL
}
