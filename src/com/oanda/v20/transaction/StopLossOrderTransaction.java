package com.oanda.v20.transaction;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.account.AccountID;
import com.oanda.v20.order.OrderID;
import com.oanda.v20.order.OrderTriggerCondition;
import com.oanda.v20.order.TimeInForce;
import com.oanda.v20.pricing_common.PriceValue;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.primitives.DecimalNumber;
import com.oanda.v20.trade.TradeID;

/**
 * A StopLossOrderTransaction represents the creation of a StopLoss Order in
 * the user's Account.
 * <p>
 * Create Stop Loss Order {id} ({reason}): Close Trade {tradeID} @ {price}
 */
public class StopLossOrderTransaction implements Transaction {

    /**
     * Default constructor.
     */
    public StopLossOrderTransaction() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the StopLossOrderTransaction to copy
     */
    public StopLossOrderTransaction(StopLossOrderTransaction other) {
        this.id = other.id;
        this.time = other.time;
        if (other.userID != null)
        {
            this.userID = new Long(other.userID);
        }
        this.accountID = other.accountID;
        this.batchID = other.batchID;
        this.requestID = other.requestID;
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
        this.guaranteedExecutionPremium = other.guaranteedExecutionPremium;
        this.reason = other.reason;
        if (other.clientExtensions != null)
        {
            this.clientExtensions = new ClientExtensions(other.clientExtensions);
        }
        this.orderFillTransactionID = other.orderFillTransactionID;
        this.replacesOrderID = other.replacesOrderID;
        this.cancellingTransactionID = other.cancellingTransactionID;
    }

    @SerializedName("id") private TransactionID id;

    /**
     * Get the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @return the Transaction ID
     * @see TransactionID
     */
    public TransactionID getId() {
        return this.id;
    }

    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID as a TransactionID
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see TransactionID
     */
    public StopLossOrderTransaction setId(TransactionID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID as a String
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see TransactionID
     */
    public StopLossOrderTransaction setId(String id) {
        this.id = new TransactionID(id);
        return this;
    }

    @SerializedName("time") private DateTime time;

    /**
     * Get the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @return the Time
     * @see DateTime
     */
    public DateTime getTime() {
        return this.time;
    }

    /**
     * Set the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @param time the Time as a DateTime
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see DateTime
     */
    public StopLossOrderTransaction setTime(DateTime time) {
        this.time = time;
        return this;
    }
    /**
     * Set the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @param time the Time as a String
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see DateTime
     */
    public StopLossOrderTransaction setTime(String time) {
        this.time = new DateTime(time);
        return this;
    }

    @SerializedName("userID") private Long userID;

    /**
     * Get the User ID
     * <p>
     * The ID of the user that initiated the creation of the Transaction.
     * <p>
     * @return the User ID
     */
    public Long getUserID() {
        return this.userID;
    }

    /**
     * Set the User ID
     * <p>
     * The ID of the user that initiated the creation of the Transaction.
     * <p>
     * @param userID the User ID as a Long
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     */
    public StopLossOrderTransaction setUserID(Long userID) {
        this.userID = userID;
        return this;
    }

    @SerializedName("accountID") private AccountID accountID;

    /**
     * Get the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @return the Account ID
     * @see AccountID
     */
    public AccountID getAccountID() {
        return this.accountID;
    }

    /**
     * Set the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @param accountID the Account ID as an AccountID
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see AccountID
     */
    public StopLossOrderTransaction setAccountID(AccountID accountID) {
        this.accountID = accountID;
        return this;
    }
    /**
     * Set the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @param accountID the Account ID as a String
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see AccountID
     */
    public StopLossOrderTransaction setAccountID(String accountID) {
        this.accountID = new AccountID(accountID);
        return this;
    }

    @SerializedName("batchID") private TransactionID batchID;

    /**
     * Get the Transaction Batch ID
     * <p>
     * The ID of the "batch" that the Transaction belongs to. Transactions in
     * the same batch are applied to the Account simultaneously.
     * <p>
     * @return the Transaction Batch ID
     * @see TransactionID
     */
    public TransactionID getBatchID() {
        return this.batchID;
    }

    /**
     * Set the Transaction Batch ID
     * <p>
     * The ID of the "batch" that the Transaction belongs to. Transactions in
     * the same batch are applied to the Account simultaneously.
     * <p>
     * @param batchID the Transaction Batch ID as a TransactionID
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see TransactionID
     */
    public StopLossOrderTransaction setBatchID(TransactionID batchID) {
        this.batchID = batchID;
        return this;
    }
    /**
     * Set the Transaction Batch ID
     * <p>
     * The ID of the "batch" that the Transaction belongs to. Transactions in
     * the same batch are applied to the Account simultaneously.
     * <p>
     * @param batchID the Transaction Batch ID as a String
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see TransactionID
     */
    public StopLossOrderTransaction setBatchID(String batchID) {
        this.batchID = new TransactionID(batchID);
        return this;
    }

    @SerializedName("requestID") private RequestID requestID;

    /**
     * Get the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @return the Request ID
     * @see RequestID
     */
    public RequestID getRequestID() {
        return this.requestID;
    }

    /**
     * Set the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @param requestID the Request ID as a RequestID
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see RequestID
     */
    public StopLossOrderTransaction setRequestID(RequestID requestID) {
        this.requestID = requestID;
        return this;
    }
    /**
     * Set the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @param requestID the Request ID as a String
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see RequestID
     */
    public StopLossOrderTransaction setRequestID(String requestID) {
        this.requestID = new RequestID(requestID);
        return this;
    }

    @SerializedName("type") private TransactionType type = TransactionType.STOP_LOSS_ORDER;

    /**
     * Get the Type
     * <p>
     * The Type of the Transaction. Always set to "STOP_LOSS_ORDER" in a
     * StopLossOrderTransaction.
     * <p>
     * @return the Type
     * @see TransactionType
     */
    public TransactionType getType() {
        return this.type;
    }

    /**
     * Set the Type
     * <p>
     * The Type of the Transaction. Always set to "STOP_LOSS_ORDER" in a
     * StopLossOrderTransaction.
     * <p>
     * @param type the Type as a TransactionType
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see TransactionType
     */
    public StopLossOrderTransaction setType(TransactionType type) {
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
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see TradeID
     */
    public StopLossOrderTransaction setTradeID(TradeID tradeID) {
        this.tradeID = tradeID;
        return this;
    }
    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade to close when the price threshold is breached.
     * <p>
     * @param tradeID the Trade ID as a String
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see TradeID
     */
    public StopLossOrderTransaction setTradeID(String tradeID) {
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
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see ClientID
     */
    public StopLossOrderTransaction setClientTradeID(ClientID clientTradeID) {
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
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see ClientID
     */
    public StopLossOrderTransaction setClientTradeID(String clientTradeID) {
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
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see PriceValue
     */
    public StopLossOrderTransaction setPrice(PriceValue price) {
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
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see PriceValue
     */
    public StopLossOrderTransaction setPrice(String price) {
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
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see PriceValue
     */
    public StopLossOrderTransaction setPrice(double price) {
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
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see PriceValue
     */
    public StopLossOrderTransaction setPrice(BigDecimal price) {
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
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see DecimalNumber
     */
    public StopLossOrderTransaction setDistance(DecimalNumber distance) {
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
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see DecimalNumber
     */
    public StopLossOrderTransaction setDistance(String distance) {
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
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see DecimalNumber
     */
    public StopLossOrderTransaction setDistance(double distance) {
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
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see DecimalNumber
     */
    public StopLossOrderTransaction setDistance(BigDecimal distance) {
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
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see TimeInForce
     */
    public StopLossOrderTransaction setTimeInForce(TimeInForce timeInForce) {
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
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see DateTime
     */
    public StopLossOrderTransaction setGtdTime(DateTime gtdTime) {
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
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see DateTime
     */
    public StopLossOrderTransaction setGtdTime(String gtdTime) {
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
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see OrderTriggerCondition
     */
    public StopLossOrderTransaction setTriggerCondition(OrderTriggerCondition triggerCondition) {
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
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     */
    public StopLossOrderTransaction setGuaranteed(Boolean guaranteed) {
        this.guaranteed = guaranteed;
        return this;
    }

    @SerializedName("guaranteedExecutionPremium") private DecimalNumber guaranteedExecutionPremium;

    /**
     * Get the Guaranteed Execution Premium
     * <p>
     * The fee that will be charged if the Stop Loss Order is guaranteed and
     * the Order is filled at the guaranteed price. The value is determined at
     * Order creation time. It is in price units and is charged for each unit
     * of the Trade.
     * <p>
     * @return the Guaranteed Execution Premium
     * @see DecimalNumber
     */
    public DecimalNumber getGuaranteedExecutionPremium() {
        return this.guaranteedExecutionPremium;
    }

    /**
     * Set the Guaranteed Execution Premium
     * <p>
     * The fee that will be charged if the Stop Loss Order is guaranteed and
     * the Order is filled at the guaranteed price. The value is determined at
     * Order creation time. It is in price units and is charged for each unit
     * of the Trade.
     * <p>
     * @param guaranteedExecutionPremium the Guaranteed Execution Premium as a
     * DecimalNumber
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see DecimalNumber
     */
    public StopLossOrderTransaction setGuaranteedExecutionPremium(DecimalNumber guaranteedExecutionPremium) {
        this.guaranteedExecutionPremium = guaranteedExecutionPremium;
        return this;
    }
    /**
     * Set the Guaranteed Execution Premium
     * <p>
     * The fee that will be charged if the Stop Loss Order is guaranteed and
     * the Order is filled at the guaranteed price. The value is determined at
     * Order creation time. It is in price units and is charged for each unit
     * of the Trade.
     * <p>
     * @param guaranteedExecutionPremium the Guaranteed Execution Premium as a
     * String
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see DecimalNumber
     */
    public StopLossOrderTransaction setGuaranteedExecutionPremium(String guaranteedExecutionPremium) {
        this.guaranteedExecutionPremium = new DecimalNumber(guaranteedExecutionPremium);
        return this;
    }
    /**
     * Set the Guaranteed Execution Premium
     * <p>
     * The fee that will be charged if the Stop Loss Order is guaranteed and
     * the Order is filled at the guaranteed price. The value is determined at
     * Order creation time. It is in price units and is charged for each unit
     * of the Trade.
     * <p>
     * @param guaranteedExecutionPremium the Guaranteed Execution Premium as a
     * double
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see DecimalNumber
     */
    public StopLossOrderTransaction setGuaranteedExecutionPremium(double guaranteedExecutionPremium) {
        this.guaranteedExecutionPremium = new DecimalNumber(guaranteedExecutionPremium);
        return this;
    }
    /**
     * Set the Guaranteed Execution Premium
     * <p>
     * The fee that will be charged if the Stop Loss Order is guaranteed and
     * the Order is filled at the guaranteed price. The value is determined at
     * Order creation time. It is in price units and is charged for each unit
     * of the Trade.
     * <p>
     * @param guaranteedExecutionPremium the Guaranteed Execution Premium as a
     * BigDecimal
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see DecimalNumber
     */
    public StopLossOrderTransaction setGuaranteedExecutionPremium(BigDecimal guaranteedExecutionPremium) {
        this.guaranteedExecutionPremium = new DecimalNumber(guaranteedExecutionPremium);
        return this;
    }

    @SerializedName("reason") private StopLossOrderReason reason;

    /**
     * Get the Reason
     * <p>
     * The reason that the Stop Loss Order was initiated
     * <p>
     * @return the Reason
     * @see StopLossOrderReason
     */
    public StopLossOrderReason getReason() {
        return this.reason;
    }

    /**
     * Set the Reason
     * <p>
     * The reason that the Stop Loss Order was initiated
     * <p>
     * @param reason the Reason as a StopLossOrderReason
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see StopLossOrderReason
     */
    public StopLossOrderTransaction setReason(StopLossOrderReason reason) {
        this.reason = reason;
        return this;
    }

    @SerializedName("clientExtensions") private ClientExtensions clientExtensions;

    /**
     * Get the Order Client Extensions
     * <p>
     * Client Extensions to add to the Order (only provided if the Order is
     * being created with client extensions).
     * <p>
     * @return the Order Client Extensions
     * @see ClientExtensions
     */
    public ClientExtensions getClientExtensions() {
        return this.clientExtensions;
    }

    /**
     * Set the Order Client Extensions
     * <p>
     * Client Extensions to add to the Order (only provided if the Order is
     * being created with client extensions).
     * <p>
     * @param clientExtensions the Order Client Extensions as a
     * ClientExtensions
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see ClientExtensions
     */
    public StopLossOrderTransaction setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

    @SerializedName("orderFillTransactionID") private TransactionID orderFillTransactionID;

    /**
     * Get the Order Fill Transaction ID
     * <p>
     * The ID of the OrderFill Transaction that caused this Order to be created
     * (only provided if this Order was created automatically when another
     * Order was filled).
     * <p>
     * @return the Order Fill Transaction ID
     * @see TransactionID
     */
    public TransactionID getOrderFillTransactionID() {
        return this.orderFillTransactionID;
    }

    /**
     * Set the Order Fill Transaction ID
     * <p>
     * The ID of the OrderFill Transaction that caused this Order to be created
     * (only provided if this Order was created automatically when another
     * Order was filled).
     * <p>
     * @param orderFillTransactionID the Order Fill Transaction ID as a
     * TransactionID
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see TransactionID
     */
    public StopLossOrderTransaction setOrderFillTransactionID(TransactionID orderFillTransactionID) {
        this.orderFillTransactionID = orderFillTransactionID;
        return this;
    }
    /**
     * Set the Order Fill Transaction ID
     * <p>
     * The ID of the OrderFill Transaction that caused this Order to be created
     * (only provided if this Order was created automatically when another
     * Order was filled).
     * <p>
     * @param orderFillTransactionID the Order Fill Transaction ID as a String
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see TransactionID
     */
    public StopLossOrderTransaction setOrderFillTransactionID(String orderFillTransactionID) {
        this.orderFillTransactionID = new TransactionID(orderFillTransactionID);
        return this;
    }

    @SerializedName("replacesOrderID") private OrderID replacesOrderID;

    /**
     * Get the Replaces Order ID
     * <p>
     * The ID of the Order that this Order replaces (only provided if this
     * Order replaces an existing Order).
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
     * The ID of the Order that this Order replaces (only provided if this
     * Order replaces an existing Order).
     * <p>
     * @param replacesOrderID the Replaces Order ID as an OrderID
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see OrderID
     */
    public StopLossOrderTransaction setReplacesOrderID(OrderID replacesOrderID) {
        this.replacesOrderID = replacesOrderID;
        return this;
    }
    /**
     * Set the Replaces Order ID
     * <p>
     * The ID of the Order that this Order replaces (only provided if this
     * Order replaces an existing Order).
     * <p>
     * @param replacesOrderID the Replaces Order ID as a String
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see OrderID
     */
    public StopLossOrderTransaction setReplacesOrderID(String replacesOrderID) {
        this.replacesOrderID = new OrderID(replacesOrderID);
        return this;
    }

    @SerializedName("cancellingTransactionID") private TransactionID cancellingTransactionID;

    /**
     * Get the Replaces Order Cancel Transaction ID
     * <p>
     * The ID of the Transaction that cancels the replaced Order (only provided
     * if this Order replaces an existing Order).
     * <p>
     * @return the Replaces Order Cancel Transaction ID
     * @see TransactionID
     */
    public TransactionID getCancellingTransactionID() {
        return this.cancellingTransactionID;
    }

    /**
     * Set the Replaces Order Cancel Transaction ID
     * <p>
     * The ID of the Transaction that cancels the replaced Order (only provided
     * if this Order replaces an existing Order).
     * <p>
     * @param cancellingTransactionID the Replaces Order Cancel Transaction ID
     * as a TransactionID
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see TransactionID
     */
    public StopLossOrderTransaction setCancellingTransactionID(TransactionID cancellingTransactionID) {
        this.cancellingTransactionID = cancellingTransactionID;
        return this;
    }
    /**
     * Set the Replaces Order Cancel Transaction ID
     * <p>
     * The ID of the Transaction that cancels the replaced Order (only provided
     * if this Order replaces an existing Order).
     * <p>
     * @param cancellingTransactionID the Replaces Order Cancel Transaction ID
     * as a String
     * @return {@link StopLossOrderTransaction StopLossOrderTransaction}
     * @see TransactionID
     */
    public StopLossOrderTransaction setCancellingTransactionID(String cancellingTransactionID) {
        this.cancellingTransactionID = new TransactionID(cancellingTransactionID);
        return this;
    }

    @Override
    public String toString() {
        return "StopLossOrderTransaction(" +
            "id=" +
                (id == null ? "null" : id.toString()) + ", " +
            "time=" +
                (time == null ? "null" : time.toString()) + ", " +
            "userID=" +
                (userID == null ? "null" : userID.toString()) + ", " +
            "accountID=" +
                (accountID == null ? "null" : accountID.toString()) + ", " +
            "batchID=" +
                (batchID == null ? "null" : batchID.toString()) + ", " +
            "requestID=" +
                (requestID == null ? "null" : requestID.toString()) + ", " +
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
            "guaranteedExecutionPremium=" +
                (guaranteedExecutionPremium == null ? "null" : guaranteedExecutionPremium.toString()) + ", " +
            "reason=" +
                (reason == null ? "null" : reason.toString()) + ", " +
            "clientExtensions=" +
                (clientExtensions == null ? "null" : clientExtensions.toString()) + ", " +
            "orderFillTransactionID=" +
                (orderFillTransactionID == null ? "null" : orderFillTransactionID.toString()) + ", " +
            "replacesOrderID=" +
                (replacesOrderID == null ? "null" : replacesOrderID.toString()) + ", " +
            "cancellingTransactionID=" +
                (cancellingTransactionID == null ? "null" : cancellingTransactionID.toString()) +
            ")";
    }
}
