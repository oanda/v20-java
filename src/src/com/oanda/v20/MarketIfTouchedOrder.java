package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A MarketIfTouchedOrder is an order that is created with a price threshold,
* and will only be filled by a market price that is touches or crosses the
* threshold.
*/

public class MarketIfTouchedOrder implements Order {

    @SerializedName("id") private OrderID _id;
    public MarketIfTouchedOrder set_id(String __id) { 
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
    public MarketIfTouchedOrder set_createTime(String __createTime) { 
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
    public MarketIfTouchedOrder set_state(OrderState __state) { 
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
    public MarketIfTouchedOrder set_clientExtensions(ClientExtensions __clientExtensions) { 
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

    @SerializedName("type") private OrderType _type = OrderType.MARKET_IF_TOUCHED;
    /**
    * The type of the Order. Always set to "MARKET_IF_TOUCHED" for Market If
    * Touched Orders.
    */

    public OrderType get_type() {
        return this._type;
    }

    @SerializedName("instrument") private InstrumentName _instrument;
    public MarketIfTouchedOrder set_instrument(String __instrument) { 
        this._instrument = new InstrumentName(__instrument); 
        return this;
    }
    /**
    * The MarketIfTouched Order's Instrument.
    */

    public String get_instrument() {
        return this._instrument.get_InstrumentName();
    }

    @SerializedName("units") private DecimalNumber _units;
    // Numeric stored as String
    public MarketIfTouchedOrder set_units(double __units) { 
        this._units = new DecimalNumber(__units); 
        return this;
    }
    /**
    * The quantity requested to be filled by the MarketIfTouched Order. A
    * posititive number of units results in a long Order, and a negative number
    * of units results in a short Order.
    */

    public double get_units() {
        return this._units.get_DecimalNumber();
    }

    @SerializedName("price") private PriceValue _price;
    // Numeric stored as String
    public MarketIfTouchedOrder set_price(double __price) { 
        this._price = new PriceValue(__price); 
        return this;
    }
    /**
    * The price threshold specified for the MarketIfTouched Order. The
    * MarketIfTouched Order will only be filled by a market price that crosses
    * this price from the direction of the market price at the time when the
    * Order was created (the initialMarketPrice). Depending on the value of the
    * Order's price and initialMarketPrice, the MarketIfTouchedOrder will
    * behave like a Limit or a Stop Order.
    */

    public double get_price() {
        return this._price.get_PriceValue();
    }

    @SerializedName("priceBound") private PriceValue _priceBound;
    // Numeric stored as String
    public MarketIfTouchedOrder set_priceBound(double __priceBound) { 
        this._priceBound = new PriceValue(__priceBound); 
        return this;
    }
    /**
    * The worst market price that may be used to fill this MarketIfTouched
    * Order.
    */

    public double get_priceBound() {
        return this._priceBound.get_PriceValue();
    }

    @SerializedName("timeInForce") private TimeInForce _timeInForce = TimeInForce.GTC;
    public MarketIfTouchedOrder set_timeInForce(TimeInForce __timeInForce) { 
        this._timeInForce = __timeInForce;
        return this;
    }
    /**
    * The time-in-force requested for the MarketIfTouched Order. Restricted to
    * "GTC", "GFD" and "GTD" for MarketIfTouched Orders.
    */

    public TimeInForce get_timeInForce() {
        return this._timeInForce;
    }

    @SerializedName("gtdTime") private DateTime _gtdTime;
    public MarketIfTouchedOrder set_gtdTime(String __gtdTime) { 
        this._gtdTime = new DateTime(__gtdTime); 
        return this;
    }
    /**
    * The date/time when the MarketIfTouched Order will be cancelled if its
    * timeInForce is "GTD".
    */

    public String get_gtdTime() {
        return this._gtdTime.get_DateTime();
    }

    @SerializedName("positionFill") private OrderPositionFill _positionFill = OrderPositionFill.DEFAULT;
    public MarketIfTouchedOrder set_positionFill(OrderPositionFill __positionFill) { 
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
    public MarketIfTouchedOrder set_triggerCondition(OrderTriggerCondition __triggerCondition) { 
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

    @SerializedName("initialMarketPrice") private PriceValue _initialMarketPrice;
    // Numeric stored as String
    public MarketIfTouchedOrder set_initialMarketPrice(double __initialMarketPrice) { 
        this._initialMarketPrice = new PriceValue(__initialMarketPrice); 
        return this;
    }
    /**
    * The Market price at the time when the MarketIfTouched Order was created.
    */

    public double get_initialMarketPrice() {
        return this._initialMarketPrice.get_PriceValue();
    }

    @SerializedName("takeProfitOnFill") private TakeProfitDetails _takeProfitOnFill;
    public MarketIfTouchedOrder set_takeProfitOnFill(TakeProfitDetails __takeProfitOnFill) { 
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
    public MarketIfTouchedOrder set_stopLossOnFill(StopLossDetails __stopLossOnFill) { 
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
    public MarketIfTouchedOrder set_trailingStopLossOnFill(TrailingStopLossDetails __trailingStopLossOnFill) { 
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
    public MarketIfTouchedOrder set_tradeClientExtensions(ClientExtensions __tradeClientExtensions) { 
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
    public MarketIfTouchedOrder set_fillingTransactionID(String __fillingTransactionID) { 
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
    public MarketIfTouchedOrder set_filledTime(String __filledTime) { 
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
    public MarketIfTouchedOrder set_tradeOpenedID(String __tradeOpenedID) { 
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
    public MarketIfTouchedOrder set_tradeReducedID(String __tradeReducedID) { 
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
    public MarketIfTouchedOrder set_tradeClosedIDs(TradeID[] __tradeClosedIDs) {
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
    public MarketIfTouchedOrder set_cancellingTransactionID(String __cancellingTransactionID) { 
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
    public MarketIfTouchedOrder set_cancelledTime(String __cancelledTime) { 
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
    public MarketIfTouchedOrder set_replacesOrderID(String __replacesOrderID) { 
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
    public MarketIfTouchedOrder set_replacedByOrderID(String __replacedByOrderID) { 
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
