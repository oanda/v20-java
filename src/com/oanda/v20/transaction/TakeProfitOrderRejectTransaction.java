package com.oanda.v20.transaction;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.account.AccountID;
import com.oanda.v20.order.OrderID;
import com.oanda.v20.order.OrderTriggerCondition;
import com.oanda.v20.order.TimeInForce;
import com.oanda.v20.pricing_common.PriceValue;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.trade.TradeID;

/**
 * A TakeProfitOrderRejectTransaction represents the rejection of the creation
 * of a TakeProfit Order.
 * <p>
 * Reject Take Profit Order ({reason}): Close Trade {tradeID} @ {price}
 */
public class TakeProfitOrderRejectTransaction implements Transaction {

    /**
     * Default constructor.
     */
    public TakeProfitOrderRejectTransaction() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the TakeProfitOrderRejectTransaction to copy
     */
    public TakeProfitOrderRejectTransaction(TakeProfitOrderRejectTransaction other) {
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
        this.timeInForce = other.timeInForce;
        this.gtdTime = other.gtdTime;
        this.triggerCondition = other.triggerCondition;
        this.reason = other.reason;
        if (other.clientExtensions != null)
        {
            this.clientExtensions = new ClientExtensions(other.clientExtensions);
        }
        this.orderFillTransactionID = other.orderFillTransactionID;
        this.intendedReplacesOrderID = other.intendedReplacesOrderID;
        this.rejectReason = other.rejectReason;
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
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see TransactionID
     */
    public TakeProfitOrderRejectTransaction setId(TransactionID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID as a String
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see TransactionID
     */
    public TakeProfitOrderRejectTransaction setId(String id) {
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
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see DateTime
     */
    public TakeProfitOrderRejectTransaction setTime(DateTime time) {
        this.time = time;
        return this;
    }
    /**
     * Set the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @param time the Time as a String
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see DateTime
     */
    public TakeProfitOrderRejectTransaction setTime(String time) {
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
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     */
    public TakeProfitOrderRejectTransaction setUserID(Long userID) {
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
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see AccountID
     */
    public TakeProfitOrderRejectTransaction setAccountID(AccountID accountID) {
        this.accountID = accountID;
        return this;
    }
    /**
     * Set the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @param accountID the Account ID as a String
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see AccountID
     */
    public TakeProfitOrderRejectTransaction setAccountID(String accountID) {
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
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see TransactionID
     */
    public TakeProfitOrderRejectTransaction setBatchID(TransactionID batchID) {
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
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see TransactionID
     */
    public TakeProfitOrderRejectTransaction setBatchID(String batchID) {
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
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see RequestID
     */
    public TakeProfitOrderRejectTransaction setRequestID(RequestID requestID) {
        this.requestID = requestID;
        return this;
    }
    /**
     * Set the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @param requestID the Request ID as a String
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see RequestID
     */
    public TakeProfitOrderRejectTransaction setRequestID(String requestID) {
        this.requestID = new RequestID(requestID);
        return this;
    }

    @SerializedName("type") private TransactionType type = TransactionType.TAKE_PROFIT_ORDER_REJECT;

    /**
     * Get the Type
     * <p>
     * The Type of the Transaction. Always set to "TAKE_PROFIT_ORDER_REJECT" in
     * a TakeProfitOrderRejectTransaction.
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
     * The Type of the Transaction. Always set to "TAKE_PROFIT_ORDER_REJECT" in
     * a TakeProfitOrderRejectTransaction.
     * <p>
     * @param type the Type as a TransactionType
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see TransactionType
     */
    public TakeProfitOrderRejectTransaction setType(TransactionType type) {
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
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see TradeID
     */
    public TakeProfitOrderRejectTransaction setTradeID(TradeID tradeID) {
        this.tradeID = tradeID;
        return this;
    }
    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade to close when the price threshold is breached.
     * <p>
     * @param tradeID the Trade ID as a String
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see TradeID
     */
    public TakeProfitOrderRejectTransaction setTradeID(String tradeID) {
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
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see ClientID
     */
    public TakeProfitOrderRejectTransaction setClientTradeID(ClientID clientTradeID) {
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
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see ClientID
     */
    public TakeProfitOrderRejectTransaction setClientTradeID(String clientTradeID) {
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
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see PriceValue
     */
    public TakeProfitOrderRejectTransaction setPrice(PriceValue price) {
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
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see PriceValue
     */
    public TakeProfitOrderRejectTransaction setPrice(String price) {
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
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see PriceValue
     */
    public TakeProfitOrderRejectTransaction setPrice(double price) {
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
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see PriceValue
     */
    public TakeProfitOrderRejectTransaction setPrice(BigDecimal price) {
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
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see TimeInForce
     */
    public TakeProfitOrderRejectTransaction setTimeInForce(TimeInForce timeInForce) {
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
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see DateTime
     */
    public TakeProfitOrderRejectTransaction setGtdTime(DateTime gtdTime) {
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
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see DateTime
     */
    public TakeProfitOrderRejectTransaction setGtdTime(String gtdTime) {
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
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see OrderTriggerCondition
     */
    public TakeProfitOrderRejectTransaction setTriggerCondition(OrderTriggerCondition triggerCondition) {
        this.triggerCondition = triggerCondition;
        return this;
    }

    @SerializedName("reason") private TakeProfitOrderReason reason;

    /**
     * Get the Reason
     * <p>
     * The reason that the Take Profit Order was initiated
     * <p>
     * @return the Reason
     * @see TakeProfitOrderReason
     */
    public TakeProfitOrderReason getReason() {
        return this.reason;
    }

    /**
     * Set the Reason
     * <p>
     * The reason that the Take Profit Order was initiated
     * <p>
     * @param reason the Reason as a TakeProfitOrderReason
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see TakeProfitOrderReason
     */
    public TakeProfitOrderRejectTransaction setReason(TakeProfitOrderReason reason) {
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
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see ClientExtensions
     */
    public TakeProfitOrderRejectTransaction setClientExtensions(ClientExtensions clientExtensions) {
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
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see TransactionID
     */
    public TakeProfitOrderRejectTransaction setOrderFillTransactionID(TransactionID orderFillTransactionID) {
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
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see TransactionID
     */
    public TakeProfitOrderRejectTransaction setOrderFillTransactionID(String orderFillTransactionID) {
        this.orderFillTransactionID = new TransactionID(orderFillTransactionID);
        return this;
    }

    @SerializedName("intendedReplacesOrderID") private OrderID intendedReplacesOrderID;

    /**
     * Get the Order ID to Replace
     * <p>
     * The ID of the Order that this Order was intended to replace (only
     * provided if this Order was intended to replace an existing Order).
     * <p>
     * @return the Order ID to Replace
     * @see OrderID
     */
    public OrderID getIntendedReplacesOrderID() {
        return this.intendedReplacesOrderID;
    }

    /**
     * Set the Order ID to Replace
     * <p>
     * The ID of the Order that this Order was intended to replace (only
     * provided if this Order was intended to replace an existing Order).
     * <p>
     * @param intendedReplacesOrderID the Order ID to Replace as an OrderID
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see OrderID
     */
    public TakeProfitOrderRejectTransaction setIntendedReplacesOrderID(OrderID intendedReplacesOrderID) {
        this.intendedReplacesOrderID = intendedReplacesOrderID;
        return this;
    }
    /**
     * Set the Order ID to Replace
     * <p>
     * The ID of the Order that this Order was intended to replace (only
     * provided if this Order was intended to replace an existing Order).
     * <p>
     * @param intendedReplacesOrderID the Order ID to Replace as a String
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see OrderID
     */
    public TakeProfitOrderRejectTransaction setIntendedReplacesOrderID(String intendedReplacesOrderID) {
        this.intendedReplacesOrderID = new OrderID(intendedReplacesOrderID);
        return this;
    }

    @SerializedName("rejectReason") private TransactionRejectReason rejectReason;

    /**
     * Get the Reject Reason
     * <p>
     * The reason that the Reject Transaction was created
     * <p>
     * @return the Reject Reason
     * @see TransactionRejectReason
     */
    public TransactionRejectReason getRejectReason() {
        return this.rejectReason;
    }

    /**
     * Set the Reject Reason
     * <p>
     * The reason that the Reject Transaction was created
     * <p>
     * @param rejectReason the Reject Reason as a TransactionRejectReason
     * @return {@link TakeProfitOrderRejectTransaction
     * TakeProfitOrderRejectTransaction}
     * @see TransactionRejectReason
     */
    public TakeProfitOrderRejectTransaction setRejectReason(TransactionRejectReason rejectReason) {
        this.rejectReason = rejectReason;
        return this;
    }

    @Override
    public String toString() {
        return "TakeProfitOrderRejectTransaction(" +
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
            "timeInForce=" +
                (timeInForce == null ? "null" : timeInForce.toString()) + ", " +
            "gtdTime=" +
                (gtdTime == null ? "null" : gtdTime.toString()) + ", " +
            "triggerCondition=" +
                (triggerCondition == null ? "null" : triggerCondition.toString()) + ", " +
            "reason=" +
                (reason == null ? "null" : reason.toString()) + ", " +
            "clientExtensions=" +
                (clientExtensions == null ? "null" : clientExtensions.toString()) + ", " +
            "orderFillTransactionID=" +
                (orderFillTransactionID == null ? "null" : orderFillTransactionID.toString()) + ", " +
            "intendedReplacesOrderID=" +
                (intendedReplacesOrderID == null ? "null" : intendedReplacesOrderID.toString()) + ", " +
            "rejectReason=" +
                (rejectReason == null ? "null" : rejectReason.toString()) +
            ")";
    }
}
