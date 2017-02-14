package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A representation of user information, as provided to the user themself.
*/

public class UserInfo {

    @SerializedName("username") private String _username;
    public UserInfo set_username(String __username) {
        this._username = __username;
        return this;
    }
    /**
    * The user-provided username.
    */

    public String get_username() {
        return this._username;
    }

    @SerializedName("userID") private Integer _userID;
    public UserInfo set_userID(int __userID) {
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
    public UserInfo set_country(String __country) {
        this._country = __country;
        return this;
    }
    /**
    * The country that the user is based in.
    */

    public String get_country() {
        return this._country;
    }

    @SerializedName("emailAddress") private String _emailAddress;
    public UserInfo set_emailAddress(String __emailAddress) {
        this._emailAddress = __emailAddress;
        return this;
    }
    /**
    * The user's email address.
    */

    public String get_emailAddress() {
        return this._emailAddress;
    }
}
