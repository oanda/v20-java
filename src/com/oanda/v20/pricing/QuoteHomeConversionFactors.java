package com.oanda.v20.pricing;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.primitives.DecimalNumber;

/**
 * QuoteHomeConversionFactors represents the factors that can be used used to
 * convert quantities of a Price's Instrument's quote currency into the
 * Account's home currency.
 */
public class QuoteHomeConversionFactors {

    /**
     * Default constructor.
     */
    public QuoteHomeConversionFactors() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the QuoteHomeConversionFactors to copy
     */
    public QuoteHomeConversionFactors(QuoteHomeConversionFactors other) {
        this.positiveUnits = other.positiveUnits;
        this.negativeUnits = other.negativeUnits;
    }

    @SerializedName("positiveUnits") private DecimalNumber positiveUnits;

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
    public DecimalNumber getPositiveUnits() {
        return this.positiveUnits;
    }

    /**
     * Set the Positive Units
     * <p>
     * The factor used to convert a positive amount of the Price's Instrument's
     * quote currency into a positive amount of the Account's home currency.
     * Conversion is performed by multiplying the quote units by the conversion
     * factor.
     * <p>
     * @param positiveUnits the Positive Units as a DecimalNumber
     * @return {@link QuoteHomeConversionFactors QuoteHomeConversionFactors}
     * @see DecimalNumber
     */
    public QuoteHomeConversionFactors setPositiveUnits(DecimalNumber positiveUnits) {
        this.positiveUnits = positiveUnits;
        return this;
    }
    /**
     * Set the Positive Units
     * <p>
     * The factor used to convert a positive amount of the Price's Instrument's
     * quote currency into a positive amount of the Account's home currency.
     * Conversion is performed by multiplying the quote units by the conversion
     * factor.
     * <p>
     * @param positiveUnits the Positive Units as a String
     * @return {@link QuoteHomeConversionFactors QuoteHomeConversionFactors}
     * @see DecimalNumber
     */
    public QuoteHomeConversionFactors setPositiveUnits(String positiveUnits) {
        this.positiveUnits = new DecimalNumber(positiveUnits);
        return this;
    }
    /**
     * Set the Positive Units
     * <p>
     * The factor used to convert a positive amount of the Price's Instrument's
     * quote currency into a positive amount of the Account's home currency.
     * Conversion is performed by multiplying the quote units by the conversion
     * factor.
     * <p>
     * @param positiveUnits the Positive Units as a double
     * @return {@link QuoteHomeConversionFactors QuoteHomeConversionFactors}
     * @see DecimalNumber
     */
    public QuoteHomeConversionFactors setPositiveUnits(double positiveUnits) {
        this.positiveUnits = new DecimalNumber(positiveUnits);
        return this;
    }
    /**
     * Set the Positive Units
     * <p>
     * The factor used to convert a positive amount of the Price's Instrument's
     * quote currency into a positive amount of the Account's home currency.
     * Conversion is performed by multiplying the quote units by the conversion
     * factor.
     * <p>
     * @param positiveUnits the Positive Units as a BigDecimal
     * @return {@link QuoteHomeConversionFactors QuoteHomeConversionFactors}
     * @see DecimalNumber
     */
    public QuoteHomeConversionFactors setPositiveUnits(BigDecimal positiveUnits) {
        this.positiveUnits = new DecimalNumber(positiveUnits);
        return this;
    }

    @SerializedName("negativeUnits") private DecimalNumber negativeUnits;

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
    public DecimalNumber getNegativeUnits() {
        return this.negativeUnits;
    }

    /**
     * Set the Negative Units
     * <p>
     * The factor used to convert a negative amount of the Price's Instrument's
     * quote currency into a negative amount of the Account's home currency.
     * Conversion is performed by multiplying the quote units by the conversion
     * factor.
     * <p>
     * @param negativeUnits the Negative Units as a DecimalNumber
     * @return {@link QuoteHomeConversionFactors QuoteHomeConversionFactors}
     * @see DecimalNumber
     */
    public QuoteHomeConversionFactors setNegativeUnits(DecimalNumber negativeUnits) {
        this.negativeUnits = negativeUnits;
        return this;
    }
    /**
     * Set the Negative Units
     * <p>
     * The factor used to convert a negative amount of the Price's Instrument's
     * quote currency into a negative amount of the Account's home currency.
     * Conversion is performed by multiplying the quote units by the conversion
     * factor.
     * <p>
     * @param negativeUnits the Negative Units as a String
     * @return {@link QuoteHomeConversionFactors QuoteHomeConversionFactors}
     * @see DecimalNumber
     */
    public QuoteHomeConversionFactors setNegativeUnits(String negativeUnits) {
        this.negativeUnits = new DecimalNumber(negativeUnits);
        return this;
    }
    /**
     * Set the Negative Units
     * <p>
     * The factor used to convert a negative amount of the Price's Instrument's
     * quote currency into a negative amount of the Account's home currency.
     * Conversion is performed by multiplying the quote units by the conversion
     * factor.
     * <p>
     * @param negativeUnits the Negative Units as a double
     * @return {@link QuoteHomeConversionFactors QuoteHomeConversionFactors}
     * @see DecimalNumber
     */
    public QuoteHomeConversionFactors setNegativeUnits(double negativeUnits) {
        this.negativeUnits = new DecimalNumber(negativeUnits);
        return this;
    }
    /**
     * Set the Negative Units
     * <p>
     * The factor used to convert a negative amount of the Price's Instrument's
     * quote currency into a negative amount of the Account's home currency.
     * Conversion is performed by multiplying the quote units by the conversion
     * factor.
     * <p>
     * @param negativeUnits the Negative Units as a BigDecimal
     * @return {@link QuoteHomeConversionFactors QuoteHomeConversionFactors}
     * @see DecimalNumber
     */
    public QuoteHomeConversionFactors setNegativeUnits(BigDecimal negativeUnits) {
        this.negativeUnits = new DecimalNumber(negativeUnits);
        return this;
    }

    @Override
    public String toString() {
        return "QuoteHomeConversionFactors(" +
            "positiveUnits=" +
                (positiveUnits == null ? "null" : positiveUnits.toString()) + ", " +
            "negativeUnits=" +
                (negativeUnits == null ? "null" : negativeUnits.toString()) +
            ")";
    }
}
