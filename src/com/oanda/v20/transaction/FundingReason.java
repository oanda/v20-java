package com.oanda.v20.transaction;

/**
 * The reason that an Account is being funded.
 */
public enum FundingReason {

    /**
     * The client has initiated a funds transfer
     */
    CLIENT_FUNDING,

    /**
     * Funds are being transfered between two Accounts.
     */
    ACCOUNT_TRANSFER,

    /**
     * Funds are being transfered as part of a Division migration
     */
    DIVISION_MIGRATION,

    /**
     * Funds are being transfered as part of a Site migration
     */
    SITE_MIGRATION,

    /**
     * Funds are being transfered as part of an Account adjustment
     */
    ADJUSTMENT
}
