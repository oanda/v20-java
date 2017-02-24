package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

/**
 * The unique Transaction identifier within each Account.
 * <p>
 * String representation of the numerical OANDA-assigned TransactionID
 */
@JsonAdapter(TransactionID.JsonAdapter.class)
public class TransactionID implements CharSequence {

    private String transactionID;

    /**
     * TransactionID constructor.
     * <p>
     * @param transactionID the TransactionID
     */
    public TransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    /**
     * Set the TransactionID
     * <p>
     * The unique Transaction identifier within each Account.
     * <p>
     * @param transactionID the TransactionID
     */
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    /**
     * Get the TransactionID
     * <p>
     * The unique Transaction identifier within each Account.
     * <p>
     * @return the TransactionID
     */
    public String getTransactionID() {
        return this.transactionID;
    }

    @Override
    public int length() {
        return transactionID.length();
    }

    @Override
    public char charAt(int index) {
        return transactionID.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return transactionID.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<TransactionID> {

        @Override
        public TransactionID read(JsonReader in) throws IOException {
            return new TransactionID(in.nextString());
        }

        @Override
        public void write(JsonWriter out, TransactionID obj) throws IOException {
            out.jsonValue('"'+obj.transactionID+'"');
        }
    }
}
