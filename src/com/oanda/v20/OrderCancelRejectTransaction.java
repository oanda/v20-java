package com.oanda.v20;

import com.oanda.v20.TransactionType;
import com.oanda.v20.OrderCancelReason;
import com.oanda.v20.TransactionRejectReason;
import com.google.gson.annotations.SerializedName;

/**
 * An OrderCancelRejectTransaction represents the rejection of the cancellation
 * of an Order in the client's Account.
 * <p>
 * Order Cancel Reject {orderID}
 */
public class OrderCancelRejectTransaction implements Transaction {

    @SerializedName("id") private TransactionID id;

    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     * @see TransactionID
     */
    public OrderCancelRejectTransaction setId(String id) {
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
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     * @see DateTime
     */
    public OrderCancelRejectTransaction setTime(String time) {
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
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     */
    public OrderCancelRejectTransaction setUserID(int userID) {
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
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     * @see AccountID
     */
    public OrderCancelRejectTransaction setAccountID(String accountID) {
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
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     * @see TransactionID
     */
    public OrderCancelRejectTransaction setBatchID(String batchID) {
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
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     * @see RequestID
     */
    public OrderCancelRejectTransaction setRequestID(String requestID) {
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

    @SerializedName("orderID") private OrderID orderID;

    /**
     * Set the Order ID
     * <p>
     * The ID of the Order intended to be cancelled
     * <p>
     * @param orderID the Order ID
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     * @see OrderID
     */
    public OrderCancelRejectTransaction setOrderID(String orderID) {
        this.orderID = new OrderID(orderID);
        return this;
    }

    /**
     * Get the Order ID
     * <p>
     * The ID of the Order intended to be cancelled
     * <p>
     * @return the Order ID
     * @see OrderID
     */
    public String getOrderID() {
        return this.orderID.getOrderID();
    }

    @SerializedName("clientOrderID") private OrderID clientOrderID;

    /**
     * Set the Client Order ID
     * <p>
     * The client ID of the Order intended to be cancelled (only provided if
     * the Order has a client Order ID).
     * <p>
     * @param clientOrderID the Client Order ID
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     * @see OrderID
     */
    public OrderCancelRejectTransaction setClientOrderID(String clientOrderID) {
        this.clientOrderID = new OrderID(clientOrderID);
        return this;
    }

    /**
     * Get the Client Order ID
     * <p>
     * The client ID of the Order intended to be cancelled (only provided if
     * the Order has a client Order ID).
     * <p>
     * @return the Client Order ID
     * @see OrderID
     */
    public String getClientOrderID() {
        return this.clientOrderID.getOrderID();
    }

    @SerializedName("reason") private OrderCancelReason reason;

    /**
     * Set the Cancel Reason
     * <p>
     * The reason that the Order was to be cancelled.
     * <p>
     * @param reason the Cancel Reason
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     * @see OrderCancelReason
     */
    public OrderCancelRejectTransaction setReason(OrderCancelReason reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the Cancel Reason
     * <p>
     * The reason that the Order was to be cancelled.
     * <p>
     * @return the Cancel Reason
     * @see OrderCancelReason
     */
    public OrderCancelReason getReason() {
        return this.reason;
    }

    @SerializedName("rejectReason") private TransactionRejectReason rejectReason;

    /**
     * Set the Reject Reason
     * <p>
     * The reason that the Reject Transaction was created
     * <p>
     * @param rejectReason the Reject Reason
     * @return {@link OrderCancelRejectTransaction
     * OrderCancelRejectTransaction}
     * @see TransactionRejectReason
     */
    public OrderCancelRejectTransaction setRejectReason(TransactionRejectReason rejectReason) {
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
