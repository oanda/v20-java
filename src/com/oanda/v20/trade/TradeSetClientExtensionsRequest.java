package com.oanda.v20.trade;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.Request;
import com.oanda.v20.account.AccountID;
import com.oanda.v20.transaction.ClientExtensions;

/**
 * TradeSetClientExtensionsRequest
 */
public class TradeSetClientExtensionsRequest extends Request {

    private static class Body {
        @SerializedName("clientExtensions") private ClientExtensions clientExtensions;
    }

    /**
     * TradeSetClientExtensionsRequest Constructor
     * <p>
     * Construct a new TradeSetClientExtensionsRequest
     * <p>
     * @param accountID Account Identifier
     * @param tradeSpecifier Specifier for the Trade
     */
    public TradeSetClientExtensionsRequest(AccountID accountID, TradeSpecifier tradeSpecifier) {
        this.body = new Body();
        this.setPathParam("accountID", accountID);
        this.setPathParam("tradeSpecifier", tradeSpecifier);

    }

    /**
     * Set the clientExtensions
     * <p>
     * The Client Extensions to update the Trade with. Do not add, update, or
     * delete the Client Extensions if your account is associated with MT4.
     * <p>
     * @param clientExtensions the clientExtensions as a ClientExtensions
     * @return {@link TradeSetClientExtensionsRequest
     * TradeSetClientExtensionsRequest}
     * @see ClientExtensions
     */
    public TradeSetClientExtensionsRequest setClientExtensions(ClientExtensions clientExtensions)
    {
        ((Body) this.body).clientExtensions = clientExtensions;
        return this;
    }
}
