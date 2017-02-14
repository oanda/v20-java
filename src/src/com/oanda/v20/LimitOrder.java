package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A LimitOrder is an order that is created with a price threshold, and will
* only be filled by a price that is equal to or better than the threshold.
*/

public class LimitOrder implements Order {

    @SerializedName("id") private OrderID _id;
    public LimitOrder set_id(String __id) { 
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
    public LimitOrder set_createTime(String __createTime) { 
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
    public LimitOrder set_state(OrderState __state) { 
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
    public LimitOrder set_clientExtensions(ClientExtensions __clientExtensions) { 
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

    @SerializedName("type") private OrderType _type = OrderType.LIMIT;
    /**
    * The type of the Order. Always set to "LIMIT" for Limit Orders.
    */

    public OrderType get_type() {
        return this._type;
    }

    @SerializedName("instrument") private InstrumentName _instrument;
    public LimitOrder set_instrument(String __instrument) { 
        this._instrument = new InstrumentName(__instrument); 
        return this;
    }
    /**
    * The Limit Order's Instrument.
    */

    public String get_instrument() {
        return this._instrument.get_InstrumentName();
    }

    @SerializedName("units") private DecimalNumber _units;
    // Numeric stored as String
    public LimitOrder set_units(double __units) { 
        this._units = new DecimalNumber(__units); 
        return this;
    }
    /**
    * The quantity requested to be filled by the Limit Order. A posititive
    * number of units results in a long Order, and a negative number of units
    * results in a short Order.
    */

    public double get_units() {
        return this._units.get_DecimalNumber();
    }

    @SerializedName("price") private PriceValue _price;
    // Numeric stored as String
    public LimitOrder set_price(double __price) { 
        this._price = new PriceValue(__price); 
        return this;
    }
    /**
    * The price threshold specified for the Limit Order. The Limit Order will
    * only be filled by a market price that is equal to or better than this
    * price.
    */

    public double get_price() {
        return this._price.get_PriceValue();
    }

    @SerializedName("timeInForce") private TimeInForce _timeInForce = TimeInForce.GTC;
    public LimitOrder set_timeInForce(TimeInForce __timeInForce) { 
        this._timeInForce = __timeInForce;
        return this;
    }
    /**
    * The time-in-force requested for the Limit Order.
    */

    public TimeInForce get_timeInForce() {
        return this._timeInForce;
    }

    @SerializedName("gtdTime") private DateTime _gtdTime;
    public LimitOrder set_gtdTime(String __gtdTime) { 
        this._gtdTime = new DateTime(__gtdTime); 
        return this;
    }
    /**
    * The date/time when the Limit Order will be cancelled if its timeInForce
    * is "GTD".
    */

    public String get_gtdTime() {
        return this._gtdTime.get_DateTime();
    }

    @SerializedName("positionFill") private OrderPositionFill _positionFill = OrderPositionFill.DEFAULT;
    public LimitOrder set_positionFill(OrderPositionFill __positionFill) { 
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

    @SerializedName("triggerCondition") private OrderTriggerCondition _triggerCondition = OrderTriggerCondition.DEFAULT;
    public LimitOrder set_triggerCondition(OrderTriggerCondition __triggerCondition) { 
        this._triggerCondition = __triggerCondition;
        return this;
    }
    /**
    * Specification of what component of a price should be used for comparison
    * when determining if the Order should be filled.
    */

    public OrderTriggerCondition get_triggerCondition() {
        return this._triggerCondition;
    }

    @SerializedName("takeProfitOnFill") private TakeProfitDetails _takeProfitOnFill;
    public LimitOrder set_takeProfitOnFill(TakeProfitDetails __takeProfitOnFill) { 
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
    public LimitOrder set_stopLossOnFill(StopLossDetails __stopLossOnFill) { 
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
    public LimitOrder set_trailingStopLossOnFill(TrailingStopLossDetails __trailingStopLossOnFill) { 
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
    public LimitOrder set_tradeClientExtensions(ClientExtensions __tradeClientExtensions) { 
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
    public LimitOrder set_fillingTransactionID(String __fillingTransactionID) { 
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
    public LimitOrder set_filledTime(String __filledTime) { 
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
    public LimitOrder set_tradeOpenedID(String __tradeOpenedID) { 
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
    public LimitOrder set_tradeReducedID(String __tradeReducedID) { 
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
    public LimitOrder set_tradeClosedIDs(TradeID[] __tradeClosedIDs) {
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
    public LimitOrder set_cancellingTransactionID(String __cancellingTransactionID) { 
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
    public LimitOrder set_cancelledTime(String __cancelledTime) { 
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

    @SerializedName("replacesOrderID") private OrderID _replacesOrderID;
    public LimitOrder set_replacesOrderID(String __replacesOrderID) { 
        this._replacesOrderID = new OrderID(__replacesOrderID); 
        return this;
    }
    /**
    * The ID of the Order that was replaced by this Order (only provided if
    * this Order was created as part of a cancel/replace).
    */

    public String get_replacesOrderID() {
        return this._replacesOrderID.get_OrderID();
    }

    @SerializedName("replacedByOrderID") private OrderID _replacedByOrderID;
    public LimitOrder set_replacedByOrderID(String __replacedByOrderID) { 
        this._replacedByOrderID = new OrderID(__replacedByOrderID); 
        return this;
    }
    /**
    * The ID of the Order that replaced this Order (only provided if this Order
    * was cancelled as part of a cancel/replace).
    */

    public String get_replacedByOrderID() {
        return this._replacedByOrderID.get_OrderID();
    }
}
