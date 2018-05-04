package com.oanda.v20.trade;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import com.oanda.v20.primitives.StringPrimitive;
import com.oanda.v20.transaction.TransactionID;

/**
 * The identification of a Trade as referred to by clients
 * <p>
 * Either the Trade's OANDA-assigned TradeID or the Trade's client-provided
 * ClientID prefixed by the "@" symbol
 */
@JsonAdapter(TradeSpecifier.JsonAdapter.class)
public class TradeSpecifier extends StringPrimitive {

    /**
     * TradeSpecifier copy constructor.
     * <p>
     * @param tradeSpecifier the 
     */
    public TradeSpecifier(TradeSpecifier tradeSpecifier)
    {
        super(tradeSpecifier.toString());
    }

    /**
     * TradeSpecifier constructor.
     * <p>
     * @param tradeSpecifier the TradeSpecifier as a String
     */
    public TradeSpecifier(String tradeSpecifier) {
        super(tradeSpecifier);
    }

    /**
     * Construct a TradeSpecifier from a TradeID
     * <p>
     * @param tradeID the TradeID to convert
     */
    public TradeSpecifier(TradeID tradeID) {
        super(tradeID.toString());
    }

    /**
     * Construct a TradeSpecifier from a TransactionID
     * <p>
     * @param transactionID the TransactionID to convert
     */
    public TradeSpecifier(TransactionID transactionID) {
        super(transactionID.toString());
    }

    /**
     * JSON adapter for reading and writing TradeSpecifier0
     */
    public static class JsonAdapter extends TypeAdapter<TradeSpecifier> {

        @Override
        public TradeSpecifier read(JsonReader in) throws IOException {
            return new TradeSpecifier(in.nextString());
        }

        @Override
        public void write(JsonWriter out, TradeSpecifier obj) throws IOException {
            out.value(obj.toString());
        }
    }
}
