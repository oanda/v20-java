package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* An AccountState Object is used to represent an Account's current price-
* dependent state. Price-dependent Account state is dependent on OANDA's
* current Prices, and includes things like unrealized PL, NAV and Trailing Stop
* Loss Order state.
*/

public class AccountChangesState {

    @SerializedName("unrealizedPL") private AccountUnits _unrealizedPL;
    // Numeric stored as String
    public AccountChangesState set_unrealizedPL(double __unrealizedPL) { 
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
    public AccountChangesState set_NAV(double __NAV) { 
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
    public AccountChangesState set_marginUsed(double __marginUsed) { 
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
    public AccountChangesState set_marginAvailable(double __marginAvailable) { 
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
    public AccountChangesState set_positionValue(double __positionValue) { 
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
    public AccountChangesState set_marginCloseoutUnrealizedPL(double __marginCloseoutUnrealizedPL) { 
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
    public AccountChangesState set_marginCloseoutNAV(double __marginCloseoutNAV) { 
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
    public AccountChangesState set_marginCloseoutMarginUsed(double __marginCloseoutMarginUsed) { 
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
    public AccountChangesState set_marginCloseoutPercent(double __marginCloseoutPercent) { 
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
    public AccountChangesState set_marginCloseoutPositionValue(double __marginCloseoutPositionValue) { 
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
    public AccountChangesState set_withdrawalLimit(double __withdrawalLimit) { 
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
    public AccountChangesState set_marginCallMarginUsed(double __marginCallMarginUsed) { 
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
    public AccountChangesState set_marginCallPercent(double __marginCallPercent) { 
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
 
    @SerializedName("orders") private DynamicOrderState[] _orders;
    public AccountChangesState set_orders(DynamicOrderState[] __orders) {
        this._orders = __orders;
        return this;
    }
    /**
    * The price-dependent state of each pending Order in the Account.
    */

    public DynamicOrderState[] get_orders() {
        return this._orders;
    }
 
    @SerializedName("trades") private CalculatedTradeState[] _trades;
    public AccountChangesState set_trades(CalculatedTradeState[] __trades) {
        this._trades = __trades;
        return this;
    }
    /**
    * The price-dependent state for each open Trade in the Account.
    */

    public CalculatedTradeState[] get_trades() {
        return this._trades;
    }
 
    @SerializedName("positions") private CalculatedPositionState[] _positions;
    public AccountChangesState set_positions(CalculatedPositionState[] __positions) {
        this._positions = __positions;
        return this;
    }
    /**
    * The price-dependent state for each open Position in the Account.
    */

    public CalculatedPositionState[] get_positions() {
        return this._positions;
    }
}
