package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A TransferFundsRejectTransaction represents the rejection of the transfer of
* funds in/out of an Account.
*/

public class TransferFundsRejectTransaction implements Transaction {

    @SerializedName("id") private TransactionID _id;
    public TransferFundsRejectTransaction set_id(String __id) { 
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
    public TransferFundsRejectTransaction set_time(String __time) { 
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
    public TransferFundsRejectTransaction set_userID(int __userID) {
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
    public TransferFundsRejectTransaction set_accountID(String __accountID) { 
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
    public TransferFundsRejectTransaction set_batchID(String __batchID) { 
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
    public TransferFundsRejectTransaction set_requestID(String __requestID) { 
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

    @SerializedName("type") private TransactionType _type = TransactionType.TRANSFER_FUNDS_REJECT;
    /**
    * The Type of the Transaction. Always set to "TRANSFER_FUNDS_REJECT" in a
    * TransferFundsRejectTransaction.
    */

    public TransactionType get_type() {
        return this._type;
    }

    @SerializedName("amount") private AccountUnits _amount;
    // Numeric stored as String
    public TransferFundsRejectTransaction set_amount(double __amount) { 
        this._amount = new AccountUnits(__amount); 
        return this;
    }
    /**
    * The amount to deposit/withdraw from the Account in the Account's home
    * currency. A positive value indicates a deposit, a negative value
    * indicates a withdrawal.
    */

    public double get_amount() {
        return this._amount.get_AccountUnits();
    }

    @SerializedName("fundingReason") private FundingReason _fundingReason;
    public TransferFundsRejectTransaction set_fundingReason(FundingReason __fundingReason) { 
        this._fundingReason = __fundingReason;
        return this;
    }
    /**
    * The reason that an Account is being funded.
    */

    public FundingReason get_fundingReason() {
        return this._fundingReason;
    }

    @SerializedName("rejectReason") private TransactionRejectReason _rejectReason;
    public TransferFundsRejectTransaction set_rejectReason(TransactionRejectReason __rejectReason) { 
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
