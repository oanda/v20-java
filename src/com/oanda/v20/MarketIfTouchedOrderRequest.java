package com.oanda.v20;

import com.oanda.v20.OrderType;
import com.oanda.v20.TimeInForce;
import com.oanda.v20.OrderPositionFill;
import com.oanda.v20.OrderTriggerCondition;
import com.google.gson.annotations.SerializedName;

/**
 * A MarketIfTouchedOrderRequest specifies the parameters that may be set when
 * creating a Market-if-Touched Order.
 * <p>
 * {units} units of {instrument} @ {price}
 */
public class MarketIfTouchedOrderRequest implements OrderRequest {

    @SerializedName("type") private OrderType type = OrderType.MARKET_IF_TOUCHED;

    /**
     * Get the Type
     * <p>
     * The type of the Order to Create. Must be set to "MARKET_IF_TOUCHED" when
     * creating a Market If Touched Order.
     * <p>
     * @return the Type
     * @see OrderType
     */
    public OrderType getType() {
        return this.type;
    }

    @SerializedName("instrument") private InstrumentName instrument;

    /**
     * Set the Instrument
     * <p>
     * The MarketIfTouched Order's Instrument.
     * <p>
     * @param instrument the Instrument
     * @return {@link MarketIfTouchedOrderRequest MarketIfTouchedOrderRequest}
     * @see InstrumentName
     */
    public MarketIfTouchedOrderRequest setInstrument(String instrument) {
        this.instrument = new InstrumentName(instrument);
        return this;
    }

    /**
     * Get the Instrument
     * <p>
     * The MarketIfTouched Order's Instrument.
     * <p>
     * @return the Instrument
     * @see InstrumentName
     */
    public String getInstrument() {
        return this.instrument.getInstrumentName();
    }

    @SerializedName("units") private DecimalNumber units;

    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the MarketIfTouched Order. A
     * posititive number of units results in a long Order, and a negative
     * number of units results in a short Order.
     * <p>
     * @param units the Amount
     * @return {@link MarketIfTouchedOrderRequest MarketIfTouchedOrderRequest}
     * @see DecimalNumber
     */
    public MarketIfTouchedOrderRequest setUnits(double units) {
        this.units = new DecimalNumber(units);
        return this;
    }

    /**
     * Get the Amount
     * <p>
     * The quantity requested to be filled by the MarketIfTouched Order. A
     * posititive number of units results in a long Order, and a negative
     * number of units results in a short Order.
     * <p>
     * @return the Amount
     * @see DecimalNumber
     */
    public double getUnits() {
        return this.units.getDecimalNumber();
    }

    @SerializedName("price") private PriceValue price;

    /**
     * Set the Price
     * <p>
     * The price threshold specified for the MarketIfTouched Order. The
     * MarketIfTouched Order will only be filled by a market price that crosses
     * this price from the direction of the market price at the time when the
     * Order was created (the initialMarketPrice). Depending on the value of
     * the Order's price and initialMarketPrice, the MarketIfTouchedOrder will
     * behave like a Limit or a Stop Order.
     * <p>
     * @param price the Price
     * @return {@link MarketIfTouchedOrderRequest MarketIfTouchedOrderRequest}
     * @see PriceValue
     */
    public MarketIfTouchedOrderRequest setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }

    /**
     * Get the Price
     * <p>
     * The price threshold specified for the MarketIfTouched Order. The
     * MarketIfTouched Order will only be filled by a market price that crosses
     * this price from the direction of the market price at the time when the
     * Order was created (the initialMarketPrice). Depending on the value of
     * the Order's price and initialMarketPrice, the MarketIfTouchedOrder will
     * behave like a Limit or a Stop Order.
     * <p>
     * @return the Price
     * @see PriceValue
     */
    public double getPrice() {
        return this.price.getPriceValue();
    }

    @SerializedName("priceBound") private PriceValue priceBound;

    /**
     * Set the Price Value
     * <p>
     * The worst market price that may be used to fill this MarketIfTouched
     * Order.
     * <p>
     * @param priceBound the Price Value
     * @return {@link MarketIfTouchedOrderRequest MarketIfTouchedOrderRequest}
     * @see PriceValue
     */
    public MarketIfTouchedOrderRequest setPriceBound(double priceBound) {
        this.priceBound = new PriceValue(priceBound);
        return this;
    }

    /**
     * Get the Price Value
     * <p>
     * The worst market price that may be used to fill this MarketIfTouched
     * Order.
     * <p>
     * @return the Price Value
     * @see PriceValue
     */
    public double getPriceBound() {
        return this.priceBound.getPriceValue();
    }

    @SerializedName("timeInForce") private TimeInForce timeInForce = TimeInForce.GTC;

    /**
     * Set the Time In Force
     * <p>
     * The time-in-force requested for the MarketIfTouched Order. Restricted to
     * "GTC", "GFD" and "GTD" for MarketIfTouched Orders.
     * <p>
     * @param timeInForce the Time In Force
     * @return {@link MarketIfTouchedOrderRequest MarketIfTouchedOrderRequest}
     * @see TimeInForce
     */
    public MarketIfTouchedOrderRequest setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

    /**
     * Get the Time In Force
     * <p>
     * The time-in-force requested for the MarketIfTouched Order. Restricted to
     * "GTC", "GFD" and "GTD" for MarketIfTouched Orders.
     * <p>
     * @return the Time In Force
     * @see TimeInForce
     */
    public TimeInForce getTimeInForce() {
        return this.timeInForce;
    }

    @SerializedName("gtdTime") private DateTime gtdTime;

    /**
     * Set the GTD Time
     * <p>
     * The date/time when the MarketIfTouched Order will be cancelled if its
     * timeInForce is "GTD".
     * <p>
     * @param gtdTime the GTD Time
     * @return {@link MarketIfTouchedOrderRequest MarketIfTouchedOrderRequest}
     * @see DateTime
     */
    public MarketIfTouchedOrderRequest setGtdTime(String gtdTime) {
        this.gtdTime = new DateTime(gtdTime);
        return this;
    }

    /**
     * Get the GTD Time
     * <p>
     * The date/time when the MarketIfTouched Order will be cancelled if its
     * timeInForce is "GTD".
     * <p>
     * @return the GTD Time
     * @see DateTime
     */
    public String getGtdTime() {
        return this.gtdTime.getDateTime();
    }

    @SerializedName("positionFill") private OrderPositionFill positionFill = OrderPositionFill.DEFAULT;

    /**
     * Set the Position Fill
     * <p>
     * Specification of how Positions in the Account are modified when the
     * Order is filled.
     * <p>
     * @param positionFill the Position Fill
     * @return {@link MarketIfTouchedOrderRequest MarketIfTouchedOrderRequest}
     * @see OrderPositionFill
     */
    public MarketIfTouchedOrderRequest setPositionFill(OrderPositionFill positionFill) {
        this.positionFill = positionFill;
        return this;
    }

    /**
     * Get the Position Fill
     * <p>
     * Specification of how Positions in the Account are modified when the
     * Order is filled.
     * <p>
     * @return the Position Fill
     * @see OrderPositionFill
     */
    public OrderPositionFill getPositionFill() {
        return this.positionFill;
    }

    @SerializedName("triggerCondition") private OrderTriggerCondition triggerCondition = OrderTriggerCondition.DEFAULT;

    /**
     * Set the Trigger Condition
     * <p>
     * Specification of what component of a price should be used for comparison
     * when determining if the Order should be filled.
     * <p>
     * @param triggerCondition the Trigger Condition
     * @return {@link MarketIfTouchedOrderRequest MarketIfTouchedOrderRequest}
     * @see OrderTriggerCondition
     */
    public MarketIfTouchedOrderRequest setTriggerCondition(OrderTriggerCondition triggerCondition) {
        this.triggerCondition = triggerCondition;
        return this;
    }

    /**
     * Get the Trigger Condition
     * <p>
     * Specification of what component of a price should be used for comparison
     * when determining if the Order should be filled.
     * <p>
     * @return the Trigger Condition
     * @see OrderTriggerCondition
     */
    public OrderTriggerCondition getTriggerCondition() {
        return this.triggerCondition;
    }

    @SerializedName("clientExtensions") private ClientExtensions clientExtensions;

    /**
     * Set the Client Extensions
     * <p>
     * The client extensions to add to the Order. Do not set, modify, or delete
     * clientExtensions if your account is associated with MT4.
     * <p>
     * @param clientExtensions the Client Extensions
     * @return {@link MarketIfTouchedOrderRequest MarketIfTouchedOrderRequest}
     * @see ClientExtensions
     */
    public MarketIfTouchedOrderRequest setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

    /**
     * Get the Client Extensions
     * <p>
     * The client extensions to add to the Order. Do not set, modify, or delete
     * clientExtensions if your account is associated with MT4.
     * <p>
     * @return the Client Extensions
     * @see ClientExtensions
     */
    public ClientExtensions getClientExtensions() {
        return this.clientExtensions;
    }

    @SerializedName("takeProfitOnFill") private TakeProfitDetails takeProfitOnFill;

    /**
     * Set the Take Profit On Fill
     * <p>
     * TakeProfitDetails specifies the details of a Take Profit Order to be
     * created on behalf of a client. This may happen when an Order is filled
     * that opens a Trade requiring a Take Profit, or when a Trade's dependent
     * Take Profit Order is modified directly through the Trade.
     * <p>
     * @param takeProfitOnFill the Take Profit On Fill
     * @return {@link MarketIfTouchedOrderRequest MarketIfTouchedOrderRequest}
     * @see TakeProfitDetails
     */
    public MarketIfTouchedOrderRequest setTakeProfitOnFill(TakeProfitDetails takeProfitOnFill) {
        this.takeProfitOnFill = takeProfitOnFill;
        return this;
    }

    /**
     * Get the Take Profit On Fill
     * <p>
     * TakeProfitDetails specifies the details of a Take Profit Order to be
     * created on behalf of a client. This may happen when an Order is filled
     * that opens a Trade requiring a Take Profit, or when a Trade's dependent
     * Take Profit Order is modified directly through the Trade.
     * <p>
     * @return the Take Profit On Fill
     * @see TakeProfitDetails
     */
    public TakeProfitDetails getTakeProfitOnFill() {
        return this.takeProfitOnFill;
    }

    @SerializedName("stopLossOnFill") private StopLossDetails stopLossOnFill;

    /**
     * Set the Stop Loss On Fill
     * <p>
     * StopLossDetails specifies the details of a Stop Loss Order to be created
     * on behalf of a client. This may happen when an Order is filled that
     * opens a Trade requiring a Stop Loss, or when a Trade's dependent Stop
     * Loss Order is modified directly through the Trade.
     * <p>
     * @param stopLossOnFill the Stop Loss On Fill
     * @return {@link MarketIfTouchedOrderRequest MarketIfTouchedOrderRequest}
     * @see StopLossDetails
     */
    public MarketIfTouchedOrderRequest setStopLossOnFill(StopLossDetails stopLossOnFill) {
        this.stopLossOnFill = stopLossOnFill;
        return this;
    }

    /**
     * Get the Stop Loss On Fill
     * <p>
     * StopLossDetails specifies the details of a Stop Loss Order to be created
     * on behalf of a client. This may happen when an Order is filled that
     * opens a Trade requiring a Stop Loss, or when a Trade's dependent Stop
     * Loss Order is modified directly through the Trade.
     * <p>
     * @return the Stop Loss On Fill
     * @see StopLossDetails
     */
    public StopLossDetails getStopLossOnFill() {
        return this.stopLossOnFill;
    }

    @SerializedName("trailingStopLossOnFill") private TrailingStopLossDetails trailingStopLossOnFill;

    /**
     * Set the Trailing Stop Loss On Fill
     * <p>
     * TrailingStopLossDetails specifies the details of a Trailing Stop Loss
     * Order to be created on behalf of a client. This may happen when an Order
     * is filled that opens a Trade requiring a Trailing Stop Loss, or when a
     * Trade's dependent Trailing Stop Loss Order is modified directly through
     * the Trade.
     * <p>
     * @param trailingStopLossOnFill the Trailing Stop Loss On Fill
     * @return {@link MarketIfTouchedOrderRequest MarketIfTouchedOrderRequest}
     * @see TrailingStopLossDetails
     */
    public MarketIfTouchedOrderRequest setTrailingStopLossOnFill(TrailingStopLossDetails trailingStopLossOnFill) {
        this.trailingStopLossOnFill = trailingStopLossOnFill;
        return this;
    }

    /**
     * Get the Trailing Stop Loss On Fill
     * <p>
     * TrailingStopLossDetails specifies the details of a Trailing Stop Loss
     * Order to be created on behalf of a client. This may happen when an Order
     * is filled that opens a Trade requiring a Trailing Stop Loss, or when a
     * Trade's dependent Trailing Stop Loss Order is modified directly through
     * the Trade.
     * <p>
     * @return the Trailing Stop Loss On Fill
     * @see TrailingStopLossDetails
     */
    public TrailingStopLossDetails getTrailingStopLossOnFill() {
        return this.trailingStopLossOnFill;
    }

    @SerializedName("tradeClientExtensions") private ClientExtensions tradeClientExtensions;

    /**
     * Set the Trade Client Extensions
     * <p>
     * Client Extensions to add to the Trade created when the Order is filled
     * (if such a Trade is created). Do not set, modify, or delete
     * tradeClientExtensions if your account is associated with MT4.
     * <p>
     * @param tradeClientExtensions the Trade Client Extensions
     * @return {@link MarketIfTouchedOrderRequest MarketIfTouchedOrderRequest}
     * @see ClientExtensions
     */
    public MarketIfTouchedOrderRequest setTradeClientExtensions(ClientExtensions tradeClientExtensions) {
        this.tradeClientExtensions = tradeClientExtensions;
        return this;
    }

    /**
     * Get the Trade Client Extensions
     * <p>
     * Client Extensions to add to the Trade created when the Order is filled
     * (if such a Trade is created). Do not set, modify, or delete
     * tradeClientExtensions if your account is associated with MT4.
     * <p>
     * @return the Trade Client Extensions
     * @see ClientExtensions
     */
    public ClientExtensions getTradeClientExtensions() {
        return this.tradeClientExtensions;
    }
}
