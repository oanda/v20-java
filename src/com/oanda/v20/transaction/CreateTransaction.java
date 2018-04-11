package com.oanda.v20.transaction;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.account.AccountID;
import com.oanda.v20.primitives.Currency;
import com.oanda.v20.primitives.DateTime;

/**
 * A CreateTransaction represents the creation of an Account.
 * <p>
 * Create Account {accountID}
 */
public class CreateTransaction implements Transaction {

    /**
     * Default constructor.
     */
    public CreateTransaction() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the CreateTransaction to copy
     */
    public CreateTransaction(CreateTransaction other) {
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
        if (other.divisionID != null)
        {
            this.divisionID = new Long(other.divisionID);
        }
        if (other.siteID != null)
        {
            this.siteID = new Long(other.siteID);
        }
        if (other.accountUserID != null)
        {
            this.accountUserID = new Long(other.accountUserID);
        }
        if (other.accountNumber != null)
        {
            this.accountNumber = new Long(other.accountNumber);
        }
        this.homeCurrency = other.homeCurrency;
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
     * @return {@link CreateTransaction CreateTransaction}
     * @see TransactionID
     */
    public CreateTransaction setId(TransactionID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID as a String
     * @return {@link CreateTransaction CreateTransaction}
     * @see TransactionID
     */
    public CreateTransaction setId(String id) {
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
     * @return {@link CreateTransaction CreateTransaction}
     * @see DateTime
     */
    public CreateTransaction setTime(DateTime time) {
        this.time = time;
        return this;
    }
    /**
     * Set the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @param time the Time as a String
     * @return {@link CreateTransaction CreateTransaction}
     * @see DateTime
     */
    public CreateTransaction setTime(String time) {
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
     * @return {@link CreateTransaction CreateTransaction}
     */
    public CreateTransaction setUserID(Long userID) {
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
     * @return {@link CreateTransaction CreateTransaction}
     * @see AccountID
     */
    public CreateTransaction setAccountID(AccountID accountID) {
        this.accountID = accountID;
        return this;
    }
    /**
     * Set the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @param accountID the Account ID as a String
     * @return {@link CreateTransaction CreateTransaction}
     * @see AccountID
     */
    public CreateTransaction setAccountID(String accountID) {
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
     * @return {@link CreateTransaction CreateTransaction}
     * @see TransactionID
     */
    public CreateTransaction setBatchID(TransactionID batchID) {
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
     * @return {@link CreateTransaction CreateTransaction}
     * @see TransactionID
     */
    public CreateTransaction setBatchID(String batchID) {
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
     * @return {@link CreateTransaction CreateTransaction}
     * @see RequestID
     */
    public CreateTransaction setRequestID(RequestID requestID) {
        this.requestID = requestID;
        return this;
    }
    /**
     * Set the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @param requestID the Request ID as a String
     * @return {@link CreateTransaction CreateTransaction}
     * @see RequestID
     */
    public CreateTransaction setRequestID(String requestID) {
        this.requestID = new RequestID(requestID);
        return this;
    }

    @SerializedName("type") private TransactionType type = TransactionType.CREATE;

    /**
     * Get the Type
     * <p>
     * The Type of the Transaction. Always set to "CREATE" in a
     * CreateTransaction.
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
     * The Type of the Transaction. Always set to "CREATE" in a
     * CreateTransaction.
     * <p>
     * @param type the Type as a TransactionType
     * @return {@link CreateTransaction CreateTransaction}
     * @see TransactionType
     */
    public CreateTransaction setType(TransactionType type) {
        this.type = type;
        return this;
    }

    @SerializedName("divisionID") private Long divisionID;

    /**
     * Get the Division ID
     * <p>
     * The ID of the Division that the Account is in
     * <p>
     * @return the Division ID
     */
    public Long getDivisionID() {
        return this.divisionID;
    }

    /**
     * Set the Division ID
     * <p>
     * The ID of the Division that the Account is in
     * <p>
     * @param divisionID the Division ID as a Long
     * @return {@link CreateTransaction CreateTransaction}
     */
    public CreateTransaction setDivisionID(Long divisionID) {
        this.divisionID = divisionID;
        return this;
    }

    @SerializedName("siteID") private Long siteID;

    /**
     * Get the Site ID
     * <p>
     * The ID of the Site that the Account was created at
     * <p>
     * @return the Site ID
     */
    public Long getSiteID() {
        return this.siteID;
    }

    /**
     * Set the Site ID
     * <p>
     * The ID of the Site that the Account was created at
     * <p>
     * @param siteID the Site ID as a Long
     * @return {@link CreateTransaction CreateTransaction}
     */
    public CreateTransaction setSiteID(Long siteID) {
        this.siteID = siteID;
        return this;
    }

    @SerializedName("accountUserID") private Long accountUserID;

    /**
     * Get the Account User ID
     * <p>
     * The ID of the user that the Account was created for
     * <p>
     * @return the Account User ID
     */
    public Long getAccountUserID() {
        return this.accountUserID;
    }

    /**
     * Set the Account User ID
     * <p>
     * The ID of the user that the Account was created for
     * <p>
     * @param accountUserID the Account User ID as a Long
     * @return {@link CreateTransaction CreateTransaction}
     */
    public CreateTransaction setAccountUserID(Long accountUserID) {
        this.accountUserID = accountUserID;
        return this;
    }

    @SerializedName("accountNumber") private Long accountNumber;

    /**
     * Get the Account Number
     * <p>
     * The number of the Account within the site/division/user
     * <p>
     * @return the Account Number
     */
    public Long getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Set the Account Number
     * <p>
     * The number of the Account within the site/division/user
     * <p>
     * @param accountNumber the Account Number as a Long
     * @return {@link CreateTransaction CreateTransaction}
     */
    public CreateTransaction setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    @SerializedName("homeCurrency") private Currency homeCurrency;

    /**
     * Get the Home Currency
     * <p>
     * The home currency of the Account
     * <p>
     * @return the Home Currency
     * @see Currency
     */
    public Currency getHomeCurrency() {
        return this.homeCurrency;
    }

    /**
     * Set the Home Currency
     * <p>
     * The home currency of the Account
     * <p>
     * @param homeCurrency the Home Currency as a Currency
     * @return {@link CreateTransaction CreateTransaction}
     * @see Currency
     */
    public CreateTransaction setHomeCurrency(Currency homeCurrency) {
        this.homeCurrency = homeCurrency;
        return this;
    }
    /**
     * Set the Home Currency
     * <p>
     * The home currency of the Account
     * <p>
     * @param homeCurrency the Home Currency as a String
     * @return {@link CreateTransaction CreateTransaction}
     * @see Currency
     */
    public CreateTransaction setHomeCurrency(String homeCurrency) {
        this.homeCurrency = new Currency(homeCurrency);
        return this;
    }

    @Override
    public String toString() {
        return "CreateTransaction(" +
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
            "divisionID=" +
                (divisionID == null ? "null" : divisionID.toString()) + ", " +
            "siteID=" +
                (siteID == null ? "null" : siteID.toString()) + ", " +
            "accountUserID=" +
                (accountUserID == null ? "null" : accountUserID.toString()) + ", " +
            "accountNumber=" +
                (accountNumber == null ? "null" : accountNumber.toString()) + ", " +
            "homeCurrency=" +
                (homeCurrency == null ? "null" : homeCurrency.toString()) +
            ")";
    }
}
