package com.oanda.v20.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.pricing_common.PriceValue;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.primitives.DecimalNumber;
import com.oanda.v20.primitives.InstrumentName;
import com.oanda.v20.trade.TradeID;
import com.oanda.v20.transaction.ClientExtensions;
import com.oanda.v20.transaction.MarketOrderDelayedTradeClose;
import com.oanda.v20.transaction.MarketOrderMarginCloseout;
import com.oanda.v20.transaction.MarketOrderPositionCloseout;
import com.oanda.v20.transaction.MarketOrderTradeClose;
import com.oanda.v20.transaction.StopLossDetails;
import com.oanda.v20.transaction.TakeProfitDetails;
import com.oanda.v20.transaction.TrailingStopLossDetails;
import com.oanda.v20.transaction.TransactionID;

/**
 * A MarketOrder is an order that is filled immediately upon creation using the
 * current market price.
 * <p>
 * {units} units of {instrument}
 */
public class MarketOrder implements Order {

    /**
     * Default constructor.
     */
    public MarketOrder() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the MarketOrder to copy
     */
    public MarketOrder(MarketOrder other) {
        this.id = other.id;
        this.createTime = other.createTime;
        this.state = other.state;
        if (other.clientExtensions != null)
        {
            this.clientExtensions = new ClientExtensions(other.clientExtensions);
        }
        this.type = other.type;
        this.instrument = other.instrument;
        this.units = other.units;
        this.timeInForce = other.timeInForce;
        this.priceBound = other.priceBound;
        this.positionFill = other.positionFill;
        if (other.tradeClose != null)
        {
            this.tradeClose = new MarketOrderTradeClose(other.tradeClose);
        }
        if (other.longPositionCloseout != null)
        {
            this.longPositionCloseout = new MarketOrderPositionCloseout(other.longPositionCloseout);
        }
        if (other.shortPositionCloseout != null)
        {
            this.shortPositionCloseout = new MarketOrderPositionCloseout(other.shortPositionCloseout);
        }
        if (other.marginCloseout != null)
        {
            this.marginCloseout = new MarketOrderMarginCloseout(other.marginCloseout);
        }
        if (other.delayedTradeClose != null)
        {
            this.delayedTradeClose = new MarketOrderDelayedTradeClose(other.delayedTradeClose);
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
        this.fillingTransactionID = other.fillingTransactionID;
        this.filledTime = other.filledTime;
        this.tradeOpenedID = other.tradeOpenedID;
        this.tradeReducedID = other.tradeReducedID;
        if (other.tradeClosedIDs != null)
        {
            this.tradeClosedIDs = new ArrayList<TradeID>(other.tradeClosedIDs);
        }
        this.cancellingTransactionID = other.cancellingTransactionID;
        this.cancelledTime = other.cancelledTime;
    }

    @SerializedName("id") private OrderID id;

    /**
     * Get the Order ID
     * <p>
     * The Order's identifier, unique within the Order's Account.
     * <p>
     * @return the Order ID
     * @see OrderID
     */
    public OrderID getId() {
        return this.id;
    }

    /**
     * Set the Order ID
     * <p>
     * The Order's identifier, unique within the Order's Account.
     * <p>
     * @param id the Order ID as an OrderID
     * @return {@link MarketOrder MarketOrder}
     * @see OrderID
     */
    public MarketOrder setId(OrderID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Order ID
     * <p>
     * The Order's identifier, unique within the Order's Account.
     * <p>
     * @param id the Order ID as a String
     * @return {@link MarketOrder MarketOrder}
     * @see OrderID
     */
    public MarketOrder setId(String id) {
        this.id = new OrderID(id);
        return this;
    }

    @SerializedName("createTime") private DateTime createTime;

    /**
     * Get the Create Time
     * <p>
     * The time when the Order was created.
     * <p>
     * @return the Create Time
     * @see DateTime
     */
    public DateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Set the Create Time
     * <p>
     * The time when the Order was created.
     * <p>
     * @param createTime the Create Time as a DateTime
     * @return {@link MarketOrder MarketOrder}
     * @see DateTime
     */
    public MarketOrder setCreateTime(DateTime createTime) {
        this.createTime = createTime;
        return this;
    }
    /**
     * Set the Create Time
     * <p>
     * The time when the Order was created.
     * <p>
     * @param createTime the Create Time as a String
     * @return {@link MarketOrder MarketOrder}
     * @see DateTime
     */
    public MarketOrder setCreateTime(String createTime) {
        this.createTime = new DateTime(createTime);
        return this;
    }

    @SerializedName("state") private OrderState state;

    /**
     * Get the State
     * <p>
     * The current state of the Order.
     * <p>
     * @return the State
     * @see OrderState
     */
    public OrderState getState() {
        return this.state;
    }

    /**
     * Set the State
     * <p>
     * The current state of the Order.
     * <p>
     * @param state the State as an OrderState
     * @return {@link MarketOrder MarketOrder}
     * @see OrderState
     */
    public MarketOrder setState(OrderState state) {
        this.state = state;
        return this;
    }

    @SerializedName("clientExtensions") private ClientExtensions clientExtensions;

    /**
     * Get the Client Extensions
     * <p>
     * The client extensions of the Order. Do not set, modify, or delete
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
     * The client extensions of the Order. Do not set, modify, or delete
     * clientExtensions if your account is associated with MT4.
     * <p>
     * @param clientExtensions the Client Extensions as a ClientExtensions
     * @return {@link MarketOrder MarketOrder}
     * @see ClientExtensions
     */
    public MarketOrder setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

    @SerializedName("type") private OrderType type = OrderType.MARKET;

    /**
     * Get the Type
     * <p>
     * The type of the Order. Always set to "MARKET" for Market Orders.
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
     * The type of the Order. Always set to "MARKET" for Market Orders.
     * <p>
     * @param type the Type as an OrderType
     * @return {@link MarketOrder MarketOrder}
     * @see OrderType
     */
    public MarketOrder setType(OrderType type) {
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
     * @return {@link MarketOrder MarketOrder}
     * @see InstrumentName
     */
    public MarketOrder setInstrument(InstrumentName instrument) {
        this.instrument = instrument;
        return this;
    }
    /**
     * Set the Instrument
     * <p>
     * The Market Order's Instrument.
     * <p>
     * @param instrument the Instrument as a String
     * @return {@link MarketOrder MarketOrder}
     * @see InstrumentName
     */
    public MarketOrder setInstrument(String instrument) {
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
     * @return {@link MarketOrder MarketOrder}
     * @see DecimalNumber
     */
    public MarketOrder setUnits(DecimalNumber units) {
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
     * @return {@link MarketOrder MarketOrder}
     * @see DecimalNumber
     */
    public MarketOrder setUnits(String units) {
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
     * @return {@link MarketOrder MarketOrder}
     * @see DecimalNumber
     */
    public MarketOrder setUnits(double units) {
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
     * @return {@link MarketOrder MarketOrder}
     * @see DecimalNumber
     */
    public MarketOrder setUnits(BigDecimal units) {
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
     * @return {@link MarketOrder MarketOrder}
     * @see TimeInForce
     */
    public MarketOrder setTimeInForce(TimeInForce timeInForce) {
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
     * @return {@link MarketOrder MarketOrder}
     * @see PriceValue
     */
    public MarketOrder setPriceBound(PriceValue priceBound) {
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
     * @return {@link MarketOrder MarketOrder}
     * @see PriceValue
     */
    public MarketOrder setPriceBound(String priceBound) {
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
     * @return {@link MarketOrder MarketOrder}
     * @see PriceValue
     */
    public MarketOrder setPriceBound(double priceBound) {
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
     * @return {@link MarketOrder MarketOrder}
     * @see PriceValue
     */
    public MarketOrder setPriceBound(BigDecimal priceBound) {
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
     * @return {@link MarketOrder MarketOrder}
     * @see OrderPositionFill
     */
    public MarketOrder setPositionFill(OrderPositionFill positionFill) {
        this.positionFill = positionFill;
        return this;
    }

    @SerializedName("tradeClose") private MarketOrderTradeClose tradeClose;

    /**
     * Get the Trade Close Details
     * <p>
     * Details of the Trade requested to be closed, only provided when the
     * Market Order is being used to explicitly close a Trade.
     * <p>
     * @return the Trade Close Details
     * @see MarketOrderTradeClose
     */
    public MarketOrderTradeClose getTradeClose() {
        return this.tradeClose;
    }

    /**
     * Set the Trade Close Details
     * <p>
     * Details of the Trade requested to be closed, only provided when the
     * Market Order is being used to explicitly close a Trade.
     * <p>
     * @param tradeClose the Trade Close Details as a MarketOrderTradeClose
     * @return {@link MarketOrder MarketOrder}
     * @see MarketOrderTradeClose
     */
    public MarketOrder setTradeClose(MarketOrderTradeClose tradeClose) {
        this.tradeClose = tradeClose;
        return this;
    }

    @SerializedName("longPositionCloseout") private MarketOrderPositionCloseout longPositionCloseout;

    /**
     * Get the Long Position Close Details
     * <p>
     * Details of the long Position requested to be closed out, only provided
     * when a Market Order is being used to explicitly closeout a long
     * Position.
     * <p>
     * @return the Long Position Close Details
     * @see MarketOrderPositionCloseout
     */
    public MarketOrderPositionCloseout getLongPositionCloseout() {
        return this.longPositionCloseout;
    }

    /**
     * Set the Long Position Close Details
     * <p>
     * Details of the long Position requested to be closed out, only provided
     * when a Market Order is being used to explicitly closeout a long
     * Position.
     * <p>
     * @param longPositionCloseout the Long Position Close Details as a
     * MarketOrderPositionCloseout
     * @return {@link MarketOrder MarketOrder}
     * @see MarketOrderPositionCloseout
     */
    public MarketOrder setLongPositionCloseout(MarketOrderPositionCloseout longPositionCloseout) {
        this.longPositionCloseout = longPositionCloseout;
        return this;
    }

    @SerializedName("shortPositionCloseout") private MarketOrderPositionCloseout shortPositionCloseout;

    /**
     * Get the Short Position Close Details
     * <p>
     * Details of the short Position requested to be closed out, only provided
     * when a Market Order is being used to explicitly closeout a short
     * Position.
     * <p>
     * @return the Short Position Close Details
     * @see MarketOrderPositionCloseout
     */
    public MarketOrderPositionCloseout getShortPositionCloseout() {
        return this.shortPositionCloseout;
    }

    /**
     * Set the Short Position Close Details
     * <p>
     * Details of the short Position requested to be closed out, only provided
     * when a Market Order is being used to explicitly closeout a short
     * Position.
     * <p>
     * @param shortPositionCloseout the Short Position Close Details as a
     * MarketOrderPositionCloseout
     * @return {@link MarketOrder MarketOrder}
     * @see MarketOrderPositionCloseout
     */
    public MarketOrder setShortPositionCloseout(MarketOrderPositionCloseout shortPositionCloseout) {
        this.shortPositionCloseout = shortPositionCloseout;
        return this;
    }

    @SerializedName("marginCloseout") private MarketOrderMarginCloseout marginCloseout;

    /**
     * Get the Margin Closeout Details
     * <p>
     * Details of the Margin Closeout that this Market Order was created for
     * <p>
     * @return the Margin Closeout Details
     * @see MarketOrderMarginCloseout
     */
    public MarketOrderMarginCloseout getMarginCloseout() {
        return this.marginCloseout;
    }

    /**
     * Set the Margin Closeout Details
     * <p>
     * Details of the Margin Closeout that this Market Order was created for
     * <p>
     * @param marginCloseout the Margin Closeout Details as a
     * MarketOrderMarginCloseout
     * @return {@link MarketOrder MarketOrder}
     * @see MarketOrderMarginCloseout
     */
    public MarketOrder setMarginCloseout(MarketOrderMarginCloseout marginCloseout) {
        this.marginCloseout = marginCloseout;
        return this;
    }

    @SerializedName("delayedTradeClose") private MarketOrderDelayedTradeClose delayedTradeClose;

    /**
     * Get the Delayed Trade Close Details
     * <p>
     * Details of the delayed Trade close that this Market Order was created
     * for
     * <p>
     * @return the Delayed Trade Close Details
     * @see MarketOrderDelayedTradeClose
     */
    public MarketOrderDelayedTradeClose getDelayedTradeClose() {
        return this.delayedTradeClose;
    }

    /**
     * Set the Delayed Trade Close Details
     * <p>
     * Details of the delayed Trade close that this Market Order was created
     * for
     * <p>
     * @param delayedTradeClose the Delayed Trade Close Details as a
     * MarketOrderDelayedTradeClose
     * @return {@link MarketOrder MarketOrder}
     * @see MarketOrderDelayedTradeClose
     */
    public MarketOrder setDelayedTradeClose(MarketOrderDelayedTradeClose delayedTradeClose) {
        this.delayedTradeClose = delayedTradeClose;
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
     * @return {@link MarketOrder MarketOrder}
     * @see TakeProfitDetails
     */
    public MarketOrder setTakeProfitOnFill(TakeProfitDetails takeProfitOnFill) {
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
     * @return {@link MarketOrder MarketOrder}
     * @see StopLossDetails
     */
    public MarketOrder setStopLossOnFill(StopLossDetails stopLossOnFill) {
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
     * @return {@link MarketOrder MarketOrder}
     * @see TrailingStopLossDetails
     */
    public MarketOrder setTrailingStopLossOnFill(TrailingStopLossDetails trailingStopLossOnFill) {
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
     * @return {@link MarketOrder MarketOrder}
     * @see ClientExtensions
     */
    public MarketOrder setTradeClientExtensions(ClientExtensions tradeClientExtensions) {
        this.tradeClientExtensions = tradeClientExtensions;
        return this;
    }

    @SerializedName("fillingTransactionID") private TransactionID fillingTransactionID;

    /**
     * Get the Filling Transaction ID
     * <p>
     * ID of the Transaction that filled this Order (only provided when the
     * Order's state is FILLED)
     * <p>
     * @return the Filling Transaction ID
     * @see TransactionID
     */
    public TransactionID getFillingTransactionID() {
        return this.fillingTransactionID;
    }

    /**
     * Set the Filling Transaction ID
     * <p>
     * ID of the Transaction that filled this Order (only provided when the
     * Order's state is FILLED)
     * <p>
     * @param fillingTransactionID the Filling Transaction ID as a
     * TransactionID
     * @return {@link MarketOrder MarketOrder}
     * @see TransactionID
     */
    public MarketOrder setFillingTransactionID(TransactionID fillingTransactionID) {
        this.fillingTransactionID = fillingTransactionID;
        return this;
    }
    /**
     * Set the Filling Transaction ID
     * <p>
     * ID of the Transaction that filled this Order (only provided when the
     * Order's state is FILLED)
     * <p>
     * @param fillingTransactionID the Filling Transaction ID as a String
     * @return {@link MarketOrder MarketOrder}
     * @see TransactionID
     */
    public MarketOrder setFillingTransactionID(String fillingTransactionID) {
        this.fillingTransactionID = new TransactionID(fillingTransactionID);
        return this;
    }

    @SerializedName("filledTime") private DateTime filledTime;

    /**
     * Get the Filled Time
     * <p>
     * Date/time when the Order was filled (only provided when the Order's
     * state is FILLED)
     * <p>
     * @return the Filled Time
     * @see DateTime
     */
    public DateTime getFilledTime() {
        return this.filledTime;
    }

    /**
     * Set the Filled Time
     * <p>
     * Date/time when the Order was filled (only provided when the Order's
     * state is FILLED)
     * <p>
     * @param filledTime the Filled Time as a DateTime
     * @return {@link MarketOrder MarketOrder}
     * @see DateTime
     */
    public MarketOrder setFilledTime(DateTime filledTime) {
        this.filledTime = filledTime;
        return this;
    }
    /**
     * Set the Filled Time
     * <p>
     * Date/time when the Order was filled (only provided when the Order's
     * state is FILLED)
     * <p>
     * @param filledTime the Filled Time as a String
     * @return {@link MarketOrder MarketOrder}
     * @see DateTime
     */
    public MarketOrder setFilledTime(String filledTime) {
        this.filledTime = new DateTime(filledTime);
        return this;
    }

    @SerializedName("tradeOpenedID") private TradeID tradeOpenedID;

    /**
     * Get the Trade Opened ID
     * <p>
     * Trade ID of Trade opened when the Order was filled (only provided when
     * the Order's state is FILLED and a Trade was opened as a result of the
     * fill)
     * <p>
     * @return the Trade Opened ID
     * @see TradeID
     */
    public TradeID getTradeOpenedID() {
        return this.tradeOpenedID;
    }

    /**
     * Set the Trade Opened ID
     * <p>
     * Trade ID of Trade opened when the Order was filled (only provided when
     * the Order's state is FILLED and a Trade was opened as a result of the
     * fill)
     * <p>
     * @param tradeOpenedID the Trade Opened ID as a TradeID
     * @return {@link MarketOrder MarketOrder}
     * @see TradeID
     */
    public MarketOrder setTradeOpenedID(TradeID tradeOpenedID) {
        this.tradeOpenedID = tradeOpenedID;
        return this;
    }
    /**
     * Set the Trade Opened ID
     * <p>
     * Trade ID of Trade opened when the Order was filled (only provided when
     * the Order's state is FILLED and a Trade was opened as a result of the
     * fill)
     * <p>
     * @param tradeOpenedID the Trade Opened ID as a String
     * @return {@link MarketOrder MarketOrder}
     * @see TradeID
     */
    public MarketOrder setTradeOpenedID(String tradeOpenedID) {
        this.tradeOpenedID = new TradeID(tradeOpenedID);
        return this;
    }

    @SerializedName("tradeReducedID") private TradeID tradeReducedID;

    /**
     * Get the Trade Reduced ID
     * <p>
     * Trade ID of Trade reduced when the Order was filled (only provided when
     * the Order's state is FILLED and a Trade was reduced as a result of the
     * fill)
     * <p>
     * @return the Trade Reduced ID
     * @see TradeID
     */
    public TradeID getTradeReducedID() {
        return this.tradeReducedID;
    }

    /**
     * Set the Trade Reduced ID
     * <p>
     * Trade ID of Trade reduced when the Order was filled (only provided when
     * the Order's state is FILLED and a Trade was reduced as a result of the
     * fill)
     * <p>
     * @param tradeReducedID the Trade Reduced ID as a TradeID
     * @return {@link MarketOrder MarketOrder}
     * @see TradeID
     */
    public MarketOrder setTradeReducedID(TradeID tradeReducedID) {
        this.tradeReducedID = tradeReducedID;
        return this;
    }
    /**
     * Set the Trade Reduced ID
     * <p>
     * Trade ID of Trade reduced when the Order was filled (only provided when
     * the Order's state is FILLED and a Trade was reduced as a result of the
     * fill)
     * <p>
     * @param tradeReducedID the Trade Reduced ID as a String
     * @return {@link MarketOrder MarketOrder}
     * @see TradeID
     */
    public MarketOrder setTradeReducedID(String tradeReducedID) {
        this.tradeReducedID = new TradeID(tradeReducedID);
        return this;
    }

    @SerializedName("tradeClosedIDs") private ArrayList<TradeID> tradeClosedIDs;

    /**
     * Get the Trade Closed IDs
     * <p>
     * Trade IDs of Trades closed when the Order was filled (only provided when
     * the Order's state is FILLED and one or more Trades were closed as a
     * result of the fill)
     * <p>
     * @return the Trade Closed IDs
     * @see TradeID
     */
    public List<TradeID> getTradeClosedIDs() {
        return this.tradeClosedIDs;
    }

    /**
     * Set the Trade Closed IDs
     * <p>
     * Trade IDs of Trades closed when the Order was filled (only provided when
     * the Order's state is FILLED and one or more Trades were closed as a
     * result of the fill)
     * <p>
     * @param tradeClosedIDs the Trade Closed IDs
     * @return {@link MarketOrder MarketOrder}
     * @see TradeID
     */
    public MarketOrder setTradeClosedIDs(Collection<?> tradeClosedIDs) {
        ArrayList<TradeID> newTradeClosedIDs = new ArrayList<TradeID>(tradeClosedIDs.size());
        tradeClosedIDs.forEach((item) -> {
            if (item instanceof TradeID)
            {
                newTradeClosedIDs.add((TradeID) item);
            }
            else if (item instanceof String)
            {
                newTradeClosedIDs.add(new TradeID((String) item));
            }
            else
            {
                throw new IllegalArgumentException(
                    item.getClass().getName() + " cannot be converted to a TradeID"
                );
            }
        });
        this.tradeClosedIDs = newTradeClosedIDs;
        return this;
    }

    @SerializedName("cancellingTransactionID") private TransactionID cancellingTransactionID;

    /**
     * Get the Cancelling Transction ID
     * <p>
     * ID of the Transaction that cancelled the Order (only provided when the
     * Order's state is CANCELLED)
     * <p>
     * @return the Cancelling Transction ID
     * @see TransactionID
     */
    public TransactionID getCancellingTransactionID() {
        return this.cancellingTransactionID;
    }

    /**
     * Set the Cancelling Transction ID
     * <p>
     * ID of the Transaction that cancelled the Order (only provided when the
     * Order's state is CANCELLED)
     * <p>
     * @param cancellingTransactionID the Cancelling Transction ID as a
     * TransactionID
     * @return {@link MarketOrder MarketOrder}
     * @see TransactionID
     */
    public MarketOrder setCancellingTransactionID(TransactionID cancellingTransactionID) {
        this.cancellingTransactionID = cancellingTransactionID;
        return this;
    }
    /**
     * Set the Cancelling Transction ID
     * <p>
     * ID of the Transaction that cancelled the Order (only provided when the
     * Order's state is CANCELLED)
     * <p>
     * @param cancellingTransactionID the Cancelling Transction ID as a String
     * @return {@link MarketOrder MarketOrder}
     * @see TransactionID
     */
    public MarketOrder setCancellingTransactionID(String cancellingTransactionID) {
        this.cancellingTransactionID = new TransactionID(cancellingTransactionID);
        return this;
    }

    @SerializedName("cancelledTime") private DateTime cancelledTime;

    /**
     * Get the Cancelled Time
     * <p>
     * Date/time when the Order was cancelled (only provided when the state of
     * the Order is CANCELLED)
     * <p>
     * @return the Cancelled Time
     * @see DateTime
     */
    public DateTime getCancelledTime() {
        return this.cancelledTime;
    }

    /**
     * Set the Cancelled Time
     * <p>
     * Date/time when the Order was cancelled (only provided when the state of
     * the Order is CANCELLED)
     * <p>
     * @param cancelledTime the Cancelled Time as a DateTime
     * @return {@link MarketOrder MarketOrder}
     * @see DateTime
     */
    public MarketOrder setCancelledTime(DateTime cancelledTime) {
        this.cancelledTime = cancelledTime;
        return this;
    }
    /**
     * Set the Cancelled Time
     * <p>
     * Date/time when the Order was cancelled (only provided when the state of
     * the Order is CANCELLED)
     * <p>
     * @param cancelledTime the Cancelled Time as a String
     * @return {@link MarketOrder MarketOrder}
     * @see DateTime
     */
    public MarketOrder setCancelledTime(String cancelledTime) {
        this.cancelledTime = new DateTime(cancelledTime);
        return this;
    }

    @Override
    public String toString() {
        return "MarketOrder(" +
            "id=" +
                (id == null ? "null" : id.toString()) + ", " +
            "createTime=" +
                (createTime == null ? "null" : createTime.toString()) + ", " +
            "state=" +
                (state == null ? "null" : state.toString()) + ", " +
            "clientExtensions=" +
                (clientExtensions == null ? "null" : clientExtensions.toString()) + ", " +
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
            "tradeClose=" +
                (tradeClose == null ? "null" : tradeClose.toString()) + ", " +
            "longPositionCloseout=" +
                (longPositionCloseout == null ? "null" : longPositionCloseout.toString()) + ", " +
            "shortPositionCloseout=" +
                (shortPositionCloseout == null ? "null" : shortPositionCloseout.toString()) + ", " +
            "marginCloseout=" +
                (marginCloseout == null ? "null" : marginCloseout.toString()) + ", " +
            "delayedTradeClose=" +
                (delayedTradeClose == null ? "null" : delayedTradeClose.toString()) + ", " +
            "takeProfitOnFill=" +
                (takeProfitOnFill == null ? "null" : takeProfitOnFill.toString()) + ", " +
            "stopLossOnFill=" +
                (stopLossOnFill == null ? "null" : stopLossOnFill.toString()) + ", " +
            "trailingStopLossOnFill=" +
                (trailingStopLossOnFill == null ? "null" : trailingStopLossOnFill.toString()) + ", " +
            "tradeClientExtensions=" +
                (tradeClientExtensions == null ? "null" : tradeClientExtensions.toString()) + ", " +
            "fillingTransactionID=" +
                (fillingTransactionID == null ? "null" : fillingTransactionID.toString()) + ", " +
            "filledTime=" +
                (filledTime == null ? "null" : filledTime.toString()) + ", " +
            "tradeOpenedID=" +
                (tradeOpenedID == null ? "null" : tradeOpenedID.toString()) + ", " +
            "tradeReducedID=" +
                (tradeReducedID == null ? "null" : tradeReducedID.toString()) + ", " +
            "tradeClosedIDs=" +
                (tradeClosedIDs == null ? "null" : tradeClosedIDs.toString()) + ", " +
            "cancellingTransactionID=" +
                (cancellingTransactionID == null ? "null" : cancellingTransactionID.toString()) + ", " +
            "cancelledTime=" +
                (cancelledTime == null ? "null" : cancelledTime.toString()) +
            ")";
    }
}
