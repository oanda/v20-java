package com.oanda.v20.transaction;

/**
 * The reason that the Market Order was created to perform a margin closeout
 */
public enum MarketOrderMarginCloseoutReason {

    /**
     * Trade closures resulted from violating OANDA's margin policy
     */
    MARGIN_CHECK_VIOLATION,

    /**
     * Trade closures came from a margin closeout event resulting from
     * regulatory conditions placed on the Account's margin call
     */
    REGULATORY_MARGIN_CALL_VIOLATION,

    /**
     * Trade closures resulted from violating the margin policy imposed by
     * regulatory requirements
     */
    REGULATORY_MARGIN_CHECK_VIOLATION
}
