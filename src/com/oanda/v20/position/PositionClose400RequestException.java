package com.oanda.v20.position;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.RequestException;
import com.oanda.v20.transaction.MarketOrderRejectTransaction;
import com.oanda.v20.transaction.TransactionID;

/**
 * PositionClose400RequestException
 */
public class PositionClose400RequestException extends RequestException {

    private static final long serialVersionUID = -2529294526320561710L;

    /**
     * PositionClose400RequestException Constructor
     * <p>
     * Construct a new PositionClose400RequestException
     */
    private PositionClose400RequestException() {
    }

    @SerializedName("longOrderRejectTransaction") private MarketOrderRejectTransaction longOrderRejectTransaction;

    /**
     * Get the longOrderRejectTransaction
     * <p>
     * The Transaction created that rejects the creation of a MarketOrder to
     * close the long Position.
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
     * close the short Position.
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
