package com.oanda.v20;

import com.oanda.v20.TradeState;
import com.google.gson.annotations.SerializedName;

/**
 * The specification of a Trade within an Account. This includes the full
 * representation of the Trade's dependent Orders in addition to the IDs of
 * those Orders.
 * <p>
 * {currentUnits} ({initialUnits}) of {instrument} @ {price}
 */
public class Trade {

    @SerializedName("id") private TradeID id;

    /**
     * Set the Trade ID
     * <p>
     * The Trade's identifier, unique within the Trade's Account.
     * <p>
     * @param id the Trade ID
     * @return {@link Trade Trade}
     * @see TradeID
     */
    public Trade setId(String id) {
        this.id = new TradeID(id);
        return this;
    }

    /**
     * Get the Trade ID
     * <p>
     * The Trade's identifier, unique within the Trade's Account.
     * <p>
     * @return the Trade ID
     * @see TradeID
     */
    public String getId() {
        return this.id.getTradeID();
    }

    @SerializedName("instrument") private InstrumentName instrument;

    /**
     * Set the Instrument
     * <p>
     * The Trade's Instrument.
     * <p>
     * @param instrument the Instrument
     * @return {@link Trade Trade}
     * @see InstrumentName
     */
    public Trade setInstrument(String instrument) {
        this.instrument = new InstrumentName(instrument);
        return this;
    }

    /**
     * Get the Instrument
     * <p>
     * The Trade's Instrument.
     * <p>
     * @return the Instrument
     * @see InstrumentName
     */
    public String getInstrument() {
        return this.instrument.getInstrumentName();
    }

    @SerializedName("price") private PriceValue price;

    /**
     * Set the Fill Price
     * <p>
     * The execution price of the Trade.
     * <p>
     * @param price the Fill Price
     * @return {@link Trade Trade}
     * @see PriceValue
     */
    public Trade setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }

    /**
     * Get the Fill Price
     * <p>
     * The execution price of the Trade.
     * <p>
     * @return the Fill Price
     * @see PriceValue
     */
    public double getPrice() {
        return this.price.getPriceValue();
    }

    @SerializedName("openTime") private DateTime openTime;

    /**
     * Set the Open Time
     * <p>
     * The date/time when the Trade was opened.
     * <p>
     * @param openTime the Open Time
     * @return {@link Trade Trade}
     * @see DateTime
     */
    public Trade setOpenTime(String openTime) {
        this.openTime = new DateTime(openTime);
        return this;
    }

    /**
     * Get the Open Time
     * <p>
     * The date/time when the Trade was opened.
     * <p>
     * @return the Open Time
     * @see DateTime
     */
    public String getOpenTime() {
        return this.openTime.getDateTime();
    }

    @SerializedName("state") private TradeState state;

    /**
     * Set the State
     * <p>
     * The current state of the Trade.
     * <p>
     * @param state the State
     * @return {@link Trade Trade}
     * @see TradeState
     */
    public Trade setState(TradeState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the State
     * <p>
     * The current state of the Trade.
     * <p>
     * @return the State
     * @see TradeState
     */
    public TradeState getState() {
        return this.state;
    }

    @SerializedName("initialUnits") private DecimalNumber initialUnits;

    /**
     * Set the Initial Trade Units
     * <p>
     * The initial size of the Trade. Negative values indicate a short Trade,
     * and positive values indicate a long Trade.
     * <p>
     * @param initialUnits the Initial Trade Units
     * @return {@link Trade Trade}
     * @see DecimalNumber
     */
    public Trade setInitialUnits(double initialUnits) {
        this.initialUnits = new DecimalNumber(initialUnits);
        return this;
    }

    /**
     * Get the Initial Trade Units
     * <p>
     * The initial size of the Trade. Negative values indicate a short Trade,
     * and positive values indicate a long Trade.
     * <p>
     * @return the Initial Trade Units
     * @see DecimalNumber
     */
    public double getInitialUnits() {
        return this.initialUnits.getDecimalNumber();
    }

    @SerializedName("currentUnits") private DecimalNumber currentUnits;

    /**
     * Set the Current Open Trade Units
     * <p>
     * The number of units currently open for the Trade. This value is reduced
     * to 0.0 as the Trade is closed.
     * <p>
     * @param currentUnits the Current Open Trade Units
     * @return {@link Trade Trade}
     * @see DecimalNumber
     */
    public Trade setCurrentUnits(double currentUnits) {
        this.currentUnits = new DecimalNumber(currentUnits);
        return this;
    }

    /**
     * Get the Current Open Trade Units
     * <p>
     * The number of units currently open for the Trade. This value is reduced
     * to 0.0 as the Trade is closed.
     * <p>
     * @return the Current Open Trade Units
     * @see DecimalNumber
     */
    public double getCurrentUnits() {
        return this.currentUnits.getDecimalNumber();
    }

    @SerializedName("realizedPL") private AccountUnits realizedPL;

    /**
     * Set the Realized Profit/Loss
     * <p>
     * The total profit/loss realized on the closed portion of the Trade.
     * <p>
     * @param realizedPL the Realized Profit/Loss
     * @return {@link Trade Trade}
     * @see AccountUnits
     */
    public Trade setRealizedPL(double realizedPL) {
        this.realizedPL = new AccountUnits(realizedPL);
        return this;
    }

    /**
     * Get the Realized Profit/Loss
     * <p>
     * The total profit/loss realized on the closed portion of the Trade.
     * <p>
     * @return the Realized Profit/Loss
     * @see AccountUnits
     */
    public double getRealizedPL() {
        return this.realizedPL.getAccountUnits();
    }

    @SerializedName("unrealizedPL") private AccountUnits unrealizedPL;

    /**
     * Set the Unrealized Profit/Loss
     * <p>
     * The unrealized profit/loss on the open portion of the Trade.
     * <p>
     * @param unrealizedPL the Unrealized Profit/Loss
     * @return {@link Trade Trade}
     * @see AccountUnits
     */
    public Trade setUnrealizedPL(double unrealizedPL) {
        this.unrealizedPL = new AccountUnits(unrealizedPL);
        return this;
    }

    /**
     * Get the Unrealized Profit/Loss
     * <p>
     * The unrealized profit/loss on the open portion of the Trade.
     * <p>
     * @return the Unrealized Profit/Loss
     * @see AccountUnits
     */
    public double getUnrealizedPL() {
        return this.unrealizedPL.getAccountUnits();
    }

    @SerializedName("averageClosePrice") private PriceValue averageClosePrice;

    /**
     * Set the Average Close Price
     * <p>
     * The average closing price of the Trade. Only present if the Trade has
     * been closed or reduced at least once.
     * <p>
     * @param averageClosePrice the Average Close Price
     * @return {@link Trade Trade}
     * @see PriceValue
     */
    public Trade setAverageClosePrice(double averageClosePrice) {
        this.averageClosePrice = new PriceValue(averageClosePrice);
        return this;
    }

    /**
     * Get the Average Close Price
     * <p>
     * The average closing price of the Trade. Only present if the Trade has
     * been closed or reduced at least once.
     * <p>
     * @return the Average Close Price
     * @see PriceValue
     */
    public double getAverageClosePrice() {
        return this.averageClosePrice.getPriceValue();
    }

    @SerializedName("closingTransactionIDs") private TransactionID[] closingTransactionIDs;

    /**
     * Set the Closing Transaction IDs
     * <p>
     * The IDs of the Transactions that have closed portions of this Trade.
     * <p>
     * @param closingTransactionIDs the Closing Transaction IDs
     * @return {@link Trade Trade}
     * @see TransactionID
     */
    public Trade setClosingTransactionIDs(TransactionID[] closingTransactionIDs) {
        this.closingTransactionIDs = closingTransactionIDs;
        return this;
    }

    /**
     * Get the Closing Transaction IDs
     * <p>
     * The IDs of the Transactions that have closed portions of this Trade.
     * <p>
     * @return the Closing Transaction IDs
     * @see TransactionID
     */
    public TransactionID[] getClosingTransactionIDs() {
        return this.closingTransactionIDs;
    }

    @SerializedName("financing") private AccountUnits financing;

    /**
     * Set the Financing
     * <p>
     * The financing paid/collected for this Trade.
     * <p>
     * @param financing the Financing
     * @return {@link Trade Trade}
     * @see AccountUnits
     */
    public Trade setFinancing(double financing) {
        this.financing = new AccountUnits(financing);
        return this;
    }

    /**
     * Get the Financing
     * <p>
     * The financing paid/collected for this Trade.
     * <p>
     * @return the Financing
     * @see AccountUnits
     */
    public double getFinancing() {
        return this.financing.getAccountUnits();
    }

    @SerializedName("closeTime") private DateTime closeTime;

    /**
     * Set the Close Time
     * <p>
     * The date/time when the Trade was fully closed. Only provided for Trades
     * whose state is CLOSED.
     * <p>
     * @param closeTime the Close Time
     * @return {@link Trade Trade}
     * @see DateTime
     */
    public Trade setCloseTime(String closeTime) {
        this.closeTime = new DateTime(closeTime);
        return this;
    }

    /**
     * Get the Close Time
     * <p>
     * The date/time when the Trade was fully closed. Only provided for Trades
     * whose state is CLOSED.
     * <p>
     * @return the Close Time
     * @see DateTime
     */
    public String getCloseTime() {
        return this.closeTime.getDateTime();
    }

    @SerializedName("clientExtensions") private ClientExtensions clientExtensions;

    /**
     * Set the Client Extensions
     * <p>
     * The client extensions of the Trade.
     * <p>
     * @param clientExtensions the Client Extensions
     * @return {@link Trade Trade}
     * @see ClientExtensions
     */
    public Trade setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

    /**
     * Get the Client Extensions
     * <p>
     * The client extensions of the Trade.
     * <p>
     * @return the Client Extensions
     * @see ClientExtensions
     */
    public ClientExtensions getClientExtensions() {
        return this.clientExtensions;
    }

    @SerializedName("takeProfitOrder") private TakeProfitOrder takeProfitOrder;

    /**
     * Set the Take Profit Order
     * <p>
     * Full representation of the Trade's Take Profit Order, only provided if
     * such an Order exists.
     * <p>
     * @param takeProfitOrder the Take Profit Order
     * @return {@link Trade Trade}
     * @see TakeProfitOrder
     */
    public Trade setTakeProfitOrder(TakeProfitOrder takeProfitOrder) {
        this.takeProfitOrder = takeProfitOrder;
        return this;
    }

    /**
     * Get the Take Profit Order
     * <p>
     * Full representation of the Trade's Take Profit Order, only provided if
     * such an Order exists.
     * <p>
     * @return the Take Profit Order
     * @see TakeProfitOrder
     */
    public TakeProfitOrder getTakeProfitOrder() {
        return this.takeProfitOrder;
    }

    @SerializedName("stopLossOrder") private StopLossOrder stopLossOrder;

    /**
     * Set the Stop Loss Order
     * <p>
     * Full representation of the Trade's Stop Loss Order, only provided if
     * such an Order exists.
     * <p>
     * @param stopLossOrder the Stop Loss Order
     * @return {@link Trade Trade}
     * @see StopLossOrder
     */
    public Trade setStopLossOrder(StopLossOrder stopLossOrder) {
        this.stopLossOrder = stopLossOrder;
        return this;
    }

    /**
     * Get the Stop Loss Order
     * <p>
     * Full representation of the Trade's Stop Loss Order, only provided if
     * such an Order exists.
     * <p>
     * @return the Stop Loss Order
     * @see StopLossOrder
     */
    public StopLossOrder getStopLossOrder() {
        return this.stopLossOrder;
    }

    @SerializedName("trailingStopLossOrder") private TrailingStopLossOrder trailingStopLossOrder;

    /**
     * Set the Trailing Stop Loss Order
     * <p>
     * Full representation of the Trade's Trailing Stop Loss Order, only
     * provided if such an Order exists.
     * <p>
     * @param trailingStopLossOrder the Trailing Stop Loss Order
     * @return {@link Trade Trade}
     * @see TrailingStopLossOrder
     */
    public Trade setTrailingStopLossOrder(TrailingStopLossOrder trailingStopLossOrder) {
        this.trailingStopLossOrder = trailingStopLossOrder;
        return this;
    }

    /**
     * Get the Trailing Stop Loss Order
     * <p>
     * Full representation of the Trade's Trailing Stop Loss Order, only
     * provided if such an Order exists.
     * <p>
     * @return the Trailing Stop Loss Order
     * @see TrailingStopLossOrder
     */
    public TrailingStopLossOrder getTrailingStopLossOrder() {
        return this.trailingStopLossOrder;
    }
}
