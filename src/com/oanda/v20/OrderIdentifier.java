package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * An OrderIdentifier is used to refer to an Order, and contains both the
 * OrderID and the ClientOrderID.
 */
public class OrderIdentifier {

    @SerializedName("orderID") private OrderID orderID;

    /**
     * Set the orderID
     * <p>
     * The OANDA-assigned Order ID
     * <p>
     * @param orderID the orderID
     * @return {@link OrderIdentifier OrderIdentifier}
     * @see OrderID
     */
    public OrderIdentifier setOrderID(String orderID) {
        this.orderID = new OrderID(orderID);
        return this;
    }

    /**
     * Get the orderID
     * <p>
     * The OANDA-assigned Order ID
     * <p>
     * @return the orderID
     * @see OrderID
     */
    public String getOrderID() {
        return this.orderID.getOrderID();
    }

    @SerializedName("clientOrderID") private ClientID clientOrderID;

    /**
     * Set the clientOrderID
     * <p>
     * The client-provided client Order ID
     * <p>
     * @param clientOrderID the clientOrderID
     * @return {@link OrderIdentifier OrderIdentifier}
     * @see ClientID
     */
    public OrderIdentifier setClientOrderID(String clientOrderID) {
        this.clientOrderID = new ClientID(clientOrderID);
        return this;
    }

    /**
     * Get the clientOrderID
     * <p>
     * The client-provided client Order ID
     * <p>
     * @return the clientOrderID
     * @see ClientID
     */
    public String getClientOrderID() {
        return this.clientOrderID.getClientID();
    }
}
