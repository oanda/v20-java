package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* The full details of a client's Account. This includes full open Trade, open
* Position and pending Order representation.
*/

public class Account {

    @SerializedName("id") private AccountID _id;
    public Account set_id(String __id) { 
        this._id = new AccountID(__id); 
        return this;
    }
    /**
    * The Account's identifier
    */

    public String get_id() {
        return this._id.get_AccountID();
    }

    @SerializedName("alias") private String _alias;
    public Account set_alias(String __alias) {
        this._alias = __alias;
        return this;
    }
    /**
    * Client-assigned alias for the Account. Only provided if the Account has
    * an alias set
    */

    public String get_alias() {
        return this._alias;
    }

    @SerializedName("currency") private Currency _currency;
    public Account set_currency(String __currency) { 
        this._currency = new Currency(__currency); 
        return this;
    }
    /**
    * The home currency of the Account
    */

    public String get_currency() {
        return this._currency.get_Currency();
    }

    @SerializedName("balance") private AccountUnits _balance;
    // Numeric stored as String
    public Account set_balance(double __balance) { 
        this._balance = new AccountUnits(__balance); 
        return this;
    }
    /**
    * The current balance of the Account. Represented in the Account's home
    * currency.
    */

    public double get_balance() {
        return this._balance.get_AccountUnits();
    }

    @SerializedName("createdByUserID") private Integer _createdByUserID;
    public Account set_createdByUserID(int __createdByUserID) {
        this._createdByUserID = __createdByUserID;
        return this;
    }
    /**
    * ID of the user that created the Account.
    */

    public int get_createdByUserID() {
        return this._createdByUserID;
    }

    @SerializedName("createdTime") private DateTime _createdTime;
    public Account set_createdTime(String __createdTime) { 
        this._createdTime = new DateTime(__createdTime); 
        return this;
    }
    /**
    * The date/time when the Account was created.
    */

    public String get_createdTime() {
        return this._createdTime.get_DateTime();
    }

    @SerializedName("pl") private AccountUnits _pl;
    // Numeric stored as String
    public Account set_pl(double __pl) { 
        this._pl = new AccountUnits(__pl); 
        return this;
    }
    /**
    * The total profit/loss realized over the lifetime of the Account.
    * Represented in the Account's home currency.
    */

    public double get_pl() {
        return this._pl.get_AccountUnits();
    }

    @SerializedName("resettablePL") private AccountUnits _resettablePL;
    // Numeric stored as String
    public Account set_resettablePL(double __resettablePL) { 
        this._resettablePL = new AccountUnits(__resettablePL); 
        return this;
    }
    /**
    * The total realized profit/loss for the Account since it was last reset by
    * the client. Represented in the Account's home currency.
    */

    public double get_resettablePL() {
        return this._resettablePL.get_AccountUnits();
    }

    @SerializedName("resettabledPLTime") private DateTime _resettabledPLTime;
    public Account set_resettabledPLTime(String __resettabledPLTime) { 
        this._resettabledPLTime = new DateTime(__resettabledPLTime); 
        return this;
    }
    /**
    * The date/time that the Account's resettablePL was last reset.
    */

    public String get_resettabledPLTime() {
        return this._resettabledPLTime.get_DateTime();
    }

    @SerializedName("marginRate") private DecimalNumber _marginRate;
    // Numeric stored as String
    public Account set_marginRate(double __marginRate) { 
        this._marginRate = new DecimalNumber(__marginRate); 
        return this;
    }
    /**
    * Client-provided margin rate override for the Account. The effective
    * margin rate of the Account is the lesser of this value and the OANDA
    * margin rate for the Account's division. This value is only provided if a
    * margin rate override exists for the Account.
    */

    public double get_marginRate() {
        return this._marginRate.get_DecimalNumber();
    }

    @SerializedName("marginCallEnterTime") private DateTime _marginCallEnterTime;
    public Account set_marginCallEnterTime(String __marginCallEnterTime) { 
        this._marginCallEnterTime = new DateTime(__marginCallEnterTime); 
        return this;
    }
    /**
    * The date/time when the Account entered a margin call state. Only provided
    * if the Account is in a margin call.
    */

    public String get_marginCallEnterTime() {
        return this._marginCallEnterTime.get_DateTime();
    }

    @SerializedName("marginCallExtensionCount") private Integer _marginCallExtensionCount;
    public Account set_marginCallExtensionCount(int __marginCallExtensionCount) {
        this._marginCallExtensionCount = __marginCallExtensionCount;
        return this;
    }
    /**
    * The number of times that the Account's current margin call was extended.
    */

    public int get_marginCallExtensionCount() {
        return this._marginCallExtensionCount;
    }

    @SerializedName("lastMarginCallExtensionTime") private DateTime _lastMarginCallExtensionTime;
    public Account set_lastMarginCallExtensionTime(String __lastMarginCallExtensionTime) { 
        this._lastMarginCallExtensionTime = new DateTime(__lastMarginCallExtensionTime); 
        return this;
    }
    /**
    * The date/time of the Account's last margin call extension.
    */

    public String get_lastMarginCallExtensionTime() {
        return this._lastMarginCallExtensionTime.get_DateTime();
    }

    @SerializedName("openTradeCount") private Integer _openTradeCount;
    public Account set_openTradeCount(int __openTradeCount) {
        this._openTradeCount = __openTradeCount;
        return this;
    }
    /**
    * The number of Trades currently open in the Account.
    */

    public int get_openTradeCount() {
        return this._openTradeCount;
    }

    @SerializedName("openPositionCount") private Integer _openPositionCount;
    public Account set_openPositionCount(int __openPositionCount) {
        this._openPositionCount = __openPositionCount;
        return this;
    }
    /**
    * The number of Positions currently open in the Account.
    */

    public int get_openPositionCount() {
        return this._openPositionCount;
    }

    @SerializedName("pendingOrderCount") private Integer _pendingOrderCount;
    public Account set_pendingOrderCount(int __pendingOrderCount) {
        this._pendingOrderCount = __pendingOrderCount;
        return this;
    }
    /**
    * The number of Orders currently pending in the Account.
    */

    public int get_pendingOrderCount() {
        return this._pendingOrderCount;
    }

    @SerializedName("hedgingEnabled") private Boolean _hedgingEnabled;
    public Account set_hedgingEnabled(boolean __hedgingEnabled) {
        this._hedgingEnabled = __hedgingEnabled;
        return this;
    }
    /**
    * Flag indicating that the Account has hedging enabled.
    */

    public boolean get_hedgingEnabled() {
        return this._hedgingEnabled;
    }

    @SerializedName("unrealizedPL") private AccountUnits _unrealizedPL;
    // Numeric stored as String
    public Account set_unrealizedPL(double __unrealizedPL) { 
        this._unrealizedPL = new AccountUnits(__unrealizedPL); 
        return this;
    }
    /**
    * The total unrealized profit/loss for all Trades currently open in the
    * Account. Represented in the Account's home currency.
    */

    public double get_unrealizedPL() {
        return this._unrealizedPL.get_AccountUnits();
    }

    @SerializedName("NAV") private AccountUnits _NAV;
    // Numeric stored as String
    public Account set_NAV(double __NAV) { 
        this._NAV = new AccountUnits(__NAV); 
        return this;
    }
    /**
    * The net asset value of the Account. Equal to Account balance +
    * unrealizedPL. Represented in the Account's home currency.
    */

    public double get_NAV() {
        return this._NAV.get_AccountUnits();
    }

    @SerializedName("marginUsed") private AccountUnits _marginUsed;
    // Numeric stored as String
    public Account set_marginUsed(double __marginUsed) { 
        this._marginUsed = new AccountUnits(__marginUsed); 
        return this;
    }
    /**
    * Margin currently used for the Account. Represented in the Account's home
    * currency.
    */

    public double get_marginUsed() {
        return this._marginUsed.get_AccountUnits();
    }

    @SerializedName("marginAvailable") private AccountUnits _marginAvailable;
    // Numeric stored as String
    public Account set_marginAvailable(double __marginAvailable) { 
        this._marginAvailable = new AccountUnits(__marginAvailable); 
        return this;
    }
    /**
    * Margin available for Account. Represented in the Account's home currency.
    */

    public double get_marginAvailable() {
        return this._marginAvailable.get_AccountUnits();
    }

    @SerializedName("positionValue") private AccountUnits _positionValue;
    // Numeric stored as String
    public Account set_positionValue(double __positionValue) { 
        this._positionValue = new AccountUnits(__positionValue); 
        return this;
    }
    /**
    * The value of the Account's open positions represented in the Account's
    * home currency.
    */

    public double get_positionValue() {
        return this._positionValue.get_AccountUnits();
    }

    @SerializedName("marginCloseoutUnrealizedPL") private AccountUnits _marginCloseoutUnrealizedPL;
    // Numeric stored as String
    public Account set_marginCloseoutUnrealizedPL(double __marginCloseoutUnrealizedPL) { 
        this._marginCloseoutUnrealizedPL = new AccountUnits(__marginCloseoutUnrealizedPL); 
        return this;
    }
    /**
    * The Account's margin closeout unrealized PL.
    */

    public double get_marginCloseoutUnrealizedPL() {
        return this._marginCloseoutUnrealizedPL.get_AccountUnits();
    }

    @SerializedName("marginCloseoutNAV") private AccountUnits _marginCloseoutNAV;
    // Numeric stored as String
    public Account set_marginCloseoutNAV(double __marginCloseoutNAV) { 
        this._marginCloseoutNAV = new AccountUnits(__marginCloseoutNAV); 
        return this;
    }
    /**
    * The Account's margin closeout NAV.
    */

    public double get_marginCloseoutNAV() {
        return this._marginCloseoutNAV.get_AccountUnits();
    }

    @SerializedName("marginCloseoutMarginUsed") private AccountUnits _marginCloseoutMarginUsed;
    // Numeric stored as String
    public Account set_marginCloseoutMarginUsed(double __marginCloseoutMarginUsed) { 
        this._marginCloseoutMarginUsed = new AccountUnits(__marginCloseoutMarginUsed); 
        return this;
    }
    /**
    * The Account's margin closeout margin used.
    */

    public double get_marginCloseoutMarginUsed() {
        return this._marginCloseoutMarginUsed.get_AccountUnits();
    }

    @SerializedName("marginCloseoutPercent") private DecimalNumber _marginCloseoutPercent;
    // Numeric stored as String
    public Account set_marginCloseoutPercent(double __marginCloseoutPercent) { 
        this._marginCloseoutPercent = new DecimalNumber(__marginCloseoutPercent); 
        return this;
    }
    /**
    * The Account's margin closeout percentage. When this value is 1.0 or above
    * the Account is in a margin closeout situation.
    */

    public double get_marginCloseoutPercent() {
        return this._marginCloseoutPercent.get_DecimalNumber();
    }

    @SerializedName("marginCloseoutPositionValue") private DecimalNumber _marginCloseoutPositionValue;
    // Numeric stored as String
    public Account set_marginCloseoutPositionValue(double __marginCloseoutPositionValue) { 
        this._marginCloseoutPositionValue = new DecimalNumber(__marginCloseoutPositionValue); 
        return this;
    }
    /**
    * The value of the Account's open positions as used for margin closeout
    * calculations represented in the Account's home currency.
    */

    public double get_marginCloseoutPositionValue() {
        return this._marginCloseoutPositionValue.get_DecimalNumber();
    }

    @SerializedName("withdrawalLimit") private AccountUnits _withdrawalLimit;
    // Numeric stored as String
    public Account set_withdrawalLimit(double __withdrawalLimit) { 
        this._withdrawalLimit = new AccountUnits(__withdrawalLimit); 
        return this;
    }
    /**
    * The current WithdrawalLimit for the account which will be zero or a
    * positive value indicating how much can be withdrawn from the account.
    */

    public double get_withdrawalLimit() {
        return this._withdrawalLimit.get_AccountUnits();
    }

    @SerializedName("marginCallMarginUsed") private AccountUnits _marginCallMarginUsed;
    // Numeric stored as String
    public Account set_marginCallMarginUsed(double __marginCallMarginUsed) { 
        this._marginCallMarginUsed = new AccountUnits(__marginCallMarginUsed); 
        return this;
    }
    /**
    * The Account's margin call margin used.
    */

    public double get_marginCallMarginUsed() {
        return this._marginCallMarginUsed.get_AccountUnits();
    }

    @SerializedName("marginCallPercent") private DecimalNumber _marginCallPercent;
    // Numeric stored as String
    public Account set_marginCallPercent(double __marginCallPercent) { 
        this._marginCallPercent = new DecimalNumber(__marginCallPercent); 
        return this;
    }
    /**
    * The Account's margin call percentage. When this value is 1.0 or above the
    * Account is in a margin call situation.
    */

    public double get_marginCallPercent() {
        return this._marginCallPercent.get_DecimalNumber();
    }

    @SerializedName("lastTransactionID") private TransactionID _lastTransactionID;
    public Account set_lastTransactionID(String __lastTransactionID) { 
        this._lastTransactionID = new TransactionID(__lastTransactionID); 
        return this;
    }
    /**
    * The ID of the last Transaction created for the Account.
    */

    public String get_lastTransactionID() {
        return this._lastTransactionID.get_TransactionID();
    }
 
    @SerializedName("trades") private TradeSummary[] _trades;
    public Account set_trades(TradeSummary[] __trades) {
        this._trades = __trades;
        return this;
    }
    /**
    * The details of the Trades currently open in the Account.
    */

    public TradeSummary[] get_trades() {
        return this._trades;
    }
 
    @SerializedName("positions") private Position[] _positions;
    public Account set_positions(Position[] __positions) {
        this._positions = __positions;
        return this;
    }
    /**
    * The details all Account Positions.
    */

    public Position[] get_positions() {
        return this._positions;
    }
 
    @SerializedName("orders") private Order[] _orders;
    public Account set_orders(Order[] __orders) {
        this._orders = __orders;
        return this;
    }
    /**
    * The details of the Orders currently pending in the Account.
    */

    public Order[] get_orders() {
        return this._orders;
    }
}
