package com.oanda.v20.transaction;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.account.AccountID;
import com.oanda.v20.order.OrderPositionFill;
import com.oanda.v20.pricing_common.PriceValue;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.primitives.DecimalNumber;
import com.oanda.v20.primitives.InstrumentName;

/**
 * A FixedPriceOrderTransaction represents the creation of a Fixed Price Order
 * in the user's account. A Fixed Price Order is an Order that is filled
 * immediately at a specified price.
 * <p>
 * Create Fixed Price Order {id} ({reason}): {units} of {instrument}
 */
public class FixedPriceOrderTransaction implements Transaction {

    /**
     * Default constructor.
     */
    public FixedPriceOrderTransaction() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the FixedPriceOrderTransaction to copy
     */
    public FixedPriceOrderTransaction(FixedPriceOrderTransaction other) {
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
        this.positionFill = other.positionFill;
        this.tradeState = other.tradeState;
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
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see TransactionID
     */
    public FixedPriceOrderTransaction setId(TransactionID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID as a String
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see TransactionID
     */
    public FixedPriceOrderTransaction setId(String id) {
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
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see DateTime
     */
    public FixedPriceOrderTransaction setTime(DateTime time) {
        this.time = time;
        return this;
    }
    /**
     * Set the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @param time the Time as a String
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see DateTime
     */
    public FixedPriceOrderTransaction setTime(String time) {
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
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     */
    public FixedPriceOrderTransaction setUserID(Long userID) {
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
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see AccountID
     */
    public FixedPriceOrderTransaction setAccountID(AccountID accountID) {
        this.accountID = accountID;
        return this;
    }
    /**
     * Set the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @param accountID the Account ID as a String
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see AccountID
     */
    public FixedPriceOrderTransaction setAccountID(String accountID) {
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
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see TransactionID
     */
    public FixedPriceOrderTransaction setBatchID(TransactionID batchID) {
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
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see TransactionID
     */
    public FixedPriceOrderTransaction setBatchID(String batchID) {
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
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see RequestID
     */
    public FixedPriceOrderTransaction setRequestID(RequestID requestID) {
        this.requestID = requestID;
        return this;
    }
    /**
     * Set the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @param requestID the Request ID as a String
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see RequestID
     */
    public FixedPriceOrderTransaction setRequestID(String requestID) {
        this.requestID = new RequestID(requestID);
        return this;
    }

    @SerializedName("type") private TransactionType type = TransactionType.FIXED_PRICE_ORDER;

    /**
     * Get the Type
     * <p>
     * The Type of the Transaction. Always set to "FIXED_PRICE_ORDER" in a
     * FixedPriceOrderTransaction.
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
     * The Type of the Transaction. Always set to "FIXED_PRICE_ORDER" in a
     * FixedPriceOrderTransaction.
     * <p>
     * @param type the Type as a TransactionType
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see TransactionType
     */
    public FixedPriceOrderTransaction setType(TransactionType type) {
        this.type = type;
        return this;
    }

    @SerializedName("instrument") private InstrumentName instrument;

    /**
     * Get the Instrument
     * <p>
     * The Fixed Price Order's Instrument.
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
     * The Fixed Price Order's Instrument.
     * <p>
     * @param instrument the Instrument as an InstrumentName
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see InstrumentName
     */
    public FixedPriceOrderTransaction setInstrument(InstrumentName instrument) {
        this.instrument = instrument;
        return this;
    }
    /**
     * Set the Instrument
     * <p>
     * The Fixed Price Order's Instrument.
     * <p>
     * @param instrument the Instrument as a String
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see InstrumentName
     */
    public FixedPriceOrderTransaction setInstrument(String instrument) {
        this.instrument = new InstrumentName(instrument);
        return this;
    }

    @SerializedName("units") private DecimalNumber units;

    /**
     * Get the Amount
     * <p>
     * The quantity requested to be filled by the Fixed Price Order. A
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
     * The quantity requested to be filled by the Fixed Price Order. A
     * posititive number of units results in a long Order, and a negative
     * number of units results in a short Order.
     * <p>
     * @param units the Amount as a DecimalNumber
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see DecimalNumber
     */
    public FixedPriceOrderTransaction setUnits(DecimalNumber units) {
        this.units = units;
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the Fixed Price Order. A
     * posititive number of units results in a long Order, and a negative
     * number of units results in a short Order.
     * <p>
     * @param units the Amount as a String
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see DecimalNumber
     */
    public FixedPriceOrderTransaction setUnits(String units) {
        this.units = new DecimalNumber(units);
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the Fixed Price Order. A
     * posititive number of units results in a long Order, and a negative
     * number of units results in a short Order.
     * <p>
     * @param units the Amount as a double
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see DecimalNumber
     */
    public FixedPriceOrderTransaction setUnits(double units) {
        this.units = new DecimalNumber(units);
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the Fixed Price Order. A
     * posititive number of units results in a long Order, and a negative
     * number of units results in a short Order.
     * <p>
     * @param units the Amount as a BigDecimal
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see DecimalNumber
     */
    public FixedPriceOrderTransaction setUnits(BigDecimal units) {
        this.units = new DecimalNumber(units);
        return this;
    }

    @SerializedName("price") private PriceValue price;

    /**
     * Get the Price
     * <p>
     * The price specified for the Fixed Price Order. This price is the exact
     * price that the Fixed Price Order will be filled at.
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
     * The price specified for the Fixed Price Order. This price is the exact
     * price that the Fixed Price Order will be filled at.
     * <p>
     * @param price the Price as a PriceValue
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see PriceValue
     */
    public FixedPriceOrderTransaction setPrice(PriceValue price) {
        this.price = price;
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price specified for the Fixed Price Order. This price is the exact
     * price that the Fixed Price Order will be filled at.
     * <p>
     * @param price the Price as a String
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see PriceValue
     */
    public FixedPriceOrderTransaction setPrice(String price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price specified for the Fixed Price Order. This price is the exact
     * price that the Fixed Price Order will be filled at.
     * <p>
     * @param price the Price as a double
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see PriceValue
     */
    public FixedPriceOrderTransaction setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Price
     * <p>
     * The price specified for the Fixed Price Order. This price is the exact
     * price that the Fixed Price Order will be filled at.
     * <p>
     * @param price the Price as a BigDecimal
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see PriceValue
     */
    public FixedPriceOrderTransaction setPrice(BigDecimal price) {
        this.price = new PriceValue(price);
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
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see OrderPositionFill
     */
    public FixedPriceOrderTransaction setPositionFill(OrderPositionFill positionFill) {
        this.positionFill = positionFill;
        return this;
    }

    @SerializedName("tradeState") private String tradeState;

    /**
     * Get the TradeState
     * <p>
     * The state that the trade resulting from the Fixed Price Order should be
     * set to.
     * <p>
     * @return the TradeState
     */
    public String getTradeState() {
        return this.tradeState;
    }

    /**
     * Set the TradeState
     * <p>
     * The state that the trade resulting from the Fixed Price Order should be
     * set to.
     * <p>
     * @param tradeState the TradeState as a String
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     */
    public FixedPriceOrderTransaction setTradeState(String tradeState) {
        this.tradeState = tradeState;
        return this;
    }

    @SerializedName("reason") private FixedPriceOrderReason reason;

    /**
     * Get the Reason
     * <p>
     * The reason that the Fixed Price Order was created
     * <p>
     * @return the Reason
     * @see FixedPriceOrderReason
     */
    public FixedPriceOrderReason getReason() {
        return this.reason;
    }

    /**
     * Set the Reason
     * <p>
     * The reason that the Fixed Price Order was created
     * <p>
     * @param reason the Reason as a FixedPriceOrderReason
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see FixedPriceOrderReason
     */
    public FixedPriceOrderTransaction setReason(FixedPriceOrderReason reason) {
        this.reason = reason;
        return this;
    }

    @SerializedName("clientExtensions") private ClientExtensions clientExtensions;

    /**
     * Get the Client Extensions
     * <p>
     * The client extensions for the Fixed Price Order.
     * <p>
     * @return the Client Extensions
     * @see ClientExtensions
     */
    public ClientExtensions getClientExtensions() {
        return this.clientExtensions;
    }

    /**
     * Set the Client Extensions
     * <p>
     * The client extensions for the Fixed Price Order.
     * <p>
     * @param clientExtensions the Client Extensions as a ClientExtensions
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see ClientExtensions
     */
    public FixedPriceOrderTransaction setClientExtensions(ClientExtensions clientExtensions) {
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
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see TakeProfitDetails
     */
    public FixedPriceOrderTransaction setTakeProfitOnFill(TakeProfitDetails takeProfitOnFill) {
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
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see StopLossDetails
     */
    public FixedPriceOrderTransaction setStopLossOnFill(StopLossDetails stopLossOnFill) {
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
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see TrailingStopLossDetails
     */
    public FixedPriceOrderTransaction setTrailingStopLossOnFill(TrailingStopLossDetails trailingStopLossOnFill) {
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
     * @return {@link FixedPriceOrderTransaction FixedPriceOrderTransaction}
     * @see ClientExtensions
     */
    public FixedPriceOrderTransaction setTradeClientExtensions(ClientExtensions tradeClientExtensions) {
        this.tradeClientExtensions = tradeClientExtensions;
        return this;
    }

    @Override
    public String toString() {
        return "FixedPriceOrderTransaction(" +
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
            "positionFill=" +
                (positionFill == null ? "null" : positionFill.toString()) + ", " +
            "tradeState=" +
                (tradeState == null ? "null" : tradeState.toString()) + ", " +
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
