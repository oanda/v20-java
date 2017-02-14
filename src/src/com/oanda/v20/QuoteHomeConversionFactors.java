package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* QuoteHomeConversionFactors represents the factors that can be used used to
* convert quantities of a Price's Instrument's quote currency into the
* Account's home currency.
*/

public class QuoteHomeConversionFactors {

    @SerializedName("positiveUnits") private DecimalNumber _positiveUnits;
    // Numeric stored as String
    public QuoteHomeConversionFactors set_positiveUnits(double __positiveUnits) { 
        this._positiveUnits = new DecimalNumber(__positiveUnits); 
        return this;
    }
    /**
    * The factor used to convert a positive amount of the Price's Instrument's
    * quote currency into a positive amount of the Account's home currency.
    * Conversion is performed by multiplying the quote units by the conversion
    * factor.
    */

    public double get_positiveUnits() {
        return this._positiveUnits.get_DecimalNumber();
    }

    @SerializedName("negativeUnits") private DecimalNumber _negativeUnits;
    // Numeric stored as String
    public QuoteHomeConversionFactors set_negativeUnits(double __negativeUnits) { 
        this._negativeUnits = new DecimalNumber(__negativeUnits); 
        return this;
    }
    /**
    * The factor used to convert a negative amount of the Price's Instrument's
    * quote currency into a negative amount of the Account's home currency.
    * Conversion is performed by multiplying the quote units by the conversion
    * factor.
    */

    public double get_negativeUnits() {
        return this._negativeUnits.get_DecimalNumber();
    }
}
