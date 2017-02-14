package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

    // The string representation of a decimal number.
@JsonAdapter(DecimalNumber.JsonAdapter.class)
public class DecimalNumber implements CharSequence {

    private String _DecimalNumber;

    // This is a number stored as a string
    public DecimalNumber(double _DecimalNumber) {
        this._DecimalNumber = String.valueOf(_DecimalNumber);
    }
    private DecimalNumber(String _DecimalNumber) {
        this._DecimalNumber = _DecimalNumber;
    }
    public void set_DecimalNumber(double _DecimalNumber) {
        this._DecimalNumber = String.valueOf(_DecimalNumber);
    }

    public double get_DecimalNumber() {
        return Double.valueOf(this._DecimalNumber);
    }


    @Override
    public int length() {
        return _DecimalNumber.length();
    }

    @Override
    public char charAt(int index) {
        return _DecimalNumber.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return _DecimalNumber.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<DecimalNumber> {

        @Override
        public DecimalNumber read(JsonReader in) throws IOException {
            return new DecimalNumber(in.nextString());
        }

        @Override
        public void write(JsonWriter out, DecimalNumber obj) throws IOException {
            out.jsonValue('"'+obj._DecimalNumber+'"');
        }
    }

}
