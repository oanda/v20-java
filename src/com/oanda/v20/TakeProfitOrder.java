package com.oanda.v20;

import com.oanda.v20.OrderState;
import com.oanda.v20.OrderType;
import com.oanda.v20.TimeInForce;
import com.oanda.v20.OrderTriggerCondition;
import com.google.gson.annotations.SerializedName;

/**
 * A TakeProfitOrder is an order that is linked to an open Trade and created
 * with a price threshold. The Order will be filled (closing the Trade) by the
 * first price that is equal to or better than the threshold. A TakeProfitOrder
 * cannot be used to open a new Position.
 * <p>
 * Take Profit for Trade {tradeID} @ {price}
 */
public class TakeProfitOrder implements Order {

    @SerializedName("id") private OrderID id;

    /**
     * Set the Order ID
     * <p>
     * The Order's identifier, unique within the Order's Account.
     * <p>
     * @param id the Order ID
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see OrderID
     */
    public TakeProfitOrder setId(String id) {
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see DateTime
     */
    public TakeProfitOrder setCreateTime(String createTime) {
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see OrderState
     */
    public TakeProfitOrder setState(OrderState state) {
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see ClientExtensions
     */
    public TakeProfitOrder setClientExtensions(ClientExtensions clientExtensions) {
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

    @SerializedName("tradeID") private TradeID tradeID;

    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade to close when the price threshold is breached.
     * <p>
     * @param tradeID the Trade ID
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see TradeID
     */
    public TakeProfitOrder setTradeID(String tradeID) {
        this.tradeID = new TradeID(tradeID);
        return this;
    }

    /**
     * Get the Trade ID
     * <p>
     * The ID of the Trade to close when the price threshold is breached.
     * <p>
     * @return the Trade ID
     * @see TradeID
     */
    public String getTradeID() {
        return this.tradeID.getTradeID();
    }

    @SerializedName("clientTradeID") private ClientID clientTradeID;

    /**
     * Set the Client Trade ID
     * <p>
     * The client ID of the Trade to be closed when the price threshold is
     * breached.
     * <p>
     * @param clientTradeID the Client Trade ID
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see ClientID
     */
    public TakeProfitOrder setClientTradeID(String clientTradeID) {
        this.clientTradeID = new ClientID(clientTradeID);
        return this;
    }

    /**
     * Get the Client Trade ID
     * <p>
     * The client ID of the Trade to be closed when the price threshold is
     * breached.
     * <p>
     * @return the Client Trade ID
     * @see ClientID
     */
    public String getClientTradeID() {
        return this.clientTradeID.getClientID();
    }

    @SerializedName("price") private PriceValue price;

    /**
     * Set the Price
     * <p>
     * The price threshold specified for the TakeProfit Order. The associated
     * Trade will be closed by a market price that is equal to or better than
     * this threshold.
     * <p>
     * @param price the Price
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see PriceValue
     */
    public TakeProfitOrder setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }

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
    public double getPrice() {
        return this.price.getPriceValue();
    }

    @SerializedName("timeInForce") private TimeInForce timeInForce = TimeInForce.GTC;

    /**
     * Set the Time In Force
     * <p>
     * The time-in-force requested for the TakeProfit Order. Restricted to
     * "GTC", "GFD" and "GTD" for TakeProfit Orders.
     * <p>
     * @param timeInForce the Time In Force
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see TimeInForce
     */
    public TakeProfitOrder setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

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

    @SerializedName("gtdTime") private DateTime gtdTime;

    /**
     * Set the GTD Time
     * <p>
     * The date/time when the TakeProfit Order will be cancelled if its
     * timeInForce is "GTD".
     * <p>
     * @param gtdTime the GTD Time
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see DateTime
     */
    public TakeProfitOrder setGtdTime(String gtdTime) {
        this.gtdTime = new DateTime(gtdTime);
        return this;
    }

    /**
     * Get the GTD Time
     * <p>
     * The date/time when the TakeProfit Order will be cancelled if its
     * timeInForce is "GTD".
     * <p>
     * @return the GTD Time
     * @see DateTime
     */
    public String getGtdTime() {
        return this.gtdTime.getDateTime();
    }

    @SerializedName("triggerCondition") private OrderTriggerCondition triggerCondition = OrderTriggerCondition.DEFAULT;

    /**
     * Set the Trigger Condition
     * <p>
     * Specification of what component of a price should be used for comparison
     * when determining if the Order should be filled.
     * <p>
     * @param triggerCondition the Trigger Condition
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see OrderTriggerCondition
     */
    public TakeProfitOrder setTriggerCondition(OrderTriggerCondition triggerCondition) {
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

    @SerializedName("fillingTransactionID") private TransactionID fillingTransactionID;

    /**
     * Set the Filling Transaction ID
     * <p>
     * ID of the Transaction that filled this Order (only provided when the
     * Order's state is FILLED)
     * <p>
     * @param fillingTransactionID the Filling Transaction ID
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see TransactionID
     */
    public TakeProfitOrder setFillingTransactionID(String fillingTransactionID) {
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see DateTime
     */
    public TakeProfitOrder setFilledTime(String filledTime) {
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see TradeID
     */
    public TakeProfitOrder setTradeOpenedID(String tradeOpenedID) {
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see TradeID
     */
    public TakeProfitOrder setTradeReducedID(String tradeReducedID) {
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see TradeID
     */
    public TakeProfitOrder setTradeClosedIDs(TradeID[] tradeClosedIDs) {
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see TransactionID
     */
    public TakeProfitOrder setCancellingTransactionID(String cancellingTransactionID) {
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
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see DateTime
     */
    public TakeProfitOrder setCancelledTime(String cancelledTime) {
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

    @SerializedName("replacesOrderID") private OrderID replacesOrderID;

    /**
     * Set the Replaces Order ID
     * <p>
     * The ID of the Order that was replaced by this Order (only provided if
     * this Order was created as part of a cancel/replace).
     * <p>
     * @param replacesOrderID the Replaces Order ID
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see OrderID
     */
    public TakeProfitOrder setReplacesOrderID(String replacesOrderID) {
        this.replacesOrderID = new OrderID(replacesOrderID);
        return this;
    }

    /**
     * Get the Replaces Order ID
     * <p>
     * The ID of the Order that was replaced by this Order (only provided if
     * this Order was created as part of a cancel/replace).
     * <p>
     * @return the Replaces Order ID
     * @see OrderID
     */
    public String getReplacesOrderID() {
        return this.replacesOrderID.getOrderID();
    }

    @SerializedName("replacedByOrderID") private OrderID replacedByOrderID;

    /**
     * Set the Replaced by Order ID
     * <p>
     * The ID of the Order that replaced this Order (only provided if this
     * Order was cancelled as part of a cancel/replace).
     * <p>
     * @param replacedByOrderID the Replaced by Order ID
     * @return {@link TakeProfitOrder TakeProfitOrder}
     * @see OrderID
     */
    public TakeProfitOrder setReplacedByOrderID(String replacedByOrderID) {
        this.replacedByOrderID = new OrderID(replacedByOrderID);
        return this;
    }

    /**
     * Get the Replaced by Order ID
     * <p>
     * The ID of the Order that replaced this Order (only provided if this
     * Order was cancelled as part of a cancel/replace).
     * <p>
     * @return the Replaced by Order ID
     * @see OrderID
     */
    public String getReplacedByOrderID() {
        return this.replacedByOrderID.getOrderID();
    }
}
