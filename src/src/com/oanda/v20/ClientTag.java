package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

    // A client-provided tag that can contain any data and may be assigned to
    // their Orders or Trades. Tags are typically used to associate groups of
    // Trades and/or Orders together.
@JsonAdapter(ClientTag.JsonAdapter.class)
public class ClientTag implements CharSequence {

    private String _ClientTag;

    public ClientTag(String _ClientTag) {
        this._ClientTag = _ClientTag;
    }

    public void set_ClientTag(String _ClientTag) {
        this._ClientTag = _ClientTag;
    }

    public String get_ClientTag() {
        return this._ClientTag;
    }

    @Override
    public int length() {
        return _ClientTag.length();
    }

    @Override
    public char charAt(int index) {
        return _ClientTag.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return _ClientTag.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<ClientTag> {

        @Override
        public ClientTag read(JsonReader in) throws IOException {
            return new ClientTag(in.nextString());
        }

        @Override
        public void write(JsonWriter out, ClientTag obj) throws IOException {
            out.jsonValue('"'+obj._ClientTag+'"');
        }
    }

}
