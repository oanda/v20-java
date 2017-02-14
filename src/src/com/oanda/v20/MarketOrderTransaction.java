package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A MarketOrderTransaction represents the creation of a Market Order in the
* user's account. A Market Order is an Order that is filled immediately at the
* current market price. Market Orders can be specialized when they are created
* to accomplish a specific task: to close a Trade, to closeout a Position or to
* particiate in in a Margin closeout.
*/

public class MarketOrderTransaction implements Transaction {

    @SerializedName("id") private TransactionID _id;
    public MarketOrderTransaction set_id(String __id) { 
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
    public MarketOrderTransaction set_time(String __time) { 
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
    public MarketOrderTransaction set_userID(int __userID) {
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
    public MarketOrderTransaction set_accountID(String __accountID) { 
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
    public MarketOrderTransaction set_batchID(String __batchID) { 
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
    public MarketOrderTransaction set_requestID(String __requestID) { 
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

    @SerializedName("type") private TransactionType _type = TransactionType.MARKET_ORDER;
    /**
    * The Type of the Transaction. Always set to "MARKET_ORDER" in a
    * MarketOrderTransaction.
    */

    public TransactionType get_type() {
        return this._type;
    }

    @SerializedName("instrument") private InstrumentName _instrument;
    public MarketOrderTransaction set_instrument(String __instrument) { 
        this._instrument = new InstrumentName(__instrument); 
        return this;
    }
    /**
    * The Market Order's Instrument.
    */

    public String get_instrument() {
        return this._instrument.get_InstrumentName();
    }

    @SerializedName("units") private DecimalNumber _units;
    // Numeric stored as String
    public MarketOrderTransaction set_units(double __units) { 
        this._units = new DecimalNumber(__units); 
        return this;
    }
    /**
    * The quantity requested to be filled by the Market Order. A posititive
    * number of units results in a long Order, and a negative number of units
    * results in a short Order.
    */

    public double get_units() {
        return this._units.get_DecimalNumber();
    }

    @SerializedName("timeInForce") private TimeInForce _timeInForce = TimeInForce.FOK;
    public MarketOrderTransaction set_timeInForce(TimeInForce __timeInForce) { 
        this._timeInForce = __timeInForce;
        return this;
    }
    /**
    * The time-in-force requested for the Market Order. Restricted to FOK or
    * IOC for a MarketOrder.
    */

    public TimeInForce get_timeInForce() {
        return this._timeInForce;
    }

    @SerializedName("priceBound") private PriceValue _priceBound;
    // Numeric stored as String
    public MarketOrderTransaction set_priceBound(double __priceBound) { 
        this._priceBound = new PriceValue(__priceBound); 
        return this;
    }
    /**
    * The worst price that the client is willing to have the Market Order
    * filled at.
    */

    public double get_priceBound() {
        return this._priceBound.get_PriceValue();
    }

    @SerializedName("positionFill") private OrderPositionFill _positionFill = OrderPositionFill.DEFAULT;
    public MarketOrderTransaction set_positionFill(OrderPositionFill __positionFill) { 
        this._positionFill = __positionFill;
        return this;
    }
    /**
    * Specification of how Positions in the Account are modified when the Order
    * is filled.
    */

    public OrderPositionFill get_positionFill() {
        return this._positionFill;
    }

    @SerializedName("tradeClose") private MarketOrderTradeClose _tradeClose;
    public MarketOrderTransaction set_tradeClose(MarketOrderTradeClose __tradeClose) { 
        this._tradeClose = __tradeClose;
        return this;
    }
    /**
    * Details of the Trade requested to be closed, only provided when the
    * Market Order is being used to explicitly close a Trade.
    */

    public MarketOrderTradeClose get_tradeClose() {
        return this._tradeClose;
    }

    @SerializedName("longPositionCloseout") private MarketOrderPositionCloseout _longPositionCloseout;
    public MarketOrderTransaction set_longPositionCloseout(MarketOrderPositionCloseout __longPositionCloseout) { 
        this._longPositionCloseout = __longPositionCloseout;
        return this;
    }
    /**
    * Details of the long Position requested to be closed out, only provided
    * when a Market Order is being used to explicitly closeout a long Position.
    */

    public MarketOrderPositionCloseout get_longPositionCloseout() {
        return this._longPositionCloseout;
    }

    @SerializedName("shortPositionCloseout") private MarketOrderPositionCloseout _shortPositionCloseout;
    public MarketOrderTransaction set_shortPositionCloseout(MarketOrderPositionCloseout __shortPositionCloseout) { 
        this._shortPositionCloseout = __shortPositionCloseout;
        return this;
    }
    /**
    * Details of the short Position requested to be closed out, only provided
    * when a Market Order is being used to explicitly closeout a short
    * Position.
    */

    public MarketOrderPositionCloseout get_shortPositionCloseout() {
        return this._shortPositionCloseout;
    }

    @SerializedName("marginCloseout") private MarketOrderMarginCloseout _marginCloseout;
    public MarketOrderTransaction set_marginCloseout(MarketOrderMarginCloseout __marginCloseout) { 
        this._marginCloseout = __marginCloseout;
        return this;
    }
    /**
    * Details of the Margin Closeout that this Market Order was created for
    */

    public MarketOrderMarginCloseout get_marginCloseout() {
        return this._marginCloseout;
    }

    @SerializedName("delayedTradeClose") private MarketOrderDelayedTradeClose _delayedTradeClose;
    public MarketOrderTransaction set_delayedTradeClose(MarketOrderDelayedTradeClose __delayedTradeClose) { 
        this._delayedTradeClose = __delayedTradeClose;
        return this;
    }
    /**
    * Details of the delayed Trade close that this Market Order was created for
    */

    public MarketOrderDelayedTradeClose get_delayedTradeClose() {
        return this._delayedTradeClose;
    }

    @SerializedName("reason") private MarketOrderReason _reason;
    public MarketOrderTransaction set_reason(MarketOrderReason __reason) { 
        this._reason = __reason;
        return this;
    }
    /**
    * The reason that the Market Order was created
    */

    public MarketOrderReason get_reason() {
        return this._reason;
    }

    @SerializedName("clientExtensions") private ClientExtensions _clientExtensions;
    public MarketOrderTransaction set_clientExtensions(ClientExtensions __clientExtensions) { 
        this._clientExtensions = __clientExtensions;
        return this;
    }
    /**
    * Client Extensions to add to the Order (only provided if the Order is
    * being created with client extensions).
    */

    public ClientExtensions get_clientExtensions() {
        return this._clientExtensions;
    }

    @SerializedName("takeProfitOnFill") private TakeProfitDetails _takeProfitOnFill;
    public MarketOrderTransaction set_takeProfitOnFill(TakeProfitDetails __takeProfitOnFill) { 
        this._takeProfitOnFill = __takeProfitOnFill;
        return this;
    }
    /**
    * The specification of the Take Profit Order that should be created for a
    * Trade opened when the Order is filled (if such a Trade is created).
    */

    public TakeProfitDetails get_takeProfitOnFill() {
        return this._takeProfitOnFill;
    }

    @SerializedName("stopLossOnFill") private StopLossDetails _stopLossOnFill;
    public MarketOrderTransaction set_stopLossOnFill(StopLossDetails __stopLossOnFill) { 
        this._stopLossOnFill = __stopLossOnFill;
        return this;
    }
    /**
    * The specification of the Stop Loss Order that should be created for a
    * Trade opened when the Order is filled (if such a Trade is created).
    */

    public StopLossDetails get_stopLossOnFill() {
        return this._stopLossOnFill;
    }

    @SerializedName("trailingStopLossOnFill") private TrailingStopLossDetails _trailingStopLossOnFill;
    public MarketOrderTransaction set_trailingStopLossOnFill(TrailingStopLossDetails __trailingStopLossOnFill) { 
        this._trailingStopLossOnFill = __trailingStopLossOnFill;
        return this;
    }
    /**
    * The specification of the Trailing Stop Loss Order that should be created
    * for a Trade that is opened when the Order is filled (if such a Trade is
    * created).
    */

    public TrailingStopLossDetails get_trailingStopLossOnFill() {
        return this._trailingStopLossOnFill;
    }

    @SerializedName("tradeClientExtensions") private ClientExtensions _tradeClientExtensions;
    public MarketOrderTransaction set_tradeClientExtensions(ClientExtensions __tradeClientExtensions) { 
        this._tradeClientExtensions = __tradeClientExtensions;
        return this;
    }
    /**
    * Client Extensions to add to the Trade created when the Order is filled
    * (if such a Trade is created).  Do not set, modify, delete
    * tradeClientExtensions if your account is associated with MT4.
    */

    public ClientExtensions get_tradeClientExtensions() {
        return this._tradeClientExtensions;
    }
}
