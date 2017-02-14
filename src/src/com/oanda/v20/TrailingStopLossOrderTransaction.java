package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A TrailingStopLossOrderTransaction represents the creation of a
* TrailingStopLoss Order in the user's Account.
*/

public class TrailingStopLossOrderTransaction implements Transaction {

    @SerializedName("id") private TransactionID _id;
    public TrailingStopLossOrderTransaction set_id(String __id) { 
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
    public TrailingStopLossOrderTransaction set_time(String __time) { 
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
    public TrailingStopLossOrderTransaction set_userID(int __userID) {
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
    public TrailingStopLossOrderTransaction set_accountID(String __accountID) { 
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
    public TrailingStopLossOrderTransaction set_batchID(String __batchID) { 
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
    public TrailingStopLossOrderTransaction set_requestID(String __requestID) { 
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

    @SerializedName("type") private TransactionType _type = TransactionType.TRAILING_STOP_LOSS_ORDER;
    /**
    * The Type of the Transaction. Always set to "TRAILING_STOP_LOSS_ORDER" in
    * a TrailingStopLossOrderTransaction.
    */

    public TransactionType get_type() {
        return this._type;
    }

    @SerializedName("tradeID") private TradeID _tradeID;
    public TrailingStopLossOrderTransaction set_tradeID(String __tradeID) { 
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
    public TrailingStopLossOrderTransaction set_clientTradeID(String __clientTradeID) { 
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

    @SerializedName("distance") private PriceValue _distance;
    // Numeric stored as String
    public TrailingStopLossOrderTransaction set_distance(double __distance) { 
        this._distance = new PriceValue(__distance); 
        return this;
    }
    /**
    * The price distance specified for the TrailingStopLoss Order.
    */

    public double get_distance() {
        return this._distance.get_PriceValue();
    }

    @SerializedName("timeInForce") private TimeInForce _timeInForce = TimeInForce.GTC;
    public TrailingStopLossOrderTransaction set_timeInForce(TimeInForce __timeInForce) { 
        this._timeInForce = __timeInForce;
        return this;
    }
    /**
    * The time-in-force requested for the TrailingStopLoss Order. Restricted to
    * "GTC", "GFD" and "GTD" for TrailingStopLoss Orders.
    */

    public TimeInForce get_timeInForce() {
        return this._timeInForce;
    }

    @SerializedName("gtdTime") private DateTime _gtdTime;
    public TrailingStopLossOrderTransaction set_gtdTime(String __gtdTime) { 
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
    public TrailingStopLossOrderTransaction set_triggerCondition(OrderTriggerCondition __triggerCondition) { 
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

    @SerializedName("reason") private TrailingStopLossOrderReason _reason;
    public TrailingStopLossOrderTransaction set_reason(TrailingStopLossOrderReason __reason) { 
        this._reason = __reason;
        return this;
    }
    /**
    * The reason that the Trailing Stop Loss Order was initiated
    */

    public TrailingStopLossOrderReason get_reason() {
        return this._reason;
    }

    @SerializedName("clientExtensions") private ClientExtensions _clientExtensions;
    public TrailingStopLossOrderTransaction set_clientExtensions(ClientExtensions __clientExtensions) { 
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

    @SerializedName("orderFillTransactionID") private TransactionID _orderFillTransactionID;
    public TrailingStopLossOrderTransaction set_orderFillTransactionID(String __orderFillTransactionID) { 
        this._orderFillTransactionID = new TransactionID(__orderFillTransactionID); 
        return this;
    }
    /**
    * The ID of the OrderFill Transaction that caused this Order to be created
    * (only provided if this Order was created automatically when another Order
    * was filled).
    */

    public String get_orderFillTransactionID() {
        return this._orderFillTransactionID.get_TransactionID();
    }

    @SerializedName("replacesOrderID") private OrderID _replacesOrderID;
    public TrailingStopLossOrderTransaction set_replacesOrderID(String __replacesOrderID) { 
        this._replacesOrderID = new OrderID(__replacesOrderID); 
        return this;
    }
    /**
    * The ID of the Order that this Order replaces (only provided if this Order
    * replaces an existing Order).
    */

    public String get_replacesOrderID() {
        return this._replacesOrderID.get_OrderID();
    }

    @SerializedName("cancellingTransactionID") private TransactionID _cancellingTransactionID;
    public TrailingStopLossOrderTransaction set_cancellingTransactionID(String __cancellingTransactionID) { 
        this._cancellingTransactionID = new TransactionID(__cancellingTransactionID); 
        return this;
    }
    /**
    * The ID of the Transaction that cancels the replaced Order (only provided
    * if this Order replaces an existing Order).
    */

    public String get_cancellingTransactionID() {
        return this._cancellingTransactionID.get_TransactionID();
    }
}
