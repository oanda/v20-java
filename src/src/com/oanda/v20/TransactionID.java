package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

    // The unique Transaction identifier within each Account.
@JsonAdapter(TransactionID.JsonAdapter.class)
public class TransactionID implements CharSequence {

    private String _TransactionID;

    public TransactionID(String _TransactionID) {
        this._TransactionID = _TransactionID;
    }

    public void set_TransactionID(String _TransactionID) {
        this._TransactionID = _TransactionID;
    }

    public String get_TransactionID() {
        return this._TransactionID;
    }

    @Override
    public int length() {
        return _TransactionID.length();
    }

    @Override
    public char charAt(int index) {
        return _TransactionID.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return _TransactionID.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<TransactionID> {

        @Override
        public TransactionID read(JsonReader in) throws IOException {
            return new TransactionID(in.nextString());
        }

        @Override
        public void write(JsonWriter out, TransactionID obj) throws IOException {
            out.jsonValue('"'+obj._TransactionID+'"');
        }
    }

}
