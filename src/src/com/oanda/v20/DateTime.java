package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

    // A date and time value using either RFC3339 or UNIX time representation.
@JsonAdapter(DateTime.JsonAdapter.class)
public class DateTime implements CharSequence {

    private String _DateTime;

    public DateTime(String _DateTime) {
        this._DateTime = _DateTime;
    }

    public void set_DateTime(String _DateTime) {
        this._DateTime = _DateTime;
    }

    public String get_DateTime() {
        return this._DateTime;
    }

    @Override
    public int length() {
        return _DateTime.length();
    }

    @Override
    public char charAt(int index) {
        return _DateTime.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return _DateTime.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<DateTime> {

        @Override
        public DateTime read(JsonReader in) throws IOException {
            return new DateTime(in.nextString());
        }

        @Override
        public void write(JsonWriter out, DateTime obj) throws IOException {
            out.jsonValue('"'+obj._DateTime+'"');
        }
    }

}
