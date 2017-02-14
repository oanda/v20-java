package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* Properties related to an Account.
*/

public class AccountProperties {

    @SerializedName("id") private AccountID _id;
    public AccountProperties set_id(String __id) { 
        this._id = new AccountID(__id); 
        return this;
    }
    /**
    * The Account's identifier
    */

    public String get_id() {
        return this._id.get_AccountID();
    }

    @SerializedName("mt4AccountID") private Integer _mt4AccountID;
    public AccountProperties set_mt4AccountID(int __mt4AccountID) {
        this._mt4AccountID = __mt4AccountID;
        return this;
    }
    /**
    * The Account's associated MT4 Account ID. This field will not be present
    * if the Account is not an MT4 account.
    */

    public int get_mt4AccountID() {
        return this._mt4AccountID;
    }
 
    @SerializedName("tags") private String[] _tags;
    public AccountProperties set_tags(String[] __tags) {
        this._tags = __tags;
        return this;
    }
    /**
    * The Account's tags
    */

    public String[] get_tags() {
        return this._tags;
    }
}
