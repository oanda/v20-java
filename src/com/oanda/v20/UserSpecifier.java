package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

/**
 * The specifier that refers to a User
 * <p>
 * A user specifier may have one of 3 formats: the OANDA-assigned User ID
 * (numerical), the client-provided username prefixed by the "@" symbol (e.g.
 * "@myusername"), or the "@" symbol. The "@" symbol on its own acts as an
 * alias for the username of the user accessing the endpoint (as inferred from
 * the token provided).
 */
@JsonAdapter(UserSpecifier.JsonAdapter.class)
public class UserSpecifier implements CharSequence {

    private String userSpecifier;

    /**
     * UserSpecifier constructor.
     * <p>
     * @param userSpecifier the UserSpecifier
     */
    public UserSpecifier(String userSpecifier) {
        this.userSpecifier = userSpecifier;
    }

    /**
     * Set the UserSpecifier
     * <p>
     * The specifier that refers to a User
     * <p>
     * @param userSpecifier the UserSpecifier
     */
    public void setUserSpecifier(String userSpecifier) {
        this.userSpecifier = userSpecifier;
    }

    /**
     * Get the UserSpecifier
     * <p>
     * The specifier that refers to a User
     * <p>
     * @return the UserSpecifier
     */
    public String getUserSpecifier() {
        return this.userSpecifier;
    }

    @Override
    public int length() {
        return userSpecifier.length();
    }

    @Override
    public char charAt(int index) {
        return userSpecifier.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return userSpecifier.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<UserSpecifier> {

        @Override
        public UserSpecifier read(JsonReader in) throws IOException {
            return new UserSpecifier(in.nextString());
        }

        @Override
        public void write(JsonWriter out, UserSpecifier obj) throws IOException {
            out.jsonValue('"'+obj.userSpecifier+'"');
        }
    }
}
