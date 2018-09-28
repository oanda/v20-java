package com.oanda.v20.transaction;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.primitives.DateTime;

/**
 * TransactionListResponse
 */
public class TransactionListResponse {

    /**
     * TransactionListResponse Constructor
     * <p>
     * Construct a new TransactionListResponse
     */
    private TransactionListResponse() {
    }

    @SerializedName("from") private DateTime from;

    /**
     * Get the from
     * <p>
     * The starting time provided in the request.
     * <p>
     * @return the from
     * @see DateTime
     */
    public DateTime getFrom() {
        return this.from;
    }

    @SerializedName("to") private DateTime to;

    /**
     * Get the to
     * <p>
     * The ending time provided in the request.
     * <p>
     * @return the to
     * @see DateTime
     */
    public DateTime getTo() {
        return this.to;
    }

    @SerializedName("pageSize") private Long pageSize;

    /**
     * Get the pageSize
     * <p>
     * The pageSize provided in the request
     * <p>
     * @return the pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    @SerializedName("type") private ArrayList<TransactionFilter> type;

    /**
     * Get the type
     * <p>
     * The Transaction-type filter provided in the request
     * <p>
     * @return the type
     * @see TransactionFilter
     */
    public List<TransactionFilter> getType() {
        return this.type;
    }

    @SerializedName("count") private Long count;

    /**
     * Get the count
     * <p>
     * The number of Transactions that are contained in the pages returned
     * <p>
     * @return the count
     */
    public Long getCount() {
        return this.count;
    }

    @SerializedName("pages") private ArrayList<String> pages;

    /**
     * Get the pages
     * <p>
     * The list of URLs that represent idrange queries providing the data for
     * each page in the query results
     * <p>
     * @return the pages
     */
    public List<String> getPages() {
        return this.pages;
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
