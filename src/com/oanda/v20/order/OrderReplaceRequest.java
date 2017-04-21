package com.oanda.v20.order;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.Request;
import com.oanda.v20.account.AccountID;

/**
 * OrderReplaceRequest
 */
public class OrderReplaceRequest extends Request {

    private static class Body {
        @SerializedName("order") private OrderRequest order;
    }

    /**
     * OrderReplaceRequest Constructor
     * <p>
     * Construct a new OrderReplaceRequest
     * <p>
     * @param accountID Account Identifier
     * @param orderSpecifier The Order Specifier
     */
    public OrderReplaceRequest(AccountID accountID, OrderSpecifier orderSpecifier) {
        this.body = new Body();
        this.setPathParam("accountID", accountID);
        this.setPathParam("orderSpecifier", orderSpecifier);

    }

    /**
     * Set the order
     * <p>
     * Specification of the replacing Order
     * <p>
     * @param order the order as an OrderRequest
     * @return {@link OrderReplaceRequest OrderReplaceRequest}
     * @see OrderRequest
     */
    public OrderReplaceRequest setOrder(OrderRequest order)
    {
        ((Body) this.body).order = order;
        return this;
    }
}
