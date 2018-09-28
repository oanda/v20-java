package com.oanda.v20.pricing;

import java.util.ArrayList;
import java.util.Collection;
import java.math.BigDecimal;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.order.UnitsAvailable;
import com.oanda.v20.pricing_common.PriceBucket;
import com.oanda.v20.pricing_common.PriceValue;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.primitives.InstrumentName;

/**
 * The specification of an Account-specific Price.
 */
public class ClientPrice {

    /**
     * Default constructor.
     */
    public ClientPrice() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the ClientPrice to copy
     */
    public ClientPrice(ClientPrice other) {
        this.type = other.type;
        this.instrument = other.instrument;
        this.time = other.time;
        this.status = other.status;
        if (other.tradeable != null)
        {
            this.tradeable = new Boolean(other.tradeable);
        }
        if (other.bids != null)
        {
            this.bids = new ArrayList<PriceBucket>(other.bids);
        }
        if (other.asks != null)
        {
            this.asks = new ArrayList<PriceBucket>(other.asks);
        }
        this.closeoutBid = other.closeoutBid;
        this.closeoutAsk = other.closeoutAsk;
        if (other.quoteHomeConversionFactors != null)
        {
            this.quoteHomeConversionFactors = new QuoteHomeConversionFactors(other.quoteHomeConversionFactors);
        }
        if (other.unitsAvailable != null)
        {
            this.unitsAvailable = new UnitsAvailable(other.unitsAvailable);
        }
    }

    @SerializedName("type") private String type = "PRICE";

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

    /**
     * Set the Type
     * <p>
     * The string "PRICE". Used to identify the a Price object when found in a
     * stream.
     * <p>
     * @param type the Type as a String
     * @return {@link ClientPrice ClientPrice}
     */
    public ClientPrice setType(String type) {
        this.type = type;
        return this;
    }

    @SerializedName("instrument") private InstrumentName instrument;

    /**
     * Get the Instrument
     * <p>
     * The Price's Instrument.
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
     * The Price's Instrument.
     * <p>
     * @param instrument the Instrument as an InstrumentName
     * @return {@link ClientPrice ClientPrice}
     * @see InstrumentName
     */
    public ClientPrice setInstrument(InstrumentName instrument) {
        this.instrument = instrument;
        return this;
    }
    /**
     * Set the Instrument
     * <p>
     * The Price's Instrument.
     * <p>
     * @param instrument the Instrument as a String
     * @return {@link ClientPrice ClientPrice}
     * @see InstrumentName
     */
    public ClientPrice setInstrument(String instrument) {
        this.instrument = new InstrumentName(instrument);
        return this;
    }

    @SerializedName("time") private DateTime time;

    /**
     * Get the Time
     * <p>
     * The date/time when the Price was created
     * <p>
     * @return the Time
     * @see DateTime
     */
    public DateTime getTime() {
        return this.time;
    }

    /**
     * Set the Time
     * <p>
     * The date/time when the Price was created
     * <p>
     * @param time the Time as a DateTime
     * @return {@link ClientPrice ClientPrice}
     * @see DateTime
     */
    public ClientPrice setTime(DateTime time) {
        this.time = time;
        return this;
    }
    /**
     * Set the Time
     * <p>
     * The date/time when the Price was created
     * <p>
     * @param time the Time as a String
     * @return {@link ClientPrice ClientPrice}
     * @see DateTime
     */
    public ClientPrice setTime(String time) {
        this.time = new DateTime(time);
        return this;
    }

    @SerializedName("status") private PriceStatus status;

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

    /**
     * Set the Status
     * <p>
     * The status of the Price.
     * <p>
     * @param status the Status as a PriceStatus
     * @return {@link ClientPrice ClientPrice}
     * @see PriceStatus
     */
    public ClientPrice setStatus(PriceStatus status) {
        this.status = status;
        return this;
    }

    @SerializedName("tradeable") private Boolean tradeable;

    /**
     * Get the Is Tradeable
     * <p>
     * Flag indicating if the Price is tradeable or not
     * <p>
     * @return the Is Tradeable
     */
    public Boolean getTradeable() {
        return this.tradeable;
    }

    /**
     * Set the Is Tradeable
     * <p>
     * Flag indicating if the Price is tradeable or not
     * <p>
     * @param tradeable the Is Tradeable as a Boolean
     * @return {@link ClientPrice ClientPrice}
     */
    public ClientPrice setTradeable(Boolean tradeable) {
        this.tradeable = tradeable;
        return this;
    }

    @SerializedName("bids") private ArrayList<PriceBucket> bids;

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
    public List<PriceBucket> getBids() {
        return this.bids;
    }

    /**
     * Set the Bids
     * <p>
     * The list of prices and liquidity available on the Instrument's bid side.
     * It is possible for this list to be empty if there is no bid liquidity
     * currently available for the Instrument in the Account.
     * <p>
     * @param bids the Bids
     * @return {@link ClientPrice ClientPrice}
     * @see PriceBucket
     */
    public ClientPrice setBids(Collection<?> bids) {
        ArrayList<PriceBucket> newBids = new ArrayList<PriceBucket>(bids.size());
        bids.forEach((item) -> {
            if (item instanceof PriceBucket)
            {
                newBids.add((PriceBucket) item);
            }
            else
            {
                throw new IllegalArgumentException(
                    item.getClass().getName() + " cannot be converted to a PriceBucket"
                );
            }
        });
        this.bids = newBids;
        return this;
    }

    @SerializedName("asks") private ArrayList<PriceBucket> asks;

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
    public List<PriceBucket> getAsks() {
        return this.asks;
    }

    /**
     * Set the Asks
     * <p>
     * The list of prices and liquidity available on the Instrument's ask side.
     * It is possible for this list to be empty if there is no ask liquidity
     * currently available for the Instrument in the Account.
     * <p>
     * @param asks the Asks
     * @return {@link ClientPrice ClientPrice}
     * @see PriceBucket
     */
    public ClientPrice setAsks(Collection<?> asks) {
        ArrayList<PriceBucket> newAsks = new ArrayList<PriceBucket>(asks.size());
        asks.forEach((item) -> {
            if (item instanceof PriceBucket)
            {
                newAsks.add((PriceBucket) item);
            }
            else
            {
                throw new IllegalArgumentException(
                    item.getClass().getName() + " cannot be converted to a PriceBucket"
                );
            }
        });
        this.asks = newAsks;
        return this;
    }

    @SerializedName("closeoutBid") private PriceValue closeoutBid;

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
    public PriceValue getCloseoutBid() {
        return this.closeoutBid;
    }

    /**
     * Set the Closeout Bid
     * <p>
     * The closeout bid Price. This Price is used when a bid is required to
     * closeout a Position (margin closeout or manual) yet there is no bid
     * liquidity. The closeout bid is never used to open a new position.
     * <p>
     * @param closeoutBid the Closeout Bid as a PriceValue
     * @return {@link ClientPrice ClientPrice}
     * @see PriceValue
     */
    public ClientPrice setCloseoutBid(PriceValue closeoutBid) {
        this.closeoutBid = closeoutBid;
        return this;
    }
    /**
     * Set the Closeout Bid
     * <p>
     * The closeout bid Price. This Price is used when a bid is required to
     * closeout a Position (margin closeout or manual) yet there is no bid
     * liquidity. The closeout bid is never used to open a new position.
     * <p>
     * @param closeoutBid the Closeout Bid as a String
     * @return {@link ClientPrice ClientPrice}
     * @see PriceValue
     */
    public ClientPrice setCloseoutBid(String closeoutBid) {
        this.closeoutBid = new PriceValue(closeoutBid);
        return this;
    }
    /**
     * Set the Closeout Bid
     * <p>
     * The closeout bid Price. This Price is used when a bid is required to
     * closeout a Position (margin closeout or manual) yet there is no bid
     * liquidity. The closeout bid is never used to open a new position.
     * <p>
     * @param closeoutBid the Closeout Bid as a double
     * @return {@link ClientPrice ClientPrice}
     * @see PriceValue
     */
    public ClientPrice setCloseoutBid(double closeoutBid) {
        this.closeoutBid = new PriceValue(closeoutBid);
        return this;
    }
    /**
     * Set the Closeout Bid
     * <p>
     * The closeout bid Price. This Price is used when a bid is required to
     * closeout a Position (margin closeout or manual) yet there is no bid
     * liquidity. The closeout bid is never used to open a new position.
     * <p>
     * @param closeoutBid the Closeout Bid as a BigDecimal
     * @return {@link ClientPrice ClientPrice}
     * @see PriceValue
     */
    public ClientPrice setCloseoutBid(BigDecimal closeoutBid) {
        this.closeoutBid = new PriceValue(closeoutBid);
        return this;
    }

    @SerializedName("closeoutAsk") private PriceValue closeoutAsk;

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
    public PriceValue getCloseoutAsk() {
        return this.closeoutAsk;
    }

    /**
     * Set the Closeout Ask
     * <p>
     * The closeout ask Price. This Price is used when a ask is required to
     * closeout a Position (margin closeout or manual) yet there is no ask
     * liquidity. The closeout ask is never used to open a new position.
     * <p>
     * @param closeoutAsk the Closeout Ask as a PriceValue
     * @return {@link ClientPrice ClientPrice}
     * @see PriceValue
     */
    public ClientPrice setCloseoutAsk(PriceValue closeoutAsk) {
        this.closeoutAsk = closeoutAsk;
        return this;
    }
    /**
     * Set the Closeout Ask
     * <p>
     * The closeout ask Price. This Price is used when a ask is required to
     * closeout a Position (margin closeout or manual) yet there is no ask
     * liquidity. The closeout ask is never used to open a new position.
     * <p>
     * @param closeoutAsk the Closeout Ask as a String
     * @return {@link ClientPrice ClientPrice}
     * @see PriceValue
     */
    public ClientPrice setCloseoutAsk(String closeoutAsk) {
        this.closeoutAsk = new PriceValue(closeoutAsk);
        return this;
    }
    /**
     * Set the Closeout Ask
     * <p>
     * The closeout ask Price. This Price is used when a ask is required to
     * closeout a Position (margin closeout or manual) yet there is no ask
     * liquidity. The closeout ask is never used to open a new position.
     * <p>
     * @param closeoutAsk the Closeout Ask as a double
     * @return {@link ClientPrice ClientPrice}
     * @see PriceValue
     */
    public ClientPrice setCloseoutAsk(double closeoutAsk) {
        this.closeoutAsk = new PriceValue(closeoutAsk);
        return this;
    }
    /**
     * Set the Closeout Ask
     * <p>
     * The closeout ask Price. This Price is used when a ask is required to
     * closeout a Position (margin closeout or manual) yet there is no ask
     * liquidity. The closeout ask is never used to open a new position.
     * <p>
     * @param closeoutAsk the Closeout Ask as a BigDecimal
     * @return {@link ClientPrice ClientPrice}
     * @see PriceValue
     */
    public ClientPrice setCloseoutAsk(BigDecimal closeoutAsk) {
        this.closeoutAsk = new PriceValue(closeoutAsk);
        return this;
    }

    @SerializedName("quoteHomeConversionFactors") private QuoteHomeConversionFactors quoteHomeConversionFactors;

    /**
     * Get the Quote Home Conversions
     * <p>
     * The factors used to convert quantities of this price's Instrument's
     * quote currency into a quantity of the Account's home currency. When the
     * includeHomeConversions is present in the pricing request (regardless of
     * its value), this field will not be present.
     * <p>
     * @return the Quote Home Conversions
     * @see QuoteHomeConversionFactors
     */
    public QuoteHomeConversionFactors getQuoteHomeConversionFactors() {
        return this.quoteHomeConversionFactors;
    }

    /**
     * Set the Quote Home Conversions
     * <p>
     * The factors used to convert quantities of this price's Instrument's
     * quote currency into a quantity of the Account's home currency. When the
     * includeHomeConversions is present in the pricing request (regardless of
     * its value), this field will not be present.
     * <p>
     * @param quoteHomeConversionFactors the Quote Home Conversions as a
     * QuoteHomeConversionFactors
     * @return {@link ClientPrice ClientPrice}
     * @see QuoteHomeConversionFactors
     */
    public ClientPrice setQuoteHomeConversionFactors(QuoteHomeConversionFactors quoteHomeConversionFactors) {
        this.quoteHomeConversionFactors = quoteHomeConversionFactors;
        return this;
    }

    @SerializedName("unitsAvailable") private UnitsAvailable unitsAvailable;

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

    /**
     * Set the Units Available
     * <p>
     * Representation of how many units of an Instrument are available to be
     * traded by an Order depending on its postionFill option.
     * <p>
     * @param unitsAvailable the Units Available as an UnitsAvailable
     * @return {@link ClientPrice ClientPrice}
     * @see UnitsAvailable
     */
    public ClientPrice setUnitsAvailable(UnitsAvailable unitsAvailable) {
        this.unitsAvailable = unitsAvailable;
        return this;
    }

    @Override
    public String toString() {
        return "ClientPrice(" +
            "type=" +
                (type == null ? "null" : type.toString()) + ", " +
            "instrument=" +
                (instrument == null ? "null" : instrument.toString()) + ", " +
            "time=" +
                (time == null ? "null" : time.toString()) + ", " +
            "status=" +
                (status == null ? "null" : status.toString()) + ", " +
            "tradeable=" +
                (tradeable == null ? "null" : tradeable.toString()) + ", " +
            "bids=" +
                (bids == null ? "null" : bids.toString()) + ", " +
            "asks=" +
                (asks == null ? "null" : asks.toString()) + ", " +
            "closeoutBid=" +
                (closeoutBid == null ? "null" : closeoutBid.toString()) + ", " +
            "closeoutAsk=" +
                (closeoutAsk == null ? "null" : closeoutAsk.toString()) + ", " +
            "quoteHomeConversionFactors=" +
                (quoteHomeConversionFactors == null ? "null" : quoteHomeConversionFactors.toString()) + ", " +
            "unitsAvailable=" +
                (unitsAvailable == null ? "null" : unitsAvailable.toString()) +
            ")";
    }
}
