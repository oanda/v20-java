package com.oanda.v20.order;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.Request;
import com.oanda.v20.account.AccountID;

/**
 * OrderCreateRequest
 */
public class OrderCreateRequest extends Request {

    private static class Body {
        @SerializedName("order") private OrderRequest order;
    }

    /**
     * OrderCreateRequest Constructor
     * <p>
     * Construct a new OrderCreateRequest
     * <p>
     * @param accountID Account Identifier
     */
    public OrderCreateRequest(AccountID accountID) {
        this.body = new Body();
        this.setPathParam("accountID", accountID);

    }

    /**
     * Set the order
     * <p>
     * Specification of the Order to create
     * <p>
     * @param order the order as an OrderRequest
     * @return {@link OrderCreateRequest OrderCreateRequest}
     * @see OrderRequest
     */
    public OrderCreateRequest setOrder(OrderRequest order)
    {
        ((Body) this.body).order = order;
        return this;
    }
}
