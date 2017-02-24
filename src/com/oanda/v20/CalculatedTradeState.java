package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * The dynamic (calculated) state of an open Trade
 */
public class CalculatedTradeState {

    @SerializedName("id") private TradeID id;

    /**
     * Set the Trade ID
     * <p>
     * The Trade's ID.
     * <p>
     * @param id the Trade ID
     * @return {@link CalculatedTradeState CalculatedTradeState}
     * @see TradeID
     */
    public CalculatedTradeState setId(String id) {
        this.id = new TradeID(id);
        return this;
    }

    /**
     * Get the Trade ID
     * <p>
     * The Trade's ID.
     * <p>
     * @return the Trade ID
     * @see TradeID
     */
    public String getId() {
        return this.id.getTradeID();
    }

    @SerializedName("unrealizedPL") private AccountUnits unrealizedPL;

    /**
     * Set the Trade UPL
     * <p>
     * The Trade's unrealized profit/loss.
     * <p>
     * @param unrealizedPL the Trade UPL
     * @return {@link CalculatedTradeState CalculatedTradeState}
     * @see AccountUnits
     */
    public CalculatedTradeState setUnrealizedPL(double unrealizedPL) {
        this.unrealizedPL = new AccountUnits(unrealizedPL);
        return this;
    }

    /**
     * Get the Trade UPL
     * <p>
     * The Trade's unrealized profit/loss.
     * <p>
     * @return the Trade UPL
     * @see AccountUnits
     */
    public double getUnrealizedPL() {
        return this.unrealizedPL.getAccountUnits();
    }
}
