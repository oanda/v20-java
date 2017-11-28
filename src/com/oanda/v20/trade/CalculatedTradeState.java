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
        this.marginUsed = other.marginUsed;
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

    @SerializedName("marginUsed") private AccountUnits marginUsed;

    /**
     * Get the Margin Used
     * <p>
     * Margin currently used by the Trade.
     * <p>
     * @return the Margin Used
     * @see AccountUnits
     */
    public AccountUnits getMarginUsed() {
        return this.marginUsed;
    }

    /**
     * Set the Margin Used
     * <p>
     * Margin currently used by the Trade.
     * <p>
     * @param marginUsed the Margin Used as an AccountUnits
     * @return {@link CalculatedTradeState CalculatedTradeState}
     * @see AccountUnits
     */
    public CalculatedTradeState setMarginUsed(AccountUnits marginUsed) {
        this.marginUsed = marginUsed;
        return this;
    }
    /**
     * Set the Margin Used
     * <p>
     * Margin currently used by the Trade.
     * <p>
     * @param marginUsed the Margin Used as a String
     * @return {@link CalculatedTradeState CalculatedTradeState}
     * @see AccountUnits
     */
    public CalculatedTradeState setMarginUsed(String marginUsed) {
        this.marginUsed = new AccountUnits(marginUsed);
        return this;
    }
    /**
     * Set the Margin Used
     * <p>
     * Margin currently used by the Trade.
     * <p>
     * @param marginUsed the Margin Used as a double
     * @return {@link CalculatedTradeState CalculatedTradeState}
     * @see AccountUnits
     */
    public CalculatedTradeState setMarginUsed(double marginUsed) {
        this.marginUsed = new AccountUnits(marginUsed);
        return this;
    }
    /**
     * Set the Margin Used
     * <p>
     * Margin currently used by the Trade.
     * <p>
     * @param marginUsed the Margin Used as a BigDecimal
     * @return {@link CalculatedTradeState CalculatedTradeState}
     * @see AccountUnits
     */
    public CalculatedTradeState setMarginUsed(BigDecimal marginUsed) {
        this.marginUsed = new AccountUnits(marginUsed);
        return this;
    }

    @Override
    public String toString() {
        return "CalculatedTradeState(" +
            "id=" +
                (id == null ? "null" : id.toString()) + ", " +
            "unrealizedPL=" +
                (unrealizedPL == null ? "null" : unrealizedPL.toString()) + ", " +
            "marginUsed=" +
                (marginUsed == null ? "null" : marginUsed.toString()) +
            ")";
    }
}
