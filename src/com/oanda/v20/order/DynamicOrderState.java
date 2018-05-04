package com.oanda.v20.order;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.pricing_common.PriceValue;

/**
 * The dynamic state of an Order. This is only relevant to TrailingStopLoss
 * Orders, as no other Order type has dynamic state.
 */
public class DynamicOrderState {

    /**
     * Default constructor.
     */
    public DynamicOrderState() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the DynamicOrderState to copy
     */
    public DynamicOrderState(DynamicOrderState other) {
        this.id = other.id;
        this.trailingStopValue = other.trailingStopValue;
        this.triggerDistance = other.triggerDistance;
        if (other.isTriggerDistanceExact != null)
        {
            this.isTriggerDistanceExact = new Boolean(other.isTriggerDistanceExact);
        }
    }

    @SerializedName("id") private OrderID id;

    /**
     * Get the Order ID
     * <p>
     * The Order's ID.
     * <p>
     * @return the Order ID
     * @see OrderID
     */
    public OrderID getId() {
        return this.id;
    }

    /**
     * Set the Order ID
     * <p>
     * The Order's ID.
     * <p>
     * @param id the Order ID as an OrderID
     * @return {@link DynamicOrderState DynamicOrderState}
     * @see OrderID
     */
    public DynamicOrderState setId(OrderID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Order ID
     * <p>
     * The Order's ID.
     * <p>
     * @param id the Order ID as a String
     * @return {@link DynamicOrderState DynamicOrderState}
     * @see OrderID
     */
    public DynamicOrderState setId(String id) {
        this.id = new OrderID(id);
        return this;
    }

    @SerializedName("trailingStopValue") private PriceValue trailingStopValue;

    /**
     * Get the Trailing Stop Value
     * <p>
     * The Order's calculated trailing stop value.
     * <p>
     * @return the Trailing Stop Value
     * @see PriceValue
     */
    public PriceValue getTrailingStopValue() {
        return this.trailingStopValue;
    }

    /**
     * Set the Trailing Stop Value
     * <p>
     * The Order's calculated trailing stop value.
     * <p>
     * @param trailingStopValue the Trailing Stop Value as a PriceValue
     * @return {@link DynamicOrderState DynamicOrderState}
     * @see PriceValue
     */
    public DynamicOrderState setTrailingStopValue(PriceValue trailingStopValue) {
        this.trailingStopValue = trailingStopValue;
        return this;
    }
    /**
     * Set the Trailing Stop Value
     * <p>
     * The Order's calculated trailing stop value.
     * <p>
     * @param trailingStopValue the Trailing Stop Value as a String
     * @return {@link DynamicOrderState DynamicOrderState}
     * @see PriceValue
     */
    public DynamicOrderState setTrailingStopValue(String trailingStopValue) {
        this.trailingStopValue = new PriceValue(trailingStopValue);
        return this;
    }
    /**
     * Set the Trailing Stop Value
     * <p>
     * The Order's calculated trailing stop value.
     * <p>
     * @param trailingStopValue the Trailing Stop Value as a double
     * @return {@link DynamicOrderState DynamicOrderState}
     * @see PriceValue
     */
    public DynamicOrderState setTrailingStopValue(double trailingStopValue) {
        this.trailingStopValue = new PriceValue(trailingStopValue);
        return this;
    }
    /**
     * Set the Trailing Stop Value
     * <p>
     * The Order's calculated trailing stop value.
     * <p>
     * @param trailingStopValue the Trailing Stop Value as a BigDecimal
     * @return {@link DynamicOrderState DynamicOrderState}
     * @see PriceValue
     */
    public DynamicOrderState setTrailingStopValue(BigDecimal trailingStopValue) {
        this.trailingStopValue = new PriceValue(trailingStopValue);
        return this;
    }

    @SerializedName("triggerDistance") private PriceValue triggerDistance;

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
    public PriceValue getTriggerDistance() {
        return this.triggerDistance;
    }

    /**
     * Set the Trigger Distance
     * <p>
     * The distance between the Trailing Stop Loss Order's trailingStopValue
     * and the current Market Price. This represents the distance (in price
     * units) of the Order from a triggering price. If the distance could not
     * be determined, this value will not be set.
     * <p>
     * @param triggerDistance the Trigger Distance as a PriceValue
     * @return {@link DynamicOrderState DynamicOrderState}
     * @see PriceValue
     */
    public DynamicOrderState setTriggerDistance(PriceValue triggerDistance) {
        this.triggerDistance = triggerDistance;
        return this;
    }
    /**
     * Set the Trigger Distance
     * <p>
     * The distance between the Trailing Stop Loss Order's trailingStopValue
     * and the current Market Price. This represents the distance (in price
     * units) of the Order from a triggering price. If the distance could not
     * be determined, this value will not be set.
     * <p>
     * @param triggerDistance the Trigger Distance as a String
     * @return {@link DynamicOrderState DynamicOrderState}
     * @see PriceValue
     */
    public DynamicOrderState setTriggerDistance(String triggerDistance) {
        this.triggerDistance = new PriceValue(triggerDistance);
        return this;
    }
    /**
     * Set the Trigger Distance
     * <p>
     * The distance between the Trailing Stop Loss Order's trailingStopValue
     * and the current Market Price. This represents the distance (in price
     * units) of the Order from a triggering price. If the distance could not
     * be determined, this value will not be set.
     * <p>
     * @param triggerDistance the Trigger Distance as a double
     * @return {@link DynamicOrderState DynamicOrderState}
     * @see PriceValue
     */
    public DynamicOrderState setTriggerDistance(double triggerDistance) {
        this.triggerDistance = new PriceValue(triggerDistance);
        return this;
    }
    /**
     * Set the Trigger Distance
     * <p>
     * The distance between the Trailing Stop Loss Order's trailingStopValue
     * and the current Market Price. This represents the distance (in price
     * units) of the Order from a triggering price. If the distance could not
     * be determined, this value will not be set.
     * <p>
     * @param triggerDistance the Trigger Distance as a BigDecimal
     * @return {@link DynamicOrderState DynamicOrderState}
     * @see PriceValue
     */
    public DynamicOrderState setTriggerDistance(BigDecimal triggerDistance) {
        this.triggerDistance = new PriceValue(triggerDistance);
        return this;
    }

    @SerializedName("isTriggerDistanceExact") private Boolean isTriggerDistanceExact;

    /**
     * Get the Trigger Distance Is Exact
     * <p>
     * True if an exact trigger distance could be calculated. If false, it
     * means the provided trigger distance is a best estimate. If the distance
     * could not be determined, this value will not be set.
     * <p>
     * @return the Trigger Distance Is Exact
     */
    public Boolean getIsTriggerDistanceExact() {
        return this.isTriggerDistanceExact;
    }

    /**
     * Set the Trigger Distance Is Exact
     * <p>
     * True if an exact trigger distance could be calculated. If false, it
     * means the provided trigger distance is a best estimate. If the distance
     * could not be determined, this value will not be set.
     * <p>
     * @param isTriggerDistanceExact the Trigger Distance Is Exact as a Boolean
     * @return {@link DynamicOrderState DynamicOrderState}
     */
    public DynamicOrderState setIsTriggerDistanceExact(Boolean isTriggerDistanceExact) {
        this.isTriggerDistanceExact = isTriggerDistanceExact;
        return this;
    }

    @Override
    public String toString() {
        return "DynamicOrderState(" +
            "id=" +
                (id == null ? "null" : id.toString()) + ", " +
            "trailingStopValue=" +
                (trailingStopValue == null ? "null" : trailingStopValue.toString()) + ", " +
            "triggerDistance=" +
                (triggerDistance == null ? "null" : triggerDistance.toString()) + ", " +
            "isTriggerDistanceExact=" +
                (isTriggerDistanceExact == null ? "null" : isTriggerDistanceExact.toString()) +
            ")";
    }
}
