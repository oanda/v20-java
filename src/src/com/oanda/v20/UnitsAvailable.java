package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* Representation of how many units of an Instrument are available to be traded
* by an Order depending on its postionFill option.
*/

public class UnitsAvailable {

    @SerializedName("default") private UnitsAvailableDetails _default;
    public UnitsAvailable set_default(UnitsAvailableDetails __default) { 
        this._default = __default;
        return this;
    }
    /**
    * The number of units that are available to be traded using an Order with a
    * positionFill option of "DEFAULT". For an Account with hedging enabled,
    * this value will be the same as the "OPEN_ONLY" value. For an Account
    * without hedging enabled, this value will be the same as the
    * "REDUCE_FIRST" value.
    */

    public UnitsAvailableDetails get_default() {
        return this._default;
    }

    @SerializedName("reduceFirst") private UnitsAvailableDetails _reduceFirst;
    public UnitsAvailable set_reduceFirst(UnitsAvailableDetails __reduceFirst) { 
        this._reduceFirst = __reduceFirst;
        return this;
    }
    /**
    * The number of units that may are available to be traded with an Order
    * with a positionFill option of "REDUCE_FIRST".
    */

    public UnitsAvailableDetails get_reduceFirst() {
        return this._reduceFirst;
    }

    @SerializedName("reduceOnly") private UnitsAvailableDetails _reduceOnly;
    public UnitsAvailable set_reduceOnly(UnitsAvailableDetails __reduceOnly) { 
        this._reduceOnly = __reduceOnly;
        return this;
    }
    /**
    * The number of units that may are available to be traded with an Order
    * with a positionFill option of "REDUCE_ONLY".
    */

    public UnitsAvailableDetails get_reduceOnly() {
        return this._reduceOnly;
    }

    @SerializedName("openOnly") private UnitsAvailableDetails _openOnly;
    public UnitsAvailable set_openOnly(UnitsAvailableDetails __openOnly) { 
        this._openOnly = __openOnly;
        return this;
    }
    /**
    * The number of units that may are available to be traded with an Order
    * with a positionFill option of "OPEN_ONLY".
    */

    public UnitsAvailableDetails get_openOnly() {
        return this._openOnly;
    }
}
