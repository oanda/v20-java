package com.oanda.v20.trade;

import java.util.ArrayList;
import java.util.Collection;

import com.oanda.v20.Request;
import com.oanda.v20.account.AccountID;
import com.oanda.v20.primitives.InstrumentName;

/**
 * TradeListRequest
 */
public class TradeListRequest extends Request {

    /**
     * TradeListRequest Constructor
     * <p>
     * Construct a new TradeListRequest
     * <p>
     * @param accountID Account Identifier
     */
    public TradeListRequest(AccountID accountID) {
        this.setPathParam("accountID", accountID);

    }

    /**
     * Set the ids
     * <p>
     * List of Trade IDs to retrieve.
     * <p>
     * @param ids the ids
     * @return {@link TradeListRequest TradeListRequest}
     * @see TradeID
     */
    public TradeListRequest setIds(Collection<?> ids) {
        ArrayList<TradeID> newIds = new ArrayList<TradeID>(ids.size());
        ids.forEach((item) -> {
            if (item instanceof TradeID)
            {
                newIds.add((TradeID) item);
            }
            else if (item instanceof String)
            {
                newIds.add(new TradeID((String) item));
            }
            else
            {
                throw new IllegalArgumentException(
                    item.getClass().getName() + " cannot be converted to a TradeID"
                );
            }
        });
        this.queryParams.put("ids", newIds);
        return this;
    }

    /**
     * Set the state
     * <p>
     * The state to filter the requested Trades by.
     * <p>
     * @param state the state as a TradeStateFilter
     * @return {@link TradeListRequest TradeListRequest}
     * @see TradeStateFilter
     */
    public TradeListRequest setState(TradeStateFilter state)
    {
        this.queryParams.put("state", state);
        return this;
    }

    /**
     * Set the instrument
     * <p>
     * The instrument to filter the requested Trades by.
     * <p>
     * @param instrument the instrument as an InstrumentName
     * @return {@link TradeListRequest TradeListRequest}
     * @see InstrumentName
     */
    public TradeListRequest setInstrument(InstrumentName instrument)
    {
        this.queryParams.put("instrument", instrument);
        return this;
    }

    /**
     * Set the instrument
     * <p>
     * The instrument to filter the requested Trades by.
     * <p>
     * @param instrument the instrument as a String
     * @return {@link TradeListRequest TradeListRequest}
     * @see InstrumentName
     */
    public TradeListRequest setInstrument(String instrument)
    {
        this.queryParams.put("instrument", new InstrumentName(instrument));
        return this;
    }

    /**
     * Set the count
     * <p>
     * The maximum number of Trades to return.
     * <p>
     * @param count the count as a Long
     * @return {@link TradeListRequest TradeListRequest}
     */
    public TradeListRequest setCount(Long count)
    {
        this.queryParams.put("count", count);
        return this;
    }

    /**
     * Set the beforeID
     * <p>
     * The maximum Trade ID to return. If not provided the most recent Trades
     * in the Account are returned.
     * <p>
     * @param beforeID the beforeID as a TradeID
     * @return {@link TradeListRequest TradeListRequest}
     * @see TradeID
     */
    public TradeListRequest setBeforeID(TradeID beforeID)
    {
        this.queryParams.put("beforeID", beforeID);
        return this;
    }

    /**
     * Set the beforeID
     * <p>
     * The maximum Trade ID to return. If not provided the most recent Trades
     * in the Account are returned.
     * <p>
     * @param beforeID the beforeID as a String
     * @return {@link TradeListRequest TradeListRequest}
     * @see TradeID
     */
    public TradeListRequest setBeforeID(String beforeID)
    {
        this.queryParams.put("beforeID", new TradeID(beforeID));
        return this;
    }
}
