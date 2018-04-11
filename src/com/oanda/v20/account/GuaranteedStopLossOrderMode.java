package com.oanda.v20.account;

/**
 * The overall behaviour of the Account regarding guaranteed Stop Loss Orders.
 */
public enum GuaranteedStopLossOrderMode {

    /**
     * The Account is not permitted to create guaranteed Stop Loss Orders.
     */
    DISABLED,

    /**
     * The Account is able, but not required to have guaranteed Stop Loss
     * Orders for open Trades.
     */
    ALLOWED,

    /**
     * The Account is required to have guaranteed Stop Loss Orders for all open
     * Trades.
     */
    REQUIRED
}
