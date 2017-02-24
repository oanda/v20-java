package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * A LiquidityRegenerationSchedule indicates how liquidity that is used when
 * filling an Order for an instrument is regenerated following the fill.  A
 * liquidity regeneration schedule will be in effect until the timestamp of its
 * final step, but may be replaced by a schedule created for an Order of the
 * same instrument that is filled while it is still in effect.
 */
public class LiquidityRegenerationSchedule {

    @SerializedName("steps") private LiquidityRegenerationScheduleStep[] steps;

    /**
     * Set the Steps
     * <p>
     * The steps in the Liquidity Regeneration Schedule
     * <p>
     * @param steps the Steps
     * @return {@link LiquidityRegenerationSchedule
     * LiquidityRegenerationSchedule}
     * @see LiquidityRegenerationScheduleStep
     */
    public LiquidityRegenerationSchedule setSteps(LiquidityRegenerationScheduleStep[] steps) {
        this.steps = steps;
        return this;
    }

    /**
     * Get the Steps
     * <p>
     * The steps in the Liquidity Regeneration Schedule
     * <p>
     * @return the Steps
     * @see LiquidityRegenerationScheduleStep
     */
    public LiquidityRegenerationScheduleStep[] getSteps() {
        return this.steps;
    }
}
