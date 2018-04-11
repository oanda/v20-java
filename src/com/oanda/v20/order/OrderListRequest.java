package com.oanda.v20.order;

import java.util.ArrayList;
import java.util.Collection;

import com.oanda.v20.Request;
import com.oanda.v20.account.AccountID;
import com.oanda.v20.primitives.InstrumentName;

/**
 * OrderListRequest
 */
public class OrderListRequest extends Request {

    /**
     * OrderListRequest Constructor
     * <p>
     * Construct a new OrderListRequest
     * <p>
     * @param accountID Account Identifier
     */
    public OrderListRequest(AccountID accountID) {
        this.setPathParam("accountID", accountID);

    }

    /**
     * Set the ids
     * <p>
     * List of Order IDs to retrieve
     * <p>
     * @param ids the ids
     * @return {@link OrderListRequest OrderListRequest}
     * @see OrderID
     */
    public OrderListRequest setIds(Collection<?> ids) {
        ArrayList<OrderID> newIds = new ArrayList<OrderID>(ids.size());
        ids.forEach((item) -> {
            if (item instanceof OrderID)
            {
                newIds.add((OrderID) item);
            }
            else if (item instanceof String)
            {
                newIds.add(new OrderID((String) item));
            }
            else
            {
                throw new IllegalArgumentException(
                    item.getClass().getName() + " cannot be converted to an OrderID"
                );
            }
        });
        this.queryParams.put("ids", newIds);
        return this;
    }

    /**
     * Set the state
     * <p>
     * The state to filter the requested Orders by
     * <p>
     * @param state the state as an OrderStateFilter
     * @return {@link OrderListRequest OrderListRequest}
     * @see OrderStateFilter
     */
    public OrderListRequest setState(OrderStateFilter state)
    {
        this.queryParams.put("state", state);
        return this;
    }

    /**
     * Set the instrument
     * <p>
     * The instrument to filter the requested orders by
     * <p>
     * @param instrument the instrument as an InstrumentName
     * @return {@link OrderListRequest OrderListRequest}
     * @see InstrumentName
     */
    public OrderListRequest setInstrument(InstrumentName instrument)
    {
        this.queryParams.put("instrument", instrument);
        return this;
    }

    /**
     * Set the instrument
     * <p>
     * The instrument to filter the requested orders by
     * <p>
     * @param instrument the instrument as a String
     * @return {@link OrderListRequest OrderListRequest}
     * @see InstrumentName
     */
    public OrderListRequest setInstrument(String instrument)
    {
        this.queryParams.put("instrument", new InstrumentName(instrument));
        return this;
    }

    /**
     * Set the count
     * <p>
     * The maximum number of Orders to return
     * <p>
     * @param count the count as a Long
     * @return {@link OrderListRequest OrderListRequest}
     */
    public OrderListRequest setCount(Long count)
    {
        this.queryParams.put("count", count);
        return this;
    }

    /**
     * Set the beforeID
     * <p>
     * The maximum Order ID to return. If not provided the most recent Orders
     * in the Account are returned
     * <p>
     * @param beforeID the beforeID as an OrderID
     * @return {@link OrderListRequest OrderListRequest}
     * @see OrderID
     */
    public OrderListRequest setBeforeID(OrderID beforeID)
    {
        this.queryParams.put("beforeID", beforeID);
        return this;
    }

    /**
     * Set the beforeID
     * <p>
     * The maximum Order ID to return. If not provided the most recent Orders
     * in the Account are returned
     * <p>
     * @param beforeID the beforeID as a String
     * @return {@link OrderListRequest OrderListRequest}
     * @see OrderID
     */
    public OrderListRequest setBeforeID(String beforeID)
    {
        this.queryParams.put("beforeID", new OrderID(beforeID));
        return this;
    }
}
