package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * An AccountState Object is used to represent an Account's current price-
 * dependent state. Price-dependent Account state is dependent on OANDA's
 * current Prices, and includes things like unrealized PL, NAV and Trailing
 * Stop Loss Order state.
 */
public class AccountChangesState {

    @SerializedName("unrealizedPL") private AccountUnits unrealizedPL;

    /**
     * Set the Unrealized Profit/Loss
     * <p>
     * The total unrealized profit/loss for all Trades currently open in the
     * Account. Represented in the Account's home currency.
     * <p>
     * @param unrealizedPL the Unrealized Profit/Loss
     * @return {@link AccountChangesState AccountChangesState}
     * @see AccountUnits
     */
    public AccountChangesState setUnrealizedPL(double unrealizedPL) {
        this.unrealizedPL = new AccountUnits(unrealizedPL);
        return this;
    }

    /**
     * Get the Unrealized Profit/Loss
     * <p>
     * The total unrealized profit/loss for all Trades currently open in the
     * Account. Represented in the Account's home currency.
     * <p>
     * @return the Unrealized Profit/Loss
     * @see AccountUnits
     */
    public double getUnrealizedPL() {
        return this.unrealizedPL.getAccountUnits();
    }

    @SerializedName("NAV") private AccountUnits nAV;

    /**
     * Set the Net Asset Value
     * <p>
     * The net asset value of the Account. Equal to Account balance +
     * unrealizedPL. Represented in the Account's home currency.
     * <p>
     * @param nAV the Net Asset Value
     * @return {@link AccountChangesState AccountChangesState}
     * @see AccountUnits
     */
    public AccountChangesState setNAV(double nAV) {
        this.nAV = new AccountUnits(nAV);
        return this;
    }

    /**
     * Get the Net Asset Value
     * <p>
     * The net asset value of the Account. Equal to Account balance +
     * unrealizedPL. Represented in the Account's home currency.
     * <p>
     * @return the Net Asset Value
     * @see AccountUnits
     */
    public double getNAV() {
        return this.nAV.getAccountUnits();
    }

    @SerializedName("marginUsed") private AccountUnits marginUsed;

    /**
     * Set the Margin Used
     * <p>
     * Margin currently used for the Account. Represented in the Account's home
     * currency.
     * <p>
     * @param marginUsed the Margin Used
     * @return {@link AccountChangesState AccountChangesState}
     * @see AccountUnits
     */
    public AccountChangesState setMarginUsed(double marginUsed) {
        this.marginUsed = new AccountUnits(marginUsed);
        return this;
    }

    /**
     * Get the Margin Used
     * <p>
     * Margin currently used for the Account. Represented in the Account's home
     * currency.
     * <p>
     * @return the Margin Used
     * @see AccountUnits
     */
    public double getMarginUsed() {
        return this.marginUsed.getAccountUnits();
    }

    @SerializedName("marginAvailable") private AccountUnits marginAvailable;

    /**
     * Set the Margin Available
     * <p>
     * Margin available for Account. Represented in the Account's home
     * currency.
     * <p>
     * @param marginAvailable the Margin Available
     * @return {@link AccountChangesState AccountChangesState}
     * @see AccountUnits
     */
    public AccountChangesState setMarginAvailable(double marginAvailable) {
        this.marginAvailable = new AccountUnits(marginAvailable);
        return this;
    }

    /**
     * Get the Margin Available
     * <p>
     * Margin available for Account. Represented in the Account's home
     * currency.
     * <p>
     * @return the Margin Available
     * @see AccountUnits
     */
    public double getMarginAvailable() {
        return this.marginAvailable.getAccountUnits();
    }

    @SerializedName("positionValue") private AccountUnits positionValue;

    /**
     * Set the Position Value
     * <p>
     * The value of the Account's open positions represented in the Account's
     * home currency.
     * <p>
     * @param positionValue the Position Value
     * @return {@link AccountChangesState AccountChangesState}
     * @see AccountUnits
     */
    public AccountChangesState setPositionValue(double positionValue) {
        this.positionValue = new AccountUnits(positionValue);
        return this;
    }

    /**
     * Get the Position Value
     * <p>
     * The value of the Account's open positions represented in the Account's
     * home currency.
     * <p>
     * @return the Position Value
     * @see AccountUnits
     */
    public double getPositionValue() {
        return this.positionValue.getAccountUnits();
    }

    @SerializedName("marginCloseoutUnrealizedPL") private AccountUnits marginCloseoutUnrealizedPL;

    /**
     * Set the Closeout UPL
     * <p>
     * The Account's margin closeout unrealized PL.
     * <p>
     * @param marginCloseoutUnrealizedPL the Closeout UPL
     * @return {@link AccountChangesState AccountChangesState}
     * @see AccountUnits
     */
    public AccountChangesState setMarginCloseoutUnrealizedPL(double marginCloseoutUnrealizedPL) {
        this.marginCloseoutUnrealizedPL = new AccountUnits(marginCloseoutUnrealizedPL);
        return this;
    }

    /**
     * Get the Closeout UPL
     * <p>
     * The Account's margin closeout unrealized PL.
     * <p>
     * @return the Closeout UPL
     * @see AccountUnits
     */
    public double getMarginCloseoutUnrealizedPL() {
        return this.marginCloseoutUnrealizedPL.getAccountUnits();
    }

    @SerializedName("marginCloseoutNAV") private AccountUnits marginCloseoutNAV;

    /**
     * Set the Closeout NAV
     * <p>
     * The Account's margin closeout NAV.
     * <p>
     * @param marginCloseoutNAV the Closeout NAV
     * @return {@link AccountChangesState AccountChangesState}
     * @see AccountUnits
     */
    public AccountChangesState setMarginCloseoutNAV(double marginCloseoutNAV) {
        this.marginCloseoutNAV = new AccountUnits(marginCloseoutNAV);
        return this;
    }

    /**
     * Get the Closeout NAV
     * <p>
     * The Account's margin closeout NAV.
     * <p>
     * @return the Closeout NAV
     * @see AccountUnits
     */
    public double getMarginCloseoutNAV() {
        return this.marginCloseoutNAV.getAccountUnits();
    }

    @SerializedName("marginCloseoutMarginUsed") private AccountUnits marginCloseoutMarginUsed;

    /**
     * Set the Closeout Margin Used
     * <p>
     * The Account's margin closeout margin used.
     * <p>
     * @param marginCloseoutMarginUsed the Closeout Margin Used
     * @return {@link AccountChangesState AccountChangesState}
     * @see AccountUnits
     */
    public AccountChangesState setMarginCloseoutMarginUsed(double marginCloseoutMarginUsed) {
        this.marginCloseoutMarginUsed = new AccountUnits(marginCloseoutMarginUsed);
        return this;
    }

    /**
     * Get the Closeout Margin Used
     * <p>
     * The Account's margin closeout margin used.
     * <p>
     * @return the Closeout Margin Used
     * @see AccountUnits
     */
    public double getMarginCloseoutMarginUsed() {
        return this.marginCloseoutMarginUsed.getAccountUnits();
    }

    @SerializedName("marginCloseoutPercent") private DecimalNumber marginCloseoutPercent;

    /**
     * Set the Margin Closeout Percentage
     * <p>
     * The Account's margin closeout percentage. When this value is 1.0 or
     * above the Account is in a margin closeout situation.
     * <p>
     * @param marginCloseoutPercent the Margin Closeout Percentage
     * @return {@link AccountChangesState AccountChangesState}
     * @see DecimalNumber
     */
    public AccountChangesState setMarginCloseoutPercent(double marginCloseoutPercent) {
        this.marginCloseoutPercent = new DecimalNumber(marginCloseoutPercent);
        return this;
    }

    /**
     * Get the Margin Closeout Percentage
     * <p>
     * The Account's margin closeout percentage. When this value is 1.0 or
     * above the Account is in a margin closeout situation.
     * <p>
     * @return the Margin Closeout Percentage
     * @see DecimalNumber
     */
    public double getMarginCloseoutPercent() {
        return this.marginCloseoutPercent.getDecimalNumber();
    }

    @SerializedName("marginCloseoutPositionValue") private DecimalNumber marginCloseoutPositionValue;

    /**
     * Set the Margin Closeout Position Value
     * <p>
     * The value of the Account's open positions as used for margin closeout
     * calculations represented in the Account's home currency.
     * <p>
     * @param marginCloseoutPositionValue the Margin Closeout Position Value
     * @return {@link AccountChangesState AccountChangesState}
     * @see DecimalNumber
     */
    public AccountChangesState setMarginCloseoutPositionValue(double marginCloseoutPositionValue) {
        this.marginCloseoutPositionValue = new DecimalNumber(marginCloseoutPositionValue);
        return this;
    }

    /**
     * Get the Margin Closeout Position Value
     * <p>
     * The value of the Account's open positions as used for margin closeout
     * calculations represented in the Account's home currency.
     * <p>
     * @return the Margin Closeout Position Value
     * @see DecimalNumber
     */
    public double getMarginCloseoutPositionValue() {
        return this.marginCloseoutPositionValue.getDecimalNumber();
    }

    @SerializedName("withdrawalLimit") private AccountUnits withdrawalLimit;

    /**
     * Set the Withdrawal Limit
     * <p>
     * The current WithdrawalLimit for the account which will be zero or a
     * positive value indicating how much can be withdrawn from the account.
     * <p>
     * @param withdrawalLimit the Withdrawal Limit
     * @return {@link AccountChangesState AccountChangesState}
     * @see AccountUnits
     */
    public AccountChangesState setWithdrawalLimit(double withdrawalLimit) {
        this.withdrawalLimit = new AccountUnits(withdrawalLimit);
        return this;
    }

    /**
     * Get the Withdrawal Limit
     * <p>
     * The current WithdrawalLimit for the account which will be zero or a
     * positive value indicating how much can be withdrawn from the account.
     * <p>
     * @return the Withdrawal Limit
     * @see AccountUnits
     */
    public double getWithdrawalLimit() {
        return this.withdrawalLimit.getAccountUnits();
    }

    @SerializedName("marginCallMarginUsed") private AccountUnits marginCallMarginUsed;

    /**
     * Set the Margin Call Margin Used
     * <p>
     * The Account's margin call margin used.
     * <p>
     * @param marginCallMarginUsed the Margin Call Margin Used
     * @return {@link AccountChangesState AccountChangesState}
     * @see AccountUnits
     */
    public AccountChangesState setMarginCallMarginUsed(double marginCallMarginUsed) {
        this.marginCallMarginUsed = new AccountUnits(marginCallMarginUsed);
        return this;
    }

    /**
     * Get the Margin Call Margin Used
     * <p>
     * The Account's margin call margin used.
     * <p>
     * @return the Margin Call Margin Used
     * @see AccountUnits
     */
    public double getMarginCallMarginUsed() {
        return this.marginCallMarginUsed.getAccountUnits();
    }

    @SerializedName("marginCallPercent") private DecimalNumber marginCallPercent;

    /**
     * Set the Margin Call Percentage
     * <p>
     * The Account's margin call percentage. When this value is 1.0 or above
     * the Account is in a margin call situation.
     * <p>
     * @param marginCallPercent the Margin Call Percentage
     * @return {@link AccountChangesState AccountChangesState}
     * @see DecimalNumber
     */
    public AccountChangesState setMarginCallPercent(double marginCallPercent) {
        this.marginCallPercent = new DecimalNumber(marginCallPercent);
        return this;
    }

    /**
     * Get the Margin Call Percentage
     * <p>
     * The Account's margin call percentage. When this value is 1.0 or above
     * the Account is in a margin call situation.
     * <p>
     * @return the Margin Call Percentage
     * @see DecimalNumber
     */
    public double getMarginCallPercent() {
        return this.marginCallPercent.getDecimalNumber();
    }

    @SerializedName("orders") private DynamicOrderState[] orders;

    /**
     * Set the Order States
     * <p>
     * The price-dependent state of each pending Order in the Account.
     * <p>
     * @param orders the Order States
     * @return {@link AccountChangesState AccountChangesState}
     * @see DynamicOrderState
     */
    public AccountChangesState setOrders(DynamicOrderState[] orders) {
        this.orders = orders;
        return this;
    }

    /**
     * Get the Order States
     * <p>
     * The price-dependent state of each pending Order in the Account.
     * <p>
     * @return the Order States
     * @see DynamicOrderState
     */
    public DynamicOrderState[] getOrders() {
        return this.orders;
    }

    @SerializedName("trades") private CalculatedTradeState[] trades;

    /**
     * Set the Trade States
     * <p>
     * The price-dependent state for each open Trade in the Account.
     * <p>
     * @param trades the Trade States
     * @return {@link AccountChangesState AccountChangesState}
     * @see CalculatedTradeState
     */
    public AccountChangesState setTrades(CalculatedTradeState[] trades) {
        this.trades = trades;
        return this;
    }

    /**
     * Get the Trade States
     * <p>
     * The price-dependent state for each open Trade in the Account.
     * <p>
     * @return the Trade States
     * @see CalculatedTradeState
     */
    public CalculatedTradeState[] getTrades() {
        return this.trades;
    }

    @SerializedName("positions") private CalculatedPositionState[] positions;

    /**
     * Set the Position States
     * <p>
     * The price-dependent state for each open Position in the Account.
     * <p>
     * @param positions the Position States
     * @return {@link AccountChangesState AccountChangesState}
     * @see CalculatedPositionState
     */
    public AccountChangesState setPositions(CalculatedPositionState[] positions) {
        this.positions = positions;
        return this;
    }

    /**
     * Get the Position States
     * <p>
     * The price-dependent state for each open Position in the Account.
     * <p>
     * @return the Position States
     * @see CalculatedPositionState
     */
    public CalculatedPositionState[] getPositions() {
        return this.positions;
    }
}
