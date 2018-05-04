package com.oanda.v20.transaction;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import com.oanda.v20.primitives.StringPrimitive;

/**
 * A client-provided comment that can contain any data and may be assigned to
 * their Orders or Trades. Comments are typically used to provide extra context
 * or meaning to an Order or Trade.
 */
@JsonAdapter(ClientComment.JsonAdapter.class)
public class ClientComment extends StringPrimitive {

    /**
     * ClientComment copy constructor.
     * <p>
     * @param clientComment the 
     */
    public ClientComment(ClientComment clientComment)
    {
        super(clientComment.toString());
    }

    /**
     * ClientComment constructor.
     * <p>
     * @param clientComment the ClientComment as a String
     */
    public ClientComment(String clientComment) {
        super(clientComment);
    }

    /**
     * JSON adapter for reading and writing ClientComment0
     */
    public static class JsonAdapter extends TypeAdapter<ClientComment> {

        @Override
        public ClientComment read(JsonReader in) throws IOException {
            return new ClientComment(in.nextString());
        }

        @Override
        public void write(JsonWriter out, ClientComment obj) throws IOException {
            out.value(obj.toString());
        }
    }
}
