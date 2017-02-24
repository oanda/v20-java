package com.oanda.v20;

import com.oanda.v20.OrderType;
import com.oanda.v20.TimeInForce;
import com.oanda.v20.OrderTriggerCondition;
import com.google.gson.annotations.SerializedName;

/**
 * A TakeProfitOrderRequest specifies the parameters that may be set when
 * creating a Take Profit Order.
 * <p>
 * Take Profit for Trade {tradeID} @ {price}
 */
public class TakeProfitOrderRequest implements OrderRequest {

    @SerializedName("type") private OrderType type = OrderType.TAKE_PROFIT;

    /**
     * Get the Type
     * <p>
     * The type of the Order to Create. Must be set to "TAKE_PROFIT" when
     * creating a Take Profit Order.
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
     * @return {@link TakeProfitOrderRequest TakeProfitOrderRequest}
     * @see TradeID
     */
    public TakeProfitOrderRequest setTradeID(String tradeID) {
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
     * @return {@link TakeProfitOrderRequest TakeProfitOrderRequest}
     * @see ClientID
     */
    public TakeProfitOrderRequest setClientTradeID(String clientTradeID) {
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
     * @return {@link TakeProfitOrderRequest TakeProfitOrderRequest}
     * @see PriceValue
     */
    public TakeProfitOrderRequest setPrice(double price) {
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
     * @return {@link TakeProfitOrderRequest TakeProfitOrderRequest}
     * @see TimeInForce
     */
    public TakeProfitOrderRequest setTimeInForce(TimeInForce timeInForce) {
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
     * @return {@link TakeProfitOrderRequest TakeProfitOrderRequest}
     * @see DateTime
     */
    public TakeProfitOrderRequest setGtdTime(String gtdTime) {
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
     * @return {@link TakeProfitOrderRequest TakeProfitOrderRequest}
     * @see OrderTriggerCondition
     */
    public TakeProfitOrderRequest setTriggerCondition(OrderTriggerCondition triggerCondition) {
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
     * @return {@link TakeProfitOrderRequest TakeProfitOrderRequest}
     * @see ClientExtensions
     */
    public TakeProfitOrderRequest setClientExtensions(ClientExtensions clientExtensions) {
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
