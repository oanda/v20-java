package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* An OrderFillTransaction represents the filling of an Order in the client's
* Account.
*/

public class OrderFillTransaction implements Transaction {

    @SerializedName("id") private TransactionID _id;
    public OrderFillTransaction set_id(String __id) { 
        this._id = new TransactionID(__id); 
        return this;
    }
    /**
    * The Transaction's Identifier.
    */

    public String get_id() {
        return this._id.get_TransactionID();
    }

    @SerializedName("time") private DateTime _time;
    public OrderFillTransaction set_time(String __time) { 
        this._time = new DateTime(__time); 
        return this;
    }
    /**
    * The date/time when the Transaction was created.
    */

    public String get_time() {
        return this._time.get_DateTime();
    }

    @SerializedName("userID") private Integer _userID;
    public OrderFillTransaction set_userID(int __userID) {
        this._userID = __userID;
        return this;
    }
    /**
    * The ID of the user that initiated the creation of the Transaction.
    */

    public int get_userID() {
        return this._userID;
    }

    @SerializedName("accountID") private AccountID _accountID;
    public OrderFillTransaction set_accountID(String __accountID) { 
        this._accountID = new AccountID(__accountID); 
        return this;
    }
    /**
    * The ID of the Account the Transaction was created for.
    */

    public String get_accountID() {
        return this._accountID.get_AccountID();
    }

    @SerializedName("batchID") private TransactionID _batchID;
    public OrderFillTransaction set_batchID(String __batchID) { 
        this._batchID = new TransactionID(__batchID); 
        return this;
    }
    /**
    * The ID of the "batch" that the Transaction belongs to. Transactions in
    * the same batch are applied to the Account simultaneously.
    */

    public String get_batchID() {
        return this._batchID.get_TransactionID();
    }

    @SerializedName("requestID") private RequestID _requestID;
    public OrderFillTransaction set_requestID(String __requestID) { 
        this._requestID = new RequestID(__requestID); 
        return this;
    }
    /**
    * The Request ID of the Account Control Request which generated the
    * transaction (only provided for Transactions created by a Client request)
    */

    public String get_requestID() {
        return this._requestID.get_RequestID();
    }

    @SerializedName("type") private TransactionType _type = TransactionType.ORDER_FILL;
    /**
    * The Type of the Transaction. Always set to "ORDER_FILL" for an
    * OrderFillTransaction.
    */

    public TransactionType get_type() {
        return this._type;
    }

    @SerializedName("orderID") private OrderID _orderID;
    public OrderFillTransaction set_orderID(String __orderID) { 
        this._orderID = new OrderID(__orderID); 
        return this;
    }
    /**
    * The ID of the Order filled.
    */

    public String get_orderID() {
        return this._orderID.get_OrderID();
    }

    @SerializedName("clientOrderID") private ClientID _clientOrderID;
    public OrderFillTransaction set_clientOrderID(String __clientOrderID) { 
        this._clientOrderID = new ClientID(__clientOrderID); 
        return this;
    }
    /**
    * The client Order ID of the Order filled (only provided if the client has
    * assigned one).
    */

    public String get_clientOrderID() {
        return this._clientOrderID.get_ClientID();
    }

    @SerializedName("instrument") private InstrumentName _instrument;
    public OrderFillTransaction set_instrument(String __instrument) { 
        this._instrument = new InstrumentName(__instrument); 
        return this;
    }
    /**
    * The name of the filled Order's instrument.
    */

    public String get_instrument() {
        return this._instrument.get_InstrumentName();
    }

    @SerializedName("units") private DecimalNumber _units;
    // Numeric stored as String
    public OrderFillTransaction set_units(double __units) { 
        this._units = new DecimalNumber(__units); 
        return this;
    }
    /**
    * The number of units filled by the Order.
    */

    public double get_units() {
        return this._units.get_DecimalNumber();
    }

    @SerializedName("price") private PriceValue _price;
    // Numeric stored as String
    public OrderFillTransaction set_price(double __price) { 
        this._price = new PriceValue(__price); 
        return this;
    }
    /**
    * The average market price that the Order was filled at.
    */

    public double get_price() {
        return this._price.get_PriceValue();
    }

    @SerializedName("reason") private OrderFillReason _reason;
    public OrderFillTransaction set_reason(OrderFillReason __reason) { 
        this._reason = __reason;
        return this;
    }
    /**
    * The reason that an Order was filled
    */

    public OrderFillReason get_reason() {
        return this._reason;
    }

    @SerializedName("pl") private AccountUnits _pl;
    // Numeric stored as String
    public OrderFillTransaction set_pl(double __pl) { 
        this._pl = new AccountUnits(__pl); 
        return this;
    }
    /**
    * The profit or loss incurred when the Order was filled.
    */

    public double get_pl() {
        return this._pl.get_AccountUnits();
    }

    @SerializedName("financing") private AccountUnits _financing;
    // Numeric stored as String
    public OrderFillTransaction set_financing(double __financing) { 
        this._financing = new AccountUnits(__financing); 
        return this;
    }
    /**
    * The financing paid or collected when the Order was filled.
    */

    public double get_financing() {
        return this._financing.get_AccountUnits();
    }

    @SerializedName("accountBalance") private AccountUnits _accountBalance;
    // Numeric stored as String
    public OrderFillTransaction set_accountBalance(double __accountBalance) { 
        this._accountBalance = new AccountUnits(__accountBalance); 
        return this;
    }
    /**
    * The Account's balance after the Order was filled.
    */

    public double get_accountBalance() {
        return this._accountBalance.get_AccountUnits();
    }

    @SerializedName("tradeOpened") private TradeOpen _tradeOpened;
    public OrderFillTransaction set_tradeOpened(TradeOpen __tradeOpened) { 
        this._tradeOpened = __tradeOpened;
        return this;
    }
    /**
    * The Trade that was opened when the Order was filled (only provided if
    * filling the Order resulted in a new Trade).
    */

    public TradeOpen get_tradeOpened() {
        return this._tradeOpened;
    }
 
    @SerializedName("tradesClosed") private TradeReduce[] _tradesClosed;
    public OrderFillTransaction set_tradesClosed(TradeReduce[] __tradesClosed) {
        this._tradesClosed = __tradesClosed;
        return this;
    }
    /**
    * The Trades that were closed when the Order was filled (only provided if
    * filling the Order resulted in a closing open Trades).
    */

    public TradeReduce[] get_tradesClosed() {
        return this._tradesClosed;
    }

    @SerializedName("tradeReduced") private TradeReduce _tradeReduced;
    public OrderFillTransaction set_tradeReduced(TradeReduce __tradeReduced) { 
        this._tradeReduced = __tradeReduced;
        return this;
    }
    /**
    * The Trade that was reduced when the Order was filled (only provided if
    * filling the Order resulted in reducing an open Trade).
    */

    public TradeReduce get_tradeReduced() {
        return this._tradeReduced;
    }
}
