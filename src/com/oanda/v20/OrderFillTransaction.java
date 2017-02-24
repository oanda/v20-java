package com.oanda.v20;

import com.oanda.v20.TransactionType;
import com.oanda.v20.OrderFillReason;
import com.google.gson.annotations.SerializedName;

/**
 * An OrderFillTransaction represents the filling of an Order in the client's
 * Account.
 * <p>
 * Fill Order {orderID} ({reason}): {units} of {instrument} @ {price}
 */
public class OrderFillTransaction implements Transaction {

    @SerializedName("id") private TransactionID id;

    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see TransactionID
     */
    public OrderFillTransaction setId(String id) {
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
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see DateTime
     */
    public OrderFillTransaction setTime(String time) {
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
     * @return {@link OrderFillTransaction OrderFillTransaction}
     */
    public OrderFillTransaction setUserID(int userID) {
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
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountID
     */
    public OrderFillTransaction setAccountID(String accountID) {
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
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see TransactionID
     */
    public OrderFillTransaction setBatchID(String batchID) {
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
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see RequestID
     */
    public OrderFillTransaction setRequestID(String requestID) {
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

    @SerializedName("type") private TransactionType type = TransactionType.ORDER_FILL;

    /**
     * Get the Type
     * <p>
     * The Type of the Transaction. Always set to "ORDER_FILL" for an
     * OrderFillTransaction.
     * <p>
     * @return the Type
     * @see TransactionType
     */
    public TransactionType getType() {
        return this.type;
    }

    @SerializedName("orderID") private OrderID orderID;

    /**
     * Set the Filled Order ID
     * <p>
     * The ID of the Order filled.
     * <p>
     * @param orderID the Filled Order ID
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see OrderID
     */
    public OrderFillTransaction setOrderID(String orderID) {
        this.orderID = new OrderID(orderID);
        return this;
    }

    /**
     * Get the Filled Order ID
     * <p>
     * The ID of the Order filled.
     * <p>
     * @return the Filled Order ID
     * @see OrderID
     */
    public String getOrderID() {
        return this.orderID.getOrderID();
    }

    @SerializedName("clientOrderID") private ClientID clientOrderID;

    /**
     * Set the Filled Client Order ID
     * <p>
     * The client Order ID of the Order filled (only provided if the client has
     * assigned one).
     * <p>
     * @param clientOrderID the Filled Client Order ID
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see ClientID
     */
    public OrderFillTransaction setClientOrderID(String clientOrderID) {
        this.clientOrderID = new ClientID(clientOrderID);
        return this;
    }

    /**
     * Get the Filled Client Order ID
     * <p>
     * The client Order ID of the Order filled (only provided if the client has
     * assigned one).
     * <p>
     * @return the Filled Client Order ID
     * @see ClientID
     */
    public String getClientOrderID() {
        return this.clientOrderID.getClientID();
    }

    @SerializedName("instrument") private InstrumentName instrument;

    /**
     * Set the Fill Instrument
     * <p>
     * The name of the filled Order's instrument.
     * <p>
     * @param instrument the Fill Instrument
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see InstrumentName
     */
    public OrderFillTransaction setInstrument(String instrument) {
        this.instrument = new InstrumentName(instrument);
        return this;
    }

    /**
     * Get the Fill Instrument
     * <p>
     * The name of the filled Order's instrument.
     * <p>
     * @return the Fill Instrument
     * @see InstrumentName
     */
    public String getInstrument() {
        return this.instrument.getInstrumentName();
    }

    @SerializedName("units") private DecimalNumber units;

    /**
     * Set the Fill Units
     * <p>
     * The number of units filled by the Order.
     * <p>
     * @param units the Fill Units
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see DecimalNumber
     */
    public OrderFillTransaction setUnits(double units) {
        this.units = new DecimalNumber(units);
        return this;
    }

    /**
     * Get the Fill Units
     * <p>
     * The number of units filled by the Order.
     * <p>
     * @return the Fill Units
     * @see DecimalNumber
     */
    public double getUnits() {
        return this.units.getDecimalNumber();
    }

    @SerializedName("price") private PriceValue price;

    /**
     * Set the Fill Price
     * <p>
     * The average market price that the Order was filled at.
     * <p>
     * @param price the Fill Price
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see PriceValue
     */
    public OrderFillTransaction setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }

    /**
     * Get the Fill Price
     * <p>
     * The average market price that the Order was filled at.
     * <p>
     * @return the Fill Price
     * @see PriceValue
     */
    public double getPrice() {
        return this.price.getPriceValue();
    }

    @SerializedName("reason") private OrderFillReason reason;

    /**
     * Set the Fill Reason
     * <p>
     * The reason that an Order was filled
     * <p>
     * @param reason the Fill Reason
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see OrderFillReason
     */
    public OrderFillTransaction setReason(OrderFillReason reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the Fill Reason
     * <p>
     * The reason that an Order was filled
     * <p>
     * @return the Fill Reason
     * @see OrderFillReason
     */
    public OrderFillReason getReason() {
        return this.reason;
    }

    @SerializedName("pl") private AccountUnits pl;

    /**
     * Set the Profit/Loss
     * <p>
     * The profit or loss incurred when the Order was filled.
     * <p>
     * @param pl the Profit/Loss
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setPl(double pl) {
        this.pl = new AccountUnits(pl);
        return this;
    }

    /**
     * Get the Profit/Loss
     * <p>
     * The profit or loss incurred when the Order was filled.
     * <p>
     * @return the Profit/Loss
     * @see AccountUnits
     */
    public double getPl() {
        return this.pl.getAccountUnits();
    }

    @SerializedName("financing") private AccountUnits financing;

    /**
     * Set the Financing
     * <p>
     * The financing paid or collected when the Order was filled.
     * <p>
     * @param financing the Financing
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setFinancing(double financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }

    /**
     * Get the Financing
     * <p>
     * The financing paid or collected when the Order was filled.
     * <p>
     * @return the Financing
     * @see AccountUnits
     */
    public double getFinancing() {
        return this.financing.getAccountUnits();
    }

    @SerializedName("accountBalance") private AccountUnits accountBalance;

    /**
     * Set the Account Balance
     * <p>
     * The Account's balance after the Order was filled.
     * <p>
     * @param accountBalance the Account Balance
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setAccountBalance(double accountBalance) {
        this.accountBalance = new AccountUnits(accountBalance);
        return this;
    }

    /**
     * Get the Account Balance
     * <p>
     * The Account's balance after the Order was filled.
     * <p>
     * @return the Account Balance
     * @see AccountUnits
     */
    public double getAccountBalance() {
        return this.accountBalance.getAccountUnits();
    }

    @SerializedName("tradeOpened") private TradeOpen tradeOpened;

    /**
     * Set the Trade Opened
     * <p>
     * The Trade that was opened when the Order was filled (only provided if
     * filling the Order resulted in a new Trade).
     * <p>
     * @param tradeOpened the Trade Opened
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see TradeOpen
     */
    public OrderFillTransaction setTradeOpened(TradeOpen tradeOpened) {
        this.tradeOpened = tradeOpened;
        return this;
    }

    /**
     * Get the Trade Opened
     * <p>
     * The Trade that was opened when the Order was filled (only provided if
     * filling the Order resulted in a new Trade).
     * <p>
     * @return the Trade Opened
     * @see TradeOpen
     */
    public TradeOpen getTradeOpened() {
        return this.tradeOpened;
    }

    @SerializedName("tradesClosed") private TradeReduce[] tradesClosed;

    /**
     * Set the Trades Closed
     * <p>
     * The Trades that were closed when the Order was filled (only provided if
     * filling the Order resulted in a closing open Trades).
     * <p>
     * @param tradesClosed the Trades Closed
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see TradeReduce
     */
    public OrderFillTransaction setTradesClosed(TradeReduce[] tradesClosed) {
        this.tradesClosed = tradesClosed;
        return this;
    }

    /**
     * Get the Trades Closed
     * <p>
     * The Trades that were closed when the Order was filled (only provided if
     * filling the Order resulted in a closing open Trades).
     * <p>
     * @return the Trades Closed
     * @see TradeReduce
     */
    public TradeReduce[] getTradesClosed() {
        return this.tradesClosed;
    }

    @SerializedName("tradeReduced") private TradeReduce tradeReduced;

    /**
     * Set the Trade Reduced
     * <p>
     * The Trade that was reduced when the Order was filled (only provided if
     * filling the Order resulted in reducing an open Trade).
     * <p>
     * @param tradeReduced the Trade Reduced
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see TradeReduce
     */
    public OrderFillTransaction setTradeReduced(TradeReduce tradeReduced) {
        this.tradeReduced = tradeReduced;
        return this;
    }

    /**
     * Get the Trade Reduced
     * <p>
     * The Trade that was reduced when the Order was filled (only provided if
     * filling the Order resulted in reducing an open Trade).
     * <p>
     * @return the Trade Reduced
     * @see TradeReduce
     */
    public TradeReduce getTradeReduced() {
        return this.tradeReduced;
    }
}
