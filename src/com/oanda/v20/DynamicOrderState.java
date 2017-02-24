package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * The dynamic state of an Order. This is only relevant to TrailingStopLoss
 * Orders, as no other Order type has dynamic state.
 */
public class DynamicOrderState {

    @SerializedName("id") private OrderID id;

    /**
     * Set the Order ID
     * <p>
     * The Order's ID.
     * <p>
     * @param id the Order ID
     * @return {@link DynamicOrderState DynamicOrderState}
     * @see OrderID
     */
    public DynamicOrderState setId(String id) {
        this.id = new OrderID(id);
        return this;
    }

    /**
     * Get the Order ID
     * <p>
     * The Order's ID.
     * <p>
     * @return the Order ID
     * @see OrderID
     */
    public String getId() {
        return this.id.getOrderID();
    }

    @SerializedName("trailingStopValue") private PriceValue trailingStopValue;

    /**
     * Set the Trailing Stop Value
     * <p>
     * The Order's calculated trailing stop value.
     * <p>
     * @param trailingStopValue the Trailing Stop Value
     * @return {@link DynamicOrderState DynamicOrderState}
     * @see PriceValue
     */
    public DynamicOrderState setTrailingStopValue(double trailingStopValue) {
        this.trailingStopValue = new PriceValue(trailingStopValue);
        return this;
    }

    /**
     * Get the Trailing Stop Value
     * <p>
     * The Order's calculated trailing stop value.
     * <p>
     * @return the Trailing Stop Value
     * @see PriceValue
     */
    public double getTrailingStopValue() {
        return this.trailingStopValue.getPriceValue();
    }

    @SerializedName("triggerDistance") private PriceValue triggerDistance;

    /**
     * Set the Trigger Distance
     * <p>
     * The distance between the Trailing Stop Loss Order's trailingStopValue
     * and the current Market Price. This represents the distance (in price
     * units) of the Order from a triggering price. If the distance could not
     * be determined, this value will not be set.
     * <p>
     * @param triggerDistance the Trigger Distance
     * @return {@link DynamicOrderState DynamicOrderState}
     * @see PriceValue
     */
    public DynamicOrderState setTriggerDistance(double triggerDistance) {
        this.triggerDistance = new PriceValue(triggerDistance);
        return this;
    }

    /**
     * Get the Trigger Distance
     * <p>
     * The distance between the Trailing Stop Loss Order's trailingStopValue
     * and the current Market Price. This represents the distance (in price
     * units) of the Order from a triggering price. If the distance could not
     * be determined, this value will not be set.
     * <p>
     * @return the Trigger Distance
     * @see PriceValue
     */
    public double getTriggerDistance() {
        return this.triggerDistance.getPriceValue();
    }

    @SerializedName("isTriggerDistanceExact") private Boolean isTriggerDistanceExact;

    /**
     * Set the Trigger Distance Is Exact
     * <p>
     * True if an exact trigger distance could be calculated. If false, it
     * means the provided trigger distance is a best estimate. If the distance
     * could not be determined, this value will not be set.
     * <p>
     * @param isTriggerDistanceExact the Trigger Distance Is Exact
     * @return {@link DynamicOrderState DynamicOrderState}
     */
    public DynamicOrderState setIsTriggerDistanceExact(boolean isTriggerDistanceExact) {
        this.isTriggerDistanceExact = isTriggerDistanceExact;
        return this;
    }

    /**
     * Get the Trigger Distance Is Exact
     * <p>
     * True if an exact trigger distance could be calculated. If false, it
     * means the provided trigger distance is a best estimate. If the distance
     * could not be determined, this value will not be set.
     * <p>
     * @return the Trigger Distance Is Exact
     */
    public boolean getIsTriggerDistanceExact() {
        return this.isTriggerDistanceExact;
    }
}
