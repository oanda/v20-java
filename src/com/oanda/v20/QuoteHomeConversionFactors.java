package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * QuoteHomeConversionFactors represents the factors that can be used used to
 * convert quantities of a Price's Instrument's quote currency into the
 * Account's home currency.
 */
public class QuoteHomeConversionFactors {

    @SerializedName("positiveUnits") private DecimalNumber positiveUnits;

    /**
     * Set the Positive Units
     * <p>
     * The factor used to convert a positive amount of the Price's Instrument's
     * quote currency into a positive amount of the Account's home currency.
     * Conversion is performed by multiplying the quote units by the conversion
     * factor.
     * <p>
     * @param positiveUnits the Positive Units
     * @return {@link QuoteHomeConversionFactors QuoteHomeConversionFactors}
     * @see DecimalNumber
     */
    public QuoteHomeConversionFactors setPositiveUnits(double positiveUnits) {
        this.positiveUnits = new DecimalNumber(positiveUnits);
        return this;
    }

    /**
     * Get the Positive Units
     * <p>
     * The factor used to convert a positive amount of the Price's Instrument's
     * quote currency into a positive amount of the Account's home currency.
     * Conversion is performed by multiplying the quote units by the conversion
     * factor.
     * <p>
     * @return the Positive Units
     * @see DecimalNumber
     */
    public double getPositiveUnits() {
        return this.positiveUnits.getDecimalNumber();
    }

    @SerializedName("negativeUnits") private DecimalNumber negativeUnits;

    /**
     * Set the Negative Units
     * <p>
     * The factor used to convert a negative amount of the Price's Instrument's
     * quote currency into a negative amount of the Account's home currency.
     * Conversion is performed by multiplying the quote units by the conversion
     * factor.
     * <p>
     * @param negativeUnits the Negative Units
     * @return {@link QuoteHomeConversionFactors QuoteHomeConversionFactors}
     * @see DecimalNumber
     */
    public QuoteHomeConversionFactors setNegativeUnits(double negativeUnits) {
        this.negativeUnits = new DecimalNumber(negativeUnits);
        return this;
    }

    /**
     * Get the Negative Units
     * <p>
     * The factor used to convert a negative amount of the Price's Instrument's
     * quote currency into a negative amount of the Account's home currency.
     * Conversion is performed by multiplying the quote units by the conversion
     * factor.
     * <p>
     * @return the Negative Units
     * @see DecimalNumber
     */
    public double getNegativeUnits() {
        return this.negativeUnits.getDecimalNumber();
    }
}
