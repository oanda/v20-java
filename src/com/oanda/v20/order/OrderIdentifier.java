package com.oanda.v20.order;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.transaction.ClientID;

/**
 * An OrderIdentifier is used to refer to an Order, and contains both the
 * OrderID and the ClientOrderID.
 */
public class OrderIdentifier {

    /**
     * Default constructor.
     */
    public OrderIdentifier() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the OrderIdentifier to copy
     */
    public OrderIdentifier(OrderIdentifier other) {
        this.orderID = other.orderID;
        this.clientOrderID = other.clientOrderID;
    }

    @SerializedName("orderID") private OrderID orderID;

    /**
     * Get the orderID
     * <p>
     * The OANDA-assigned Order ID
     * <p>
     * @return the orderID
     * @see OrderID
     */
    public OrderID getOrderID() {
        return this.orderID;
    }

    /**
     * Set the orderID
     * <p>
     * The OANDA-assigned Order ID
     * <p>
     * @param orderID the orderID as an OrderID
     * @return {@link OrderIdentifier OrderIdentifier}
     * @see OrderID
     */
    public OrderIdentifier setOrderID(OrderID orderID) {
        this.orderID = orderID;
        return this;
    }
    /**
     * Set the orderID
     * <p>
     * The OANDA-assigned Order ID
     * <p>
     * @param orderID the orderID as a String
     * @return {@link OrderIdentifier OrderIdentifier}
     * @see OrderID
     */
    public OrderIdentifier setOrderID(String orderID) {
        this.orderID = new OrderID(orderID);
        return this;
    }

    @SerializedName("clientOrderID") private ClientID clientOrderID;

    /**
     * Get the clientOrderID
     * <p>
     * The client-provided client Order ID
     * <p>
     * @return the clientOrderID
     * @see ClientID
     */
    public ClientID getClientOrderID() {
        return this.clientOrderID;
    }

    /**
     * Set the clientOrderID
     * <p>
     * The client-provided client Order ID
     * <p>
     * @param clientOrderID the clientOrderID as a ClientID
     * @return {@link OrderIdentifier OrderIdentifier}
     * @see ClientID
     */
    public OrderIdentifier setClientOrderID(ClientID clientOrderID) {
        this.clientOrderID = clientOrderID;
        return this;
    }
    /**
     * Set the clientOrderID
     * <p>
     * The client-provided client Order ID
     * <p>
     * @param clientOrderID the clientOrderID as a String
     * @return {@link OrderIdentifier OrderIdentifier}
     * @see ClientID
     */
    public OrderIdentifier setClientOrderID(String clientOrderID) {
        this.clientOrderID = new ClientID(clientOrderID);
        return this;
    }

    @Override
    public String toString() {
        return "OrderIdentifier(" +
            "orderID=" +
                (orderID == null ? "null" : orderID.toString()) + ", " +
            "clientOrderID=" +
                (clientOrderID == null ? "null" : clientOrderID.toString()) +
            ")";
    }
}
