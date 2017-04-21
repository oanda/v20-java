package com.oanda.v20.pricing;

import java.util.ArrayList;
import java.util.Collection;

import com.oanda.v20.Request;
import com.oanda.v20.account.AccountID;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.primitives.InstrumentName;

/**
 * PricingGetRequest
 */
public class PricingGetRequest extends Request {

    /**
     * PricingGetRequest Constructor
     * <p>
     * Construct a new PricingGetRequest
     * <p>
     * @param accountID Account Identifier
     * @param instruments List of Instruments to get pricing for.
     */
    public PricingGetRequest(AccountID accountID, Collection<?> instruments) {
        this.setPathParam("accountID", accountID);
        ArrayList<InstrumentName> newInstruments = new ArrayList<InstrumentName>(instruments.size());
        instruments.forEach((item) -> {
            if (InstrumentName.class == item.getClass())
            {
                newInstruments.add((InstrumentName) item);
            }
            else if (String.class == item.getClass())
            {
                newInstruments.add(new InstrumentName((String) item));
            }
        });
        this.setQueryParam("instruments", newInstruments);

    }

    /**
     * Set the instruments
     * <p>
     * List of Instruments to get pricing for.
     * <p>
     * @param instruments the instruments
     * @return {@link PricingGetRequest PricingGetRequest}
     * @see InstrumentName
     */
    public PricingGetRequest setInstruments(Collection<?> instruments) {
        ArrayList<InstrumentName> newInstruments = new ArrayList<InstrumentName>(instruments.size());
        instruments.forEach((item) -> {
            if (InstrumentName.class == item.getClass())
            {
                newInstruments.add((InstrumentName) item);
            }
            else if (String.class == item.getClass())
            {
                newInstruments.add(new InstrumentName((String) item));
            }
        });
        this.queryParams.put("instruments", newInstruments);
        return this;
    }

    /**
     * Set the since
     * <p>
     * Date/Time filter to apply to the returned prices. Only prices with a
     * time later than this filter will be provided.
     * <p>
     * @param since the since as a DateTime
     * @return {@link PricingGetRequest PricingGetRequest}
     * @see DateTime
     */
    public PricingGetRequest setSince(DateTime since)
    {
        this.queryParams.put("since", since);
        return this;
    }

    /**
     * Set the since
     * <p>
     * Date/Time filter to apply to the returned prices. Only prices with a
     * time later than this filter will be provided.
     * <p>
     * @param since the since as a String
     * @return {@link PricingGetRequest PricingGetRequest}
     * @see DateTime
     */
    public PricingGetRequest setSince(String since)
    {
        this.queryParams.put("since", new DateTime(since));
        return this;
    }

    /**
     * Set the includeUnitsAvailable
     * <p>
     * Flag that enables the inclusion of the unitsAvailable field in the
     * returned Price objects.
     * <p>
     * @param includeUnitsAvailable the includeUnitsAvailable as a Boolean
     * @return {@link PricingGetRequest PricingGetRequest}
     */
    public PricingGetRequest setIncludeUnitsAvailable(Boolean includeUnitsAvailable)
    {
        this.queryParams.put("includeUnitsAvailable", includeUnitsAvailable);
        return this;
    }
}
