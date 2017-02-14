package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* A MarketIfTouchedOrderRequest specifies the parameters that may be set when
* creating a Market-if-Touched Order.
*/

public class MarketIfTouchedOrderRequest implements OrderRequest {

    @SerializedName("type") private OrderType _type = OrderType.MARKET_IF_TOUCHED;
    /**
    * The type of the Order to Create. Must be set to "MARKET_IF_TOUCHED" when
    * creating a Market If Touched Order.
    */

    public OrderType get_type() {
        return this._type;
    }

    @SerializedName("instrument") private InstrumentName _instrument;
    public MarketIfTouchedOrderRequest set_instrument(String __instrument) { 
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
    public MarketIfTouchedOrderRequest set_units(double __units) { 
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
    public MarketIfTouchedOrderRequest set_price(double __price) { 
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
    public MarketIfTouchedOrderRequest set_priceBound(double __priceBound) { 
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
    public MarketIfTouchedOrderRequest set_timeInForce(TimeInForce __timeInForce) { 
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
    public MarketIfTouchedOrderRequest set_gtdTime(String __gtdTime) { 
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
    public MarketIfTouchedOrderRequest set_positionFill(OrderPositionFill __positionFill) { 
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
    public MarketIfTouchedOrderRequest set_triggerCondition(OrderTriggerCondition __triggerCondition) { 
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
    public MarketIfTouchedOrderRequest set_clientExtensions(ClientExtensions __clientExtensions) { 
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

    @SerializedName("takeProfitOnFill") private TakeProfitDetails _takeProfitOnFill;
    public MarketIfTouchedOrderRequest set_takeProfitOnFill(TakeProfitDetails __takeProfitOnFill) { 
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
    public MarketIfTouchedOrderRequest set_stopLossOnFill(StopLossDetails __stopLossOnFill) { 
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
    public MarketIfTouchedOrderRequest set_trailingStopLossOnFill(TrailingStopLossDetails __trailingStopLossOnFill) { 
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
    public MarketIfTouchedOrderRequest set_tradeClientExtensions(ClientExtensions __tradeClientExtensions) { 
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
}
