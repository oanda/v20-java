package com.oanda.v20.transaction;

import java.util.ArrayList;
import java.util.Collection;
import java.math.BigDecimal;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.account.AccountFinancingMode;
import com.oanda.v20.account.AccountID;
import com.oanda.v20.primitives.AccountUnits;
import com.oanda.v20.primitives.DateTime;

/**
 * A DailyFinancingTransaction represents the daily payment/collection of
 * financing for an Account.
 * <p>
 * Daily Account Financing ({financing})
 */
public class DailyFinancingTransaction implements Transaction {

    /**
     * Default constructor.
     */
    public DailyFinancingTransaction() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the DailyFinancingTransaction to copy
     */
    public DailyFinancingTransaction(DailyFinancingTransaction other) {
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
        this.financing = other.financing;
        this.accountBalance = other.accountBalance;
        this.accountFinancingMode = other.accountFinancingMode;
        if (other.positionFinancings != null)
        {
            this.positionFinancings = new ArrayList<PositionFinancing>(other.positionFinancings);
        }
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
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see TransactionID
     */
    public DailyFinancingTransaction setId(TransactionID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID as a String
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see TransactionID
     */
    public DailyFinancingTransaction setId(String id) {
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
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see DateTime
     */
    public DailyFinancingTransaction setTime(DateTime time) {
        this.time = time;
        return this;
    }
    /**
     * Set the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @param time the Time as a String
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see DateTime
     */
    public DailyFinancingTransaction setTime(String time) {
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
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     */
    public DailyFinancingTransaction setUserID(Long userID) {
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
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see AccountID
     */
    public DailyFinancingTransaction setAccountID(AccountID accountID) {
        this.accountID = accountID;
        return this;
    }
    /**
     * Set the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @param accountID the Account ID as a String
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see AccountID
     */
    public DailyFinancingTransaction setAccountID(String accountID) {
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
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see TransactionID
     */
    public DailyFinancingTransaction setBatchID(TransactionID batchID) {
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
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see TransactionID
     */
    public DailyFinancingTransaction setBatchID(String batchID) {
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
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see RequestID
     */
    public DailyFinancingTransaction setRequestID(RequestID requestID) {
        this.requestID = requestID;
        return this;
    }
    /**
     * Set the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @param requestID the Request ID as a String
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see RequestID
     */
    public DailyFinancingTransaction setRequestID(String requestID) {
        this.requestID = new RequestID(requestID);
        return this;
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

    /**
     * Set the Type
     * <p>
     * The Type of the Transaction. Always set to "DAILY_FINANCING" for a
     * DailyFinancingTransaction.
     * <p>
     * @param type the Type as a TransactionType
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see TransactionType
     */
    public DailyFinancingTransaction setType(TransactionType type) {
        this.type = type;
        return this;
    }

    @SerializedName("financing") private AccountUnits financing;

    /**
     * Get the Financing
     * <p>
     * The amount of financing paid/collected for the Account.
     * <p>
     * @return the Financing
     * @see AccountUnits
     */
    public AccountUnits getFinancing() {
        return this.financing;
    }

    /**
     * Set the Financing
     * <p>
     * The amount of financing paid/collected for the Account.
     * <p>
     * @param financing the Financing as an AccountUnits
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see AccountUnits
     */
    public DailyFinancingTransaction setFinancing(AccountUnits financing) {
        this.financing = financing;
        return this;
    }
    /**
     * Set the Financing
     * <p>
     * The amount of financing paid/collected for the Account.
     * <p>
     * @param financing the Financing as a String
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see AccountUnits
     */
    public DailyFinancingTransaction setFinancing(String financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }
    /**
     * Set the Financing
     * <p>
     * The amount of financing paid/collected for the Account.
     * <p>
     * @param financing the Financing as a double
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see AccountUnits
     */
    public DailyFinancingTransaction setFinancing(double financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }
    /**
     * Set the Financing
     * <p>
     * The amount of financing paid/collected for the Account.
     * <p>
     * @param financing the Financing as a BigDecimal
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see AccountUnits
     */
    public DailyFinancingTransaction setFinancing(BigDecimal financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }

    @SerializedName("accountBalance") private AccountUnits accountBalance;

    /**
     * Get the Account Balance
     * <p>
     * The Account's balance after daily financing.
     * <p>
     * @return the Account Balance
     * @see AccountUnits
     */
    public AccountUnits getAccountBalance() {
        return this.accountBalance;
    }

    /**
     * Set the Account Balance
     * <p>
     * The Account's balance after daily financing.
     * <p>
     * @param accountBalance the Account Balance as an AccountUnits
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see AccountUnits
     */
    public DailyFinancingTransaction setAccountBalance(AccountUnits accountBalance) {
        this.accountBalance = accountBalance;
        return this;
    }
    /**
     * Set the Account Balance
     * <p>
     * The Account's balance after daily financing.
     * <p>
     * @param accountBalance the Account Balance as a String
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see AccountUnits
     */
    public DailyFinancingTransaction setAccountBalance(String accountBalance) {
        this.accountBalance = new AccountUnits(accountBalance);
        return this;
    }
    /**
     * Set the Account Balance
     * <p>
     * The Account's balance after daily financing.
     * <p>
     * @param accountBalance the Account Balance as a double
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see AccountUnits
     */
    public DailyFinancingTransaction setAccountBalance(double accountBalance) {
        this.accountBalance = new AccountUnits(accountBalance);
        return this;
    }
    /**
     * Set the Account Balance
     * <p>
     * The Account's balance after daily financing.
     * <p>
     * @param accountBalance the Account Balance as a BigDecimal
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see AccountUnits
     */
    public DailyFinancingTransaction setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = new AccountUnits(accountBalance);
        return this;
    }

    @SerializedName("accountFinancingMode") private AccountFinancingMode accountFinancingMode;

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

    /**
     * Set the Account Financing Mode
     * <p>
     * The account financing mode at the time of the daily financing.
     * <p>
     * @param accountFinancingMode the Account Financing Mode as an
     * AccountFinancingMode
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see AccountFinancingMode
     */
    public DailyFinancingTransaction setAccountFinancingMode(AccountFinancingMode accountFinancingMode) {
        this.accountFinancingMode = accountFinancingMode;
        return this;
    }

    @SerializedName("positionFinancings") private ArrayList<PositionFinancing> positionFinancings;

    /**
     * Get the Per-Position Financing
     * <p>
     * The financing paid/collected for each Position in the Account.
     * <p>
     * @return the Per-Position Financing
     * @see PositionFinancing
     */
    public List<PositionFinancing> getPositionFinancings() {
        return this.positionFinancings;
    }

    /**
     * Set the Per-Position Financing
     * <p>
     * The financing paid/collected for each Position in the Account.
     * <p>
     * @param positionFinancings the Per-Position Financing
     * @return {@link DailyFinancingTransaction DailyFinancingTransaction}
     * @see PositionFinancing
     */
    public DailyFinancingTransaction setPositionFinancings(Collection<?> positionFinancings) {
        ArrayList<PositionFinancing> newPositionFinancings = new ArrayList<PositionFinancing>(positionFinancings.size());
        positionFinancings.forEach((item) -> {
            if (item instanceof PositionFinancing)
            {
                newPositionFinancings.add((PositionFinancing) item);
            }
            else
            {
                throw new IllegalArgumentException(
                    item.getClass().getName() + " cannot be converted to a PositionFinancing"
                );
            }
        });
        this.positionFinancings = newPositionFinancings;
        return this;
    }

    @Override
    public String toString() {
        return "DailyFinancingTransaction(" +
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
            "financing=" +
                (financing == null ? "null" : financing.toString()) + ", " +
            "accountBalance=" +
                (accountBalance == null ? "null" : accountBalance.toString()) + ", " +
            "accountFinancingMode=" +
                (accountFinancingMode == null ? "null" : accountFinancingMode.toString()) + ", " +
            "positionFinancings=" +
                (positionFinancings == null ? "null" : positionFinancings.toString()) +
            ")";
    }
}
