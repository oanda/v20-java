package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* An OrderCancelTransaction represents the cancellation of an Order in the
* client's Account.
*/

public class OrderCancelTransaction implements Transaction {

    @SerializedName("id") private TransactionID _id;
    public OrderCancelTransaction set_id(String __id) { 
        this._id = new TransactionID(__id); 
        return this;
    }
    /**
    * The Transaction's Identifier.
    */

    public String get_id() {
        return this._id.get_TransactionID();
    }

    @SerializedName("time") private DateTime _time;
    public OrderCancelTransaction set_time(String __time) { 
        this._time = new DateTime(__time); 
        return this;
    }
    /**
    * The date/time when the Transaction was created.
    */

    public String get_time() {
        return this._time.get_DateTime();
    }

    @SerializedName("userID") private Integer _userID;
    public OrderCancelTransaction set_userID(int __userID) {
        this._userID = __userID;
        return this;
    }
    /**
    * The ID of the user that initiated the creation of the Transaction.
    */

    public int get_userID() {
        return this._userID;
    }

    @SerializedName("accountID") private AccountID _accountID;
    public OrderCancelTransaction set_accountID(String __accountID) { 
        this._accountID = new AccountID(__accountID); 
        return this;
    }
    /**
    * The ID of the Account the Transaction was created for.
    */

    public String get_accountID() {
        return this._accountID.get_AccountID();
    }

    @SerializedName("batchID") private TransactionID _batchID;
    public OrderCancelTransaction set_batchID(String __batchID) { 
        this._batchID = new TransactionID(__batchID); 
        return this;
    }
    /**
    * The ID of the "batch" that the Transaction belongs to. Transactions in
    * the same batch are applied to the Account simultaneously.
    */

    public String get_batchID() {
        return this._batchID.get_TransactionID();
    }

    @SerializedName("requestID") private RequestID _requestID;
    public OrderCancelTransaction set_requestID(String __requestID) { 
        this._requestID = new RequestID(__requestID); 
        return this;
    }
    /**
    * The Request ID of the Account Control Request which generated the
    * transaction (only provided for Transactions created by a Client request)
    */

    public String get_requestID() {
        return this._requestID.get_RequestID();
    }

    @SerializedName("type") private TransactionType _type = TransactionType.ORDER_CANCEL;
    /**
    * The Type of the Transaction. Always set to "ORDER_CANCEL" for an
    * OrderCancelTransaction.
    */

    public TransactionType get_type() {
        return this._type;
    }

    @SerializedName("orderID") private OrderID _orderID;
    public OrderCancelTransaction set_orderID(String __orderID) { 
        this._orderID = new OrderID(__orderID); 
        return this;
    }
    /**
    * The ID of the Order cancelled
    */

    public String get_orderID() {
        return this._orderID.get_OrderID();
    }

    @SerializedName("clientOrderID") private OrderID _clientOrderID;
    public OrderCancelTransaction set_clientOrderID(String __clientOrderID) { 
        this._clientOrderID = new OrderID(__clientOrderID); 
        return this;
    }
    /**
    * The client ID of the Order cancelled (only provided if the Order has a
    * client Order ID).
    */

    public String get_clientOrderID() {
        return this._clientOrderID.get_OrderID();
    }

    @SerializedName("reason") private OrderCancelReason _reason;
    public OrderCancelTransaction set_reason(OrderCancelReason __reason) { 
        this._reason = __reason;
        return this;
    }
    /**
    * The reason that the Order was cancelled.
    */

    public OrderCancelReason get_reason() {
        return this._reason;
    }

    @SerializedName("replacedByOrderID") private OrderID _replacedByOrderID;
    public OrderCancelTransaction set_replacedByOrderID(String __replacedByOrderID) { 
        this._replacedByOrderID = new OrderID(__replacedByOrderID); 
        return this;
    }
    /**
    * The ID of the Order that replaced this Order (only provided if this Order
    * was cancelled for replacement).
    */

    public String get_replacedByOrderID() {
        return this._replacedByOrderID.get_OrderID();
    }
}
