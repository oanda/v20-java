package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A MarketOrderPositionCloseout specifies the extensions to a Market Order when
* it has been created to closeout a specific Position.
*/

public class MarketOrderPositionCloseout {

    @SerializedName("instrument") private InstrumentName _instrument;
    public MarketOrderPositionCloseout set_instrument(String __instrument) { 
        this._instrument = new InstrumentName(__instrument); 
        return this;
    }
    /**
    * The instrument of the Position being closed out.
    */

    public String get_instrument() {
        return this._instrument.get_InstrumentName();
    }

    @SerializedName("units") private String _units;
    public MarketOrderPositionCloseout set_units(String __units) {
        this._units = __units;
        return this;
    }
    /**
    * Indication of how much of the Position to close. Either "ALL", or a
    * DecimalNumber reflection a partial close of the Trade. The DecimalNumber
    * must always be positive, and represent a number that doesn't exceed the
    * absolute size of the Position.
    */

    public String get_units() {
        return this._units;
    }
}
