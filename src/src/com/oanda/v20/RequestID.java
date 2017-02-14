package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

    // The request identifier. Used by administrators to refer to a client's
    // request.
@JsonAdapter(RequestID.JsonAdapter.class)
public class RequestID implements CharSequence {

    private String _RequestID;

    public RequestID(String _RequestID) {
        this._RequestID = _RequestID;
    }

    public void set_RequestID(String _RequestID) {
        this._RequestID = _RequestID;
    }

    public String get_RequestID() {
        return this._RequestID;
    }

    @Override
    public int length() {
        return _RequestID.length();
    }

    @Override
    public char charAt(int index) {
        return _RequestID.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return _RequestID.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<RequestID> {

        @Override
        public RequestID read(JsonReader in) throws IOException {
            return new RequestID(in.nextString());
        }

        @Override
        public void write(JsonWriter out, RequestID obj) throws IOException {
            out.jsonValue('"'+obj._RequestID+'"');
        }
    }

}
