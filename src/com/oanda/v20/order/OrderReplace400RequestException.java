package com.oanda.v20.order;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.RequestException;
import com.oanda.v20.transaction.Transaction;
import com.oanda.v20.transaction.TransactionID;

/**
 * OrderReplace400RequestException
 */
public class OrderReplace400RequestException extends RequestException {

    private static final long serialVersionUID = -8253487533676542598L;

    /**
     * OrderReplace400RequestException Constructor
     * <p>
     * Construct a new OrderReplace400RequestException
     */
    private OrderReplace400RequestException() {
    }

    @SerializedName("orderRejectTransaction") private Transaction orderRejectTransaction;

    /**
     * Get the orderRejectTransaction
     * <p>
     * The Transaction that rejected the creation of the replacing Order
     * <p>
     * @return the orderRejectTransaction
     * @see Transaction
     */
    public Transaction getOrderRejectTransaction() {
        return this.orderRejectTransaction;
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
     * The ID of the most recent Transaction created for the Account.
     * <p>
     * @return the lastTransactionID
     * @see TransactionID
     */
    public TransactionID getLastTransactionID() {
        return this.lastTransactionID;
    }
}
