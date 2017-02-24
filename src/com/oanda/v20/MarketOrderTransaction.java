package com.oanda.v20;

import com.oanda.v20.TransactionType;
import com.oanda.v20.TimeInForce;
import com.oanda.v20.OrderPositionFill;
import com.oanda.v20.MarketOrderReason;
import com.google.gson.annotations.SerializedName;

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

    @SerializedName("id") private TransactionID id;

    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see TransactionID
     */
    public MarketOrderTransaction setId(String id) {
        this.id = new TransactionID(id);
        return this;
    }

    /**
     * Get the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @return the Transaction ID
     * @see TransactionID
     */
    public String getId() {
        return this.id.getTransactionID();
    }

    @SerializedName("time") private DateTime time;

    /**
     * Set the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @param time the Time
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see DateTime
     */
    public MarketOrderTransaction setTime(String time) {
        this.time = new DateTime(time);
        return this;
    }

    /**
     * Get the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @return the Time
     * @see DateTime
     */
    public String getTime() {
        return this.time.getDateTime();
    }

    @SerializedName("userID") private Integer userID;

    /**
     * Set the User ID
     * <p>
     * The ID of the user that initiated the creation of the Transaction.
     * <p>
     * @param userID the User ID
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     */
    public MarketOrderTransaction setUserID(int userID) {
        this.userID = userID;
        return this;
    }

    /**
     * Get the User ID
     * <p>
     * The ID of the user that initiated the creation of the Transaction.
     * <p>
     * @return the User ID
     */
    public int getUserID() {
        return this.userID;
    }

    @SerializedName("accountID") private AccountID accountID;

    /**
     * Set the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @param accountID the Account ID
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see AccountID
     */
    public MarketOrderTransaction setAccountID(String accountID) {
        this.accountID = new AccountID(accountID);
        return this;
    }

    /**
     * Get the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @return the Account ID
     * @see AccountID
     */
    public String getAccountID() {
        return this.accountID.getAccountID();
    }

    @SerializedName("batchID") private TransactionID batchID;

    /**
     * Set the Transaction Batch ID
     * <p>
     * The ID of the "batch" that the Transaction belongs to. Transactions in
     * the same batch are applied to the Account simultaneously.
     * <p>
     * @param batchID the Transaction Batch ID
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see TransactionID
     */
    public MarketOrderTransaction setBatchID(String batchID) {
        this.batchID = new TransactionID(batchID);
        return this;
    }

    /**
     * Get the Transaction Batch ID
     * <p>
     * The ID of the "batch" that the Transaction belongs to. Transactions in
     * the same batch are applied to the Account simultaneously.
     * <p>
     * @return the Transaction Batch ID
     * @see TransactionID
     */
    public String getBatchID() {
        return this.batchID.getTransactionID();
    }

    @SerializedName("requestID") private RequestID requestID;

    /**
     * Set the Request ID
     * <p>
     * The Request ID of the Account Control Request which generated the
     * transaction (only provided for Transactions created by a Client request)
     * <p>
     * @param requestID the Request ID
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see RequestID
     */
    public MarketOrderTransaction setRequestID(String requestID) {
        this.requestID = new RequestID(requestID);
        return this;
    }

    /**
     * Get the Request ID
     * <p>
     * The Request ID of the Account Control Request which generated the
     * transaction (only provided for Transactions created by a Client request)
     * <p>
     * @return the Request ID
     * @see RequestID
     */
    public String getRequestID() {
        return this.requestID.getRequestID();
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

    @SerializedName("instrument") private InstrumentName instrument;

    /**
     * Set the Instrument
     * <p>
     * The Market Order's Instrument.
     * <p>
     * @param instrument the Instrument
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see InstrumentName
     */
    public MarketOrderTransaction setInstrument(String instrument) {
        this.instrument = new InstrumentName(instrument);
        return this;
    }

    /**
     * Get the Instrument
     * <p>
     * The Market Order's Instrument.
     * <p>
     * @return the Instrument
     * @see InstrumentName
     */
    public String getInstrument() {
        return this.instrument.getInstrumentName();
    }

    @SerializedName("units") private DecimalNumber units;

    /**
     * Set the Amount
     * <p>
     * The quantity requested to be filled by the Market Order. A posititive
     * number of units results in a long Order, and a negative number of units
     * results in a short Order.
     * <p>
     * @param units the Amount
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see DecimalNumber
     */
    public MarketOrderTransaction setUnits(double units) {
        this.units = new DecimalNumber(units);
        return this;
    }

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
    public double getUnits() {
        return this.units.getDecimalNumber();
    }

    @SerializedName("timeInForce") private TimeInForce timeInForce = TimeInForce.FOK;

    /**
     * Set the Time In Force
     * <p>
     * The time-in-force requested for the Market Order. Restricted to FOK or
     * IOC for a MarketOrder.
     * <p>
     * @param timeInForce the Time In Force
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see TimeInForce
     */
    public MarketOrderTransaction setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

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

    @SerializedName("priceBound") private PriceValue priceBound;

    /**
     * Set the Price Bound
     * <p>
     * The worst price that the client is willing to have the Market Order
     * filled at.
     * <p>
     * @param priceBound the Price Bound
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see PriceValue
     */
    public MarketOrderTransaction setPriceBound(double priceBound) {
        this.priceBound = new PriceValue(priceBound);
        return this;
    }

    /**
     * Get the Price Bound
     * <p>
     * The worst price that the client is willing to have the Market Order
     * filled at.
     * <p>
     * @return the Price Bound
     * @see PriceValue
     */
    public double getPriceBound() {
        return this.priceBound.getPriceValue();
    }

    @SerializedName("positionFill") private OrderPositionFill positionFill = OrderPositionFill.DEFAULT;

    /**
     * Set the Position Fill
     * <p>
     * Specification of how Positions in the Account are modified when the
     * Order is filled.
     * <p>
     * @param positionFill the Position Fill
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see OrderPositionFill
     */
    public MarketOrderTransaction setPositionFill(OrderPositionFill positionFill) {
        this.positionFill = positionFill;
        return this;
    }

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

    @SerializedName("tradeClose") private MarketOrderTradeClose tradeClose;

    /**
     * Set the Trade Close Details
     * <p>
     * Details of the Trade requested to be closed, only provided when the
     * Market Order is being used to explicitly close a Trade.
     * <p>
     * @param tradeClose the Trade Close Details
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see MarketOrderTradeClose
     */
    public MarketOrderTransaction setTradeClose(MarketOrderTradeClose tradeClose) {
        this.tradeClose = tradeClose;
        return this;
    }

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

    @SerializedName("longPositionCloseout") private MarketOrderPositionCloseout longPositionCloseout;

    /**
     * Set the Long Position Close Details
     * <p>
     * Details of the long Position requested to be closed out, only provided
     * when a Market Order is being used to explicitly closeout a long
     * Position.
     * <p>
     * @param longPositionCloseout the Long Position Close Details
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see MarketOrderPositionCloseout
     */
    public MarketOrderTransaction setLongPositionCloseout(MarketOrderPositionCloseout longPositionCloseout) {
        this.longPositionCloseout = longPositionCloseout;
        return this;
    }

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

    @SerializedName("shortPositionCloseout") private MarketOrderPositionCloseout shortPositionCloseout;

    /**
     * Set the Short Position Close Details
     * <p>
     * Details of the short Position requested to be closed out, only provided
     * when a Market Order is being used to explicitly closeout a short
     * Position.
     * <p>
     * @param shortPositionCloseout the Short Position Close Details
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see MarketOrderPositionCloseout
     */
    public MarketOrderTransaction setShortPositionCloseout(MarketOrderPositionCloseout shortPositionCloseout) {
        this.shortPositionCloseout = shortPositionCloseout;
        return this;
    }

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

    @SerializedName("marginCloseout") private MarketOrderMarginCloseout marginCloseout;

    /**
     * Set the Margin Closeout Details
     * <p>
     * Details of the Margin Closeout that this Market Order was created for
     * <p>
     * @param marginCloseout the Margin Closeout Details
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see MarketOrderMarginCloseout
     */
    public MarketOrderTransaction setMarginCloseout(MarketOrderMarginCloseout marginCloseout) {
        this.marginCloseout = marginCloseout;
        return this;
    }

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

    @SerializedName("delayedTradeClose") private MarketOrderDelayedTradeClose delayedTradeClose;

    /**
     * Set the Delayed Trade Close Details
     * <p>
     * Details of the delayed Trade close that this Market Order was created
     * for
     * <p>
     * @param delayedTradeClose the Delayed Trade Close Details
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see MarketOrderDelayedTradeClose
     */
    public MarketOrderTransaction setDelayedTradeClose(MarketOrderDelayedTradeClose delayedTradeClose) {
        this.delayedTradeClose = delayedTradeClose;
        return this;
    }

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

    @SerializedName("reason") private MarketOrderReason reason;

    /**
     * Set the Reason
     * <p>
     * The reason that the Market Order was created
     * <p>
     * @param reason the Reason
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see MarketOrderReason
     */
    public MarketOrderTransaction setReason(MarketOrderReason reason) {
        this.reason = reason;
        return this;
    }

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

    @SerializedName("clientExtensions") private ClientExtensions clientExtensions;

    /**
     * Set the Order Client Extensions
     * <p>
     * Client Extensions to add to the Order (only provided if the Order is
     * being created with client extensions).
     * <p>
     * @param clientExtensions the Order Client Extensions
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see ClientExtensions
     */
    public MarketOrderTransaction setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

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

    @SerializedName("takeProfitOnFill") private TakeProfitDetails takeProfitOnFill;

    /**
     * Set the Take Profit On Fill
     * <p>
     * The specification of the Take Profit Order that should be created for a
     * Trade opened when the Order is filled (if such a Trade is created).
     * <p>
     * @param takeProfitOnFill the Take Profit On Fill
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see TakeProfitDetails
     */
    public MarketOrderTransaction setTakeProfitOnFill(TakeProfitDetails takeProfitOnFill) {
        this.takeProfitOnFill = takeProfitOnFill;
        return this;
    }

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

    @SerializedName("stopLossOnFill") private StopLossDetails stopLossOnFill;

    /**
     * Set the Stop Loss On Fill
     * <p>
     * The specification of the Stop Loss Order that should be created for a
     * Trade opened when the Order is filled (if such a Trade is created).
     * <p>
     * @param stopLossOnFill the Stop Loss On Fill
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see StopLossDetails
     */
    public MarketOrderTransaction setStopLossOnFill(StopLossDetails stopLossOnFill) {
        this.stopLossOnFill = stopLossOnFill;
        return this;
    }

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

    @SerializedName("trailingStopLossOnFill") private TrailingStopLossDetails trailingStopLossOnFill;

    /**
     * Set the Trailing Stop Loss On Fill
     * <p>
     * The specification of the Trailing Stop Loss Order that should be created
     * for a Trade that is opened when the Order is filled (if such a Trade is
     * created).
     * <p>
     * @param trailingStopLossOnFill the Trailing Stop Loss On Fill
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see TrailingStopLossDetails
     */
    public MarketOrderTransaction setTrailingStopLossOnFill(TrailingStopLossDetails trailingStopLossOnFill) {
        this.trailingStopLossOnFill = trailingStopLossOnFill;
        return this;
    }

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

    @SerializedName("tradeClientExtensions") private ClientExtensions tradeClientExtensions;

    /**
     * Set the Trade Client Extensions
     * <p>
     * Client Extensions to add to the Trade created when the Order is filled
     * (if such a Trade is created).  Do not set, modify, delete
     * tradeClientExtensions if your account is associated with MT4.
     * <p>
     * @param tradeClientExtensions the Trade Client Extensions
     * @return {@link MarketOrderTransaction MarketOrderTransaction}
     * @see ClientExtensions
     */
    public MarketOrderTransaction setTradeClientExtensions(ClientExtensions tradeClientExtensions) {
        this.tradeClientExtensions = tradeClientExtensions;
        return this;
    }

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
}
