package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * A TradeOpen object represents a Trade for an instrument that was opened in
 * an Account. It is found embedded in Transactions that affect the position of
 * an instrument in the Account, specifically the OrderFill Transaction.
 */
public class TradeOpen {

    @SerializedName("tradeID") private TradeID tradeID;

    /**
     * Set the Trade ID
     * <p>
     * The ID of the Trade that was opened
     * <p>
     * @param tradeID the Trade ID
     * @return {@link TradeOpen TradeOpen}
     * @see TradeID
     */
    public TradeOpen setTradeID(String tradeID) {
        this.tradeID = new TradeID(tradeID);
        return this;
    }

    /**
     * Get the Trade ID
     * <p>
     * The ID of the Trade that was opened
     * <p>
     * @return the Trade ID
     * @see TradeID
     */
    public String getTradeID() {
        return this.tradeID.getTradeID();
    }

    @SerializedName("units") private DecimalNumber units;

    /**
     * Set the Amount
     * <p>
     * The number of units opened by the Trade
     * <p>
     * @param units the Amount
     * @return {@link TradeOpen TradeOpen}
     * @see DecimalNumber
     */
    public TradeOpen setUnits(double units) {
        this.units = new DecimalNumber(units);
        return this;
    }

    /**
     * Get the Amount
     * <p>
     * The number of units opened by the Trade
     * <p>
     * @return the Amount
     * @see DecimalNumber
     */
    public double getUnits() {
        return this.units.getDecimalNumber();
    }

    @SerializedName("clientExtensions") private ClientExtensions clientExtensions;

    /**
     * Set the Client Extensions
     * <p>
     * The client extensions for the newly opened Trade
     * <p>
     * @param clientExtensions the Client Extensions
     * @return {@link TradeOpen TradeOpen}
     * @see ClientExtensions
     */
    public TradeOpen setClientExtensions(ClientExtensions clientExtensions) {
        this.clientExtensions = clientExtensions;
        return this;
    }

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
}
