package com.oanda.v20.user;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import com.oanda.v20.primitives.StringPrimitive;

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
public class UserSpecifier extends StringPrimitive {

    /**
     * UserSpecifier copy constructor.
     * <p>
     * @param userSpecifier the 
     */
    public UserSpecifier(UserSpecifier userSpecifier)
    {
        super(userSpecifier.toString());
    }

    /**
     * UserSpecifier constructor.
     * <p>
     * @param userSpecifier the UserSpecifier as a String
     */
    public UserSpecifier(String userSpecifier) {
        super(userSpecifier);
    }

    /**
     * JSON adapter for reading and writing UserSpecifier0
     */
    public static class JsonAdapter extends TypeAdapter<UserSpecifier> {

        @Override
        public UserSpecifier read(JsonReader in) throws IOException {
            return new UserSpecifier(in.nextString());
        }

        @Override
        public void write(JsonWriter out, UserSpecifier obj) throws IOException {
            out.value(obj.toString());
        }
    }
}
