package com.oanda.v20.transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

import com.google.gson.annotations.SerializedName;

/**
 * A LiquidityRegenerationSchedule indicates how liquidity that is used when
 * filling an Order for an instrument is regenerated following the fill.  A
 * liquidity regeneration schedule will be in effect until the timestamp of its
 * final step, but may be replaced by a schedule created for an Order of the
 * same instrument that is filled while it is still in effect.
 */
public class LiquidityRegenerationSchedule {

    /**
     * Default constructor.
     */
    public LiquidityRegenerationSchedule() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the LiquidityRegenerationSchedule to copy
     */
    public LiquidityRegenerationSchedule(LiquidityRegenerationSchedule other) {
        if (other.steps != null)
        {
            this.steps = new ArrayList<LiquidityRegenerationScheduleStep>(other.steps);
        }
    }

    @SerializedName("steps") private ArrayList<LiquidityRegenerationScheduleStep> steps;

    /**
     * Get the Steps
     * <p>
     * The steps in the Liquidity Regeneration Schedule
     * <p>
     * @return the Steps
     * @see LiquidityRegenerationScheduleStep
     */
    public List<LiquidityRegenerationScheduleStep> getSteps() {
        return this.steps;
    }

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
    public LiquidityRegenerationSchedule setSteps(Collection<?> steps) {
        ArrayList<LiquidityRegenerationScheduleStep> newSteps = new ArrayList<LiquidityRegenerationScheduleStep>(steps.size());
        steps.forEach((item) -> {
            if (item instanceof LiquidityRegenerationScheduleStep)
            {
                newSteps.add((LiquidityRegenerationScheduleStep) item);
            }
            else
            {
                throw new IllegalArgumentException(
                    item.getClass().getName() + " cannot be converted to a LiquidityRegenerationScheduleStep"
                );
            }
        });
        this.steps = newSteps;
        return this;
    }

    @Override
    public String toString() {
        return "LiquidityRegenerationSchedule(" +
            "steps=" +
                (steps == null ? "null" : steps.toString()) +
            ")";
    }
}
