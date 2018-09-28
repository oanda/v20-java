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
import com.oanda.v20.transaction.StopLossDetails;
import com.oanda.v20.transaction.TakeProfitDetails;
import com.oanda.v20.transaction.TrailingStopLossDetails;
import com.oanda.v20.transaction.TransactionID;

/**
 * A FixedPriceOrder is an order that is filled immediately upon creation using
 * a fixed price.
 * <p>
 * {units} units of {instrument} @ {price}
 */
public class FixedPriceOrder implements Order {

    /**
     * Default constructor.
     */
    public FixedPriceOrder() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the FixedPriceOrder to copy
     */
    public FixedPriceOrder(FixedPriceOrder other) {
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
        this.price = other.price;
        this.positionFill = other.positionFill;
        this.tradeState = other.tradeState;
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
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see OrderID
     */
    public FixedPriceOrder setId(OrderID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Order ID
     * <p>
     * The Order's identifier, unique within the Order's Account.
     * <p>
     * @param id the Order ID as a String
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see OrderID
     */
    public FixedPriceOrder setId(String id) {
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
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see DateTime
     */
    public FixedPriceOrder setCreateTime(DateTime createTime) {
        this.createTime = createTime;
        return this;
    }
    /**
     * Set the Create Time
     * <p>
     * The time when the Order was created.
     * <p>
     * @param createTime the Create Time as a String
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see DateTime
     */
    public FixedPriceOrder setCreateTime(String createTime) {
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
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see OrderState
     */
    public FixedPriceOrder setState(OrderState state) {
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
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see ClientExtensions
     */
    public FixedPriceOrder setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

    @SerializedName("type") private OrderType type = OrderType.FIXED_PRICE;

    /**
     * Get the Type
     * <p>
     * The type of the Order. Always set to "FIXED_PRICE" for Fixed Price
     * Orders.
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
     * The type of the Order. Always set to "FIXED_PRICE" for Fixed Price
     * Orders.
     * <p>
     * @param type the Type as an OrderType
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see OrderType
     */
    public FixedPriceOrder setType(OrderType type) {
        this.type = type;
        return this;
    }

    @SerializedName("instrument") private InstrumentName instrument;

    /**
     * Get the Instrument
     * <p>
     * The Fixed Price Order's Instrument.
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
     * The Fixed Price Order's Instrument.
     * <p>
     * @param instrument the Instrument as an InstrumentName
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see InstrumentName
     */
    public FixedPriceOrder setInstrument(InstrumentName instrument) {
        this.instrument = instrument;
        return this;
    }
    /**
     * Set the Instrument
     * <p>
     * The Fixed Price Order's Instrument.
     * <p>
     * @param instrument the Instrument as a String
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see InstrumentName
     */
    public FixedPriceOrder setInstrument(String instrument) {
        this.instrument = new InstrumentName(instrument);
        return this;
    }

    @SerializedName("units") private DecimalNumber units;

    /**
     * Get the Amount
     * <p>
     * The quantity requested to be filled by the Fixed Price Order. A
     * posititive number of units results in a long Order, and a negative
     * number of units results in a short Order.
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
     * The quantity requested to be filled by the Fixed Price Order. A
     * posititive number of units results in a long Order, and a negative
     * number of units results in a short Order.
     * <p>
     * @param units the Amount as a DecimalNumber
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see DecimalNumber
     */
    public FixedPriceOrder setUnits(DecimalNumber units) {
        this.units = units;
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the Fixed Price Order. A
     * posititive number of units results in a long Order, and a negative
     * number of units results in a short Order.
     * <p>
     * @param units the Amount as a String
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see DecimalNumber
     */
    public FixedPriceOrder setUnits(String units) {
        this.units = new DecimalNumber(units);
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the Fixed Price Order. A
     * posititive number of units results in a long Order, and a negative
     * number of units results in a short Order.
     * <p>
     * @param units the Amount as a double
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see DecimalNumber
     */
    public FixedPriceOrder setUnits(double units) {
        this.units = new DecimalNumber(units);
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the Fixed Price Order. A
     * posititive number of units results in a long Order, and a negative
     * number of units results in a short Order.
     * <p>
     * @param units the Amount as a BigDecimal
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see DecimalNumber
     */
    public FixedPriceOrder setUnits(BigDecimal units) {
        this.units = new DecimalNumber(units);
        return this;
    }

    @SerializedName("price") private PriceValue price;

    /**
     * Get the Price
     * <p>
     * The price specified for the Fixed Price Order. This price is the exact
     * price that the Fixed Price Order will be filled at.
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
     * The price specified for the Fixed Price Order. This price is the exact
     * price that the Fixed Price Order will be filled at.
     * <p>
     * @param price the Price as a PriceValue
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see PriceValue
     */
    public FixedPriceOrder setPrice(PriceValue price) {
        this.price = price;
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price specified for the Fixed Price Order. This price is the exact
     * price that the Fixed Price Order will be filled at.
     * <p>
     * @param price the Price as a String
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see PriceValue
     */
    public FixedPriceOrder setPrice(String price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price specified for the Fixed Price Order. This price is the exact
     * price that the Fixed Price Order will be filled at.
     * <p>
     * @param price the Price as a double
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see PriceValue
     */
    public FixedPriceOrder setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price specified for the Fixed Price Order. This price is the exact
     * price that the Fixed Price Order will be filled at.
     * <p>
     * @param price the Price as a BigDecimal
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see PriceValue
     */
    public FixedPriceOrder setPrice(BigDecimal price) {
        this.price = new PriceValue(price);
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
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see OrderPositionFill
     */
    public FixedPriceOrder setPositionFill(OrderPositionFill positionFill) {
        this.positionFill = positionFill;
        return this;
    }

    @SerializedName("tradeState") private String tradeState;

    /**
     * Get the TradeState
     * <p>
     * The state that the trade resulting from the Fixed Price Order should be
     * set to.
     * <p>
     * @return the TradeState
     */
    public String getTradeState() {
        return this.tradeState;
    }

    /**
     * Set the TradeState
     * <p>
     * The state that the trade resulting from the Fixed Price Order should be
     * set to.
     * <p>
     * @param tradeState the TradeState as a String
     * @return {@link FixedPriceOrder FixedPriceOrder}
     */
    public FixedPriceOrder setTradeState(String tradeState) {
        this.tradeState = tradeState;
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
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see TakeProfitDetails
     */
    public FixedPriceOrder setTakeProfitOnFill(TakeProfitDetails takeProfitOnFill) {
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
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see StopLossDetails
     */
    public FixedPriceOrder setStopLossOnFill(StopLossDetails stopLossOnFill) {
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
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see TrailingStopLossDetails
     */
    public FixedPriceOrder setTrailingStopLossOnFill(TrailingStopLossDetails trailingStopLossOnFill) {
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
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see ClientExtensions
     */
    public FixedPriceOrder setTradeClientExtensions(ClientExtensions tradeClientExtensions) {
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
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see TransactionID
     */
    public FixedPriceOrder setFillingTransactionID(TransactionID fillingTransactionID) {
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
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see TransactionID
     */
    public FixedPriceOrder setFillingTransactionID(String fillingTransactionID) {
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
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see DateTime
     */
    public FixedPriceOrder setFilledTime(DateTime filledTime) {
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
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see DateTime
     */
    public FixedPriceOrder setFilledTime(String filledTime) {
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
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see TradeID
     */
    public FixedPriceOrder setTradeOpenedID(TradeID tradeOpenedID) {
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
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see TradeID
     */
    public FixedPriceOrder setTradeOpenedID(String tradeOpenedID) {
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
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see TradeID
     */
    public FixedPriceOrder setTradeReducedID(TradeID tradeReducedID) {
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
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see TradeID
     */
    public FixedPriceOrder setTradeReducedID(String tradeReducedID) {
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
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see TradeID
     */
    public FixedPriceOrder setTradeClosedIDs(Collection<?> tradeClosedIDs) {
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
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see TransactionID
     */
    public FixedPriceOrder setCancellingTransactionID(TransactionID cancellingTransactionID) {
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
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see TransactionID
     */
    public FixedPriceOrder setCancellingTransactionID(String cancellingTransactionID) {
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
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see DateTime
     */
    public FixedPriceOrder setCancelledTime(DateTime cancelledTime) {
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
     * @return {@link FixedPriceOrder FixedPriceOrder}
     * @see DateTime
     */
    public FixedPriceOrder setCancelledTime(String cancelledTime) {
        this.cancelledTime = new DateTime(cancelledTime);
        return this;
    }

    @Override
    public String toString() {
        return "FixedPriceOrder(" +
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
            "price=" +
                (price == null ? "null" : price.toString()) + ", " +
            "positionFill=" +
                (positionFill == null ? "null" : positionFill.toString()) + ", " +
            "tradeState=" +
                (tradeState == null ? "null" : tradeState.toString()) + ", " +
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
