package com.oanda.v20.account;

import java.util.ArrayList;
import java.util.Collection;

import com.oanda.v20.Request;
import com.oanda.v20.primitives.InstrumentName;

/**
 * AccountInstrumentsRequest
 */
public class AccountInstrumentsRequest extends Request {

    /**
     * AccountInstrumentsRequest Constructor
     * <p>
     * Construct a new AccountInstrumentsRequest
     * <p>
     * @param accountID Account Identifier
     */
    public AccountInstrumentsRequest(AccountID accountID) {
        this.setPathParam("accountID", accountID);

    }

    /**
     * Set the instruments
     * <p>
     * List of instruments to query specifically.
     * <p>
     * @param instruments the instruments
     * @return {@link AccountInstrumentsRequest AccountInstrumentsRequest}
     * @see InstrumentName
     */
    public AccountInstrumentsRequest setInstruments(Collection<?> instruments) {
        ArrayList<InstrumentName> newInstruments = new ArrayList<InstrumentName>(instruments.size());
        instruments.forEach((item) -> {
            if (item instanceof InstrumentName)
            {
                newInstruments.add((InstrumentName) item);
            }
            else if (item instanceof String)
            {
                newInstruments.add(new InstrumentName((String) item));
            }
            else
            {
                throw new IllegalArgumentException(
                    item.getClass().getName() + " cannot be converted to an InstrumentName"
                );
            }
        });
        this.queryParams.put("instruments", newInstruments);
        return this;
    }
}
