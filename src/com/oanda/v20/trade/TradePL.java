package com.oanda.v20.trade;

/**
 * The classification of TradePLs.
 */
public enum TradePL {

    /**
     * An open Trade currently has a positive (profitable) unrealized P/L, or a
     * closed Trade realized a positive amount of P/L.
     */
    POSITIVE,

    /**
     * An open Trade currently has a negative (losing) unrealized P/L, or a
     * closed Trade realized a negative amount of P/L.
     */
    NEGATIVE,

    /**
     * An open Trade currently has unrealized P/L of zero (neither profitable
     * nor losing), or a closed Trade realized a P/L amount of zero.
     */
    ZERO
}
