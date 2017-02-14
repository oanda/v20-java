package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

    // A client-provided identifier, used by clients to refer to their Orders
    // or Trades with an identifier that they have provided.
@JsonAdapter(ClientID.JsonAdapter.class)
public class ClientID implements CharSequence {

    private String _ClientID;

    public ClientID(String _ClientID) {
        this._ClientID = _ClientID;
    }

    public void set_ClientID(String _ClientID) {
        this._ClientID = _ClientID;
    }

    public String get_ClientID() {
        return this._ClientID;
    }

    @Override
    public int length() {
        return _ClientID.length();
    }

    @Override
    public char charAt(int index) {
        return _ClientID.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return _ClientID.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<ClientID> {

        @Override
        public ClientID read(JsonReader in) throws IOException {
            return new ClientID(in.nextString());
        }

        @Override
        public void write(JsonWriter out, ClientID obj) throws IOException {
            out.jsonValue('"'+obj._ClientID+'"');
        }
    }

}
