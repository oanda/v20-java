package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A MarketOrder is an order that is filled immediately upon creation using the
* current market price.
*/

public class MarketOrder implements Order {

    @SerializedName("id") private OrderID _id;
    public MarketOrder set_id(String __id) { 
        this._id = new OrderID(__id); 
        return this;
    }
    /**
    * The Order's identifier, unique within the Order's Account.
    */

    public String get_id() {
        return this._id.get_OrderID();
    }

    @SerializedName("createTime") private DateTime _createTime;
    public MarketOrder set_createTime(String __createTime) { 
        this._createTime = new DateTime(__createTime); 
        return this;
    }
    /**
    * The time when the Order was created.
    */

    public String get_createTime() {
        return this._createTime.get_DateTime();
    }

    @SerializedName("state") private OrderState _state;
    public MarketOrder set_state(OrderState __state) { 
        this._state = __state;
        return this;
    }
    /**
    * The current state of the Order.
    */

    public OrderState get_state() {
        return this._state;
    }

    @SerializedName("clientExtensions") private ClientExtensions _clientExtensions;
    public MarketOrder set_clientExtensions(ClientExtensions __clientExtensions) { 
        this._clientExtensions = __clientExtensions;
        return this;
    }
    /**
    * The client extensions of the Order. Do not set, modify, or delete
    * clientExtensions if your account is associated with MT4.
    */

    public ClientExtensions get_clientExtensions() {
        return this._clientExtensions;
    }

    @SerializedName("type") private OrderType _type = OrderType.MARKET;
    /**
    * The type of the Order. Always set to "MARKET" for Market Orders.
    */

    public OrderType get_type() {
        return this._type;
    }

    @SerializedName("instrument") private InstrumentName _instrument;
    public MarketOrder set_instrument(String __instrument) { 
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
    public MarketOrder set_units(double __units) { 
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
    public MarketOrder set_timeInForce(TimeInForce __timeInForce) { 
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
    public MarketOrder set_priceBound(double __priceBound) { 
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
    public MarketOrder set_positionFill(OrderPositionFill __positionFill) { 
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
    public MarketOrder set_tradeClose(MarketOrderTradeClose __tradeClose) { 
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
    public MarketOrder set_longPositionCloseout(MarketOrderPositionCloseout __longPositionCloseout) { 
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
    public MarketOrder set_shortPositionCloseout(MarketOrderPositionCloseout __shortPositionCloseout) { 
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
    public MarketOrder set_marginCloseout(MarketOrderMarginCloseout __marginCloseout) { 
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
    public MarketOrder set_delayedTradeClose(MarketOrderDelayedTradeClose __delayedTradeClose) { 
        this._delayedTradeClose = __delayedTradeClose;
        return this;
    }
    /**
    * Details of the delayed Trade close that this Market Order was created for
    */

    public MarketOrderDelayedTradeClose get_delayedTradeClose() {
        return this._delayedTradeClose;
    }

    @SerializedName("takeProfitOnFill") private TakeProfitDetails _takeProfitOnFill;
    public MarketOrder set_takeProfitOnFill(TakeProfitDetails __takeProfitOnFill) { 
        this._takeProfitOnFill = __takeProfitOnFill;
        return this;
    }
    /**
    * TakeProfitDetails specifies the details of a Take Profit Order to be
    * created on behalf of a client. This may happen when an Order is filled
    * that opens a Trade requiring a Take Profit, or when a Trade's dependent
    * Take Profit Order is modified directly through the Trade.
    */

    public TakeProfitDetails get_takeProfitOnFill() {
        return this._takeProfitOnFill;
    }

    @SerializedName("stopLossOnFill") private StopLossDetails _stopLossOnFill;
    public MarketOrder set_stopLossOnFill(StopLossDetails __stopLossOnFill) { 
        this._stopLossOnFill = __stopLossOnFill;
        return this;
    }
    /**
    * StopLossDetails specifies the details of a Stop Loss Order to be created
    * on behalf of a client. This may happen when an Order is filled that opens
    * a Trade requiring a Stop Loss, or when a Trade's dependent Stop Loss
    * Order is modified directly through the Trade.
    */

    public StopLossDetails get_stopLossOnFill() {
        return this._stopLossOnFill;
    }

    @SerializedName("trailingStopLossOnFill") private TrailingStopLossDetails _trailingStopLossOnFill;
    public MarketOrder set_trailingStopLossOnFill(TrailingStopLossDetails __trailingStopLossOnFill) { 
        this._trailingStopLossOnFill = __trailingStopLossOnFill;
        return this;
    }
    /**
    * TrailingStopLossDetails specifies the details of a Trailing Stop Loss
    * Order to be created on behalf of a client. This may happen when an Order
    * is filled that opens a Trade requiring a Trailing Stop Loss, or when a
    * Trade's dependent Trailing Stop Loss Order is modified directly through
    * the Trade.
    */

    public TrailingStopLossDetails get_trailingStopLossOnFill() {
        return this._trailingStopLossOnFill;
    }

    @SerializedName("tradeClientExtensions") private ClientExtensions _tradeClientExtensions;
    public MarketOrder set_tradeClientExtensions(ClientExtensions __tradeClientExtensions) { 
        this._tradeClientExtensions = __tradeClientExtensions;
        return this;
    }
    /**
    * Client Extensions to add to the Trade created when the Order is filled
    * (if such a Trade is created). Do not set, modify, or delete
    * tradeClientExtensions if your account is associated with MT4.
    */

    public ClientExtensions get_tradeClientExtensions() {
        return this._tradeClientExtensions;
    }

    @SerializedName("fillingTransactionID") private TransactionID _fillingTransactionID;
    public MarketOrder set_fillingTransactionID(String __fillingTransactionID) { 
        this._fillingTransactionID = new TransactionID(__fillingTransactionID); 
        return this;
    }
    /**
    * ID of the Transaction that filled this Order (only provided when the
    * Order's state is FILLED)
    */

    public String get_fillingTransactionID() {
        return this._fillingTransactionID.get_TransactionID();
    }

    @SerializedName("filledTime") private DateTime _filledTime;
    public MarketOrder set_filledTime(String __filledTime) { 
        this._filledTime = new DateTime(__filledTime); 
        return this;
    }
    /**
    * Date/time when the Order was filled (only provided when the Order's state
    * is FILLED)
    */

    public String get_filledTime() {
        return this._filledTime.get_DateTime();
    }

    @SerializedName("tradeOpenedID") private TradeID _tradeOpenedID;
    public MarketOrder set_tradeOpenedID(String __tradeOpenedID) { 
        this._tradeOpenedID = new TradeID(__tradeOpenedID); 
        return this;
    }
    /**
    * Trade ID of Trade opened when the Order was filled (only provided when
    * the Order's state is FILLED and a Trade was opened as a result of the
    * fill)
    */

    public String get_tradeOpenedID() {
        return this._tradeOpenedID.get_TradeID();
    }

    @SerializedName("tradeReducedID") private TradeID _tradeReducedID;
    public MarketOrder set_tradeReducedID(String __tradeReducedID) { 
        this._tradeReducedID = new TradeID(__tradeReducedID); 
        return this;
    }
    /**
    * Trade ID of Trade reduced when the Order was filled (only provided when
    * the Order's state is FILLED and a Trade was reduced as a result of the
    * fill)
    */

    public String get_tradeReducedID() {
        return this._tradeReducedID.get_TradeID();
    }
 
    @SerializedName("tradeClosedIDs") private TradeID[] _tradeClosedIDs;
    public MarketOrder set_tradeClosedIDs(TradeID[] __tradeClosedIDs) {
        this._tradeClosedIDs = __tradeClosedIDs;
        return this;
    }
    /**
    * Trade IDs of Trades closed when the Order was filled (only provided when
    * the Order's state is FILLED and one or more Trades were closed as a
    * result of the fill)
    */

    public TradeID[] get_tradeClosedIDs() {
        return this._tradeClosedIDs;
    }

    @SerializedName("cancellingTransactionID") private TransactionID _cancellingTransactionID;
    public MarketOrder set_cancellingTransactionID(String __cancellingTransactionID) { 
        this._cancellingTransactionID = new TransactionID(__cancellingTransactionID); 
        return this;
    }
    /**
    * ID of the Transaction that cancelled the Order (only provided when the
    * Order's state is CANCELLED)
    */

    public String get_cancellingTransactionID() {
        return this._cancellingTransactionID.get_TransactionID();
    }

    @SerializedName("cancelledTime") private DateTime _cancelledTime;
    public MarketOrder set_cancelledTime(String __cancelledTime) { 
        this._cancelledTime = new DateTime(__cancelledTime); 
        return this;
    }
    /**
    * Date/time when the Order was cancelled (only provided when the state of
    * the Order is CANCELLED)
    */

    public String get_cancelledTime() {
        return this._cancelledTime.get_DateTime();
    }
}
