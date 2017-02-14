package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A DelayedTradeClosure Transaction is created administratively to indicate
* open trades that should have been closed but weren't because the open trades'
* instruments were untradeable at the time. Open trades listed in this
* transaction will be closed once their respective instruments become
* tradeable.
*/

public class DelayedTradeClosureTransaction implements Transaction {

    @SerializedName("id") private TransactionID _id;
    public DelayedTradeClosureTransaction set_id(String __id) { 
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
    public DelayedTradeClosureTransaction set_time(String __time) { 
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
    public DelayedTradeClosureTransaction set_userID(int __userID) {
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
    public DelayedTradeClosureTransaction set_accountID(String __accountID) { 
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
    public DelayedTradeClosureTransaction set_batchID(String __batchID) { 
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
    public DelayedTradeClosureTransaction set_requestID(String __requestID) { 
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

    @SerializedName("type") private TransactionType _type = TransactionType.DELAYED_TRADE_CLOSURE;
    /**
    * The Type of the Transaction. Always set to "DELAYED_TRADE_CLOSURE" for an
    * DelayedTradeClosureTransaction.
    */

    public TransactionType get_type() {
        return this._type;
    }

    @SerializedName("reason") private MarketOrderReason _reason;
    public DelayedTradeClosureTransaction set_reason(MarketOrderReason __reason) { 
        this._reason = __reason;
        return this;
    }
    /**
    * The reason for the delayed trade closure
    */

    public MarketOrderReason get_reason() {
        return this._reason;
    }

    @SerializedName("tradeIDs") private TradeID _tradeIDs;
    public DelayedTradeClosureTransaction set_tradeIDs(String __tradeIDs) { 
        this._tradeIDs = new TradeID(__tradeIDs); 
        return this;
    }
    /**
    * List of Trade ID's identifying the open trades that will be closed when
    * their respective instruments become tradeable
    */

    public String get_tradeIDs() {
        return this._tradeIDs.get_TradeID();
    }
}
