package com.oanda.v20.trade;

/**
 * The state to filter the Trades by
 */
public enum TradeStateFilter {

    /**
     * The Trades that are currently open
     */
    OPEN,

    /**
     * The Trades that have been fully closed
     */
    CLOSED,

    /**
     * The Trades  that will be closed as soon as the trades' instrument
     * becomes tradeable
     */
    CLOSE_WHEN_TRADEABLE,

    /**
     * The Trades that are in any of the possible states listed above.
     */
    ALL
}
