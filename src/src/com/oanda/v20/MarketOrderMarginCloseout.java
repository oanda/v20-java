package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* Details for the Market Order extensions specific to a Market Order placed
* that is part of a Market Order Margin Closeout in a client's account
*/

public class MarketOrderMarginCloseout {

    @SerializedName("reason") private MarketOrderMarginCloseoutReason _reason;
    public MarketOrderMarginCloseout set_reason(MarketOrderMarginCloseoutReason __reason) { 
        this._reason = __reason;
        return this;
    }
    /**
    * The reason the Market Order was created to perform a margin closeout
    */

    public MarketOrderMarginCloseoutReason get_reason() {
        return this._reason;
    }
}
