package com.oanda.v20.order;

/**
 * The current state of the Order.
 */
public enum OrderState {

    /**
     * The Order is currently pending execution
     */
    PENDING,

    /**
     * The Order has been filled
     */
    FILLED,

    /**
     * The Order has been triggered
     */
    TRIGGERED,

    /**
     * The Order has been cancelled
     */
    CANCELLED
}
