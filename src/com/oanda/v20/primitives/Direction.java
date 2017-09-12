package com.oanda.v20.primitives;

/**
 * In the context of an Order or a Trade, defines whether the units are
 * positive or negative.
 */
public enum Direction {

    /**
     * A long Order is used to to buy units of an Instrument. A Trade is long
     * when it has bought units of an Instrument.
     */
    LONG,

    /**
     * A short Order is used to to sell units of an Instrument. A Trade is
     * short when it has sold units of an Instrument.
     */
    SHORT
}
