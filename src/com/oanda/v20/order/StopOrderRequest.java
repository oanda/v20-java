package com.oanda.v20.order;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.pricing_common.PriceValue;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.primitives.DecimalNumber;
import com.oanda.v20.primitives.InstrumentName;
import com.oanda.v20.transaction.ClientExtensions;
import com.oanda.v20.transaction.StopLossDetails;
import com.oanda.v20.transaction.TakeProfitDetails;
import com.oanda.v20.transaction.TrailingStopLossDetails;

/**
 * A StopOrderRequest specifies the parameters that may be set when creating a
 * Stop Order.
 * <p>
 * {units} units of {instrument} @ {price}
 */
public class StopOrderRequest implements OrderRequest {

    /**
     * Default constructor.
     */
    public StopOrderRequest() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the StopOrderRequest to copy
     */
    public StopOrderRequest(StopOrderRequest other) {
        this.type = other.type;
        this.instrument = other.instrument;
        this.units = other.units;
        this.price = other.price;
        this.priceBound = other.priceBound;
        this.timeInForce = other.timeInForce;
        this.gtdTime = other.gtdTime;
        this.positionFill = other.positionFill;
        this.triggerCondition = other.triggerCondition;
        if (other.clientExtensions != null)
        {
            this.clientExtensions = new ClientExtensions(other.clientExtensions);
        }
        if (other.takeProfitOnFill != null)
        {
            this.takeProfitOnFill = new TakeProfitDetails(other.takeProfitOnFill);
        }
        if (other.stopLossOnFill != null)
        {
            this.stopLossOnFill = new StopLossDetails(other.stopLossOnFill);
        }
        if (other.trailingStopLossOnFill != null)
        {
            this.trailingStopLossOnFill = new TrailingStopLossDetails(other.trailingStopLossOnFill);
        }
        if (other.tradeClientExtensions != null)
        {
            this.tradeClientExtensions = new ClientExtensions(other.tradeClientExtensions);
        }
    }

    @SerializedName("type") private OrderType type = OrderType.STOP;

    /**
     * Get the Type
     * <p>
     * The type of the Order to Create. Must be set to "STOP" when creating a
     * Stop Order.
     * <p>
     * @return the Type
     * @see OrderType
     */
    public OrderType getType() {
        return this.type;
    }

    /**
     * Set the Type
     * <p>
     * The type of the Order to Create. Must be set to "STOP" when creating a
     * Stop Order.
     * <p>
     * @param type the Type as an OrderType
     * @return {@link StopOrderRequest StopOrderRequest}
     * @see OrderType
     */
    public StopOrderRequest setType(OrderType type) {
        this.type = type;
        return this;
    }

    @SerializedName("instrument") private InstrumentName instrument;

    /**
     * Get the Instrument
     * <p>
     * The Stop Order's Instrument.
     * <p>
     * @return the Instrument
     * @see InstrumentName
     */
    public InstrumentName getInstrument() {
        return this.instrument;
    }

    /**
     * Set the Instrument
     * <p>
     * The Stop Order's Instrument.
     * <p>
     * @param instrument the Instrument as an InstrumentName
     * @return {@link StopOrderRequest StopOrderRequest}
     * @see InstrumentName
     */
    public StopOrderRequest setInstrument(InstrumentName instrument) {
        this.instrument = instrument;
        return this;
    }
    /**
     * Set the Instrument
     * <p>
     * The Stop Order's Instrument.
     * <p>
     * @param instrument the Instrument as a String
     * @return {@link StopOrderRequest StopOrderRequest}
     * @see InstrumentName
     */
    public StopOrderRequest setInstrument(String instrument) {
        this.instrument = new InstrumentName(instrument);
        return this;
    }

    @SerializedName("units") private DecimalNumber units;

    /**
     * Get the Amount
     * <p>
     * The quantity requested to be filled by the Stop Order. A posititive
     * number of units results in a long Order, and a negative number of units
     * results in a short Order.
     * <p>
     * @return the Amount
     * @see DecimalNumber
     */
    public DecimalNumber getUnits() {
        return this.units;
    }

    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the Stop Order. A posititive
     * number of units results in a long Order, and a negative number of units
     * results in a short Order.
     * <p>
     * @param units the Amount as a DecimalNumber
     * @return {@link StopOrderRequest StopOrderRequest}
     * @see DecimalNumber
     */
    public StopOrderRequest setUnits(DecimalNumber units) {
        this.units = units;
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the Stop Order. A posititive
     * number of units results in a long Order, and a negative number of units
     * results in a short Order.
     * <p>
     * @param units the Amount as a String
     * @return {@link StopOrderRequest StopOrderRequest}
     * @see DecimalNumber
     */
    public StopOrderRequest setUnits(String units) {
        this.units = new DecimalNumber(units);
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the Stop Order. A posititive
     * number of units results in a long Order, and a negative number of units
     * results in a short Order.
     * <p>
     * @param units the Amount as a double
     * @return {@link StopOrderRequest StopOrderRequest}
     * @see DecimalNumber
     */
    public StopOrderRequest setUnits(double units) {
        this.units = new DecimalNumber(units);
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the Stop Order. A posititive
     * number of units results in a long Order, and a negative number of units
     * results in a short Order.
     * <p>
     * @param units the Amount as a BigDecimal
     * @return {@link StopOrderRequest StopOrderRequest}
     * @see DecimalNumber
     */
    public StopOrderRequest setUnits(BigDecimal units) {
        this.units = new DecimalNumber(units);
        return this;
    }

    @SerializedName("price") private PriceValue price;

    /**
     * Get the Price
     * <p>
     * The price threshold specified for the Stop Order. The Stop Order will
     * only be filled by a market price that is equal to or worse than this
     * price.
     * <p>
     * @return the Price
     * @see PriceValue
     */
    public PriceValue getPrice() {
        return this.price;
    }

    /**
     * Set the Price
     * <p>
     * The price threshold specified for the Stop Order. The Stop Order will
     * only be filled by a market price that is equal to or worse than this
     * price.
     * <p>
     * @param price the Price as a PriceValue
     * @return {@link StopOrderRequest StopOrderRequest}
     * @see PriceValue
     */
    public StopOrderRequest setPrice(PriceValue price) {
        this.price = price;
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price threshold specified for the Stop Order. The Stop Order will
     * only be filled by a market price that is equal to or worse than this
     * price.
     * <p>
     * @param price the Price as a String
     * @return {@link StopOrderRequest StopOrderRequest}
     * @see PriceValue
     */
    public StopOrderRequest setPrice(String price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price threshold specified for the Stop Order. The Stop Order will
     * only be filled by a market price that is equal to or worse than this
     * price.
     * <p>
     * @param price the Price as a double
     * @return {@link StopOrderRequest StopOrderRequest}
     * @see PriceValue
     */
    public StopOrderRequest setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price threshold specified for the Stop Order. The Stop Order will
     * only be filled by a market price that is equal to or worse than this
     * price.
     * <p>
     * @param price the Price as a BigDecimal
     * @return {@link StopOrderRequest StopOrderRequest}
     * @see PriceValue
     */
    public StopOrderRequest setPrice(BigDecimal price) {
        this.price = new PriceValue(price);
        return this;
    }

    @SerializedName("priceBound") private PriceValue priceBound;

    /**
     * Get the Price Bound
     * <p>
     * The worst market price that may be used to fill this Stop Order. If the
     * market gaps and crosses through both the price and the priceBound, the
     * Stop Order will be cancelled instead of being filled.
     * <p>
     * @return the Price Bound
     * @see PriceValue
     */
    public PriceValue getPriceBound() {
        return this.priceBound;
    }

    /**
     * Set the Price Bound
     * <p>
     * The worst market price that may be used to fill this Stop Order. If the
     * market gaps and crosses through both the price and the priceBound, the
     * Stop Order will be cancelled instead of being filled.
     * <p>
     * @param priceBound the Price Bound as a PriceValue
     * @return {@link StopOrderRequest StopOrderRequest}
     * @see PriceValue
     */
    public StopOrderRequest setPriceBound(PriceValue priceBound) {
        this.priceBound = priceBound;
        return this;
    }
    /**
     * Set the Price Bound
     * <p>
     * The worst market price that may be used to fill this Stop Order. If the
     * market gaps and crosses through both the price and the priceBound, the
     * Stop Order will be cancelled instead of being filled.
     * <p>
     * @param priceBound the Price Bound as a String
     * @return {@link StopOrderRequest StopOrderRequest}
     * @see PriceValue
     */
    public StopOrderRequest setPriceBound(String priceBound) {
        this.priceBound = new PriceValue(priceBound);
        return this;
    }
    /**
     * Set the Price Bound
     * <p>
     * The worst market price that may be used to fill this Stop Order. If the
     * market gaps and crosses through both the price and the priceBound, the
     * Stop Order will be cancelled instead of being filled.
     * <p>
     * @param priceBound the Price Bound as a double
     * @return {@link StopOrderRequest StopOrderRequest}
     * @see PriceValue
     */
    public StopOrderRequest setPriceBound(double priceBound) {
        this.priceBound = new PriceValue(priceBound);
        return this;
    }
    /**
     * Set the Price Bound
     * <p>
     * The worst market price that may be used to fill this Stop Order. If the
     * market gaps and crosses through both the price and the priceBound, the
     * Stop Order will be cancelled instead of being filled.
     * <p>
     * @param priceBound the Price Bound as a BigDecimal
     * @return {@link StopOrderRequest StopOrderRequest}
     * @see PriceValue
     */
    public StopOrderRequest setPriceBound(BigDecimal priceBound) {
        this.priceBound = new PriceValue(priceBound);
        return this;
    }

    @SerializedName("timeInForce") private TimeInForce timeInForce = TimeInForce.GTC;

    /**
     * Get the Time In Force
     * <p>
     * The time-in-force requested for the Stop Order.
     * <p>
     * @return the Time In Force
     * @see TimeInForce
     */
    public TimeInForce getTimeInForce() {
        return this.timeInForce;
    }

    /**
     * Set the Time In Force
     * <p>
     * The time-in-force requested for the Stop Order.
     * <p>
     * @param timeInForce the Time In Force as a TimeInForce
     * @return {@link StopOrderRequest StopOrderRequest}
     * @see TimeInForce
     */
    public StopOrderRequest setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

    @SerializedName("gtdTime") private DateTime gtdTime;

    /**
     * Get the GTD Time
     * <p>
     * The date/time when the Stop Order will be cancelled if its timeInForce
     * is "GTD".
     * <p>
     * @return the GTD Time
     * @see DateTime
     */
    public DateTime getGtdTime() {
        return this.gtdTime;
    }

    /**
     * Set the GTD Time
     * <p>
     * The date/time when the Stop Order will be cancelled if its timeInForce
     * is "GTD".
     * <p>
     * @param gtdTime the GTD Time as a DateTime
     * @return {@link StopOrderRequest StopOrderRequest}
     * @see DateTime
     */
    public StopOrderRequest setGtdTime(DateTime gtdTime) {
        this.gtdTime = gtdTime;
        return this;
    }
    /**
     * Set the GTD Time
     * <p>
     * The date/time when the Stop Order will be cancelled if its timeInForce
     * is "GTD".
     * <p>
     * @param gtdTime the GTD Time as a String
     * @return {@link StopOrderRequest StopOrderRequest}
     * @see DateTime
     */
    public StopOrderRequest setGtdTime(String gtdTime) {
        this.gtdTime = new DateTime(gtdTime);
        return this;
    }

    @SerializedName("positionFill") private OrderPositionFill positionFill = OrderPositionFill.DEFAULT;

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

    /**
     * Set the Position Fill
     * <p>
     * Specification of how Positions in the Account are modified when the
     * Order is filled.
     * <p>
     * @param positionFill the Position Fill as an OrderPositionFill
     * @return {@link StopOrderRequest StopOrderRequest}
     * @see OrderPositionFill
     */
    public StopOrderRequest setPositionFill(OrderPositionFill positionFill) {
        this.positionFill = positionFill;
        return this;
    }

    @SerializedName("triggerCondition") private OrderTriggerCondition triggerCondition = OrderTriggerCondition.DEFAULT;

    /**
     * Get the Trigger Condition
     * <p>
     * Specification of which price component should be used when determining
     * if an Order should be triggered and filled. This allows Orders to be
     * triggered based on the bid, ask, mid, default (ask for buy, bid for
     * sell) or inverse (ask for sell, bid for buy) price depending on the
     * desired behaviour. Orders are always filled using their default price
     * component. This feature is only provided through the REST API. Clients
     * who choose to specify a non-default trigger condition will not see it
     * reflected in any of OANDA's proprietary or partner trading platforms,
     * their transaction history or their account statements. OANDA platforms
     * always assume that an Order's trigger condition is set to the default
     * value when indicating the distance from an Order's trigger price, and
     * will always provide the default trigger condition when creating or
     * modifying an Order. A special restriction applies when creating a
     * guaranteed Stop Loss Order. In this case the TriggerCondition value must
     * either be "DEFAULT", or the "natural" trigger side "DEFAULT" results in.
     * So for a Stop Loss Order for a long trade valid values are "DEFAULT" and
     * "BID", and for short trades "DEFAULT" and "ASK" are valid.
     * <p>
     * @return the Trigger Condition
     * @see OrderTriggerCondition
     */
    public OrderTriggerCondition getTriggerCondition() {
        return this.triggerCondition;
    }

    /**
     * Set the Trigger Condition
     * <p>
     * Specification of which price component should be used when determining
     * if an Order should be triggered and filled. This allows Orders to be
     * triggered based on the bid, ask, mid, default (ask for buy, bid for
     * sell) or inverse (ask for sell, bid for buy) price depending on the
     * desired behaviour. Orders are always filled using their default price
     * component. This feature is only provided through the REST API. Clients
     * who choose to specify a non-default trigger condition will not see it
     * reflected in any of OANDA's proprietary or partner trading platforms,
     * their transaction history or their account statements. OANDA platforms
     * always assume that an Order's trigger condition is set to the default
     * value when indicating the distance from an Order's trigger price, and
     * will always provide the default trigger condition when creating or
     * modifying an Order. A special restriction applies when creating a
     * guaranteed Stop Loss Order. In this case the TriggerCondition value must
     * either be "DEFAULT", or the "natural" trigger side "DEFAULT" results in.
     * So for a Stop Loss Order for a long trade valid values are "DEFAULT" and
     * "BID", and for short trades "DEFAULT" and "ASK" are valid.
     * <p>
     * @param triggerCondition the Trigger Condition as an
     * OrderTriggerCondition
     * @return {@link StopOrderRequest StopOrderRequest}
     * @see OrderTriggerCondition
     */
    public StopOrderRequest setTriggerCondition(OrderTriggerCondition triggerCondition) {
        this.triggerCondition = triggerCondition;
        return this;
    }

    @SerializedName("clientExtensions") private ClientExtensions clientExtensions;

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

    /**
     * Set the Client Extensions
     * <p>
     * The client extensions to add to the Order. Do not set, modify, or delete
     * clientExtensions if your account is associated with MT4.
     * <p>
     * @param clientExtensions the Client Extensions as a ClientExtensions
     * @return {@link StopOrderRequest StopOrderRequest}
     * @see ClientExtensions
     */
    public StopOrderRequest setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

    @SerializedName("takeProfitOnFill") private TakeProfitDetails takeProfitOnFill;

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

    /**
     * Set the Take Profit On Fill
     * <p>
     * TakeProfitDetails specifies the details of a Take Profit Order to be
     * created on behalf of a client. This may happen when an Order is filled
     * that opens a Trade requiring a Take Profit, or when a Trade's dependent
     * Take Profit Order is modified directly through the Trade.
     * <p>
     * @param takeProfitOnFill the Take Profit On Fill as a TakeProfitDetails
     * @return {@link StopOrderRequest StopOrderRequest}
     * @see TakeProfitDetails
     */
    public StopOrderRequest setTakeProfitOnFill(TakeProfitDetails takeProfitOnFill) {
        this.takeProfitOnFill = takeProfitOnFill;
        return this;
    }

    @SerializedName("stopLossOnFill") private StopLossDetails stopLossOnFill;

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

    /**
     * Set the Stop Loss On Fill
     * <p>
     * StopLossDetails specifies the details of a Stop Loss Order to be created
     * on behalf of a client. This may happen when an Order is filled that
     * opens a Trade requiring a Stop Loss, or when a Trade's dependent Stop
     * Loss Order is modified directly through the Trade.
     * <p>
     * @param stopLossOnFill the Stop Loss On Fill as a StopLossDetails
     * @return {@link StopOrderRequest StopOrderRequest}
     * @see StopLossDetails
     */
    public StopOrderRequest setStopLossOnFill(StopLossDetails stopLossOnFill) {
        this.stopLossOnFill = stopLossOnFill;
        return this;
    }

    @SerializedName("trailingStopLossOnFill") private TrailingStopLossDetails trailingStopLossOnFill;

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

    /**
     * Set the Trailing Stop Loss On Fill
     * <p>
     * TrailingStopLossDetails specifies the details of a Trailing Stop Loss
     * Order to be created on behalf of a client. This may happen when an Order
     * is filled that opens a Trade requiring a Trailing Stop Loss, or when a
     * Trade's dependent Trailing Stop Loss Order is modified directly through
     * the Trade.
     * <p>
     * @param trailingStopLossOnFill the Trailing Stop Loss On Fill as a
     * TrailingStopLossDetails
     * @return {@link StopOrderRequest StopOrderRequest}
     * @see TrailingStopLossDetails
     */
    public StopOrderRequest setTrailingStopLossOnFill(TrailingStopLossDetails trailingStopLossOnFill) {
        this.trailingStopLossOnFill = trailingStopLossOnFill;
        return this;
    }

    @SerializedName("tradeClientExtensions") private ClientExtensions tradeClientExtensions;

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

    /**
     * Set the Trade Client Extensions
     * <p>
     * Client Extensions to add to the Trade created when the Order is filled
     * (if such a Trade is created). Do not set, modify, or delete
     * tradeClientExtensions if your account is associated with MT4.
     * <p>
     * @param tradeClientExtensions the Trade Client Extensions as a
     * ClientExtensions
     * @return {@link StopOrderRequest StopOrderRequest}
     * @see ClientExtensions
     */
    public StopOrderRequest setTradeClientExtensions(ClientExtensions tradeClientExtensions) {
        this.tradeClientExtensions = tradeClientExtensions;
        return this;
    }

    @Override
    public String toString() {
        return "StopOrderRequest(" +
            "type=" +
                (type == null ? "null" : type.toString()) + ", " +
            "instrument=" +
                (instrument == null ? "null" : instrument.toString()) + ", " +
            "units=" +
                (units == null ? "null" : units.toString()) + ", " +
            "price=" +
                (price == null ? "null" : price.toString()) + ", " +
            "priceBound=" +
                (priceBound == null ? "null" : priceBound.toString()) + ", " +
            "timeInForce=" +
                (timeInForce == null ? "null" : timeInForce.toString()) + ", " +
            "gtdTime=" +
                (gtdTime == null ? "null" : gtdTime.toString()) + ", " +
            "positionFill=" +
                (positionFill == null ? "null" : positionFill.toString()) + ", " +
            "triggerCondition=" +
                (triggerCondition == null ? "null" : triggerCondition.toString()) + ", " +
            "clientExtensions=" +
                (clientExtensions == null ? "null" : clientExtensions.toString()) + ", " +
            "takeProfitOnFill=" +
                (takeProfitOnFill == null ? "null" : takeProfitOnFill.toString()) + ", " +
            "stopLossOnFill=" +
                (stopLossOnFill == null ? "null" : stopLossOnFill.toString()) + ", " +
            "trailingStopLossOnFill=" +
                (trailingStopLossOnFill == null ? "null" : trailingStopLossOnFill.toString()) + ", " +
            "tradeClientExtensions=" +
                (tradeClientExtensions == null ? "null" : tradeClientExtensions.toString()) +
            ")";
    }
}
