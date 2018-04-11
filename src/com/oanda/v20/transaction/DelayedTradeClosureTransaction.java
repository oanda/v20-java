package com.oanda.v20.transaction;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.account.AccountID;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.trade.TradeID;

/**
 * A DelayedTradeClosure Transaction is created administratively to indicate
 * open trades that should have been closed but weren't because the open
 * trades' instruments were untradeable at the time. Open trades listed in this
 * transaction will be closed once their respective instruments become
 * tradeable.
 * <p>
 * Delayed Trade Closure
 */
public class DelayedTradeClosureTransaction implements Transaction {

    /**
     * Default constructor.
     */
    public DelayedTradeClosureTransaction() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the DelayedTradeClosureTransaction to copy
     */
    public DelayedTradeClosureTransaction(DelayedTradeClosureTransaction other) {
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
        this.reason = other.reason;
        this.tradeIDs = other.tradeIDs;
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
     * @return {@link DelayedTradeClosureTransaction
     * DelayedTradeClosureTransaction}
     * @see TransactionID
     */
    public DelayedTradeClosureTransaction setId(TransactionID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID as a String
     * @return {@link DelayedTradeClosureTransaction
     * DelayedTradeClosureTransaction}
     * @see TransactionID
     */
    public DelayedTradeClosureTransaction setId(String id) {
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
     * @return {@link DelayedTradeClosureTransaction
     * DelayedTradeClosureTransaction}
     * @see DateTime
     */
    public DelayedTradeClosureTransaction setTime(DateTime time) {
        this.time = time;
        return this;
    }
    /**
     * Set the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @param time the Time as a String
     * @return {@link DelayedTradeClosureTransaction
     * DelayedTradeClosureTransaction}
     * @see DateTime
     */
    public DelayedTradeClosureTransaction setTime(String time) {
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
     * @return {@link DelayedTradeClosureTransaction
     * DelayedTradeClosureTransaction}
     */
    public DelayedTradeClosureTransaction setUserID(Long userID) {
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
     * @return {@link DelayedTradeClosureTransaction
     * DelayedTradeClosureTransaction}
     * @see AccountID
     */
    public DelayedTradeClosureTransaction setAccountID(AccountID accountID) {
        this.accountID = accountID;
        return this;
    }
    /**
     * Set the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @param accountID the Account ID as a String
     * @return {@link DelayedTradeClosureTransaction
     * DelayedTradeClosureTransaction}
     * @see AccountID
     */
    public DelayedTradeClosureTransaction setAccountID(String accountID) {
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
     * @return {@link DelayedTradeClosureTransaction
     * DelayedTradeClosureTransaction}
     * @see TransactionID
     */
    public DelayedTradeClosureTransaction setBatchID(TransactionID batchID) {
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
     * @return {@link DelayedTradeClosureTransaction
     * DelayedTradeClosureTransaction}
     * @see TransactionID
     */
    public DelayedTradeClosureTransaction setBatchID(String batchID) {
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
     * @return {@link DelayedTradeClosureTransaction
     * DelayedTradeClosureTransaction}
     * @see RequestID
     */
    public DelayedTradeClosureTransaction setRequestID(RequestID requestID) {
        this.requestID = requestID;
        return this;
    }
    /**
     * Set the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @param requestID the Request ID as a String
     * @return {@link DelayedTradeClosureTransaction
     * DelayedTradeClosureTransaction}
     * @see RequestID
     */
    public DelayedTradeClosureTransaction setRequestID(String requestID) {
        this.requestID = new RequestID(requestID);
        return this;
    }

    @SerializedName("type") private TransactionType type = TransactionType.DELAYED_TRADE_CLOSURE;

    /**
     * Get the Type
     * <p>
     * The Type of the Transaction. Always set to "DELAYED_TRADE_CLOSURE" for
     * an DelayedTradeClosureTransaction.
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
     * The Type of the Transaction. Always set to "DELAYED_TRADE_CLOSURE" for
     * an DelayedTradeClosureTransaction.
     * <p>
     * @param type the Type as a TransactionType
     * @return {@link DelayedTradeClosureTransaction
     * DelayedTradeClosureTransaction}
     * @see TransactionType
     */
    public DelayedTradeClosureTransaction setType(TransactionType type) {
        this.type = type;
        return this;
    }

    @SerializedName("reason") private MarketOrderReason reason;

    /**
     * Get the Reason
     * <p>
     * The reason for the delayed trade closure
     * <p>
     * @return the Reason
     * @see MarketOrderReason
     */
    public MarketOrderReason getReason() {
        return this.reason;
    }

    /**
     * Set the Reason
     * <p>
     * The reason for the delayed trade closure
     * <p>
     * @param reason the Reason as a MarketOrderReason
     * @return {@link DelayedTradeClosureTransaction
     * DelayedTradeClosureTransaction}
     * @see MarketOrderReason
     */
    public DelayedTradeClosureTransaction setReason(MarketOrderReason reason) {
        this.reason = reason;
        return this;
    }

    @SerializedName("tradeIDs") private TradeID tradeIDs;

    /**
     * Get the Trade ID's
     * <p>
     * List of Trade ID's identifying the open trades that will be closed when
     * their respective instruments become tradeable
     * <p>
     * @return the Trade ID's
     * @see TradeID
     */
    public TradeID getTradeIDs() {
        return this.tradeIDs;
    }

    /**
     * Set the Trade ID's
     * <p>
     * List of Trade ID's identifying the open trades that will be closed when
     * their respective instruments become tradeable
     * <p>
     * @param tradeIDs the Trade ID's as a TradeID
     * @return {@link DelayedTradeClosureTransaction
     * DelayedTradeClosureTransaction}
     * @see TradeID
     */
    public DelayedTradeClosureTransaction setTradeIDs(TradeID tradeIDs) {
        this.tradeIDs = tradeIDs;
        return this;
    }
    /**
     * Set the Trade ID's
     * <p>
     * List of Trade ID's identifying the open trades that will be closed when
     * their respective instruments become tradeable
     * <p>
     * @param tradeIDs the Trade ID's as a String
     * @return {@link DelayedTradeClosureTransaction
     * DelayedTradeClosureTransaction}
     * @see TradeID
     */
    public DelayedTradeClosureTransaction setTradeIDs(String tradeIDs) {
        this.tradeIDs = new TradeID(tradeIDs);
        return this;
    }

    @Override
    public String toString() {
        return "DelayedTradeClosureTransaction(" +
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
            "reason=" +
                (reason == null ? "null" : reason.toString()) + ", " +
            "tradeIDs=" +
                (tradeIDs == null ? "null" : tradeIDs.toString()) +
            ")";
    }
}
