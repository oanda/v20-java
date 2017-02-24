package com.oanda.v20;

import com.oanda.v20.TransactionType;
import com.oanda.v20.TransactionRejectReason;
import com.google.gson.annotations.SerializedName;

/**
 * A ClientConfigureRejectTransaction represents the reject of configuration of
 * an Account by a client.
 * <p>
 * Client Configure Reject
 */
public class ClientConfigureRejectTransaction implements Transaction {

    @SerializedName("id") private TransactionID id;

    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID
     * @return {@link ClientConfigureRejectTransaction
     * ClientConfigureRejectTransaction}
     * @see TransactionID
     */
    public ClientConfigureRejectTransaction setId(String id) {
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
     * @return {@link ClientConfigureRejectTransaction
     * ClientConfigureRejectTransaction}
     * @see DateTime
     */
    public ClientConfigureRejectTransaction setTime(String time) {
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
     * @return {@link ClientConfigureRejectTransaction
     * ClientConfigureRejectTransaction}
     */
    public ClientConfigureRejectTransaction setUserID(int userID) {
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
     * @return {@link ClientConfigureRejectTransaction
     * ClientConfigureRejectTransaction}
     * @see AccountID
     */
    public ClientConfigureRejectTransaction setAccountID(String accountID) {
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
     * @return {@link ClientConfigureRejectTransaction
     * ClientConfigureRejectTransaction}
     * @see TransactionID
     */
    public ClientConfigureRejectTransaction setBatchID(String batchID) {
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
     * @return {@link ClientConfigureRejectTransaction
     * ClientConfigureRejectTransaction}
     * @see RequestID
     */
    public ClientConfigureRejectTransaction setRequestID(String requestID) {
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

    @SerializedName("type") private TransactionType type = TransactionType.CLIENT_CONFIGURE_REJECT;

    /**
     * Get the Type
     * <p>
     * The Type of the Transaction. Always set to "CLIENT_CONFIGURE_REJECT" in
     * a ClientConfigureRejectTransaction.
     * <p>
     * @return the Type
     * @see TransactionType
     */
    public TransactionType getType() {
        return this.type;
    }

    @SerializedName("alias") private String alias;

    /**
     * Set the Account Alias
     * <p>
     * The client-provided alias for the Account.
     * <p>
     * @param alias the Account Alias
     * @return {@link ClientConfigureRejectTransaction
     * ClientConfigureRejectTransaction}
     */
    public ClientConfigureRejectTransaction setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * Get the Account Alias
     * <p>
     * The client-provided alias for the Account.
     * <p>
     * @return the Account Alias
     */
    public String getAlias() {
        return this.alias;
    }

    @SerializedName("marginRate") private DecimalNumber marginRate;

    /**
     * Set the Margin Rate
     * <p>
     * The margin rate override for the Account.
     * <p>
     * @param marginRate the Margin Rate
     * @return {@link ClientConfigureRejectTransaction
     * ClientConfigureRejectTransaction}
     * @see DecimalNumber
     */
    public ClientConfigureRejectTransaction setMarginRate(double marginRate) {
        this.marginRate = new DecimalNumber(marginRate);
        return this;
    }

    /**
     * Get the Margin Rate
     * <p>
     * The margin rate override for the Account.
     * <p>
     * @return the Margin Rate
     * @see DecimalNumber
     */
    public double getMarginRate() {
        return this.marginRate.getDecimalNumber();
    }

    @SerializedName("rejectReason") private TransactionRejectReason rejectReason;

    /**
     * Set the Reject Reason
     * <p>
     * The reason that the Reject Transaction was created
     * <p>
     * @param rejectReason the Reject Reason
     * @return {@link ClientConfigureRejectTransaction
     * ClientConfigureRejectTransaction}
     * @see TransactionRejectReason
     */
    public ClientConfigureRejectTransaction setRejectReason(TransactionRejectReason rejectReason) {
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
