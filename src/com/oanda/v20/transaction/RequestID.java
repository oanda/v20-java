package com.oanda.v20.transaction;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import com.oanda.v20.primitives.StringPrimitive;

/**
 * The request identifier.
 */
@JsonAdapter(RequestID.JsonAdapter.class)
public class RequestID extends StringPrimitive {

    /**
     * RequestID copy constructor.
     * <p>
     * @param requestID the 
     */
    public RequestID(RequestID requestID)
    {
        super(requestID.toString());
    }

    /**
     * RequestID constructor.
     * <p>
     * @param requestID the RequestID as a String
     */
    public RequestID(String requestID) {
        super(requestID);
    }

    /**
     * JSON adapter for reading and writing RequestID0
     */
    public static class JsonAdapter extends TypeAdapter<RequestID> {

        @Override
        public RequestID read(JsonReader in) throws IOException {
            return new RequestID(in.nextString());
        }

        @Override
        public void write(JsonWriter out, RequestID obj) throws IOException {
            out.value(obj.toString());
        }
    }
}
