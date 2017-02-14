package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* The specification of an Account-specific Price.
*/

public class Price {

    @SerializedName("type") private String _type;
    public Price set_type(String __type) {
        this._type = __type;
        return this;
    }
    /**
    * The string "PRICE". Used to identify the a Price object when found in a
    * stream.
    */

    public String get_type() {
        return this._type;
    }

    @SerializedName("instrument") private InstrumentName _instrument;
    public Price set_instrument(String __instrument) { 
        this._instrument = new InstrumentName(__instrument); 
        return this;
    }
    /**
    * The Price's Instrument.
    */

    public String get_instrument() {
        return this._instrument.get_InstrumentName();
    }

    @SerializedName("time") private DateTime _time;
    public Price set_time(String __time) { 
        this._time = new DateTime(__time); 
        return this;
    }
    /**
    * The date/time when the Price was created
    */

    public String get_time() {
        return this._time.get_DateTime();
    }

    @SerializedName("status") private PriceStatus _status;
    public Price set_status(PriceStatus __status) { 
        this._status = __status;
        return this;
    }
    /**
    * The status of the Price.
    */

    public PriceStatus get_status() {
        return this._status;
    }

    @SerializedName("tradeable") private Boolean _tradeable;
    public Price set_tradeable(boolean __tradeable) {
        this._tradeable = __tradeable;
        return this;
    }
    /**
    * Flag indicating if the Price is tradeable or not
    */

    public boolean get_tradeable() {
        return this._tradeable;
    }
 
    @SerializedName("bids") private PriceBucket[] _bids;
    public Price set_bids(PriceBucket[] __bids) {
        this._bids = __bids;
        return this;
    }
    /**
    * The list of prices and liquidity available on the Instrument's bid side.
    * It is possible for this list to be empty if there is no bid liquidity
    * currently available for the Instrument in the Account.
    */

    public PriceBucket[] get_bids() {
        return this._bids;
    }
 
    @SerializedName("asks") private PriceBucket[] _asks;
    public Price set_asks(PriceBucket[] __asks) {
        this._asks = __asks;
        return this;
    }
    /**
    * The list of prices and liquidity available on the Instrument's ask side.
    * It is possible for this list to be empty if there is no ask liquidity
    * currently available for the Instrument in the Account.
    */

    public PriceBucket[] get_asks() {
        return this._asks;
    }

    @SerializedName("closeoutBid") private PriceValue _closeoutBid;
    // Numeric stored as String
    public Price set_closeoutBid(double __closeoutBid) { 
        this._closeoutBid = new PriceValue(__closeoutBid); 
        return this;
    }
    /**
    * The closeout bid Price. This Price is used when a bid is required to
    * closeout a Position (margin closeout or manual) yet there is no bid
    * liquidity. The closeout bid is never used to open a new position.
    */

    public double get_closeoutBid() {
        return this._closeoutBid.get_PriceValue();
    }

    @SerializedName("closeoutAsk") private PriceValue _closeoutAsk;
    // Numeric stored as String
    public Price set_closeoutAsk(double __closeoutAsk) { 
        this._closeoutAsk = new PriceValue(__closeoutAsk); 
        return this;
    }
    /**
    * The closeout ask Price. This Price is used when a ask is required to
    * closeout a Position (margin closeout or manual) yet there is no ask
    * liquidity. The closeout ask is never used to open a new position.
    */

    public double get_closeoutAsk() {
        return this._closeoutAsk.get_PriceValue();
    }

    @SerializedName("quoteHomeConversionFactors") private QuoteHomeConversionFactors _quoteHomeConversionFactors;
    public Price set_quoteHomeConversionFactors(QuoteHomeConversionFactors __quoteHomeConversionFactors) { 
        this._quoteHomeConversionFactors = __quoteHomeConversionFactors;
        return this;
    }
    /**
    * The factors used to convert quantities of this price's Instrument's quote
    * currency into a quantity of the Account's home currency.
    */

    public QuoteHomeConversionFactors get_quoteHomeConversionFactors() {
        return this._quoteHomeConversionFactors;
    }

    @SerializedName("unitsAvailable") private UnitsAvailable _unitsAvailable;
    public Price set_unitsAvailable(UnitsAvailable __unitsAvailable) { 
        this._unitsAvailable = __unitsAvailable;
        return this;
    }
    /**
    * Representation of how many units of an Instrument are available to be
    * traded by an Order depending on its postionFill option.
    */

    public UnitsAvailable get_unitsAvailable() {
        return this._unitsAvailable;
    }
}
