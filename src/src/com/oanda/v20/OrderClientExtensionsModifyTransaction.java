package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A OrderClientExtensionsModifyTransaction represents the modification of an
* Order's Client Extensions.
*/

public class OrderClientExtensionsModifyTransaction implements Transaction {

    @SerializedName("id") private TransactionID _id;
    public OrderClientExtensionsModifyTransaction set_id(String __id) { 
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
    public OrderClientExtensionsModifyTransaction set_time(String __time) { 
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
    public OrderClientExtensionsModifyTransaction set_userID(int __userID) {
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
    public OrderClientExtensionsModifyTransaction set_accountID(String __accountID) { 
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
    public OrderClientExtensionsModifyTransaction set_batchID(String __batchID) { 
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
    public OrderClientExtensionsModifyTransaction set_requestID(String __requestID) { 
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

    @SerializedName("type") private TransactionType _type = TransactionType.ORDER_CLIENT_EXTENSIONS_MODIFY;
    /**
    * The Type of the Transaction. Always set to
    * "ORDER_CLIENT_EXTENSIONS_MODIFY" for a
    * OrderClienteExtensionsModifyTransaction.
    */

    public TransactionType get_type() {
        return this._type;
    }

    @SerializedName("orderID") private OrderID _orderID;
    public OrderClientExtensionsModifyTransaction set_orderID(String __orderID) { 
        this._orderID = new OrderID(__orderID); 
        return this;
    }
    /**
    * The ID of the Order who's client extensions are to be modified.
    */

    public String get_orderID() {
        return this._orderID.get_OrderID();
    }

    @SerializedName("clientOrderID") private ClientID _clientOrderID;
    public OrderClientExtensionsModifyTransaction set_clientOrderID(String __clientOrderID) { 
        this._clientOrderID = new ClientID(__clientOrderID); 
        return this;
    }
    /**
    * The original Client ID of the Order who's client extensions are to be
    * modified.
    */

    public String get_clientOrderID() {
        return this._clientOrderID.get_ClientID();
    }

    @SerializedName("clientExtensionsModify") private ClientExtensions _clientExtensionsModify;
    public OrderClientExtensionsModifyTransaction set_clientExtensionsModify(ClientExtensions __clientExtensionsModify) { 
        this._clientExtensionsModify = __clientExtensionsModify;
        return this;
    }
    /**
    * The new Client Extensions for the Order.
    */

    public ClientExtensions get_clientExtensionsModify() {
        return this._clientExtensionsModify;
    }

    @SerializedName("tradeClientExtensionsModify") private ClientExtensions _tradeClientExtensionsModify;
    public OrderClientExtensionsModifyTransaction set_tradeClientExtensionsModify(ClientExtensions __tradeClientExtensionsModify) { 
        this._tradeClientExtensionsModify = __tradeClientExtensionsModify;
        return this;
    }
    /**
    * The new Client Extensions for the Order's Trade on fill.
    */

    public ClientExtensions get_tradeClientExtensionsModify() {
        return this._tradeClientExtensionsModify;
    }
}
