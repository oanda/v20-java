package com.oanda.v20;

import com.oanda.v20.MarketOrderMarginCloseoutReason;
import com.google.gson.annotations.SerializedName;

/**
 * Details for the Market Order extensions specific to a Market Order placed
 * that is part of a Market Order Margin Closeout in a client's account
 */
public class MarketOrderMarginCloseout {

    @SerializedName("reason") private MarketOrderMarginCloseoutReason reason;

    /**
     * Set the Reason
     * <p>
     * The reason the Market Order was created to perform a margin closeout
     * <p>
     * @param reason the Reason
     * @return {@link MarketOrderMarginCloseout MarketOrderMarginCloseout}
     * @see MarketOrderMarginCloseoutReason
     */
    public MarketOrderMarginCloseout setReason(MarketOrderMarginCloseoutReason reason) {
        this.reason = reason;
        return this;
    }

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
}
