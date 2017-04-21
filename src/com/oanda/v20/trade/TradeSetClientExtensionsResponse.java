package com.oanda.v20.trade;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.transaction.TradeClientExtensionsModifyTransaction;
import com.oanda.v20.transaction.TransactionID;

/**
 * TradeSetClientExtensionsResponse
 */
public class TradeSetClientExtensionsResponse {

    /**
     * TradeSetClientExtensionsResponse Constructor
     * <p>
     * Construct a new TradeSetClientExtensionsResponse
     */
    private TradeSetClientExtensionsResponse() {
    }

    @SerializedName("tradeClientExtensionsModifyTransaction") private TradeClientExtensionsModifyTransaction tradeClientExtensionsModifyTransaction;

    /**
     * Get the tradeClientExtensionsModifyTransaction
     * <p>
     * The Transaction that updates the Trade's Client Extensions.
     * <p>
     * @return the tradeClientExtensionsModifyTransaction
     * @see TradeClientExtensionsModifyTransaction
     */
    public TradeClientExtensionsModifyTransaction getTradeClientExtensionsModifyTransaction() {
        return this.tradeClientExtensionsModifyTransaction;
    }

    @SerializedName("relatedTransactionIDs") private ArrayList<TransactionID> relatedTransactionIDs;

    /**
     * Get the relatedTransactionIDs
     * <p>
     * The IDs of all Transactions that were created while satisfying the
     * request.
     * <p>
     * @return the relatedTransactionIDs
     * @see TransactionID
     */
    public List<TransactionID> getRelatedTransactionIDs() {
        return this.relatedTransactionIDs;
    }

    @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

    /**
     * Get the lastTransactionID
     * <p>
     * The ID of the most recent Transaction created for the Account
     * <p>
     * @return the lastTransactionID
     * @see TransactionID
     */
    public TransactionID getLastTransactionID() {
        return this.lastTransactionID;
    }
}
