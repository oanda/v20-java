package com.oanda.v20.instrument;

import com.google.gson.annotations.SerializedName;

/**
 * InstrumentPositionBookResponse
 */
public class InstrumentPositionBookResponse {

    /**
     * InstrumentPositionBookResponse Constructor
     * <p>
     * Construct a new InstrumentPositionBookResponse
     */
    private InstrumentPositionBookResponse() {
    }

    @SerializedName("positionBook") private PositionBook positionBook;

    /**
     * Get the positionBook
     * <p>
     * The instrument's position book
     * <p>
     * @return the positionBook
     * @see PositionBook
     */
    public PositionBook getPositionBook() {
        return this.positionBook;
    }
}
