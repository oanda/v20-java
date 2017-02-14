package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A liquidity regeneration schedule Step indicates the amount of bid and ask
* liquidity that is used by the Account at a certain time. These amounts will
* only change at the timestamp of the following step.
*/

public class LiquidityRegenerationScheduleStep {

    @SerializedName("timestamp") private DateTime _timestamp;
    public LiquidityRegenerationScheduleStep set_timestamp(String __timestamp) { 
        this._timestamp = new DateTime(__timestamp); 
        return this;
    }
    /**
    * The timestamp of the schedule step.
    */

    public String get_timestamp() {
        return this._timestamp.get_DateTime();
    }

    @SerializedName("bidLiquidityUsed") private DecimalNumber _bidLiquidityUsed;
    // Numeric stored as String
    public LiquidityRegenerationScheduleStep set_bidLiquidityUsed(double __bidLiquidityUsed) { 
        this._bidLiquidityUsed = new DecimalNumber(__bidLiquidityUsed); 
        return this;
    }
    /**
    * The amount of bid liquidity used at this step in the schedule.
    */

    public double get_bidLiquidityUsed() {
        return this._bidLiquidityUsed.get_DecimalNumber();
    }

    @SerializedName("askLiquidityUsed") private DecimalNumber _askLiquidityUsed;
    // Numeric stored as String
    public LiquidityRegenerationScheduleStep set_askLiquidityUsed(double __askLiquidityUsed) { 
        this._askLiquidityUsed = new DecimalNumber(__askLiquidityUsed); 
        return this;
    }
    /**
    * The amount of ask liquidity used at this step in the schedule.
    */

    public double get_askLiquidityUsed() {
        return this._askLiquidityUsed.get_DecimalNumber();
    }
}
