package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* The representation of a Position for a single direction (long or short).
*/

public class PositionSide {

    @SerializedName("units") private DecimalNumber _units;
    // Numeric stored as String
    public PositionSide set_units(double __units) { 
        this._units = new DecimalNumber(__units); 
        return this;
    }
    /**
    * Number of units in the position (negative value indicates short position,
    * positive indicates long position).
    */

    public double get_units() {
        return this._units.get_DecimalNumber();
    }

    @SerializedName("averagePrice") private PriceValue _averagePrice;
    // Numeric stored as String
    public PositionSide set_averagePrice(double __averagePrice) { 
        this._averagePrice = new PriceValue(__averagePrice); 
        return this;
    }
    /**
    * Volume-weighted average of the underlying Trade open prices for the
    * Position.
    */

    public double get_averagePrice() {
        return this._averagePrice.get_PriceValue();
    }
 
    @SerializedName("tradeIDs") private TradeID[] _tradeIDs;
    public PositionSide set_tradeIDs(TradeID[] __tradeIDs) {
        this._tradeIDs = __tradeIDs;
        return this;
    }
    /**
    * List of the open Trade IDs which contribute to the open Position.
    */

    public TradeID[] get_tradeIDs() {
        return this._tradeIDs;
    }

    @SerializedName("pl") private AccountUnits _pl;
    // Numeric stored as String
    public PositionSide set_pl(double __pl) { 
        this._pl = new AccountUnits(__pl); 
        return this;
    }
    /**
    * Profit/loss realized by the PositionSide over the lifetime of the
    * Account.
    */

    public double get_pl() {
        return this._pl.get_AccountUnits();
    }

    @SerializedName("unrealizedPL") private AccountUnits _unrealizedPL;
    // Numeric stored as String
    public PositionSide set_unrealizedPL(double __unrealizedPL) { 
        this._unrealizedPL = new AccountUnits(__unrealizedPL); 
        return this;
    }
    /**
    * The unrealized profit/loss of all open Trades that contribute to this
    * PositionSide.
    */

    public double get_unrealizedPL() {
        return this._unrealizedPL.get_AccountUnits();
    }

    @SerializedName("resettablePL") private AccountUnits _resettablePL;
    // Numeric stored as String
    public PositionSide set_resettablePL(double __resettablePL) { 
        this._resettablePL = new AccountUnits(__resettablePL); 
        return this;
    }
    /**
    * Profit/loss realized by the PositionSide since the Account's resettablePL
    * was last reset by the client.
    */

    public double get_resettablePL() {
        return this._resettablePL.get_AccountUnits();
    }
}
