package com.oanda.v20.order;

import com.google.gson.annotations.SerializedName;

/**
 * Representation of how many units of an Instrument are available to be traded
 * by an Order depending on its postionFill option.
 */
public class UnitsAvailable {

    /**
     * Default constructor.
     */
    public UnitsAvailable() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the UnitsAvailable to copy
     */
    public UnitsAvailable(UnitsAvailable other) {
        if (other.defaultValue != null)
        {
            this.defaultValue = new UnitsAvailableDetails(other.defaultValue);
        }
        if (other.reduceFirst != null)
        {
            this.reduceFirst = new UnitsAvailableDetails(other.reduceFirst);
        }
        if (other.reduceOnly != null)
        {
            this.reduceOnly = new UnitsAvailableDetails(other.reduceOnly);
        }
        if (other.openOnly != null)
        {
            this.openOnly = new UnitsAvailableDetails(other.openOnly);
        }
    }

    @SerializedName("default") private UnitsAvailableDetails defaultValue;

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

    /**
     * Set the Default
     * <p>
     * The number of units that are available to be traded using an Order with
     * a positionFill option of "DEFAULT". For an Account with hedging enabled,
     * this value will be the same as the "OPEN_ONLY" value. For an Account
     * without hedging enabled, this value will be the same as the
     * "REDUCE_FIRST" value.
     * <p>
     * @param defaultValue the Default as an UnitsAvailableDetails
     * @return {@link UnitsAvailable UnitsAvailable}
     * @see UnitsAvailableDetails
     */
    public UnitsAvailable setDefault(UnitsAvailableDetails defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    @SerializedName("reduceFirst") private UnitsAvailableDetails reduceFirst;

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

    /**
     * Set the Reduce First
     * <p>
     * The number of units that may are available to be traded with an Order
     * with a positionFill option of "REDUCE_FIRST".
     * <p>
     * @param reduceFirst the Reduce First as an UnitsAvailableDetails
     * @return {@link UnitsAvailable UnitsAvailable}
     * @see UnitsAvailableDetails
     */
    public UnitsAvailable setReduceFirst(UnitsAvailableDetails reduceFirst) {
        this.reduceFirst = reduceFirst;
        return this;
    }

    @SerializedName("reduceOnly") private UnitsAvailableDetails reduceOnly;

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

    /**
     * Set the Reduce Only
     * <p>
     * The number of units that may are available to be traded with an Order
     * with a positionFill option of "REDUCE_ONLY".
     * <p>
     * @param reduceOnly the Reduce Only as an UnitsAvailableDetails
     * @return {@link UnitsAvailable UnitsAvailable}
     * @see UnitsAvailableDetails
     */
    public UnitsAvailable setReduceOnly(UnitsAvailableDetails reduceOnly) {
        this.reduceOnly = reduceOnly;
        return this;
    }

    @SerializedName("openOnly") private UnitsAvailableDetails openOnly;

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

    /**
     * Set the Open Only
     * <p>
     * The number of units that may are available to be traded with an Order
     * with a positionFill option of "OPEN_ONLY".
     * <p>
     * @param openOnly the Open Only as an UnitsAvailableDetails
     * @return {@link UnitsAvailable UnitsAvailable}
     * @see UnitsAvailableDetails
     */
    public UnitsAvailable setOpenOnly(UnitsAvailableDetails openOnly) {
        this.openOnly = openOnly;
        return this;
    }

    @Override
    public String toString() {
        return "UnitsAvailable(" +
            "default=" +
                (defaultValue == null ? "null" : defaultValue.toString()) + ", " +
            "reduceFirst=" +
                (reduceFirst == null ? "null" : reduceFirst.toString()) + ", " +
            "reduceOnly=" +
                (reduceOnly == null ? "null" : reduceOnly.toString()) + ", " +
            "openOnly=" +
                (openOnly == null ? "null" : openOnly.toString()) +
            ")";
    }
}
