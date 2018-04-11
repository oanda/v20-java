package com.oanda.v20.transaction;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.account.AccountID;
import com.oanda.v20.order.OrderID;
import com.oanda.v20.primitives.DateTime;

/**
 * An OrderCancelTransaction represents the cancellation of an Order in the
 * client's Account.
 * <p>
 * Cancel Order {orderID}
 */
public class OrderCancelTransaction implements Transaction {

    /**
     * Default constructor.
     */
    public OrderCancelTransaction() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the OrderCancelTransaction to copy
     */
    public OrderCancelTransaction(OrderCancelTransaction other) {
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
        this.orderID = other.orderID;
        this.clientOrderID = other.clientOrderID;
        this.reason = other.reason;
        this.replacedByOrderID = other.replacedByOrderID;
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
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see TransactionID
     */
    public OrderCancelTransaction setId(TransactionID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID as a String
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see TransactionID
     */
    public OrderCancelTransaction setId(String id) {
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
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see DateTime
     */
    public OrderCancelTransaction setTime(DateTime time) {
        this.time = time;
        return this;
    }
    /**
     * Set the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @param time the Time as a String
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see DateTime
     */
    public OrderCancelTransaction setTime(String time) {
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
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     */
    public OrderCancelTransaction setUserID(Long userID) {
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
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see AccountID
     */
    public OrderCancelTransaction setAccountID(AccountID accountID) {
        this.accountID = accountID;
        return this;
    }
    /**
     * Set the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @param accountID the Account ID as a String
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see AccountID
     */
    public OrderCancelTransaction setAccountID(String accountID) {
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
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see TransactionID
     */
    public OrderCancelTransaction setBatchID(TransactionID batchID) {
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
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see TransactionID
     */
    public OrderCancelTransaction setBatchID(String batchID) {
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
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see RequestID
     */
    public OrderCancelTransaction setRequestID(RequestID requestID) {
        this.requestID = requestID;
        return this;
    }
    /**
     * Set the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @param requestID the Request ID as a String
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see RequestID
     */
    public OrderCancelTransaction setRequestID(String requestID) {
        this.requestID = new RequestID(requestID);
        return this;
    }

    @SerializedName("type") private TransactionType type = TransactionType.ORDER_CANCEL;

    /**
     * Get the Type
     * <p>
     * The Type of the Transaction. Always set to "ORDER_CANCEL" for an
     * OrderCancelTransaction.
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
     * The Type of the Transaction. Always set to "ORDER_CANCEL" for an
     * OrderCancelTransaction.
     * <p>
     * @param type the Type as a TransactionType
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see TransactionType
     */
    public OrderCancelTransaction setType(TransactionType type) {
        this.type = type;
        return this;
    }

    @SerializedName("orderID") private OrderID orderID;

    /**
     * Get the Cancelled Order ID
     * <p>
     * The ID of the Order cancelled
     * <p>
     * @return the Cancelled Order ID
     * @see OrderID
     */
    public OrderID getOrderID() {
        return this.orderID;
    }

    /**
     * Set the Cancelled Order ID
     * <p>
     * The ID of the Order cancelled
     * <p>
     * @param orderID the Cancelled Order ID as an OrderID
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see OrderID
     */
    public OrderCancelTransaction setOrderID(OrderID orderID) {
        this.orderID = orderID;
        return this;
    }
    /**
     * Set the Cancelled Order ID
     * <p>
     * The ID of the Order cancelled
     * <p>
     * @param orderID the Cancelled Order ID as a String
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see OrderID
     */
    public OrderCancelTransaction setOrderID(String orderID) {
        this.orderID = new OrderID(orderID);
        return this;
    }

    @SerializedName("clientOrderID") private OrderID clientOrderID;

    /**
     * Get the Cancelled Client Order ID
     * <p>
     * The client ID of the Order cancelled (only provided if the Order has a
     * client Order ID).
     * <p>
     * @return the Cancelled Client Order ID
     * @see OrderID
     */
    public OrderID getClientOrderID() {
        return this.clientOrderID;
    }

    /**
     * Set the Cancelled Client Order ID
     * <p>
     * The client ID of the Order cancelled (only provided if the Order has a
     * client Order ID).
     * <p>
     * @param clientOrderID the Cancelled Client Order ID as an OrderID
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see OrderID
     */
    public OrderCancelTransaction setClientOrderID(OrderID clientOrderID) {
        this.clientOrderID = clientOrderID;
        return this;
    }
    /**
     * Set the Cancelled Client Order ID
     * <p>
     * The client ID of the Order cancelled (only provided if the Order has a
     * client Order ID).
     * <p>
     * @param clientOrderID the Cancelled Client Order ID as a String
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see OrderID
     */
    public OrderCancelTransaction setClientOrderID(String clientOrderID) {
        this.clientOrderID = new OrderID(clientOrderID);
        return this;
    }

    @SerializedName("reason") private OrderCancelReason reason;

    /**
     * Get the Cancel Reason
     * <p>
     * The reason that the Order was cancelled.
     * <p>
     * @return the Cancel Reason
     * @see OrderCancelReason
     */
    public OrderCancelReason getReason() {
        return this.reason;
    }

    /**
     * Set the Cancel Reason
     * <p>
     * The reason that the Order was cancelled.
     * <p>
     * @param reason the Cancel Reason as an OrderCancelReason
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see OrderCancelReason
     */
    public OrderCancelTransaction setReason(OrderCancelReason reason) {
        this.reason = reason;
        return this;
    }

    @SerializedName("replacedByOrderID") private OrderID replacedByOrderID;

    /**
     * Get the Replaced By Order ID
     * <p>
     * The ID of the Order that replaced this Order (only provided if this
     * Order was cancelled for replacement).
     * <p>
     * @return the Replaced By Order ID
     * @see OrderID
     */
    public OrderID getReplacedByOrderID() {
        return this.replacedByOrderID;
    }

    /**
     * Set the Replaced By Order ID
     * <p>
     * The ID of the Order that replaced this Order (only provided if this
     * Order was cancelled for replacement).
     * <p>
     * @param replacedByOrderID the Replaced By Order ID as an OrderID
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see OrderID
     */
    public OrderCancelTransaction setReplacedByOrderID(OrderID replacedByOrderID) {
        this.replacedByOrderID = replacedByOrderID;
        return this;
    }
    /**
     * Set the Replaced By Order ID
     * <p>
     * The ID of the Order that replaced this Order (only provided if this
     * Order was cancelled for replacement).
     * <p>
     * @param replacedByOrderID the Replaced By Order ID as a String
     * @return {@link OrderCancelTransaction OrderCancelTransaction}
     * @see OrderID
     */
    public OrderCancelTransaction setReplacedByOrderID(String replacedByOrderID) {
        this.replacedByOrderID = new OrderID(replacedByOrderID);
        return this;
    }

    @Override
    public String toString() {
        return "OrderCancelTransaction(" +
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
            "orderID=" +
                (orderID == null ? "null" : orderID.toString()) + ", " +
            "clientOrderID=" +
                (clientOrderID == null ? "null" : clientOrderID.toString()) + ", " +
            "reason=" +
                (reason == null ? "null" : reason.toString()) + ", " +
            "replacedByOrderID=" +
                (replacedByOrderID == null ? "null" : replacedByOrderID.toString()) +
            ")";
    }
}
