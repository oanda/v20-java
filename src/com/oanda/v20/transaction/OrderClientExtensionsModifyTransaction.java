package com.oanda.v20.transaction;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.account.AccountID;
import com.oanda.v20.order.OrderID;
import com.oanda.v20.primitives.DateTime;

/**
 * A OrderClientExtensionsModifyTransaction represents the modification of an
 * Order's Client Extensions.
 * <p>
 * Modify Order {orderID} Client Extensions
 */
public class OrderClientExtensionsModifyTransaction implements Transaction {

    /**
     * Default constructor.
     */
    public OrderClientExtensionsModifyTransaction() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the OrderClientExtensionsModifyTransaction to copy
     */
    public OrderClientExtensionsModifyTransaction(OrderClientExtensionsModifyTransaction other) {
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
        if (other.clientExtensionsModify != null)
        {
            this.clientExtensionsModify = new ClientExtensions(other.clientExtensionsModify);
        }
        if (other.tradeClientExtensionsModify != null)
        {
            this.tradeClientExtensionsModify = new ClientExtensions(other.tradeClientExtensionsModify);
        }
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
     * @return {@link OrderClientExtensionsModifyTransaction
     * OrderClientExtensionsModifyTransaction}
     * @see TransactionID
     */
    public OrderClientExtensionsModifyTransaction setId(TransactionID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID as a String
     * @return {@link OrderClientExtensionsModifyTransaction
     * OrderClientExtensionsModifyTransaction}
     * @see TransactionID
     */
    public OrderClientExtensionsModifyTransaction setId(String id) {
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
     * @return {@link OrderClientExtensionsModifyTransaction
     * OrderClientExtensionsModifyTransaction}
     * @see DateTime
     */
    public OrderClientExtensionsModifyTransaction setTime(DateTime time) {
        this.time = time;
        return this;
    }
    /**
     * Set the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @param time the Time as a String
     * @return {@link OrderClientExtensionsModifyTransaction
     * OrderClientExtensionsModifyTransaction}
     * @see DateTime
     */
    public OrderClientExtensionsModifyTransaction setTime(String time) {
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
     * @return {@link OrderClientExtensionsModifyTransaction
     * OrderClientExtensionsModifyTransaction}
     */
    public OrderClientExtensionsModifyTransaction setUserID(Long userID) {
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
     * @return {@link OrderClientExtensionsModifyTransaction
     * OrderClientExtensionsModifyTransaction}
     * @see AccountID
     */
    public OrderClientExtensionsModifyTransaction setAccountID(AccountID accountID) {
        this.accountID = accountID;
        return this;
    }
    /**
     * Set the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @param accountID the Account ID as a String
     * @return {@link OrderClientExtensionsModifyTransaction
     * OrderClientExtensionsModifyTransaction}
     * @see AccountID
     */
    public OrderClientExtensionsModifyTransaction setAccountID(String accountID) {
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
     * @return {@link OrderClientExtensionsModifyTransaction
     * OrderClientExtensionsModifyTransaction}
     * @see TransactionID
     */
    public OrderClientExtensionsModifyTransaction setBatchID(TransactionID batchID) {
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
     * @return {@link OrderClientExtensionsModifyTransaction
     * OrderClientExtensionsModifyTransaction}
     * @see TransactionID
     */
    public OrderClientExtensionsModifyTransaction setBatchID(String batchID) {
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
     * @return {@link OrderClientExtensionsModifyTransaction
     * OrderClientExtensionsModifyTransaction}
     * @see RequestID
     */
    public OrderClientExtensionsModifyTransaction setRequestID(RequestID requestID) {
        this.requestID = requestID;
        return this;
    }
    /**
     * Set the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @param requestID the Request ID as a String
     * @return {@link OrderClientExtensionsModifyTransaction
     * OrderClientExtensionsModifyTransaction}
     * @see RequestID
     */
    public OrderClientExtensionsModifyTransaction setRequestID(String requestID) {
        this.requestID = new RequestID(requestID);
        return this;
    }

    @SerializedName("type") private TransactionType type = TransactionType.ORDER_CLIENT_EXTENSIONS_MODIFY;

    /**
     * Get the Type
     * <p>
     * The Type of the Transaction. Always set to
     * "ORDER_CLIENT_EXTENSIONS_MODIFY" for a
     * OrderClienteExtensionsModifyTransaction.
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
     * The Type of the Transaction. Always set to
     * "ORDER_CLIENT_EXTENSIONS_MODIFY" for a
     * OrderClienteExtensionsModifyTransaction.
     * <p>
     * @param type the Type as a TransactionType
     * @return {@link OrderClientExtensionsModifyTransaction
     * OrderClientExtensionsModifyTransaction}
     * @see TransactionType
     */
    public OrderClientExtensionsModifyTransaction setType(TransactionType type) {
        this.type = type;
        return this;
    }

    @SerializedName("orderID") private OrderID orderID;

    /**
     * Get the Order ID
     * <p>
     * The ID of the Order who's client extensions are to be modified.
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
     * The ID of the Order who's client extensions are to be modified.
     * <p>
     * @param orderID the Order ID as an OrderID
     * @return {@link OrderClientExtensionsModifyTransaction
     * OrderClientExtensionsModifyTransaction}
     * @see OrderID
     */
    public OrderClientExtensionsModifyTransaction setOrderID(OrderID orderID) {
        this.orderID = orderID;
        return this;
    }
    /**
     * Set the Order ID
     * <p>
     * The ID of the Order who's client extensions are to be modified.
     * <p>
     * @param orderID the Order ID as a String
     * @return {@link OrderClientExtensionsModifyTransaction
     * OrderClientExtensionsModifyTransaction}
     * @see OrderID
     */
    public OrderClientExtensionsModifyTransaction setOrderID(String orderID) {
        this.orderID = new OrderID(orderID);
        return this;
    }

    @SerializedName("clientOrderID") private ClientID clientOrderID;

    /**
     * Get the Client Order ID
     * <p>
     * The original Client ID of the Order who's client extensions are to be
     * modified.
     * <p>
     * @return the Client Order ID
     * @see ClientID
     */
    public ClientID getClientOrderID() {
        return this.clientOrderID;
    }

    /**
     * Set the Client Order ID
     * <p>
     * The original Client ID of the Order who's client extensions are to be
     * modified.
     * <p>
     * @param clientOrderID the Client Order ID as a ClientID
     * @return {@link OrderClientExtensionsModifyTransaction
     * OrderClientExtensionsModifyTransaction}
     * @see ClientID
     */
    public OrderClientExtensionsModifyTransaction setClientOrderID(ClientID clientOrderID) {
        this.clientOrderID = clientOrderID;
        return this;
    }
    /**
     * Set the Client Order ID
     * <p>
     * The original Client ID of the Order who's client extensions are to be
     * modified.
     * <p>
     * @param clientOrderID the Client Order ID as a String
     * @return {@link OrderClientExtensionsModifyTransaction
     * OrderClientExtensionsModifyTransaction}
     * @see ClientID
     */
    public OrderClientExtensionsModifyTransaction setClientOrderID(String clientOrderID) {
        this.clientOrderID = new ClientID(clientOrderID);
        return this;
    }

    @SerializedName("clientExtensionsModify") private ClientExtensions clientExtensionsModify;

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

    /**
     * Set the Order Extensions
     * <p>
     * The new Client Extensions for the Order.
     * <p>
     * @param clientExtensionsModify the Order Extensions as a ClientExtensions
     * @return {@link OrderClientExtensionsModifyTransaction
     * OrderClientExtensionsModifyTransaction}
     * @see ClientExtensions
     */
    public OrderClientExtensionsModifyTransaction setClientExtensionsModify(ClientExtensions clientExtensionsModify) {
        this.clientExtensionsModify = clientExtensionsModify;
        return this;
    }

    @SerializedName("tradeClientExtensionsModify") private ClientExtensions tradeClientExtensionsModify;

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

    /**
     * Set the Trade Extensions
     * <p>
     * The new Client Extensions for the Order's Trade on fill.
     * <p>
     * @param tradeClientExtensionsModify the Trade Extensions as a
     * ClientExtensions
     * @return {@link OrderClientExtensionsModifyTransaction
     * OrderClientExtensionsModifyTransaction}
     * @see ClientExtensions
     */
    public OrderClientExtensionsModifyTransaction setTradeClientExtensionsModify(ClientExtensions tradeClientExtensionsModify) {
        this.tradeClientExtensionsModify = tradeClientExtensionsModify;
        return this;
    }

    @Override
    public String toString() {
        return "OrderClientExtensionsModifyTransaction(" +
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
            "clientExtensionsModify=" +
                (clientExtensionsModify == null ? "null" : clientExtensionsModify.toString()) + ", " +
            "tradeClientExtensionsModify=" +
                (tradeClientExtensionsModify == null ? "null" : tradeClientExtensionsModify.toString()) +
            ")";
    }
}
