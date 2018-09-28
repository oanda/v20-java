package com.oanda.v20.trade;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.RequestException;
import com.oanda.v20.transaction.TradeClientExtensionsModifyRejectTransaction;
import com.oanda.v20.transaction.TransactionID;

/**
 * TradeSetClientExtensions400RequestException
 */
public class TradeSetClientExtensions400RequestException extends RequestException {

    private static final long serialVersionUID = -5747287785024911209L;

    /**
     * TradeSetClientExtensions400RequestException Constructor
     * <p>
     * Construct a new TradeSetClientExtensions400RequestException
     */
    private TradeSetClientExtensions400RequestException() {
    }

    @SerializedName("tradeClientExtensionsModifyRejectTransaction") private TradeClientExtensionsModifyRejectTransaction tradeClientExtensionsModifyRejectTransaction;

    /**
     * Get the tradeClientExtensionsModifyRejectTransaction
     * <p>
     * The Transaction that rejects the modification of the Trade's Client
     * Extensions.
     * <p>
     * @return the tradeClientExtensionsModifyRejectTransaction
     * @see TradeClientExtensionsModifyRejectTransaction
     */
    public TradeClientExtensionsModifyRejectTransaction getTradeClientExtensionsModifyRejectTransaction() {
        return this.tradeClientExtensionsModifyRejectTransaction;
    }

    @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

    /**
     * Get the lastTransactionID
     * <p>
     * The ID of the most recent Transaction created for the Account.
     * <p>
     * @return the lastTransactionID
     * @see TransactionID
     */
    public TransactionID getLastTransactionID() {
        return this.lastTransactionID;
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
}
