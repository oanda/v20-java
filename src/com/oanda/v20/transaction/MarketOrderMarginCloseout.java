package com.oanda.v20.transaction;

import com.google.gson.annotations.SerializedName;

/**
 * Details for the Market Order extensions specific to a Market Order placed
 * that is part of a Market Order Margin Closeout in a client's account
 */
public class MarketOrderMarginCloseout {

    /**
     * Default constructor.
     */
    public MarketOrderMarginCloseout() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the MarketOrderMarginCloseout to copy
     */
    public MarketOrderMarginCloseout(MarketOrderMarginCloseout other) {
        this.reason = other.reason;
    }

    @SerializedName("reason") private MarketOrderMarginCloseoutReason reason;

    /**
     * Get the Reason
     * <p>
     * The reason the Market Order was created to perform a margin closeout
     * <p>
     * @return the Reason
     * @see MarketOrderMarginCloseoutReason
     */
    public MarketOrderMarginCloseoutReason getReason() {
        return this.reason;
    }

    /**
     * Set the Reason
     * <p>
     * The reason the Market Order was created to perform a margin closeout
     * <p>
     * @param reason the Reason as a MarketOrderMarginCloseoutReason
     * @return {@link MarketOrderMarginCloseout MarketOrderMarginCloseout}
     * @see MarketOrderMarginCloseoutReason
     */
    public MarketOrderMarginCloseout setReason(MarketOrderMarginCloseoutReason reason) {
        this.reason = reason;
        return this;
    }

    @Override
    public String toString() {
        return "MarketOrderMarginCloseout(" +
            "reason=" +
                (reason == null ? "null" : reason.toString()) +
            ")";
    }
}
