package com.oanda.v20.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.primitives.AccountUnits;
import com.oanda.v20.primitives.InstrumentName;

/**
 * OpenTradeFinancing is used to pay/collect daily financing charge for a
 * Position within an Account
 */
public class PositionFinancing {

    /**
     * Default constructor.
     */
    public PositionFinancing() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the PositionFinancing to copy
     */
    public PositionFinancing(PositionFinancing other) {
        this.instrument = other.instrument;
        this.financing = other.financing;
        if (other.openTradeFinancings != null)
        {
            this.openTradeFinancings = new ArrayList<OpenTradeFinancing>(other.openTradeFinancings);
        }
    }

    @SerializedName("instrument") private InstrumentName instrument;

    /**
     * Get the Instrument
     * <p>
     * The instrument of the Position that financing is being paid/collected
     * for.
     * <p>
     * @return the Instrument
     * @see InstrumentName
     */
    public InstrumentName getInstrument() {
        return this.instrument;
    }

    /**
     * Set the Instrument
     * <p>
     * The instrument of the Position that financing is being paid/collected
     * for.
     * <p>
     * @param instrument the Instrument as an InstrumentName
     * @return {@link PositionFinancing PositionFinancing}
     * @see InstrumentName
     */
    public PositionFinancing setInstrument(InstrumentName instrument) {
        this.instrument = instrument;
        return this;
    }
    /**
     * Set the Instrument
     * <p>
     * The instrument of the Position that financing is being paid/collected
     * for.
     * <p>
     * @param instrument the Instrument as a String
     * @return {@link PositionFinancing PositionFinancing}
     * @see InstrumentName
     */
    public PositionFinancing setInstrument(String instrument) {
        this.instrument = new InstrumentName(instrument);
        return this;
    }

    @SerializedName("financing") private AccountUnits financing;

    /**
     * Get the Financing
     * <p>
     * The amount of financing paid/collected for the Position.
     * <p>
     * @return the Financing
     * @see AccountUnits
     */
    public AccountUnits getFinancing() {
        return this.financing;
    }

    /**
     * Set the Financing
     * <p>
     * The amount of financing paid/collected for the Position.
     * <p>
     * @param financing the Financing as an AccountUnits
     * @return {@link PositionFinancing PositionFinancing}
     * @see AccountUnits
     */
    public PositionFinancing setFinancing(AccountUnits financing) {
        this.financing = financing;
        return this;
    }
    /**
     * Set the Financing
     * <p>
     * The amount of financing paid/collected for the Position.
     * <p>
     * @param financing the Financing as a String
     * @return {@link PositionFinancing PositionFinancing}
     * @see AccountUnits
     */
    public PositionFinancing setFinancing(String financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }
    /**
     * Set the Financing
     * <p>
     * The amount of financing paid/collected for the Position.
     * <p>
     * @param financing the Financing as a double
     * @return {@link PositionFinancing PositionFinancing}
     * @see AccountUnits
     */
    public PositionFinancing setFinancing(double financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }
    /**
     * Set the Financing
     * <p>
     * The amount of financing paid/collected for the Position.
     * <p>
     * @param financing the Financing as a BigDecimal
     * @return {@link PositionFinancing PositionFinancing}
     * @see AccountUnits
     */
    public PositionFinancing setFinancing(BigDecimal financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }

    @SerializedName("openTradeFinancings") private ArrayList<OpenTradeFinancing> openTradeFinancings;

    /**
     * Get the Trade Financings
     * <p>
     * The financing paid/collecte for each open Trade within the Position.
     * <p>
     * @return the Trade Financings
     * @see OpenTradeFinancing
     */
    public List<OpenTradeFinancing> getOpenTradeFinancings() {
        return this.openTradeFinancings;
    }

    /**
     * Set the Trade Financings
     * <p>
     * The financing paid/collecte for each open Trade within the Position.
     * <p>
     * @param openTradeFinancings the Trade Financings
     * @return {@link PositionFinancing PositionFinancing}
     * @see OpenTradeFinancing
     */
    public PositionFinancing setOpenTradeFinancings(Collection<?> openTradeFinancings) {
        ArrayList<OpenTradeFinancing> newOpenTradeFinancings = new ArrayList<OpenTradeFinancing>(openTradeFinancings.size());
        openTradeFinancings.forEach((item) -> {
            if (item instanceof OpenTradeFinancing)
            {
                newOpenTradeFinancings.add((OpenTradeFinancing) item);
            }
            else
            {
                throw new IllegalArgumentException(
                    item.getClass().getName() + " cannot be converted to an OpenTradeFinancing"
                );
            }
        });
        this.openTradeFinancings = newOpenTradeFinancings;
        return this;
    }

    @Override
    public String toString() {
        return "PositionFinancing(" +
            "instrument=" +
                (instrument == null ? "null" : instrument.toString()) + ", " +
            "financing=" +
                (financing == null ? "null" : financing.toString()) + ", " +
            "openTradeFinancings=" +
                (openTradeFinancings == null ? "null" : openTradeFinancings.toString()) +
            ")";
    }
}
