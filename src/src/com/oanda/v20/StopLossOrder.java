package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A StopLossOrder is an order that is linked to an open Trade and created with
* a price threshold. The Order will be filled (closing the Trade) by the first
* price that is equal to or worse than the threshold. A StopLossOrder cannot be
* used to open a new Position.
*/

public class StopLossOrder implements Order {

    @SerializedName("id") private OrderID _id;
    public StopLossOrder set_id(String __id) { 
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
    public StopLossOrder set_createTime(String __createTime) { 
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
    public StopLossOrder set_state(OrderState __state) { 
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
    public StopLossOrder set_clientExtensions(ClientExtensions __clientExtensions) { 
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

    @SerializedName("type") private OrderType _type = OrderType.STOP_LOSS;
    /**
    * The type of the Order. Always set to "STOP_LOSS" for Stop Loss Orders.
    */

    public OrderType get_type() {
        return this._type;
    }

    @SerializedName("tradeID") private TradeID _tradeID;
    public StopLossOrder set_tradeID(String __tradeID) { 
        this._tradeID = new TradeID(__tradeID); 
        return this;
    }
    /**
    * The ID of the Trade to close when the price threshold is breached.
    */

    public String get_tradeID() {
        return this._tradeID.get_TradeID();
    }

    @SerializedName("clientTradeID") private ClientID _clientTradeID;
    public StopLossOrder set_clientTradeID(String __clientTradeID) { 
        this._clientTradeID = new ClientID(__clientTradeID); 
        return this;
    }
    /**
    * The client ID of the Trade to be closed when the price threshold is
    * breached.
    */

    public String get_clientTradeID() {
        return this._clientTradeID.get_ClientID();
    }

    @SerializedName("price") private PriceValue _price;
    // Numeric stored as String
    public StopLossOrder set_price(double __price) { 
        this._price = new PriceValue(__price); 
        return this;
    }
    /**
    * The price threshold specified for the StopLoss Order. The associated
    * Trade will be closed by a market price that is equal to or worse than
    * this threshold.
    */

    public double get_price() {
        return this._price.get_PriceValue();
    }

    @SerializedName("timeInForce") private TimeInForce _timeInForce = TimeInForce.GTC;
    public StopLossOrder set_timeInForce(TimeInForce __timeInForce) { 
        this._timeInForce = __timeInForce;
        return this;
    }
    /**
    * The time-in-force requested for the StopLoss Order. Restricted to "GTC",
    * "GFD" and "GTD" for StopLoss Orders.
    */

    public TimeInForce get_timeInForce() {
        return this._timeInForce;
    }

    @SerializedName("gtdTime") private DateTime _gtdTime;
    public StopLossOrder set_gtdTime(String __gtdTime) { 
        this._gtdTime = new DateTime(__gtdTime); 
        return this;
    }
    /**
    * The date/time when the StopLoss Order will be cancelled if its
    * timeInForce is "GTD".
    */

    public String get_gtdTime() {
        return this._gtdTime.get_DateTime();
    }

    @SerializedName("triggerCondition") private OrderTriggerCondition _triggerCondition = OrderTriggerCondition.DEFAULT;
    public StopLossOrder set_triggerCondition(OrderTriggerCondition __triggerCondition) { 
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

    @SerializedName("fillingTransactionID") private TransactionID _fillingTransactionID;
    public StopLossOrder set_fillingTransactionID(String __fillingTransactionID) { 
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
    public StopLossOrder set_filledTime(String __filledTime) { 
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
    public StopLossOrder set_tradeOpenedID(String __tradeOpenedID) { 
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
    public StopLossOrder set_tradeReducedID(String __tradeReducedID) { 
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
    public StopLossOrder set_tradeClosedIDs(TradeID[] __tradeClosedIDs) {
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
    public StopLossOrder set_cancellingTransactionID(String __cancellingTransactionID) { 
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
    public StopLossOrder set_cancelledTime(String __cancelledTime) { 
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
    public StopLossOrder set_replacesOrderID(String __replacesOrderID) { 
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
    public StopLossOrder set_replacedByOrderID(String __replacedByOrderID) { 
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
