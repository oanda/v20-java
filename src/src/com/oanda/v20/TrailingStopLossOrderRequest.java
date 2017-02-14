package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A TrailingStopLossOrderRequest specifies the parameters that may be set when
* creating a Trailing Stop Loss Order.
*/

public class TrailingStopLossOrderRequest implements OrderRequest {

    @SerializedName("type") private OrderType _type = OrderType.TRAILING_STOP_LOSS;
    /**
    * The type of the Order to Create. Must be set to "TRAILING_STOP_LOSS" when
    * creating a Trailng Stop Loss Order.
    */

    public OrderType get_type() {
        return this._type;
    }

    @SerializedName("tradeID") private TradeID _tradeID;
    public TrailingStopLossOrderRequest set_tradeID(String __tradeID) { 
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
    public TrailingStopLossOrderRequest set_clientTradeID(String __clientTradeID) { 
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
    public TrailingStopLossOrderRequest set_distance(double __distance) { 
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
    public TrailingStopLossOrderRequest set_timeInForce(TimeInForce __timeInForce) { 
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
    public TrailingStopLossOrderRequest set_gtdTime(String __gtdTime) { 
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
    public TrailingStopLossOrderRequest set_triggerCondition(OrderTriggerCondition __triggerCondition) { 
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

    @SerializedName("clientExtensions") private ClientExtensions _clientExtensions;
    public TrailingStopLossOrderRequest set_clientExtensions(ClientExtensions __clientExtensions) { 
        this._clientExtensions = __clientExtensions;
        return this;
    }
    /**
    * The client extensions to add to the Order. Do not set, modify, or delete
    * clientExtensions if your account is associated with MT4.
    */

    public ClientExtensions get_clientExtensions() {
        return this._clientExtensions;
    }
}
