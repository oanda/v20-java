package com.oanda.v20.trade;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.Request;
import com.oanda.v20.account.AccountID;

/**
 * TradeCloseRequest
 */
public class TradeCloseRequest extends Request {

    private static class Body {
        @SerializedName("units") private String units;
    }

    /**
     * TradeCloseRequest Constructor
     * <p>
     * Construct a new TradeCloseRequest
     * <p>
     * @param accountID Account Identifier
     * @param tradeSpecifier Specifier for the Trade
     */
    public TradeCloseRequest(AccountID accountID, TradeSpecifier tradeSpecifier) {
        this.body = new Body();
        this.setPathParam("accountID", accountID);
        this.setPathParam("tradeSpecifier", tradeSpecifier);

    }

    /**
     * Set the units
     * <p>
     * Indication of how much of the Trade to close. Either the string "ALL"
     * (indicating that all of the Trade should be closed), or a DecimalNumber
     * representing the number of units of the open Trade to Close using a
     * TradeClose MarketOrder. The units specified must always be positive, and
     * the magnitude of the value cannot exceed the magnitude of the Trade's
     * open units.
     * <p>
     * @param units the units as a String
     * @return {@link TradeCloseRequest TradeCloseRequest}
     */
    public TradeCloseRequest setUnits(String units)
    {
        ((Body) this.body).units = units;
        return this;
    }
}
