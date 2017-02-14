package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A PricingHeartbeat object is injected into the Pricing stream to ensure that
* the HTTP connection remains active.
*/

public class PricingHeartbeat {

    @SerializedName("type") private String _type;
    public PricingHeartbeat set_type(String __type) {
        this._type = __type;
        return this;
    }
    /**
    * The string "HEARTBEAT"
    */

    public String get_type() {
        return this._type;
    }

    @SerializedName("time") private DateTime _time;
    public PricingHeartbeat set_time(String __time) { 
        this._time = new DateTime(__time); 
        return this;
    }
    /**
    * The date/time when the Heartbeat was created.
    */

    public String get_time() {
        return this._time.get_DateTime();
    }
}
