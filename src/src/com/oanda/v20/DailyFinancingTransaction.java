package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A DailyFinancingTransaction represents the daily payment/collection of
* financing for an Account.
*/

public class DailyFinancingTransaction implements Transaction {

    @SerializedName("id") private TransactionID _id;
    public DailyFinancingTransaction set_id(String __id) { 
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
    public DailyFinancingTransaction set_time(String __time) { 
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
    public DailyFinancingTransaction set_userID(int __userID) {
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
    public DailyFinancingTransaction set_accountID(String __accountID) { 
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
    public DailyFinancingTransaction set_batchID(String __batchID) { 
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
    public DailyFinancingTransaction set_requestID(String __requestID) { 
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

    @SerializedName("type") private TransactionType _type = TransactionType.DAILY_FINANCING;
    /**
    * The Type of the Transaction. Always set to "DAILY_FINANCING" for a
    * DailyFinancingTransaction.
    */

    public TransactionType get_type() {
        return this._type;
    }

    @SerializedName("financing") private AccountUnits _financing;
    // Numeric stored as String
    public DailyFinancingTransaction set_financing(double __financing) { 
        this._financing = new AccountUnits(__financing); 
        return this;
    }
    /**
    * The amount of financing paid/collected for the Account.
    */

    public double get_financing() {
        return this._financing.get_AccountUnits();
    }

    @SerializedName("accountBalance") private AccountUnits _accountBalance;
    // Numeric stored as String
    public DailyFinancingTransaction set_accountBalance(double __accountBalance) { 
        this._accountBalance = new AccountUnits(__accountBalance); 
        return this;
    }
    /**
    * The Account's balance after daily financing.
    */

    public double get_accountBalance() {
        return this._accountBalance.get_AccountUnits();
    }

    @SerializedName("accountFinancingMode") private AccountFinancingMode _accountFinancingMode;
    public DailyFinancingTransaction set_accountFinancingMode(AccountFinancingMode __accountFinancingMode) { 
        this._accountFinancingMode = __accountFinancingMode;
        return this;
    }
    /**
    * The account financing mode at the time of the daily financing.
    */

    public AccountFinancingMode get_accountFinancingMode() {
        return this._accountFinancingMode;
    }
 
    @SerializedName("positionFinancings") private PositionFinancing[] _positionFinancings;
    public DailyFinancingTransaction set_positionFinancings(PositionFinancing[] __positionFinancings) {
        this._positionFinancings = __positionFinancings;
        return this;
    }
    /**
    * The financing paid/collected for each Position in the Account.
    */

    public PositionFinancing[] get_positionFinancings() {
        return this._positionFinancings;
    }
}
