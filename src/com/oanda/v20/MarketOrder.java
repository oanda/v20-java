package com.oanda.v20;

import com.oanda.v20.OrderState;
import com.oanda.v20.OrderType;
import com.oanda.v20.TimeInForce;
import com.oanda.v20.OrderPositionFill;
import com.google.gson.annotations.SerializedName;

/**
 * A MarketOrder is an order that is filled immediately upon creation using the
 * current market price.
 * <p>
 * {units} units of {instrument}
 */
public class MarketOrder implements Order {

    @SerializedName("id") private OrderID id;

    /**
     * Set the Order ID
     * <p>
     * The Order's identifier, unique within the Order's Account.
     * <p>
     * @param id the Order ID
     * @return {@link MarketOrder MarketOrder}
     * @see OrderID
     */
    public MarketOrder setId(String id) {
        this.id = new OrderID(id);
        return this;
    }

    /**
     * Get the Order ID
     * <p>
     * The Order's identifier, unique within the Order's Account.
     * <p>
     * @return the Order ID
     * @see OrderID
     */
    public String getId() {
        return this.id.getOrderID();
    }

    @SerializedName("createTime") private DateTime createTime;

    /**
     * Set the Create Time
     * <p>
     * The time when the Order was created.
     * <p>
     * @param createTime the Create Time
     * @return {@link MarketOrder MarketOrder}
     * @see DateTime
     */
    public MarketOrder setCreateTime(String createTime) {
        this.createTime = new DateTime(createTime);
        return this;
    }

    /**
     * Get the Create Time
     * <p>
     * The time when the Order was created.
     * <p>
     * @return the Create Time
     * @see DateTime
     */
    public String getCreateTime() {
        return this.createTime.getDateTime();
    }

    @SerializedName("state") private OrderState state;

    /**
     * Set the State
     * <p>
     * The current state of the Order.
     * <p>
     * @param state the State
     * @return {@link MarketOrder MarketOrder}
     * @see OrderState
     */
    public MarketOrder setState(OrderState state) {
        this.state = state;
        return this;
    }

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

    @SerializedName("clientExtensions") private ClientExtensions clientExtensions;

    /**
     * Set the Client Extensions
     * <p>
     * The client extensions of the Order. Do not set, modify, or delete
     * clientExtensions if your account is associated with MT4.
     * <p>
     * @param clientExtensions the Client Extensions
     * @return {@link MarketOrder MarketOrder}
     * @see ClientExtensions
     */
    public MarketOrder setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

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

    @SerializedName("instrument") private InstrumentName instrument;

    /**
     * Set the Instrument
     * <p>
     * The Market Order's Instrument.
     * <p>
     * @param instrument the Instrument
     * @return {@link MarketOrder MarketOrder}
     * @see InstrumentName
     */
    public MarketOrder setInstrument(String instrument) {
        this.instrument = new InstrumentName(instrument);
        return this;
    }

    /**
     * Get the Instrument
     * <p>
     * The Market Order's Instrument.
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
     * The quantity requested to be filled by the Market Order. A posititive
     * number of units results in a long Order, and a negative number of units
     * results in a short Order.
     * <p>
     * @param units the Amount
     * @return {@link MarketOrder MarketOrder}
     * @see DecimalNumber
     */
    public MarketOrder setUnits(double units) {
        this.units = new DecimalNumber(units);
        return this;
    }

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
    public double getUnits() {
        return this.units.getDecimalNumber();
    }

    @SerializedName("timeInForce") private TimeInForce timeInForce = TimeInForce.FOK;

    /**
     * Set the Time In Force
     * <p>
     * The time-in-force requested for the Market Order. Restricted to FOK or
     * IOC for a MarketOrder.
     * <p>
     * @param timeInForce the Time In Force
     * @return {@link MarketOrder MarketOrder}
     * @see TimeInForce
     */
    public MarketOrder setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

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

    @SerializedName("priceBound") private PriceValue priceBound;

    /**
     * Set the Price Bound
     * <p>
     * The worst price that the client is willing to have the Market Order
     * filled at.
     * <p>
     * @param priceBound the Price Bound
     * @return {@link MarketOrder MarketOrder}
     * @see PriceValue
     */
    public MarketOrder setPriceBound(double priceBound) {
        this.priceBound = new PriceValue(priceBound);
        return this;
    }

    /**
     * Get the Price Bound
     * <p>
     * The worst price that the client is willing to have the Market Order
     * filled at.
     * <p>
     * @return the Price Bound
     * @see PriceValue
     */
    public double getPriceBound() {
        return this.priceBound.getPriceValue();
    }

    @SerializedName("positionFill") private OrderPositionFill positionFill = OrderPositionFill.DEFAULT;

    /**
     * Set the Position Fill
     * <p>
     * Specification of how Positions in the Account are modified when the
     * Order is filled.
     * <p>
     * @param positionFill the Position Fill
     * @return {@link MarketOrder MarketOrder}
     * @see OrderPositionFill
     */
    public MarketOrder setPositionFill(OrderPositionFill positionFill) {
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

    @SerializedName("tradeClose") private MarketOrderTradeClose tradeClose;

    /**
     * Set the Trade Close Details
     * <p>
     * Details of the Trade requested to be closed, only provided when the
     * Market Order is being used to explicitly close a Trade.
     * <p>
     * @param tradeClose the Trade Close Details
     * @return {@link MarketOrder MarketOrder}
     * @see MarketOrderTradeClose
     */
    public MarketOrder setTradeClose(MarketOrderTradeClose tradeClose) {
        this.tradeClose = tradeClose;
        return this;
    }

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

    @SerializedName("longPositionCloseout") private MarketOrderPositionCloseout longPositionCloseout;

    /**
     * Set the Long Position Close Details
     * <p>
     * Details of the long Position requested to be closed out, only provided
     * when a Market Order is being used to explicitly closeout a long
     * Position.
     * <p>
     * @param longPositionCloseout the Long Position Close Details
     * @return {@link MarketOrder MarketOrder}
     * @see MarketOrderPositionCloseout
     */
    public MarketOrder setLongPositionCloseout(MarketOrderPositionCloseout longPositionCloseout) {
        this.longPositionCloseout = longPositionCloseout;
        return this;
    }

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

    @SerializedName("shortPositionCloseout") private MarketOrderPositionCloseout shortPositionCloseout;

    /**
     * Set the Short Position Close Details
     * <p>
     * Details of the short Position requested to be closed out, only provided
     * when a Market Order is being used to explicitly closeout a short
     * Position.
     * <p>
     * @param shortPositionCloseout the Short Position Close Details
     * @return {@link MarketOrder MarketOrder}
     * @see MarketOrderPositionCloseout
     */
    public MarketOrder setShortPositionCloseout(MarketOrderPositionCloseout shortPositionCloseout) {
        this.shortPositionCloseout = shortPositionCloseout;
        return this;
    }

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

    @SerializedName("marginCloseout") private MarketOrderMarginCloseout marginCloseout;

    /**
     * Set the Margin Closeout Details
     * <p>
     * Details of the Margin Closeout that this Market Order was created for
     * <p>
     * @param marginCloseout the Margin Closeout Details
     * @return {@link MarketOrder MarketOrder}
     * @see MarketOrderMarginCloseout
     */
    public MarketOrder setMarginCloseout(MarketOrderMarginCloseout marginCloseout) {
        this.marginCloseout = marginCloseout;
        return this;
    }

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

    @SerializedName("delayedTradeClose") private MarketOrderDelayedTradeClose delayedTradeClose;

    /**
     * Set the Delayed Trade Close Details
     * <p>
     * Details of the delayed Trade close that this Market Order was created
     * for
     * <p>
     * @param delayedTradeClose the Delayed Trade Close Details
     * @return {@link MarketOrder MarketOrder}
     * @see MarketOrderDelayedTradeClose
     */
    public MarketOrder setDelayedTradeClose(MarketOrderDelayedTradeClose delayedTradeClose) {
        this.delayedTradeClose = delayedTradeClose;
        return this;
    }

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
     * @return {@link MarketOrder MarketOrder}
     * @see TakeProfitDetails
     */
    public MarketOrder setTakeProfitOnFill(TakeProfitDetails takeProfitOnFill) {
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
     * @return {@link MarketOrder MarketOrder}
     * @see StopLossDetails
     */
    public MarketOrder setStopLossOnFill(StopLossDetails stopLossOnFill) {
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
     * @return {@link MarketOrder MarketOrder}
     * @see TrailingStopLossDetails
     */
    public MarketOrder setTrailingStopLossOnFill(TrailingStopLossDetails trailingStopLossOnFill) {
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
     * @return {@link MarketOrder MarketOrder}
     * @see ClientExtensions
     */
    public MarketOrder setTradeClientExtensions(ClientExtensions tradeClientExtensions) {
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

    @SerializedName("fillingTransactionID") private TransactionID fillingTransactionID;

    /**
     * Set the Filling Transaction ID
     * <p>
     * ID of the Transaction that filled this Order (only provided when the
     * Order's state is FILLED)
     * <p>
     * @param fillingTransactionID the Filling Transaction ID
     * @return {@link MarketOrder MarketOrder}
     * @see TransactionID
     */
    public MarketOrder setFillingTransactionID(String fillingTransactionID) {
        this.fillingTransactionID = new TransactionID(fillingTransactionID);
        return this;
    }

    /**
     * Get the Filling Transaction ID
     * <p>
     * ID of the Transaction that filled this Order (only provided when the
     * Order's state is FILLED)
     * <p>
     * @return the Filling Transaction ID
     * @see TransactionID
     */
    public String getFillingTransactionID() {
        return this.fillingTransactionID.getTransactionID();
    }

    @SerializedName("filledTime") private DateTime filledTime;

    /**
     * Set the Filled Time
     * <p>
     * Date/time when the Order was filled (only provided when the Order's
     * state is FILLED)
     * <p>
     * @param filledTime the Filled Time
     * @return {@link MarketOrder MarketOrder}
     * @see DateTime
     */
    public MarketOrder setFilledTime(String filledTime) {
        this.filledTime = new DateTime(filledTime);
        return this;
    }

    /**
     * Get the Filled Time
     * <p>
     * Date/time when the Order was filled (only provided when the Order's
     * state is FILLED)
     * <p>
     * @return the Filled Time
     * @see DateTime
     */
    public String getFilledTime() {
        return this.filledTime.getDateTime();
    }

    @SerializedName("tradeOpenedID") private TradeID tradeOpenedID;

    /**
     * Set the Trade Opened ID
     * <p>
     * Trade ID of Trade opened when the Order was filled (only provided when
     * the Order's state is FILLED and a Trade was opened as a result of the
     * fill)
     * <p>
     * @param tradeOpenedID the Trade Opened ID
     * @return {@link MarketOrder MarketOrder}
     * @see TradeID
     */
    public MarketOrder setTradeOpenedID(String tradeOpenedID) {
        this.tradeOpenedID = new TradeID(tradeOpenedID);
        return this;
    }

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
    public String getTradeOpenedID() {
        return this.tradeOpenedID.getTradeID();
    }

    @SerializedName("tradeReducedID") private TradeID tradeReducedID;

    /**
     * Set the Trade Reduced ID
     * <p>
     * Trade ID of Trade reduced when the Order was filled (only provided when
     * the Order's state is FILLED and a Trade was reduced as a result of the
     * fill)
     * <p>
     * @param tradeReducedID the Trade Reduced ID
     * @return {@link MarketOrder MarketOrder}
     * @see TradeID
     */
    public MarketOrder setTradeReducedID(String tradeReducedID) {
        this.tradeReducedID = new TradeID(tradeReducedID);
        return this;
    }

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
    public String getTradeReducedID() {
        return this.tradeReducedID.getTradeID();
    }

    @SerializedName("tradeClosedIDs") private TradeID[] tradeClosedIDs;

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
    public MarketOrder setTradeClosedIDs(TradeID[] tradeClosedIDs) {
        this.tradeClosedIDs = tradeClosedIDs;
        return this;
    }

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
    public TradeID[] getTradeClosedIDs() {
        return this.tradeClosedIDs;
    }

    @SerializedName("cancellingTransactionID") private TransactionID cancellingTransactionID;

    /**
     * Set the Cancelling Transction ID
     * <p>
     * ID of the Transaction that cancelled the Order (only provided when the
     * Order's state is CANCELLED)
     * <p>
     * @param cancellingTransactionID the Cancelling Transction ID
     * @return {@link MarketOrder MarketOrder}
     * @see TransactionID
     */
    public MarketOrder setCancellingTransactionID(String cancellingTransactionID) {
        this.cancellingTransactionID = new TransactionID(cancellingTransactionID);
        return this;
    }

    /**
     * Get the Cancelling Transction ID
     * <p>
     * ID of the Transaction that cancelled the Order (only provided when the
     * Order's state is CANCELLED)
     * <p>
     * @return the Cancelling Transction ID
     * @see TransactionID
     */
    public String getCancellingTransactionID() {
        return this.cancellingTransactionID.getTransactionID();
    }

    @SerializedName("cancelledTime") private DateTime cancelledTime;

    /**
     * Set the Cancelled Time
     * <p>
     * Date/time when the Order was cancelled (only provided when the state of
     * the Order is CANCELLED)
     * <p>
     * @param cancelledTime the Cancelled Time
     * @return {@link MarketOrder MarketOrder}
     * @see DateTime
     */
    public MarketOrder setCancelledTime(String cancelledTime) {
        this.cancelledTime = new DateTime(cancelledTime);
        return this;
    }

    /**
     * Get the Cancelled Time
     * <p>
     * Date/time when the Order was cancelled (only provided when the state of
     * the Order is CANCELLED)
     * <p>
     * @return the Cancelled Time
     * @see DateTime
     */
    public String getCancelledTime() {
        return this.cancelledTime.getDateTime();
    }
}
