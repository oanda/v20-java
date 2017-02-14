package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

    // Instrument name identifier. Used by clients to refer to an Instrument.
@JsonAdapter(InstrumentName.JsonAdapter.class)
public class InstrumentName implements CharSequence {

    private String _InstrumentName;

    public InstrumentName(String _InstrumentName) {
        this._InstrumentName = _InstrumentName;
    }

    public void set_InstrumentName(String _InstrumentName) {
        this._InstrumentName = _InstrumentName;
    }

    public String get_InstrumentName() {
        return this._InstrumentName;
    }

    @Override
    public int length() {
        return _InstrumentName.length();
    }

    @Override
    public char charAt(int index) {
        return _InstrumentName.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return _InstrumentName.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<InstrumentName> {

        @Override
        public InstrumentName read(JsonReader in) throws IOException {
            return new InstrumentName(in.nextString());
        }

        @Override
        public void write(JsonWriter out, InstrumentName obj) throws IOException {
            out.jsonValue('"'+obj._InstrumentName+'"');
        }
    }

}
