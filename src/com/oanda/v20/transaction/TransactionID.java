package com.oanda.v20.transaction;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import com.oanda.v20.primitives.StringPrimitive;

/**
 * The unique Transaction identifier within each Account.
 * <p>
 * String representation of the numerical OANDA-assigned TransactionID
 */
@JsonAdapter(TransactionID.JsonAdapter.class)
public class TransactionID extends StringPrimitive {

    /**
     * TransactionID copy constructor.
     * <p>
     * @param transactionID the 
     */
    public TransactionID(TransactionID transactionID)
    {
        super(transactionID.toString());
    }

    /**
     * TransactionID constructor.
     * <p>
     * @param transactionID the TransactionID as a String
     */
    public TransactionID(String transactionID) {
        super(transactionID);
    }

    /**
     * JSON adapter for reading and writing TransactionID0
     */
    public static class JsonAdapter extends TypeAdapter<TransactionID> {

        @Override
        public TransactionID read(JsonReader in) throws IOException {
            return new TransactionID(in.nextString());
        }

        @Override
        public void write(JsonWriter out, TransactionID obj) throws IOException {
            out.value(obj.toString());
        }
    }
}
