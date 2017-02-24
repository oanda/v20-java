package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

/**
 * The Trade's identifier, unique within the Trade's Account.
 * <p>
 * The string representation of the OANDA-assigned TradeID. OANDA-assigned
 * TradeIDs are positive integers, and are derived from the TransactionID of
 * the Transaction that opened the Trade.
 */
@JsonAdapter(TradeID.JsonAdapter.class)
public class TradeID implements CharSequence {

    private String tradeID;

    /**
     * TradeID constructor.
     * <p>
     * @param tradeID the TradeID
     */
    public TradeID(String tradeID) {
        this.tradeID = tradeID;
    }

    /**
     * Set the TradeID
     * <p>
     * The Trade's identifier, unique within the Trade's Account.
     * <p>
     * @param tradeID the TradeID
     */
    public void setTradeID(String tradeID) {
        this.tradeID = tradeID;
    }

    /**
     * Get the TradeID
     * <p>
     * The Trade's identifier, unique within the Trade's Account.
     * <p>
     * @return the TradeID
     */
    public String getTradeID() {
        return this.tradeID;
    }

    @Override
    public int length() {
        return tradeID.length();
    }

    @Override
    public char charAt(int index) {
        return tradeID.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return tradeID.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<TradeID> {

        @Override
        public TradeID read(JsonReader in) throws IOException {
            return new TradeID(in.nextString());
        }

        @Override
        public void write(JsonWriter out, TradeID obj) throws IOException {
            out.jsonValue('"'+obj.tradeID+'"');
        }
    }
}
