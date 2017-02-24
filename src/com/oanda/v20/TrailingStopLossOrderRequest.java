package com.oanda.v20;

import com.oanda.v20.OrderType;
import com.oanda.v20.TimeInForce;
import com.oanda.v20.OrderTriggerCondition;
import com.google.gson.annotations.SerializedName;

/**
 * A TrailingStopLossOrderRequest specifies the parameters that may be set when
 * creating a Trailing Stop Loss Order.
 * <p>
 * Trailing Stop Loss for Trade {tradeID} @ {trailingStopValue}
 */
public class TrailingStopLossOrderRequest implements OrderRequest {

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

    @SerializedName("tradeID") private TradeID tradeID;

    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade to close when the price threshold is breached.
     * <p>
     * @param tradeID the Trade ID
     * @return {@link TrailingStopLossOrderRequest
     * TrailingStopLossOrderRequest}
     * @see TradeID
     */
    public TrailingStopLossOrderRequest setTradeID(String tradeID) {
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
     * @return {@link TrailingStopLossOrderRequest
     * TrailingStopLossOrderRequest}
     * @see ClientID
     */
    public TrailingStopLossOrderRequest setClientTradeID(String clientTradeID) {
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

    @SerializedName("distance") private PriceValue distance;

    /**
     * Set the Price Distance
     * <p>
     * The price distance specified for the TrailingStopLoss Order.
     * <p>
     * @param distance the Price Distance
     * @return {@link TrailingStopLossOrderRequest
     * TrailingStopLossOrderRequest}
     * @see PriceValue
     */
    public TrailingStopLossOrderRequest setDistance(double distance) {
        this.distance = new PriceValue(distance);
        return this;
    }

    /**
     * Get the Price Distance
     * <p>
     * The price distance specified for the TrailingStopLoss Order.
     * <p>
     * @return the Price Distance
     * @see PriceValue
     */
    public double getDistance() {
        return this.distance.getPriceValue();
    }

    @SerializedName("timeInForce") private TimeInForce timeInForce = TimeInForce.GTC;

    /**
     * Set the Time In Force
     * <p>
     * The time-in-force requested for the TrailingStopLoss Order. Restricted
     * to "GTC", "GFD" and "GTD" for TrailingStopLoss Orders.
     * <p>
     * @param timeInForce the Time In Force
     * @return {@link TrailingStopLossOrderRequest
     * TrailingStopLossOrderRequest}
     * @see TimeInForce
     */
    public TrailingStopLossOrderRequest setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

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

    @SerializedName("gtdTime") private DateTime gtdTime;

    /**
     * Set the GTD Time
     * <p>
     * The date/time when the StopLoss Order will be cancelled if its
     * timeInForce is "GTD".
     * <p>
     * @param gtdTime the GTD Time
     * @return {@link TrailingStopLossOrderRequest
     * TrailingStopLossOrderRequest}
     * @see DateTime
     */
    public TrailingStopLossOrderRequest setGtdTime(String gtdTime) {
        this.gtdTime = new DateTime(gtdTime);
        return this;
    }

    /**
     * Get the GTD Time
     * <p>
     * The date/time when the StopLoss Order will be cancelled if its
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
     * @return {@link TrailingStopLossOrderRequest
     * TrailingStopLossOrderRequest}
     * @see OrderTriggerCondition
     */
    public TrailingStopLossOrderRequest setTriggerCondition(OrderTriggerCondition triggerCondition) {
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

    @SerializedName("clientExtensions") private ClientExtensions clientExtensions;

    /**
     * Set the Client Extensions
     * <p>
     * The client extensions to add to the Order. Do not set, modify, or delete
     * clientExtensions if your account is associated with MT4.
     * <p>
     * @param clientExtensions the Client Extensions
     * @return {@link TrailingStopLossOrderRequest
     * TrailingStopLossOrderRequest}
     * @see ClientExtensions
     */
    public TrailingStopLossOrderRequest setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

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
}
