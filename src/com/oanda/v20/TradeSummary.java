package com.oanda.v20;

import com.oanda.v20.TradeState;
import com.google.gson.annotations.SerializedName;

/**
 * The summary of a Trade within an Account. This representation does not
 * provide the full details of the Trade's dependent Orders.
 * <p>
 * {currentUnits} ({initialUnits}) of {instrument} @ {price}
 */
public class TradeSummary {

    @SerializedName("id") private TradeID id;

    /**
     * Set the Trade ID
     * <p>
     * The Trade's identifier, unique within the Trade's Account.
     * <p>
     * @param id the Trade ID
     * @return {@link TradeSummary TradeSummary}
     * @see TradeID
     */
    public TradeSummary setId(String id) {
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
     * @return {@link TradeSummary TradeSummary}
     * @see InstrumentName
     */
    public TradeSummary setInstrument(String instrument) {
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
     * @return {@link TradeSummary TradeSummary}
     * @see PriceValue
     */
    public TradeSummary setPrice(double price) {
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
     * @return {@link TradeSummary TradeSummary}
     * @see DateTime
     */
    public TradeSummary setOpenTime(String openTime) {
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
     * @return {@link TradeSummary TradeSummary}
     * @see TradeState
     */
    public TradeSummary setState(TradeState state) {
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
     * @return {@link TradeSummary TradeSummary}
     * @see DecimalNumber
     */
    public TradeSummary setInitialUnits(double initialUnits) {
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
     * @return {@link TradeSummary TradeSummary}
     * @see DecimalNumber
     */
    public TradeSummary setCurrentUnits(double currentUnits) {
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
     * @return {@link TradeSummary TradeSummary}
     * @see AccountUnits
     */
    public TradeSummary setRealizedPL(double realizedPL) {
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
     * @return {@link TradeSummary TradeSummary}
     * @see AccountUnits
     */
    public TradeSummary setUnrealizedPL(double unrealizedPL) {
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
     * @return {@link TradeSummary TradeSummary}
     * @see PriceValue
     */
    public TradeSummary setAverageClosePrice(double averageClosePrice) {
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
     * @return {@link TradeSummary TradeSummary}
     * @see TransactionID
     */
    public TradeSummary setClosingTransactionIDs(TransactionID[] closingTransactionIDs) {
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
     * @return {@link TradeSummary TradeSummary}
     * @see AccountUnits
     */
    public TradeSummary setFinancing(double financing) {
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
     * @return {@link TradeSummary TradeSummary}
     * @see DateTime
     */
    public TradeSummary setCloseTime(String closeTime) {
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
     * @return {@link TradeSummary TradeSummary}
     * @see ClientExtensions
     */
    public TradeSummary setClientExtensions(ClientExtensions clientExtensions) {
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

    @SerializedName("takeProfitOrderID") private OrderID takeProfitOrderID;

    /**
     * Set the Take Profit Order ID
     * <p>
     * ID of the Trade's Take Profit Order, only provided if such an Order
     * exists.
     * <p>
     * @param takeProfitOrderID the Take Profit Order ID
     * @return {@link TradeSummary TradeSummary}
     * @see OrderID
     */
    public TradeSummary setTakeProfitOrderID(String takeProfitOrderID) {
        this.takeProfitOrderID = new OrderID(takeProfitOrderID);
        return this;
    }

    /**
     * Get the Take Profit Order ID
     * <p>
     * ID of the Trade's Take Profit Order, only provided if such an Order
     * exists.
     * <p>
     * @return the Take Profit Order ID
     * @see OrderID
     */
    public String getTakeProfitOrderID() {
        return this.takeProfitOrderID.getOrderID();
    }

    @SerializedName("stopLossOrderID") private OrderID stopLossOrderID;

    /**
     * Set the Stop Loss Order ID
     * <p>
     * ID of the Trade's Stop Loss Order, only provided if such an Order
     * exists.
     * <p>
     * @param stopLossOrderID the Stop Loss Order ID
     * @return {@link TradeSummary TradeSummary}
     * @see OrderID
     */
    public TradeSummary setStopLossOrderID(String stopLossOrderID) {
        this.stopLossOrderID = new OrderID(stopLossOrderID);
        return this;
    }

    /**
     * Get the Stop Loss Order ID
     * <p>
     * ID of the Trade's Stop Loss Order, only provided if such an Order
     * exists.
     * <p>
     * @return the Stop Loss Order ID
     * @see OrderID
     */
    public String getStopLossOrderID() {
        return this.stopLossOrderID.getOrderID();
    }

    @SerializedName("trailingStopLossOrderID") private OrderID trailingStopLossOrderID;

    /**
     * Set the Trailing Stop Loss Order ID
     * <p>
     * ID of the Trade's Trailing Stop Loss Order, only provided if such an
     * Order exists.
     * <p>
     * @param trailingStopLossOrderID the Trailing Stop Loss Order ID
     * @return {@link TradeSummary TradeSummary}
     * @see OrderID
     */
    public TradeSummary setTrailingStopLossOrderID(String trailingStopLossOrderID) {
        this.trailingStopLossOrderID = new OrderID(trailingStopLossOrderID);
        return this;
    }

    /**
     * Get the Trailing Stop Loss Order ID
     * <p>
     * ID of the Trade's Trailing Stop Loss Order, only provided if such an
     * Order exists.
     * <p>
     * @return the Trailing Stop Loss Order ID
     * @see OrderID
     */
    public String getTrailingStopLossOrderID() {
        return this.trailingStopLossOrderID.getOrderID();
    }
}
