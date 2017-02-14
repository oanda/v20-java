package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A TransactionHeartbeat object is injected into the Transaction stream to
* ensure that the HTTP connection remains active.
*/

public class TransactionHeartbeat {

    @SerializedName("type") private String _type;
    public TransactionHeartbeat set_type(String __type) {
        this._type = __type;
        return this;
    }
    /**
    * The string "HEARTBEAT"
    */

    public String get_type() {
        return this._type;
    }

    @SerializedName("lastTransactionID") private TransactionID _lastTransactionID;
    public TransactionHeartbeat set_lastTransactionID(String __lastTransactionID) { 
        this._lastTransactionID = new TransactionID(__lastTransactionID); 
        return this;
    }
    /**
    * The ID of the most recent Transaction created for the Account
    */

    public String get_lastTransactionID() {
        return this._lastTransactionID.get_TransactionID();
    }

    @SerializedName("time") private DateTime _time;
    public TransactionHeartbeat set_time(String __time) { 
        this._time = new DateTime(__time); 
        return this;
    }
    /**
    * The date/time when the TransactionHeartbeat was created.
    */

    public String get_time() {
        return this._time.get_DateTime();
    }
}
