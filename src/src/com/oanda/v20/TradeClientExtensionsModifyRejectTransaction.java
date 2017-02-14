package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A TradeClientExtensionsModifyRejectTransaction represents the rejection of
* the modification of a Trade's Client Extensions.
*/

public class TradeClientExtensionsModifyRejectTransaction implements Transaction {

    @SerializedName("id") private TransactionID _id;
    public TradeClientExtensionsModifyRejectTransaction set_id(String __id) { 
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
    public TradeClientExtensionsModifyRejectTransaction set_time(String __time) { 
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
    public TradeClientExtensionsModifyRejectTransaction set_userID(int __userID) {
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
    public TradeClientExtensionsModifyRejectTransaction set_accountID(String __accountID) { 
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
    public TradeClientExtensionsModifyRejectTransaction set_batchID(String __batchID) { 
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
    public TradeClientExtensionsModifyRejectTransaction set_requestID(String __requestID) { 
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

    @SerializedName("type") private TransactionType _type = TransactionType.TRADE_CLIENT_EXTENSIONS_MODIFY_REJECT;
    /**
    * The Type of the Transaction. Always set to
    * "TRADE_CLIENT_EXTENSIONS_MODIFY_REJECT" for a
    * TradeClientExtensionsModifyRejectTransaction.
    */

    public TransactionType get_type() {
        return this._type;
    }

    @SerializedName("tradeID") private TradeID _tradeID;
    public TradeClientExtensionsModifyRejectTransaction set_tradeID(String __tradeID) { 
        this._tradeID = new TradeID(__tradeID); 
        return this;
    }
    /**
    * The ID of the Trade who's client extensions are to be modified.
    */

    public String get_tradeID() {
        return this._tradeID.get_TradeID();
    }

    @SerializedName("clientTradeID") private ClientID _clientTradeID;
    public TradeClientExtensionsModifyRejectTransaction set_clientTradeID(String __clientTradeID) { 
        this._clientTradeID = new ClientID(__clientTradeID); 
        return this;
    }
    /**
    * The original Client ID of the Trade who's client extensions are to be
    * modified.
    */

    public String get_clientTradeID() {
        return this._clientTradeID.get_ClientID();
    }

    @SerializedName("tradeClientExtensionsModify") private ClientExtensions _tradeClientExtensionsModify;
    public TradeClientExtensionsModifyRejectTransaction set_tradeClientExtensionsModify(ClientExtensions __tradeClientExtensionsModify) { 
        this._tradeClientExtensionsModify = __tradeClientExtensionsModify;
        return this;
    }
    /**
    * The new Client Extensions for the Trade.
    */

    public ClientExtensions get_tradeClientExtensionsModify() {
        return this._tradeClientExtensionsModify;
    }

    @SerializedName("rejectReason") private TransactionRejectReason _rejectReason;
    public TradeClientExtensionsModifyRejectTransaction set_rejectReason(TransactionRejectReason __rejectReason) { 
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
