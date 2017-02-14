package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

    // The Trade's identifier, unique within the Trade's Account.
@JsonAdapter(TradeID.JsonAdapter.class)
public class TradeID implements CharSequence {

    private String _TradeID;

    public TradeID(String _TradeID) {
        this._TradeID = _TradeID;
    }

    public void set_TradeID(String _TradeID) {
        this._TradeID = _TradeID;
    }

    public String get_TradeID() {
        return this._TradeID;
    }

    @Override
    public int length() {
        return _TradeID.length();
    }

    @Override
    public char charAt(int index) {
        return _TradeID.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return _TradeID.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<TradeID> {

        @Override
        public TradeID read(JsonReader in) throws IOException {
            return new TradeID(in.nextString());
        }

        @Override
        public void write(JsonWriter out, TradeID obj) throws IOException {
            out.jsonValue('"'+obj._TradeID+'"');
        }
    }

}
