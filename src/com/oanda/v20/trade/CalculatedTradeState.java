package com.oanda.v20.trade;

import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.primitives.AccountUnits;

/**
 * The dynamic (calculated) state of an open Trade
 */
public class CalculatedTradeState {

    /**
     * Default constructor.
     */
    public CalculatedTradeState() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the CalculatedTradeState to copy
     */
    public CalculatedTradeState(CalculatedTradeState other) {
        this.id = other.id;
        this.unrealizedPL = other.unrealizedPL;
    }

    @SerializedName("id") private TradeID id;

    /**
     * Get the Trade ID
     * <p>
     * The Trade's ID.
     * <p>
     * @return the Trade ID
     * @see TradeID
     */
    public TradeID getId() {
        return this.id;
    }

    /**
     * Set the Trade ID
     * <p>
     * The Trade's ID.
     * <p>
     * @param id the Trade ID as a TradeID
     * @return {@link CalculatedTradeState CalculatedTradeState}
     * @see TradeID
     */
    public CalculatedTradeState setId(TradeID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Trade ID
     * <p>
     * The Trade's ID.
     * <p>
     * @param id the Trade ID as a String
     * @return {@link CalculatedTradeState CalculatedTradeState}
     * @see TradeID
     */
    public CalculatedTradeState setId(String id) {
        this.id = new TradeID(id);
        return this;
    }

    @SerializedName("unrealizedPL") private AccountUnits unrealizedPL;

    /**
     * Get the Trade UPL
     * <p>
     * The Trade's unrealized profit/loss.
     * <p>
     * @return the Trade UPL
     * @see AccountUnits
     */
    public AccountUnits getUnrealizedPL() {
        return this.unrealizedPL;
    }

    /**
     * Set the Trade UPL
     * <p>
     * The Trade's unrealized profit/loss.
     * <p>
     * @param unrealizedPL the Trade UPL as an AccountUnits
     * @return {@link CalculatedTradeState CalculatedTradeState}
     * @see AccountUnits
     */
    public CalculatedTradeState setUnrealizedPL(AccountUnits unrealizedPL) {
        this.unrealizedPL = unrealizedPL;
        return this;
    }
    /**
     * Set the Trade UPL
     * <p>
     * The Trade's unrealized profit/loss.
     * <p>
     * @param unrealizedPL the Trade UPL as a String
     * @return {@link CalculatedTradeState CalculatedTradeState}
     * @see AccountUnits
     */
    public CalculatedTradeState setUnrealizedPL(String unrealizedPL) {
        this.unrealizedPL = new AccountUnits(unrealizedPL);
        return this;
    }
    /**
     * Set the Trade UPL
     * <p>
     * The Trade's unrealized profit/loss.
     * <p>
     * @param unrealizedPL the Trade UPL as a double
     * @return {@link CalculatedTradeState CalculatedTradeState}
     * @see AccountUnits
     */
    public CalculatedTradeState setUnrealizedPL(double unrealizedPL) {
        this.unrealizedPL = new AccountUnits(unrealizedPL);
        return this;
    }
    /**
     * Set the Trade UPL
     * <p>
     * The Trade's unrealized profit/loss.
     * <p>
     * @param unrealizedPL the Trade UPL as a BigDecimal
     * @return {@link CalculatedTradeState CalculatedTradeState}
     * @see AccountUnits
     */
    public CalculatedTradeState setUnrealizedPL(BigDecimal unrealizedPL) {
        this.unrealizedPL = new AccountUnits(unrealizedPL);
        return this;
    }
}
