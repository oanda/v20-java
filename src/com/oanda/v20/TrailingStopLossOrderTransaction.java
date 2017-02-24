package com.oanda.v20;

import com.oanda.v20.TransactionType;
import com.oanda.v20.TimeInForce;
import com.oanda.v20.OrderTriggerCondition;
import com.oanda.v20.TrailingStopLossOrderReason;
import com.google.gson.annotations.SerializedName;

/**
 * A TrailingStopLossOrderTransaction represents the creation of a
 * TrailingStopLoss Order in the user's Account.
 * <p>
 * Create Trailing Stop Loss Order {id} ({reason}): Close Trade {tradeID}
 */
public class TrailingStopLossOrderTransaction implements Transaction {

    @SerializedName("id") private TransactionID id;

    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID
     * @return {@link TrailingStopLossOrderTransaction
     * TrailingStopLossOrderTransaction}
     * @see TransactionID
     */
    public TrailingStopLossOrderTransaction setId(String id) {
        this.id = new TransactionID(id);
        return this;
    }

    /**
     * Get the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @return the Transaction ID
     * @see TransactionID
     */
    public String getId() {
        return this.id.getTransactionID();
    }

    @SerializedName("time") private DateTime time;

    /**
     * Set the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @param time the Time
     * @return {@link TrailingStopLossOrderTransaction
     * TrailingStopLossOrderTransaction}
     * @see DateTime
     */
    public TrailingStopLossOrderTransaction setTime(String time) {
        this.time = new DateTime(time);
        return this;
    }

    /**
     * Get the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @return the Time
     * @see DateTime
     */
    public String getTime() {
        return this.time.getDateTime();
    }

    @SerializedName("userID") private Integer userID;

    /**
     * Set the User ID
     * <p>
     * The ID of the user that initiated the creation of the Transaction.
     * <p>
     * @param userID the User ID
     * @return {@link TrailingStopLossOrderTransaction
     * TrailingStopLossOrderTransaction}
     */
    public TrailingStopLossOrderTransaction setUserID(int userID) {
        this.userID = userID;
        return this;
    }

    /**
     * Get the User ID
     * <p>
     * The ID of the user that initiated the creation of the Transaction.
     * <p>
     * @return the User ID
     */
    public int getUserID() {
        return this.userID;
    }

    @SerializedName("accountID") private AccountID accountID;

    /**
     * Set the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @param accountID the Account ID
     * @return {@link TrailingStopLossOrderTransaction
     * TrailingStopLossOrderTransaction}
     * @see AccountID
     */
    public TrailingStopLossOrderTransaction setAccountID(String accountID) {
        this.accountID = new AccountID(accountID);
        return this;
    }

    /**
     * Get the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @return the Account ID
     * @see AccountID
     */
    public String getAccountID() {
        return this.accountID.getAccountID();
    }

    @SerializedName("batchID") private TransactionID batchID;

    /**
     * Set the Transaction Batch ID
     * <p>
     * The ID of the "batch" that the Transaction belongs to. Transactions in
     * the same batch are applied to the Account simultaneously.
     * <p>
     * @param batchID the Transaction Batch ID
     * @return {@link TrailingStopLossOrderTransaction
     * TrailingStopLossOrderTransaction}
     * @see TransactionID
     */
    public TrailingStopLossOrderTransaction setBatchID(String batchID) {
        this.batchID = new TransactionID(batchID);
        return this;
    }

    /**
     * Get the Transaction Batch ID
     * <p>
     * The ID of the "batch" that the Transaction belongs to. Transactions in
     * the same batch are applied to the Account simultaneously.
     * <p>
     * @return the Transaction Batch ID
     * @see TransactionID
     */
    public String getBatchID() {
        return this.batchID.getTransactionID();
    }

    @SerializedName("requestID") private RequestID requestID;

    /**
     * Set the Request ID
     * <p>
     * The Request ID of the Account Control Request which generated the
     * transaction (only provided for Transactions created by a Client request)
     * <p>
     * @param requestID the Request ID
     * @return {@link TrailingStopLossOrderTransaction
     * TrailingStopLossOrderTransaction}
     * @see RequestID
     */
    public TrailingStopLossOrderTransaction setRequestID(String requestID) {
        this.requestID = new RequestID(requestID);
        return this;
    }

    /**
     * Get the Request ID
     * <p>
     * The Request ID of the Account Control Request which generated the
     * transaction (only provided for Transactions created by a Client request)
     * <p>
     * @return the Request ID
     * @see RequestID
     */
    public String getRequestID() {
        return this.requestID.getRequestID();
    }

    @SerializedName("type") private TransactionType type = TransactionType.TRAILING_STOP_LOSS_ORDER;

    /**
     * Get the Type
     * <p>
     * The Type of the Transaction. Always set to "TRAILING_STOP_LOSS_ORDER" in
     * a TrailingStopLossOrderTransaction.
     * <p>
     * @return the Type
     * @see TransactionType
     */
    public TransactionType getType() {
        return this.type;
    }

    @SerializedName("tradeID") private TradeID tradeID;

    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade to close when the price threshold is breached.
     * <p>
     * @param tradeID the Trade ID
     * @return {@link TrailingStopLossOrderTransaction
     * TrailingStopLossOrderTransaction}
     * @see TradeID
     */
    public TrailingStopLossOrderTransaction setTradeID(String tradeID) {
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
     * @return {@link TrailingStopLossOrderTransaction
     * TrailingStopLossOrderTransaction}
     * @see ClientID
     */
    public TrailingStopLossOrderTransaction setClientTradeID(String clientTradeID) {
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
     * @return {@link TrailingStopLossOrderTransaction
     * TrailingStopLossOrderTransaction}
     * @see PriceValue
     */
    public TrailingStopLossOrderTransaction setDistance(double distance) {
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
     * @return {@link TrailingStopLossOrderTransaction
     * TrailingStopLossOrderTransaction}
     * @see TimeInForce
     */
    public TrailingStopLossOrderTransaction setTimeInForce(TimeInForce timeInForce) {
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
     * @return {@link TrailingStopLossOrderTransaction
     * TrailingStopLossOrderTransaction}
     * @see DateTime
     */
    public TrailingStopLossOrderTransaction setGtdTime(String gtdTime) {
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
     * @return {@link TrailingStopLossOrderTransaction
     * TrailingStopLossOrderTransaction}
     * @see OrderTriggerCondition
     */
    public TrailingStopLossOrderTransaction setTriggerCondition(OrderTriggerCondition triggerCondition) {
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

    @SerializedName("reason") private TrailingStopLossOrderReason reason;

    /**
     * Set the Reason
     * <p>
     * The reason that the Trailing Stop Loss Order was initiated
     * <p>
     * @param reason the Reason
     * @return {@link TrailingStopLossOrderTransaction
     * TrailingStopLossOrderTransaction}
     * @see TrailingStopLossOrderReason
     */
    public TrailingStopLossOrderTransaction setReason(TrailingStopLossOrderReason reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the Reason
     * <p>
     * The reason that the Trailing Stop Loss Order was initiated
     * <p>
     * @return the Reason
     * @see TrailingStopLossOrderReason
     */
    public TrailingStopLossOrderReason getReason() {
        return this.reason;
    }

    @SerializedName("clientExtensions") private ClientExtensions clientExtensions;

    /**
     * Set the Order Client Extensions
     * <p>
     * Client Extensions to add to the Order (only provided if the Order is
     * being created with client extensions).
     * <p>
     * @param clientExtensions the Order Client Extensions
     * @return {@link TrailingStopLossOrderTransaction
     * TrailingStopLossOrderTransaction}
     * @see ClientExtensions
     */
    public TrailingStopLossOrderTransaction setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

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

    @SerializedName("orderFillTransactionID") private TransactionID orderFillTransactionID;

    /**
     * Set the Order Fill Transaction ID
     * <p>
     * The ID of the OrderFill Transaction that caused this Order to be created
     * (only provided if this Order was created automatically when another
     * Order was filled).
     * <p>
     * @param orderFillTransactionID the Order Fill Transaction ID
     * @return {@link TrailingStopLossOrderTransaction
     * TrailingStopLossOrderTransaction}
     * @see TransactionID
     */
    public TrailingStopLossOrderTransaction setOrderFillTransactionID(String orderFillTransactionID) {
        this.orderFillTransactionID = new TransactionID(orderFillTransactionID);
        return this;
    }

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
    public String getOrderFillTransactionID() {
        return this.orderFillTransactionID.getTransactionID();
    }

    @SerializedName("replacesOrderID") private OrderID replacesOrderID;

    /**
     * Set the Replaces Order ID
     * <p>
     * The ID of the Order that this Order replaces (only provided if this
     * Order replaces an existing Order).
     * <p>
     * @param replacesOrderID the Replaces Order ID
     * @return {@link TrailingStopLossOrderTransaction
     * TrailingStopLossOrderTransaction}
     * @see OrderID
     */
    public TrailingStopLossOrderTransaction setReplacesOrderID(String replacesOrderID) {
        this.replacesOrderID = new OrderID(replacesOrderID);
        return this;
    }

    /**
     * Get the Replaces Order ID
     * <p>
     * The ID of the Order that this Order replaces (only provided if this
     * Order replaces an existing Order).
     * <p>
     * @return the Replaces Order ID
     * @see OrderID
     */
    public String getReplacesOrderID() {
        return this.replacesOrderID.getOrderID();
    }

    @SerializedName("cancellingTransactionID") private TransactionID cancellingTransactionID;

    /**
     * Set the Replaces Order Cancel Transaction ID
     * <p>
     * The ID of the Transaction that cancels the replaced Order (only provided
     * if this Order replaces an existing Order).
     * <p>
     * @param cancellingTransactionID the Replaces Order Cancel Transaction ID
     * @return {@link TrailingStopLossOrderTransaction
     * TrailingStopLossOrderTransaction}
     * @see TransactionID
     */
    public TrailingStopLossOrderTransaction setCancellingTransactionID(String cancellingTransactionID) {
        this.cancellingTransactionID = new TransactionID(cancellingTransactionID);
        return this;
    }

    /**
     * Get the Replaces Order Cancel Transaction ID
     * <p>
     * The ID of the Transaction that cancels the replaced Order (only provided
     * if this Order replaces an existing Order).
     * <p>
     * @return the Replaces Order Cancel Transaction ID
     * @see TransactionID
     */
    public String getCancellingTransactionID() {
        return this.cancellingTransactionID.getTransactionID();
    }
}
