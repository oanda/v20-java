package com.oanda.v20.transaction;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.pricing.PriceValue;
import com.oanda.v20.primitives.DecimalNumber;
import com.oanda.v20.trade.TradeID;

/**
 * A TradeOpen object represents a Trade for an instrument that was opened in
 * an Account. It is found embedded in Transactions that affect the position of
 * an instrument in the Account, specifically the OrderFill Transaction.
 */
public class TradeOpen {

    /**
     * Default constructor.
     */
    public TradeOpen() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the TradeOpen to copy
     */
    public TradeOpen(TradeOpen other) {
        this.tradeID = other.tradeID;
        this.units = other.units;
        this.price = other.price;
        if (other.clientExtensions != null)
        {
            this.clientExtensions = new ClientExtensions(other.clientExtensions);
        }
    }

    @SerializedName("tradeID") private TradeID tradeID;

    /**
     * Get the Trade ID
     * <p>
     * The ID of the Trade that was opened
     * <p>
     * @return the Trade ID
     * @see TradeID
     */
    public TradeID getTradeID() {
        return this.tradeID;
    }

    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade that was opened
     * <p>
     * @param tradeID the Trade ID as a TradeID
     * @return {@link TradeOpen TradeOpen}
     * @see TradeID
     */
    public TradeOpen setTradeID(TradeID tradeID) {
        this.tradeID = tradeID;
        return this;
    }
    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade that was opened
     * <p>
     * @param tradeID the Trade ID as a String
     * @return {@link TradeOpen TradeOpen}
     * @see TradeID
     */
    public TradeOpen setTradeID(String tradeID) {
        this.tradeID = new TradeID(tradeID);
        return this;
    }

    @SerializedName("units") private DecimalNumber units;

    /**
     * Get the Amount
     * <p>
     * The number of units opened by the Trade
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
     * The number of units opened by the Trade
     * <p>
     * @param units the Amount as a DecimalNumber
     * @return {@link TradeOpen TradeOpen}
     * @see DecimalNumber
     */
    public TradeOpen setUnits(DecimalNumber units) {
        this.units = units;
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The number of units opened by the Trade
     * <p>
     * @param units the Amount as a String
     * @return {@link TradeOpen TradeOpen}
     * @see DecimalNumber
     */
    public TradeOpen setUnits(String units) {
        this.units = new DecimalNumber(units);
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The number of units opened by the Trade
     * <p>
     * @param units the Amount as a double
     * @return {@link TradeOpen TradeOpen}
     * @see DecimalNumber
     */
    public TradeOpen setUnits(double units) {
        this.units = new DecimalNumber(units);
        return this;
    }
    /**
     * Set the Amount
     * <p>
     * The number of units opened by the Trade
     * <p>
     * @param units the Amount as a BigDecimal
     * @return {@link TradeOpen TradeOpen}
     * @see DecimalNumber
     */
    public TradeOpen setUnits(BigDecimal units) {
        this.units = new DecimalNumber(units);
        return this;
    }

    @SerializedName("price") private PriceValue price;

    /**
     * Get the Units Opened Price
     * <p>
     * The average price that the units were opened at.
     * <p>
     * @return the Units Opened Price
     * @see PriceValue
     */
    public PriceValue getPrice() {
        return this.price;
    }

    /**
     * Set the Units Opened Price
     * <p>
     * The average price that the units were opened at.
     * <p>
     * @param price the Units Opened Price as a PriceValue
     * @return {@link TradeOpen TradeOpen}
     * @see PriceValue
     */
    public TradeOpen setPrice(PriceValue price) {
        this.price = price;
        return this;
    }
    /**
     * Set the Units Opened Price
     * <p>
     * The average price that the units were opened at.
     * <p>
     * @param price the Units Opened Price as a String
     * @return {@link TradeOpen TradeOpen}
     * @see PriceValue
     */
    public TradeOpen setPrice(String price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Units Opened Price
     * <p>
     * The average price that the units were opened at.
     * <p>
     * @param price the Units Opened Price as a double
     * @return {@link TradeOpen TradeOpen}
     * @see PriceValue
     */
    public TradeOpen setPrice(double price) {
        this.price = new PriceValue(price);
        return this;
    }
    /**
     * Set the Units Opened Price
     * <p>
     * The average price that the units were opened at.
     * <p>
     * @param price the Units Opened Price as a BigDecimal
     * @return {@link TradeOpen TradeOpen}
     * @see PriceValue
     */
    public TradeOpen setPrice(BigDecimal price) {
        this.price = new PriceValue(price);
        return this;
    }

    @SerializedName("clientExtensions") private ClientExtensions clientExtensions;

    /**
     * Get the Client Extensions
     * <p>
     * The client extensions for the newly opened Trade
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
     * The client extensions for the newly opened Trade
     * <p>
     * @param clientExtensions the Client Extensions as a ClientExtensions
     * @return {@link TradeOpen TradeOpen}
     * @see ClientExtensions
     */
    public TradeOpen setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

    @Override
    public String toString() {
        return "TradeOpen(" +
            "tradeID=" +
                (tradeID == null ? "null" : tradeID.toString()) + ", " +
            "units=" +
                (units == null ? "null" : units.toString()) + ", " +
            "price=" +
                (price == null ? "null" : price.toString()) + ", " +
            "clientExtensions=" +
                (clientExtensions == null ? "null" : clientExtensions.toString()) +
            ")";
    }
}
