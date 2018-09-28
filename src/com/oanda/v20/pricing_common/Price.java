package com.oanda.v20.pricing_common;

import java.util.ArrayList;
import java.util.Collection;
import java.math.BigDecimal;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.primitives.InstrumentName;

/**
 * The Price representation
 */
public class Price {

    /**
     * Default constructor.
     */
    public Price() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the Price to copy
     */
    public Price(Price other) {
        this.instrument = other.instrument;
        if (other.tradeable != null)
        {
            this.tradeable = new Boolean(other.tradeable);
        }
        this.timestamp = other.timestamp;
        this.baseBid = other.baseBid;
        this.baseAsk = other.baseAsk;
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
     * @return {@link Price Price}
     * @see InstrumentName
     */
    public Price setInstrument(InstrumentName instrument) {
        this.instrument = instrument;
        return this;
    }
    /**
     * Set the Instrument
     * <p>
     * The Price's Instrument.
     * <p>
     * @param instrument the Instrument as a String
     * @return {@link Price Price}
     * @see InstrumentName
     */
    public Price setInstrument(String instrument) {
        this.instrument = new InstrumentName(instrument);
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
     * @return {@link Price Price}
     */
    public Price setTradeable(Boolean tradeable) {
        this.tradeable = tradeable;
        return this;
    }

    @SerializedName("timestamp") private DateTime timestamp;

    /**
     * Get the Timestamp
     * <p>
     * The date/time when the Price was created.
     * <p>
     * @return the Timestamp
     * @see DateTime
     */
    public DateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Set the Timestamp
     * <p>
     * The date/time when the Price was created.
     * <p>
     * @param timestamp the Timestamp as a DateTime
     * @return {@link Price Price}
     * @see DateTime
     */
    public Price setTimestamp(DateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    /**
     * Set the Timestamp
     * <p>
     * The date/time when the Price was created.
     * <p>
     * @param timestamp the Timestamp as a String
     * @return {@link Price Price}
     * @see DateTime
     */
    public Price setTimestamp(String timestamp) {
        this.timestamp = new DateTime(timestamp);
        return this;
    }

    @SerializedName("baseBid") private PriceValue baseBid;

    /**
     * Get the Base Bid
     * <p>
     * The base bid price as calculated by pricing.
     * <p>
     * @return the Base Bid
     * @see PriceValue
     */
    public PriceValue getBaseBid() {
        return this.baseBid;
    }

    /**
     * Set the Base Bid
     * <p>
     * The base bid price as calculated by pricing.
     * <p>
     * @param baseBid the Base Bid as a PriceValue
     * @return {@link Price Price}
     * @see PriceValue
     */
    public Price setBaseBid(PriceValue baseBid) {
        this.baseBid = baseBid;
        return this;
    }
    /**
     * Set the Base Bid
     * <p>
     * The base bid price as calculated by pricing.
     * <p>
     * @param baseBid the Base Bid as a String
     * @return {@link Price Price}
     * @see PriceValue
     */
    public Price setBaseBid(String baseBid) {
        this.baseBid = new PriceValue(baseBid);
        return this;
    }
    /**
     * Set the Base Bid
     * <p>
     * The base bid price as calculated by pricing.
     * <p>
     * @param baseBid the Base Bid as a double
     * @return {@link Price Price}
     * @see PriceValue
     */
    public Price setBaseBid(double baseBid) {
        this.baseBid = new PriceValue(baseBid);
        return this;
    }
    /**
     * Set the Base Bid
     * <p>
     * The base bid price as calculated by pricing.
     * <p>
     * @param baseBid the Base Bid as a BigDecimal
     * @return {@link Price Price}
     * @see PriceValue
     */
    public Price setBaseBid(BigDecimal baseBid) {
        this.baseBid = new PriceValue(baseBid);
        return this;
    }

    @SerializedName("baseAsk") private PriceValue baseAsk;

    /**
     * Get the Base Ask
     * <p>
     * The base ask price as calculated by pricing.
     * <p>
     * @return the Base Ask
     * @see PriceValue
     */
    public PriceValue getBaseAsk() {
        return this.baseAsk;
    }

    /**
     * Set the Base Ask
     * <p>
     * The base ask price as calculated by pricing.
     * <p>
     * @param baseAsk the Base Ask as a PriceValue
     * @return {@link Price Price}
     * @see PriceValue
     */
    public Price setBaseAsk(PriceValue baseAsk) {
        this.baseAsk = baseAsk;
        return this;
    }
    /**
     * Set the Base Ask
     * <p>
     * The base ask price as calculated by pricing.
     * <p>
     * @param baseAsk the Base Ask as a String
     * @return {@link Price Price}
     * @see PriceValue
     */
    public Price setBaseAsk(String baseAsk) {
        this.baseAsk = new PriceValue(baseAsk);
        return this;
    }
    /**
     * Set the Base Ask
     * <p>
     * The base ask price as calculated by pricing.
     * <p>
     * @param baseAsk the Base Ask as a double
     * @return {@link Price Price}
     * @see PriceValue
     */
    public Price setBaseAsk(double baseAsk) {
        this.baseAsk = new PriceValue(baseAsk);
        return this;
    }
    /**
     * Set the Base Ask
     * <p>
     * The base ask price as calculated by pricing.
     * <p>
     * @param baseAsk the Base Ask as a BigDecimal
     * @return {@link Price Price}
     * @see PriceValue
     */
    public Price setBaseAsk(BigDecimal baseAsk) {
        this.baseAsk = new PriceValue(baseAsk);
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
     * @return {@link Price Price}
     * @see PriceBucket
     */
    public Price setBids(Collection<?> bids) {
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
     * @return {@link Price Price}
     * @see PriceBucket
     */
    public Price setAsks(Collection<?> asks) {
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
     * The closeout bid price. This price is used when a bid is required to
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
     * The closeout bid price. This price is used when a bid is required to
     * closeout a Position (margin closeout or manual) yet there is no bid
     * liquidity. The closeout bid is never used to open a new position.
     * <p>
     * @param closeoutBid the Closeout Bid as a PriceValue
     * @return {@link Price Price}
     * @see PriceValue
     */
    public Price setCloseoutBid(PriceValue closeoutBid) {
        this.closeoutBid = closeoutBid;
        return this;
    }
    /**
     * Set the Closeout Bid
     * <p>
     * The closeout bid price. This price is used when a bid is required to
     * closeout a Position (margin closeout or manual) yet there is no bid
     * liquidity. The closeout bid is never used to open a new position.
     * <p>
     * @param closeoutBid the Closeout Bid as a String
     * @return {@link Price Price}
     * @see PriceValue
     */
    public Price setCloseoutBid(String closeoutBid) {
        this.closeoutBid = new PriceValue(closeoutBid);
        return this;
    }
    /**
     * Set the Closeout Bid
     * <p>
     * The closeout bid price. This price is used when a bid is required to
     * closeout a Position (margin closeout or manual) yet there is no bid
     * liquidity. The closeout bid is never used to open a new position.
     * <p>
     * @param closeoutBid the Closeout Bid as a double
     * @return {@link Price Price}
     * @see PriceValue
     */
    public Price setCloseoutBid(double closeoutBid) {
        this.closeoutBid = new PriceValue(closeoutBid);
        return this;
    }
    /**
     * Set the Closeout Bid
     * <p>
     * The closeout bid price. This price is used when a bid is required to
     * closeout a Position (margin closeout or manual) yet there is no bid
     * liquidity. The closeout bid is never used to open a new position.
     * <p>
     * @param closeoutBid the Closeout Bid as a BigDecimal
     * @return {@link Price Price}
     * @see PriceValue
     */
    public Price setCloseoutBid(BigDecimal closeoutBid) {
        this.closeoutBid = new PriceValue(closeoutBid);
        return this;
    }

    @SerializedName("closeoutAsk") private PriceValue closeoutAsk;

    /**
     * Get the Closeout Ask
     * <p>
     * The closeout ask price. This price is used when an ask is required to
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
     * The closeout ask price. This price is used when an ask is required to
     * closeout a Position (margin closeout or manual) yet there is no ask
     * liquidity. The closeout ask is never used to open a new position.
     * <p>
     * @param closeoutAsk the Closeout Ask as a PriceValue
     * @return {@link Price Price}
     * @see PriceValue
     */
    public Price setCloseoutAsk(PriceValue closeoutAsk) {
        this.closeoutAsk = closeoutAsk;
        return this;
    }
    /**
     * Set the Closeout Ask
     * <p>
     * The closeout ask price. This price is used when an ask is required to
     * closeout a Position (margin closeout or manual) yet there is no ask
     * liquidity. The closeout ask is never used to open a new position.
     * <p>
     * @param closeoutAsk the Closeout Ask as a String
     * @return {@link Price Price}
     * @see PriceValue
     */
    public Price setCloseoutAsk(String closeoutAsk) {
        this.closeoutAsk = new PriceValue(closeoutAsk);
        return this;
    }
    /**
     * Set the Closeout Ask
     * <p>
     * The closeout ask price. This price is used when an ask is required to
     * closeout a Position (margin closeout or manual) yet there is no ask
     * liquidity. The closeout ask is never used to open a new position.
     * <p>
     * @param closeoutAsk the Closeout Ask as a double
     * @return {@link Price Price}
     * @see PriceValue
     */
    public Price setCloseoutAsk(double closeoutAsk) {
        this.closeoutAsk = new PriceValue(closeoutAsk);
        return this;
    }
    /**
     * Set the Closeout Ask
     * <p>
     * The closeout ask price. This price is used when an ask is required to
     * closeout a Position (margin closeout or manual) yet there is no ask
     * liquidity. The closeout ask is never used to open a new position.
     * <p>
     * @param closeoutAsk the Closeout Ask as a BigDecimal
     * @return {@link Price Price}
     * @see PriceValue
     */
    public Price setCloseoutAsk(BigDecimal closeoutAsk) {
        this.closeoutAsk = new PriceValue(closeoutAsk);
        return this;
    }

    @Override
    public String toString() {
        return "Price(" +
            "instrument=" +
                (instrument == null ? "null" : instrument.toString()) + ", " +
            "tradeable=" +
                (tradeable == null ? "null" : tradeable.toString()) + ", " +
            "timestamp=" +
                (timestamp == null ? "null" : timestamp.toString()) + ", " +
            "baseBid=" +
                (baseBid == null ? "null" : baseBid.toString()) + ", " +
            "baseAsk=" +
                (baseAsk == null ? "null" : baseAsk.toString()) + ", " +
            "bids=" +
                (bids == null ? "null" : bids.toString()) + ", " +
            "asks=" +
                (asks == null ? "null" : asks.toString()) + ", " +
            "closeoutBid=" +
                (closeoutBid == null ? "null" : closeoutBid.toString()) + ", " +
            "closeoutAsk=" +
                (closeoutAsk == null ? "null" : closeoutAsk.toString()) +
            ")";
    }
}
