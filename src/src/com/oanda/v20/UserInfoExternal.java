package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A representation of user information, as available to external (3rd party)
* clients.
*/

public class UserInfoExternal {

    @SerializedName("userID") private Integer _userID;
    public UserInfoExternal set_userID(int __userID) {
        this._userID = __userID;
        return this;
    }
    /**
    * The user's OANDA-assigned user ID.
    */

    public int get_userID() {
        return this._userID;
    }

    @SerializedName("country") private String _country;
    public UserInfoExternal set_country(String __country) {
        this._country = __country;
        return this;
    }
    /**
    * The country that the user is based in.
    */

    public String get_country() {
        return this._country;
    }

    @SerializedName("FIFO") private Boolean _FIFO;
    public UserInfoExternal set_FIFO(boolean __FIFO) {
        this._FIFO = __FIFO;
        return this;
    }
    /**
    * Flag indicating if the the user's Accounts adhere to FIFO execution
    * rules.
    */

    public boolean get_FIFO() {
        return this._FIFO;
    }
}
