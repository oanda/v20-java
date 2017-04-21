package com.oanda.v20.order;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.Request;
import com.oanda.v20.account.AccountID;
import com.oanda.v20.transaction.ClientExtensions;

/**
 * OrderSetClientExtensionsRequest
 */
public class OrderSetClientExtensionsRequest extends Request {

    private static class Body {
        @SerializedName("clientExtensions") private ClientExtensions clientExtensions;
        @SerializedName("tradeClientExtensions") private ClientExtensions tradeClientExtensions;
    }

    /**
     * OrderSetClientExtensionsRequest Constructor
     * <p>
     * Construct a new OrderSetClientExtensionsRequest
     * <p>
     * @param accountID Account Identifier
     * @param orderSpecifier The Order Specifier
     */
    public OrderSetClientExtensionsRequest(AccountID accountID, OrderSpecifier orderSpecifier) {
        this.body = new Body();
        this.setPathParam("accountID", accountID);
        this.setPathParam("orderSpecifier", orderSpecifier);

    }

    /**
     * Set the clientExtensions
     * <p>
     * The Client Extensions to update for the Order. Do not set, modify, or
     * delete clientExtensions if your account is associated with MT4.
     * <p>
     * @param clientExtensions the clientExtensions as a ClientExtensions
     * @return {@link OrderSetClientExtensionsRequest
     * OrderSetClientExtensionsRequest}
     * @see ClientExtensions
     */
    public OrderSetClientExtensionsRequest setClientExtensions(ClientExtensions clientExtensions)
    {
        ((Body) this.body).clientExtensions = clientExtensions;
        return this;
    }

    /**
     * Set the tradeClientExtensions
     * <p>
     * The Client Extensions to update for the Trade created when the Order is
     * filled. Do not set, modify, or delete clientExtensions if your account
     * is associated with MT4.
     * <p>
     * @param tradeClientExtensions the tradeClientExtensions as a
     * ClientExtensions
     * @return {@link OrderSetClientExtensionsRequest
     * OrderSetClientExtensionsRequest}
     * @see ClientExtensions
     */
    public OrderSetClientExtensionsRequest setTradeClientExtensions(ClientExtensions tradeClientExtensions)
    {
        ((Body) this.body).tradeClientExtensions = tradeClientExtensions;
        return this;
    }
}
