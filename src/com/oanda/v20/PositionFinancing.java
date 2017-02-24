package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * OpenTradeFinancing is used to pay/collect daily financing charge for a
 * Position within an Account
 */
public class PositionFinancing {

    @SerializedName("instrumentID") private InstrumentName instrumentID;

    /**
     * Set the Instrument
     * <p>
     * The instrument of the Position that financing is being paid/collected
     * for.
     * <p>
     * @param instrumentID the Instrument
     * @return {@link PositionFinancing PositionFinancing}
     * @see InstrumentName
     */
    public PositionFinancing setInstrumentID(String instrumentID) {
        this.instrumentID = new InstrumentName(instrumentID);
        return this;
    }

    /**
     * Get the Instrument
     * <p>
     * The instrument of the Position that financing is being paid/collected
     * for.
     * <p>
     * @return the Instrument
     * @see InstrumentName
     */
    public String getInstrumentID() {
        return this.instrumentID.getInstrumentName();
    }

    @SerializedName("financing") private AccountUnits financing;

    /**
     * Set the Financing
     * <p>
     * The amount of financing paid/collected for the Position.
     * <p>
     * @param financing the Financing
     * @return {@link PositionFinancing PositionFinancing}
     * @see AccountUnits
     */
    public PositionFinancing setFinancing(double financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }

    /**
     * Get the Financing
     * <p>
     * The amount of financing paid/collected for the Position.
     * <p>
     * @return the Financing
     * @see AccountUnits
     */
    public double getFinancing() {
        return this.financing.getAccountUnits();
    }

    @SerializedName("openTradeFinancings") private OpenTradeFinancing[] openTradeFinancings;

    /**
     * Set the Trade Financings
     * <p>
     * The financing paid/collecte for each open Trade within the Position.
     * <p>
     * @param openTradeFinancings the Trade Financings
     * @return {@link PositionFinancing PositionFinancing}
     * @see OpenTradeFinancing
     */
    public PositionFinancing setOpenTradeFinancings(OpenTradeFinancing[] openTradeFinancings) {
        this.openTradeFinancings = openTradeFinancings;
        return this;
    }

    /**
     * Get the Trade Financings
     * <p>
     * The financing paid/collecte for each open Trade within the Position.
     * <p>
     * @return the Trade Financings
     * @see OpenTradeFinancing
     */
    public OpenTradeFinancing[] getOpenTradeFinancings() {
        return this.openTradeFinancings;
    }
}
