package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* An OrderCancelRejectTransaction represents the rejection of the cancellation
* of an Order in the client's Account.
*/

public class OrderCancelRejectTransaction implements Transaction {

    @SerializedName("id") private TransactionID _id;
    public OrderCancelRejectTransaction set_id(String __id) { 
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
    public OrderCancelRejectTransaction set_time(String __time) { 
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
    public OrderCancelRejectTransaction set_userID(int __userID) {
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
    public OrderCancelRejectTransaction set_accountID(String __accountID) { 
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
    public OrderCancelRejectTransaction set_batchID(String __batchID) { 
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
    public OrderCancelRejectTransaction set_requestID(String __requestID) { 
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

    @SerializedName("type") private TransactionType _type = TransactionType.ORDER_CANCEL_REJECT;
    /**
    * The Type of the Transaction. Always set to "ORDER_CANCEL_REJECT" for an
    * OrderCancelRejectTransaction.
    */

    public TransactionType get_type() {
        return this._type;
    }

    @SerializedName("orderID") private OrderID _orderID;
    public OrderCancelRejectTransaction set_orderID(String __orderID) { 
        this._orderID = new OrderID(__orderID); 
        return this;
    }
    /**
    * The ID of the Order intended to be cancelled
    */

    public String get_orderID() {
        return this._orderID.get_OrderID();
    }

    @SerializedName("clientOrderID") private OrderID _clientOrderID;
    public OrderCancelRejectTransaction set_clientOrderID(String __clientOrderID) { 
        this._clientOrderID = new OrderID(__clientOrderID); 
        return this;
    }
    /**
    * The client ID of the Order intended to be cancelled (only provided if the
    * Order has a client Order ID).
    */

    public String get_clientOrderID() {
        return this._clientOrderID.get_OrderID();
    }

    @SerializedName("reason") private OrderCancelReason _reason;
    public OrderCancelRejectTransaction set_reason(OrderCancelReason __reason) { 
        this._reason = __reason;
        return this;
    }
    /**
    * The reason that the Order was to be cancelled.
    */

    public OrderCancelReason get_reason() {
        return this._reason;
    }

    @SerializedName("rejectReason") private TransactionRejectReason _rejectReason;
    public OrderCancelRejectTransaction set_rejectReason(TransactionRejectReason __rejectReason) { 
        this._rejectReason = __rejectReason;
        return this;
    }
    /**
    * The reason that the Reject Transaction was created
    */

    public TransactionRejectReason get_rejectReason() {
        return this._rejectReason;
    }
}
