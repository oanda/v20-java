package com.oanda.v20.order;

/**
 * Specification of which price component should be used when determining if an
 * Order should be triggered and filled. This allows Orders to be triggered
 * based on the bid, ask, mid, default (ask for buy, bid for sell) or inverse
 * (ask for sell, bid for buy) price depending on the desired behaviour. Orders
 * are always filled using their default price component. This feature is only
 * provided through the REST API. Clients who choose to specify a non-default
 * trigger condition will not see it reflected in any of OANDA's proprietary or
 * partner trading platforms, their transaction history or their account
 * statements. OANDA platforms always assume that an Order's trigger condition
 * is set to the default value when indicating the distance from an Order's
 * trigger price, and will always provide the default trigger condition when
 * creating or modifying an Order. A special restriction applies when creating
 * a guaranteed Stop Loss Order. In this case the TriggerCondition value must
 * either be "DEFAULT", or the "natural" trigger side "DEFAULT" results in. So
 * for a Stop Loss Order for a long trade valid values are "DEFAULT" and "BID",
 * and for short trades "DEFAULT" and "ASK" are valid.
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
