package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

/**
 * The request identifier. Used by administrators to refer to a client's
 * request.
 */
@JsonAdapter(RequestID.JsonAdapter.class)
public class RequestID implements CharSequence {

    private String requestID;

    /**
     * RequestID constructor.
     * <p>
     * @param requestID the RequestID
     */
    public RequestID(String requestID) {
        this.requestID = requestID;
    }

    /**
     * Set the RequestID
     * <p>
     * The request identifier. Used by administrators to refer to a client's
     * request.
     * <p>
     * @param requestID the RequestID
     */
    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    /**
     * Get the RequestID
     * <p>
     * The request identifier. Used by administrators to refer to a client's
     * request.
     * <p>
     * @return the RequestID
     */
    public String getRequestID() {
        return this.requestID;
    }

    @Override
    public int length() {
        return requestID.length();
    }

    @Override
    public char charAt(int index) {
        return requestID.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return requestID.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<RequestID> {

        @Override
        public RequestID read(JsonReader in) throws IOException {
            return new RequestID(in.nextString());
        }

        @Override
        public void write(JsonWriter out, RequestID obj) throws IOException {
            out.jsonValue('"'+obj.requestID+'"');
        }
    }
}
