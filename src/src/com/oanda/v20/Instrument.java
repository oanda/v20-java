package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* Full specification of an Instrument.
*/

public class Instrument {

    @SerializedName("name") private InstrumentName _name;
    public Instrument set_name(String __name) { 
        this._name = new InstrumentName(__name); 
        return this;
    }
    /**
    * The name of the Instrument
    */

    public String get_name() {
        return this._name.get_InstrumentName();
    }

    @SerializedName("type") private InstrumentType _type;
    /**
    * The type of the Instrument
    */

    public InstrumentType get_type() {
        return this._type;
    }

    @SerializedName("displayName") private String _displayName;
    public Instrument set_displayName(String __displayName) {
        this._displayName = __displayName;
        return this;
    }
    /**
    * The display name of the Instrument
    */

    public String get_displayName() {
        return this._displayName;
    }

    @SerializedName("pipLocation") private Integer _pipLocation;
    public Instrument set_pipLocation(int __pipLocation) {
        this._pipLocation = __pipLocation;
        return this;
    }
    /**
    * The location of the "pip" for this instrument. The decimal position of
    * the pip in this Instrument's price can be found at 10 ^ pipLocation (e.g.
    * -4 pipLocation results in a decimal pip position of 10 ^ -4 = 0.0001).
    */

    public int get_pipLocation() {
        return this._pipLocation;
    }

    @SerializedName("displayPrecision") private Integer _displayPrecision;
    public Instrument set_displayPrecision(int __displayPrecision) {
        this._displayPrecision = __displayPrecision;
        return this;
    }
    /**
    * The number of decimal places that should be used to display prices for
    * this instrument. (e.g. a displayPrecision of 5 would result in a price of
    * "1" being displayed as "1.00000")
    */

    public int get_displayPrecision() {
        return this._displayPrecision;
    }

    @SerializedName("tradeUnitsPrecision") private Integer _tradeUnitsPrecision;
    public Instrument set_tradeUnitsPrecision(int __tradeUnitsPrecision) {
        this._tradeUnitsPrecision = __tradeUnitsPrecision;
        return this;
    }
    /**
    * The amount of decimal places that may be provided when specifying the
    * number of units traded for this instrument.
    */

    public int get_tradeUnitsPrecision() {
        return this._tradeUnitsPrecision;
    }

    @SerializedName("minimumTradeSize") private DecimalNumber _minimumTradeSize;
    // Numeric stored as String
    public Instrument set_minimumTradeSize(double __minimumTradeSize) { 
        this._minimumTradeSize = new DecimalNumber(__minimumTradeSize); 
        return this;
    }
    /**
    * The smallest number of units allowed to be traded for this instrument.
    */

    public double get_minimumTradeSize() {
        return this._minimumTradeSize.get_DecimalNumber();
    }

    @SerializedName("maximumTrailingStopDistance") private DecimalNumber _maximumTrailingStopDistance;
    // Numeric stored as String
    public Instrument set_maximumTrailingStopDistance(double __maximumTrailingStopDistance) { 
        this._maximumTrailingStopDistance = new DecimalNumber(__maximumTrailingStopDistance); 
        return this;
    }
    /**
    * The maximum trailing stop distance allowed for a trailing stop loss
    * created for this instrument. Specified in price units.
    */

    public double get_maximumTrailingStopDistance() {
        return this._maximumTrailingStopDistance.get_DecimalNumber();
    }

    @SerializedName("minimumTrailingStopDistance") private DecimalNumber _minimumTrailingStopDistance;
    // Numeric stored as String
    public Instrument set_minimumTrailingStopDistance(double __minimumTrailingStopDistance) { 
        this._minimumTrailingStopDistance = new DecimalNumber(__minimumTrailingStopDistance); 
        return this;
    }
    /**
    * The minimum trailing stop distance allowed for a trailing stop loss
    * created for this instrument. Specified in price units.
    */

    public double get_minimumTrailingStopDistance() {
        return this._minimumTrailingStopDistance.get_DecimalNumber();
    }

    @SerializedName("maximumPositionSize") private DecimalNumber _maximumPositionSize;
    // Numeric stored as String
    public Instrument set_maximumPositionSize(double __maximumPositionSize) { 
        this._maximumPositionSize = new DecimalNumber(__maximumPositionSize); 
        return this;
    }
    /**
    * The maximum position size allowed for this instrument. Specified in
    * units.
    */

    public double get_maximumPositionSize() {
        return this._maximumPositionSize.get_DecimalNumber();
    }

    @SerializedName("maximumOrderUnits") private DecimalNumber _maximumOrderUnits;
    // Numeric stored as String
    public Instrument set_maximumOrderUnits(double __maximumOrderUnits) { 
        this._maximumOrderUnits = new DecimalNumber(__maximumOrderUnits); 
        return this;
    }
    /**
    * The maximum units allowed for an Order placed for this instrument.
    * Specified in units.
    */

    public double get_maximumOrderUnits() {
        return this._maximumOrderUnits.get_DecimalNumber();
    }

    @SerializedName("marginRate") private DecimalNumber _marginRate;
    // Numeric stored as String
    public Instrument set_marginRate(double __marginRate) { 
        this._marginRate = new DecimalNumber(__marginRate); 
        return this;
    }
    /**
    * The margin rate for this instrument.
    */

    public double get_marginRate() {
        return this._marginRate.get_DecimalNumber();
    }
}
