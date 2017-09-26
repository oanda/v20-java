package com.oanda.v20.pricing;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.primitives.DateTime;

/**
 * Client price for an Account.
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
        this.timestamp = other.timestamp;
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
     * @return {@link ClientPrice ClientPrice}
     * @see DateTime
     */
    public ClientPrice setTimestamp(DateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    /**
     * Set the Timestamp
     * <p>
     * The date/time when the Price was created.
     * <p>
     * @param timestamp the Timestamp as a String
     * @return {@link ClientPrice ClientPrice}
     * @see DateTime
     */
    public ClientPrice setTimestamp(String timestamp) {
        this.timestamp = new DateTime(timestamp);
        return this;
    }

    @Override
    public String toString() {
        return "ClientPrice(" +
            "bids=" +
                (bids == null ? "null" : bids.toString()) + ", " +
            "asks=" +
                (asks == null ? "null" : asks.toString()) + ", " +
            "closeoutBid=" +
                (closeoutBid == null ? "null" : closeoutBid.toString()) + ", " +
            "closeoutAsk=" +
                (closeoutAsk == null ? "null" : closeoutAsk.toString()) + ", " +
            "timestamp=" +
                (timestamp == null ? "null" : timestamp.toString()) +
            ")";
    }
}
