package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
* The specification of a Trade within an Account. This includes the full
* representation of the Trade's dependent Orders in addition to the IDs of
* those Orders.
*/

public class Trade {

    @SerializedName("id") private TradeID _id;
    public Trade set_id(String __id) { 
        this._id = new TradeID(__id); 
        return this;
    }
    /**
    * The Trade's identifier, unique within the Trade's Account.
    */

    public String get_id() {
        return this._id.get_TradeID();
    }

    @SerializedName("instrument") private InstrumentName _instrument;
    public Trade set_instrument(String __instrument) { 
        this._instrument = new InstrumentName(__instrument); 
        return this;
    }
    /**
    * The Trade's Instrument.
    */

    public String get_instrument() {
        return this._instrument.get_InstrumentName();
    }

    @SerializedName("price") private PriceValue _price;
    // Numeric stored as String
    public Trade set_price(double __price) { 
        this._price = new PriceValue(__price); 
        return this;
    }
    /**
    * The execution price of the Trade.
    */

    public double get_price() {
        return this._price.get_PriceValue();
    }

    @SerializedName("openTime") private DateTime _openTime;
    public Trade set_openTime(String __openTime) { 
        this._openTime = new DateTime(__openTime); 
        return this;
    }
    /**
    * The date/time when the Trade was opened.
    */

    public String get_openTime() {
        return this._openTime.get_DateTime();
    }

    @SerializedName("state") private TradeState _state;
    public Trade set_state(TradeState __state) { 
        this._state = __state;
        return this;
    }
    /**
    * The current state of the Trade.
    */

    public TradeState get_state() {
        return this._state;
    }

    @SerializedName("initialUnits") private DecimalNumber _initialUnits;
    // Numeric stored as String
    public Trade set_initialUnits(double __initialUnits) { 
        this._initialUnits = new DecimalNumber(__initialUnits); 
        return this;
    }
    /**
    * The initial size of the Trade. Negative values indicate a short Trade,
    * and positive values indicate a long Trade.
    */

    public double get_initialUnits() {
        return this._initialUnits.get_DecimalNumber();
    }

    @SerializedName("currentUnits") private DecimalNumber _currentUnits;
    // Numeric stored as String
    public Trade set_currentUnits(double __currentUnits) { 
        this._currentUnits = new DecimalNumber(__currentUnits); 
        return this;
    }
    /**
    * The number of units currently open for the Trade. This value is reduced
    * to 0.0 as the Trade is closed.
    */

    public double get_currentUnits() {
        return this._currentUnits.get_DecimalNumber();
    }

    @SerializedName("realizedPL") private AccountUnits _realizedPL;
    // Numeric stored as String
    public Trade set_realizedPL(double __realizedPL) { 
        this._realizedPL = new AccountUnits(__realizedPL); 
        return this;
    }
    /**
    * The total profit/loss realized on the closed portion of the Trade.
    */

    public double get_realizedPL() {
        return this._realizedPL.get_AccountUnits();
    }

    @SerializedName("unrealizedPL") private AccountUnits _unrealizedPL;
    // Numeric stored as String
    public Trade set_unrealizedPL(double __unrealizedPL) { 
        this._unrealizedPL = new AccountUnits(__unrealizedPL); 
        return this;
    }
    /**
    * The unrealized profit/loss on the open portion of the Trade.
    */

    public double get_unrealizedPL() {
        return this._unrealizedPL.get_AccountUnits();
    }

    @SerializedName("averageClosePrice") private PriceValue _averageClosePrice;
    // Numeric stored as String
    public Trade set_averageClosePrice(double __averageClosePrice) { 
        this._averageClosePrice = new PriceValue(__averageClosePrice); 
        return this;
    }
    /**
    * The average closing price of the Trade. Only present if the Trade has
    * been closed or reduced at least once.
    */

    public double get_averageClosePrice() {
        return this._averageClosePrice.get_PriceValue();
    }
 
    @SerializedName("closingTransactionIDs") private TransactionID[] _closingTransactionIDs;
    public Trade set_closingTransactionIDs(TransactionID[] __closingTransactionIDs) {
        this._closingTransactionIDs = __closingTransactionIDs;
        return this;
    }
    /**
    * The IDs of the Transactions that have closed portions of this Trade.
    */

    public TransactionID[] get_closingTransactionIDs() {
        return this._closingTransactionIDs;
    }

    @SerializedName("financing") private AccountUnits _financing;
    // Numeric stored as String
    public Trade set_financing(double __financing) { 
        this._financing = new AccountUnits(__financing); 
        return this;
    }
    /**
    * The financing paid/collected for this Trade.
    */

    public double get_financing() {
        return this._financing.get_AccountUnits();
    }

    @SerializedName("closeTime") private DateTime _closeTime;
    public Trade set_closeTime(String __closeTime) { 
        this._closeTime = new DateTime(__closeTime); 
        return this;
    }
    /**
    * The date/time when the Trade was fully closed. Only provided for Trades
    * whose state is CLOSED.
    */

    public String get_closeTime() {
        return this._closeTime.get_DateTime();
    }

    @SerializedName("clientExtensions") private ClientExtensions _clientExtensions;
    public Trade set_clientExtensions(ClientExtensions __clientExtensions) { 
        this._clientExtensions = __clientExtensions;
        return this;
    }
    /**
    * The client extensions of the Trade.
    */

    public ClientExtensions get_clientExtensions() {
        return this._clientExtensions;
    }

    @SerializedName("takeProfitOrder") private TakeProfitOrder _takeProfitOrder;
    public Trade set_takeProfitOrder(TakeProfitOrder __takeProfitOrder) { 
        this._takeProfitOrder = __takeProfitOrder;
        return this;
    }
    /**
    * Full representation of the Trade's Take Profit Order, only provided if
    * such an Order exists.
    */

    public TakeProfitOrder get_takeProfitOrder() {
        return this._takeProfitOrder;
    }

    @SerializedName("stopLossOrder") private StopLossOrder _stopLossOrder;
    public Trade set_stopLossOrder(StopLossOrder __stopLossOrder) { 
        this._stopLossOrder = __stopLossOrder;
        return this;
    }
    /**
    * Full representation of the Trade's Stop Loss Order, only provided if such
    * an Order exists.
    */

    public StopLossOrder get_stopLossOrder() {
        return this._stopLossOrder;
    }

    @SerializedName("trailingStopLossOrder") private TrailingStopLossOrder _trailingStopLossOrder;
    public Trade set_trailingStopLossOrder(TrailingStopLossOrder __trailingStopLossOrder) { 
        this._trailingStopLossOrder = __trailingStopLossOrder;
        return this;
    }
    /**
    * Full representation of the Trade's Trailing Stop Loss Order, only
    * provided if such an Order exists.
    */

    public TrailingStopLossOrder get_trailingStopLossOrder() {
        return this._trailingStopLossOrder;
    }
}
