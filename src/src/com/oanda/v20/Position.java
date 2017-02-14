package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* The specification of a Position within an Account.
*/

public class Position {

    @SerializedName("instrument") private InstrumentName _instrument;
    public Position set_instrument(String __instrument) { 
        this._instrument = new InstrumentName(__instrument); 
        return this;
    }
    /**
    * The Position's Instrument.
    */

    public String get_instrument() {
        return this._instrument.get_InstrumentName();
    }

    @SerializedName("pl") private AccountUnits _pl;
    // Numeric stored as String
    public Position set_pl(double __pl) { 
        this._pl = new AccountUnits(__pl); 
        return this;
    }
    /**
    * Profit/loss realized by the Position over the lifetime of the Account.
    */

    public double get_pl() {
        return this._pl.get_AccountUnits();
    }

    @SerializedName("unrealizedPL") private AccountUnits _unrealizedPL;
    // Numeric stored as String
    public Position set_unrealizedPL(double __unrealizedPL) { 
        this._unrealizedPL = new AccountUnits(__unrealizedPL); 
        return this;
    }
    /**
    * The unrealized profit/loss of all open Trades that contribute to this
    * Position.
    */

    public double get_unrealizedPL() {
        return this._unrealizedPL.get_AccountUnits();
    }

    @SerializedName("resettablePL") private AccountUnits _resettablePL;
    // Numeric stored as String
    public Position set_resettablePL(double __resettablePL) { 
        this._resettablePL = new AccountUnits(__resettablePL); 
        return this;
    }
    /**
    * Profit/loss realized by the Position since the Account's resettablePL was
    * last reset by the client.
    */

    public double get_resettablePL() {
        return this._resettablePL.get_AccountUnits();
    }

    @SerializedName("long") private PositionSide _long;
    public Position set_long(PositionSide __long) { 
        this._long = __long;
        return this;
    }
    /**
    * The details of the long side of the Position.
    */

    public PositionSide get_long() {
        return this._long;
    }

    @SerializedName("short") private PositionSide _short;
    public Position set_short(PositionSide __short) { 
        this._short = __short;
        return this;
    }
    /**
    * The details of the short side of the Position.
    */

    public PositionSide get_short() {
        return this._short;
    }
}
