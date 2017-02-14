package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A TakeProfitOrderRequest specifies the parameters that may be set when
* creating a Take Profit Order.
*/

public class TakeProfitOrderRequest implements OrderRequest {

    @SerializedName("type") private OrderType _type = OrderType.TAKE_PROFIT;
    /**
    * The type of the Order to Create. Must be set to "TAKE_PROFIT" when
    * creating a Take Profit Order.
    */

    public OrderType get_type() {
        return this._type;
    }

    @SerializedName("tradeID") private TradeID _tradeID;
    public TakeProfitOrderRequest set_tradeID(String __tradeID) { 
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
    public TakeProfitOrderRequest set_clientTradeID(String __clientTradeID) { 
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
    public TakeProfitOrderRequest set_price(double __price) { 
        this._price = new PriceValue(__price); 
        return this;
    }
    /**
    * The price threshold specified for the TakeProfit Order. The associated
    * Trade will be closed by a market price that is equal to or better than
    * this threshold.
    */

    public double get_price() {
        return this._price.get_PriceValue();
    }

    @SerializedName("timeInForce") private TimeInForce _timeInForce = TimeInForce.GTC;
    public TakeProfitOrderRequest set_timeInForce(TimeInForce __timeInForce) { 
        this._timeInForce = __timeInForce;
        return this;
    }
    /**
    * The time-in-force requested for the TakeProfit Order. Restricted to
    * "GTC", "GFD" and "GTD" for TakeProfit Orders.
    */

    public TimeInForce get_timeInForce() {
        return this._timeInForce;
    }

    @SerializedName("gtdTime") private DateTime _gtdTime;
    public TakeProfitOrderRequest set_gtdTime(String __gtdTime) { 
        this._gtdTime = new DateTime(__gtdTime); 
        return this;
    }
    /**
    * The date/time when the TakeProfit Order will be cancelled if its
    * timeInForce is "GTD".
    */

    public String get_gtdTime() {
        return this._gtdTime.get_DateTime();
    }

    @SerializedName("triggerCondition") private OrderTriggerCondition _triggerCondition = OrderTriggerCondition.DEFAULT;
    public TakeProfitOrderRequest set_triggerCondition(OrderTriggerCondition __triggerCondition) { 
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
    public TakeProfitOrderRequest set_clientExtensions(ClientExtensions __clientExtensions) { 
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
