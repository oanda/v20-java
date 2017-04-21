package com.oanda.v20.order;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.pricing.PriceValue;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.trade.TradeID;
import com.oanda.v20.transaction.ClientExtensions;
import com.oanda.v20.transaction.ClientID;

/**
 * A TrailingStopLossOrderRequest specifies the parameters that may be set when
 * creating a Trailing Stop Loss Order.
 * <p>
 * Trailing Stop Loss for Trade {tradeID} @ {trailingStopValue}
 */
public class TrailingStopLossOrderRequest implements OrderRequest {

    /**
     * Default constructor.
     */
    public TrailingStopLossOrderRequest() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the TrailingStopLossOrderRequest to copy
     */
    public TrailingStopLossOrderRequest(TrailingStopLossOrderRequest other) {
        this.type = other.type;
        this.tradeID = other.tradeID;
        this.clientTradeID = other.clientTradeID;
        this.distance = other.distance;
        this.timeInForce = other.timeInForce;
        this.gtdTime = other.gtdTime;
        this.triggerCondition = other.triggerCondition;
        if (other.clientExtensions != null)
        {
            this.clientExtensions = new ClientExtensions(other.clientExtensions);
        }
    }

    @SerializedName("type") private OrderType type = OrderType.TRAILING_STOP_LOSS;

    /**
     * Get the Type
     * <p>
     * The type of the Order to Create. Must be set to "TRAILING_STOP_LOSS"
     * when creating a Trailng Stop Loss Order.
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
     * The type of the Order to Create. Must be set to "TRAILING_STOP_LOSS"
     * when creating a Trailng Stop Loss Order.
     * <p>
     * @param type the Type as an OrderType
     * @return {@link TrailingStopLossOrderRequest
     * TrailingStopLossOrderRequest}
     * @see OrderType
     */
    public TrailingStopLossOrderRequest setType(OrderType type) {
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
     * @return {@link TrailingStopLossOrderRequest
     * TrailingStopLossOrderRequest}
     * @see TradeID
     */
    public TrailingStopLossOrderRequest setTradeID(TradeID tradeID) {
        this.tradeID = tradeID;
        return this;
    }
    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade to close when the price threshold is breached.
     * <p>
     * @param tradeID the Trade ID as a String
     * @return {@link TrailingStopLossOrderRequest
     * TrailingStopLossOrderRequest}
     * @see TradeID
     */
    public TrailingStopLossOrderRequest setTradeID(String tradeID) {
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
     * @return {@link TrailingStopLossOrderRequest
     * TrailingStopLossOrderRequest}
     * @see ClientID
     */
    public TrailingStopLossOrderRequest setClientTradeID(ClientID clientTradeID) {
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
     * @return {@link TrailingStopLossOrderRequest
     * TrailingStopLossOrderRequest}
     * @see ClientID
     */
    public TrailingStopLossOrderRequest setClientTradeID(String clientTradeID) {
        this.clientTradeID = new ClientID(clientTradeID);
        return this;
    }

    @SerializedName("distance") private PriceValue distance;

    /**
     * Get the Price Distance
     * <p>
     * The price distance specified for the TrailingStopLoss Order.
     * <p>
     * @return the Price Distance
     * @see PriceValue
     */
    public PriceValue getDistance() {
        return this.distance;
    }

    /**
     * Set the Price Distance
     * <p>
     * The price distance specified for the TrailingStopLoss Order.
     * <p>
     * @param distance the Price Distance as a PriceValue
     * @return {@link TrailingStopLossOrderRequest
     * TrailingStopLossOrderRequest}
     * @see PriceValue
     */
    public TrailingStopLossOrderRequest setDistance(PriceValue distance) {
        this.distance = distance;
        return this;
    }
    /**
     * Set the Price Distance
     * <p>
     * The price distance specified for the TrailingStopLoss Order.
     * <p>
     * @param distance the Price Distance as a String
     * @return {@link TrailingStopLossOrderRequest
     * TrailingStopLossOrderRequest}
     * @see PriceValue
     */
    public TrailingStopLossOrderRequest setDistance(String distance) {
        this.distance = new PriceValue(distance);
        return this;
    }
    /**
     * Set the Price Distance
     * <p>
     * The price distance specified for the TrailingStopLoss Order.
     * <p>
     * @param distance the Price Distance as a double
     * @return {@link TrailingStopLossOrderRequest
     * TrailingStopLossOrderRequest}
     * @see PriceValue
     */
    public TrailingStopLossOrderRequest setDistance(double distance) {
        this.distance = new PriceValue(distance);
        return this;
    }
    /**
     * Set the Price Distance
     * <p>
     * The price distance specified for the TrailingStopLoss Order.
     * <p>
     * @param distance the Price Distance as a BigDecimal
     * @return {@link TrailingStopLossOrderRequest
     * TrailingStopLossOrderRequest}
     * @see PriceValue
     */
    public TrailingStopLossOrderRequest setDistance(BigDecimal distance) {
        this.distance = new PriceValue(distance);
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
     * @return {@link TrailingStopLossOrderRequest
     * TrailingStopLossOrderRequest}
     * @see TimeInForce
     */
    public TrailingStopLossOrderRequest setTimeInForce(TimeInForce timeInForce) {
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
     * @return {@link TrailingStopLossOrderRequest
     * TrailingStopLossOrderRequest}
     * @see DateTime
     */
    public TrailingStopLossOrderRequest setGtdTime(DateTime gtdTime) {
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
     * @return {@link TrailingStopLossOrderRequest
     * TrailingStopLossOrderRequest}
     * @see DateTime
     */
    public TrailingStopLossOrderRequest setGtdTime(String gtdTime) {
        this.gtdTime = new DateTime(gtdTime);
        return this;
    }

    @SerializedName("triggerCondition") private OrderTriggerCondition triggerCondition = OrderTriggerCondition.DEFAULT;

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

    /**
     * Set the Trigger Condition
     * <p>
     * Specification of what component of a price should be used for comparison
     * when determining if the Order should be filled.
     * <p>
     * @param triggerCondition the Trigger Condition as an
     * OrderTriggerCondition
     * @return {@link TrailingStopLossOrderRequest
     * TrailingStopLossOrderRequest}
     * @see OrderTriggerCondition
     */
    public TrailingStopLossOrderRequest setTriggerCondition(OrderTriggerCondition triggerCondition) {
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
     * @return {@link TrailingStopLossOrderRequest
     * TrailingStopLossOrderRequest}
     * @see ClientExtensions
     */
    public TrailingStopLossOrderRequest setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }
}
