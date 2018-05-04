package com.oanda.v20.order;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.pricing_common.PriceValue;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.primitives.DecimalNumber;
import com.oanda.v20.trade.TradeID;
import com.oanda.v20.transaction.ClientExtensions;
import com.oanda.v20.transaction.ClientID;

/**
 * A StopLossOrderRequest specifies the parameters that may be set when
 * creating a Stop Loss Order. Only one of the price and distance fields may be
 * specified.
 * <p>
 * Stop Loss for Trade {tradeID} @ {price}
 */
public class StopLossOrderRequest implements OrderRequest {

    /**
     * Default constructor.
     */
    public StopLossOrderRequest() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the StopLossOrderRequest to copy
     */
    public StopLossOrderRequest(StopLossOrderRequest other) {
        this.type = other.type;
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
        if (other.clientExtensions != null)
        {
            this.clientExtensions = new ClientExtensions(other.clientExtensions);
        }
    }

    @SerializedName("type") private OrderType type = OrderType.STOP_LOSS;

    /**
     * Get the Type
     * <p>
     * The type of the Order to Create. Must be set to "STOP_LOSS" when
     * creating a Stop Loss Order.
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
     * The type of the Order to Create. Must be set to "STOP_LOSS" when
     * creating a Stop Loss Order.
     * <p>
     * @param type the Type as an OrderType
     * @return {@link StopLossOrderRequest StopLossOrderRequest}
     * @see OrderType
     */
    public StopLossOrderRequest setType(OrderType type) {
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
     * @return {@link StopLossOrderRequest StopLossOrderRequest}
     * @see TradeID
     */
    public StopLossOrderRequest setTradeID(TradeID tradeID) {
        this.tradeID = tradeID;
        return this;
    }
    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade to close when the price threshold is breached.
     * <p>
     * @param tradeID the Trade ID as a String
     * @return {@link StopLossOrderRequest StopLossOrderRequest}
     * @see TradeID
     */
    public StopLossOrderRequest setTradeID(String tradeID) {
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
     * @return {@link StopLossOrderRequest StopLossOrderRequest}
     * @see ClientID
     */
    public StopLossOrderRequest setClientTradeID(ClientID clientTradeID) {
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
     * @return {@link StopLossOrderRequest StopLossOrderRequest}
     * @see ClientID
     */
    public StopLossOrderRequest setClientTradeID(String clientTradeID) {
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
     * @return {@link StopLossOrderRequest StopLossOrderRequest}
     * @see PriceValue
     */
    public StopLossOrderRequest setPrice(PriceValue price) {
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
     * @return {@link StopLossOrderRequest StopLossOrderRequest}
     * @see PriceValue
     */
    public StopLossOrderRequest setPrice(String price) {
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
     * @return {@link StopLossOrderRequest StopLossOrderRequest}
     * @see PriceValue
     */
    public StopLossOrderRequest setPrice(double price) {
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
     * @return {@link StopLossOrderRequest StopLossOrderRequest}
     * @see PriceValue
     */
    public StopLossOrderRequest setPrice(BigDecimal price) {
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
     * @return {@link StopLossOrderRequest StopLossOrderRequest}
     * @see DecimalNumber
     */
    public StopLossOrderRequest setDistance(DecimalNumber distance) {
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
     * @return {@link StopLossOrderRequest StopLossOrderRequest}
     * @see DecimalNumber
     */
    public StopLossOrderRequest setDistance(String distance) {
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
     * @return {@link StopLossOrderRequest StopLossOrderRequest}
     * @see DecimalNumber
     */
    public StopLossOrderRequest setDistance(double distance) {
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
     * @return {@link StopLossOrderRequest StopLossOrderRequest}
     * @see DecimalNumber
     */
    public StopLossOrderRequest setDistance(BigDecimal distance) {
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
     * @return {@link StopLossOrderRequest StopLossOrderRequest}
     * @see TimeInForce
     */
    public StopLossOrderRequest setTimeInForce(TimeInForce timeInForce) {
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
     * @return {@link StopLossOrderRequest StopLossOrderRequest}
     * @see DateTime
     */
    public StopLossOrderRequest setGtdTime(DateTime gtdTime) {
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
     * @return {@link StopLossOrderRequest StopLossOrderRequest}
     * @see DateTime
     */
    public StopLossOrderRequest setGtdTime(String gtdTime) {
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
     * @return {@link StopLossOrderRequest StopLossOrderRequest}
     * @see OrderTriggerCondition
     */
    public StopLossOrderRequest setTriggerCondition(OrderTriggerCondition triggerCondition) {
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
     * @return {@link StopLossOrderRequest StopLossOrderRequest}
     */
    public StopLossOrderRequest setGuaranteed(Boolean guaranteed) {
        this.guaranteed = guaranteed;
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
     * @return {@link StopLossOrderRequest StopLossOrderRequest}
     * @see ClientExtensions
     */
    public StopLossOrderRequest setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

    @Override
    public String toString() {
        return "StopLossOrderRequest(" +
            "type=" +
                (type == null ? "null" : type.toString()) + ", " +
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
            "clientExtensions=" +
                (clientExtensions == null ? "null" : clientExtensions.toString()) +
            ")";
    }
}
