package com.oanda.v20.trade;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import com.oanda.v20.primitives.StringPrimitive;
import com.oanda.v20.transaction.TransactionID;

/**
 * The Trade's identifier, unique within the Trade's Account.
 * <p>
 * The string representation of the OANDA-assigned TradeID. OANDA-assigned
 * TradeIDs are positive integers, and are derived from the TransactionID of
 * the Transaction that opened the Trade.
 */
@JsonAdapter(TradeID.JsonAdapter.class)
public class TradeID extends StringPrimitive {

    /**
     * TradeID copy constructor.
     * <p>
     * @param tradeID the 
     */
    public TradeID(TradeID tradeID)
    {
        super(tradeID.toString());
    }

    /**
     * TradeID constructor.
     * <p>
     * @param tradeID the TradeID as a String
     */
    public TradeID(String tradeID) {
        super(tradeID);
    }

    /**
     * Construct a TradeID from a TransactionID
     * <p>
     * @param transactionID the TransactionID to convert
     */
    public TradeID(TransactionID transactionID) {
        super(transactionID.toString());
    }

    /**
     * JSON adapter for reading and writing TradeID0
     */
    public static class JsonAdapter extends TypeAdapter<TradeID> {

        @Override
        public TradeID read(JsonReader in) throws IOException {
            return new TradeID(in.nextString());
        }

        @Override
        public void write(JsonWriter out, TradeID obj) throws IOException {
            out.value(obj.toString());
        }
    }
}
