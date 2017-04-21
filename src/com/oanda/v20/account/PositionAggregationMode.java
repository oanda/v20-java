package com.oanda.v20.account;

/**
 * The way that position values for an Account are calculated and aggregated.
 */
public enum PositionAggregationMode {

    /**
     * The Position value or margin for each side (long and short) of the
     * Position are computed independently and added together.
     */
    ABSOLUTE_SUM,

    /**
     * The Position value or margin for each side (long and short) of the
     * Position are computed independently. The Position value or margin chosen
     * is the maximal absolute value of the two.
     */
    MAXIMAL_SIDE,

    /**
     * The units for each side (long and short) of the Position are netted
     * together and the resulting value (long or short) is used to compute the
     * Position value or margin.
     */
    NET_SUM
}
