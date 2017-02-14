package com.oanda.v20;

    // The base Transaction specification. Specifies properties that are common
    // between all Transaction.

public interface Transaction {

    public TransactionType get_type();

    // The Transaction's Identifier.
    public Transaction set_id(String __id);
    public String get_id();

    // The date/time when the Transaction was created.
    public Transaction set_time(String __time);
    public String get_time();

    // The ID of the user that initiated the creation of the Transaction.
    public Transaction set_userID(int __userID);
    public int get_userID();

    // The ID of the Account the Transaction was created for.
    public Transaction set_accountID(String __accountID);
    public String get_accountID();

    // The ID of the "batch" that the Transaction belongs to. Transactions in
    // the same batch are applied to the Account simultaneously.
    public Transaction set_batchID(String __batchID);
    public String get_batchID();

    // The Request ID of the Account Control Request which generated the
    // transaction (only provided for Transactions created by a Client request)
    public Transaction set_requestID(String __requestID);
    public String get_requestID();
}
