package com.oanda.v20.transaction;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.account.AccountID;
import com.oanda.v20.primitives.DateTime;

/**
 * A MarginCallExtendTransaction is created when the margin call state for an
 * Account has been extended.
 * <p>
 * Margin Call Enter
 */
public class MarginCallExtendTransaction implements Transaction {

    /**
     * Default constructor.
     */
    public MarginCallExtendTransaction() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the MarginCallExtendTransaction to copy
     */
    public MarginCallExtendTransaction(MarginCallExtendTransaction other) {
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
        if (other.extensionNumber != null)
        {
            this.extensionNumber = new Long(other.extensionNumber);
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
     * @return {@link MarginCallExtendTransaction MarginCallExtendTransaction}
     * @see TransactionID
     */
    public MarginCallExtendTransaction setId(TransactionID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID as a String
     * @return {@link MarginCallExtendTransaction MarginCallExtendTransaction}
     * @see TransactionID
     */
    public MarginCallExtendTransaction setId(String id) {
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
     * @return {@link MarginCallExtendTransaction MarginCallExtendTransaction}
     * @see DateTime
     */
    public MarginCallExtendTransaction setTime(DateTime time) {
        this.time = time;
        return this;
    }
    /**
     * Set the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @param time the Time as a String
     * @return {@link MarginCallExtendTransaction MarginCallExtendTransaction}
     * @see DateTime
     */
    public MarginCallExtendTransaction setTime(String time) {
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
     * @return {@link MarginCallExtendTransaction MarginCallExtendTransaction}
     */
    public MarginCallExtendTransaction setUserID(Long userID) {
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
     * @return {@link MarginCallExtendTransaction MarginCallExtendTransaction}
     * @see AccountID
     */
    public MarginCallExtendTransaction setAccountID(AccountID accountID) {
        this.accountID = accountID;
        return this;
    }
    /**
     * Set the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @param accountID the Account ID as a String
     * @return {@link MarginCallExtendTransaction MarginCallExtendTransaction}
     * @see AccountID
     */
    public MarginCallExtendTransaction setAccountID(String accountID) {
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
     * @return {@link MarginCallExtendTransaction MarginCallExtendTransaction}
     * @see TransactionID
     */
    public MarginCallExtendTransaction setBatchID(TransactionID batchID) {
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
     * @return {@link MarginCallExtendTransaction MarginCallExtendTransaction}
     * @see TransactionID
     */
    public MarginCallExtendTransaction setBatchID(String batchID) {
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
     * @return {@link MarginCallExtendTransaction MarginCallExtendTransaction}
     * @see RequestID
     */
    public MarginCallExtendTransaction setRequestID(RequestID requestID) {
        this.requestID = requestID;
        return this;
    }
    /**
     * Set the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @param requestID the Request ID as a String
     * @return {@link MarginCallExtendTransaction MarginCallExtendTransaction}
     * @see RequestID
     */
    public MarginCallExtendTransaction setRequestID(String requestID) {
        this.requestID = new RequestID(requestID);
        return this;
    }

    @SerializedName("type") private TransactionType type = TransactionType.MARGIN_CALL_EXTEND;

    /**
     * Get the Type
     * <p>
     * The Type of the Transaction. Always set to "MARGIN_CALL_EXTEND" for an
     * MarginCallExtendTransaction.
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
     * The Type of the Transaction. Always set to "MARGIN_CALL_EXTEND" for an
     * MarginCallExtendTransaction.
     * <p>
     * @param type the Type as a TransactionType
     * @return {@link MarginCallExtendTransaction MarginCallExtendTransaction}
     * @see TransactionType
     */
    public MarginCallExtendTransaction setType(TransactionType type) {
        this.type = type;
        return this;
    }

    @SerializedName("extensionNumber") private Long extensionNumber;

    /**
     * Get the Extension Number
     * <p>
     * The number of the extensions to the Account's current margin call that
     * have been applied. This value will be set to 1 for the first
     * MarginCallExtend Transaction
     * <p>
     * @return the Extension Number
     */
    public Long getExtensionNumber() {
        return this.extensionNumber;
    }

    /**
     * Set the Extension Number
     * <p>
     * The number of the extensions to the Account's current margin call that
     * have been applied. This value will be set to 1 for the first
     * MarginCallExtend Transaction
     * <p>
     * @param extensionNumber the Extension Number as a Long
     * @return {@link MarginCallExtendTransaction MarginCallExtendTransaction}
     */
    public MarginCallExtendTransaction setExtensionNumber(Long extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    @Override
    public String toString() {
        return "MarginCallExtendTransaction(" +
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
            "extensionNumber=" +
                (extensionNumber == null ? "null" : extensionNumber.toString()) +
            ")";
    }
}
