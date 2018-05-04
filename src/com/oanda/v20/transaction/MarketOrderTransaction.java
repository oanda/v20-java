package com.oanda.v20.transaction;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.account.AccountID;
import com.oanda.v20.order.OrderPositionFill;
import com.oanda.v20.order.TimeInForce;
import com.oanda.v20.pricing_common.PriceValue;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.primitives.DecimalNumber;
import com.oanda.v20.primitives.InstrumentName;

/**
 * A MarketOrderTransaction represents the creation of a Market Order in the
 * user's account. A Market Order is an Order that is filled immediately at the
 * current market price. Market Orders can be specialized when they are created
 * to accomplish a specific task: to close a Trade, to closeout a Position or
 * to particiate in in a Margin closeout.
 * <p>
 * Create Market Order {id} ({reason}): {units} of {instrument}
 */
public class MarketOrderTransaction implements Transaction {

    /**
     * Default constructor.
     */
    public MarketOrderTransaction() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the MarketOrderTransaction to copy
     */
    public MarketOrderTransaction(MarketOrderTransaction other) {
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
        this.timeInForce = other.timeInForce;
        this.priceBound = other.priceBound;
        this.positionFill = other.positionFill;
        if (other.tradeClose != null)
        {
            this.tradeClose = new MarketOrderTradeClose(other.tradeClose);
        }
        if (other.longPositionCloseout != null)
        {
            this.longPositionCloseout = new MarketOrderPositionCloseout(other.longPositionCloseout);
        }
        if (other.shortPositionCloseout != null)
        {
            this.shortPositionCloseout = new MarketOrderPositionCloseout(other.shortPositionCloseout);
        }
        if (other.marginCloseout != null)
        {
            this.marginCloseout = new MarketOrderMarginCloseout(other.marginCloseout);
        }
        if (other.delayedTradeClose != null)
        {
            this.delayedTradeClose = new MarketOrderDelayedTradeClose(other.delayedTradeClose);
        }
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
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see TransactionID
     */
    public MarketOrderTransaction setId(TransactionID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID as a String
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see TransactionID
     */
    public MarketOrderTransaction setId(String id) {
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
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see DateTime
     */
    public MarketOrderTransaction setTime(DateTime time) {
        this.time = time;
        return this;
    }
    /**
     * Set the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @param time the Time as a String
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see DateTime
     */
    public MarketOrderTransaction setTime(String time) {
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
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     */
    public MarketOrderTransaction setUserID(Long userID) {
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
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see AccountID
     */
    public MarketOrderTransaction setAccountID(AccountID accountID) {
        this.accountID = accountID;
        return this;
    }
    /**
     * Set the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @param accountID the Account ID as a String
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see AccountID
     */
    public MarketOrderTransaction setAccountID(String accountID) {
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
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see TransactionID
     */
    public MarketOrderTransaction setBatchID(TransactionID batchID) {
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
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see TransactionID
     */
    public MarketOrderTransaction setBatchID(String batchID) {
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
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see RequestID
     */
    public MarketOrderTransaction setRequestID(RequestID requestID) {
        this.requestID = requestID;
        return this;
    }
    /**
     * Set the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @param requestID the Request ID as a String
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see RequestID
     */
    public MarketOrderTransaction setRequestID(String requestID) {
        this.requestID = new RequestID(requestID);
        return this;
    }

    @SerializedName("type") private TransactionType type = TransactionType.MARKET_ORDER;

    /**
     * Get the Type
     * <p>
     * The Type of the Transaction. Always set to "MARKET_ORDER" in a
     * MarketOrderTransaction.
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
     * The Type of the Transaction. Always set to "MARKET_ORDER" in a
     * MarketOrderTransaction.
     * <p>
     * @param type the Type as a TransactionType
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see TransactionType
     */
    public MarketOrderTransaction setType(TransactionType type) {
        this.type = type;
        return this;
    }

    @SerializedName("instrument") private InstrumentName instrument;

    /**
     * Get the Instrument
     * <p>
     * The Market Order's Instrument.
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
     * The Market Order's Instrument.
     * <p>
     * @param instrument the Instrument as an InstrumentName
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see InstrumentName
     */
    public MarketOrderTransaction setInstrument(InstrumentName instrument) {
        this.instrument = instrument;
        return this;
    }
    /**
     * Set the Instrument
     * <p>
     * The Market Order's Instrument.
     * <p>
     * @param instrument the Instrument as a String
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see InstrumentName
     */
    public MarketOrderTransaction setInstrument(String instrument) {
        this.instrument = new InstrumentName(instrument);
        return this;
    }

    @SerializedName("units") private DecimalNumber units;

    /**
     * Get the Amount
     * <p>
     * The quantity requested to be filled by the Market Order. A posititive
     * number of units results in a long Order, and a negative number of units
     * results in a short Order.
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
     * The quantity requested to be filled by the Market Order. A posititive
     * number of units results in a long Order, and a negative number of units
     * results in a short Order.
     * <p>
     * @param units the Amount as a DecimalNumber
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see DecimalNumber
     */
    public MarketOrderTransaction setUnits(DecimalNumber units) {
        this.units = units;
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the Market Order. A posititive
     * number of units results in a long Order, and a negative number of units
     * results in a short Order.
     * <p>
     * @param units the Amount as a String
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see DecimalNumber
     */
    public MarketOrderTransaction setUnits(String units) {
        this.units = new DecimalNumber(units);
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the Market Order. A posititive
     * number of units results in a long Order, and a negative number of units
     * results in a short Order.
     * <p>
     * @param units the Amount as a double
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see DecimalNumber
     */
    public MarketOrderTransaction setUnits(double units) {
        this.units = new DecimalNumber(units);
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the Market Order. A posititive
     * number of units results in a long Order, and a negative number of units
     * results in a short Order.
     * <p>
     * @param units the Amount as a BigDecimal
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see DecimalNumber
     */
    public MarketOrderTransaction setUnits(BigDecimal units) {
        this.units = new DecimalNumber(units);
        return this;
    }

    @SerializedName("timeInForce") private TimeInForce timeInForce = TimeInForce.FOK;

    /**
     * Get the Time In Force
     * <p>
     * The time-in-force requested for the Market Order. Restricted to FOK or
     * IOC for a MarketOrder.
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
     * The time-in-force requested for the Market Order. Restricted to FOK or
     * IOC for a MarketOrder.
     * <p>
     * @param timeInForce the Time In Force as a TimeInForce
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see TimeInForce
     */
    public MarketOrderTransaction setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

    @SerializedName("priceBound") private PriceValue priceBound;

    /**
     * Get the Price Bound
     * <p>
     * The worst price that the client is willing to have the Market Order
     * filled at.
     * <p>
     * @return the Price Bound
     * @see PriceValue
     */
    public PriceValue getPriceBound() {
        return this.priceBound;
    }

    /**
     * Set the Price Bound
     * <p>
     * The worst price that the client is willing to have the Market Order
     * filled at.
     * <p>
     * @param priceBound the Price Bound as a PriceValue
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see PriceValue
     */
    public MarketOrderTransaction setPriceBound(PriceValue priceBound) {
        this.priceBound = priceBound;
        return this;
    }
    /**
     * Set the Price Bound
     * <p>
     * The worst price that the client is willing to have the Market Order
     * filled at.
     * <p>
     * @param priceBound the Price Bound as a String
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see PriceValue
     */
    public MarketOrderTransaction setPriceBound(String priceBound) {
        this.priceBound = new PriceValue(priceBound);
        return this;
    }
    /**
     * Set the Price Bound
     * <p>
     * The worst price that the client is willing to have the Market Order
     * filled at.
     * <p>
     * @param priceBound the Price Bound as a double
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see PriceValue
     */
    public MarketOrderTransaction setPriceBound(double priceBound) {
        this.priceBound = new PriceValue(priceBound);
        return this;
    }
    /**
     * Set the Price Bound
     * <p>
     * The worst price that the client is willing to have the Market Order
     * filled at.
     * <p>
     * @param priceBound the Price Bound as a BigDecimal
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see PriceValue
     */
    public MarketOrderTransaction setPriceBound(BigDecimal priceBound) {
        this.priceBound = new PriceValue(priceBound);
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
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see OrderPositionFill
     */
    public MarketOrderTransaction setPositionFill(OrderPositionFill positionFill) {
        this.positionFill = positionFill;
        return this;
    }

    @SerializedName("tradeClose") private MarketOrderTradeClose tradeClose;

    /**
     * Get the Trade Close Details
     * <p>
     * Details of the Trade requested to be closed, only provided when the
     * Market Order is being used to explicitly close a Trade.
     * <p>
     * @return the Trade Close Details
     * @see MarketOrderTradeClose
     */
    public MarketOrderTradeClose getTradeClose() {
        return this.tradeClose;
    }

    /**
     * Set the Trade Close Details
     * <p>
     * Details of the Trade requested to be closed, only provided when the
     * Market Order is being used to explicitly close a Trade.
     * <p>
     * @param tradeClose the Trade Close Details as a MarketOrderTradeClose
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see MarketOrderTradeClose
     */
    public MarketOrderTransaction setTradeClose(MarketOrderTradeClose tradeClose) {
        this.tradeClose = tradeClose;
        return this;
    }

    @SerializedName("longPositionCloseout") private MarketOrderPositionCloseout longPositionCloseout;

    /**
     * Get the Long Position Close Details
     * <p>
     * Details of the long Position requested to be closed out, only provided
     * when a Market Order is being used to explicitly closeout a long
     * Position.
     * <p>
     * @return the Long Position Close Details
     * @see MarketOrderPositionCloseout
     */
    public MarketOrderPositionCloseout getLongPositionCloseout() {
        return this.longPositionCloseout;
    }

    /**
     * Set the Long Position Close Details
     * <p>
     * Details of the long Position requested to be closed out, only provided
     * when a Market Order is being used to explicitly closeout a long
     * Position.
     * <p>
     * @param longPositionCloseout the Long Position Close Details as a
     * MarketOrderPositionCloseout
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see MarketOrderPositionCloseout
     */
    public MarketOrderTransaction setLongPositionCloseout(MarketOrderPositionCloseout longPositionCloseout) {
        this.longPositionCloseout = longPositionCloseout;
        return this;
    }

    @SerializedName("shortPositionCloseout") private MarketOrderPositionCloseout shortPositionCloseout;

    /**
     * Get the Short Position Close Details
     * <p>
     * Details of the short Position requested to be closed out, only provided
     * when a Market Order is being used to explicitly closeout a short
     * Position.
     * <p>
     * @return the Short Position Close Details
     * @see MarketOrderPositionCloseout
     */
    public MarketOrderPositionCloseout getShortPositionCloseout() {
        return this.shortPositionCloseout;
    }

    /**
     * Set the Short Position Close Details
     * <p>
     * Details of the short Position requested to be closed out, only provided
     * when a Market Order is being used to explicitly closeout a short
     * Position.
     * <p>
     * @param shortPositionCloseout the Short Position Close Details as a
     * MarketOrderPositionCloseout
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see MarketOrderPositionCloseout
     */
    public MarketOrderTransaction setShortPositionCloseout(MarketOrderPositionCloseout shortPositionCloseout) {
        this.shortPositionCloseout = shortPositionCloseout;
        return this;
    }

    @SerializedName("marginCloseout") private MarketOrderMarginCloseout marginCloseout;

    /**
     * Get the Margin Closeout Details
     * <p>
     * Details of the Margin Closeout that this Market Order was created for
     * <p>
     * @return the Margin Closeout Details
     * @see MarketOrderMarginCloseout
     */
    public MarketOrderMarginCloseout getMarginCloseout() {
        return this.marginCloseout;
    }

    /**
     * Set the Margin Closeout Details
     * <p>
     * Details of the Margin Closeout that this Market Order was created for
     * <p>
     * @param marginCloseout the Margin Closeout Details as a
     * MarketOrderMarginCloseout
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see MarketOrderMarginCloseout
     */
    public MarketOrderTransaction setMarginCloseout(MarketOrderMarginCloseout marginCloseout) {
        this.marginCloseout = marginCloseout;
        return this;
    }

    @SerializedName("delayedTradeClose") private MarketOrderDelayedTradeClose delayedTradeClose;

    /**
     * Get the Delayed Trade Close Details
     * <p>
     * Details of the delayed Trade close that this Market Order was created
     * for
     * <p>
     * @return the Delayed Trade Close Details
     * @see MarketOrderDelayedTradeClose
     */
    public MarketOrderDelayedTradeClose getDelayedTradeClose() {
        return this.delayedTradeClose;
    }

    /**
     * Set the Delayed Trade Close Details
     * <p>
     * Details of the delayed Trade close that this Market Order was created
     * for
     * <p>
     * @param delayedTradeClose the Delayed Trade Close Details as a
     * MarketOrderDelayedTradeClose
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see MarketOrderDelayedTradeClose
     */
    public MarketOrderTransaction setDelayedTradeClose(MarketOrderDelayedTradeClose delayedTradeClose) {
        this.delayedTradeClose = delayedTradeClose;
        return this;
    }

    @SerializedName("reason") private MarketOrderReason reason;

    /**
     * Get the Reason
     * <p>
     * The reason that the Market Order was created
     * <p>
     * @return the Reason
     * @see MarketOrderReason
     */
    public MarketOrderReason getReason() {
        return this.reason;
    }

    /**
     * Set the Reason
     * <p>
     * The reason that the Market Order was created
     * <p>
     * @param reason the Reason as a MarketOrderReason
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see MarketOrderReason
     */
    public MarketOrderTransaction setReason(MarketOrderReason reason) {
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
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see ClientExtensions
     */
    public MarketOrderTransaction setClientExtensions(ClientExtensions clientExtensions) {
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
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see TakeProfitDetails
     */
    public MarketOrderTransaction setTakeProfitOnFill(TakeProfitDetails takeProfitOnFill) {
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
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see StopLossDetails
     */
    public MarketOrderTransaction setStopLossOnFill(StopLossDetails stopLossOnFill) {
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
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see TrailingStopLossDetails
     */
    public MarketOrderTransaction setTrailingStopLossOnFill(TrailingStopLossDetails trailingStopLossOnFill) {
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
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see ClientExtensions
     */
    public MarketOrderTransaction setTradeClientExtensions(ClientExtensions tradeClientExtensions) {
        this.tradeClientExtensions = tradeClientExtensions;
        return this;
    }

    @Override
    public String toString() {
        return "MarketOrderTransaction(" +
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
            "timeInForce=" +
                (timeInForce == null ? "null" : timeInForce.toString()) + ", " +
            "priceBound=" +
                (priceBound == null ? "null" : priceBound.toString()) + ", " +
            "positionFill=" +
                (positionFill == null ? "null" : positionFill.toString()) + ", " +
            "tradeClose=" +
                (tradeClose == null ? "null" : tradeClose.toString()) + ", " +
            "longPositionCloseout=" +
                (longPositionCloseout == null ? "null" : longPositionCloseout.toString()) + ", " +
            "shortPositionCloseout=" +
                (shortPositionCloseout == null ? "null" : shortPositionCloseout.toString()) + ", " +
            "marginCloseout=" +
                (marginCloseout == null ? "null" : marginCloseout.toString()) + ", " +
            "delayedTradeClose=" +
                (delayedTradeClose == null ? "null" : delayedTradeClose.toString()) + ", " +
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
                (tradeClientExtensions == null ? "null" : tradeClientExtensions.toString()) +
            ")";
    }
}
