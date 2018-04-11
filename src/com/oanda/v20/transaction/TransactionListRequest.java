package com.oanda.v20.transaction;

import java.util.ArrayList;
import java.util.Collection;

import com.oanda.v20.Request;
import com.oanda.v20.account.AccountID;
import com.oanda.v20.primitives.DateTime;

/**
 * TransactionListRequest
 */
public class TransactionListRequest extends Request {

    /**
     * TransactionListRequest Constructor
     * <p>
     * Construct a new TransactionListRequest
     * <p>
     * @param accountID Account Identifier
     */
    public TransactionListRequest(AccountID accountID) {
        this.setPathParam("accountID", accountID);

    }

    /**
     * Set the from
     * <p>
     * The starting time (inclusive) of the time range for the Transactions
     * being queried.
     * <p>
     * @param from the from as a DateTime
     * @return {@link TransactionListRequest TransactionListRequest}
     * @see DateTime
     */
    public TransactionListRequest setFrom(DateTime from)
    {
        this.queryParams.put("from", from);
        return this;
    }

    /**
     * Set the from
     * <p>
     * The starting time (inclusive) of the time range for the Transactions
     * being queried.
     * <p>
     * @param from the from as a String
     * @return {@link TransactionListRequest TransactionListRequest}
     * @see DateTime
     */
    public TransactionListRequest setFrom(String from)
    {
        this.queryParams.put("from", new DateTime(from));
        return this;
    }

    /**
     * Set the to
     * <p>
     * The ending time (inclusive) of the time range for the Transactions being
     * queried.
     * <p>
     * @param to the to as a DateTime
     * @return {@link TransactionListRequest TransactionListRequest}
     * @see DateTime
     */
    public TransactionListRequest setTo(DateTime to)
    {
        this.queryParams.put("to", to);
        return this;
    }

    /**
     * Set the to
     * <p>
     * The ending time (inclusive) of the time range for the Transactions being
     * queried.
     * <p>
     * @param to the to as a String
     * @return {@link TransactionListRequest TransactionListRequest}
     * @see DateTime
     */
    public TransactionListRequest setTo(String to)
    {
        this.queryParams.put("to", new DateTime(to));
        return this;
    }

    /**
     * Set the pageSize
     * <p>
     * The number of Transactions to include in each page of the results.
     * <p>
     * @param pageSize the pageSize as a Long
     * @return {@link TransactionListRequest TransactionListRequest}
     */
    public TransactionListRequest setPageSize(Long pageSize)
    {
        this.queryParams.put("pageSize", pageSize);
        return this;
    }

    /**
     * Set the type
     * <p>
     * A filter for restricting the types of Transactions to retreive.
     * <p>
     * @param type the type
     * @return {@link TransactionListRequest TransactionListRequest}
     * @see TransactionFilter
     */
    public TransactionListRequest setType(Collection<?> type) {
        ArrayList<TransactionFilter> newType = new ArrayList<TransactionFilter>(type.size());
        type.forEach((item) -> {
            if (item instanceof TransactionFilter)
            {
                newType.add((TransactionFilter) item);
            }
            else
            {
                throw new IllegalArgumentException(
                    item.getClass().getName() + " cannot be converted to a TransactionFilter"
                );
            }
        });
        this.queryParams.put("type", newType);
        return this;
    }
}
