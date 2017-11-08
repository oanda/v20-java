package com.oanda.v20.account;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.primitives.AccountUnits;
import com.oanda.v20.primitives.DecimalNumber;

/**
 * The dynamically calculated state of a client's Account.
 */
public class CalculatedAccountState {

    /**
     * Default constructor.
     */
    public CalculatedAccountState() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the CalculatedAccountState to copy
     */
    public CalculatedAccountState(CalculatedAccountState other) {
        this.unrealizedPL = other.unrealizedPL;
        this.nAV = other.nAV;
        this.marginUsed = other.marginUsed;
        this.marginAvailable = other.marginAvailable;
        this.positionValue = other.positionValue;
        this.marginCloseoutUnrealizedPL = other.marginCloseoutUnrealizedPL;
        this.marginCloseoutNAV = other.marginCloseoutNAV;
        this.marginCloseoutMarginUsed = other.marginCloseoutMarginUsed;
        this.marginCloseoutPercent = other.marginCloseoutPercent;
        this.marginCloseoutPositionValue = other.marginCloseoutPositionValue;
        this.withdrawalLimit = other.withdrawalLimit;
        this.marginCallMarginUsed = other.marginCallMarginUsed;
        this.marginCallPercent = other.marginCallPercent;
    }

    @SerializedName("unrealizedPL") private AccountUnits unrealizedPL;

    /**
     * Get the Unrealized Profit/Loss
     * <p>
     * The total unrealized profit/loss for all Trades currently open in the
     * Account.
     * <p>
     * @return the Unrealized Profit/Loss
     * @see AccountUnits
     */
    public AccountUnits getUnrealizedPL() {
        return this.unrealizedPL;
    }

    /**
     * Set the Unrealized Profit/Loss
     * <p>
     * The total unrealized profit/loss for all Trades currently open in the
     * Account.
     * <p>
     * @param unrealizedPL the Unrealized Profit/Loss as an AccountUnits
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setUnrealizedPL(AccountUnits unrealizedPL) {
        this.unrealizedPL = unrealizedPL;
        return this;
    }
    /**
     * Set the Unrealized Profit/Loss
     * <p>
     * The total unrealized profit/loss for all Trades currently open in the
     * Account.
     * <p>
     * @param unrealizedPL the Unrealized Profit/Loss as a String
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setUnrealizedPL(String unrealizedPL) {
        this.unrealizedPL = new AccountUnits(unrealizedPL);
        return this;
    }
    /**
     * Set the Unrealized Profit/Loss
     * <p>
     * The total unrealized profit/loss for all Trades currently open in the
     * Account.
     * <p>
     * @param unrealizedPL the Unrealized Profit/Loss as a double
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setUnrealizedPL(double unrealizedPL) {
        this.unrealizedPL = new AccountUnits(unrealizedPL);
        return this;
    }
    /**
     * Set the Unrealized Profit/Loss
     * <p>
     * The total unrealized profit/loss for all Trades currently open in the
     * Account.
     * <p>
     * @param unrealizedPL the Unrealized Profit/Loss as a BigDecimal
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setUnrealizedPL(BigDecimal unrealizedPL) {
        this.unrealizedPL = new AccountUnits(unrealizedPL);
        return this;
    }

    @SerializedName("NAV") private AccountUnits nAV;

    /**
     * Get the Net Asset Value
     * <p>
     * The net asset value of the Account. Equal to Account balance +
     * unrealizedPL.
     * <p>
     * @return the Net Asset Value
     * @see AccountUnits
     */
    public AccountUnits getNAV() {
        return this.nAV;
    }

    /**
     * Set the Net Asset Value
     * <p>
     * The net asset value of the Account. Equal to Account balance +
     * unrealizedPL.
     * <p>
     * @param nAV the Net Asset Value as an AccountUnits
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setNAV(AccountUnits nAV) {
        this.nAV = nAV;
        return this;
    }
    /**
     * Set the Net Asset Value
     * <p>
     * The net asset value of the Account. Equal to Account balance +
     * unrealizedPL.
     * <p>
     * @param nAV the Net Asset Value as a String
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setNAV(String nAV) {
        this.nAV = new AccountUnits(nAV);
        return this;
    }
    /**
     * Set the Net Asset Value
     * <p>
     * The net asset value of the Account. Equal to Account balance +
     * unrealizedPL.
     * <p>
     * @param nAV the Net Asset Value as a double
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setNAV(double nAV) {
        this.nAV = new AccountUnits(nAV);
        return this;
    }
    /**
     * Set the Net Asset Value
     * <p>
     * The net asset value of the Account. Equal to Account balance +
     * unrealizedPL.
     * <p>
     * @param nAV the Net Asset Value as a BigDecimal
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setNAV(BigDecimal nAV) {
        this.nAV = new AccountUnits(nAV);
        return this;
    }

    @SerializedName("marginUsed") private AccountUnits marginUsed;

    /**
     * Get the Margin Used
     * <p>
     * Margin currently used for the Account.
     * <p>
     * @return the Margin Used
     * @see AccountUnits
     */
    public AccountUnits getMarginUsed() {
        return this.marginUsed;
    }

    /**
     * Set the Margin Used
     * <p>
     * Margin currently used for the Account.
     * <p>
     * @param marginUsed the Margin Used as an AccountUnits
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setMarginUsed(AccountUnits marginUsed) {
        this.marginUsed = marginUsed;
        return this;
    }
    /**
     * Set the Margin Used
     * <p>
     * Margin currently used for the Account.
     * <p>
     * @param marginUsed the Margin Used as a String
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setMarginUsed(String marginUsed) {
        this.marginUsed = new AccountUnits(marginUsed);
        return this;
    }
    /**
     * Set the Margin Used
     * <p>
     * Margin currently used for the Account.
     * <p>
     * @param marginUsed the Margin Used as a double
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setMarginUsed(double marginUsed) {
        this.marginUsed = new AccountUnits(marginUsed);
        return this;
    }
    /**
     * Set the Margin Used
     * <p>
     * Margin currently used for the Account.
     * <p>
     * @param marginUsed the Margin Used as a BigDecimal
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setMarginUsed(BigDecimal marginUsed) {
        this.marginUsed = new AccountUnits(marginUsed);
        return this;
    }

    @SerializedName("marginAvailable") private AccountUnits marginAvailable;

    /**
     * Get the Margin Available
     * <p>
     * Margin available for Account currency.
     * <p>
     * @return the Margin Available
     * @see AccountUnits
     */
    public AccountUnits getMarginAvailable() {
        return this.marginAvailable;
    }

    /**
     * Set the Margin Available
     * <p>
     * Margin available for Account currency.
     * <p>
     * @param marginAvailable the Margin Available as an AccountUnits
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setMarginAvailable(AccountUnits marginAvailable) {
        this.marginAvailable = marginAvailable;
        return this;
    }
    /**
     * Set the Margin Available
     * <p>
     * Margin available for Account currency.
     * <p>
     * @param marginAvailable the Margin Available as a String
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setMarginAvailable(String marginAvailable) {
        this.marginAvailable = new AccountUnits(marginAvailable);
        return this;
    }
    /**
     * Set the Margin Available
     * <p>
     * Margin available for Account currency.
     * <p>
     * @param marginAvailable the Margin Available as a double
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setMarginAvailable(double marginAvailable) {
        this.marginAvailable = new AccountUnits(marginAvailable);
        return this;
    }
    /**
     * Set the Margin Available
     * <p>
     * Margin available for Account currency.
     * <p>
     * @param marginAvailable the Margin Available as a BigDecimal
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setMarginAvailable(BigDecimal marginAvailable) {
        this.marginAvailable = new AccountUnits(marginAvailable);
        return this;
    }

    @SerializedName("positionValue") private AccountUnits positionValue;

    /**
     * Get the Position Value
     * <p>
     * The value of the Account's open positions represented in the Account's
     * home currency.
     * <p>
     * @return the Position Value
     * @see AccountUnits
     */
    public AccountUnits getPositionValue() {
        return this.positionValue;
    }

    /**
     * Set the Position Value
     * <p>
     * The value of the Account's open positions represented in the Account's
     * home currency.
     * <p>
     * @param positionValue the Position Value as an AccountUnits
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setPositionValue(AccountUnits positionValue) {
        this.positionValue = positionValue;
        return this;
    }
    /**
     * Set the Position Value
     * <p>
     * The value of the Account's open positions represented in the Account's
     * home currency.
     * <p>
     * @param positionValue the Position Value as a String
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setPositionValue(String positionValue) {
        this.positionValue = new AccountUnits(positionValue);
        return this;
    }
    /**
     * Set the Position Value
     * <p>
     * The value of the Account's open positions represented in the Account's
     * home currency.
     * <p>
     * @param positionValue the Position Value as a double
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setPositionValue(double positionValue) {
        this.positionValue = new AccountUnits(positionValue);
        return this;
    }
    /**
     * Set the Position Value
     * <p>
     * The value of the Account's open positions represented in the Account's
     * home currency.
     * <p>
     * @param positionValue the Position Value as a BigDecimal
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setPositionValue(BigDecimal positionValue) {
        this.positionValue = new AccountUnits(positionValue);
        return this;
    }

    @SerializedName("marginCloseoutUnrealizedPL") private AccountUnits marginCloseoutUnrealizedPL;

    /**
     * Get the Closeout UPL
     * <p>
     * The Account's margin closeout unrealized PL.
     * <p>
     * @return the Closeout UPL
     * @see AccountUnits
     */
    public AccountUnits getMarginCloseoutUnrealizedPL() {
        return this.marginCloseoutUnrealizedPL;
    }

    /**
     * Set the Closeout UPL
     * <p>
     * The Account's margin closeout unrealized PL.
     * <p>
     * @param marginCloseoutUnrealizedPL the Closeout UPL as an AccountUnits
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setMarginCloseoutUnrealizedPL(AccountUnits marginCloseoutUnrealizedPL) {
        this.marginCloseoutUnrealizedPL = marginCloseoutUnrealizedPL;
        return this;
    }
    /**
     * Set the Closeout UPL
     * <p>
     * The Account's margin closeout unrealized PL.
     * <p>
     * @param marginCloseoutUnrealizedPL the Closeout UPL as a String
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setMarginCloseoutUnrealizedPL(String marginCloseoutUnrealizedPL) {
        this.marginCloseoutUnrealizedPL = new AccountUnits(marginCloseoutUnrealizedPL);
        return this;
    }
    /**
     * Set the Closeout UPL
     * <p>
     * The Account's margin closeout unrealized PL.
     * <p>
     * @param marginCloseoutUnrealizedPL the Closeout UPL as a double
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setMarginCloseoutUnrealizedPL(double marginCloseoutUnrealizedPL) {
        this.marginCloseoutUnrealizedPL = new AccountUnits(marginCloseoutUnrealizedPL);
        return this;
    }
    /**
     * Set the Closeout UPL
     * <p>
     * The Account's margin closeout unrealized PL.
     * <p>
     * @param marginCloseoutUnrealizedPL the Closeout UPL as a BigDecimal
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setMarginCloseoutUnrealizedPL(BigDecimal marginCloseoutUnrealizedPL) {
        this.marginCloseoutUnrealizedPL = new AccountUnits(marginCloseoutUnrealizedPL);
        return this;
    }

    @SerializedName("marginCloseoutNAV") private AccountUnits marginCloseoutNAV;

    /**
     * Get the Closeout NAV
     * <p>
     * The Account's margin closeout NAV.
     * <p>
     * @return the Closeout NAV
     * @see AccountUnits
     */
    public AccountUnits getMarginCloseoutNAV() {
        return this.marginCloseoutNAV;
    }

    /**
     * Set the Closeout NAV
     * <p>
     * The Account's margin closeout NAV.
     * <p>
     * @param marginCloseoutNAV the Closeout NAV as an AccountUnits
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setMarginCloseoutNAV(AccountUnits marginCloseoutNAV) {
        this.marginCloseoutNAV = marginCloseoutNAV;
        return this;
    }
    /**
     * Set the Closeout NAV
     * <p>
     * The Account's margin closeout NAV.
     * <p>
     * @param marginCloseoutNAV the Closeout NAV as a String
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setMarginCloseoutNAV(String marginCloseoutNAV) {
        this.marginCloseoutNAV = new AccountUnits(marginCloseoutNAV);
        return this;
    }
    /**
     * Set the Closeout NAV
     * <p>
     * The Account's margin closeout NAV.
     * <p>
     * @param marginCloseoutNAV the Closeout NAV as a double
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setMarginCloseoutNAV(double marginCloseoutNAV) {
        this.marginCloseoutNAV = new AccountUnits(marginCloseoutNAV);
        return this;
    }
    /**
     * Set the Closeout NAV
     * <p>
     * The Account's margin closeout NAV.
     * <p>
     * @param marginCloseoutNAV the Closeout NAV as a BigDecimal
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setMarginCloseoutNAV(BigDecimal marginCloseoutNAV) {
        this.marginCloseoutNAV = new AccountUnits(marginCloseoutNAV);
        return this;
    }

    @SerializedName("marginCloseoutMarginUsed") private AccountUnits marginCloseoutMarginUsed;

    /**
     * Get the Closeout Margin Used
     * <p>
     * The Account's margin closeout margin used.
     * <p>
     * @return the Closeout Margin Used
     * @see AccountUnits
     */
    public AccountUnits getMarginCloseoutMarginUsed() {
        return this.marginCloseoutMarginUsed;
    }

    /**
     * Set the Closeout Margin Used
     * <p>
     * The Account's margin closeout margin used.
     * <p>
     * @param marginCloseoutMarginUsed the Closeout Margin Used as an
     * AccountUnits
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setMarginCloseoutMarginUsed(AccountUnits marginCloseoutMarginUsed) {
        this.marginCloseoutMarginUsed = marginCloseoutMarginUsed;
        return this;
    }
    /**
     * Set the Closeout Margin Used
     * <p>
     * The Account's margin closeout margin used.
     * <p>
     * @param marginCloseoutMarginUsed the Closeout Margin Used as a String
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setMarginCloseoutMarginUsed(String marginCloseoutMarginUsed) {
        this.marginCloseoutMarginUsed = new AccountUnits(marginCloseoutMarginUsed);
        return this;
    }
    /**
     * Set the Closeout Margin Used
     * <p>
     * The Account's margin closeout margin used.
     * <p>
     * @param marginCloseoutMarginUsed the Closeout Margin Used as a double
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setMarginCloseoutMarginUsed(double marginCloseoutMarginUsed) {
        this.marginCloseoutMarginUsed = new AccountUnits(marginCloseoutMarginUsed);
        return this;
    }
    /**
     * Set the Closeout Margin Used
     * <p>
     * The Account's margin closeout margin used.
     * <p>
     * @param marginCloseoutMarginUsed the Closeout Margin Used as a BigDecimal
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setMarginCloseoutMarginUsed(BigDecimal marginCloseoutMarginUsed) {
        this.marginCloseoutMarginUsed = new AccountUnits(marginCloseoutMarginUsed);
        return this;
    }

    @SerializedName("marginCloseoutPercent") private DecimalNumber marginCloseoutPercent;

    /**
     * Get the Margin Closeout Percentage
     * <p>
     * The Account's margin closeout percentage. When this value is 1.0 or
     * above the Account is in a margin closeout situation.
     * <p>
     * @return the Margin Closeout Percentage
     * @see DecimalNumber
     */
    public DecimalNumber getMarginCloseoutPercent() {
        return this.marginCloseoutPercent;
    }

    /**
     * Set the Margin Closeout Percentage
     * <p>
     * The Account's margin closeout percentage. When this value is 1.0 or
     * above the Account is in a margin closeout situation.
     * <p>
     * @param marginCloseoutPercent the Margin Closeout Percentage as a
     * DecimalNumber
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see DecimalNumber
     */
    public CalculatedAccountState setMarginCloseoutPercent(DecimalNumber marginCloseoutPercent) {
        this.marginCloseoutPercent = marginCloseoutPercent;
        return this;
    }
    /**
     * Set the Margin Closeout Percentage
     * <p>
     * The Account's margin closeout percentage. When this value is 1.0 or
     * above the Account is in a margin closeout situation.
     * <p>
     * @param marginCloseoutPercent the Margin Closeout Percentage as a String
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see DecimalNumber
     */
    public CalculatedAccountState setMarginCloseoutPercent(String marginCloseoutPercent) {
        this.marginCloseoutPercent = new DecimalNumber(marginCloseoutPercent);
        return this;
    }
    /**
     * Set the Margin Closeout Percentage
     * <p>
     * The Account's margin closeout percentage. When this value is 1.0 or
     * above the Account is in a margin closeout situation.
     * <p>
     * @param marginCloseoutPercent the Margin Closeout Percentage as a double
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see DecimalNumber
     */
    public CalculatedAccountState setMarginCloseoutPercent(double marginCloseoutPercent) {
        this.marginCloseoutPercent = new DecimalNumber(marginCloseoutPercent);
        return this;
    }
    /**
     * Set the Margin Closeout Percentage
     * <p>
     * The Account's margin closeout percentage. When this value is 1.0 or
     * above the Account is in a margin closeout situation.
     * <p>
     * @param marginCloseoutPercent the Margin Closeout Percentage as a
     * BigDecimal
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see DecimalNumber
     */
    public CalculatedAccountState setMarginCloseoutPercent(BigDecimal marginCloseoutPercent) {
        this.marginCloseoutPercent = new DecimalNumber(marginCloseoutPercent);
        return this;
    }

    @SerializedName("marginCloseoutPositionValue") private DecimalNumber marginCloseoutPositionValue;

    /**
     * Get the Margin Closeout Position Value
     * <p>
     * The value of the Account's open positions as used for margin closeout
     * calculations represented in the Account's home currency.
     * <p>
     * @return the Margin Closeout Position Value
     * @see DecimalNumber
     */
    public DecimalNumber getMarginCloseoutPositionValue() {
        return this.marginCloseoutPositionValue;
    }

    /**
     * Set the Margin Closeout Position Value
     * <p>
     * The value of the Account's open positions as used for margin closeout
     * calculations represented in the Account's home currency.
     * <p>
     * @param marginCloseoutPositionValue the Margin Closeout Position Value as
     * a DecimalNumber
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see DecimalNumber
     */
    public CalculatedAccountState setMarginCloseoutPositionValue(DecimalNumber marginCloseoutPositionValue) {
        this.marginCloseoutPositionValue = marginCloseoutPositionValue;
        return this;
    }
    /**
     * Set the Margin Closeout Position Value
     * <p>
     * The value of the Account's open positions as used for margin closeout
     * calculations represented in the Account's home currency.
     * <p>
     * @param marginCloseoutPositionValue the Margin Closeout Position Value as
     * a String
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see DecimalNumber
     */
    public CalculatedAccountState setMarginCloseoutPositionValue(String marginCloseoutPositionValue) {
        this.marginCloseoutPositionValue = new DecimalNumber(marginCloseoutPositionValue);
        return this;
    }
    /**
     * Set the Margin Closeout Position Value
     * <p>
     * The value of the Account's open positions as used for margin closeout
     * calculations represented in the Account's home currency.
     * <p>
     * @param marginCloseoutPositionValue the Margin Closeout Position Value as
     * a double
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see DecimalNumber
     */
    public CalculatedAccountState setMarginCloseoutPositionValue(double marginCloseoutPositionValue) {
        this.marginCloseoutPositionValue = new DecimalNumber(marginCloseoutPositionValue);
        return this;
    }
    /**
     * Set the Margin Closeout Position Value
     * <p>
     * The value of the Account's open positions as used for margin closeout
     * calculations represented in the Account's home currency.
     * <p>
     * @param marginCloseoutPositionValue the Margin Closeout Position Value as
     * a BigDecimal
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see DecimalNumber
     */
    public CalculatedAccountState setMarginCloseoutPositionValue(BigDecimal marginCloseoutPositionValue) {
        this.marginCloseoutPositionValue = new DecimalNumber(marginCloseoutPositionValue);
        return this;
    }

    @SerializedName("withdrawalLimit") private AccountUnits withdrawalLimit;

    /**
     * Get the Withdrawal Limit
     * <p>
     * The current WithdrawalLimit for the account which will be zero or a
     * positive value indicating how much can be withdrawn from the account.
     * <p>
     * @return the Withdrawal Limit
     * @see AccountUnits
     */
    public AccountUnits getWithdrawalLimit() {
        return this.withdrawalLimit;
    }

    /**
     * Set the Withdrawal Limit
     * <p>
     * The current WithdrawalLimit for the account which will be zero or a
     * positive value indicating how much can be withdrawn from the account.
     * <p>
     * @param withdrawalLimit the Withdrawal Limit as an AccountUnits
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setWithdrawalLimit(AccountUnits withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
        return this;
    }
    /**
     * Set the Withdrawal Limit
     * <p>
     * The current WithdrawalLimit for the account which will be zero or a
     * positive value indicating how much can be withdrawn from the account.
     * <p>
     * @param withdrawalLimit the Withdrawal Limit as a String
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setWithdrawalLimit(String withdrawalLimit) {
        this.withdrawalLimit = new AccountUnits(withdrawalLimit);
        return this;
    }
    /**
     * Set the Withdrawal Limit
     * <p>
     * The current WithdrawalLimit for the account which will be zero or a
     * positive value indicating how much can be withdrawn from the account.
     * <p>
     * @param withdrawalLimit the Withdrawal Limit as a double
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setWithdrawalLimit(double withdrawalLimit) {
        this.withdrawalLimit = new AccountUnits(withdrawalLimit);
        return this;
    }
    /**
     * Set the Withdrawal Limit
     * <p>
     * The current WithdrawalLimit for the account which will be zero or a
     * positive value indicating how much can be withdrawn from the account.
     * <p>
     * @param withdrawalLimit the Withdrawal Limit as a BigDecimal
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setWithdrawalLimit(BigDecimal withdrawalLimit) {
        this.withdrawalLimit = new AccountUnits(withdrawalLimit);
        return this;
    }

    @SerializedName("marginCallMarginUsed") private AccountUnits marginCallMarginUsed;

    /**
     * Get the Margin Call Margin Used
     * <p>
     * The Account's margin call margin used.
     * <p>
     * @return the Margin Call Margin Used
     * @see AccountUnits
     */
    public AccountUnits getMarginCallMarginUsed() {
        return this.marginCallMarginUsed;
    }

    /**
     * Set the Margin Call Margin Used
     * <p>
     * The Account's margin call margin used.
     * <p>
     * @param marginCallMarginUsed the Margin Call Margin Used as an
     * AccountUnits
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setMarginCallMarginUsed(AccountUnits marginCallMarginUsed) {
        this.marginCallMarginUsed = marginCallMarginUsed;
        return this;
    }
    /**
     * Set the Margin Call Margin Used
     * <p>
     * The Account's margin call margin used.
     * <p>
     * @param marginCallMarginUsed the Margin Call Margin Used as a String
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setMarginCallMarginUsed(String marginCallMarginUsed) {
        this.marginCallMarginUsed = new AccountUnits(marginCallMarginUsed);
        return this;
    }
    /**
     * Set the Margin Call Margin Used
     * <p>
     * The Account's margin call margin used.
     * <p>
     * @param marginCallMarginUsed the Margin Call Margin Used as a double
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setMarginCallMarginUsed(double marginCallMarginUsed) {
        this.marginCallMarginUsed = new AccountUnits(marginCallMarginUsed);
        return this;
    }
    /**
     * Set the Margin Call Margin Used
     * <p>
     * The Account's margin call margin used.
     * <p>
     * @param marginCallMarginUsed the Margin Call Margin Used as a BigDecimal
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see AccountUnits
     */
    public CalculatedAccountState setMarginCallMarginUsed(BigDecimal marginCallMarginUsed) {
        this.marginCallMarginUsed = new AccountUnits(marginCallMarginUsed);
        return this;
    }

    @SerializedName("marginCallPercent") private DecimalNumber marginCallPercent;

    /**
     * Get the Margin Call Percentage
     * <p>
     * The Account's margin call percentage. When this value is 1.0 or above
     * the Account is in a margin call situation.
     * <p>
     * @return the Margin Call Percentage
     * @see DecimalNumber
     */
    public DecimalNumber getMarginCallPercent() {
        return this.marginCallPercent;
    }

    /**
     * Set the Margin Call Percentage
     * <p>
     * The Account's margin call percentage. When this value is 1.0 or above
     * the Account is in a margin call situation.
     * <p>
     * @param marginCallPercent the Margin Call Percentage as a DecimalNumber
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see DecimalNumber
     */
    public CalculatedAccountState setMarginCallPercent(DecimalNumber marginCallPercent) {
        this.marginCallPercent = marginCallPercent;
        return this;
    }
    /**
     * Set the Margin Call Percentage
     * <p>
     * The Account's margin call percentage. When this value is 1.0 or above
     * the Account is in a margin call situation.
     * <p>
     * @param marginCallPercent the Margin Call Percentage as a String
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see DecimalNumber
     */
    public CalculatedAccountState setMarginCallPercent(String marginCallPercent) {
        this.marginCallPercent = new DecimalNumber(marginCallPercent);
        return this;
    }
    /**
     * Set the Margin Call Percentage
     * <p>
     * The Account's margin call percentage. When this value is 1.0 or above
     * the Account is in a margin call situation.
     * <p>
     * @param marginCallPercent the Margin Call Percentage as a double
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see DecimalNumber
     */
    public CalculatedAccountState setMarginCallPercent(double marginCallPercent) {
        this.marginCallPercent = new DecimalNumber(marginCallPercent);
        return this;
    }
    /**
     * Set the Margin Call Percentage
     * <p>
     * The Account's margin call percentage. When this value is 1.0 or above
     * the Account is in a margin call situation.
     * <p>
     * @param marginCallPercent the Margin Call Percentage as a BigDecimal
     * @return {@link CalculatedAccountState CalculatedAccountState}
     * @see DecimalNumber
     */
    public CalculatedAccountState setMarginCallPercent(BigDecimal marginCallPercent) {
        this.marginCallPercent = new DecimalNumber(marginCallPercent);
        return this;
    }

    @Override
    public String toString() {
        return "CalculatedAccountState(" +
            "unrealizedPL=" +
                (unrealizedPL == null ? "null" : unrealizedPL.toString()) + ", " +
            "NAV=" +
                (nAV == null ? "null" : nAV.toString()) + ", " +
            "marginUsed=" +
                (marginUsed == null ? "null" : marginUsed.toString()) + ", " +
            "marginAvailable=" +
                (marginAvailable == null ? "null" : marginAvailable.toString()) + ", " +
            "positionValue=" +
                (positionValue == null ? "null" : positionValue.toString()) + ", " +
            "marginCloseoutUnrealizedPL=" +
                (marginCloseoutUnrealizedPL == null ? "null" : marginCloseoutUnrealizedPL.toString()) + ", " +
            "marginCloseoutNAV=" +
                (marginCloseoutNAV == null ? "null" : marginCloseoutNAV.toString()) + ", " +
            "marginCloseoutMarginUsed=" +
                (marginCloseoutMarginUsed == null ? "null" : marginCloseoutMarginUsed.toString()) + ", " +
            "marginCloseoutPercent=" +
                (marginCloseoutPercent == null ? "null" : marginCloseoutPercent.toString()) + ", " +
            "marginCloseoutPositionValue=" +
                (marginCloseoutPositionValue == null ? "null" : marginCloseoutPositionValue.toString()) + ", " +
            "withdrawalLimit=" +
                (withdrawalLimit == null ? "null" : withdrawalLimit.toString()) + ", " +
            "marginCallMarginUsed=" +
                (marginCallMarginUsed == null ? "null" : marginCallMarginUsed.toString()) + ", " +
            "marginCallPercent=" +
                (marginCallPercent == null ? "null" : marginCallPercent.toString()) +
            ")";
    }
}
