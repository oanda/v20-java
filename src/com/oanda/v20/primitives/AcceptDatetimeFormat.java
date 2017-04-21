package com.oanda.v20.primitives;

/**
 * DateTime header
 */
public enum AcceptDatetimeFormat {

    /**
     * If "UNIX" is specified DateTime fields will be specified or returned in
     * the "12345678.000000123" format.
     */
    UNIX,

    /**
     * If "RFC3339" is specified DateTime will be specified or returned in
     * "YYYY-MM-DDTHH:MM:SS.nnnnnnnnnZ" format.
     */
    RFC3339
}
