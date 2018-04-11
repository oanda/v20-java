package com.oanda.v20.transaction;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.account.AccountID;
import com.oanda.v20.primitives.AccountUnits;
import com.oanda.v20.primitives.DateTime;

/**
 * A TransferFundsRejectTransaction represents the rejection of the transfer of
 * funds in/out of an Account.
 * <p>
 * Account Reject Transfer of {amount}
 */
public class TransferFundsRejectTransaction implements Transaction {

    /**
     * Default constructor.
     */
    public TransferFundsRejectTransaction() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the TransferFundsRejectTransaction to copy
     */
    public TransferFundsRejectTransaction(TransferFundsRejectTransaction other) {
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
        this.amount = other.amount;
        this.fundingReason = other.fundingReason;
        this.comment = other.comment;
        this.rejectReason = other.rejectReason;
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
     * @return {@link TransferFundsRejectTransaction
     * TransferFundsRejectTransaction}
     * @see TransactionID
     */
    public TransferFundsRejectTransaction setId(TransactionID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID as a String
     * @return {@link TransferFundsRejectTransaction
     * TransferFundsRejectTransaction}
     * @see TransactionID
     */
    public TransferFundsRejectTransaction setId(String id) {
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
     * @return {@link TransferFundsRejectTransaction
     * TransferFundsRejectTransaction}
     * @see DateTime
     */
    public TransferFundsRejectTransaction setTime(DateTime time) {
        this.time = time;
        return this;
    }
    /**
     * Set the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @param time the Time as a String
     * @return {@link TransferFundsRejectTransaction
     * TransferFundsRejectTransaction}
     * @see DateTime
     */
    public TransferFundsRejectTransaction setTime(String time) {
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
     * @return {@link TransferFundsRejectTransaction
     * TransferFundsRejectTransaction}
     */
    public TransferFundsRejectTransaction setUserID(Long userID) {
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
     * @return {@link TransferFundsRejectTransaction
     * TransferFundsRejectTransaction}
     * @see AccountID
     */
    public TransferFundsRejectTransaction setAccountID(AccountID accountID) {
        this.accountID = accountID;
        return this;
    }
    /**
     * Set the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @param accountID the Account ID as a String
     * @return {@link TransferFundsRejectTransaction
     * TransferFundsRejectTransaction}
     * @see AccountID
     */
    public TransferFundsRejectTransaction setAccountID(String accountID) {
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
     * @return {@link TransferFundsRejectTransaction
     * TransferFundsRejectTransaction}
     * @see TransactionID
     */
    public TransferFundsRejectTransaction setBatchID(TransactionID batchID) {
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
     * @return {@link TransferFundsRejectTransaction
     * TransferFundsRejectTransaction}
     * @see TransactionID
     */
    public TransferFundsRejectTransaction setBatchID(String batchID) {
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
     * @return {@link TransferFundsRejectTransaction
     * TransferFundsRejectTransaction}
     * @see RequestID
     */
    public TransferFundsRejectTransaction setRequestID(RequestID requestID) {
        this.requestID = requestID;
        return this;
    }
    /**
     * Set the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @param requestID the Request ID as a String
     * @return {@link TransferFundsRejectTransaction
     * TransferFundsRejectTransaction}
     * @see RequestID
     */
    public TransferFundsRejectTransaction setRequestID(String requestID) {
        this.requestID = new RequestID(requestID);
        return this;
    }

    @SerializedName("type") private TransactionType type = TransactionType.TRANSFER_FUNDS_REJECT;

    /**
     * Get the Type
     * <p>
     * The Type of the Transaction. Always set to "TRANSFER_FUNDS_REJECT" in a
     * TransferFundsRejectTransaction.
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
     * The Type of the Transaction. Always set to "TRANSFER_FUNDS_REJECT" in a
     * TransferFundsRejectTransaction.
     * <p>
     * @param type the Type as a TransactionType
     * @return {@link TransferFundsRejectTransaction
     * TransferFundsRejectTransaction}
     * @see TransactionType
     */
    public TransferFundsRejectTransaction setType(TransactionType type) {
        this.type = type;
        return this;
    }

    @SerializedName("amount") private AccountUnits amount;

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
    public AccountUnits getAmount() {
        return this.amount;
    }

    /**
     * Set the Transfer Amount
     * <p>
     * The amount to deposit/withdraw from the Account in the Account's home
     * currency. A positive value indicates a deposit, a negative value
     * indicates a withdrawal.
     * <p>
     * @param amount the Transfer Amount as an AccountUnits
     * @return {@link TransferFundsRejectTransaction
     * TransferFundsRejectTransaction}
     * @see AccountUnits
     */
    public TransferFundsRejectTransaction setAmount(AccountUnits amount) {
        this.amount = amount;
        return this;
    }
    /**
     * Set the Transfer Amount
     * <p>
     * The amount to deposit/withdraw from the Account in the Account's home
     * currency. A positive value indicates a deposit, a negative value
     * indicates a withdrawal.
     * <p>
     * @param amount the Transfer Amount as a String
     * @return {@link TransferFundsRejectTransaction
     * TransferFundsRejectTransaction}
     * @see AccountUnits
     */
    public TransferFundsRejectTransaction setAmount(String amount) {
        this.amount = new AccountUnits(amount);
        return this;
    }
    /**
     * Set the Transfer Amount
     * <p>
     * The amount to deposit/withdraw from the Account in the Account's home
     * currency. A positive value indicates a deposit, a negative value
     * indicates a withdrawal.
     * <p>
     * @param amount the Transfer Amount as a double
     * @return {@link TransferFundsRejectTransaction
     * TransferFundsRejectTransaction}
     * @see AccountUnits
     */
    public TransferFundsRejectTransaction setAmount(double amount) {
        this.amount = new AccountUnits(amount);
        return this;
    }
    /**
     * Set the Transfer Amount
     * <p>
     * The amount to deposit/withdraw from the Account in the Account's home
     * currency. A positive value indicates a deposit, a negative value
     * indicates a withdrawal.
     * <p>
     * @param amount the Transfer Amount as a BigDecimal
     * @return {@link TransferFundsRejectTransaction
     * TransferFundsRejectTransaction}
     * @see AccountUnits
     */
    public TransferFundsRejectTransaction setAmount(BigDecimal amount) {
        this.amount = new AccountUnits(amount);
        return this;
    }

    @SerializedName("fundingReason") private FundingReason fundingReason;

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

    /**
     * Set the Reason
     * <p>
     * The reason that an Account is being funded.
     * <p>
     * @param fundingReason the Reason as a FundingReason
     * @return {@link TransferFundsRejectTransaction
     * TransferFundsRejectTransaction}
     * @see FundingReason
     */
    public TransferFundsRejectTransaction setFundingReason(FundingReason fundingReason) {
        this.fundingReason = fundingReason;
        return this;
    }

    @SerializedName("comment") private String comment;

    /**
     * Get the Comment
     * <p>
     * An optional comment that may be attached to a fund transfer for audit
     * purposes
     * <p>
     * @return the Comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * Set the Comment
     * <p>
     * An optional comment that may be attached to a fund transfer for audit
     * purposes
     * <p>
     * @param comment the Comment as a String
     * @return {@link TransferFundsRejectTransaction
     * TransferFundsRejectTransaction}
     */
    public TransferFundsRejectTransaction setComment(String comment) {
        this.comment = comment;
        return this;
    }

    @SerializedName("rejectReason") private TransactionRejectReason rejectReason;

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

    /**
     * Set the Reject Reason
     * <p>
     * The reason that the Reject Transaction was created
     * <p>
     * @param rejectReason the Reject Reason as a TransactionRejectReason
     * @return {@link TransferFundsRejectTransaction
     * TransferFundsRejectTransaction}
     * @see TransactionRejectReason
     */
    public TransferFundsRejectTransaction setRejectReason(TransactionRejectReason rejectReason) {
        this.rejectReason = rejectReason;
        return this;
    }

    @Override
    public String toString() {
        return "TransferFundsRejectTransaction(" +
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
            "amount=" +
                (amount == null ? "null" : amount.toString()) + ", " +
            "fundingReason=" +
                (fundingReason == null ? "null" : fundingReason.toString()) + ", " +
            "comment=" +
                (comment == null ? "null" : comment.toString()) + ", " +
            "rejectReason=" +
                (rejectReason == null ? "null" : rejectReason.toString()) +
            ")";
    }
}
