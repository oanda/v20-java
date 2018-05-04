package com.oanda.v20.order;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.pricing_common.PriceValue;
import com.oanda.v20.primitives.DecimalNumber;
import com.oanda.v20.primitives.InstrumentName;
import com.oanda.v20.transaction.ClientExtensions;
import com.oanda.v20.transaction.StopLossDetails;
import com.oanda.v20.transaction.TakeProfitDetails;
import com.oanda.v20.transaction.TrailingStopLossDetails;

/**
 * A MarketOrderRequest specifies the parameters that may be set when creating
 * a Market Order.
 * <p>
 * {units} units of {instrument}
 */
public class MarketOrderRequest implements OrderRequest {

    /**
     * Default constructor.
     */
    public MarketOrderRequest() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the MarketOrderRequest to copy
     */
    public MarketOrderRequest(MarketOrderRequest other) {
        this.type = other.type;
        this.instrument = other.instrument;
        this.units = other.units;
        this.timeInForce = other.timeInForce;
        this.priceBound = other.priceBound;
        this.positionFill = other.positionFill;
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

    @SerializedName("type") private OrderType type = OrderType.MARKET;

    /**
     * Get the Type
     * <p>
     * The type of the Order to Create. Must be set to "MARKET" when creating a
     * Market Order.
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
     * The type of the Order to Create. Must be set to "MARKET" when creating a
     * Market Order.
     * <p>
     * @param type the Type as an OrderType
     * @return {@link MarketOrderRequest MarketOrderRequest}
     * @see OrderType
     */
    public MarketOrderRequest setType(OrderType type) {
        this.type = type;
        return this;
    }

    @SerializedName("instrument") private InstrumentName instrument;

    /**
     * Get the Instrument
     * <p>
     * The Market Order's Instrument.
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
     * The Market Order's Instrument.
     * <p>
     * @param instrument the Instrument as an InstrumentName
     * @return {@link MarketOrderRequest MarketOrderRequest}
     * @see InstrumentName
     */
    public MarketOrderRequest setInstrument(InstrumentName instrument) {
        this.instrument = instrument;
        return this;
    }
    /**
     * Set the Instrument
     * <p>
     * The Market Order's Instrument.
     * <p>
     * @param instrument the Instrument as a String
     * @return {@link MarketOrderRequest MarketOrderRequest}
     * @see InstrumentName
     */
    public MarketOrderRequest setInstrument(String instrument) {
        this.instrument = new InstrumentName(instrument);
        return this;
    }

    @SerializedName("units") private DecimalNumber units;

    /**
     * Get the Amount
     * <p>
     * The quantity requested to be filled by the Market Order. A posititive
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
     * The quantity requested to be filled by the Market Order. A posititive
     * number of units results in a long Order, and a negative number of units
     * results in a short Order.
     * <p>
     * @param units the Amount as a DecimalNumber
     * @return {@link MarketOrderRequest MarketOrderRequest}
     * @see DecimalNumber
     */
    public MarketOrderRequest setUnits(DecimalNumber units) {
        this.units = units;
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the Market Order. A posititive
     * number of units results in a long Order, and a negative number of units
     * results in a short Order.
     * <p>
     * @param units the Amount as a String
     * @return {@link MarketOrderRequest MarketOrderRequest}
     * @see DecimalNumber
     */
    public MarketOrderRequest setUnits(String units) {
        this.units = new DecimalNumber(units);
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the Market Order. A posititive
     * number of units results in a long Order, and a negative number of units
     * results in a short Order.
     * <p>
     * @param units the Amount as a double
     * @return {@link MarketOrderRequest MarketOrderRequest}
     * @see DecimalNumber
     */
    public MarketOrderRequest setUnits(double units) {
        this.units = new DecimalNumber(units);
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the Market Order. A posititive
     * number of units results in a long Order, and a negative number of units
     * results in a short Order.
     * <p>
     * @param units the Amount as a BigDecimal
     * @return {@link MarketOrderRequest MarketOrderRequest}
     * @see DecimalNumber
     */
    public MarketOrderRequest setUnits(BigDecimal units) {
        this.units = new DecimalNumber(units);
        return this;
    }

    @SerializedName("timeInForce") private TimeInForce timeInForce = TimeInForce.FOK;

    /**
     * Get the Time In Force
     * <p>
     * The time-in-force requested for the Market Order. Restricted to FOK or
     * IOC for a MarketOrder.
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
     * The time-in-force requested for the Market Order. Restricted to FOK or
     * IOC for a MarketOrder.
     * <p>
     * @param timeInForce the Time In Force as a TimeInForce
     * @return {@link MarketOrderRequest MarketOrderRequest}
     * @see TimeInForce
     */
    public MarketOrderRequest setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

    @SerializedName("priceBound") private PriceValue priceBound;

    /**
     * Get the Price Bound
     * <p>
     * The worst price that the client is willing to have the Market Order
     * filled at.
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
     * The worst price that the client is willing to have the Market Order
     * filled at.
     * <p>
     * @param priceBound the Price Bound as a PriceValue
     * @return {@link MarketOrderRequest MarketOrderRequest}
     * @see PriceValue
     */
    public MarketOrderRequest setPriceBound(PriceValue priceBound) {
        this.priceBound = priceBound;
        return this;
    }
    /**
     * Set the Price Bound
     * <p>
     * The worst price that the client is willing to have the Market Order
     * filled at.
     * <p>
     * @param priceBound the Price Bound as a String
     * @return {@link MarketOrderRequest MarketOrderRequest}
     * @see PriceValue
     */
    public MarketOrderRequest setPriceBound(String priceBound) {
        this.priceBound = new PriceValue(priceBound);
        return this;
    }
    /**
     * Set the Price Bound
     * <p>
     * The worst price that the client is willing to have the Market Order
     * filled at.
     * <p>
     * @param priceBound the Price Bound as a double
     * @return {@link MarketOrderRequest MarketOrderRequest}
     * @see PriceValue
     */
    public MarketOrderRequest setPriceBound(double priceBound) {
        this.priceBound = new PriceValue(priceBound);
        return this;
    }
    /**
     * Set the Price Bound
     * <p>
     * The worst price that the client is willing to have the Market Order
     * filled at.
     * <p>
     * @param priceBound the Price Bound as a BigDecimal
     * @return {@link MarketOrderRequest MarketOrderRequest}
     * @see PriceValue
     */
    public MarketOrderRequest setPriceBound(BigDecimal priceBound) {
        this.priceBound = new PriceValue(priceBound);
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
     * @return {@link MarketOrderRequest MarketOrderRequest}
     * @see OrderPositionFill
     */
    public MarketOrderRequest setPositionFill(OrderPositionFill positionFill) {
        this.positionFill = positionFill;
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
     * @return {@link MarketOrderRequest MarketOrderRequest}
     * @see ClientExtensions
     */
    public MarketOrderRequest setClientExtensions(ClientExtensions clientExtensions) {
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
     * @return {@link MarketOrderRequest MarketOrderRequest}
     * @see TakeProfitDetails
     */
    public MarketOrderRequest setTakeProfitOnFill(TakeProfitDetails takeProfitOnFill) {
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
     * @return {@link MarketOrderRequest MarketOrderRequest}
     * @see StopLossDetails
     */
    public MarketOrderRequest setStopLossOnFill(StopLossDetails stopLossOnFill) {
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
     * @return {@link MarketOrderRequest MarketOrderRequest}
     * @see TrailingStopLossDetails
     */
    public MarketOrderRequest setTrailingStopLossOnFill(TrailingStopLossDetails trailingStopLossOnFill) {
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
     * @return {@link MarketOrderRequest MarketOrderRequest}
     * @see ClientExtensions
     */
    public MarketOrderRequest setTradeClientExtensions(ClientExtensions tradeClientExtensions) {
        this.tradeClientExtensions = tradeClientExtensions;
        return this;
    }

    @Override
    public String toString() {
        return "MarketOrderRequest(" +
            "type=" +
                (type == null ? "null" : type.toString()) + ", " +
            "instrument=" +
                (instrument == null ? "null" : instrument.toString()) + ", " +
            "units=" +
                (units == null ? "null" : units.toString()) + ", " +
            "timeInForce=" +
                (timeInForce == null ? "null" : timeInForce.toString()) + ", " +
            "priceBound=" +
                (priceBound == null ? "null" : priceBound.toString()) + ", " +
            "positionFill=" +
                (positionFill == null ? "null" : positionFill.toString()) + ", " +
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
