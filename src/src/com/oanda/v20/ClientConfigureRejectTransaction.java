package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A ClientConfigureRejectTransaction represents the reject of configuration of
* an Account by a client.
*/

public class ClientConfigureRejectTransaction implements Transaction {

    @SerializedName("id") private TransactionID _id;
    public ClientConfigureRejectTransaction set_id(String __id) { 
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
    public ClientConfigureRejectTransaction set_time(String __time) { 
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
    public ClientConfigureRejectTransaction set_userID(int __userID) {
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
    public ClientConfigureRejectTransaction set_accountID(String __accountID) { 
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
    public ClientConfigureRejectTransaction set_batchID(String __batchID) { 
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
    public ClientConfigureRejectTransaction set_requestID(String __requestID) { 
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

    @SerializedName("type") private TransactionType _type = TransactionType.CLIENT_CONFIGURE_REJECT;
    /**
    * The Type of the Transaction. Always set to "CLIENT_CONFIGURE_REJECT" in a
    * ClientConfigureRejectTransaction.
    */

    public TransactionType get_type() {
        return this._type;
    }

    @SerializedName("alias") private String _alias;
    public ClientConfigureRejectTransaction set_alias(String __alias) {
        this._alias = __alias;
        return this;
    }
    /**
    * The client-provided alias for the Account.
    */

    public String get_alias() {
        return this._alias;
    }

    @SerializedName("marginRate") private DecimalNumber _marginRate;
    // Numeric stored as String
    public ClientConfigureRejectTransaction set_marginRate(double __marginRate) { 
        this._marginRate = new DecimalNumber(__marginRate); 
        return this;
    }
    /**
    * The margin rate override for the Account.
    */

    public double get_marginRate() {
        return this._marginRate.get_DecimalNumber();
    }

    @SerializedName("rejectReason") private TransactionRejectReason _rejectReason;
    public ClientConfigureRejectTransaction set_rejectReason(TransactionRejectReason __rejectReason) { 
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
