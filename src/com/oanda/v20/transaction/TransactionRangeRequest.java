package com.oanda.v20.transaction;

import java.util.ArrayList;
import java.util.Collection;

import com.oanda.v20.Request;
import com.oanda.v20.account.AccountID;

/**
 * TransactionRangeRequest
 */
public class TransactionRangeRequest extends Request {

    /**
     * TransactionRangeRequest Constructor
     * <p>
     * Construct a new TransactionRangeRequest
     * <p>
     * @param accountID Account Identifier
     * @param fromID The starting Transacion ID (inclusive) to fetch.
     * @param toID The ending Transaction ID (inclusive) to fetch.
     */
    public TransactionRangeRequest(AccountID accountID, TransactionID fromID, TransactionID toID) {
        this.setPathParam("accountID", accountID);
        this.setQueryParam("from", fromID);
        this.setQueryParam("to", toID);

    }

    /**
     * Set the from
     * <p>
     * The starting Transacion ID (inclusive) to fetch.
     * <p>
     * @param from the from as a TransactionID
     * @return {@link TransactionRangeRequest TransactionRangeRequest}
     * @see TransactionID
     */
    public TransactionRangeRequest setFrom(TransactionID from)
    {
        this.queryParams.put("from", from);
        return this;
    }

    /**
     * Set the from
     * <p>
     * The starting Transacion ID (inclusive) to fetch.
     * <p>
     * @param from the from as a String
     * @return {@link TransactionRangeRequest TransactionRangeRequest}
     * @see TransactionID
     */
    public TransactionRangeRequest setFrom(String from)
    {
        this.queryParams.put("from", new TransactionID(from));
        return this;
    }

    /**
     * Set the to
     * <p>
     * The ending Transaction ID (inclusive) to fetch.
     * <p>
     * @param to the to as a TransactionID
     * @return {@link TransactionRangeRequest TransactionRangeRequest}
     * @see TransactionID
     */
    public TransactionRangeRequest setTo(TransactionID to)
    {
        this.queryParams.put("to", to);
        return this;
    }

    /**
     * Set the to
     * <p>
     * The ending Transaction ID (inclusive) to fetch.
     * <p>
     * @param to the to as a String
     * @return {@link TransactionRangeRequest TransactionRangeRequest}
     * @see TransactionID
     */
    public TransactionRangeRequest setTo(String to)
    {
        this.queryParams.put("to", new TransactionID(to));
        return this;
    }

    /**
     * Set the type
     * <p>
     * The filter that restricts the types of Transactions to retreive.
     * <p>
     * @param type the type
     * @return {@link TransactionRangeRequest TransactionRangeRequest}
     * @see TransactionFilter
     */
    public TransactionRangeRequest setType(Collection<?> type) {
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
