package com.oanda.v20.pricing;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.primitives.Currency;
import com.oanda.v20.primitives.DecimalNumber;

/**
 * HomeConversions represents the factors to use to convert quantities of a
 * given currency into the Account's home currency. The conversion factor
 * depends on the scenario the conversion is required for.
 */
public class HomeConversions {

    /**
     * Default constructor.
     */
    public HomeConversions() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the HomeConversions to copy
     */
    public HomeConversions(HomeConversions other) {
        this.currency = other.currency;
        this.accountGain = other.accountGain;
        this.accountLoss = other.accountLoss;
        this.positionValue = other.positionValue;
    }

    @SerializedName("currency") private Currency currency;

    /**
     * Get the currency
     * <p>
     * The currency to be converted into the home currency.
     * <p>
     * @return the currency
     * @see Currency
     */
    public Currency getCurrency() {
        return this.currency;
    }

    /**
     * Set the currency
     * <p>
     * The currency to be converted into the home currency.
     * <p>
     * @param currency the currency as a Currency
     * @return {@link HomeConversions HomeConversions}
     * @see Currency
     */
    public HomeConversions setCurrency(Currency currency) {
        this.currency = currency;
        return this;
    }
    /**
     * Set the currency
     * <p>
     * The currency to be converted into the home currency.
     * <p>
     * @param currency the currency as a String
     * @return {@link HomeConversions HomeConversions}
     * @see Currency
     */
    public HomeConversions setCurrency(String currency) {
        this.currency = new Currency(currency);
        return this;
    }

    @SerializedName("accountGain") private DecimalNumber accountGain;

    /**
     * Get the Account Gain
     * <p>
     * The factor used to convert any gains for an Account in the specified
     * currency into the Account's home currency. This would include positive
     * realized P/L and positive financing amounts. Conversion is performed by
     * multiplying the positive P/L by the conversion factor.
     * <p>
     * @return the Account Gain
     * @see DecimalNumber
     */
    public DecimalNumber getAccountGain() {
        return this.accountGain;
    }

    /**
     * Set the Account Gain
     * <p>
     * The factor used to convert any gains for an Account in the specified
     * currency into the Account's home currency. This would include positive
     * realized P/L and positive financing amounts. Conversion is performed by
     * multiplying the positive P/L by the conversion factor.
     * <p>
     * @param accountGain the Account Gain as a DecimalNumber
     * @return {@link HomeConversions HomeConversions}
     * @see DecimalNumber
     */
    public HomeConversions setAccountGain(DecimalNumber accountGain) {
        this.accountGain = accountGain;
        return this;
    }
    /**
     * Set the Account Gain
     * <p>
     * The factor used to convert any gains for an Account in the specified
     * currency into the Account's home currency. This would include positive
     * realized P/L and positive financing amounts. Conversion is performed by
     * multiplying the positive P/L by the conversion factor.
     * <p>
     * @param accountGain the Account Gain as a String
     * @return {@link HomeConversions HomeConversions}
     * @see DecimalNumber
     */
    public HomeConversions setAccountGain(String accountGain) {
        this.accountGain = new DecimalNumber(accountGain);
        return this;
    }
    /**
     * Set the Account Gain
     * <p>
     * The factor used to convert any gains for an Account in the specified
     * currency into the Account's home currency. This would include positive
     * realized P/L and positive financing amounts. Conversion is performed by
     * multiplying the positive P/L by the conversion factor.
     * <p>
     * @param accountGain the Account Gain as a double
     * @return {@link HomeConversions HomeConversions}
     * @see DecimalNumber
     */
    public HomeConversions setAccountGain(double accountGain) {
        this.accountGain = new DecimalNumber(accountGain);
        return this;
    }
    /**
     * Set the Account Gain
     * <p>
     * The factor used to convert any gains for an Account in the specified
     * currency into the Account's home currency. This would include positive
     * realized P/L and positive financing amounts. Conversion is performed by
     * multiplying the positive P/L by the conversion factor.
     * <p>
     * @param accountGain the Account Gain as a BigDecimal
     * @return {@link HomeConversions HomeConversions}
     * @see DecimalNumber
     */
    public HomeConversions setAccountGain(BigDecimal accountGain) {
        this.accountGain = new DecimalNumber(accountGain);
        return this;
    }

    @SerializedName("accountLoss") private DecimalNumber accountLoss;

    /**
     * Get the Account Loss The factor used to convert any losses for an
     * Account in the specified currency into the Account's home currency. This
     * would include negative realized P/L and negative financing amounts.
     * Conversion is performed by multiplying the positive P/L by the
     * conversion factor.
     * <p>
     * The string representation of a decimal number.
     * <p>
     * @return the Account Loss The factor used to convert any losses for an
     * Account in the specified currency into the Account's home currency. This
     * would include negative realized P/L and negative financing amounts.
     * Conversion is performed by multiplying the positive P/L by the
     * conversion factor.
     * @see DecimalNumber
     */
    public DecimalNumber getAccountLoss() {
        return this.accountLoss;
    }

    /**
     * Set the Account Loss The factor used to convert any losses for an
     * Account in the specified currency into the Account's home currency. This
     * would include negative realized P/L and negative financing amounts.
     * Conversion is performed by multiplying the positive P/L by the
     * conversion factor.
     * <p>
     * The string representation of a decimal number.
     * <p>
     * @param accountLoss the Account Loss The factor used to convert any
     * losses for an Account in the specified currency into the Account's home
     * currency. This would include negative realized P/L and negative
     * financing amounts. Conversion is performed by multiplying the positive
     * P/L by the conversion factor. as a DecimalNumber
     * @return {@link HomeConversions HomeConversions}
     * @see DecimalNumber
     */
    public HomeConversions setAccountLoss(DecimalNumber accountLoss) {
        this.accountLoss = accountLoss;
        return this;
    }
    /**
     * Set the Account Loss The factor used to convert any losses for an
     * Account in the specified currency into the Account's home currency. This
     * would include negative realized P/L and negative financing amounts.
     * Conversion is performed by multiplying the positive P/L by the
     * conversion factor.
     * <p>
     * The string representation of a decimal number.
     * <p>
     * @param accountLoss the Account Loss The factor used to convert any
     * losses for an Account in the specified currency into the Account's home
     * currency. This would include negative realized P/L and negative
     * financing amounts. Conversion is performed by multiplying the positive
     * P/L by the conversion factor. as a String
     * @return {@link HomeConversions HomeConversions}
     * @see DecimalNumber
     */
    public HomeConversions setAccountLoss(String accountLoss) {
        this.accountLoss = new DecimalNumber(accountLoss);
        return this;
    }
    /**
     * Set the Account Loss The factor used to convert any losses for an
     * Account in the specified currency into the Account's home currency. This
     * would include negative realized P/L and negative financing amounts.
     * Conversion is performed by multiplying the positive P/L by the
     * conversion factor.
     * <p>
     * The string representation of a decimal number.
     * <p>
     * @param accountLoss the Account Loss The factor used to convert any
     * losses for an Account in the specified currency into the Account's home
     * currency. This would include negative realized P/L and negative
     * financing amounts. Conversion is performed by multiplying the positive
     * P/L by the conversion factor. as a double
     * @return {@link HomeConversions HomeConversions}
     * @see DecimalNumber
     */
    public HomeConversions setAccountLoss(double accountLoss) {
        this.accountLoss = new DecimalNumber(accountLoss);
        return this;
    }
    /**
     * Set the Account Loss The factor used to convert any losses for an
     * Account in the specified currency into the Account's home currency. This
     * would include negative realized P/L and negative financing amounts.
     * Conversion is performed by multiplying the positive P/L by the
     * conversion factor.
     * <p>
     * The string representation of a decimal number.
     * <p>
     * @param accountLoss the Account Loss The factor used to convert any
     * losses for an Account in the specified currency into the Account's home
     * currency. This would include negative realized P/L and negative
     * financing amounts. Conversion is performed by multiplying the positive
     * P/L by the conversion factor. as a BigDecimal
     * @return {@link HomeConversions HomeConversions}
     * @see DecimalNumber
     */
    public HomeConversions setAccountLoss(BigDecimal accountLoss) {
        this.accountLoss = new DecimalNumber(accountLoss);
        return this;
    }

    @SerializedName("positionValue") private DecimalNumber positionValue;

    /**
     * Get the Position Value
     * <p>
     * The factor used to convert a Position or Trade Value in the specified
     * currency into the Account's home currency. Conversion is performed by
     * multiplying the Position or Trade Value by the conversion factor.
     * <p>
     * @return the Position Value
     * @see DecimalNumber
     */
    public DecimalNumber getPositionValue() {
        return this.positionValue;
    }

    /**
     * Set the Position Value
     * <p>
     * The factor used to convert a Position or Trade Value in the specified
     * currency into the Account's home currency. Conversion is performed by
     * multiplying the Position or Trade Value by the conversion factor.
     * <p>
     * @param positionValue the Position Value as a DecimalNumber
     * @return {@link HomeConversions HomeConversions}
     * @see DecimalNumber
     */
    public HomeConversions setPositionValue(DecimalNumber positionValue) {
        this.positionValue = positionValue;
        return this;
    }
    /**
     * Set the Position Value
     * <p>
     * The factor used to convert a Position or Trade Value in the specified
     * currency into the Account's home currency. Conversion is performed by
     * multiplying the Position or Trade Value by the conversion factor.
     * <p>
     * @param positionValue the Position Value as a String
     * @return {@link HomeConversions HomeConversions}
     * @see DecimalNumber
     */
    public HomeConversions setPositionValue(String positionValue) {
        this.positionValue = new DecimalNumber(positionValue);
        return this;
    }
    /**
     * Set the Position Value
     * <p>
     * The factor used to convert a Position or Trade Value in the specified
     * currency into the Account's home currency. Conversion is performed by
     * multiplying the Position or Trade Value by the conversion factor.
     * <p>
     * @param positionValue the Position Value as a double
     * @return {@link HomeConversions HomeConversions}
     * @see DecimalNumber
     */
    public HomeConversions setPositionValue(double positionValue) {
        this.positionValue = new DecimalNumber(positionValue);
        return this;
    }
    /**
     * Set the Position Value
     * <p>
     * The factor used to convert a Position or Trade Value in the specified
     * currency into the Account's home currency. Conversion is performed by
     * multiplying the Position or Trade Value by the conversion factor.
     * <p>
     * @param positionValue the Position Value as a BigDecimal
     * @return {@link HomeConversions HomeConversions}
     * @see DecimalNumber
     */
    public HomeConversions setPositionValue(BigDecimal positionValue) {
        this.positionValue = new DecimalNumber(positionValue);
        return this;
    }

    @Override
    public String toString() {
        return "HomeConversions(" +
            "currency=" +
                (currency == null ? "null" : currency.toString()) + ", " +
            "accountGain=" +
                (accountGain == null ? "null" : accountGain.toString()) + ", " +
            "accountLoss=" +
                (accountLoss == null ? "null" : accountLoss.toString()) + ", " +
            "positionValue=" +
                (positionValue == null ? "null" : positionValue.toString()) +
            ")";
    }
}
