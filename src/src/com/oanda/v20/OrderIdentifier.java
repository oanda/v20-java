package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* An OrderIdentifier is used to refer to an Order, and contains both the
* OrderID and the ClientOrderID.
*/

public class OrderIdentifier {

    @SerializedName("orderID") private OrderID _orderID;
    public OrderIdentifier set_orderID(String __orderID) { 
        this._orderID = new OrderID(__orderID); 
        return this;
    }
    /**
    * The OANDA-assigned Order ID
    */

    public String get_orderID() {
        return this._orderID.get_OrderID();
    }

    @SerializedName("clientOrderID") private ClientID _clientOrderID;
    public OrderIdentifier set_clientOrderID(String __clientOrderID) { 
        this._clientOrderID = new ClientID(__clientOrderID); 
        return this;
    }
    /**
    * The client-provided client Order ID
    */

    public String get_clientOrderID() {
        return this._clientOrderID.get_ClientID();
    }
}
