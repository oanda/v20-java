package com.oanda.v20.order;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.primitives.DecimalNumber;
import com.oanda.v20.primitives.GuaranteedStopLossOrderLevelRestriction;

/**
 * Details required by clients creating a Guaranteed Stop Loss Order
 */
public class GuaranteedStopLossOrderEntryData {

    /**
     * Default constructor.
     */
    public GuaranteedStopLossOrderEntryData() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the GuaranteedStopLossOrderEntryData to copy
     */
    public GuaranteedStopLossOrderEntryData(GuaranteedStopLossOrderEntryData other) {
        this.minimumDistance = other.minimumDistance;
        this.premium = other.premium;
        if (other.levelRestriction != null)
        {
            this.levelRestriction = new GuaranteedStopLossOrderLevelRestriction(other.levelRestriction);
        }
    }

    @SerializedName("minimumDistance") private DecimalNumber minimumDistance;

    /**
     * Get the minimumDistance
     * <p>
     * The minimum distance allowed between the Trade's fill price and the
     * configured price for guaranteed Stop Loss Orders created for this
     * instrument. Specified in price units.
     * <p>
     * @return the minimumDistance
     * @see DecimalNumber
     */
    public DecimalNumber getMinimumDistance() {
        return this.minimumDistance;
    }

    /**
     * Set the minimumDistance
     * <p>
     * The minimum distance allowed between the Trade's fill price and the
     * configured price for guaranteed Stop Loss Orders created for this
     * instrument. Specified in price units.
     * <p>
     * @param minimumDistance the minimumDistance as a DecimalNumber
     * @return {@link GuaranteedStopLossOrderEntryData
     * GuaranteedStopLossOrderEntryData}
     * @see DecimalNumber
     */
    public GuaranteedStopLossOrderEntryData setMinimumDistance(DecimalNumber minimumDistance) {
        this.minimumDistance = minimumDistance;
        return this;
    }
    /**
     * Set the minimumDistance
     * <p>
     * The minimum distance allowed between the Trade's fill price and the
     * configured price for guaranteed Stop Loss Orders created for this
     * instrument. Specified in price units.
     * <p>
     * @param minimumDistance the minimumDistance as a String
     * @return {@link GuaranteedStopLossOrderEntryData
     * GuaranteedStopLossOrderEntryData}
     * @see DecimalNumber
     */
    public GuaranteedStopLossOrderEntryData setMinimumDistance(String minimumDistance) {
        this.minimumDistance = new DecimalNumber(minimumDistance);
        return this;
    }
    /**
     * Set the minimumDistance
     * <p>
     * The minimum distance allowed between the Trade's fill price and the
     * configured price for guaranteed Stop Loss Orders created for this
     * instrument. Specified in price units.
     * <p>
     * @param minimumDistance the minimumDistance as a double
     * @return {@link GuaranteedStopLossOrderEntryData
     * GuaranteedStopLossOrderEntryData}
     * @see DecimalNumber
     */
    public GuaranteedStopLossOrderEntryData setMinimumDistance(double minimumDistance) {
        this.minimumDistance = new DecimalNumber(minimumDistance);
        return this;
    }
    /**
     * Set the minimumDistance
     * <p>
     * The minimum distance allowed between the Trade's fill price and the
     * configured price for guaranteed Stop Loss Orders created for this
     * instrument. Specified in price units.
     * <p>
     * @param minimumDistance the minimumDistance as a BigDecimal
     * @return {@link GuaranteedStopLossOrderEntryData
     * GuaranteedStopLossOrderEntryData}
     * @see DecimalNumber
     */
    public GuaranteedStopLossOrderEntryData setMinimumDistance(BigDecimal minimumDistance) {
        this.minimumDistance = new DecimalNumber(minimumDistance);
        return this;
    }

    @SerializedName("premium") private DecimalNumber premium;

    /**
     * Get the premium
     * <p>
     * The amount that is charged to the account if a guaranteed Stop Loss
     * Order is triggered and filled. The value is in price units and is
     * charged for each unit of the Trade.
     * <p>
     * @return the premium
     * @see DecimalNumber
     */
    public DecimalNumber getPremium() {
        return this.premium;
    }

    /**
     * Set the premium
     * <p>
     * The amount that is charged to the account if a guaranteed Stop Loss
     * Order is triggered and filled. The value is in price units and is
     * charged for each unit of the Trade.
     * <p>
     * @param premium the premium as a DecimalNumber
     * @return {@link GuaranteedStopLossOrderEntryData
     * GuaranteedStopLossOrderEntryData}
     * @see DecimalNumber
     */
    public GuaranteedStopLossOrderEntryData setPremium(DecimalNumber premium) {
        this.premium = premium;
        return this;
    }
    /**
     * Set the premium
     * <p>
     * The amount that is charged to the account if a guaranteed Stop Loss
     * Order is triggered and filled. The value is in price units and is
     * charged for each unit of the Trade.
     * <p>
     * @param premium the premium as a String
     * @return {@link GuaranteedStopLossOrderEntryData
     * GuaranteedStopLossOrderEntryData}
     * @see DecimalNumber
     */
    public GuaranteedStopLossOrderEntryData setPremium(String premium) {
        this.premium = new DecimalNumber(premium);
        return this;
    }
    /**
     * Set the premium
     * <p>
     * The amount that is charged to the account if a guaranteed Stop Loss
     * Order is triggered and filled. The value is in price units and is
     * charged for each unit of the Trade.
     * <p>
     * @param premium the premium as a double
     * @return {@link GuaranteedStopLossOrderEntryData
     * GuaranteedStopLossOrderEntryData}
     * @see DecimalNumber
     */
    public GuaranteedStopLossOrderEntryData setPremium(double premium) {
        this.premium = new DecimalNumber(premium);
        return this;
    }
    /**
     * Set the premium
     * <p>
     * The amount that is charged to the account if a guaranteed Stop Loss
     * Order is triggered and filled. The value is in price units and is
     * charged for each unit of the Trade.
     * <p>
     * @param premium the premium as a BigDecimal
     * @return {@link GuaranteedStopLossOrderEntryData
     * GuaranteedStopLossOrderEntryData}
     * @see DecimalNumber
     */
    public GuaranteedStopLossOrderEntryData setPremium(BigDecimal premium) {
        this.premium = new DecimalNumber(premium);
        return this;
    }

    @SerializedName("levelRestriction") private GuaranteedStopLossOrderLevelRestriction levelRestriction;

    /**
     * Get the levelRestriction
     * <p>
     * The guaranteed Stop Loss Order level restriction for this instrument.
     * <p>
     * @return the levelRestriction
     * @see GuaranteedStopLossOrderLevelRestriction
     */
    public GuaranteedStopLossOrderLevelRestriction getLevelRestriction() {
        return this.levelRestriction;
    }

    /**
     * Set the levelRestriction
     * <p>
     * The guaranteed Stop Loss Order level restriction for this instrument.
     * <p>
     * @param levelRestriction the levelRestriction as a
     * GuaranteedStopLossOrderLevelRestriction
     * @return {@link GuaranteedStopLossOrderEntryData
     * GuaranteedStopLossOrderEntryData}
     * @see GuaranteedStopLossOrderLevelRestriction
     */
    public GuaranteedStopLossOrderEntryData setLevelRestriction(GuaranteedStopLossOrderLevelRestriction levelRestriction) {
        this.levelRestriction = levelRestriction;
        return this;
    }

    @Override
    public String toString() {
        return "GuaranteedStopLossOrderEntryData(" +
            "minimumDistance=" +
                (minimumDistance == null ? "null" : minimumDistance.toString()) + ", " +
            "premium=" +
                (premium == null ? "null" : premium.toString()) + ", " +
            "levelRestriction=" +
                (levelRestriction == null ? "null" : levelRestriction.toString()) +
            ")";
    }
}
