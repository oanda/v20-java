package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

/**
 * A client-provided tag that can contain any data and may be assigned to their
 * Orders or Trades. Tags are typically used to associate groups of Trades
 * and/or Orders together.
 */
@JsonAdapter(ClientTag.JsonAdapter.class)
public class ClientTag implements CharSequence {

    private String clientTag;

    /**
     * ClientTag constructor.
     * <p>
     * @param clientTag the ClientTag
     */
    public ClientTag(String clientTag) {
        this.clientTag = clientTag;
    }

    /**
     * Set the ClientTag
     * <p>
     * A client-provided tag that can contain any data and may be assigned to
     * their Orders or Trades. Tags are typically used to associate groups of
     * Trades and/or Orders together.
     * <p>
     * @param clientTag the ClientTag
     */
    public void setClientTag(String clientTag) {
        this.clientTag = clientTag;
    }

    /**
     * Get the ClientTag
     * <p>
     * A client-provided tag that can contain any data and may be assigned to
     * their Orders or Trades. Tags are typically used to associate groups of
     * Trades and/or Orders together.
     * <p>
     * @return the ClientTag
     */
    public String getClientTag() {
        return this.clientTag;
    }

    @Override
    public int length() {
        return clientTag.length();
    }

    @Override
    public char charAt(int index) {
        return clientTag.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return clientTag.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<ClientTag> {

        @Override
        public ClientTag read(JsonReader in) throws IOException {
            return new ClientTag(in.nextString());
        }

        @Override
        public void write(JsonWriter out, ClientTag obj) throws IOException {
            out.jsonValue('"'+obj.clientTag+'"');
        }
    }
}
