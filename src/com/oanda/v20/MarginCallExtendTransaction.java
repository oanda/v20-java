package com.oanda.v20;

import com.oanda.v20.TransactionType;
import com.google.gson.annotations.SerializedName;

/**
 * A MarginCallExtendTransaction is created when the margin call state for an
 * Account has been extended.
 * <p>
 * Margin Call Enter
 */
public class MarginCallExtendTransaction implements Transaction {

    @SerializedName("id") private TransactionID id;

    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID
     * @return {@link MarginCallExtendTransaction MarginCallExtendTransaction}
     * @see TransactionID
     */
    public MarginCallExtendTransaction setId(String id) {
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
     * @return {@link MarginCallExtendTransaction MarginCallExtendTransaction}
     * @see DateTime
     */
    public MarginCallExtendTransaction setTime(String time) {
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
     * @return {@link MarginCallExtendTransaction MarginCallExtendTransaction}
     */
    public MarginCallExtendTransaction setUserID(int userID) {
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
     * @return {@link MarginCallExtendTransaction MarginCallExtendTransaction}
     * @see AccountID
     */
    public MarginCallExtendTransaction setAccountID(String accountID) {
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
     * @return {@link MarginCallExtendTransaction MarginCallExtendTransaction}
     * @see TransactionID
     */
    public MarginCallExtendTransaction setBatchID(String batchID) {
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
     * @return {@link MarginCallExtendTransaction MarginCallExtendTransaction}
     * @see RequestID
     */
    public MarginCallExtendTransaction setRequestID(String requestID) {
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

    @SerializedName("extensionNumber") private Integer extensionNumber;

    /**
     * Set the Extension Number
     * <p>
     * The number of the extensions to the Account's current margin call that
     * have been applied. This value will be set to 1 for the first
     * MarginCallExtend Transaction
     * <p>
     * @param extensionNumber the Extension Number
     * @return {@link MarginCallExtendTransaction MarginCallExtendTransaction}
     */
    public MarginCallExtendTransaction setExtensionNumber(int extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     * Get the Extension Number
     * <p>
     * The number of the extensions to the Account's current margin call that
     * have been applied. This value will be set to 1 for the first
     * MarginCallExtend Transaction
     * <p>
     * @return the Extension Number
     */
    public int getExtensionNumber() {
        return this.extensionNumber;
    }
}
