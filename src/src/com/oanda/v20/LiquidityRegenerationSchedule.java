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
 
    @SerializedName("steps") private LiquidityRegenerationScheduleStep[] _steps;
    public LiquidityRegenerationSchedule set_steps(LiquidityRegenerationScheduleStep[] __steps) {
        this._steps = __steps;
        return this;
    }
    /**
    * The steps in the Liquidity Regeneration Schedule
    */

    public LiquidityRegenerationScheduleStep[] get_steps() {
        return this._steps;
    }
}
