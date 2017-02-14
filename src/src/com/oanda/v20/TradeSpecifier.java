package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

    // The identification of a Trade as referred to by clients
@JsonAdapter(TradeSpecifier.JsonAdapter.class)
public class TradeSpecifier implements CharSequence {

    private String _TradeSpecifier;

    public TradeSpecifier(String _TradeSpecifier) {
        this._TradeSpecifier = _TradeSpecifier;
    }

    public void set_TradeSpecifier(String _TradeSpecifier) {
        this._TradeSpecifier = _TradeSpecifier;
    }

    public String get_TradeSpecifier() {
        return this._TradeSpecifier;
    }

    @Override
    public int length() {
        return _TradeSpecifier.length();
    }

    @Override
    public char charAt(int index) {
        return _TradeSpecifier.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return _TradeSpecifier.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<TradeSpecifier> {

        @Override
        public TradeSpecifier read(JsonReader in) throws IOException {
            return new TradeSpecifier(in.nextString());
        }

        @Override
        public void write(JsonWriter out, TradeSpecifier obj) throws IOException {
            out.jsonValue('"'+obj._TradeSpecifier+'"');
        }
    }

}
