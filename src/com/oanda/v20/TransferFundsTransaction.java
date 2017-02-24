package com.oanda.v20;

import com.oanda.v20.TransactionType;
import com.oanda.v20.FundingReason;
import com.google.gson.annotations.SerializedName;

/**
 * A TransferFundsTransaction represents the transfer of funds in/out of an
 * Account.
 * <p>
 * Account Transfer of {amount}
 */
public class TransferFundsTransaction implements Transaction {

    @SerializedName("id") private TransactionID id;

    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID
     * @return {@link TransferFundsTransaction TransferFundsTransaction}
     * @see TransactionID
     */
    public TransferFundsTransaction setId(String id) {
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
     * @return {@link TransferFundsTransaction TransferFundsTransaction}
     * @see DateTime
     */
    public TransferFundsTransaction setTime(String time) {
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
     * @return {@link TransferFundsTransaction TransferFundsTransaction}
     */
    public TransferFundsTransaction setUserID(int userID) {
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
     * @return {@link TransferFundsTransaction TransferFundsTransaction}
     * @see AccountID
     */
    public TransferFundsTransaction setAccountID(String accountID) {
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
     * @return {@link TransferFundsTransaction TransferFundsTransaction}
     * @see TransactionID
     */
    public TransferFundsTransaction setBatchID(String batchID) {
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
     * @return {@link TransferFundsTransaction TransferFundsTransaction}
     * @see RequestID
     */
    public TransferFundsTransaction setRequestID(String requestID) {
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

    @SerializedName("type") private TransactionType type = TransactionType.TRANSFER_FUNDS;

    /**
     * Get the Type
     * <p>
     * The Type of the Transaction. Always set to "TRANSFER_FUNDS" in a
     * TransferFundsTransaction.
     * <p>
     * @return the Type
     * @see TransactionType
     */
    public TransactionType getType() {
        return this.type;
    }

    @SerializedName("amount") private AccountUnits amount;

    /**
     * Set the Transfer Amount
     * <p>
     * The amount to deposit/withdraw from the Account in the Account's home
     * currency. A positive value indicates a deposit, a negative value
     * indicates a withdrawal.
     * <p>
     * @param amount the Transfer Amount
     * @return {@link TransferFundsTransaction TransferFundsTransaction}
     * @see AccountUnits
     */
    public TransferFundsTransaction setAmount(double amount) {
        this.amount = new AccountUnits(amount);
        return this;
    }

    /**
     * Get the Transfer Amount
     * <p>
     * The amount to deposit/withdraw from the Account in the Account's home
     * currency. A positive value indicates a deposit, a negative value
     * indicates a withdrawal.
     * <p>
     * @return the Transfer Amount
     * @see AccountUnits
     */
    public double getAmount() {
        return this.amount.getAccountUnits();
    }

    @SerializedName("fundingReason") private FundingReason fundingReason;

    /**
     * Set the Reason
     * <p>
     * The reason that an Account is being funded.
     * <p>
     * @param fundingReason the Reason
     * @return {@link TransferFundsTransaction TransferFundsTransaction}
     * @see FundingReason
     */
    public TransferFundsTransaction setFundingReason(FundingReason fundingReason) {
        this.fundingReason = fundingReason;
        return this;
    }

    /**
     * Get the Reason
     * <p>
     * The reason that an Account is being funded.
     * <p>
     * @return the Reason
     * @see FundingReason
     */
    public FundingReason getFundingReason() {
        return this.fundingReason;
    }

    @SerializedName("accountBalance") private AccountUnits accountBalance;

    /**
     * Set the Account Balance
     * <p>
     * The Account's balance after funds are transferred.
     * <p>
     * @param accountBalance the Account Balance
     * @return {@link TransferFundsTransaction TransferFundsTransaction}
     * @see AccountUnits
     */
    public TransferFundsTransaction setAccountBalance(double accountBalance) {
        this.accountBalance = new AccountUnits(accountBalance);
        return this;
    }

    /**
     * Get the Account Balance
     * <p>
     * The Account's balance after funds are transferred.
     * <p>
     * @return the Account Balance
     * @see AccountUnits
     */
    public double getAccountBalance() {
        return this.accountBalance.getAccountUnits();
    }
}
