package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * A summary representation of a client's Account. The AccountSummary does not
 * provide to full specification of pending Orders, open Trades and Positions.
 */
public class AccountSummary {

    @SerializedName("id") private AccountID id;

    /**
     * Set the Account ID
     * <p>
     * The Account's identifier
     * <p>
     * @param id the Account ID
     * @return {@link AccountSummary AccountSummary}
     * @see AccountID
     */
    public AccountSummary setId(String id) {
        this.id = new AccountID(id);
        return this;
    }

    /**
     * Get the Account ID
     * <p>
     * The Account's identifier
     * <p>
     * @return the Account ID
     * @see AccountID
     */
    public String getId() {
        return this.id.getAccountID();
    }

    @SerializedName("alias") private String alias;

    /**
     * Set the Alias
     * <p>
     * Client-assigned alias for the Account. Only provided if the Account has
     * an alias set
     * <p>
     * @param alias the Alias
     * @return {@link AccountSummary AccountSummary}
     */
    public AccountSummary setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * Get the Alias
     * <p>
     * Client-assigned alias for the Account. Only provided if the Account has
     * an alias set
     * <p>
     * @return the Alias
     */
    public String getAlias() {
        return this.alias;
    }

    @SerializedName("currency") private Currency currency;

    /**
     * Set the Home Currency
     * <p>
     * The home currency of the Account
     * <p>
     * @param currency the Home Currency
     * @return {@link AccountSummary AccountSummary}
     * @see Currency
     */
    public AccountSummary setCurrency(String currency) {
        this.currency = new Currency(currency);
        return this;
    }

    /**
     * Get the Home Currency
     * <p>
     * The home currency of the Account
     * <p>
     * @return the Home Currency
     * @see Currency
     */
    public String getCurrency() {
        return this.currency.getCurrency();
    }

    @SerializedName("balance") private AccountUnits balance;

    /**
     * Set the Balance
     * <p>
     * The current balance of the Account. Represented in the Account's home
     * currency.
     * <p>
     * @param balance the Balance
     * @return {@link AccountSummary AccountSummary}
     * @see AccountUnits
     */
    public AccountSummary setBalance(double balance) {
        this.balance = new AccountUnits(balance);
        return this;
    }

    /**
     * Get the Balance
     * <p>
     * The current balance of the Account. Represented in the Account's home
     * currency.
     * <p>
     * @return the Balance
     * @see AccountUnits
     */
    public double getBalance() {
        return this.balance.getAccountUnits();
    }

    @SerializedName("createdByUserID") private Integer createdByUserID;

    /**
     * Set the Created by User ID
     * <p>
     * ID of the user that created the Account.
     * <p>
     * @param createdByUserID the Created by User ID
     * @return {@link AccountSummary AccountSummary}
     */
    public AccountSummary setCreatedByUserID(int createdByUserID) {
        this.createdByUserID = createdByUserID;
        return this;
    }

    /**
     * Get the Created by User ID
     * <p>
     * ID of the user that created the Account.
     * <p>
     * @return the Created by User ID
     */
    public int getCreatedByUserID() {
        return this.createdByUserID;
    }

    @SerializedName("createdTime") private DateTime createdTime;

    /**
     * Set the Create Time
     * <p>
     * The date/time when the Account was created.
     * <p>
     * @param createdTime the Create Time
     * @return {@link AccountSummary AccountSummary}
     * @see DateTime
     */
    public AccountSummary setCreatedTime(String createdTime) {
        this.createdTime = new DateTime(createdTime);
        return this;
    }

    /**
     * Get the Create Time
     * <p>
     * The date/time when the Account was created.
     * <p>
     * @return the Create Time
     * @see DateTime
     */
    public String getCreatedTime() {
        return this.createdTime.getDateTime();
    }

    @SerializedName("pl") private AccountUnits pl;

    /**
     * Set the Profit/Loss
     * <p>
     * The total profit/loss realized over the lifetime of the Account.
     * Represented in the Account's home currency.
     * <p>
     * @param pl the Profit/Loss
     * @return {@link AccountSummary AccountSummary}
     * @see AccountUnits
     */
    public AccountSummary setPl(double pl) {
        this.pl = new AccountUnits(pl);
        return this;
    }

    /**
     * Get the Profit/Loss
     * <p>
     * The total profit/loss realized over the lifetime of the Account.
     * Represented in the Account's home currency.
     * <p>
     * @return the Profit/Loss
     * @see AccountUnits
     */
    public double getPl() {
        return this.pl.getAccountUnits();
    }

    @SerializedName("resettablePL") private AccountUnits resettablePL;

    /**
     * Set the Resettable Profit/Loss
     * <p>
     * The total realized profit/loss for the Account since it was last reset
     * by the client. Represented in the Account's home currency.
     * <p>
     * @param resettablePL the Resettable Profit/Loss
     * @return {@link AccountSummary AccountSummary}
     * @see AccountUnits
     */
    public AccountSummary setResettablePL(double resettablePL) {
        this.resettablePL = new AccountUnits(resettablePL);
        return this;
    }

    /**
     * Get the Resettable Profit/Loss
     * <p>
     * The total realized profit/loss for the Account since it was last reset
     * by the client. Represented in the Account's home currency.
     * <p>
     * @return the Resettable Profit/Loss
     * @see AccountUnits
     */
    public double getResettablePL() {
        return this.resettablePL.getAccountUnits();
    }

    @SerializedName("resettabledPLTime") private DateTime resettabledPLTime;

    /**
     * Set the Profit/Loss Reset Time
     * <p>
     * The date/time that the Account's resettablePL was last reset.
     * <p>
     * @param resettabledPLTime the Profit/Loss Reset Time
     * @return {@link AccountSummary AccountSummary}
     * @see DateTime
     */
    public AccountSummary setResettabledPLTime(String resettabledPLTime) {
        this.resettabledPLTime = new DateTime(resettabledPLTime);
        return this;
    }

    /**
     * Get the Profit/Loss Reset Time
     * <p>
     * The date/time that the Account's resettablePL was last reset.
     * <p>
     * @return the Profit/Loss Reset Time
     * @see DateTime
     */
    public String getResettabledPLTime() {
        return this.resettabledPLTime.getDateTime();
    }

    @SerializedName("marginRate") private DecimalNumber marginRate;

    /**
     * Set the Margin Rate
     * <p>
     * Client-provided margin rate override for the Account. The effective
     * margin rate of the Account is the lesser of this value and the OANDA
     * margin rate for the Account's division. This value is only provided if a
     * margin rate override exists for the Account.
     * <p>
     * @param marginRate the Margin Rate
     * @return {@link AccountSummary AccountSummary}
     * @see DecimalNumber
     */
    public AccountSummary setMarginRate(double marginRate) {
        this.marginRate = new DecimalNumber(marginRate);
        return this;
    }

    /**
     * Get the Margin Rate
     * <p>
     * Client-provided margin rate override for the Account. The effective
     * margin rate of the Account is the lesser of this value and the OANDA
     * margin rate for the Account's division. This value is only provided if a
     * margin rate override exists for the Account.
     * <p>
     * @return the Margin Rate
     * @see DecimalNumber
     */
    public double getMarginRate() {
        return this.marginRate.getDecimalNumber();
    }

    @SerializedName("marginCallEnterTime") private DateTime marginCallEnterTime;

    /**
     * Set the Margin Call Enter Time
     * <p>
     * The date/time when the Account entered a margin call state. Only
     * provided if the Account is in a margin call.
     * <p>
     * @param marginCallEnterTime the Margin Call Enter Time
     * @return {@link AccountSummary AccountSummary}
     * @see DateTime
     */
    public AccountSummary setMarginCallEnterTime(String marginCallEnterTime) {
        this.marginCallEnterTime = new DateTime(marginCallEnterTime);
        return this;
    }

    /**
     * Get the Margin Call Enter Time
     * <p>
     * The date/time when the Account entered a margin call state. Only
     * provided if the Account is in a margin call.
     * <p>
     * @return the Margin Call Enter Time
     * @see DateTime
     */
    public String getMarginCallEnterTime() {
        return this.marginCallEnterTime.getDateTime();
    }

    @SerializedName("marginCallExtensionCount") private Integer marginCallExtensionCount;

    /**
     * Set the Margin Call Extension Count
     * <p>
     * The number of times that the Account's current margin call was extended.
     * <p>
     * @param marginCallExtensionCount the Margin Call Extension Count
     * @return {@link AccountSummary AccountSummary}
     */
    public AccountSummary setMarginCallExtensionCount(int marginCallExtensionCount) {
        this.marginCallExtensionCount = marginCallExtensionCount;
        return this;
    }

    /**
     * Get the Margin Call Extension Count
     * <p>
     * The number of times that the Account's current margin call was extended.
     * <p>
     * @return the Margin Call Extension Count
     */
    public int getMarginCallExtensionCount() {
        return this.marginCallExtensionCount;
    }

    @SerializedName("lastMarginCallExtensionTime") private DateTime lastMarginCallExtensionTime;

    /**
     * Set the Last Margin Call Extension Time
     * <p>
     * The date/time of the Account's last margin call extension.
     * <p>
     * @param lastMarginCallExtensionTime the Last Margin Call Extension Time
     * @return {@link AccountSummary AccountSummary}
     * @see DateTime
     */
    public AccountSummary setLastMarginCallExtensionTime(String lastMarginCallExtensionTime) {
        this.lastMarginCallExtensionTime = new DateTime(lastMarginCallExtensionTime);
        return this;
    }

    /**
     * Get the Last Margin Call Extension Time
     * <p>
     * The date/time of the Account's last margin call extension.
     * <p>
     * @return the Last Margin Call Extension Time
     * @see DateTime
     */
    public String getLastMarginCallExtensionTime() {
        return this.lastMarginCallExtensionTime.getDateTime();
    }

    @SerializedName("openTradeCount") private Integer openTradeCount;

    /**
     * Set the Open Trade Count
     * <p>
     * The number of Trades currently open in the Account.
     * <p>
     * @param openTradeCount the Open Trade Count
     * @return {@link AccountSummary AccountSummary}
     */
    public AccountSummary setOpenTradeCount(int openTradeCount) {
        this.openTradeCount = openTradeCount;
        return this;
    }

    /**
     * Get the Open Trade Count
     * <p>
     * The number of Trades currently open in the Account.
     * <p>
     * @return the Open Trade Count
     */
    public int getOpenTradeCount() {
        return this.openTradeCount;
    }

    @SerializedName("openPositionCount") private Integer openPositionCount;

    /**
     * Set the Open Position Count
     * <p>
     * The number of Positions currently open in the Account.
     * <p>
     * @param openPositionCount the Open Position Count
     * @return {@link AccountSummary AccountSummary}
     */
    public AccountSummary setOpenPositionCount(int openPositionCount) {
        this.openPositionCount = openPositionCount;
        return this;
    }

    /**
     * Get the Open Position Count
     * <p>
     * The number of Positions currently open in the Account.
     * <p>
     * @return the Open Position Count
     */
    public int getOpenPositionCount() {
        return this.openPositionCount;
    }

    @SerializedName("pendingOrderCount") private Integer pendingOrderCount;

    /**
     * Set the Pending Order Count
     * <p>
     * The number of Orders currently pending in the Account.
     * <p>
     * @param pendingOrderCount the Pending Order Count
     * @return {@link AccountSummary AccountSummary}
     */
    public AccountSummary setPendingOrderCount(int pendingOrderCount) {
        this.pendingOrderCount = pendingOrderCount;
        return this;
    }

    /**
     * Get the Pending Order Count
     * <p>
     * The number of Orders currently pending in the Account.
     * <p>
     * @return the Pending Order Count
     */
    public int getPendingOrderCount() {
        return this.pendingOrderCount;
    }

    @SerializedName("hedgingEnabled") private Boolean hedgingEnabled;

    /**
     * Set the Hedging Enabled
     * <p>
     * Flag indicating that the Account has hedging enabled.
     * <p>
     * @param hedgingEnabled the Hedging Enabled
     * @return {@link AccountSummary AccountSummary}
     */
    public AccountSummary setHedgingEnabled(boolean hedgingEnabled) {
        this.hedgingEnabled = hedgingEnabled;
        return this;
    }

    /**
     * Get the Hedging Enabled
     * <p>
     * Flag indicating that the Account has hedging enabled.
     * <p>
     * @return the Hedging Enabled
     */
    public boolean getHedgingEnabled() {
        return this.hedgingEnabled;
    }

    @SerializedName("unrealizedPL") private AccountUnits unrealizedPL;

    /**
     * Set the Unrealized Profit/Loss
     * <p>
     * The total unrealized profit/loss for all Trades currently open in the
     * Account. Represented in the Account's home currency.
     * <p>
     * @param unrealizedPL the Unrealized Profit/Loss
     * @return {@link AccountSummary AccountSummary}
     * @see AccountUnits
     */
    public AccountSummary setUnrealizedPL(double unrealizedPL) {
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
     * @return {@link AccountSummary AccountSummary}
     * @see AccountUnits
     */
    public AccountSummary setNAV(double nAV) {
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
     * @return {@link AccountSummary AccountSummary}
     * @see AccountUnits
     */
    public AccountSummary setMarginUsed(double marginUsed) {
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
     * @return {@link AccountSummary AccountSummary}
     * @see AccountUnits
     */
    public AccountSummary setMarginAvailable(double marginAvailable) {
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
     * @return {@link AccountSummary AccountSummary}
     * @see AccountUnits
     */
    public AccountSummary setPositionValue(double positionValue) {
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
     * @return {@link AccountSummary AccountSummary}
     * @see AccountUnits
     */
    public AccountSummary setMarginCloseoutUnrealizedPL(double marginCloseoutUnrealizedPL) {
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
     * @return {@link AccountSummary AccountSummary}
     * @see AccountUnits
     */
    public AccountSummary setMarginCloseoutNAV(double marginCloseoutNAV) {
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
     * @return {@link AccountSummary AccountSummary}
     * @see AccountUnits
     */
    public AccountSummary setMarginCloseoutMarginUsed(double marginCloseoutMarginUsed) {
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
     * @return {@link AccountSummary AccountSummary}
     * @see DecimalNumber
     */
    public AccountSummary setMarginCloseoutPercent(double marginCloseoutPercent) {
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
     * @return {@link AccountSummary AccountSummary}
     * @see DecimalNumber
     */
    public AccountSummary setMarginCloseoutPositionValue(double marginCloseoutPositionValue) {
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
     * @return {@link AccountSummary AccountSummary}
     * @see AccountUnits
     */
    public AccountSummary setWithdrawalLimit(double withdrawalLimit) {
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
     * @return {@link AccountSummary AccountSummary}
     * @see AccountUnits
     */
    public AccountSummary setMarginCallMarginUsed(double marginCallMarginUsed) {
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
     * @return {@link AccountSummary AccountSummary}
     * @see DecimalNumber
     */
    public AccountSummary setMarginCallPercent(double marginCallPercent) {
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

    @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

    /**
     * Set the Last Transaction ID
     * <p>
     * The ID of the last Transaction created for the Account.
     * <p>
     * @param lastTransactionID the Last Transaction ID
     * @return {@link AccountSummary AccountSummary}
     * @see TransactionID
     */
    public AccountSummary setLastTransactionID(String lastTransactionID) {
        this.lastTransactionID = new TransactionID(lastTransactionID);
        return this;
    }

    /**
     * Get the Last Transaction ID
     * <p>
     * The ID of the last Transaction created for the Account.
     * <p>
     * @return the Last Transaction ID
     * @see TransactionID
     */
    public String getLastTransactionID() {
        return this.lastTransactionID.getTransactionID();
    }
}
