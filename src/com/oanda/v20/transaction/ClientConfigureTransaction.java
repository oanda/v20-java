package com.oanda.v20.transaction;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.account.AccountID;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.primitives.DecimalNumber;

/**
 * A ClientConfigureTransaction represents the configuration of an Account by a
 * client.
 * <p>
 * Client Configure
 */
public class ClientConfigureTransaction implements Transaction {

    /**
     * Default constructor.
     */
    public ClientConfigureTransaction() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the ClientConfigureTransaction to copy
     */
    public ClientConfigureTransaction(ClientConfigureTransaction other) {
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
        this.alias = other.alias;
        this.marginRate = other.marginRate;
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
     * @return {@link ClientConfigureTransaction ClientConfigureTransaction}
     * @see TransactionID
     */
    public ClientConfigureTransaction setId(TransactionID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID as a String
     * @return {@link ClientConfigureTransaction ClientConfigureTransaction}
     * @see TransactionID
     */
    public ClientConfigureTransaction setId(String id) {
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
     * @return {@link ClientConfigureTransaction ClientConfigureTransaction}
     * @see DateTime
     */
    public ClientConfigureTransaction setTime(DateTime time) {
        this.time = time;
        return this;
    }
    /**
     * Set the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @param time the Time as a String
     * @return {@link ClientConfigureTransaction ClientConfigureTransaction}
     * @see DateTime
     */
    public ClientConfigureTransaction setTime(String time) {
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
     * @return {@link ClientConfigureTransaction ClientConfigureTransaction}
     */
    public ClientConfigureTransaction setUserID(Long userID) {
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
     * @return {@link ClientConfigureTransaction ClientConfigureTransaction}
     * @see AccountID
     */
    public ClientConfigureTransaction setAccountID(AccountID accountID) {
        this.accountID = accountID;
        return this;
    }
    /**
     * Set the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @param accountID the Account ID as a String
     * @return {@link ClientConfigureTransaction ClientConfigureTransaction}
     * @see AccountID
     */
    public ClientConfigureTransaction setAccountID(String accountID) {
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
     * @return {@link ClientConfigureTransaction ClientConfigureTransaction}
     * @see TransactionID
     */
    public ClientConfigureTransaction setBatchID(TransactionID batchID) {
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
     * @return {@link ClientConfigureTransaction ClientConfigureTransaction}
     * @see TransactionID
     */
    public ClientConfigureTransaction setBatchID(String batchID) {
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
     * @return {@link ClientConfigureTransaction ClientConfigureTransaction}
     * @see RequestID
     */
    public ClientConfigureTransaction setRequestID(RequestID requestID) {
        this.requestID = requestID;
        return this;
    }
    /**
     * Set the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @param requestID the Request ID as a String
     * @return {@link ClientConfigureTransaction ClientConfigureTransaction}
     * @see RequestID
     */
    public ClientConfigureTransaction setRequestID(String requestID) {
        this.requestID = new RequestID(requestID);
        return this;
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

    /**
     * Set the Type
     * <p>
     * The Type of the Transaction. Always set to "CLIENT_CONFIGURE" in a
     * ClientConfigureTransaction.
     * <p>
     * @param type the Type as a TransactionType
     * @return {@link ClientConfigureTransaction ClientConfigureTransaction}
     * @see TransactionType
     */
    public ClientConfigureTransaction setType(TransactionType type) {
        this.type = type;
        return this;
    }

    @SerializedName("alias") private String alias;

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

    /**
     * Set the Account Alias
     * <p>
     * The client-provided alias for the Account.
     * <p>
     * @param alias the Account Alias as a String
     * @return {@link ClientConfigureTransaction ClientConfigureTransaction}
     */
    public ClientConfigureTransaction setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    @SerializedName("marginRate") private DecimalNumber marginRate;

    /**
     * Get the Margin Rate
     * <p>
     * The margin rate override for the Account.
     * <p>
     * @return the Margin Rate
     * @see DecimalNumber
     */
    public DecimalNumber getMarginRate() {
        return this.marginRate;
    }

    /**
     * Set the Margin Rate
     * <p>
     * The margin rate override for the Account.
     * <p>
     * @param marginRate the Margin Rate as a DecimalNumber
     * @return {@link ClientConfigureTransaction ClientConfigureTransaction}
     * @see DecimalNumber
     */
    public ClientConfigureTransaction setMarginRate(DecimalNumber marginRate) {
        this.marginRate = marginRate;
        return this;
    }
    /**
     * Set the Margin Rate
     * <p>
     * The margin rate override for the Account.
     * <p>
     * @param marginRate the Margin Rate as a String
     * @return {@link ClientConfigureTransaction ClientConfigureTransaction}
     * @see DecimalNumber
     */
    public ClientConfigureTransaction setMarginRate(String marginRate) {
        this.marginRate = new DecimalNumber(marginRate);
        return this;
    }
    /**
     * Set the Margin Rate
     * <p>
     * The margin rate override for the Account.
     * <p>
     * @param marginRate the Margin Rate as a double
     * @return {@link ClientConfigureTransaction ClientConfigureTransaction}
     * @see DecimalNumber
     */
    public ClientConfigureTransaction setMarginRate(double marginRate) {
        this.marginRate = new DecimalNumber(marginRate);
        return this;
    }
    /**
     * Set the Margin Rate
     * <p>
     * The margin rate override for the Account.
     * <p>
     * @param marginRate the Margin Rate as a BigDecimal
     * @return {@link ClientConfigureTransaction ClientConfigureTransaction}
     * @see DecimalNumber
     */
    public ClientConfigureTransaction setMarginRate(BigDecimal marginRate) {
        this.marginRate = new DecimalNumber(marginRate);
        return this;
    }

    @Override
    public String toString() {
        return "ClientConfigureTransaction(" +
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
            "alias=" +
                (alias == null ? "null" : alias.toString()) + ", " +
            "marginRate=" +
                (marginRate == null ? "null" : marginRate.toString()) +
            ")";
    }
}
