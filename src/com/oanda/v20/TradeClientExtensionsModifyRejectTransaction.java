package com.oanda.v20;

import com.oanda.v20.TransactionType;
import com.oanda.v20.TransactionRejectReason;
import com.google.gson.annotations.SerializedName;

/**
 * A TradeClientExtensionsModifyRejectTransaction represents the rejection of
 * the modification of a Trade's Client Extensions.
 * <p>
 * Reject Modify Trade {tradeID} Client Extensions
 */
public class TradeClientExtensionsModifyRejectTransaction implements Transaction {

    @SerializedName("id") private TransactionID id;

    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     * @see TransactionID
     */
    public TradeClientExtensionsModifyRejectTransaction setId(String id) {
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
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     * @see DateTime
     */
    public TradeClientExtensionsModifyRejectTransaction setTime(String time) {
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
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     */
    public TradeClientExtensionsModifyRejectTransaction setUserID(int userID) {
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
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     * @see AccountID
     */
    public TradeClientExtensionsModifyRejectTransaction setAccountID(String accountID) {
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
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     * @see TransactionID
     */
    public TradeClientExtensionsModifyRejectTransaction setBatchID(String batchID) {
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
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     * @see RequestID
     */
    public TradeClientExtensionsModifyRejectTransaction setRequestID(String requestID) {
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

    @SerializedName("type") private TransactionType type = TransactionType.TRADE_CLIENT_EXTENSIONS_MODIFY_REJECT;

    /**
     * Get the Type
     * <p>
     * The Type of the Transaction. Always set to
     * "TRADE_CLIENT_EXTENSIONS_MODIFY_REJECT" for a
     * TradeClientExtensionsModifyRejectTransaction.
     * <p>
     * @return the Type
     * @see TransactionType
     */
    public TransactionType getType() {
        return this.type;
    }

    @SerializedName("tradeID") private TradeID tradeID;

    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade who's client extensions are to be modified.
     * <p>
     * @param tradeID the Trade ID
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     * @see TradeID
     */
    public TradeClientExtensionsModifyRejectTransaction setTradeID(String tradeID) {
        this.tradeID = new TradeID(tradeID);
        return this;
    }

    /**
     * Get the Trade ID
     * <p>
     * The ID of the Trade who's client extensions are to be modified.
     * <p>
     * @return the Trade ID
     * @see TradeID
     */
    public String getTradeID() {
        return this.tradeID.getTradeID();
    }

    @SerializedName("clientTradeID") private ClientID clientTradeID;

    /**
     * Set the Client Trade ID
     * <p>
     * The original Client ID of the Trade who's client extensions are to be
     * modified.
     * <p>
     * @param clientTradeID the Client Trade ID
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     * @see ClientID
     */
    public TradeClientExtensionsModifyRejectTransaction setClientTradeID(String clientTradeID) {
        this.clientTradeID = new ClientID(clientTradeID);
        return this;
    }

    /**
     * Get the Client Trade ID
     * <p>
     * The original Client ID of the Trade who's client extensions are to be
     * modified.
     * <p>
     * @return the Client Trade ID
     * @see ClientID
     */
    public String getClientTradeID() {
        return this.clientTradeID.getClientID();
    }

    @SerializedName("tradeClientExtensionsModify") private ClientExtensions tradeClientExtensionsModify;

    /**
     * Set the Extensions
     * <p>
     * The new Client Extensions for the Trade.
     * <p>
     * @param tradeClientExtensionsModify the Extensions
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     * @see ClientExtensions
     */
    public TradeClientExtensionsModifyRejectTransaction setTradeClientExtensionsModify(ClientExtensions tradeClientExtensionsModify) {
        this.tradeClientExtensionsModify = tradeClientExtensionsModify;
        return this;
    }

    /**
     * Get the Extensions
     * <p>
     * The new Client Extensions for the Trade.
     * <p>
     * @return the Extensions
     * @see ClientExtensions
     */
    public ClientExtensions getTradeClientExtensionsModify() {
        return this.tradeClientExtensionsModify;
    }

    @SerializedName("rejectReason") private TransactionRejectReason rejectReason;

    /**
     * Set the Reject Reason
     * <p>
     * The reason that the Reject Transaction was created
     * <p>
     * @param rejectReason the Reject Reason
     * @return {@link TradeClientExtensionsModifyRejectTransaction
     * TradeClientExtensionsModifyRejectTransaction}
     * @see TransactionRejectReason
     */
    public TradeClientExtensionsModifyRejectTransaction setRejectReason(TransactionRejectReason rejectReason) {
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
