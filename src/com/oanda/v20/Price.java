package com.oanda.v20;

import com.oanda.v20.PriceStatus;
import com.google.gson.annotations.SerializedName;

/**
 * The specification of an Account-specific Price.
 */
public class Price {

    @SerializedName("type") private String type;

    /**
     * Set the Type
     * <p>
     * The string "PRICE". Used to identify the a Price object when found in a
     * stream.
     * <p>
     * @param type the Type
     * @return {@link Price Price}
     */
    public Price setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the Type
     * <p>
     * The string "PRICE". Used to identify the a Price object when found in a
     * stream.
     * <p>
     * @return the Type
     */
    public String getType() {
        return this.type;
    }

    @SerializedName("instrument") private InstrumentName instrument;

    /**
     * Set the Instrument
     * <p>
     * The Price's Instrument.
     * <p>
     * @param instrument the Instrument
     * @return {@link Price Price}
     * @see InstrumentName
     */
    public Price setInstrument(String instrument) {
        this.instrument = new InstrumentName(instrument);
        return this;
    }

    /**
     * Get the Instrument
     * <p>
     * The Price's Instrument.
     * <p>
     * @return the Instrument
     * @see InstrumentName
     */
    public String getInstrument() {
        return this.instrument.getInstrumentName();
    }

    @SerializedName("time") private DateTime time;

    /**
     * Set the Time
     * <p>
     * The date/time when the Price was created
     * <p>
     * @param time the Time
     * @return {@link Price Price}
     * @see DateTime
     */
    public Price setTime(String time) {
        this.time = new DateTime(time);
        return this;
    }

    /**
     * Get the Time
     * <p>
     * The date/time when the Price was created
     * <p>
     * @return the Time
     * @see DateTime
     */
    public String getTime() {
        return this.time.getDateTime();
    }

    @SerializedName("status") private PriceStatus status;

    /**
     * Set the Status
     * <p>
     * The status of the Price.
     * <p>
     * @param status the Status
     * @return {@link Price Price}
     * @see PriceStatus
     */
    public Price setStatus(PriceStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the Status
     * <p>
     * The status of the Price.
     * <p>
     * @return the Status
     * @see PriceStatus
     */
    public PriceStatus getStatus() {
        return this.status;
    }

    @SerializedName("tradeable") private Boolean tradeable;

    /**
     * Set the Is Tradeable
     * <p>
     * Flag indicating if the Price is tradeable or not
     * <p>
     * @param tradeable the Is Tradeable
     * @return {@link Price Price}
     */
    public Price setTradeable(boolean tradeable) {
        this.tradeable = tradeable;
        return this;
    }

    /**
     * Get the Is Tradeable
     * <p>
     * Flag indicating if the Price is tradeable or not
     * <p>
     * @return the Is Tradeable
     */
    public boolean getTradeable() {
        return this.tradeable;
    }

    @SerializedName("bids") private PriceBucket[] bids;

    /**
     * Set the Bids
     * <p>
     * The list of prices and liquidity available on the Instrument's bid side.
     * It is possible for this list to be empty if there is no bid liquidity
     * currently available for the Instrument in the Account.
     * <p>
     * @param bids the Bids
     * @return {@link Price Price}
     * @see PriceBucket
     */
    public Price setBids(PriceBucket[] bids) {
        this.bids = bids;
        return this;
    }

    /**
     * Get the Bids
     * <p>
     * The list of prices and liquidity available on the Instrument's bid side.
     * It is possible for this list to be empty if there is no bid liquidity
     * currently available for the Instrument in the Account.
     * <p>
     * @return the Bids
     * @see PriceBucket
     */
    public PriceBucket[] getBids() {
        return this.bids;
    }

    @SerializedName("asks") private PriceBucket[] asks;

    /**
     * Set the Asks
     * <p>
     * The list of prices and liquidity available on the Instrument's ask side.
     * It is possible for this list to be empty if there is no ask liquidity
     * currently available for the Instrument in the Account.
     * <p>
     * @param asks the Asks
     * @return {@link Price Price}
     * @see PriceBucket
     */
    public Price setAsks(PriceBucket[] asks) {
        this.asks = asks;
        return this;
    }

    /**
     * Get the Asks
     * <p>
     * The list of prices and liquidity available on the Instrument's ask side.
     * It is possible for this list to be empty if there is no ask liquidity
     * currently available for the Instrument in the Account.
     * <p>
     * @return the Asks
     * @see PriceBucket
     */
    public PriceBucket[] getAsks() {
        return this.asks;
    }

    @SerializedName("closeoutBid") private PriceValue closeoutBid;

    /**
     * Set the Closeout Bid
     * <p>
     * The closeout bid Price. This Price is used when a bid is required to
     * closeout a Position (margin closeout or manual) yet there is no bid
     * liquidity. The closeout bid is never used to open a new position.
     * <p>
     * @param closeoutBid the Closeout Bid
     * @return {@link Price Price}
     * @see PriceValue
     */
    public Price setCloseoutBid(double closeoutBid) {
        this.closeoutBid = new PriceValue(closeoutBid);
        return this;
    }

    /**
     * Get the Closeout Bid
     * <p>
     * The closeout bid Price. This Price is used when a bid is required to
     * closeout a Position (margin closeout or manual) yet there is no bid
     * liquidity. The closeout bid is never used to open a new position.
     * <p>
     * @return the Closeout Bid
     * @see PriceValue
     */
    public double getCloseoutBid() {
        return this.closeoutBid.getPriceValue();
    }

    @SerializedName("closeoutAsk") private PriceValue closeoutAsk;

    /**
     * Set the Closeout Ask
     * <p>
     * The closeout ask Price. This Price is used when a ask is required to
     * closeout a Position (margin closeout or manual) yet there is no ask
     * liquidity. The closeout ask is never used to open a new position.
     * <p>
     * @param closeoutAsk the Closeout Ask
     * @return {@link Price Price}
     * @see PriceValue
     */
    public Price setCloseoutAsk(double closeoutAsk) {
        this.closeoutAsk = new PriceValue(closeoutAsk);
        return this;
    }

    /**
     * Get the Closeout Ask
     * <p>
     * The closeout ask Price. This Price is used when a ask is required to
     * closeout a Position (margin closeout or manual) yet there is no ask
     * liquidity. The closeout ask is never used to open a new position.
     * <p>
     * @return the Closeout Ask
     * @see PriceValue
     */
    public double getCloseoutAsk() {
        return this.closeoutAsk.getPriceValue();
    }

    @SerializedName("quoteHomeConversionFactors") private QuoteHomeConversionFactors quoteHomeConversionFactors;

    /**
     * Set the Quote Home Conversions
     * <p>
     * The factors used to convert quantities of this price's Instrument's
     * quote currency into a quantity of the Account's home currency.
     * <p>
     * @param quoteHomeConversionFactors the Quote Home Conversions
     * @return {@link Price Price}
     * @see QuoteHomeConversionFactors
     */
    public Price setQuoteHomeConversionFactors(QuoteHomeConversionFactors quoteHomeConversionFactors) {
        this.quoteHomeConversionFactors = quoteHomeConversionFactors;
        return this;
    }

    /**
     * Get the Quote Home Conversions
     * <p>
     * The factors used to convert quantities of this price's Instrument's
     * quote currency into a quantity of the Account's home currency.
     * <p>
     * @return the Quote Home Conversions
     * @see QuoteHomeConversionFactors
     */
    public QuoteHomeConversionFactors getQuoteHomeConversionFactors() {
        return this.quoteHomeConversionFactors;
    }

    @SerializedName("unitsAvailable") private UnitsAvailable unitsAvailable;

    /**
     * Set the Units Available
     * <p>
     * Representation of how many units of an Instrument are available to be
     * traded by an Order depending on its postionFill option.
     * <p>
     * @param unitsAvailable the Units Available
     * @return {@link Price Price}
     * @see UnitsAvailable
     */
    public Price setUnitsAvailable(UnitsAvailable unitsAvailable) {
        this.unitsAvailable = unitsAvailable;
        return this;
    }

    /**
     * Get the Units Available
     * <p>
     * Representation of how many units of an Instrument are available to be
     * traded by an Order depending on its postionFill option.
     * <p>
     * @return the Units Available
     * @see UnitsAvailable
     */
    public UnitsAvailable getUnitsAvailable() {
        return this.unitsAvailable;
    }
}
