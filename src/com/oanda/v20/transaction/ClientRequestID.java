package com.oanda.v20.transaction;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import com.oanda.v20.primitives.StringPrimitive;

/**
 * A client provided request identifier.
 */
@JsonAdapter(ClientRequestID.JsonAdapter.class)
public class ClientRequestID extends StringPrimitive {

    /**
     * ClientRequestID copy constructor.
     * <p>
     * @param clientRequestID the 
     */
    public ClientRequestID(ClientRequestID clientRequestID)
    {
        super(clientRequestID.toString());
    }

    /**
     * ClientRequestID constructor.
     * <p>
     * @param clientRequestID the ClientRequestID as a String
     */
    public ClientRequestID(String clientRequestID) {
        super(clientRequestID);
    }

    /**
     * JSON adapter for reading and writing ClientRequestID0
     */
    public static class JsonAdapter extends TypeAdapter<ClientRequestID> {

        @Override
        public ClientRequestID read(JsonReader in) throws IOException {
            return new ClientRequestID(in.nextString());
        }

        @Override
        public void write(JsonWriter out, ClientRequestID obj) throws IOException {
            out.value(obj.toString());
        }
    }
}
