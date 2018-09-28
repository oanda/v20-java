package com.oanda.v20.order;

import java.util.ArrayList;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.pricing_common.PriceValue;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.trade.TradeID;
import com.oanda.v20.transaction.ClientExtensions;
import com.oanda.v20.transaction.ClientID;
import com.oanda.v20.transaction.TransactionID;

/**
 * A TakeProfitOrder is an order that is linked to an open Trade and created
 * with a price threshold. The Order will be filled (closing the Trade) by the
 * first price that is equal to or better than the threshold. A TakeProfitOrder
 * cannot be used to open a new Position.
 * <p>
 * Take Profit for Trade {tradeID} @ {price}
 */
public class TakeProfitOrder implements Order {

    /**
     * Default constructor.
     */
    public TakeProfitOrder() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the TakeProfitOrder to copy
     */
    public TakeProfitOrder(TakeProfitOrder other) {
        this.id = other.id;
        this.createTime = other.createTime;
        this.state = other.state;
        if (other.clientExtensions != null)
        {
            this.clientExtensions = new ClientExtensions(other.clientExtensions);
        }
        this.type = other.type;
        this.tradeID = other.tradeID;
        this.clientTradeID = other.clientTradeID;
        this.price = other.price;
        this.timeInForce = other.timeInForce;
        this.gtdTime = other.gtdTime;
        this.triggerCondition = other.triggerCondition;
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
        this.replacesOrderID = other.replacesOrderID;
        this.replacedByOrderID = other.replacedByOrderID;
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see OrderID
     */
    public TakeProfitOrder setId(OrderID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Order ID
     * <p>
     * The Order's identifier, unique within the Order's Account.
     * <p>
     * @param id the Order ID as a String
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see OrderID
     */
    public TakeProfitOrder setId(String id) {
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see DateTime
     */
    public TakeProfitOrder setCreateTime(DateTime createTime) {
        this.createTime = createTime;
        return this;
    }
    /**
     * Set the Create Time
     * <p>
     * The time when the Order was created.
     * <p>
     * @param createTime the Create Time as a String
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see DateTime
     */
    public TakeProfitOrder setCreateTime(String createTime) {
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see OrderState
     */
    public TakeProfitOrder setState(OrderState state) {
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see ClientExtensions
     */
    public TakeProfitOrder setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

    @SerializedName("type") private OrderType type = OrderType.TAKE_PROFIT;

    /**
     * Get the Type
     * <p>
     * The type of the Order. Always set to "TAKE_PROFIT" for Take Profit
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
     * The type of the Order. Always set to "TAKE_PROFIT" for Take Profit
     * Orders.
     * <p>
     * @param type the Type as an OrderType
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see OrderType
     */
    public TakeProfitOrder setType(OrderType type) {
        this.type = type;
        return this;
    }

    @SerializedName("tradeID") private TradeID tradeID;

    /**
     * Get the Trade ID
     * <p>
     * The ID of the Trade to close when the price threshold is breached.
     * <p>
     * @return the Trade ID
     * @see TradeID
     */
    public TradeID getTradeID() {
        return this.tradeID;
    }

    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade to close when the price threshold is breached.
     * <p>
     * @param tradeID the Trade ID as a TradeID
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see TradeID
     */
    public TakeProfitOrder setTradeID(TradeID tradeID) {
        this.tradeID = tradeID;
        return this;
    }
    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade to close when the price threshold is breached.
     * <p>
     * @param tradeID the Trade ID as a String
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see TradeID
     */
    public TakeProfitOrder setTradeID(String tradeID) {
        this.tradeID = new TradeID(tradeID);
        return this;
    }

    @SerializedName("clientTradeID") private ClientID clientTradeID;

    /**
     * Get the Client Trade ID
     * <p>
     * The client ID of the Trade to be closed when the price threshold is
     * breached.
     * <p>
     * @return the Client Trade ID
     * @see ClientID
     */
    public ClientID getClientTradeID() {
        return this.clientTradeID;
    }

    /**
     * Set the Client Trade ID
     * <p>
     * The client ID of the Trade to be closed when the price threshold is
     * breached.
     * <p>
     * @param clientTradeID the Client Trade ID as a ClientID
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see ClientID
     */
    public TakeProfitOrder setClientTradeID(ClientID clientTradeID) {
        this.clientTradeID = clientTradeID;
        return this;
    }
    /**
     * Set the Client Trade ID
     * <p>
     * The client ID of the Trade to be closed when the price threshold is
     * breached.
     * <p>
     * @param clientTradeID the Client Trade ID as a String
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see ClientID
     */
    public TakeProfitOrder setClientTradeID(String clientTradeID) {
        this.clientTradeID = new ClientID(clientTradeID);
        return this;
    }

    @SerializedName("price") private PriceValue price;

    /**
     * Get the Price
     * <p>
     * The price threshold specified for the TakeProfit Order. The associated
     * Trade will be closed by a market price that is equal to or better than
     * this threshold.
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
     * The price threshold specified for the TakeProfit Order. The associated
     * Trade will be closed by a market price that is equal to or better than
     * this threshold.
     * <p>
     * @param price the Price as a PriceValue
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see PriceValue
     */
    public TakeProfitOrder setPrice(PriceValue price) {
        this.price = price;
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price threshold specified for the TakeProfit Order. The associated
     * Trade will be closed by a market price that is equal to or better than
     * this threshold.
     * <p>
     * @param price the Price as a String
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see PriceValue
     */
    public TakeProfitOrder setPrice(String price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price threshold specified for the TakeProfit Order. The associated
     * Trade will be closed by a market price that is equal to or better than
     * this threshold.
     * <p>
     * @param price the Price as a double
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see PriceValue
     */
    public TakeProfitOrder setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price threshold specified for the TakeProfit Order. The associated
     * Trade will be closed by a market price that is equal to or better than
     * this threshold.
     * <p>
     * @param price the Price as a BigDecimal
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see PriceValue
     */
    public TakeProfitOrder setPrice(BigDecimal price) {
        this.price = new PriceValue(price);
        return this;
    }

    @SerializedName("timeInForce") private TimeInForce timeInForce = TimeInForce.GTC;

    /**
     * Get the Time In Force
     * <p>
     * The time-in-force requested for the TakeProfit Order. Restricted to
     * "GTC", "GFD" and "GTD" for TakeProfit Orders.
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
     * The time-in-force requested for the TakeProfit Order. Restricted to
     * "GTC", "GFD" and "GTD" for TakeProfit Orders.
     * <p>
     * @param timeInForce the Time In Force as a TimeInForce
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see TimeInForce
     */
    public TakeProfitOrder setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

    @SerializedName("gtdTime") private DateTime gtdTime;

    /**
     * Get the GTD Time
     * <p>
     * The date/time when the TakeProfit Order will be cancelled if its
     * timeInForce is "GTD".
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
     * The date/time when the TakeProfit Order will be cancelled if its
     * timeInForce is "GTD".
     * <p>
     * @param gtdTime the GTD Time as a DateTime
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see DateTime
     */
    public TakeProfitOrder setGtdTime(DateTime gtdTime) {
        this.gtdTime = gtdTime;
        return this;
    }
    /**
     * Set the GTD Time
     * <p>
     * The date/time when the TakeProfit Order will be cancelled if its
     * timeInForce is "GTD".
     * <p>
     * @param gtdTime the GTD Time as a String
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see DateTime
     */
    public TakeProfitOrder setGtdTime(String gtdTime) {
        this.gtdTime = new DateTime(gtdTime);
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see OrderTriggerCondition
     */
    public TakeProfitOrder setTriggerCondition(OrderTriggerCondition triggerCondition) {
        this.triggerCondition = triggerCondition;
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see TransactionID
     */
    public TakeProfitOrder setFillingTransactionID(TransactionID fillingTransactionID) {
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see TransactionID
     */
    public TakeProfitOrder setFillingTransactionID(String fillingTransactionID) {
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see DateTime
     */
    public TakeProfitOrder setFilledTime(DateTime filledTime) {
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see DateTime
     */
    public TakeProfitOrder setFilledTime(String filledTime) {
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see TradeID
     */
    public TakeProfitOrder setTradeOpenedID(TradeID tradeOpenedID) {
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see TradeID
     */
    public TakeProfitOrder setTradeOpenedID(String tradeOpenedID) {
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see TradeID
     */
    public TakeProfitOrder setTradeReducedID(TradeID tradeReducedID) {
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see TradeID
     */
    public TakeProfitOrder setTradeReducedID(String tradeReducedID) {
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see TradeID
     */
    public TakeProfitOrder setTradeClosedIDs(Collection<?> tradeClosedIDs) {
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see TransactionID
     */
    public TakeProfitOrder setCancellingTransactionID(TransactionID cancellingTransactionID) {
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see TransactionID
     */
    public TakeProfitOrder setCancellingTransactionID(String cancellingTransactionID) {
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see DateTime
     */
    public TakeProfitOrder setCancelledTime(DateTime cancelledTime) {
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see DateTime
     */
    public TakeProfitOrder setCancelledTime(String cancelledTime) {
        this.cancelledTime = new DateTime(cancelledTime);
        return this;
    }

    @SerializedName("replacesOrderID") private OrderID replacesOrderID;

    /**
     * Get the Replaces Order ID
     * <p>
     * The ID of the Order that was replaced by this Order (only provided if
     * this Order was created as part of a cancel/replace).
     * <p>
     * @return the Replaces Order ID
     * @see OrderID
     */
    public OrderID getReplacesOrderID() {
        return this.replacesOrderID;
    }

    /**
     * Set the Replaces Order ID
     * <p>
     * The ID of the Order that was replaced by this Order (only provided if
     * this Order was created as part of a cancel/replace).
     * <p>
     * @param replacesOrderID the Replaces Order ID as an OrderID
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see OrderID
     */
    public TakeProfitOrder setReplacesOrderID(OrderID replacesOrderID) {
        this.replacesOrderID = replacesOrderID;
        return this;
    }
    /**
     * Set the Replaces Order ID
     * <p>
     * The ID of the Order that was replaced by this Order (only provided if
     * this Order was created as part of a cancel/replace).
     * <p>
     * @param replacesOrderID the Replaces Order ID as a String
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see OrderID
     */
    public TakeProfitOrder setReplacesOrderID(String replacesOrderID) {
        this.replacesOrderID = new OrderID(replacesOrderID);
        return this;
    }

    @SerializedName("replacedByOrderID") private OrderID replacedByOrderID;

    /**
     * Get the Replaced by Order ID
     * <p>
     * The ID of the Order that replaced this Order (only provided if this
     * Order was cancelled as part of a cancel/replace).
     * <p>
     * @return the Replaced by Order ID
     * @see OrderID
     */
    public OrderID getReplacedByOrderID() {
        return this.replacedByOrderID;
    }

    /**
     * Set the Replaced by Order ID
     * <p>
     * The ID of the Order that replaced this Order (only provided if this
     * Order was cancelled as part of a cancel/replace).
     * <p>
     * @param replacedByOrderID the Replaced by Order ID as an OrderID
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see OrderID
     */
    public TakeProfitOrder setReplacedByOrderID(OrderID replacedByOrderID) {
        this.replacedByOrderID = replacedByOrderID;
        return this;
    }
    /**
     * Set the Replaced by Order ID
     * <p>
     * The ID of the Order that replaced this Order (only provided if this
     * Order was cancelled as part of a cancel/replace).
     * <p>
     * @param replacedByOrderID the Replaced by Order ID as a String
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see OrderID
     */
    public TakeProfitOrder setReplacedByOrderID(String replacedByOrderID) {
        this.replacedByOrderID = new OrderID(replacedByOrderID);
        return this;
    }

    @Override
    public String toString() {
        return "TakeProfitOrder(" +
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
            "tradeID=" +
                (tradeID == null ? "null" : tradeID.toString()) + ", " +
            "clientTradeID=" +
                (clientTradeID == null ? "null" : clientTradeID.toString()) + ", " +
            "price=" +
                (price == null ? "null" : price.toString()) + ", " +
            "timeInForce=" +
                (timeInForce == null ? "null" : timeInForce.toString()) + ", " +
            "gtdTime=" +
                (gtdTime == null ? "null" : gtdTime.toString()) + ", " +
            "triggerCondition=" +
                (triggerCondition == null ? "null" : triggerCondition.toString()) + ", " +
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
                (cancelledTime == null ? "null" : cancelledTime.toString()) + ", " +
            "replacesOrderID=" +
                (replacesOrderID == null ? "null" : replacesOrderID.toString()) + ", " +
            "replacedByOrderID=" +
                (replacedByOrderID == null ? "null" : replacedByOrderID.toString()) +
            ")";
    }
}
