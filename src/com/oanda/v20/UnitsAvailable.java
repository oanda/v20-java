package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of how many units of an Instrument are available to be traded
 * by an Order depending on its postionFill option.
 */
public class UnitsAvailable {

    @SerializedName("default") private UnitsAvailableDetails defaultValue;

    /**
     * Set the Default
     * <p>
     * The number of units that are available to be traded using an Order with
     * a positionFill option of "DEFAULT". For an Account with hedging enabled,
     * this value will be the same as the "OPEN_ONLY" value. For an Account
     * without hedging enabled, this value will be the same as the
     * "REDUCE_FIRST" value.
     * <p>
     * @param defaultValue the Default
     * @return {@link UnitsAvailable UnitsAvailable}
     * @see UnitsAvailableDetails
     */
    public UnitsAvailable setDefault(UnitsAvailableDetails defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * Get the Default
     * <p>
     * The number of units that are available to be traded using an Order with
     * a positionFill option of "DEFAULT". For an Account with hedging enabled,
     * this value will be the same as the "OPEN_ONLY" value. For an Account
     * without hedging enabled, this value will be the same as the
     * "REDUCE_FIRST" value.
     * <p>
     * @return the Default
     * @see UnitsAvailableDetails
     */
    public UnitsAvailableDetails getDefault() {
        return this.defaultValue;
    }

    @SerializedName("reduceFirst") private UnitsAvailableDetails reduceFirst;

    /**
     * Set the Reduce First
     * <p>
     * The number of units that may are available to be traded with an Order
     * with a positionFill option of "REDUCE_FIRST".
     * <p>
     * @param reduceFirst the Reduce First
     * @return {@link UnitsAvailable UnitsAvailable}
     * @see UnitsAvailableDetails
     */
    public UnitsAvailable setReduceFirst(UnitsAvailableDetails reduceFirst) {
        this.reduceFirst = reduceFirst;
        return this;
    }

    /**
     * Get the Reduce First
     * <p>
     * The number of units that may are available to be traded with an Order
     * with a positionFill option of "REDUCE_FIRST".
     * <p>
     * @return the Reduce First
     * @see UnitsAvailableDetails
     */
    public UnitsAvailableDetails getReduceFirst() {
        return this.reduceFirst;
    }

    @SerializedName("reduceOnly") private UnitsAvailableDetails reduceOnly;

    /**
     * Set the Reduce Only
     * <p>
     * The number of units that may are available to be traded with an Order
     * with a positionFill option of "REDUCE_ONLY".
     * <p>
     * @param reduceOnly the Reduce Only
     * @return {@link UnitsAvailable UnitsAvailable}
     * @see UnitsAvailableDetails
     */
    public UnitsAvailable setReduceOnly(UnitsAvailableDetails reduceOnly) {
        this.reduceOnly = reduceOnly;
        return this;
    }

    /**
     * Get the Reduce Only
     * <p>
     * The number of units that may are available to be traded with an Order
     * with a positionFill option of "REDUCE_ONLY".
     * <p>
     * @return the Reduce Only
     * @see UnitsAvailableDetails
     */
    public UnitsAvailableDetails getReduceOnly() {
        return this.reduceOnly;
    }

    @SerializedName("openOnly") private UnitsAvailableDetails openOnly;

    /**
     * Set the Open Only
     * <p>
     * The number of units that may are available to be traded with an Order
     * with a positionFill option of "OPEN_ONLY".
     * <p>
     * @param openOnly the Open Only
     * @return {@link UnitsAvailable UnitsAvailable}
     * @see UnitsAvailableDetails
     */
    public UnitsAvailable setOpenOnly(UnitsAvailableDetails openOnly) {
        this.openOnly = openOnly;
        return this;
    }

    /**
     * Get the Open Only
     * <p>
     * The number of units that may are available to be traded with an Order
     * with a positionFill option of "OPEN_ONLY".
     * <p>
     * @return the Open Only
     * @see UnitsAvailableDetails
     */
    public UnitsAvailableDetails getOpenOnly() {
        return this.openOnly;
    }
}
