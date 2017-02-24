package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

/**
 * The identification of a Trade as referred to by clients
 * <p>
 * Either the Trade's OANDA-assigned TradeID or the Trade's client-provided
 * ClientID prefixed by the "@" symbol
 */
@JsonAdapter(TradeSpecifier.JsonAdapter.class)
public class TradeSpecifier implements CharSequence {

    private String tradeSpecifier;

    /**
     * TradeSpecifier constructor.
     * <p>
     * @param tradeSpecifier the TradeSpecifier
     */
    public TradeSpecifier(String tradeSpecifier) {
        this.tradeSpecifier = tradeSpecifier;
    }

    /**
     * Set the TradeSpecifier
     * <p>
     * The identification of a Trade as referred to by clients
     * <p>
     * @param tradeSpecifier the TradeSpecifier
     */
    public void setTradeSpecifier(String tradeSpecifier) {
        this.tradeSpecifier = tradeSpecifier;
    }

    /**
     * Get the TradeSpecifier
     * <p>
     * The identification of a Trade as referred to by clients
     * <p>
     * @return the TradeSpecifier
     */
    public String getTradeSpecifier() {
        return this.tradeSpecifier;
    }

    @Override
    public int length() {
        return tradeSpecifier.length();
    }

    @Override
    public char charAt(int index) {
        return tradeSpecifier.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return tradeSpecifier.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<TradeSpecifier> {

        @Override
        public TradeSpecifier read(JsonReader in) throws IOException {
            return new TradeSpecifier(in.nextString());
        }

        @Override
        public void write(JsonWriter out, TradeSpecifier obj) throws IOException {
            out.jsonValue('"'+obj.tradeSpecifier+'"');
        }
    }
}
