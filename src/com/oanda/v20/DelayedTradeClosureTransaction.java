package com.oanda.v20;

import com.oanda.v20.TransactionType;
import com.oanda.v20.MarketOrderReason;
import com.google.gson.annotations.SerializedName;

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

    @SerializedName("id") private TransactionID id;

    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID
     * @return {@link DelayedTradeClosureTransaction
     * DelayedTradeClosureTransaction}
     * @see TransactionID
     */
    public DelayedTradeClosureTransaction setId(String id) {
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
     * @return {@link DelayedTradeClosureTransaction
     * DelayedTradeClosureTransaction}
     * @see DateTime
     */
    public DelayedTradeClosureTransaction setTime(String time) {
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
     * @return {@link DelayedTradeClosureTransaction
     * DelayedTradeClosureTransaction}
     */
    public DelayedTradeClosureTransaction setUserID(int userID) {
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
     * @return {@link DelayedTradeClosureTransaction
     * DelayedTradeClosureTransaction}
     * @see AccountID
     */
    public DelayedTradeClosureTransaction setAccountID(String accountID) {
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
     * @return {@link DelayedTradeClosureTransaction
     * DelayedTradeClosureTransaction}
     * @see TransactionID
     */
    public DelayedTradeClosureTransaction setBatchID(String batchID) {
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
     * @return {@link DelayedTradeClosureTransaction
     * DelayedTradeClosureTransaction}
     * @see RequestID
     */
    public DelayedTradeClosureTransaction setRequestID(String requestID) {
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

    @SerializedName("reason") private MarketOrderReason reason;

    /**
     * Set the Reason
     * <p>
     * The reason for the delayed trade closure
     * <p>
     * @param reason the Reason
     * @return {@link DelayedTradeClosureTransaction
     * DelayedTradeClosureTransaction}
     * @see MarketOrderReason
     */
    public DelayedTradeClosureTransaction setReason(MarketOrderReason reason) {
        this.reason = reason;
        return this;
    }

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

    @SerializedName("tradeIDs") private TradeID tradeIDs;

    /**
     * Set the Trade ID's
     * <p>
     * List of Trade ID's identifying the open trades that will be closed when
     * their respective instruments become tradeable
     * <p>
     * @param tradeIDs the Trade ID's
     * @return {@link DelayedTradeClosureTransaction
     * DelayedTradeClosureTransaction}
     * @see TradeID
     */
    public DelayedTradeClosureTransaction setTradeIDs(String tradeIDs) {
        this.tradeIDs = new TradeID(tradeIDs);
        return this;
    }

    /**
     * Get the Trade ID's
     * <p>
     * List of Trade ID's identifying the open trades that will be closed when
     * their respective instruments become tradeable
     * <p>
     * @return the Trade ID's
     * @see TradeID
     */
    public String getTradeIDs() {
        return this.tradeIDs.getTradeID();
    }
}
