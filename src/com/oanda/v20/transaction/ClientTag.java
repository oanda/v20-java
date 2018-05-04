package com.oanda.v20.transaction;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import com.oanda.v20.primitives.StringPrimitive;

/**
 * A client-provided tag that can contain any data and may be assigned to their
 * Orders or Trades. Tags are typically used to associate groups of Trades
 * and/or Orders together.
 */
@JsonAdapter(ClientTag.JsonAdapter.class)
public class ClientTag extends StringPrimitive {

    /**
     * ClientTag copy constructor.
     * <p>
     * @param clientTag the 
     */
    public ClientTag(ClientTag clientTag)
    {
        super(clientTag.toString());
    }

    /**
     * ClientTag constructor.
     * <p>
     * @param clientTag the ClientTag as a String
     */
    public ClientTag(String clientTag) {
        super(clientTag);
    }

    /**
     * JSON adapter for reading and writing ClientTag0
     */
    public static class JsonAdapter extends TypeAdapter<ClientTag> {

        @Override
        public ClientTag read(JsonReader in) throws IOException {
            return new ClientTag(in.nextString());
        }

        @Override
        public void write(JsonWriter out, ClientTag obj) throws IOException {
            out.value(obj.toString());
        }
    }
}
