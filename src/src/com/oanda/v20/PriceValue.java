package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

    // The string representation of a Price for an Instrument.
@JsonAdapter(PriceValue.JsonAdapter.class)
public class PriceValue implements CharSequence {

    private String _PriceValue;

    // This is a number stored as a string
    public PriceValue(double _PriceValue) {
        this._PriceValue = String.valueOf(_PriceValue);
    }
    private PriceValue(String _PriceValue) {
        this._PriceValue = _PriceValue;
    }
    public void set_PriceValue(double _PriceValue) {
        this._PriceValue = String.valueOf(_PriceValue);
    }

    public double get_PriceValue() {
        return Double.valueOf(this._PriceValue);
    }


    @Override
    public int length() {
        return _PriceValue.length();
    }

    @Override
    public char charAt(int index) {
        return _PriceValue.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return _PriceValue.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<PriceValue> {

        @Override
        public PriceValue read(JsonReader in) throws IOException {
            return new PriceValue(in.nextString());
        }

        @Override
        public void write(JsonWriter out, PriceValue obj) throws IOException {
            out.jsonValue('"'+obj._PriceValue+'"');
        }
    }

}
