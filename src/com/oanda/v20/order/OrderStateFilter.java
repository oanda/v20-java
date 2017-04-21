package com.oanda.v20.order;

/**
 * The state to filter the requested Orders by.
 */
public enum OrderStateFilter {

    /**
     * The Orders that are currently pending execution
     */
    PENDING,

    /**
     * The Orders that have been filled
     */
    FILLED,

    /**
     * The Orders that have been triggered
     */
    TRIGGERED,

    /**
     * The Orders that have been cancelled
     */
    CANCELLED,

    /**
     * The Orders that are in any of the possible states listed above
     */
    ALL
}
