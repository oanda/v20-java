package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* The dynamic (calculated) state of a Position
*/

public class CalculatedPositionState {

    @SerializedName("instrument") private InstrumentName _instrument;
    public CalculatedPositionState set_instrument(String __instrument) { 
        this._instrument = new InstrumentName(__instrument); 
        return this;
    }
    /**
    * The Position's Instrument.
    */

    public String get_instrument() {
        return this._instrument.get_InstrumentName();
    }

    @SerializedName("netUnrealizedPL") private AccountUnits _netUnrealizedPL;
    // Numeric stored as String
    public CalculatedPositionState set_netUnrealizedPL(double __netUnrealizedPL) { 
        this._netUnrealizedPL = new AccountUnits(__netUnrealizedPL); 
        return this;
    }
    /**
    * The Position's net unrealized profit/loss
    */

    public double get_netUnrealizedPL() {
        return this._netUnrealizedPL.get_AccountUnits();
    }

    @SerializedName("longUnrealizedPL") private AccountUnits _longUnrealizedPL;
    // Numeric stored as String
    public CalculatedPositionState set_longUnrealizedPL(double __longUnrealizedPL) { 
        this._longUnrealizedPL = new AccountUnits(__longUnrealizedPL); 
        return this;
    }
    /**
    * The unrealized profit/loss of the Position's long open Trades
    */

    public double get_longUnrealizedPL() {
        return this._longUnrealizedPL.get_AccountUnits();
    }

    @SerializedName("shortUnrealizedPL") private AccountUnits _shortUnrealizedPL;
    // Numeric stored as String
    public CalculatedPositionState set_shortUnrealizedPL(double __shortUnrealizedPL) { 
        this._shortUnrealizedPL = new AccountUnits(__shortUnrealizedPL); 
        return this;
    }
    /**
    * The unrealized profit/loss of the Position's short open Trades
    */

    public double get_shortUnrealizedPL() {
        return this._shortUnrealizedPL.get_AccountUnits();
    }
}
