package com.oanda.v20.order;

import java.util.ArrayList;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.pricing_common.PriceValue;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.primitives.DecimalNumber;
import com.oanda.v20.trade.TradeID;
import com.oanda.v20.transaction.ClientExtensions;
import com.oanda.v20.transaction.ClientID;
import com.oanda.v20.transaction.TransactionID;

/**
 * A TrailingStopLossOrder is an order that is linked to an open Trade and
 * created with a price distance. The price distance is used to calculate a
 * trailing stop value for the order that is in the losing direction from the
 * market price at the time of the order's creation. The trailing stop value
 * will follow the market price as it moves in the winning direction, and the
 * order will filled (closing the Trade) by the first price that is equal to or
 * worse than the trailing stop value. A TrailingStopLossOrder cannot be used
 * to open a new Position.
 * <p>
 * Trailing Stop Loss for Trade {tradeID} @ {trailingStopValue}
 */
public class TrailingStopLossOrder implements Order {

    /**
     * Default constructor.
     */
    public TrailingStopLossOrder() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the TrailingStopLossOrder to copy
     */
    public TrailingStopLossOrder(TrailingStopLossOrder other) {
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
        this.distance = other.distance;
        this.timeInForce = other.timeInForce;
        this.gtdTime = other.gtdTime;
        this.triggerCondition = other.triggerCondition;
        this.trailingStopValue = other.trailingStopValue;
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
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see OrderID
     */
    public TrailingStopLossOrder setId(OrderID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Order ID
     * <p>
     * The Order's identifier, unique within the Order's Account.
     * <p>
     * @param id the Order ID as a String
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see OrderID
     */
    public TrailingStopLossOrder setId(String id) {
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
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see DateTime
     */
    public TrailingStopLossOrder setCreateTime(DateTime createTime) {
        this.createTime = createTime;
        return this;
    }
    /**
     * Set the Create Time
     * <p>
     * The time when the Order was created.
     * <p>
     * @param createTime the Create Time as a String
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see DateTime
     */
    public TrailingStopLossOrder setCreateTime(String createTime) {
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
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see OrderState
     */
    public TrailingStopLossOrder setState(OrderState state) {
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
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see ClientExtensions
     */
    public TrailingStopLossOrder setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

    @SerializedName("type") private OrderType type = OrderType.TRAILING_STOP_LOSS;

    /**
     * Get the Type
     * <p>
     * The type of the Order. Always set to "TRAILING_STOP_LOSS" for Trailing
     * Stop Loss Orders.
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
     * The type of the Order. Always set to "TRAILING_STOP_LOSS" for Trailing
     * Stop Loss Orders.
     * <p>
     * @param type the Type as an OrderType
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see OrderType
     */
    public TrailingStopLossOrder setType(OrderType type) {
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
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see TradeID
     */
    public TrailingStopLossOrder setTradeID(TradeID tradeID) {
        this.tradeID = tradeID;
        return this;
    }
    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade to close when the price threshold is breached.
     * <p>
     * @param tradeID the Trade ID as a String
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see TradeID
     */
    public TrailingStopLossOrder setTradeID(String tradeID) {
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
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see ClientID
     */
    public TrailingStopLossOrder setClientTradeID(ClientID clientTradeID) {
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
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see ClientID
     */
    public TrailingStopLossOrder setClientTradeID(String clientTradeID) {
        this.clientTradeID = new ClientID(clientTradeID);
        return this;
    }

    @SerializedName("distance") private DecimalNumber distance;

    /**
     * Get the Price Distance
     * <p>
     * The price distance (in price units) specified for the TrailingStopLoss
     * Order.
     * <p>
     * @return the Price Distance
     * @see DecimalNumber
     */
    public DecimalNumber getDistance() {
        return this.distance;
    }

    /**
     * Set the Price Distance
     * <p>
     * The price distance (in price units) specified for the TrailingStopLoss
     * Order.
     * <p>
     * @param distance the Price Distance as a DecimalNumber
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see DecimalNumber
     */
    public TrailingStopLossOrder setDistance(DecimalNumber distance) {
        this.distance = distance;
        return this;
    }
    /**
     * Set the Price Distance
     * <p>
     * The price distance (in price units) specified for the TrailingStopLoss
     * Order.
     * <p>
     * @param distance the Price Distance as a String
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see DecimalNumber
     */
    public TrailingStopLossOrder setDistance(String distance) {
        this.distance = new DecimalNumber(distance);
        return this;
    }
    /**
     * Set the Price Distance
     * <p>
     * The price distance (in price units) specified for the TrailingStopLoss
     * Order.
     * <p>
     * @param distance the Price Distance as a double
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see DecimalNumber
     */
    public TrailingStopLossOrder setDistance(double distance) {
        this.distance = new DecimalNumber(distance);
        return this;
    }
    /**
     * Set the Price Distance
     * <p>
     * The price distance (in price units) specified for the TrailingStopLoss
     * Order.
     * <p>
     * @param distance the Price Distance as a BigDecimal
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see DecimalNumber
     */
    public TrailingStopLossOrder setDistance(BigDecimal distance) {
        this.distance = new DecimalNumber(distance);
        return this;
    }

    @SerializedName("timeInForce") private TimeInForce timeInForce = TimeInForce.GTC;

    /**
     * Get the Time In Force
     * <p>
     * The time-in-force requested for the TrailingStopLoss Order. Restricted
     * to "GTC", "GFD" and "GTD" for TrailingStopLoss Orders.
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
     * The time-in-force requested for the TrailingStopLoss Order. Restricted
     * to "GTC", "GFD" and "GTD" for TrailingStopLoss Orders.
     * <p>
     * @param timeInForce the Time In Force as a TimeInForce
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see TimeInForce
     */
    public TrailingStopLossOrder setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

    @SerializedName("gtdTime") private DateTime gtdTime;

    /**
     * Get the GTD Time
     * <p>
     * The date/time when the StopLoss Order will be cancelled if its
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
     * The date/time when the StopLoss Order will be cancelled if its
     * timeInForce is "GTD".
     * <p>
     * @param gtdTime the GTD Time as a DateTime
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see DateTime
     */
    public TrailingStopLossOrder setGtdTime(DateTime gtdTime) {
        this.gtdTime = gtdTime;
        return this;
    }
    /**
     * Set the GTD Time
     * <p>
     * The date/time when the StopLoss Order will be cancelled if its
     * timeInForce is "GTD".
     * <p>
     * @param gtdTime the GTD Time as a String
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see DateTime
     */
    public TrailingStopLossOrder setGtdTime(String gtdTime) {
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
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see OrderTriggerCondition
     */
    public TrailingStopLossOrder setTriggerCondition(OrderTriggerCondition triggerCondition) {
        this.triggerCondition = triggerCondition;
        return this;
    }

    @SerializedName("trailingStopValue") private PriceValue trailingStopValue;

    /**
     * Get the Trailing Stop Loss Value
     * <p>
     * The trigger price for the Trailing Stop Loss Order. The trailing stop
     * value will trail (follow) the market price by the TSL order's configured
     * "distance" as the market price moves in the winning direction. If the
     * market price moves to a level that is equal to or worse than the
     * trailing stop value, the order will be filled and the Trade will be
     * closed.
     * <p>
     * @return the Trailing Stop Loss Value
     * @see PriceValue
     */
    public PriceValue getTrailingStopValue() {
        return this.trailingStopValue;
    }

    /**
     * Set the Trailing Stop Loss Value
     * <p>
     * The trigger price for the Trailing Stop Loss Order. The trailing stop
     * value will trail (follow) the market price by the TSL order's configured
     * "distance" as the market price moves in the winning direction. If the
     * market price moves to a level that is equal to or worse than the
     * trailing stop value, the order will be filled and the Trade will be
     * closed.
     * <p>
     * @param trailingStopValue the Trailing Stop Loss Value as a PriceValue
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see PriceValue
     */
    public TrailingStopLossOrder setTrailingStopValue(PriceValue trailingStopValue) {
        this.trailingStopValue = trailingStopValue;
        return this;
    }
    /**
     * Set the Trailing Stop Loss Value
     * <p>
     * The trigger price for the Trailing Stop Loss Order. The trailing stop
     * value will trail (follow) the market price by the TSL order's configured
     * "distance" as the market price moves in the winning direction. If the
     * market price moves to a level that is equal to or worse than the
     * trailing stop value, the order will be filled and the Trade will be
     * closed.
     * <p>
     * @param trailingStopValue the Trailing Stop Loss Value as a String
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see PriceValue
     */
    public TrailingStopLossOrder setTrailingStopValue(String trailingStopValue) {
        this.trailingStopValue = new PriceValue(trailingStopValue);
        return this;
    }
    /**
     * Set the Trailing Stop Loss Value
     * <p>
     * The trigger price for the Trailing Stop Loss Order. The trailing stop
     * value will trail (follow) the market price by the TSL order's configured
     * "distance" as the market price moves in the winning direction. If the
     * market price moves to a level that is equal to or worse than the
     * trailing stop value, the order will be filled and the Trade will be
     * closed.
     * <p>
     * @param trailingStopValue the Trailing Stop Loss Value as a double
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see PriceValue
     */
    public TrailingStopLossOrder setTrailingStopValue(double trailingStopValue) {
        this.trailingStopValue = new PriceValue(trailingStopValue);
        return this;
    }
    /**
     * Set the Trailing Stop Loss Value
     * <p>
     * The trigger price for the Trailing Stop Loss Order. The trailing stop
     * value will trail (follow) the market price by the TSL order's configured
     * "distance" as the market price moves in the winning direction. If the
     * market price moves to a level that is equal to or worse than the
     * trailing stop value, the order will be filled and the Trade will be
     * closed.
     * <p>
     * @param trailingStopValue the Trailing Stop Loss Value as a BigDecimal
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see PriceValue
     */
    public TrailingStopLossOrder setTrailingStopValue(BigDecimal trailingStopValue) {
        this.trailingStopValue = new PriceValue(trailingStopValue);
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
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see TransactionID
     */
    public TrailingStopLossOrder setFillingTransactionID(TransactionID fillingTransactionID) {
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
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see TransactionID
     */
    public TrailingStopLossOrder setFillingTransactionID(String fillingTransactionID) {
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
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see DateTime
     */
    public TrailingStopLossOrder setFilledTime(DateTime filledTime) {
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
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see DateTime
     */
    public TrailingStopLossOrder setFilledTime(String filledTime) {
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
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see TradeID
     */
    public TrailingStopLossOrder setTradeOpenedID(TradeID tradeOpenedID) {
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
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see TradeID
     */
    public TrailingStopLossOrder setTradeOpenedID(String tradeOpenedID) {
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
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see TradeID
     */
    public TrailingStopLossOrder setTradeReducedID(TradeID tradeReducedID) {
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
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see TradeID
     */
    public TrailingStopLossOrder setTradeReducedID(String tradeReducedID) {
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
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see TradeID
     */
    public TrailingStopLossOrder setTradeClosedIDs(Collection<?> tradeClosedIDs) {
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
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see TransactionID
     */
    public TrailingStopLossOrder setCancellingTransactionID(TransactionID cancellingTransactionID) {
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
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see TransactionID
     */
    public TrailingStopLossOrder setCancellingTransactionID(String cancellingTransactionID) {
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
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see DateTime
     */
    public TrailingStopLossOrder setCancelledTime(DateTime cancelledTime) {
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
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see DateTime
     */
    public TrailingStopLossOrder setCancelledTime(String cancelledTime) {
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
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see OrderID
     */
    public TrailingStopLossOrder setReplacesOrderID(OrderID replacesOrderID) {
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
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see OrderID
     */
    public TrailingStopLossOrder setReplacesOrderID(String replacesOrderID) {
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
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see OrderID
     */
    public TrailingStopLossOrder setReplacedByOrderID(OrderID replacedByOrderID) {
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
     * @return {@link TrailingStopLossOrder TrailingStopLossOrder}
     * @see OrderID
     */
    public TrailingStopLossOrder setReplacedByOrderID(String replacedByOrderID) {
        this.replacedByOrderID = new OrderID(replacedByOrderID);
        return this;
    }

    @Override
    public String toString() {
        return "TrailingStopLossOrder(" +
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
            "distance=" +
                (distance == null ? "null" : distance.toString()) + ", " +
            "timeInForce=" +
                (timeInForce == null ? "null" : timeInForce.toString()) + ", " +
            "gtdTime=" +
                (gtdTime == null ? "null" : gtdTime.toString()) + ", " +
            "triggerCondition=" +
                (triggerCondition == null ? "null" : triggerCondition.toString()) + ", " +
            "trailingStopValue=" +
                (trailingStopValue == null ? "null" : trailingStopValue.toString()) + ", " +
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
