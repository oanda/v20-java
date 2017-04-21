package com.oanda.v20.pricing;

import java.util.Collection;
import java.util.HashMap;

import com.oanda.v20.Context;
import com.oanda.v20.ExecuteException;
import com.oanda.v20.RequestException;
import com.oanda.v20.account.AccountID;
import com.oanda.v20.primitives.InstrumentName;

public class PricingContext {

    private Context ctx;

    /**
     * Default constructor
     * <p>
     * @param ctx Context object
     * @see Context
     */
    public PricingContext(Context ctx) {
        this.ctx = ctx;
    }

    private HashMap<Integer, Class<?>> getResponseMap;

    /**
     * Current Account Prices
     * <p>
     * Get pricing information for a specified list of Instruments within an
     *     Account.
     * <p>
     * @param accountID Account Identifier
     * @param instruments List of Instruments to get pricing for.
     * @return {@link PricingGetResponse PricingGetResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see AccountID
     * @see InstrumentName
     * @see RequestException
     * @see ExecuteException
     */
    public PricingGetResponse get(AccountID accountID, Collection<?> instruments)
        throws RequestException, ExecuteException
    {
        PricingGetRequest request = new PricingGetRequest(accountID, instruments);
        return get(request);
    }

    /**
     * Current Account Prices
     * <p>
     * Get pricing information for a specified list of Instruments within an
     *     Account.
     * <p>
     * @param request the PricingGetRequest
     * @return {@link PricingGetResponse PricingGetResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see RequestException
     * @see ExecuteException
     */
    public PricingGetResponse get(PricingGetRequest request)
        throws RequestException, ExecuteException
    {
        if (getResponseMap == null) {
            getResponseMap = new HashMap<>();
            getResponseMap.put(200, PricingGetResponse.class);
        }

        return (PricingGetResponse) ctx.execute(
            "GET",
            "/v3/accounts/{accountID}/pricing",
            request,
            getResponseMap
        );
    }
}
