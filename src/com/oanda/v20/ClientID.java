package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

/**
 * A client-provided identifier, used by clients to refer to their Orders or
 * Trades with an identifier that they have provided.
 */
@JsonAdapter(ClientID.JsonAdapter.class)
public class ClientID implements CharSequence {

    private String clientID;

    /**
     * ClientID constructor.
     * <p>
     * @param clientID the ClientID
     */
    public ClientID(String clientID) {
        this.clientID = clientID;
    }

    /**
     * Set the ClientID
     * <p>
     * A client-provided identifier, used by clients to refer to their Orders
     * or Trades with an identifier that they have provided.
     * <p>
     * @param clientID the ClientID
     */
    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    /**
     * Get the ClientID
     * <p>
     * A client-provided identifier, used by clients to refer to their Orders
     * or Trades with an identifier that they have provided.
     * <p>
     * @return the ClientID
     */
    public String getClientID() {
        return this.clientID;
    }

    @Override
    public int length() {
        return clientID.length();
    }

    @Override
    public char charAt(int index) {
        return clientID.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return clientID.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<ClientID> {

        @Override
        public ClientID read(JsonReader in) throws IOException {
            return new ClientID(in.nextString());
        }

        @Override
        public void write(JsonWriter out, ClientID obj) throws IOException {
            out.jsonValue('"'+obj.clientID+'"');
        }
    }
}
