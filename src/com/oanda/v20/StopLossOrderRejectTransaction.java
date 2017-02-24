package com.oanda.v20;

import com.oanda.v20.TransactionType;
import com.oanda.v20.TimeInForce;
import com.oanda.v20.OrderTriggerCondition;
import com.oanda.v20.StopLossOrderReason;
import com.oanda.v20.TransactionRejectReason;
import com.google.gson.annotations.SerializedName;

/**
 * A StopLossOrderRejectTransaction represents the rejection of the creation of
 * a StopLoss Order.
 * <p>
 * Reject Stop Loss Order ({reason}): Close Trade {tradeID} @ {price}
 */
public class StopLossOrderRejectTransaction implements Transaction {

    @SerializedName("id") private TransactionID id;

    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see TransactionID
     */
    public StopLossOrderRejectTransaction setId(String id) {
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
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see DateTime
     */
    public StopLossOrderRejectTransaction setTime(String time) {
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
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     */
    public StopLossOrderRejectTransaction setUserID(int userID) {
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
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see AccountID
     */
    public StopLossOrderRejectTransaction setAccountID(String accountID) {
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
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see TransactionID
     */
    public StopLossOrderRejectTransaction setBatchID(String batchID) {
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
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see RequestID
     */
    public StopLossOrderRejectTransaction setRequestID(String requestID) {
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

    @SerializedName("type") private TransactionType type = TransactionType.STOP_LOSS_ORDER_REJECT;

    /**
     * Get the Type
     * <p>
     * The Type of the Transaction. Always set to "STOP_LOSS_ORDER_REJECT" in a
     * StopLossOrderRejectTransaction.
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
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see TradeID
     */
    public StopLossOrderRejectTransaction setTradeID(String tradeID) {
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
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see ClientID
     */
    public StopLossOrderRejectTransaction setClientTradeID(String clientTradeID) {
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
     * The price threshold specified for the StopLoss Order. The associated
     * Trade will be closed by a market price that is equal to or worse than
     * this threshold.
     * <p>
     * @param price the Price
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see PriceValue
     */
    public StopLossOrderRejectTransaction setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }

    /**
     * Get the Price
     * <p>
     * The price threshold specified for the StopLoss Order. The associated
     * Trade will be closed by a market price that is equal to or worse than
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
     * The time-in-force requested for the StopLoss Order. Restricted to "GTC",
     * "GFD" and "GTD" for StopLoss Orders.
     * <p>
     * @param timeInForce the Time In Force
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see TimeInForce
     */
    public StopLossOrderRejectTransaction setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

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

    @SerializedName("gtdTime") private DateTime gtdTime;

    /**
     * Set the GTD Time
     * <p>
     * The date/time when the StopLoss Order will be cancelled if its
     * timeInForce is "GTD".
     * <p>
     * @param gtdTime the GTD Time
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see DateTime
     */
    public StopLossOrderRejectTransaction setGtdTime(String gtdTime) {
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
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see OrderTriggerCondition
     */
    public StopLossOrderRejectTransaction setTriggerCondition(OrderTriggerCondition triggerCondition) {
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

    @SerializedName("reason") private StopLossOrderReason reason;

    /**
     * Set the Reason
     * <p>
     * The reason that the Stop Loss Order was initiated
     * <p>
     * @param reason the Reason
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see StopLossOrderReason
     */
    public StopLossOrderRejectTransaction setReason(StopLossOrderReason reason) {
        this.reason = reason;
        return this;
    }

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

    @SerializedName("clientExtensions") private ClientExtensions clientExtensions;

    /**
     * Set the Order Client Extensions
     * <p>
     * Client Extensions to add to the Order (only provided if the Order is
     * being created with client extensions).
     * <p>
     * @param clientExtensions the Order Client Extensions
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see ClientExtensions
     */
    public StopLossOrderRejectTransaction setClientExtensions(ClientExtensions clientExtensions) {
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
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see TransactionID
     */
    public StopLossOrderRejectTransaction setOrderFillTransactionID(String orderFillTransactionID) {
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

    @SerializedName("intendedReplacesOrderID") private OrderID intendedReplacesOrderID;

    /**
     * Set the Order ID to Replace
     * <p>
     * The ID of the Order that this Order was intended to replace (only
     * provided if this Order was intended to replace an existing Order).
     * <p>
     * @param intendedReplacesOrderID the Order ID to Replace
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see OrderID
     */
    public StopLossOrderRejectTransaction setIntendedReplacesOrderID(String intendedReplacesOrderID) {
        this.intendedReplacesOrderID = new OrderID(intendedReplacesOrderID);
        return this;
    }

    /**
     * Get the Order ID to Replace
     * <p>
     * The ID of the Order that this Order was intended to replace (only
     * provided if this Order was intended to replace an existing Order).
     * <p>
     * @return the Order ID to Replace
     * @see OrderID
     */
    public String getIntendedReplacesOrderID() {
        return this.intendedReplacesOrderID.getOrderID();
    }

    @SerializedName("rejectReason") private TransactionRejectReason rejectReason;

    /**
     * Set the Reject Reason
     * <p>
     * The reason that the Reject Transaction was created
     * <p>
     * @param rejectReason the Reject Reason
     * @return {@link StopLossOrderRejectTransaction
     * StopLossOrderRejectTransaction}
     * @see TransactionRejectReason
     */
    public StopLossOrderRejectTransaction setRejectReason(TransactionRejectReason rejectReason) {
        this.rejectReason = rejectReason;
        return this;
    }

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
}
