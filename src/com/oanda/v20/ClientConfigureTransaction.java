package com.oanda.v20;

import com.oanda.v20.TransactionType;
import com.google.gson.annotations.SerializedName;

/**
 * A ClientConfigureTransaction represents the configuration of an Account by a
 * client.
 * <p>
 * Client Configure
 */
public class ClientConfigureTransaction implements Transaction {

    @SerializedName("id") private TransactionID id;

    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID
     * @return {@link ClientConfigureTransaction ClientConfigureTransaction}
     * @see TransactionID
     */
    public ClientConfigureTransaction setId(String id) {
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
     * @return {@link ClientConfigureTransaction ClientConfigureTransaction}
     * @see DateTime
     */
    public ClientConfigureTransaction setTime(String time) {
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
     * @return {@link ClientConfigureTransaction ClientConfigureTransaction}
     */
    public ClientConfigureTransaction setUserID(int userID) {
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
     * @return {@link ClientConfigureTransaction ClientConfigureTransaction}
     * @see AccountID
     */
    public ClientConfigureTransaction setAccountID(String accountID) {
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
     * @return {@link ClientConfigureTransaction ClientConfigureTransaction}
     * @see TransactionID
     */
    public ClientConfigureTransaction setBatchID(String batchID) {
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
     * @return {@link ClientConfigureTransaction ClientConfigureTransaction}
     * @see RequestID
     */
    public ClientConfigureTransaction setRequestID(String requestID) {
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

    @SerializedName("type") private TransactionType type = TransactionType.CLIENT_CONFIGURE;

    /**
     * Get the Type
     * <p>
     * The Type of the Transaction. Always set to "CLIENT_CONFIGURE" in a
     * ClientConfigureTransaction.
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
     * @return {@link ClientConfigureTransaction ClientConfigureTransaction}
     */
    public ClientConfigureTransaction setAlias(String alias) {
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
     * @return {@link ClientConfigureTransaction ClientConfigureTransaction}
     * @see DecimalNumber
     */
    public ClientConfigureTransaction setMarginRate(double marginRate) {
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
}
