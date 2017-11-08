package com.oanda.v20.primitives;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

/**
 * An InstrumentCommission represents an instrument-specific commission
 */
public class InstrumentCommission {

    /**
     * Default constructor.
     */
    public InstrumentCommission() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the InstrumentCommission to copy
     */
    public InstrumentCommission(InstrumentCommission other) {
        this.commission = other.commission;
        this.unitsTraded = other.unitsTraded;
        this.minimumCommission = other.minimumCommission;
    }

    @SerializedName("commission") private DecimalNumber commission;

    /**
     * Get the commission
     * <p>
     * The commission amount (in the Account's home currency) charged per
     * unitsTraded of the instrument
     * <p>
     * @return the commission
     * @see DecimalNumber
     */
    public DecimalNumber getCommission() {
        return this.commission;
    }

    /**
     * Set the commission
     * <p>
     * The commission amount (in the Account's home currency) charged per
     * unitsTraded of the instrument
     * <p>
     * @param commission the commission as a DecimalNumber
     * @return {@link InstrumentCommission InstrumentCommission}
     * @see DecimalNumber
     */
    public InstrumentCommission setCommission(DecimalNumber commission) {
        this.commission = commission;
        return this;
    }
    /**
     * Set the commission
     * <p>
     * The commission amount (in the Account's home currency) charged per
     * unitsTraded of the instrument
     * <p>
     * @param commission the commission as a String
     * @return {@link InstrumentCommission InstrumentCommission}
     * @see DecimalNumber
     */
    public InstrumentCommission setCommission(String commission) {
        this.commission = new DecimalNumber(commission);
        return this;
    }
    /**
     * Set the commission
     * <p>
     * The commission amount (in the Account's home currency) charged per
     * unitsTraded of the instrument
     * <p>
     * @param commission the commission as a double
     * @return {@link InstrumentCommission InstrumentCommission}
     * @see DecimalNumber
     */
    public InstrumentCommission setCommission(double commission) {
        this.commission = new DecimalNumber(commission);
        return this;
    }
    /**
     * Set the commission
     * <p>
     * The commission amount (in the Account's home currency) charged per
     * unitsTraded of the instrument
     * <p>
     * @param commission the commission as a BigDecimal
     * @return {@link InstrumentCommission InstrumentCommission}
     * @see DecimalNumber
     */
    public InstrumentCommission setCommission(BigDecimal commission) {
        this.commission = new DecimalNumber(commission);
        return this;
    }

    @SerializedName("unitsTraded") private DecimalNumber unitsTraded;

    /**
     * Get the unitsTraded
     * <p>
     * The number of units traded that the commission amount is based on.
     * <p>
     * @return the unitsTraded
     * @see DecimalNumber
     */
    public DecimalNumber getUnitsTraded() {
        return this.unitsTraded;
    }

    /**
     * Set the unitsTraded
     * <p>
     * The number of units traded that the commission amount is based on.
     * <p>
     * @param unitsTraded the unitsTraded as a DecimalNumber
     * @return {@link InstrumentCommission InstrumentCommission}
     * @see DecimalNumber
     */
    public InstrumentCommission setUnitsTraded(DecimalNumber unitsTraded) {
        this.unitsTraded = unitsTraded;
        return this;
    }
    /**
     * Set the unitsTraded
     * <p>
     * The number of units traded that the commission amount is based on.
     * <p>
     * @param unitsTraded the unitsTraded as a String
     * @return {@link InstrumentCommission InstrumentCommission}
     * @see DecimalNumber
     */
    public InstrumentCommission setUnitsTraded(String unitsTraded) {
        this.unitsTraded = new DecimalNumber(unitsTraded);
        return this;
    }
    /**
     * Set the unitsTraded
     * <p>
     * The number of units traded that the commission amount is based on.
     * <p>
     * @param unitsTraded the unitsTraded as a double
     * @return {@link InstrumentCommission InstrumentCommission}
     * @see DecimalNumber
     */
    public InstrumentCommission setUnitsTraded(double unitsTraded) {
        this.unitsTraded = new DecimalNumber(unitsTraded);
        return this;
    }
    /**
     * Set the unitsTraded
     * <p>
     * The number of units traded that the commission amount is based on.
     * <p>
     * @param unitsTraded the unitsTraded as a BigDecimal
     * @return {@link InstrumentCommission InstrumentCommission}
     * @see DecimalNumber
     */
    public InstrumentCommission setUnitsTraded(BigDecimal unitsTraded) {
        this.unitsTraded = new DecimalNumber(unitsTraded);
        return this;
    }

    @SerializedName("minimumCommission") private DecimalNumber minimumCommission;

    /**
     * Get the minimumCommission
     * <p>
     * The minimum commission amount (in the Account's home currency) that is
     * charged when an Order is filled for this instrument.
     * <p>
     * @return the minimumCommission
     * @see DecimalNumber
     */
    public DecimalNumber getMinimumCommission() {
        return this.minimumCommission;
    }

    /**
     * Set the minimumCommission
     * <p>
     * The minimum commission amount (in the Account's home currency) that is
     * charged when an Order is filled for this instrument.
     * <p>
     * @param minimumCommission the minimumCommission as a DecimalNumber
     * @return {@link InstrumentCommission InstrumentCommission}
     * @see DecimalNumber
     */
    public InstrumentCommission setMinimumCommission(DecimalNumber minimumCommission) {
        this.minimumCommission = minimumCommission;
        return this;
    }
    /**
     * Set the minimumCommission
     * <p>
     * The minimum commission amount (in the Account's home currency) that is
     * charged when an Order is filled for this instrument.
     * <p>
     * @param minimumCommission the minimumCommission as a String
     * @return {@link InstrumentCommission InstrumentCommission}
     * @see DecimalNumber
     */
    public InstrumentCommission setMinimumCommission(String minimumCommission) {
        this.minimumCommission = new DecimalNumber(minimumCommission);
        return this;
    }
    /**
     * Set the minimumCommission
     * <p>
     * The minimum commission amount (in the Account's home currency) that is
     * charged when an Order is filled for this instrument.
     * <p>
     * @param minimumCommission the minimumCommission as a double
     * @return {@link InstrumentCommission InstrumentCommission}
     * @see DecimalNumber
     */
    public InstrumentCommission setMinimumCommission(double minimumCommission) {
        this.minimumCommission = new DecimalNumber(minimumCommission);
        return this;
    }
    /**
     * Set the minimumCommission
     * <p>
     * The minimum commission amount (in the Account's home currency) that is
     * charged when an Order is filled for this instrument.
     * <p>
     * @param minimumCommission the minimumCommission as a BigDecimal
     * @return {@link InstrumentCommission InstrumentCommission}
     * @see DecimalNumber
     */
    public InstrumentCommission setMinimumCommission(BigDecimal minimumCommission) {
        this.minimumCommission = new DecimalNumber(minimumCommission);
        return this;
    }

    @Override
    public String toString() {
        return "InstrumentCommission(" +
            "commission=" +
                (commission == null ? "null" : commission.toString()) + ", " +
            "unitsTraded=" +
                (unitsTraded == null ? "null" : unitsTraded.toString()) + ", " +
            "minimumCommission=" +
                (minimumCommission == null ? "null" : minimumCommission.toString()) +
            ")";
    }
}
