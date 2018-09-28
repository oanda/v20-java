package com.oanda.v20.trade;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.RequestException;
import com.oanda.v20.transaction.MarketOrderRejectTransaction;
import com.oanda.v20.transaction.TransactionID;

/**
 * TradeClose404RequestException
 */
public class TradeClose404RequestException extends RequestException {

    private static final long serialVersionUID = 8548555341551155126L;

    /**
     * TradeClose404RequestException Constructor
     * <p>
     * Construct a new TradeClose404RequestException
     */
    private TradeClose404RequestException() {
    }

    @SerializedName("orderRejectTransaction") private MarketOrderRejectTransaction orderRejectTransaction;

    /**
     * Get the orderRejectTransaction
     * <p>
     * The MarketOrderReject Transaction that rejects the creation of the
     * Trade-closing MarketOrder. Only present if the Account exists.
     * <p>
     * @return the orderRejectTransaction
     * @see MarketOrderRejectTransaction
     */
    public MarketOrderRejectTransaction getOrderRejectTransaction() {
        return this.orderRejectTransaction;
    }

    @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

    /**
     * Get the lastTransactionID
     * <p>
     * The ID of the most recent Transaction created for the Account. Only
     * present if the Account exists.
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
     * request. Only present if the Account exists.
     * <p>
     * @return the relatedTransactionIDs
     * @see TransactionID
     */
    public List<TransactionID> getRelatedTransactionIDs() {
        return this.relatedTransactionIDs;
    }
}
