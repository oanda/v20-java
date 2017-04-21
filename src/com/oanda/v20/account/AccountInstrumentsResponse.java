package com.oanda.v20.account;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.primitives.Instrument;
import com.oanda.v20.transaction.TransactionID;

/**
 * AccountInstrumentsResponse
 */
public class AccountInstrumentsResponse {

    /**
     * AccountInstrumentsResponse Constructor
     * <p>
     * Construct a new AccountInstrumentsResponse
     */
    private AccountInstrumentsResponse() {
    }

    @SerializedName("instruments") private ArrayList<Instrument> instruments;

    /**
     * Get the instruments
     * <p>
     * The requested list of instruments.
     * <p>
     * @return the instruments
     * @see Instrument
     */
    public List<Instrument> getInstruments() {
        return this.instruments;
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
