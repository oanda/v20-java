package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

    // A client-provided comment that can contain any data and may be assigned
    // to their Orders or Trades. Comments are typically used to provide extra
    // context or meaning to an Order or Trade.
@JsonAdapter(ClientComment.JsonAdapter.class)
public class ClientComment implements CharSequence {

    private String _ClientComment;

    public ClientComment(String _ClientComment) {
        this._ClientComment = _ClientComment;
    }

    public void set_ClientComment(String _ClientComment) {
        this._ClientComment = _ClientComment;
    }

    public String get_ClientComment() {
        return this._ClientComment;
    }

    @Override
    public int length() {
        return _ClientComment.length();
    }

    @Override
    public char charAt(int index) {
        return _ClientComment.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return _ClientComment.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<ClientComment> {

        @Override
        public ClientComment read(JsonReader in) throws IOException {
            return new ClientComment(in.nextString());
        }

        @Override
        public void write(JsonWriter out, ClientComment obj) throws IOException {
            out.jsonValue('"'+obj._ClientComment+'"');
        }
    }

}
