package com.oanda.v20.account;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.Request;
import com.oanda.v20.primitives.DecimalNumber;

/**
 * AccountConfigureRequest
 */
public class AccountConfigureRequest extends Request {

    private static class Body {
        @SerializedName("alias") private String alias;
        @SerializedName("marginRate") private DecimalNumber marginRate;
    }

    /**
     * AccountConfigureRequest Constructor
     * <p>
     * Construct a new AccountConfigureRequest
     * <p>
     * @param accountID Account Identifier
     */
    public AccountConfigureRequest(AccountID accountID) {
        this.body = new Body();
        this.setPathParam("accountID", accountID);

    }

    /**
     * Set the alias
     * <p>
     * Client-defined alias (name) for the Account
     * <p>
     * @param alias the alias as a String
     * @return {@link AccountConfigureRequest AccountConfigureRequest}
     */
    public AccountConfigureRequest setAlias(String alias)
    {
        ((Body) this.body).alias = alias;
        return this;
    }

    /**
     * Set the marginRate
     * <p>
     * The string representation of a decimal number.
     * <p>
     * @param marginRate the marginRate as a DecimalNumber
     * @return {@link AccountConfigureRequest AccountConfigureRequest}
     * @see DecimalNumber
     */
    public AccountConfigureRequest setMarginRate(DecimalNumber marginRate)
    {
        ((Body) this.body).marginRate = marginRate;
        return this;
    }

    /**
     * Set the marginRate
     * <p>
     * The string representation of a decimal number.
     * <p>
     * @param marginRate the marginRate as a String
     * @return {@link AccountConfigureRequest AccountConfigureRequest}
     * @see DecimalNumber
     */
    public AccountConfigureRequest setMarginRate(String marginRate)
    {
        ((Body) this.body).marginRate = new DecimalNumber(marginRate);
        return this;
    }

    /**
     * Set the marginRate
     * <p>
     * The string representation of a decimal number.
     * <p>
     * @param marginRate the marginRate as a double
     * @return {@link AccountConfigureRequest AccountConfigureRequest}
     * @see DecimalNumber
     */
    public AccountConfigureRequest setMarginRate(double marginRate)
    {
        ((Body) this.body).marginRate = new DecimalNumber(marginRate);
        return this;
    }

    /**
     * Set the marginRate
     * <p>
     * The string representation of a decimal number.
     * <p>
     * @param marginRate the marginRate as a BigDecimal
     * @return {@link AccountConfigureRequest AccountConfigureRequest}
     * @see DecimalNumber
     */
    public AccountConfigureRequest setMarginRate(BigDecimal marginRate)
    {
        ((Body) this.body).marginRate = new DecimalNumber(marginRate);
        return this;
    }
}
