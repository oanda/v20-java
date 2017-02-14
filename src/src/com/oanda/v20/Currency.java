package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

    // Currency name identifier. Used by clients to refer to currencies.
@JsonAdapter(Currency.JsonAdapter.class)
public class Currency implements CharSequence {

    private String _Currency;

    public Currency(String _Currency) {
        this._Currency = _Currency;
    }

    public void set_Currency(String _Currency) {
        this._Currency = _Currency;
    }

    public String get_Currency() {
        return this._Currency;
    }

    @Override
    public int length() {
        return _Currency.length();
    }

    @Override
    public char charAt(int index) {
        return _Currency.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return _Currency.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<Currency> {

        @Override
        public Currency read(JsonReader in) throws IOException {
            return new Currency(in.nextString());
        }

        @Override
        public void write(JsonWriter out, Currency obj) throws IOException {
            out.jsonValue('"'+obj._Currency+'"');
        }
    }

}
