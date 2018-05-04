package com.oanda.v20.transaction;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.account.AccountID;
import com.oanda.v20.order.OrderID;
import com.oanda.v20.order.OrderPositionFill;
import com.oanda.v20.order.OrderTriggerCondition;
import com.oanda.v20.order.TimeInForce;
import com.oanda.v20.pricing_common.PriceValue;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.primitives.DecimalNumber;
import com.oanda.v20.primitives.InstrumentName;

/**
 * A MarketIfTouchedOrderTransaction represents the creation of a
 * MarketIfTouched Order in the user's Account.
 * <p>
 * Create MIT Order {id} ({reason}): {units} of {instrument} @ {price}
 */
public class MarketIfTouchedOrderTransaction implements Transaction {

    /**
     * Default constructor.
     */
    public MarketIfTouchedOrderTransaction() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the MarketIfTouchedOrderTransaction to copy
     */
    public MarketIfTouchedOrderTransaction(MarketIfTouchedOrderTransaction other) {
        this.id = other.id;
        this.time = other.time;
        if (other.userID != null)
        {
            this.userID = new Long(other.userID);
        }
        this.accountID = other.accountID;
        this.batchID = other.batchID;
        this.requestID = other.requestID;
        this.type = other.type;
        this.instrument = other.instrument;
        this.units = other.units;
        this.price = other.price;
        this.priceBound = other.priceBound;
        this.timeInForce = other.timeInForce;
        this.gtdTime = other.gtdTime;
        this.positionFill = other.positionFill;
        this.triggerCondition = other.triggerCondition;
        this.reason = other.reason;
        if (other.clientExtensions != null)
        {
            this.clientExtensions = new ClientExtensions(other.clientExtensions);
        }
        if (other.takeProfitOnFill != null)
        {
            this.takeProfitOnFill = new TakeProfitDetails(other.takeProfitOnFill);
        }
        if (other.stopLossOnFill != null)
        {
            this.stopLossOnFill = new StopLossDetails(other.stopLossOnFill);
        }
        if (other.trailingStopLossOnFill != null)
        {
            this.trailingStopLossOnFill = new TrailingStopLossDetails(other.trailingStopLossOnFill);
        }
        if (other.tradeClientExtensions != null)
        {
            this.tradeClientExtensions = new ClientExtensions(other.tradeClientExtensions);
        }
        this.replacesOrderID = other.replacesOrderID;
        this.cancellingTransactionID = other.cancellingTransactionID;
    }

    @SerializedName("id") private TransactionID id;

    /**
     * Get the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @return the Transaction ID
     * @see TransactionID
     */
    public TransactionID getId() {
        return this.id;
    }

    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID as a TransactionID
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see TransactionID
     */
    public MarketIfTouchedOrderTransaction setId(TransactionID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID as a String
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see TransactionID
     */
    public MarketIfTouchedOrderTransaction setId(String id) {
        this.id = new TransactionID(id);
        return this;
    }

    @SerializedName("time") private DateTime time;

    /**
     * Get the Time
     * <p>
     * The date/time when the Transaction was created.
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
     * The date/time when the Transaction was created.
     * <p>
     * @param time the Time as a DateTime
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see DateTime
     */
    public MarketIfTouchedOrderTransaction setTime(DateTime time) {
        this.time = time;
        return this;
    }
    /**
     * Set the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @param time the Time as a String
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see DateTime
     */
    public MarketIfTouchedOrderTransaction setTime(String time) {
        this.time = new DateTime(time);
        return this;
    }

    @SerializedName("userID") private Long userID;

    /**
     * Get the User ID
     * <p>
     * The ID of the user that initiated the creation of the Transaction.
     * <p>
     * @return the User ID
     */
    public Long getUserID() {
        return this.userID;
    }

    /**
     * Set the User ID
     * <p>
     * The ID of the user that initiated the creation of the Transaction.
     * <p>
     * @param userID the User ID as a Long
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     */
    public MarketIfTouchedOrderTransaction setUserID(Long userID) {
        this.userID = userID;
        return this;
    }

    @SerializedName("accountID") private AccountID accountID;

    /**
     * Get the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @return the Account ID
     * @see AccountID
     */
    public AccountID getAccountID() {
        return this.accountID;
    }

    /**
     * Set the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @param accountID the Account ID as an AccountID
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see AccountID
     */
    public MarketIfTouchedOrderTransaction setAccountID(AccountID accountID) {
        this.accountID = accountID;
        return this;
    }
    /**
     * Set the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @param accountID the Account ID as a String
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see AccountID
     */
    public MarketIfTouchedOrderTransaction setAccountID(String accountID) {
        this.accountID = new AccountID(accountID);
        return this;
    }

    @SerializedName("batchID") private TransactionID batchID;

    /**
     * Get the Transaction Batch ID
     * <p>
     * The ID of the "batch" that the Transaction belongs to. Transactions in
     * the same batch are applied to the Account simultaneously.
     * <p>
     * @return the Transaction Batch ID
     * @see TransactionID
     */
    public TransactionID getBatchID() {
        return this.batchID;
    }

    /**
     * Set the Transaction Batch ID
     * <p>
     * The ID of the "batch" that the Transaction belongs to. Transactions in
     * the same batch are applied to the Account simultaneously.
     * <p>
     * @param batchID the Transaction Batch ID as a TransactionID
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see TransactionID
     */
    public MarketIfTouchedOrderTransaction setBatchID(TransactionID batchID) {
        this.batchID = batchID;
        return this;
    }
    /**
     * Set the Transaction Batch ID
     * <p>
     * The ID of the "batch" that the Transaction belongs to. Transactions in
     * the same batch are applied to the Account simultaneously.
     * <p>
     * @param batchID the Transaction Batch ID as a String
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see TransactionID
     */
    public MarketIfTouchedOrderTransaction setBatchID(String batchID) {
        this.batchID = new TransactionID(batchID);
        return this;
    }

    @SerializedName("requestID") private RequestID requestID;

    /**
     * Get the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @return the Request ID
     * @see RequestID
     */
    public RequestID getRequestID() {
        return this.requestID;
    }

    /**
     * Set the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @param requestID the Request ID as a RequestID
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see RequestID
     */
    public MarketIfTouchedOrderTransaction setRequestID(RequestID requestID) {
        this.requestID = requestID;
        return this;
    }
    /**
     * Set the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @param requestID the Request ID as a String
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see RequestID
     */
    public MarketIfTouchedOrderTransaction setRequestID(String requestID) {
        this.requestID = new RequestID(requestID);
        return this;
    }

    @SerializedName("type") private TransactionType type = TransactionType.MARKET_IF_TOUCHED_ORDER;

    /**
     * Get the Type
     * <p>
     * The Type of the Transaction. Always set to "MARKET_IF_TOUCHED_ORDER" in
     * a MarketIfTouchedOrderTransaction.
     * <p>
     * @return the Type
     * @see TransactionType
     */
    public TransactionType getType() {
        return this.type;
    }

    /**
     * Set the Type
     * <p>
     * The Type of the Transaction. Always set to "MARKET_IF_TOUCHED_ORDER" in
     * a MarketIfTouchedOrderTransaction.
     * <p>
     * @param type the Type as a TransactionType
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see TransactionType
     */
    public MarketIfTouchedOrderTransaction setType(TransactionType type) {
        this.type = type;
        return this;
    }

    @SerializedName("instrument") private InstrumentName instrument;

    /**
     * Get the Instrument
     * <p>
     * The MarketIfTouched Order's Instrument.
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
     * The MarketIfTouched Order's Instrument.
     * <p>
     * @param instrument the Instrument as an InstrumentName
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see InstrumentName
     */
    public MarketIfTouchedOrderTransaction setInstrument(InstrumentName instrument) {
        this.instrument = instrument;
        return this;
    }
    /**
     * Set the Instrument
     * <p>
     * The MarketIfTouched Order's Instrument.
     * <p>
     * @param instrument the Instrument as a String
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see InstrumentName
     */
    public MarketIfTouchedOrderTransaction setInstrument(String instrument) {
        this.instrument = new InstrumentName(instrument);
        return this;
    }

    @SerializedName("units") private DecimalNumber units;

    /**
     * Get the Amount
     * <p>
     * The quantity requested to be filled by the MarketIfTouched Order. A
     * posititive number of units results in a long Order, and a negative
     * number of units results in a short Order.
     * <p>
     * @return the Amount
     * @see DecimalNumber
     */
    public DecimalNumber getUnits() {
        return this.units;
    }

    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the MarketIfTouched Order. A
     * posititive number of units results in a long Order, and a negative
     * number of units results in a short Order.
     * <p>
     * @param units the Amount as a DecimalNumber
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see DecimalNumber
     */
    public MarketIfTouchedOrderTransaction setUnits(DecimalNumber units) {
        this.units = units;
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the MarketIfTouched Order. A
     * posititive number of units results in a long Order, and a negative
     * number of units results in a short Order.
     * <p>
     * @param units the Amount as a String
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see DecimalNumber
     */
    public MarketIfTouchedOrderTransaction setUnits(String units) {
        this.units = new DecimalNumber(units);
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the MarketIfTouched Order. A
     * posititive number of units results in a long Order, and a negative
     * number of units results in a short Order.
     * <p>
     * @param units the Amount as a double
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see DecimalNumber
     */
    public MarketIfTouchedOrderTransaction setUnits(double units) {
        this.units = new DecimalNumber(units);
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the MarketIfTouched Order. A
     * posititive number of units results in a long Order, and a negative
     * number of units results in a short Order.
     * <p>
     * @param units the Amount as a BigDecimal
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see DecimalNumber
     */
    public MarketIfTouchedOrderTransaction setUnits(BigDecimal units) {
        this.units = new DecimalNumber(units);
        return this;
    }

    @SerializedName("price") private PriceValue price;

    /**
     * Get the Price
     * <p>
     * The price threshold specified for the MarketIfTouched Order. The
     * MarketIfTouched Order will only be filled by a market price that crosses
     * this price from the direction of the market price at the time when the
     * Order was created (the initialMarketPrice). Depending on the value of
     * the Order's price and initialMarketPrice, the MarketIfTouchedOrder will
     * behave like a Limit or a Stop Order.
     * <p>
     * @return the Price
     * @see PriceValue
     */
    public PriceValue getPrice() {
        return this.price;
    }

    /**
     * Set the Price
     * <p>
     * The price threshold specified for the MarketIfTouched Order. The
     * MarketIfTouched Order will only be filled by a market price that crosses
     * this price from the direction of the market price at the time when the
     * Order was created (the initialMarketPrice). Depending on the value of
     * the Order's price and initialMarketPrice, the MarketIfTouchedOrder will
     * behave like a Limit or a Stop Order.
     * <p>
     * @param price the Price as a PriceValue
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see PriceValue
     */
    public MarketIfTouchedOrderTransaction setPrice(PriceValue price) {
        this.price = price;
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price threshold specified for the MarketIfTouched Order. The
     * MarketIfTouched Order will only be filled by a market price that crosses
     * this price from the direction of the market price at the time when the
     * Order was created (the initialMarketPrice). Depending on the value of
     * the Order's price and initialMarketPrice, the MarketIfTouchedOrder will
     * behave like a Limit or a Stop Order.
     * <p>
     * @param price the Price as a String
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see PriceValue
     */
    public MarketIfTouchedOrderTransaction setPrice(String price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price threshold specified for the MarketIfTouched Order. The
     * MarketIfTouched Order will only be filled by a market price that crosses
     * this price from the direction of the market price at the time when the
     * Order was created (the initialMarketPrice). Depending on the value of
     * the Order's price and initialMarketPrice, the MarketIfTouchedOrder will
     * behave like a Limit or a Stop Order.
     * <p>
     * @param price the Price as a double
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see PriceValue
     */
    public MarketIfTouchedOrderTransaction setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price threshold specified for the MarketIfTouched Order. The
     * MarketIfTouched Order will only be filled by a market price that crosses
     * this price from the direction of the market price at the time when the
     * Order was created (the initialMarketPrice). Depending on the value of
     * the Order's price and initialMarketPrice, the MarketIfTouchedOrder will
     * behave like a Limit or a Stop Order.
     * <p>
     * @param price the Price as a BigDecimal
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see PriceValue
     */
    public MarketIfTouchedOrderTransaction setPrice(BigDecimal price) {
        this.price = new PriceValue(price);
        return this;
    }

    @SerializedName("priceBound") private PriceValue priceBound;

    /**
     * Get the Price Value
     * <p>
     * The worst market price that may be used to fill this MarketIfTouched
     * Order.
     * <p>
     * @return the Price Value
     * @see PriceValue
     */
    public PriceValue getPriceBound() {
        return this.priceBound;
    }

    /**
     * Set the Price Value
     * <p>
     * The worst market price that may be used to fill this MarketIfTouched
     * Order.
     * <p>
     * @param priceBound the Price Value as a PriceValue
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see PriceValue
     */
    public MarketIfTouchedOrderTransaction setPriceBound(PriceValue priceBound) {
        this.priceBound = priceBound;
        return this;
    }
    /**
     * Set the Price Value
     * <p>
     * The worst market price that may be used to fill this MarketIfTouched
     * Order.
     * <p>
     * @param priceBound the Price Value as a String
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see PriceValue
     */
    public MarketIfTouchedOrderTransaction setPriceBound(String priceBound) {
        this.priceBound = new PriceValue(priceBound);
        return this;
    }
    /**
     * Set the Price Value
     * <p>
     * The worst market price that may be used to fill this MarketIfTouched
     * Order.
     * <p>
     * @param priceBound the Price Value as a double
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see PriceValue
     */
    public MarketIfTouchedOrderTransaction setPriceBound(double priceBound) {
        this.priceBound = new PriceValue(priceBound);
        return this;
    }
    /**
     * Set the Price Value
     * <p>
     * The worst market price that may be used to fill this MarketIfTouched
     * Order.
     * <p>
     * @param priceBound the Price Value as a BigDecimal
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see PriceValue
     */
    public MarketIfTouchedOrderTransaction setPriceBound(BigDecimal priceBound) {
        this.priceBound = new PriceValue(priceBound);
        return this;
    }

    @SerializedName("timeInForce") private TimeInForce timeInForce = TimeInForce.GTC;

    /**
     * Get the Time In Force
     * <p>
     * The time-in-force requested for the MarketIfTouched Order. Restricted to
     * "GTC", "GFD" and "GTD" for MarketIfTouched Orders.
     * <p>
     * @return the Time In Force
     * @see TimeInForce
     */
    public TimeInForce getTimeInForce() {
        return this.timeInForce;
    }

    /**
     * Set the Time In Force
     * <p>
     * The time-in-force requested for the MarketIfTouched Order. Restricted to
     * "GTC", "GFD" and "GTD" for MarketIfTouched Orders.
     * <p>
     * @param timeInForce the Time In Force as a TimeInForce
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see TimeInForce
     */
    public MarketIfTouchedOrderTransaction setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

    @SerializedName("gtdTime") private DateTime gtdTime;

    /**
     * Get the GTD Time
     * <p>
     * The date/time when the MarketIfTouched Order will be cancelled if its
     * timeInForce is "GTD".
     * <p>
     * @return the GTD Time
     * @see DateTime
     */
    public DateTime getGtdTime() {
        return this.gtdTime;
    }

    /**
     * Set the GTD Time
     * <p>
     * The date/time when the MarketIfTouched Order will be cancelled if its
     * timeInForce is "GTD".
     * <p>
     * @param gtdTime the GTD Time as a DateTime
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see DateTime
     */
    public MarketIfTouchedOrderTransaction setGtdTime(DateTime gtdTime) {
        this.gtdTime = gtdTime;
        return this;
    }
    /**
     * Set the GTD Time
     * <p>
     * The date/time when the MarketIfTouched Order will be cancelled if its
     * timeInForce is "GTD".
     * <p>
     * @param gtdTime the GTD Time as a String
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see DateTime
     */
    public MarketIfTouchedOrderTransaction setGtdTime(String gtdTime) {
        this.gtdTime = new DateTime(gtdTime);
        return this;
    }

    @SerializedName("positionFill") private OrderPositionFill positionFill = OrderPositionFill.DEFAULT;

    /**
     * Get the Position Fill
     * <p>
     * Specification of how Positions in the Account are modified when the
     * Order is filled.
     * <p>
     * @return the Position Fill
     * @see OrderPositionFill
     */
    public OrderPositionFill getPositionFill() {
        return this.positionFill;
    }

    /**
     * Set the Position Fill
     * <p>
     * Specification of how Positions in the Account are modified when the
     * Order is filled.
     * <p>
     * @param positionFill the Position Fill as an OrderPositionFill
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see OrderPositionFill
     */
    public MarketIfTouchedOrderTransaction setPositionFill(OrderPositionFill positionFill) {
        this.positionFill = positionFill;
        return this;
    }

    @SerializedName("triggerCondition") private OrderTriggerCondition triggerCondition = OrderTriggerCondition.DEFAULT;

    /**
     * Get the Trigger Condition
     * <p>
     * Specification of which price component should be used when determining
     * if an Order should be triggered and filled. This allows Orders to be
     * triggered based on the bid, ask, mid, default (ask for buy, bid for
     * sell) or inverse (ask for sell, bid for buy) price depending on the
     * desired behaviour. Orders are always filled using their default price
     * component. This feature is only provided through the REST API. Clients
     * who choose to specify a non-default trigger condition will not see it
     * reflected in any of OANDA's proprietary or partner trading platforms,
     * their transaction history or their account statements. OANDA platforms
     * always assume that an Order's trigger condition is set to the default
     * value when indicating the distance from an Order's trigger price, and
     * will always provide the default trigger condition when creating or
     * modifying an Order. A special restriction applies when creating a
     * guaranteed Stop Loss Order. In this case the TriggerCondition value must
     * either be "DEFAULT", or the "natural" trigger side "DEFAULT" results in.
     * So for a Stop Loss Order for a long trade valid values are "DEFAULT" and
     * "BID", and for short trades "DEFAULT" and "ASK" are valid.
     * <p>
     * @return the Trigger Condition
     * @see OrderTriggerCondition
     */
    public OrderTriggerCondition getTriggerCondition() {
        return this.triggerCondition;
    }

    /**
     * Set the Trigger Condition
     * <p>
     * Specification of which price component should be used when determining
     * if an Order should be triggered and filled. This allows Orders to be
     * triggered based on the bid, ask, mid, default (ask for buy, bid for
     * sell) or inverse (ask for sell, bid for buy) price depending on the
     * desired behaviour. Orders are always filled using their default price
     * component. This feature is only provided through the REST API. Clients
     * who choose to specify a non-default trigger condition will not see it
     * reflected in any of OANDA's proprietary or partner trading platforms,
     * their transaction history or their account statements. OANDA platforms
     * always assume that an Order's trigger condition is set to the default
     * value when indicating the distance from an Order's trigger price, and
     * will always provide the default trigger condition when creating or
     * modifying an Order. A special restriction applies when creating a
     * guaranteed Stop Loss Order. In this case the TriggerCondition value must
     * either be "DEFAULT", or the "natural" trigger side "DEFAULT" results in.
     * So for a Stop Loss Order for a long trade valid values are "DEFAULT" and
     * "BID", and for short trades "DEFAULT" and "ASK" are valid.
     * <p>
     * @param triggerCondition the Trigger Condition as an
     * OrderTriggerCondition
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see OrderTriggerCondition
     */
    public MarketIfTouchedOrderTransaction setTriggerCondition(OrderTriggerCondition triggerCondition) {
        this.triggerCondition = triggerCondition;
        return this;
    }

    @SerializedName("reason") private MarketIfTouchedOrderReason reason;

    /**
     * Get the Reason
     * <p>
     * The reason that the Market-if-touched Order was initiated
     * <p>
     * @return the Reason
     * @see MarketIfTouchedOrderReason
     */
    public MarketIfTouchedOrderReason getReason() {
        return this.reason;
    }

    /**
     * Set the Reason
     * <p>
     * The reason that the Market-if-touched Order was initiated
     * <p>
     * @param reason the Reason as a MarketIfTouchedOrderReason
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see MarketIfTouchedOrderReason
     */
    public MarketIfTouchedOrderTransaction setReason(MarketIfTouchedOrderReason reason) {
        this.reason = reason;
        return this;
    }

    @SerializedName("clientExtensions") private ClientExtensions clientExtensions;

    /**
     * Get the Order Client Extensions
     * <p>
     * Client Extensions to add to the Order (only provided if the Order is
     * being created with client extensions).
     * <p>
     * @return the Order Client Extensions
     * @see ClientExtensions
     */
    public ClientExtensions getClientExtensions() {
        return this.clientExtensions;
    }

    /**
     * Set the Order Client Extensions
     * <p>
     * Client Extensions to add to the Order (only provided if the Order is
     * being created with client extensions).
     * <p>
     * @param clientExtensions the Order Client Extensions as a
     * ClientExtensions
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see ClientExtensions
     */
    public MarketIfTouchedOrderTransaction setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

    @SerializedName("takeProfitOnFill") private TakeProfitDetails takeProfitOnFill;

    /**
     * Get the Take Profit On Fill
     * <p>
     * The specification of the Take Profit Order that should be created for a
     * Trade opened when the Order is filled (if such a Trade is created).
     * <p>
     * @return the Take Profit On Fill
     * @see TakeProfitDetails
     */
    public TakeProfitDetails getTakeProfitOnFill() {
        return this.takeProfitOnFill;
    }

    /**
     * Set the Take Profit On Fill
     * <p>
     * The specification of the Take Profit Order that should be created for a
     * Trade opened when the Order is filled (if such a Trade is created).
     * <p>
     * @param takeProfitOnFill the Take Profit On Fill as a TakeProfitDetails
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see TakeProfitDetails
     */
    public MarketIfTouchedOrderTransaction setTakeProfitOnFill(TakeProfitDetails takeProfitOnFill) {
        this.takeProfitOnFill = takeProfitOnFill;
        return this;
    }

    @SerializedName("stopLossOnFill") private StopLossDetails stopLossOnFill;

    /**
     * Get the Stop Loss On Fill
     * <p>
     * The specification of the Stop Loss Order that should be created for a
     * Trade opened when the Order is filled (if such a Trade is created).
     * <p>
     * @return the Stop Loss On Fill
     * @see StopLossDetails
     */
    public StopLossDetails getStopLossOnFill() {
        return this.stopLossOnFill;
    }

    /**
     * Set the Stop Loss On Fill
     * <p>
     * The specification of the Stop Loss Order that should be created for a
     * Trade opened when the Order is filled (if such a Trade is created).
     * <p>
     * @param stopLossOnFill the Stop Loss On Fill as a StopLossDetails
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see StopLossDetails
     */
    public MarketIfTouchedOrderTransaction setStopLossOnFill(StopLossDetails stopLossOnFill) {
        this.stopLossOnFill = stopLossOnFill;
        return this;
    }

    @SerializedName("trailingStopLossOnFill") private TrailingStopLossDetails trailingStopLossOnFill;

    /**
     * Get the Trailing Stop Loss On Fill
     * <p>
     * The specification of the Trailing Stop Loss Order that should be created
     * for a Trade that is opened when the Order is filled (if such a Trade is
     * created).
     * <p>
     * @return the Trailing Stop Loss On Fill
     * @see TrailingStopLossDetails
     */
    public TrailingStopLossDetails getTrailingStopLossOnFill() {
        return this.trailingStopLossOnFill;
    }

    /**
     * Set the Trailing Stop Loss On Fill
     * <p>
     * The specification of the Trailing Stop Loss Order that should be created
     * for a Trade that is opened when the Order is filled (if such a Trade is
     * created).
     * <p>
     * @param trailingStopLossOnFill the Trailing Stop Loss On Fill as a
     * TrailingStopLossDetails
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see TrailingStopLossDetails
     */
    public MarketIfTouchedOrderTransaction setTrailingStopLossOnFill(TrailingStopLossDetails trailingStopLossOnFill) {
        this.trailingStopLossOnFill = trailingStopLossOnFill;
        return this;
    }

    @SerializedName("tradeClientExtensions") private ClientExtensions tradeClientExtensions;

    /**
     * Get the Trade Client Extensions
     * <p>
     * Client Extensions to add to the Trade created when the Order is filled
     * (if such a Trade is created).  Do not set, modify, delete
     * tradeClientExtensions if your account is associated with MT4.
     * <p>
     * @return the Trade Client Extensions
     * @see ClientExtensions
     */
    public ClientExtensions getTradeClientExtensions() {
        return this.tradeClientExtensions;
    }

    /**
     * Set the Trade Client Extensions
     * <p>
     * Client Extensions to add to the Trade created when the Order is filled
     * (if such a Trade is created).  Do not set, modify, delete
     * tradeClientExtensions if your account is associated with MT4.
     * <p>
     * @param tradeClientExtensions the Trade Client Extensions as a
     * ClientExtensions
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see ClientExtensions
     */
    public MarketIfTouchedOrderTransaction setTradeClientExtensions(ClientExtensions tradeClientExtensions) {
        this.tradeClientExtensions = tradeClientExtensions;
        return this;
    }

    @SerializedName("replacesOrderID") private OrderID replacesOrderID;

    /**
     * Get the Replaces Order ID
     * <p>
     * The ID of the Order that this Order replaces (only provided if this
     * Order replaces an existing Order).
     * <p>
     * @return the Replaces Order ID
     * @see OrderID
     */
    public OrderID getReplacesOrderID() {
        return this.replacesOrderID;
    }

    /**
     * Set the Replaces Order ID
     * <p>
     * The ID of the Order that this Order replaces (only provided if this
     * Order replaces an existing Order).
     * <p>
     * @param replacesOrderID the Replaces Order ID as an OrderID
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see OrderID
     */
    public MarketIfTouchedOrderTransaction setReplacesOrderID(OrderID replacesOrderID) {
        this.replacesOrderID = replacesOrderID;
        return this;
    }
    /**
     * Set the Replaces Order ID
     * <p>
     * The ID of the Order that this Order replaces (only provided if this
     * Order replaces an existing Order).
     * <p>
     * @param replacesOrderID the Replaces Order ID as a String
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see OrderID
     */
    public MarketIfTouchedOrderTransaction setReplacesOrderID(String replacesOrderID) {
        this.replacesOrderID = new OrderID(replacesOrderID);
        return this;
    }

    @SerializedName("cancellingTransactionID") private TransactionID cancellingTransactionID;

    /**
     * Get the Replaces Order Cancel Transaction ID
     * <p>
     * The ID of the Transaction that cancels the replaced Order (only provided
     * if this Order replaces an existing Order).
     * <p>
     * @return the Replaces Order Cancel Transaction ID
     * @see TransactionID
     */
    public TransactionID getCancellingTransactionID() {
        return this.cancellingTransactionID;
    }

    /**
     * Set the Replaces Order Cancel Transaction ID
     * <p>
     * The ID of the Transaction that cancels the replaced Order (only provided
     * if this Order replaces an existing Order).
     * <p>
     * @param cancellingTransactionID the Replaces Order Cancel Transaction ID
     * as a TransactionID
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see TransactionID
     */
    public MarketIfTouchedOrderTransaction setCancellingTransactionID(TransactionID cancellingTransactionID) {
        this.cancellingTransactionID = cancellingTransactionID;
        return this;
    }
    /**
     * Set the Replaces Order Cancel Transaction ID
     * <p>
     * The ID of the Transaction that cancels the replaced Order (only provided
     * if this Order replaces an existing Order).
     * <p>
     * @param cancellingTransactionID the Replaces Order Cancel Transaction ID
     * as a String
     * @return {@link MarketIfTouchedOrderTransaction
     * MarketIfTouchedOrderTransaction}
     * @see TransactionID
     */
    public MarketIfTouchedOrderTransaction setCancellingTransactionID(String cancellingTransactionID) {
        this.cancellingTransactionID = new TransactionID(cancellingTransactionID);
        return this;
    }

    @Override
    public String toString() {
        return "MarketIfTouchedOrderTransaction(" +
            "id=" +
                (id == null ? "null" : id.toString()) + ", " +
            "time=" +
                (time == null ? "null" : time.toString()) + ", " +
            "userID=" +
                (userID == null ? "null" : userID.toString()) + ", " +
            "accountID=" +
                (accountID == null ? "null" : accountID.toString()) + ", " +
            "batchID=" +
                (batchID == null ? "null" : batchID.toString()) + ", " +
            "requestID=" +
                (requestID == null ? "null" : requestID.toString()) + ", " +
            "type=" +
                (type == null ? "null" : type.toString()) + ", " +
            "instrument=" +
                (instrument == null ? "null" : instrument.toString()) + ", " +
            "units=" +
                (units == null ? "null" : units.toString()) + ", " +
            "price=" +
                (price == null ? "null" : price.toString()) + ", " +
            "priceBound=" +
                (priceBound == null ? "null" : priceBound.toString()) + ", " +
            "timeInForce=" +
                (timeInForce == null ? "null" : timeInForce.toString()) + ", " +
            "gtdTime=" +
                (gtdTime == null ? "null" : gtdTime.toString()) + ", " +
            "positionFill=" +
                (positionFill == null ? "null" : positionFill.toString()) + ", " +
            "triggerCondition=" +
                (triggerCondition == null ? "null" : triggerCondition.toString()) + ", " +
            "reason=" +
                (reason == null ? "null" : reason.toString()) + ", " +
            "clientExtensions=" +
                (clientExtensions == null ? "null" : clientExtensions.toString()) + ", " +
            "takeProfitOnFill=" +
                (takeProfitOnFill == null ? "null" : takeProfitOnFill.toString()) + ", " +
            "stopLossOnFill=" +
                (stopLossOnFill == null ? "null" : stopLossOnFill.toString()) + ", " +
            "trailingStopLossOnFill=" +
                (trailingStopLossOnFill == null ? "null" : trailingStopLossOnFill.toString()) + ", " +
            "tradeClientExtensions=" +
                (tradeClientExtensions == null ? "null" : tradeClientExtensions.toString()) + ", " +
            "replacesOrderID=" +
                (replacesOrderID == null ? "null" : replacesOrderID.toString()) + ", " +
            "cancellingTransactionID=" +
                (cancellingTransactionID == null ? "null" : cancellingTransactionID.toString()) +
            ")";
    }
}
