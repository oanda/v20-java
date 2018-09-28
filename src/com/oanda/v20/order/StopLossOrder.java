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
 * A StopLossOrder is an order that is linked to an open Trade and created with
 * a price threshold. The Order will be filled (closing the Trade) by the first
 * price that is equal to or worse than the threshold. A StopLossOrder cannot
 * be used to open a new Position.
 * <p>
 * Stop Loss for Trade {tradeID} @ {price}
 */
public class StopLossOrder implements Order {

    /**
     * Default constructor.
     */
    public StopLossOrder() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the StopLossOrder to copy
     */
    public StopLossOrder(StopLossOrder other) {
        this.id = other.id;
        this.createTime = other.createTime;
        this.state = other.state;
        if (other.clientExtensions != null)
        {
            this.clientExtensions = new ClientExtensions(other.clientExtensions);
        }
        this.type = other.type;
        this.guaranteedExecutionPremium = other.guaranteedExecutionPremium;
        this.tradeID = other.tradeID;
        this.clientTradeID = other.clientTradeID;
        this.price = other.price;
        this.distance = other.distance;
        this.timeInForce = other.timeInForce;
        this.gtdTime = other.gtdTime;
        this.triggerCondition = other.triggerCondition;
        if (other.guaranteed != null)
        {
            this.guaranteed = new Boolean(other.guaranteed);
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see OrderID
     */
    public StopLossOrder setId(OrderID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Order ID
     * <p>
     * The Order's identifier, unique within the Order's Account.
     * <p>
     * @param id the Order ID as a String
     * @return {@link StopLossOrder StopLossOrder}
     * @see OrderID
     */
    public StopLossOrder setId(String id) {
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see DateTime
     */
    public StopLossOrder setCreateTime(DateTime createTime) {
        this.createTime = createTime;
        return this;
    }
    /**
     * Set the Create Time
     * <p>
     * The time when the Order was created.
     * <p>
     * @param createTime the Create Time as a String
     * @return {@link StopLossOrder StopLossOrder}
     * @see DateTime
     */
    public StopLossOrder setCreateTime(String createTime) {
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see OrderState
     */
    public StopLossOrder setState(OrderState state) {
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see ClientExtensions
     */
    public StopLossOrder setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

    @SerializedName("type") private OrderType type = OrderType.STOP_LOSS;

    /**
     * Get the Type
     * <p>
     * The type of the Order. Always set to "STOP_LOSS" for Stop Loss Orders.
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
     * The type of the Order. Always set to "STOP_LOSS" for Stop Loss Orders.
     * <p>
     * @param type the Type as an OrderType
     * @return {@link StopLossOrder StopLossOrder}
     * @see OrderType
     */
    public StopLossOrder setType(OrderType type) {
        this.type = type;
        return this;
    }

    @SerializedName("guaranteedExecutionPremium") private DecimalNumber guaranteedExecutionPremium;

    /**
     * Get the Guaranteed Execution Fee
     * <p>
     * The premium that will be charged if the Stop Loss Order is guaranteed
     * and the Order is filled at the guaranteed price. It is in price units
     * and is charged for each unit of the Trade.
     * <p>
     * @return the Guaranteed Execution Fee
     * @see DecimalNumber
     */
    public DecimalNumber getGuaranteedExecutionPremium() {
        return this.guaranteedExecutionPremium;
    }

    /**
     * Set the Guaranteed Execution Fee
     * <p>
     * The premium that will be charged if the Stop Loss Order is guaranteed
     * and the Order is filled at the guaranteed price. It is in price units
     * and is charged for each unit of the Trade.
     * <p>
     * @param guaranteedExecutionPremium the Guaranteed Execution Fee as a
     * DecimalNumber
     * @return {@link StopLossOrder StopLossOrder}
     * @see DecimalNumber
     */
    public StopLossOrder setGuaranteedExecutionPremium(DecimalNumber guaranteedExecutionPremium) {
        this.guaranteedExecutionPremium = guaranteedExecutionPremium;
        return this;
    }
    /**
     * Set the Guaranteed Execution Fee
     * <p>
     * The premium that will be charged if the Stop Loss Order is guaranteed
     * and the Order is filled at the guaranteed price. It is in price units
     * and is charged for each unit of the Trade.
     * <p>
     * @param guaranteedExecutionPremium the Guaranteed Execution Fee as a
     * String
     * @return {@link StopLossOrder StopLossOrder}
     * @see DecimalNumber
     */
    public StopLossOrder setGuaranteedExecutionPremium(String guaranteedExecutionPremium) {
        this.guaranteedExecutionPremium = new DecimalNumber(guaranteedExecutionPremium);
        return this;
    }
    /**
     * Set the Guaranteed Execution Fee
     * <p>
     * The premium that will be charged if the Stop Loss Order is guaranteed
     * and the Order is filled at the guaranteed price. It is in price units
     * and is charged for each unit of the Trade.
     * <p>
     * @param guaranteedExecutionPremium the Guaranteed Execution Fee as a
     * double
     * @return {@link StopLossOrder StopLossOrder}
     * @see DecimalNumber
     */
    public StopLossOrder setGuaranteedExecutionPremium(double guaranteedExecutionPremium) {
        this.guaranteedExecutionPremium = new DecimalNumber(guaranteedExecutionPremium);
        return this;
    }
    /**
     * Set the Guaranteed Execution Fee
     * <p>
     * The premium that will be charged if the Stop Loss Order is guaranteed
     * and the Order is filled at the guaranteed price. It is in price units
     * and is charged for each unit of the Trade.
     * <p>
     * @param guaranteedExecutionPremium the Guaranteed Execution Fee as a
     * BigDecimal
     * @return {@link StopLossOrder StopLossOrder}
     * @see DecimalNumber
     */
    public StopLossOrder setGuaranteedExecutionPremium(BigDecimal guaranteedExecutionPremium) {
        this.guaranteedExecutionPremium = new DecimalNumber(guaranteedExecutionPremium);
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see TradeID
     */
    public StopLossOrder setTradeID(TradeID tradeID) {
        this.tradeID = tradeID;
        return this;
    }
    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade to close when the price threshold is breached.
     * <p>
     * @param tradeID the Trade ID as a String
     * @return {@link StopLossOrder StopLossOrder}
     * @see TradeID
     */
    public StopLossOrder setTradeID(String tradeID) {
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see ClientID
     */
    public StopLossOrder setClientTradeID(ClientID clientTradeID) {
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see ClientID
     */
    public StopLossOrder setClientTradeID(String clientTradeID) {
        this.clientTradeID = new ClientID(clientTradeID);
        return this;
    }

    @SerializedName("price") private PriceValue price;

    /**
     * Get the Price
     * <p>
     * The price threshold specified for the Stop Loss Order. If the guaranteed
     * flag is false, the associated Trade will be closed by a market price
     * that is equal to or worse than this threshold. If the flag is true the
     * associated Trade will be closed at this price.
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
     * The price threshold specified for the Stop Loss Order. If the guaranteed
     * flag is false, the associated Trade will be closed by a market price
     * that is equal to or worse than this threshold. If the flag is true the
     * associated Trade will be closed at this price.
     * <p>
     * @param price the Price as a PriceValue
     * @return {@link StopLossOrder StopLossOrder}
     * @see PriceValue
     */
    public StopLossOrder setPrice(PriceValue price) {
        this.price = price;
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price threshold specified for the Stop Loss Order. If the guaranteed
     * flag is false, the associated Trade will be closed by a market price
     * that is equal to or worse than this threshold. If the flag is true the
     * associated Trade will be closed at this price.
     * <p>
     * @param price the Price as a String
     * @return {@link StopLossOrder StopLossOrder}
     * @see PriceValue
     */
    public StopLossOrder setPrice(String price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price threshold specified for the Stop Loss Order. If the guaranteed
     * flag is false, the associated Trade will be closed by a market price
     * that is equal to or worse than this threshold. If the flag is true the
     * associated Trade will be closed at this price.
     * <p>
     * @param price the Price as a double
     * @return {@link StopLossOrder StopLossOrder}
     * @see PriceValue
     */
    public StopLossOrder setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price threshold specified for the Stop Loss Order. If the guaranteed
     * flag is false, the associated Trade will be closed by a market price
     * that is equal to or worse than this threshold. If the flag is true the
     * associated Trade will be closed at this price.
     * <p>
     * @param price the Price as a BigDecimal
     * @return {@link StopLossOrder StopLossOrder}
     * @see PriceValue
     */
    public StopLossOrder setPrice(BigDecimal price) {
        this.price = new PriceValue(price);
        return this;
    }

    @SerializedName("distance") private DecimalNumber distance;

    /**
     * Get the Price Distance
     * <p>
     * Specifies the distance (in price units) from the Account's current price
     * to use as the Stop Loss Order price. If the Trade is short the
     * Instrument's bid price is used, and for long Trades the ask is used.
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
     * Specifies the distance (in price units) from the Account's current price
     * to use as the Stop Loss Order price. If the Trade is short the
     * Instrument's bid price is used, and for long Trades the ask is used.
     * <p>
     * @param distance the Price Distance as a DecimalNumber
     * @return {@link StopLossOrder StopLossOrder}
     * @see DecimalNumber
     */
    public StopLossOrder setDistance(DecimalNumber distance) {
        this.distance = distance;
        return this;
    }
    /**
     * Set the Price Distance
     * <p>
     * Specifies the distance (in price units) from the Account's current price
     * to use as the Stop Loss Order price. If the Trade is short the
     * Instrument's bid price is used, and for long Trades the ask is used.
     * <p>
     * @param distance the Price Distance as a String
     * @return {@link StopLossOrder StopLossOrder}
     * @see DecimalNumber
     */
    public StopLossOrder setDistance(String distance) {
        this.distance = new DecimalNumber(distance);
        return this;
    }
    /**
     * Set the Price Distance
     * <p>
     * Specifies the distance (in price units) from the Account's current price
     * to use as the Stop Loss Order price. If the Trade is short the
     * Instrument's bid price is used, and for long Trades the ask is used.
     * <p>
     * @param distance the Price Distance as a double
     * @return {@link StopLossOrder StopLossOrder}
     * @see DecimalNumber
     */
    public StopLossOrder setDistance(double distance) {
        this.distance = new DecimalNumber(distance);
        return this;
    }
    /**
     * Set the Price Distance
     * <p>
     * Specifies the distance (in price units) from the Account's current price
     * to use as the Stop Loss Order price. If the Trade is short the
     * Instrument's bid price is used, and for long Trades the ask is used.
     * <p>
     * @param distance the Price Distance as a BigDecimal
     * @return {@link StopLossOrder StopLossOrder}
     * @see DecimalNumber
     */
    public StopLossOrder setDistance(BigDecimal distance) {
        this.distance = new DecimalNumber(distance);
        return this;
    }

    @SerializedName("timeInForce") private TimeInForce timeInForce = TimeInForce.GTC;

    /**
     * Get the Time In Force
     * <p>
     * The time-in-force requested for the StopLoss Order. Restricted to "GTC",
     * "GFD" and "GTD" for StopLoss Orders.
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
     * The time-in-force requested for the StopLoss Order. Restricted to "GTC",
     * "GFD" and "GTD" for StopLoss Orders.
     * <p>
     * @param timeInForce the Time In Force as a TimeInForce
     * @return {@link StopLossOrder StopLossOrder}
     * @see TimeInForce
     */
    public StopLossOrder setTimeInForce(TimeInForce timeInForce) {
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see DateTime
     */
    public StopLossOrder setGtdTime(DateTime gtdTime) {
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see DateTime
     */
    public StopLossOrder setGtdTime(String gtdTime) {
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see OrderTriggerCondition
     */
    public StopLossOrder setTriggerCondition(OrderTriggerCondition triggerCondition) {
        this.triggerCondition = triggerCondition;
        return this;
    }

    @SerializedName("guaranteed") private Boolean guaranteed;

    /**
     * Get the Guaranteed
     * <p>
     * Flag indicating that the Stop Loss Order is guaranteed. The default
     * value depends on the GuaranteedStopLossOrderMode of the account, if it
     * is REQUIRED, the default will be true, for DISABLED or ENABLED the
     * default is false.
     * <p>
     * @return the Guaranteed
     */
    public Boolean getGuaranteed() {
        return this.guaranteed;
    }

    /**
     * Set the Guaranteed
     * <p>
     * Flag indicating that the Stop Loss Order is guaranteed. The default
     * value depends on the GuaranteedStopLossOrderMode of the account, if it
     * is REQUIRED, the default will be true, for DISABLED or ENABLED the
     * default is false.
     * <p>
     * @param guaranteed the Guaranteed as a Boolean
     * @return {@link StopLossOrder StopLossOrder}
     */
    public StopLossOrder setGuaranteed(Boolean guaranteed) {
        this.guaranteed = guaranteed;
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see TransactionID
     */
    public StopLossOrder setFillingTransactionID(TransactionID fillingTransactionID) {
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see TransactionID
     */
    public StopLossOrder setFillingTransactionID(String fillingTransactionID) {
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see DateTime
     */
    public StopLossOrder setFilledTime(DateTime filledTime) {
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see DateTime
     */
    public StopLossOrder setFilledTime(String filledTime) {
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see TradeID
     */
    public StopLossOrder setTradeOpenedID(TradeID tradeOpenedID) {
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see TradeID
     */
    public StopLossOrder setTradeOpenedID(String tradeOpenedID) {
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see TradeID
     */
    public StopLossOrder setTradeReducedID(TradeID tradeReducedID) {
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see TradeID
     */
    public StopLossOrder setTradeReducedID(String tradeReducedID) {
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see TradeID
     */
    public StopLossOrder setTradeClosedIDs(Collection<?> tradeClosedIDs) {
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see TransactionID
     */
    public StopLossOrder setCancellingTransactionID(TransactionID cancellingTransactionID) {
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see TransactionID
     */
    public StopLossOrder setCancellingTransactionID(String cancellingTransactionID) {
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see DateTime
     */
    public StopLossOrder setCancelledTime(DateTime cancelledTime) {
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see DateTime
     */
    public StopLossOrder setCancelledTime(String cancelledTime) {
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see OrderID
     */
    public StopLossOrder setReplacesOrderID(OrderID replacesOrderID) {
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see OrderID
     */
    public StopLossOrder setReplacesOrderID(String replacesOrderID) {
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see OrderID
     */
    public StopLossOrder setReplacedByOrderID(OrderID replacedByOrderID) {
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
     * @return {@link StopLossOrder StopLossOrder}
     * @see OrderID
     */
    public StopLossOrder setReplacedByOrderID(String replacedByOrderID) {
        this.replacedByOrderID = new OrderID(replacedByOrderID);
        return this;
    }

    @Override
    public String toString() {
        return "StopLossOrder(" +
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
            "guaranteedExecutionPremium=" +
                (guaranteedExecutionPremium == null ? "null" : guaranteedExecutionPremium.toString()) + ", " +
            "tradeID=" +
                (tradeID == null ? "null" : tradeID.toString()) + ", " +
            "clientTradeID=" +
                (clientTradeID == null ? "null" : clientTradeID.toString()) + ", " +
            "price=" +
                (price == null ? "null" : price.toString()) + ", " +
            "distance=" +
                (distance == null ? "null" : distance.toString()) + ", " +
            "timeInForce=" +
                (timeInForce == null ? "null" : timeInForce.toString()) + ", " +
            "gtdTime=" +
                (gtdTime == null ? "null" : gtdTime.toString()) + ", " +
            "triggerCondition=" +
                (triggerCondition == null ? "null" : triggerCondition.toString()) + ", " +
            "guaranteed=" +
                (guaranteed == null ? "null" : guaranteed.toString()) + ", " +
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
