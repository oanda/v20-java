package com.oanda.v20.order;

/**
 * The time-in-force of an Order. TimeInForce describes how long an Order
 * should remain pending before being automatically cancelled by the execution
 * system.
 */
public enum TimeInForce {

    /**
     * The Order is "Good unTil Cancelled"
     */
    GTC,

    /**
     * The Order is "Good unTil Date" and will be cancelled at the provided
     * time
     */
    GTD,

    /**
     * The Order is "Good For Day" and will be cancelled at 5pm New York time
     */
    GFD,

    /**
     * The Order must be immediately "Filled Or Killed"
     */
    FOK,

    /**
     * The Order must be "Immediatedly paritally filled Or Cancelled"
     */
    IOC
}
