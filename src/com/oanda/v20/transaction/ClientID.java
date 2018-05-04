package com.oanda.v20.transaction;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import com.oanda.v20.primitives.StringPrimitive;

/**
 * A client-provided identifier, used by clients to refer to their Orders or
 * Trades with an identifier that they have provided.
 */
@JsonAdapter(ClientID.JsonAdapter.class)
public class ClientID extends StringPrimitive {

    /**
     * ClientID copy constructor.
     * <p>
     * @param clientID the 
     */
    public ClientID(ClientID clientID)
    {
        super(clientID.toString());
    }

    /**
     * ClientID constructor.
     * <p>
     * @param clientID the ClientID as a String
     */
    public ClientID(String clientID) {
        super(clientID);
    }

    /**
     * JSON adapter for reading and writing ClientID0
     */
    public static class JsonAdapter extends TypeAdapter<ClientID> {

        @Override
        public ClientID read(JsonReader in) throws IOException {
            return new ClientID(in.nextString());
        }

        @Override
        public void write(JsonWriter out, ClientID obj) throws IOException {
            out.value(obj.toString());
        }
    }
}
