package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * A liquidity regeneration schedule Step indicates the amount of bid and ask
 * liquidity that is used by the Account at a certain time. These amounts will
 * only change at the timestamp of the following step.
 */
public class LiquidityRegenerationScheduleStep {

    @SerializedName("timestamp") private DateTime timestamp;

    /**
     * Set the Time
     * <p>
     * The timestamp of the schedule step.
     * <p>
     * @param timestamp the Time
     * @return {@link LiquidityRegenerationScheduleStep
     * LiquidityRegenerationScheduleStep}
     * @see DateTime
     */
    public LiquidityRegenerationScheduleStep setTimestamp(String timestamp) {
        this.timestamp = new DateTime(timestamp);
        return this;
    }

    /**
     * Get the Time
     * <p>
     * The timestamp of the schedule step.
     * <p>
     * @return the Time
     * @see DateTime
     */
    public String getTimestamp() {
        return this.timestamp.getDateTime();
    }

    @SerializedName("bidLiquidityUsed") private DecimalNumber bidLiquidityUsed;

    /**
     * Set the Bid Liquidity Used
     * <p>
     * The amount of bid liquidity used at this step in the schedule.
     * <p>
     * @param bidLiquidityUsed the Bid Liquidity Used
     * @return {@link LiquidityRegenerationScheduleStep
     * LiquidityRegenerationScheduleStep}
     * @see DecimalNumber
     */
    public LiquidityRegenerationScheduleStep setBidLiquidityUsed(double bidLiquidityUsed) {
        this.bidLiquidityUsed = new DecimalNumber(bidLiquidityUsed);
        return this;
    }

    /**
     * Get the Bid Liquidity Used
     * <p>
     * The amount of bid liquidity used at this step in the schedule.
     * <p>
     * @return the Bid Liquidity Used
     * @see DecimalNumber
     */
    public double getBidLiquidityUsed() {
        return this.bidLiquidityUsed.getDecimalNumber();
    }

    @SerializedName("askLiquidityUsed") private DecimalNumber askLiquidityUsed;

    /**
     * Set the Ask Liquidity Used
     * <p>
     * The amount of ask liquidity used at this step in the schedule.
     * <p>
     * @param askLiquidityUsed the Ask Liquidity Used
     * @return {@link LiquidityRegenerationScheduleStep
     * LiquidityRegenerationScheduleStep}
     * @see DecimalNumber
     */
    public LiquidityRegenerationScheduleStep setAskLiquidityUsed(double askLiquidityUsed) {
        this.askLiquidityUsed = new DecimalNumber(askLiquidityUsed);
        return this;
    }

    /**
     * Get the Ask Liquidity Used
     * <p>
     * The amount of ask liquidity used at this step in the schedule.
     * <p>
     * @return the Ask Liquidity Used
     * @see DecimalNumber
     */
    public double getAskLiquidityUsed() {
        return this.askLiquidityUsed.getDecimalNumber();
    }
}
