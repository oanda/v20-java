package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A CreateTransaction represents the creation of an Account.
*/

public class CreateTransaction implements Transaction {

    @SerializedName("id") private TransactionID _id;
    public CreateTransaction set_id(String __id) { 
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
    public CreateTransaction set_time(String __time) { 
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
    public CreateTransaction set_userID(int __userID) {
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
    public CreateTransaction set_accountID(String __accountID) { 
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
    public CreateTransaction set_batchID(String __batchID) { 
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
    public CreateTransaction set_requestID(String __requestID) { 
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

    @SerializedName("type") private TransactionType _type = TransactionType.CREATE;
    /**
    * The Type of the Transaction. Always set to "CREATE" in a
    * CreateTransaction.
    */

    public TransactionType get_type() {
        return this._type;
    }

    @SerializedName("divisionID") private Integer _divisionID;
    public CreateTransaction set_divisionID(int __divisionID) {
        this._divisionID = __divisionID;
        return this;
    }
    /**
    * The ID of the Division that the Account is in
    */

    public int get_divisionID() {
        return this._divisionID;
    }

    @SerializedName("siteID") private Integer _siteID;
    public CreateTransaction set_siteID(int __siteID) {
        this._siteID = __siteID;
        return this;
    }
    /**
    * The ID of the Site that the Account was created at
    */

    public int get_siteID() {
        return this._siteID;
    }

    @SerializedName("accountUserID") private Integer _accountUserID;
    public CreateTransaction set_accountUserID(int __accountUserID) {
        this._accountUserID = __accountUserID;
        return this;
    }
    /**
    * The ID of the user that the Account was created for
    */

    public int get_accountUserID() {
        return this._accountUserID;
    }

    @SerializedName("accountNumber") private Integer _accountNumber;
    public CreateTransaction set_accountNumber(int __accountNumber) {
        this._accountNumber = __accountNumber;
        return this;
    }
    /**
    * The number of the Account within the site/division/user
    */

    public int get_accountNumber() {
        return this._accountNumber;
    }

    @SerializedName("homeCurrency") private Currency _homeCurrency;
    public CreateTransaction set_homeCurrency(String __homeCurrency) { 
        this._homeCurrency = new Currency(__homeCurrency); 
        return this;
    }
    /**
    * The home currency of the Account
    */

    public String get_homeCurrency() {
        return this._homeCurrency.get_Currency();
    }
}
