package com.oanda.v20.transaction;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.primitives.DecimalNumber;

/**
 * A liquidity regeneration schedule Step indicates the amount of bid and ask
 * liquidity that is used by the Account at a certain time. These amounts will
 * only change at the timestamp of the following step.
 */
public class LiquidityRegenerationScheduleStep {

    /**
     * Default constructor.
     */
    public LiquidityRegenerationScheduleStep() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the LiquidityRegenerationScheduleStep to copy
     */
    public LiquidityRegenerationScheduleStep(LiquidityRegenerationScheduleStep other) {
        this.timestamp = other.timestamp;
        this.bidLiquidityUsed = other.bidLiquidityUsed;
        this.askLiquidityUsed = other.askLiquidityUsed;
    }

    @SerializedName("timestamp") private DateTime timestamp;

    /**
     * Get the Time
     * <p>
     * The timestamp of the schedule step.
     * <p>
     * @return the Time
     * @see DateTime
     */
    public DateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Set the Time
     * <p>
     * The timestamp of the schedule step.
     * <p>
     * @param timestamp the Time as a DateTime
     * @return {@link LiquidityRegenerationScheduleStep
     * LiquidityRegenerationScheduleStep}
     * @see DateTime
     */
    public LiquidityRegenerationScheduleStep setTimestamp(DateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    /**
     * Set the Time
     * <p>
     * The timestamp of the schedule step.
     * <p>
     * @param timestamp the Time as a String
     * @return {@link LiquidityRegenerationScheduleStep
     * LiquidityRegenerationScheduleStep}
     * @see DateTime
     */
    public LiquidityRegenerationScheduleStep setTimestamp(String timestamp) {
        this.timestamp = new DateTime(timestamp);
        return this;
    }

    @SerializedName("bidLiquidityUsed") private DecimalNumber bidLiquidityUsed;

    /**
     * Get the Bid Liquidity Used
     * <p>
     * The amount of bid liquidity used at this step in the schedule.
     * <p>
     * @return the Bid Liquidity Used
     * @see DecimalNumber
     */
    public DecimalNumber getBidLiquidityUsed() {
        return this.bidLiquidityUsed;
    }

    /**
     * Set the Bid Liquidity Used
     * <p>
     * The amount of bid liquidity used at this step in the schedule.
     * <p>
     * @param bidLiquidityUsed the Bid Liquidity Used as a DecimalNumber
     * @return {@link LiquidityRegenerationScheduleStep
     * LiquidityRegenerationScheduleStep}
     * @see DecimalNumber
     */
    public LiquidityRegenerationScheduleStep setBidLiquidityUsed(DecimalNumber bidLiquidityUsed) {
        this.bidLiquidityUsed = bidLiquidityUsed;
        return this;
    }
    /**
     * Set the Bid Liquidity Used
     * <p>
     * The amount of bid liquidity used at this step in the schedule.
     * <p>
     * @param bidLiquidityUsed the Bid Liquidity Used as a String
     * @return {@link LiquidityRegenerationScheduleStep
     * LiquidityRegenerationScheduleStep}
     * @see DecimalNumber
     */
    public LiquidityRegenerationScheduleStep setBidLiquidityUsed(String bidLiquidityUsed) {
        this.bidLiquidityUsed = new DecimalNumber(bidLiquidityUsed);
        return this;
    }
    /**
     * Set the Bid Liquidity Used
     * <p>
     * The amount of bid liquidity used at this step in the schedule.
     * <p>
     * @param bidLiquidityUsed the Bid Liquidity Used as a double
     * @return {@link LiquidityRegenerationScheduleStep
     * LiquidityRegenerationScheduleStep}
     * @see DecimalNumber
     */
    public LiquidityRegenerationScheduleStep setBidLiquidityUsed(double bidLiquidityUsed) {
        this.bidLiquidityUsed = new DecimalNumber(bidLiquidityUsed);
        return this;
    }
    /**
     * Set the Bid Liquidity Used
     * <p>
     * The amount of bid liquidity used at this step in the schedule.
     * <p>
     * @param bidLiquidityUsed the Bid Liquidity Used as a BigDecimal
     * @return {@link LiquidityRegenerationScheduleStep
     * LiquidityRegenerationScheduleStep}
     * @see DecimalNumber
     */
    public LiquidityRegenerationScheduleStep setBidLiquidityUsed(BigDecimal bidLiquidityUsed) {
        this.bidLiquidityUsed = new DecimalNumber(bidLiquidityUsed);
        return this;
    }

    @SerializedName("askLiquidityUsed") private DecimalNumber askLiquidityUsed;

    /**
     * Get the Ask Liquidity Used
     * <p>
     * The amount of ask liquidity used at this step in the schedule.
     * <p>
     * @return the Ask Liquidity Used
     * @see DecimalNumber
     */
    public DecimalNumber getAskLiquidityUsed() {
        return this.askLiquidityUsed;
    }

    /**
     * Set the Ask Liquidity Used
     * <p>
     * The amount of ask liquidity used at this step in the schedule.
     * <p>
     * @param askLiquidityUsed the Ask Liquidity Used as a DecimalNumber
     * @return {@link LiquidityRegenerationScheduleStep
     * LiquidityRegenerationScheduleStep}
     * @see DecimalNumber
     */
    public LiquidityRegenerationScheduleStep setAskLiquidityUsed(DecimalNumber askLiquidityUsed) {
        this.askLiquidityUsed = askLiquidityUsed;
        return this;
    }
    /**
     * Set the Ask Liquidity Used
     * <p>
     * The amount of ask liquidity used at this step in the schedule.
     * <p>
     * @param askLiquidityUsed the Ask Liquidity Used as a String
     * @return {@link LiquidityRegenerationScheduleStep
     * LiquidityRegenerationScheduleStep}
     * @see DecimalNumber
     */
    public LiquidityRegenerationScheduleStep setAskLiquidityUsed(String askLiquidityUsed) {
        this.askLiquidityUsed = new DecimalNumber(askLiquidityUsed);
        return this;
    }
    /**
     * Set the Ask Liquidity Used
     * <p>
     * The amount of ask liquidity used at this step in the schedule.
     * <p>
     * @param askLiquidityUsed the Ask Liquidity Used as a double
     * @return {@link LiquidityRegenerationScheduleStep
     * LiquidityRegenerationScheduleStep}
     * @see DecimalNumber
     */
    public LiquidityRegenerationScheduleStep setAskLiquidityUsed(double askLiquidityUsed) {
        this.askLiquidityUsed = new DecimalNumber(askLiquidityUsed);
        return this;
    }
    /**
     * Set the Ask Liquidity Used
     * <p>
     * The amount of ask liquidity used at this step in the schedule.
     * <p>
     * @param askLiquidityUsed the Ask Liquidity Used as a BigDecimal
     * @return {@link LiquidityRegenerationScheduleStep
     * LiquidityRegenerationScheduleStep}
     * @see DecimalNumber
     */
    public LiquidityRegenerationScheduleStep setAskLiquidityUsed(BigDecimal askLiquidityUsed) {
        this.askLiquidityUsed = new DecimalNumber(askLiquidityUsed);
        return this;
    }

    @Override
    public String toString() {
        return "LiquidityRegenerationScheduleStep(" +
            "timestamp=" +
                (timestamp == null ? "null" : timestamp.toString()) + ", " +
            "bidLiquidityUsed=" +
                (bidLiquidityUsed == null ? "null" : bidLiquidityUsed.toString()) + ", " +
            "askLiquidityUsed=" +
                (askLiquidityUsed == null ? "null" : askLiquidityUsed.toString()) +
            ")";
    }
}
