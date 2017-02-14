package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A ClientExtensions object allows a client to attach a clientID, tag and
* comment to Orders and Trades in their Account.  Do not set, modify, or delete
* this field if your account is associated with MT4.
*/

public class ClientExtensions {

    @SerializedName("id") private ClientID _id;
    public ClientExtensions set_id(String __id) { 
        this._id = new ClientID(__id); 
        return this;
    }
    /**
    * The Client ID of the Order/Trade
    */

    public String get_id() {
        return this._id.get_ClientID();
    }

    @SerializedName("tag") private ClientTag _tag;
    public ClientExtensions set_tag(String __tag) { 
        this._tag = new ClientTag(__tag); 
        return this;
    }
    /**
    * A tag associated with the Order/Trade
    */

    public String get_tag() {
        return this._tag.get_ClientTag();
    }

    @SerializedName("comment") private ClientComment _comment;
    public ClientExtensions set_comment(String __comment) { 
        this._comment = new ClientComment(__comment); 
        return this;
    }
    /**
    * A comment associated with the Order/Trade
    */

    public String get_comment() {
        return this._comment.get_ClientComment();
    }
}
