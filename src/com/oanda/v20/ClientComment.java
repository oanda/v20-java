package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

/**
 * A client-provided comment that can contain any data and may be assigned to
 * their Orders or Trades. Comments are typically used to provide extra context
 * or meaning to an Order or Trade.
 */
@JsonAdapter(ClientComment.JsonAdapter.class)
public class ClientComment implements CharSequence {

    private String clientComment;

    /**
     * ClientComment constructor.
     * <p>
     * @param clientComment the ClientComment
     */
    public ClientComment(String clientComment) {
        this.clientComment = clientComment;
    }

    /**
     * Set the ClientComment
     * <p>
     * A client-provided comment that can contain any data and may be assigned
     * to their Orders or Trades. Comments are typically used to provide extra
     * context or meaning to an Order or Trade.
     * <p>
     * @param clientComment the ClientComment
     */
    public void setClientComment(String clientComment) {
        this.clientComment = clientComment;
    }

    /**
     * Get the ClientComment
     * <p>
     * A client-provided comment that can contain any data and may be assigned
     * to their Orders or Trades. Comments are typically used to provide extra
     * context or meaning to an Order or Trade.
     * <p>
     * @return the ClientComment
     */
    public String getClientComment() {
        return this.clientComment;
    }

    @Override
    public int length() {
        return clientComment.length();
    }

    @Override
    public char charAt(int index) {
        return clientComment.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return clientComment.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<ClientComment> {

        @Override
        public ClientComment read(JsonReader in) throws IOException {
            return new ClientComment(in.nextString());
        }

        @Override
        public void write(JsonWriter out, ClientComment obj) throws IOException {
            out.jsonValue('"'+obj.clientComment+'"');
        }
    }
}
