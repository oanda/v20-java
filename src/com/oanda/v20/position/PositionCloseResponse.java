package com.oanda.v20.position;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.transaction.MarketOrderTransaction;
import com.oanda.v20.transaction.OrderCancelTransaction;
import com.oanda.v20.transaction.OrderFillTransaction;
import com.oanda.v20.transaction.TransactionID;

/**
 * PositionCloseResponse
 */
public class PositionCloseResponse {

    /**
     * PositionCloseResponse Constructor
     * <p>
     * Construct a new PositionCloseResponse
     */
    private PositionCloseResponse() {
    }

    @SerializedName("longOrderCreateTransaction") private MarketOrderTransaction longOrderCreateTransaction;

    /**
     * Get the longOrderCreateTransaction
     * <p>
     * The MarketOrderTransaction created to close the long Position.
     * <p>
     * @return the longOrderCreateTransaction
     * @see MarketOrderTransaction
     */
    public MarketOrderTransaction getLongOrderCreateTransaction() {
        return this.longOrderCreateTransaction;
    }

    @SerializedName("longOrderFillTransaction") private OrderFillTransaction longOrderFillTransaction;

    /**
     * Get the longOrderFillTransaction
     * <p>
     * OrderFill Transaction that closes the long Position
     * <p>
     * @return the longOrderFillTransaction
     * @see OrderFillTransaction
     */
    public OrderFillTransaction getLongOrderFillTransaction() {
        return this.longOrderFillTransaction;
    }

    @SerializedName("longOrderCancelTransaction") private OrderCancelTransaction longOrderCancelTransaction;

    /**
     * Get the longOrderCancelTransaction
     * <p>
     * OrderCancel Transaction that cancels the MarketOrder created to close
     * the long Position
     * <p>
     * @return the longOrderCancelTransaction
     * @see OrderCancelTransaction
     */
    public OrderCancelTransaction getLongOrderCancelTransaction() {
        return this.longOrderCancelTransaction;
    }

    @SerializedName("shortOrderCreateTransaction") private MarketOrderTransaction shortOrderCreateTransaction;

    /**
     * Get the shortOrderCreateTransaction
     * <p>
     * The MarketOrderTransaction created to close the short Position.
     * <p>
     * @return the shortOrderCreateTransaction
     * @see MarketOrderTransaction
     */
    public MarketOrderTransaction getShortOrderCreateTransaction() {
        return this.shortOrderCreateTransaction;
    }

    @SerializedName("shortOrderFillTransaction") private OrderFillTransaction shortOrderFillTransaction;

    /**
     * Get the shortOrderFillTransaction
     * <p>
     * OrderFill Transaction that closes the short Position
     * <p>
     * @return the shortOrderFillTransaction
     * @see OrderFillTransaction
     */
    public OrderFillTransaction getShortOrderFillTransaction() {
        return this.shortOrderFillTransaction;
    }

    @SerializedName("shortOrderCancelTransaction") private OrderCancelTransaction shortOrderCancelTransaction;

    /**
     * Get the shortOrderCancelTransaction
     * <p>
     * OrderCancel Transaction that cancels the MarketOrder created to close
     * the short Position
     * <p>
     * @return the shortOrderCancelTransaction
     * @see OrderCancelTransaction
     */
    public OrderCancelTransaction getShortOrderCancelTransaction() {
        return this.shortOrderCancelTransaction;
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
