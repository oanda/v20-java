package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* The dynamic state of an Order. This is only relevant to TrailingStopLoss
* Orders, as no other Order type has dynamic state.
*/

public class DynamicOrderState {

    @SerializedName("id") private OrderID _id;
    public DynamicOrderState set_id(String __id) { 
        this._id = new OrderID(__id); 
        return this;
    }
    /**
    * The Order's ID.
    */

    public String get_id() {
        return this._id.get_OrderID();
    }

    @SerializedName("trailingStopValue") private PriceValue _trailingStopValue;
    // Numeric stored as String
    public DynamicOrderState set_trailingStopValue(double __trailingStopValue) { 
        this._trailingStopValue = new PriceValue(__trailingStopValue); 
        return this;
    }
    /**
    * The Order's calculated trailing stop value.
    */

    public double get_trailingStopValue() {
        return this._trailingStopValue.get_PriceValue();
    }

    @SerializedName("triggerDistance") private PriceValue _triggerDistance;
    // Numeric stored as String
    public DynamicOrderState set_triggerDistance(double __triggerDistance) { 
        this._triggerDistance = new PriceValue(__triggerDistance); 
        return this;
    }
    /**
    * The distance between the Trailing Stop Loss Order's trailingStopValue and
    * the current Market Price. This represents the distance (in price units)
    * of the Order from a triggering price. If the distance could not be
    * determined, this value will not be set.
    */

    public double get_triggerDistance() {
        return this._triggerDistance.get_PriceValue();
    }

    @SerializedName("isTriggerDistanceExact") private Boolean _isTriggerDistanceExact;
    public DynamicOrderState set_isTriggerDistanceExact(boolean __isTriggerDistanceExact) {
        this._isTriggerDistanceExact = __isTriggerDistanceExact;
        return this;
    }
    /**
    * True if an exact trigger distance could be calculated. If false, it means
    * the provided trigger distance is a best estimate. If the distance could
    * not be determined, this value will not be set.
    */

    public boolean get_isTriggerDistanceExact() {
        return this._isTriggerDistanceExact;
    }
}
