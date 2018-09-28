package com.oanda.v20.transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.account.AccountID;
import com.oanda.v20.order.OrderID;
import com.oanda.v20.pricing.ClientPrice;
import com.oanda.v20.pricing_common.PriceValue;
import com.oanda.v20.primitives.AccountUnits;
import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.primitives.DecimalNumber;
import com.oanda.v20.primitives.InstrumentName;

/**
 * An OrderFillTransaction represents the filling of an Order in the client's
 * Account.
 * <p>
 * Fill Order {orderID} ({reason}): {units} of {instrument} @ {price}
 */
public class OrderFillTransaction implements Transaction {

    /**
     * Default constructor.
     */
    public OrderFillTransaction() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the OrderFillTransaction to copy
     */
    public OrderFillTransaction(OrderFillTransaction other) {
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
        this.orderID = other.orderID;
        this.clientOrderID = other.clientOrderID;
        this.instrument = other.instrument;
        this.units = other.units;
        this.gainQuoteHomeConversionFactor = other.gainQuoteHomeConversionFactor;
        this.lossQuoteHomeConversionFactor = other.lossQuoteHomeConversionFactor;
        this.price = other.price;
        this.fullVWAP = other.fullVWAP;
        if (other.fullPrice != null)
        {
            this.fullPrice = new ClientPrice(other.fullPrice);
        }
        this.reason = other.reason;
        this.pl = other.pl;
        this.financing = other.financing;
        this.commission = other.commission;
        this.guaranteedExecutionFee = other.guaranteedExecutionFee;
        this.accountBalance = other.accountBalance;
        if (other.tradeOpened != null)
        {
            this.tradeOpened = new TradeOpen(other.tradeOpened);
        }
        if (other.tradesClosed != null)
        {
            this.tradesClosed = new ArrayList<TradeReduce>(other.tradesClosed);
        }
        if (other.tradeReduced != null)
        {
            this.tradeReduced = new TradeReduce(other.tradeReduced);
        }
        this.halfSpreadCost = other.halfSpreadCost;
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
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see TransactionID
     */
    public OrderFillTransaction setId(TransactionID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Transaction ID
     * <p>
     * The Transaction's Identifier.
     * <p>
     * @param id the Transaction ID as a String
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see TransactionID
     */
    public OrderFillTransaction setId(String id) {
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
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see DateTime
     */
    public OrderFillTransaction setTime(DateTime time) {
        this.time = time;
        return this;
    }
    /**
     * Set the Time
     * <p>
     * The date/time when the Transaction was created.
     * <p>
     * @param time the Time as a String
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see DateTime
     */
    public OrderFillTransaction setTime(String time) {
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
     * @return {@link OrderFillTransaction OrderFillTransaction}
     */
    public OrderFillTransaction setUserID(Long userID) {
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
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountID
     */
    public OrderFillTransaction setAccountID(AccountID accountID) {
        this.accountID = accountID;
        return this;
    }
    /**
     * Set the Account ID
     * <p>
     * The ID of the Account the Transaction was created for.
     * <p>
     * @param accountID the Account ID as a String
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountID
     */
    public OrderFillTransaction setAccountID(String accountID) {
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
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see TransactionID
     */
    public OrderFillTransaction setBatchID(TransactionID batchID) {
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
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see TransactionID
     */
    public OrderFillTransaction setBatchID(String batchID) {
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
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see RequestID
     */
    public OrderFillTransaction setRequestID(RequestID requestID) {
        this.requestID = requestID;
        return this;
    }
    /**
     * Set the Request ID
     * <p>
     * The Request ID of the request which generated the transaction.
     * <p>
     * @param requestID the Request ID as a String
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see RequestID
     */
    public OrderFillTransaction setRequestID(String requestID) {
        this.requestID = new RequestID(requestID);
        return this;
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

    /**
     * Set the Type
     * <p>
     * The Type of the Transaction. Always set to "ORDER_FILL" for an
     * OrderFillTransaction.
     * <p>
     * @param type the Type as a TransactionType
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see TransactionType
     */
    public OrderFillTransaction setType(TransactionType type) {
        this.type = type;
        return this;
    }

    @SerializedName("orderID") private OrderID orderID;

    /**
     * Get the Filled Order ID
     * <p>
     * The ID of the Order filled.
     * <p>
     * @return the Filled Order ID
     * @see OrderID
     */
    public OrderID getOrderID() {
        return this.orderID;
    }

    /**
     * Set the Filled Order ID
     * <p>
     * The ID of the Order filled.
     * <p>
     * @param orderID the Filled Order ID as an OrderID
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see OrderID
     */
    public OrderFillTransaction setOrderID(OrderID orderID) {
        this.orderID = orderID;
        return this;
    }
    /**
     * Set the Filled Order ID
     * <p>
     * The ID of the Order filled.
     * <p>
     * @param orderID the Filled Order ID as a String
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see OrderID
     */
    public OrderFillTransaction setOrderID(String orderID) {
        this.orderID = new OrderID(orderID);
        return this;
    }

    @SerializedName("clientOrderID") private ClientID clientOrderID;

    /**
     * Get the Filled Client Order ID
     * <p>
     * The client Order ID of the Order filled (only provided if the client has
     * assigned one).
     * <p>
     * @return the Filled Client Order ID
     * @see ClientID
     */
    public ClientID getClientOrderID() {
        return this.clientOrderID;
    }

    /**
     * Set the Filled Client Order ID
     * <p>
     * The client Order ID of the Order filled (only provided if the client has
     * assigned one).
     * <p>
     * @param clientOrderID the Filled Client Order ID as a ClientID
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see ClientID
     */
    public OrderFillTransaction setClientOrderID(ClientID clientOrderID) {
        this.clientOrderID = clientOrderID;
        return this;
    }
    /**
     * Set the Filled Client Order ID
     * <p>
     * The client Order ID of the Order filled (only provided if the client has
     * assigned one).
     * <p>
     * @param clientOrderID the Filled Client Order ID as a String
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see ClientID
     */
    public OrderFillTransaction setClientOrderID(String clientOrderID) {
        this.clientOrderID = new ClientID(clientOrderID);
        return this;
    }

    @SerializedName("instrument") private InstrumentName instrument;

    /**
     * Get the Fill Instrument
     * <p>
     * The name of the filled Order's instrument.
     * <p>
     * @return the Fill Instrument
     * @see InstrumentName
     */
    public InstrumentName getInstrument() {
        return this.instrument;
    }

    /**
     * Set the Fill Instrument
     * <p>
     * The name of the filled Order's instrument.
     * <p>
     * @param instrument the Fill Instrument as an InstrumentName
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see InstrumentName
     */
    public OrderFillTransaction setInstrument(InstrumentName instrument) {
        this.instrument = instrument;
        return this;
    }
    /**
     * Set the Fill Instrument
     * <p>
     * The name of the filled Order's instrument.
     * <p>
     * @param instrument the Fill Instrument as a String
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see InstrumentName
     */
    public OrderFillTransaction setInstrument(String instrument) {
        this.instrument = new InstrumentName(instrument);
        return this;
    }

    @SerializedName("units") private DecimalNumber units;

    /**
     * Get the Fill Units
     * <p>
     * The number of units filled by the OrderFill.
     * <p>
     * @return the Fill Units
     * @see DecimalNumber
     */
    public DecimalNumber getUnits() {
        return this.units;
    }

    /**
     * Set the Fill Units
     * <p>
     * The number of units filled by the OrderFill.
     * <p>
     * @param units the Fill Units as a DecimalNumber
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see DecimalNumber
     */
    public OrderFillTransaction setUnits(DecimalNumber units) {
        this.units = units;
        return this;
    }
    /**
     * Set the Fill Units
     * <p>
     * The number of units filled by the OrderFill.
     * <p>
     * @param units the Fill Units as a String
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see DecimalNumber
     */
    public OrderFillTransaction setUnits(String units) {
        this.units = new DecimalNumber(units);
        return this;
    }
    /**
     * Set the Fill Units
     * <p>
     * The number of units filled by the OrderFill.
     * <p>
     * @param units the Fill Units as a double
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see DecimalNumber
     */
    public OrderFillTransaction setUnits(double units) {
        this.units = new DecimalNumber(units);
        return this;
    }
    /**
     * Set the Fill Units
     * <p>
     * The number of units filled by the OrderFill.
     * <p>
     * @param units the Fill Units as a BigDecimal
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see DecimalNumber
     */
    public OrderFillTransaction setUnits(BigDecimal units) {
        this.units = new DecimalNumber(units);
        return this;
    }

    @SerializedName("gainQuoteHomeConversionFactor") private DecimalNumber gainQuoteHomeConversionFactor;

    /**
     * Get the Gain Quote Home Conversion Factor
     * <p>
     * This is the conversion factor in effect for the Account at the time of
     * the OrderFill for converting any gains realized in Instrument quote
     * units into units of the Account's home currency.
     * <p>
     * @return the Gain Quote Home Conversion Factor
     * @see DecimalNumber
     */
    public DecimalNumber getGainQuoteHomeConversionFactor() {
        return this.gainQuoteHomeConversionFactor;
    }

    /**
     * Set the Gain Quote Home Conversion Factor
     * <p>
     * This is the conversion factor in effect for the Account at the time of
     * the OrderFill for converting any gains realized in Instrument quote
     * units into units of the Account's home currency.
     * <p>
     * @param gainQuoteHomeConversionFactor the Gain Quote Home Conversion
     * Factor as a DecimalNumber
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see DecimalNumber
     */
    public OrderFillTransaction setGainQuoteHomeConversionFactor(DecimalNumber gainQuoteHomeConversionFactor) {
        this.gainQuoteHomeConversionFactor = gainQuoteHomeConversionFactor;
        return this;
    }
    /**
     * Set the Gain Quote Home Conversion Factor
     * <p>
     * This is the conversion factor in effect for the Account at the time of
     * the OrderFill for converting any gains realized in Instrument quote
     * units into units of the Account's home currency.
     * <p>
     * @param gainQuoteHomeConversionFactor the Gain Quote Home Conversion
     * Factor as a String
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see DecimalNumber
     */
    public OrderFillTransaction setGainQuoteHomeConversionFactor(String gainQuoteHomeConversionFactor) {
        this.gainQuoteHomeConversionFactor = new DecimalNumber(gainQuoteHomeConversionFactor);
        return this;
    }
    /**
     * Set the Gain Quote Home Conversion Factor
     * <p>
     * This is the conversion factor in effect for the Account at the time of
     * the OrderFill for converting any gains realized in Instrument quote
     * units into units of the Account's home currency.
     * <p>
     * @param gainQuoteHomeConversionFactor the Gain Quote Home Conversion
     * Factor as a double
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see DecimalNumber
     */
    public OrderFillTransaction setGainQuoteHomeConversionFactor(double gainQuoteHomeConversionFactor) {
        this.gainQuoteHomeConversionFactor = new DecimalNumber(gainQuoteHomeConversionFactor);
        return this;
    }
    /**
     * Set the Gain Quote Home Conversion Factor
     * <p>
     * This is the conversion factor in effect for the Account at the time of
     * the OrderFill for converting any gains realized in Instrument quote
     * units into units of the Account's home currency.
     * <p>
     * @param gainQuoteHomeConversionFactor the Gain Quote Home Conversion
     * Factor as a BigDecimal
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see DecimalNumber
     */
    public OrderFillTransaction setGainQuoteHomeConversionFactor(BigDecimal gainQuoteHomeConversionFactor) {
        this.gainQuoteHomeConversionFactor = new DecimalNumber(gainQuoteHomeConversionFactor);
        return this;
    }

    @SerializedName("lossQuoteHomeConversionFactor") private DecimalNumber lossQuoteHomeConversionFactor;

    /**
     * Get the Loss Quote Home Conversion Factor
     * <p>
     * This is the conversion factor in effect for the Account at the time of
     * the OrderFill for converting any losses realized in Instrument quote
     * units into units of the Account's home currency.
     * <p>
     * @return the Loss Quote Home Conversion Factor
     * @see DecimalNumber
     */
    public DecimalNumber getLossQuoteHomeConversionFactor() {
        return this.lossQuoteHomeConversionFactor;
    }

    /**
     * Set the Loss Quote Home Conversion Factor
     * <p>
     * This is the conversion factor in effect for the Account at the time of
     * the OrderFill for converting any losses realized in Instrument quote
     * units into units of the Account's home currency.
     * <p>
     * @param lossQuoteHomeConversionFactor the Loss Quote Home Conversion
     * Factor as a DecimalNumber
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see DecimalNumber
     */
    public OrderFillTransaction setLossQuoteHomeConversionFactor(DecimalNumber lossQuoteHomeConversionFactor) {
        this.lossQuoteHomeConversionFactor = lossQuoteHomeConversionFactor;
        return this;
    }
    /**
     * Set the Loss Quote Home Conversion Factor
     * <p>
     * This is the conversion factor in effect for the Account at the time of
     * the OrderFill for converting any losses realized in Instrument quote
     * units into units of the Account's home currency.
     * <p>
     * @param lossQuoteHomeConversionFactor the Loss Quote Home Conversion
     * Factor as a String
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see DecimalNumber
     */
    public OrderFillTransaction setLossQuoteHomeConversionFactor(String lossQuoteHomeConversionFactor) {
        this.lossQuoteHomeConversionFactor = new DecimalNumber(lossQuoteHomeConversionFactor);
        return this;
    }
    /**
     * Set the Loss Quote Home Conversion Factor
     * <p>
     * This is the conversion factor in effect for the Account at the time of
     * the OrderFill for converting any losses realized in Instrument quote
     * units into units of the Account's home currency.
     * <p>
     * @param lossQuoteHomeConversionFactor the Loss Quote Home Conversion
     * Factor as a double
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see DecimalNumber
     */
    public OrderFillTransaction setLossQuoteHomeConversionFactor(double lossQuoteHomeConversionFactor) {
        this.lossQuoteHomeConversionFactor = new DecimalNumber(lossQuoteHomeConversionFactor);
        return this;
    }
    /**
     * Set the Loss Quote Home Conversion Factor
     * <p>
     * This is the conversion factor in effect for the Account at the time of
     * the OrderFill for converting any losses realized in Instrument quote
     * units into units of the Account's home currency.
     * <p>
     * @param lossQuoteHomeConversionFactor the Loss Quote Home Conversion
     * Factor as a BigDecimal
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see DecimalNumber
     */
    public OrderFillTransaction setLossQuoteHomeConversionFactor(BigDecimal lossQuoteHomeConversionFactor) {
        this.lossQuoteHomeConversionFactor = new DecimalNumber(lossQuoteHomeConversionFactor);
        return this;
    }

    @SerializedName("price") private PriceValue price;

    /**
     * Get the Fill Price
     * <p>
     * This field is now deprecated and should no longer be used. The
     * individual tradesClosed, tradeReduced and tradeOpened fields contain the
     * exact/official price each unit was filled at.
     * <p>
     * @return the Fill Price
     * @see PriceValue
     */
    public PriceValue getPrice() {
        return this.price;
    }

    /**
     * Set the Fill Price
     * <p>
     * This field is now deprecated and should no longer be used. The
     * individual tradesClosed, tradeReduced and tradeOpened fields contain the
     * exact/official price each unit was filled at.
     * <p>
     * @param price the Fill Price as a PriceValue
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see PriceValue
     */
    public OrderFillTransaction setPrice(PriceValue price) {
        this.price = price;
        return this;
    }
    /**
     * Set the Fill Price
     * <p>
     * This field is now deprecated and should no longer be used. The
     * individual tradesClosed, tradeReduced and tradeOpened fields contain the
     * exact/official price each unit was filled at.
     * <p>
     * @param price the Fill Price as a String
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see PriceValue
     */
    public OrderFillTransaction setPrice(String price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Fill Price
     * <p>
     * This field is now deprecated and should no longer be used. The
     * individual tradesClosed, tradeReduced and tradeOpened fields contain the
     * exact/official price each unit was filled at.
     * <p>
     * @param price the Fill Price as a double
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see PriceValue
     */
    public OrderFillTransaction setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Fill Price
     * <p>
     * This field is now deprecated and should no longer be used. The
     * individual tradesClosed, tradeReduced and tradeOpened fields contain the
     * exact/official price each unit was filled at.
     * <p>
     * @param price the Fill Price as a BigDecimal
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see PriceValue
     */
    public OrderFillTransaction setPrice(BigDecimal price) {
        this.price = new PriceValue(price);
        return this;
    }

    @SerializedName("fullVWAP") private PriceValue fullVWAP;

    /**
     * Get the Full VWAP
     * <p>
     * The price that all of the units of the OrderFill should have been filled
     * at, in the absence of guaranteed price execution. This factors in the
     * Account's current ClientPrice, used liquidity and the units of the
     * OrderFill only. If no Trades were closed with their price clamped for
     * guaranteed stop loss enforcement, then this value will match the price
     * fields of each Trade opened, closed, and reduced, and they will all be
     * the exact same.
     * <p>
     * @return the Full VWAP
     * @see PriceValue
     */
    public PriceValue getFullVWAP() {
        return this.fullVWAP;
    }

    /**
     * Set the Full VWAP
     * <p>
     * The price that all of the units of the OrderFill should have been filled
     * at, in the absence of guaranteed price execution. This factors in the
     * Account's current ClientPrice, used liquidity and the units of the
     * OrderFill only. If no Trades were closed with their price clamped for
     * guaranteed stop loss enforcement, then this value will match the price
     * fields of each Trade opened, closed, and reduced, and they will all be
     * the exact same.
     * <p>
     * @param fullVWAP the Full VWAP as a PriceValue
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see PriceValue
     */
    public OrderFillTransaction setFullVWAP(PriceValue fullVWAP) {
        this.fullVWAP = fullVWAP;
        return this;
    }
    /**
     * Set the Full VWAP
     * <p>
     * The price that all of the units of the OrderFill should have been filled
     * at, in the absence of guaranteed price execution. This factors in the
     * Account's current ClientPrice, used liquidity and the units of the
     * OrderFill only. If no Trades were closed with their price clamped for
     * guaranteed stop loss enforcement, then this value will match the price
     * fields of each Trade opened, closed, and reduced, and they will all be
     * the exact same.
     * <p>
     * @param fullVWAP the Full VWAP as a String
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see PriceValue
     */
    public OrderFillTransaction setFullVWAP(String fullVWAP) {
        this.fullVWAP = new PriceValue(fullVWAP);
        return this;
    }
    /**
     * Set the Full VWAP
     * <p>
     * The price that all of the units of the OrderFill should have been filled
     * at, in the absence of guaranteed price execution. This factors in the
     * Account's current ClientPrice, used liquidity and the units of the
     * OrderFill only. If no Trades were closed with their price clamped for
     * guaranteed stop loss enforcement, then this value will match the price
     * fields of each Trade opened, closed, and reduced, and they will all be
     * the exact same.
     * <p>
     * @param fullVWAP the Full VWAP as a double
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see PriceValue
     */
    public OrderFillTransaction setFullVWAP(double fullVWAP) {
        this.fullVWAP = new PriceValue(fullVWAP);
        return this;
    }
    /**
     * Set the Full VWAP
     * <p>
     * The price that all of the units of the OrderFill should have been filled
     * at, in the absence of guaranteed price execution. This factors in the
     * Account's current ClientPrice, used liquidity and the units of the
     * OrderFill only. If no Trades were closed with their price clamped for
     * guaranteed stop loss enforcement, then this value will match the price
     * fields of each Trade opened, closed, and reduced, and they will all be
     * the exact same.
     * <p>
     * @param fullVWAP the Full VWAP as a BigDecimal
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see PriceValue
     */
    public OrderFillTransaction setFullVWAP(BigDecimal fullVWAP) {
        this.fullVWAP = new PriceValue(fullVWAP);
        return this;
    }

    @SerializedName("fullPrice") private ClientPrice fullPrice;

    /**
     * Get the Price
     * <p>
     * The price in effect for the account at the time of the Order fill.
     * <p>
     * @return the Price
     * @see ClientPrice
     */
    public ClientPrice getFullPrice() {
        return this.fullPrice;
    }

    /**
     * Set the Price
     * <p>
     * The price in effect for the account at the time of the Order fill.
     * <p>
     * @param fullPrice the Price as a ClientPrice
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see ClientPrice
     */
    public OrderFillTransaction setFullPrice(ClientPrice fullPrice) {
        this.fullPrice = fullPrice;
        return this;
    }

    @SerializedName("reason") private OrderFillReason reason;

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

    /**
     * Set the Fill Reason
     * <p>
     * The reason that an Order was filled
     * <p>
     * @param reason the Fill Reason as an OrderFillReason
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see OrderFillReason
     */
    public OrderFillTransaction setReason(OrderFillReason reason) {
        this.reason = reason;
        return this;
    }

    @SerializedName("pl") private AccountUnits pl;

    /**
     * Get the Profit/Loss
     * <p>
     * The profit or loss incurred when the Order was filled.
     * <p>
     * @return the Profit/Loss
     * @see AccountUnits
     */
    public AccountUnits getPl() {
        return this.pl;
    }

    /**
     * Set the Profit/Loss
     * <p>
     * The profit or loss incurred when the Order was filled.
     * <p>
     * @param pl the Profit/Loss as an AccountUnits
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setPl(AccountUnits pl) {
        this.pl = pl;
        return this;
    }
    /**
     * Set the Profit/Loss
     * <p>
     * The profit or loss incurred when the Order was filled.
     * <p>
     * @param pl the Profit/Loss as a String
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setPl(String pl) {
        this.pl = new AccountUnits(pl);
        return this;
    }
    /**
     * Set the Profit/Loss
     * <p>
     * The profit or loss incurred when the Order was filled.
     * <p>
     * @param pl the Profit/Loss as a double
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setPl(double pl) {
        this.pl = new AccountUnits(pl);
        return this;
    }
    /**
     * Set the Profit/Loss
     * <p>
     * The profit or loss incurred when the Order was filled.
     * <p>
     * @param pl the Profit/Loss as a BigDecimal
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setPl(BigDecimal pl) {
        this.pl = new AccountUnits(pl);
        return this;
    }

    @SerializedName("financing") private AccountUnits financing;

    /**
     * Get the Financing
     * <p>
     * The financing paid or collected when the Order was filled.
     * <p>
     * @return the Financing
     * @see AccountUnits
     */
    public AccountUnits getFinancing() {
        return this.financing;
    }

    /**
     * Set the Financing
     * <p>
     * The financing paid or collected when the Order was filled.
     * <p>
     * @param financing the Financing as an AccountUnits
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setFinancing(AccountUnits financing) {
        this.financing = financing;
        return this;
    }
    /**
     * Set the Financing
     * <p>
     * The financing paid or collected when the Order was filled.
     * <p>
     * @param financing the Financing as a String
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setFinancing(String financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }
    /**
     * Set the Financing
     * <p>
     * The financing paid or collected when the Order was filled.
     * <p>
     * @param financing the Financing as a double
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setFinancing(double financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }
    /**
     * Set the Financing
     * <p>
     * The financing paid or collected when the Order was filled.
     * <p>
     * @param financing the Financing as a BigDecimal
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setFinancing(BigDecimal financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }

    @SerializedName("commission") private AccountUnits commission;

    /**
     * Get the Commission
     * <p>
     * The commission charged in the Account's home currency as a result of
     * filling the Order. The commission is always represented as a positive
     * quantity of the Account's home currency, however it reduces the balance
     * in the Account.
     * <p>
     * @return the Commission
     * @see AccountUnits
     */
    public AccountUnits getCommission() {
        return this.commission;
    }

    /**
     * Set the Commission
     * <p>
     * The commission charged in the Account's home currency as a result of
     * filling the Order. The commission is always represented as a positive
     * quantity of the Account's home currency, however it reduces the balance
     * in the Account.
     * <p>
     * @param commission the Commission as an AccountUnits
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setCommission(AccountUnits commission) {
        this.commission = commission;
        return this;
    }
    /**
     * Set the Commission
     * <p>
     * The commission charged in the Account's home currency as a result of
     * filling the Order. The commission is always represented as a positive
     * quantity of the Account's home currency, however it reduces the balance
     * in the Account.
     * <p>
     * @param commission the Commission as a String
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setCommission(String commission) {
        this.commission = new AccountUnits(commission);
        return this;
    }
    /**
     * Set the Commission
     * <p>
     * The commission charged in the Account's home currency as a result of
     * filling the Order. The commission is always represented as a positive
     * quantity of the Account's home currency, however it reduces the balance
     * in the Account.
     * <p>
     * @param commission the Commission as a double
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setCommission(double commission) {
        this.commission = new AccountUnits(commission);
        return this;
    }
    /**
     * Set the Commission
     * <p>
     * The commission charged in the Account's home currency as a result of
     * filling the Order. The commission is always represented as a positive
     * quantity of the Account's home currency, however it reduces the balance
     * in the Account.
     * <p>
     * @param commission the Commission as a BigDecimal
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setCommission(BigDecimal commission) {
        this.commission = new AccountUnits(commission);
        return this;
    }

    @SerializedName("guaranteedExecutionFee") private AccountUnits guaranteedExecutionFee;

    /**
     * Get the Guranteed Execution Fee
     * <p>
     * The total guaranteed execution fees charged for all Trades opened,
     * closed or reduced with guaranteed Stop Loss Orders.
     * <p>
     * @return the Guranteed Execution Fee
     * @see AccountUnits
     */
    public AccountUnits getGuaranteedExecutionFee() {
        return this.guaranteedExecutionFee;
    }

    /**
     * Set the Guranteed Execution Fee
     * <p>
     * The total guaranteed execution fees charged for all Trades opened,
     * closed or reduced with guaranteed Stop Loss Orders.
     * <p>
     * @param guaranteedExecutionFee the Guranteed Execution Fee as an
     * AccountUnits
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setGuaranteedExecutionFee(AccountUnits guaranteedExecutionFee) {
        this.guaranteedExecutionFee = guaranteedExecutionFee;
        return this;
    }
    /**
     * Set the Guranteed Execution Fee
     * <p>
     * The total guaranteed execution fees charged for all Trades opened,
     * closed or reduced with guaranteed Stop Loss Orders.
     * <p>
     * @param guaranteedExecutionFee the Guranteed Execution Fee as a String
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setGuaranteedExecutionFee(String guaranteedExecutionFee) {
        this.guaranteedExecutionFee = new AccountUnits(guaranteedExecutionFee);
        return this;
    }
    /**
     * Set the Guranteed Execution Fee
     * <p>
     * The total guaranteed execution fees charged for all Trades opened,
     * closed or reduced with guaranteed Stop Loss Orders.
     * <p>
     * @param guaranteedExecutionFee the Guranteed Execution Fee as a double
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setGuaranteedExecutionFee(double guaranteedExecutionFee) {
        this.guaranteedExecutionFee = new AccountUnits(guaranteedExecutionFee);
        return this;
    }
    /**
     * Set the Guranteed Execution Fee
     * <p>
     * The total guaranteed execution fees charged for all Trades opened,
     * closed or reduced with guaranteed Stop Loss Orders.
     * <p>
     * @param guaranteedExecutionFee the Guranteed Execution Fee as a
     * BigDecimal
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setGuaranteedExecutionFee(BigDecimal guaranteedExecutionFee) {
        this.guaranteedExecutionFee = new AccountUnits(guaranteedExecutionFee);
        return this;
    }

    @SerializedName("accountBalance") private AccountUnits accountBalance;

    /**
     * Get the Account Balance
     * <p>
     * The Account's balance after the Order was filled.
     * <p>
     * @return the Account Balance
     * @see AccountUnits
     */
    public AccountUnits getAccountBalance() {
        return this.accountBalance;
    }

    /**
     * Set the Account Balance
     * <p>
     * The Account's balance after the Order was filled.
     * <p>
     * @param accountBalance the Account Balance as an AccountUnits
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setAccountBalance(AccountUnits accountBalance) {
        this.accountBalance = accountBalance;
        return this;
    }
    /**
     * Set the Account Balance
     * <p>
     * The Account's balance after the Order was filled.
     * <p>
     * @param accountBalance the Account Balance as a String
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setAccountBalance(String accountBalance) {
        this.accountBalance = new AccountUnits(accountBalance);
        return this;
    }
    /**
     * Set the Account Balance
     * <p>
     * The Account's balance after the Order was filled.
     * <p>
     * @param accountBalance the Account Balance as a double
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setAccountBalance(double accountBalance) {
        this.accountBalance = new AccountUnits(accountBalance);
        return this;
    }
    /**
     * Set the Account Balance
     * <p>
     * The Account's balance after the Order was filled.
     * <p>
     * @param accountBalance the Account Balance as a BigDecimal
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = new AccountUnits(accountBalance);
        return this;
    }

    @SerializedName("tradeOpened") private TradeOpen tradeOpened;

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

    /**
     * Set the Trade Opened
     * <p>
     * The Trade that was opened when the Order was filled (only provided if
     * filling the Order resulted in a new Trade).
     * <p>
     * @param tradeOpened the Trade Opened as a TradeOpen
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see TradeOpen
     */
    public OrderFillTransaction setTradeOpened(TradeOpen tradeOpened) {
        this.tradeOpened = tradeOpened;
        return this;
    }

    @SerializedName("tradesClosed") private ArrayList<TradeReduce> tradesClosed;

    /**
     * Get the Trades Closed
     * <p>
     * The Trades that were closed when the Order was filled (only provided if
     * filling the Order resulted in a closing open Trades).
     * <p>
     * @return the Trades Closed
     * @see TradeReduce
     */
    public List<TradeReduce> getTradesClosed() {
        return this.tradesClosed;
    }

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
    public OrderFillTransaction setTradesClosed(Collection<?> tradesClosed) {
        ArrayList<TradeReduce> newTradesClosed = new ArrayList<TradeReduce>(tradesClosed.size());
        tradesClosed.forEach((item) -> {
            if (item instanceof TradeReduce)
            {
                newTradesClosed.add((TradeReduce) item);
            }
            else
            {
                throw new IllegalArgumentException(
                    item.getClass().getName() + " cannot be converted to a TradeReduce"
                );
            }
        });
        this.tradesClosed = newTradesClosed;
        return this;
    }

    @SerializedName("tradeReduced") private TradeReduce tradeReduced;

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

    /**
     * Set the Trade Reduced
     * <p>
     * The Trade that was reduced when the Order was filled (only provided if
     * filling the Order resulted in reducing an open Trade).
     * <p>
     * @param tradeReduced the Trade Reduced as a TradeReduce
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see TradeReduce
     */
    public OrderFillTransaction setTradeReduced(TradeReduce tradeReduced) {
        this.tradeReduced = tradeReduced;
        return this;
    }

    @SerializedName("halfSpreadCost") private AccountUnits halfSpreadCost;

    /**
     * Get the Half Spread Cost
     * <p>
     * The half spread cost for the OrderFill, which is the sum of the
     * halfSpreadCost values in the tradeOpened, tradesClosed and tradeReduced
     * fields. This can be a positive or negative value and is represented in
     * the home currency of the Account.
     * <p>
     * @return the Half Spread Cost
     * @see AccountUnits
     */
    public AccountUnits getHalfSpreadCost() {
        return this.halfSpreadCost;
    }

    /**
     * Set the Half Spread Cost
     * <p>
     * The half spread cost for the OrderFill, which is the sum of the
     * halfSpreadCost values in the tradeOpened, tradesClosed and tradeReduced
     * fields. This can be a positive or negative value and is represented in
     * the home currency of the Account.
     * <p>
     * @param halfSpreadCost the Half Spread Cost as an AccountUnits
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setHalfSpreadCost(AccountUnits halfSpreadCost) {
        this.halfSpreadCost = halfSpreadCost;
        return this;
    }
    /**
     * Set the Half Spread Cost
     * <p>
     * The half spread cost for the OrderFill, which is the sum of the
     * halfSpreadCost values in the tradeOpened, tradesClosed and tradeReduced
     * fields. This can be a positive or negative value and is represented in
     * the home currency of the Account.
     * <p>
     * @param halfSpreadCost the Half Spread Cost as a String
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setHalfSpreadCost(String halfSpreadCost) {
        this.halfSpreadCost = new AccountUnits(halfSpreadCost);
        return this;
    }
    /**
     * Set the Half Spread Cost
     * <p>
     * The half spread cost for the OrderFill, which is the sum of the
     * halfSpreadCost values in the tradeOpened, tradesClosed and tradeReduced
     * fields. This can be a positive or negative value and is represented in
     * the home currency of the Account.
     * <p>
     * @param halfSpreadCost the Half Spread Cost as a double
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setHalfSpreadCost(double halfSpreadCost) {
        this.halfSpreadCost = new AccountUnits(halfSpreadCost);
        return this;
    }
    /**
     * Set the Half Spread Cost
     * <p>
     * The half spread cost for the OrderFill, which is the sum of the
     * halfSpreadCost values in the tradeOpened, tradesClosed and tradeReduced
     * fields. This can be a positive or negative value and is represented in
     * the home currency of the Account.
     * <p>
     * @param halfSpreadCost the Half Spread Cost as a BigDecimal
     * @return {@link OrderFillTransaction OrderFillTransaction}
     * @see AccountUnits
     */
    public OrderFillTransaction setHalfSpreadCost(BigDecimal halfSpreadCost) {
        this.halfSpreadCost = new AccountUnits(halfSpreadCost);
        return this;
    }

    @Override
    public String toString() {
        return "OrderFillTransaction(" +
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
            "orderID=" +
                (orderID == null ? "null" : orderID.toString()) + ", " +
            "clientOrderID=" +
                (clientOrderID == null ? "null" : clientOrderID.toString()) + ", " +
            "instrument=" +
                (instrument == null ? "null" : instrument.toString()) + ", " +
            "units=" +
                (units == null ? "null" : units.toString()) + ", " +
            "gainQuoteHomeConversionFactor=" +
                (gainQuoteHomeConversionFactor == null ? "null" : gainQuoteHomeConversionFactor.toString()) + ", " +
            "lossQuoteHomeConversionFactor=" +
                (lossQuoteHomeConversionFactor == null ? "null" : lossQuoteHomeConversionFactor.toString()) + ", " +
            "price=" +
                (price == null ? "null" : price.toString()) + ", " +
            "fullVWAP=" +
                (fullVWAP == null ? "null" : fullVWAP.toString()) + ", " +
            "fullPrice=" +
                (fullPrice == null ? "null" : fullPrice.toString()) + ", " +
            "reason=" +
                (reason == null ? "null" : reason.toString()) + ", " +
            "pl=" +
                (pl == null ? "null" : pl.toString()) + ", " +
            "financing=" +
                (financing == null ? "null" : financing.toString()) + ", " +
            "commission=" +
                (commission == null ? "null" : commission.toString()) + ", " +
            "guaranteedExecutionFee=" +
                (guaranteedExecutionFee == null ? "null" : guaranteedExecutionFee.toString()) + ", " +
            "accountBalance=" +
                (accountBalance == null ? "null" : accountBalance.toString()) + ", " +
            "tradeOpened=" +
                (tradeOpened == null ? "null" : tradeOpened.toString()) + ", " +
            "tradesClosed=" +
                (tradesClosed == null ? "null" : tradesClosed.toString()) + ", " +
            "tradeReduced=" +
                (tradeReduced == null ? "null" : tradeReduced.toString()) + ", " +
            "halfSpreadCost=" +
                (halfSpreadCost == null ? "null" : halfSpreadCost.toString()) +
            ")";
    }
}
