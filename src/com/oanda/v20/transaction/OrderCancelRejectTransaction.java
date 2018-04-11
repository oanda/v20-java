package com.oanda.v20.transaction;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.account.AccountID;
import com.oanda.v20.order.OrderID;
import com.oanda.v20.primitives.DateTime;

/**
 * An OrderCancelRejectTransaction represents the rejection of the cancellation
 * of an Order in the client's Account.
 * <p>
 * Order Cancel Reject {orderID}
 */
public class OrderCancelRejectTransaction implements Transaction {

    /**
     * Default constructor.
     */
    public OrderCancelRejectTransaction() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the OrderCancelRejectTransaction to copy
     */
    public OrderCancelRejectTransaction(OrderCancelRejectTransaction other) {
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
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     * @see TransactionID
     */
    public OrderCancelRejectTransaction setId(TransactionID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID as a String
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     * @see TransactionID
     */
    public OrderCancelRejectTransaction setId(String id) {
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
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     * @see DateTime
     */
    public OrderCancelRejectTransaction setTime(DateTime time) {
        this.time = time;
        return this;
    }
    /**
     * Set the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @param time the Time as a String
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     * @see DateTime
     */
    public OrderCancelRejectTransaction setTime(String time) {
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
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     */
    public OrderCancelRejectTransaction setUserID(Long userID) {
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
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     * @see AccountID
     */
    public OrderCancelRejectTransaction setAccountID(AccountID accountID) {
        this.accountID = accountID;
        return this;
    }
    /**
     * Set the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @param accountID the Account ID as a String
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     * @see AccountID
     */
    public OrderCancelRejectTransaction setAccountID(String accountID) {
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
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     * @see TransactionID
     */
    public OrderCancelRejectTransaction setBatchID(TransactionID batchID) {
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
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     * @see TransactionID
     */
    public OrderCancelRejectTransaction setBatchID(String batchID) {
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
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     * @see RequestID
     */
    public OrderCancelRejectTransaction setRequestID(RequestID requestID) {
        this.requestID = requestID;
        return this;
    }
    /**
     * Set the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @param requestID the Request ID as a String
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     * @see RequestID
     */
    public OrderCancelRejectTransaction setRequestID(String requestID) {
        this.requestID = new RequestID(requestID);
        return this;
    }

    @SerializedName("type") private TransactionType type = TransactionType.ORDER_CANCEL_REJECT;

    /**
     * Get the Type
     * <p>
     * The Type of the Transaction. Always set to "ORDER_CANCEL_REJECT" for an
     * OrderCancelRejectTransaction.
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
     * The Type of the Transaction. Always set to "ORDER_CANCEL_REJECT" for an
     * OrderCancelRejectTransaction.
     * <p>
     * @param type the Type as a TransactionType
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     * @see TransactionType
     */
    public OrderCancelRejectTransaction setType(TransactionType type) {
        this.type = type;
        return this;
    }

    @SerializedName("orderID") private OrderID orderID;

    /**
     * Get the Order ID
     * <p>
     * The ID of the Order intended to be cancelled
     * <p>
     * @return the Order ID
     * @see OrderID
     */
    public OrderID getOrderID() {
        return this.orderID;
    }

    /**
     * Set the Order ID
     * <p>
     * The ID of the Order intended to be cancelled
     * <p>
     * @param orderID the Order ID as an OrderID
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     * @see OrderID
     */
    public OrderCancelRejectTransaction setOrderID(OrderID orderID) {
        this.orderID = orderID;
        return this;
    }
    /**
     * Set the Order ID
     * <p>
     * The ID of the Order intended to be cancelled
     * <p>
     * @param orderID the Order ID as a String
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     * @see OrderID
     */
    public OrderCancelRejectTransaction setOrderID(String orderID) {
        this.orderID = new OrderID(orderID);
        return this;
    }

    @SerializedName("clientOrderID") private OrderID clientOrderID;

    /**
     * Get the Client Order ID
     * <p>
     * The client ID of the Order intended to be cancelled (only provided if
     * the Order has a client Order ID).
     * <p>
     * @return the Client Order ID
     * @see OrderID
     */
    public OrderID getClientOrderID() {
        return this.clientOrderID;
    }

    /**
     * Set the Client Order ID
     * <p>
     * The client ID of the Order intended to be cancelled (only provided if
     * the Order has a client Order ID).
     * <p>
     * @param clientOrderID the Client Order ID as an OrderID
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     * @see OrderID
     */
    public OrderCancelRejectTransaction setClientOrderID(OrderID clientOrderID) {
        this.clientOrderID = clientOrderID;
        return this;
    }
    /**
     * Set the Client Order ID
     * <p>
     * The client ID of the Order intended to be cancelled (only provided if
     * the Order has a client Order ID).
     * <p>
     * @param clientOrderID the Client Order ID as a String
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     * @see OrderID
     */
    public OrderCancelRejectTransaction setClientOrderID(String clientOrderID) {
        this.clientOrderID = new OrderID(clientOrderID);
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
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     * @see TransactionRejectReason
     */
    public OrderCancelRejectTransaction setRejectReason(TransactionRejectReason rejectReason) {
        this.rejectReason = rejectReason;
        return this;
    }

    @Override
    public String toString() {
        return "OrderCancelRejectTransaction(" +
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
            "rejectReason=" +
                (rejectReason == null ? "null" : rejectReason.toString()) +
            ")";
    }
}
