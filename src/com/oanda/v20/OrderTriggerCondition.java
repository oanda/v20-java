package com.oanda.v20;

/**
 * Specification of what component of a price should be used for comparison
 * when determining if the Order should be filled.
 */
public enum OrderTriggerCondition {

    /**
     * Trigger an Order the "natural" way: compare its price to the ask for
     * long Orders and bid for short Orders.
     */
    DEFAULT,

    /**
     * Trigger an Order the opposite of the "natural" way: compare its price
     * the bid for long Orders and ask for short Orders.
     */
    INVERSE,

    /**
     * Trigger an Order by comparing its price to the bid regardless of whether
     * it is long or short.
     */
    BID,

    /**
     * Trigger an Order by comparing its price to the ask regardless of whether
     * it is long or short.
     */
    ASK,

    /**
     * Trigger an Order by comparing its price to the midpoint regardless of
     * whether it is long or short.
     */
    MID

}
