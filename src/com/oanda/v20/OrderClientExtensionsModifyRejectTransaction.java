package com.oanda.v20;

import com.oanda.v20.TransactionType;
import com.oanda.v20.TransactionRejectReason;
import com.google.gson.annotations.SerializedName;

/**
 * A OrderClientExtensionsModifyRejectTransaction represents the rejection of
 * the modification of an Order's Client Extensions.
 * <p>
 * Reject Modify Order {orderID} Client Extensions
 */
public class OrderClientExtensionsModifyRejectTransaction implements Transaction {

    @SerializedName("id") private TransactionID id;

    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID
     * @return {@link OrderClientExtensionsModifyRejectTransaction
     * OrderClientExtensionsModifyRejectTransaction}
     * @see TransactionID
     */
    public OrderClientExtensionsModifyRejectTransaction setId(String id) {
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
     * @return {@link OrderClientExtensionsModifyRejectTransaction
     * OrderClientExtensionsModifyRejectTransaction}
     * @see DateTime
     */
    public OrderClientExtensionsModifyRejectTransaction setTime(String time) {
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
     * @return {@link OrderClientExtensionsModifyRejectTransaction
     * OrderClientExtensionsModifyRejectTransaction}
     */
    public OrderClientExtensionsModifyRejectTransaction setUserID(int userID) {
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
     * @return {@link OrderClientExtensionsModifyRejectTransaction
     * OrderClientExtensionsModifyRejectTransaction}
     * @see AccountID
     */
    public OrderClientExtensionsModifyRejectTransaction setAccountID(String accountID) {
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
     * @return {@link OrderClientExtensionsModifyRejectTransaction
     * OrderClientExtensionsModifyRejectTransaction}
     * @see TransactionID
     */
    public OrderClientExtensionsModifyRejectTransaction setBatchID(String batchID) {
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
     * @return {@link OrderClientExtensionsModifyRejectTransaction
     * OrderClientExtensionsModifyRejectTransaction}
     * @see RequestID
     */
    public OrderClientExtensionsModifyRejectTransaction setRequestID(String requestID) {
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

    @SerializedName("type") private TransactionType type = TransactionType.ORDER_CLIENT_EXTENSIONS_MODIFY_REJECT;

    /**
     * Get the Type
     * <p>
     * The Type of the Transaction. Always set to
     * "ORDER_CLIENT_EXTENSIONS_MODIFY_REJECT" for a
     * OrderClientExtensionsModifyRejectTransaction.
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
     * The ID of the Order who's client extensions are to be modified.
     * <p>
     * @param orderID the Order ID
     * @return {@link OrderClientExtensionsModifyRejectTransaction
     * OrderClientExtensionsModifyRejectTransaction}
     * @see OrderID
     */
    public OrderClientExtensionsModifyRejectTransaction setOrderID(String orderID) {
        this.orderID = new OrderID(orderID);
        return this;
    }

    /**
     * Get the Order ID
     * <p>
     * The ID of the Order who's client extensions are to be modified.
     * <p>
     * @return the Order ID
     * @see OrderID
     */
    public String getOrderID() {
        return this.orderID.getOrderID();
    }

    @SerializedName("clientOrderID") private ClientID clientOrderID;

    /**
     * Set the Client Order ID
     * <p>
     * The original Client ID of the Order who's client extensions are to be
     * modified.
     * <p>
     * @param clientOrderID the Client Order ID
     * @return {@link OrderClientExtensionsModifyRejectTransaction
     * OrderClientExtensionsModifyRejectTransaction}
     * @see ClientID
     */
    public OrderClientExtensionsModifyRejectTransaction setClientOrderID(String clientOrderID) {
        this.clientOrderID = new ClientID(clientOrderID);
        return this;
    }

    /**
     * Get the Client Order ID
     * <p>
     * The original Client ID of the Order who's client extensions are to be
     * modified.
     * <p>
     * @return the Client Order ID
     * @see ClientID
     */
    public String getClientOrderID() {
        return this.clientOrderID.getClientID();
    }

    @SerializedName("clientExtensionsModify") private ClientExtensions clientExtensionsModify;

    /**
     * Set the Order Extensions
     * <p>
     * The new Client Extensions for the Order.
     * <p>
     * @param clientExtensionsModify the Order Extensions
     * @return {@link OrderClientExtensionsModifyRejectTransaction
     * OrderClientExtensionsModifyRejectTransaction}
     * @see ClientExtensions
     */
    public OrderClientExtensionsModifyRejectTransaction setClientExtensionsModify(ClientExtensions clientExtensionsModify) {
        this.clientExtensionsModify = clientExtensionsModify;
        return this;
    }

    /**
     * Get the Order Extensions
     * <p>
     * The new Client Extensions for the Order.
     * <p>
     * @return the Order Extensions
     * @see ClientExtensions
     */
    public ClientExtensions getClientExtensionsModify() {
        return this.clientExtensionsModify;
    }

    @SerializedName("tradeClientExtensionsModify") private ClientExtensions tradeClientExtensionsModify;

    /**
     * Set the Trade Extensions
     * <p>
     * The new Client Extensions for the Order's Trade on fill.
     * <p>
     * @param tradeClientExtensionsModify the Trade Extensions
     * @return {@link OrderClientExtensionsModifyRejectTransaction
     * OrderClientExtensionsModifyRejectTransaction}
     * @see ClientExtensions
     */
    public OrderClientExtensionsModifyRejectTransaction setTradeClientExtensionsModify(ClientExtensions tradeClientExtensionsModify) {
        this.tradeClientExtensionsModify = tradeClientExtensionsModify;
        return this;
    }

    /**
     * Get the Trade Extensions
     * <p>
     * The new Client Extensions for the Order's Trade on fill.
     * <p>
     * @return the Trade Extensions
     * @see ClientExtensions
     */
    public ClientExtensions getTradeClientExtensionsModify() {
        return this.tradeClientExtensionsModify;
    }

    @SerializedName("rejectReason") private TransactionRejectReason rejectReason;

    /**
     * Set the Reject Reason
     * <p>
     * The reason that the Reject Transaction was created
     * <p>
     * @param rejectReason the Reject Reason
     * @return {@link OrderClientExtensionsModifyRejectTransaction
     * OrderClientExtensionsModifyRejectTransaction}
     * @see TransactionRejectReason
     */
    public OrderClientExtensionsModifyRejectTransaction setRejectReason(TransactionRejectReason rejectReason) {
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
