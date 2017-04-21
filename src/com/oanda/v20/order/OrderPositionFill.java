package com.oanda.v20.order;

/**
 * Specification of how Positions in the Account are modified when the Order is
 * filled.
 */
public enum OrderPositionFill {

    /**
     * When the Order is filled, only allow Positions to be opened or extended.
     */
    OPEN_ONLY,

    /**
     * When the Order is filled, always fully reduce an existing Position
     * before opening a new Position.
     */
    REDUCE_FIRST,

    /**
     * When the Order is filled, only reduce an existing Position.
     */
    REDUCE_ONLY,

    /**
     * When the Order is filled, use REDUCE_FIRST behaviour for non-client
     * hedging Accounts, and OPEN_ONLY behaviour for client hedging Accounts.
     */
    DEFAULT
}
