package com.oanda.v20.position;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.RequestException;
import com.oanda.v20.transaction.MarketOrderRejectTransaction;
import com.oanda.v20.transaction.TransactionID;

/**
 * PositionClose404RequestException
 */
public class PositionClose404RequestException extends RequestException {

    private static final long serialVersionUID = 5116404852882287063L;

    /**
     * PositionClose404RequestException Constructor
     * <p>
     * Construct a new PositionClose404RequestException
     */
    private PositionClose404RequestException() {
    }

    @SerializedName("longOrderRejectTransaction") private MarketOrderRejectTransaction longOrderRejectTransaction;

    /**
     * Get the longOrderRejectTransaction
     * <p>
     * The Transaction created that rejects the creation of a MarketOrder to
     * close the long Position. Only present if the Account exists and a long
     * Position was specified.
     * <p>
     * @return the longOrderRejectTransaction
     * @see MarketOrderRejectTransaction
     */
    public MarketOrderRejectTransaction getLongOrderRejectTransaction() {
        return this.longOrderRejectTransaction;
    }

    @SerializedName("shortOrderRejectTransaction") private MarketOrderRejectTransaction shortOrderRejectTransaction;

    /**
     * Get the shortOrderRejectTransaction
     * <p>
     * The Transaction created that rejects the creation of a MarketOrder to
     * close the short Position. Only present if the Account exists and a short
     * Position was specified.
     * <p>
     * @return the shortOrderRejectTransaction
     * @see MarketOrderRejectTransaction
     */
    public MarketOrderRejectTransaction getShortOrderRejectTransaction() {
        return this.shortOrderRejectTransaction;
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
}
