package com.oanda.v20;

import com.oanda.v20.TransactionType;
import com.oanda.v20.AccountFinancingMode;
import com.google.gson.annotations.SerializedName;

/**
 * A DailyFinancingTransaction represents the daily payment/collection of
 * financing for an Account.
 * <p>
 * Daily Account Financing ({financing})
 */
public class DailyFinancingTransaction implements Transaction {

    @SerializedName("id") private TransactionID id;

    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see TransactionID
     */
    public DailyFinancingTransaction setId(String id) {
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
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see DateTime
     */
    public DailyFinancingTransaction setTime(String time) {
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
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     */
    public DailyFinancingTransaction setUserID(int userID) {
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
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see AccountID
     */
    public DailyFinancingTransaction setAccountID(String accountID) {
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
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see TransactionID
     */
    public DailyFinancingTransaction setBatchID(String batchID) {
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
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see RequestID
     */
    public DailyFinancingTransaction setRequestID(String requestID) {
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

    @SerializedName("type") private TransactionType type = TransactionType.DAILY_FINANCING;

    /**
     * Get the Type
     * <p>
     * The Type of the Transaction. Always set to "DAILY_FINANCING" for a
     * DailyFinancingTransaction.
     * <p>
     * @return the Type
     * @see TransactionType
     */
    public TransactionType getType() {
        return this.type;
    }

    @SerializedName("financing") private AccountUnits financing;

    /**
     * Set the Financing
     * <p>
     * The amount of financing paid/collected for the Account.
     * <p>
     * @param financing the Financing
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see AccountUnits
     */
    public DailyFinancingTransaction setFinancing(double financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }

    /**
     * Get the Financing
     * <p>
     * The amount of financing paid/collected for the Account.
     * <p>
     * @return the Financing
     * @see AccountUnits
     */
    public double getFinancing() {
        return this.financing.getAccountUnits();
    }

    @SerializedName("accountBalance") private AccountUnits accountBalance;

    /**
     * Set the Account Balance
     * <p>
     * The Account's balance after daily financing.
     * <p>
     * @param accountBalance the Account Balance
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see AccountUnits
     */
    public DailyFinancingTransaction setAccountBalance(double accountBalance) {
        this.accountBalance = new AccountUnits(accountBalance);
        return this;
    }

    /**
     * Get the Account Balance
     * <p>
     * The Account's balance after daily financing.
     * <p>
     * @return the Account Balance
     * @see AccountUnits
     */
    public double getAccountBalance() {
        return this.accountBalance.getAccountUnits();
    }

    @SerializedName("accountFinancingMode") private AccountFinancingMode accountFinancingMode;

    /**
     * Set the Account Financing Mode
     * <p>
     * The account financing mode at the time of the daily financing.
     * <p>
     * @param accountFinancingMode the Account Financing Mode
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see AccountFinancingMode
     */
    public DailyFinancingTransaction setAccountFinancingMode(AccountFinancingMode accountFinancingMode) {
        this.accountFinancingMode = accountFinancingMode;
        return this;
    }

    /**
     * Get the Account Financing Mode
     * <p>
     * The account financing mode at the time of the daily financing.
     * <p>
     * @return the Account Financing Mode
     * @see AccountFinancingMode
     */
    public AccountFinancingMode getAccountFinancingMode() {
        return this.accountFinancingMode;
    }

    @SerializedName("positionFinancings") private PositionFinancing[] positionFinancings;

    /**
     * Set the Per-Position Financing
     * <p>
     * The financing paid/collected for each Position in the Account.
     * <p>
     * @param positionFinancings the Per-Position Financing
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see PositionFinancing
     */
    public DailyFinancingTransaction setPositionFinancings(PositionFinancing[] positionFinancings) {
        this.positionFinancings = positionFinancings;
        return this;
    }

    /**
     * Get the Per-Position Financing
     * <p>
     * The financing paid/collected for each Position in the Account.
     * <p>
     * @return the Per-Position Financing
     * @see PositionFinancing
     */
    public PositionFinancing[] getPositionFinancings() {
        return this.positionFinancings;
    }
}
