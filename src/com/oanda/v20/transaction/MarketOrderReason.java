package com.oanda.v20.transaction;

/**
 * The reason that the Market Order was created
 */
public enum MarketOrderReason {

    /**
     * The Market Order was created at the request of a client
     */
    CLIENT_ORDER,

    /**
     * The Market Order was created to close a Trade at the request of a client
     */
    TRADE_CLOSE,

    /**
     * The Market Order was created to close a Position at the request of a
     * client
     */
    POSITION_CLOSEOUT,

    /**
     * The Market Order was created as part of a Margin Closeout
     */
    MARGIN_CLOSEOUT,

    /**
     * The Market Order was created to close a trade marked for delayed closure
     */
    DELAYED_TRADE_CLOSE
}
