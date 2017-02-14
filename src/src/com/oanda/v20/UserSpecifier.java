package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

    // The specifier that refers to a User
@JsonAdapter(UserSpecifier.JsonAdapter.class)
public class UserSpecifier implements CharSequence {

    private String _UserSpecifier;

    public UserSpecifier(String _UserSpecifier) {
        this._UserSpecifier = _UserSpecifier;
    }

    public void set_UserSpecifier(String _UserSpecifier) {
        this._UserSpecifier = _UserSpecifier;
    }

    public String get_UserSpecifier() {
        return this._UserSpecifier;
    }

    @Override
    public int length() {
        return _UserSpecifier.length();
    }

    @Override
    public char charAt(int index) {
        return _UserSpecifier.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return _UserSpecifier.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<UserSpecifier> {

        @Override
        public UserSpecifier read(JsonReader in) throws IOException {
            return new UserSpecifier(in.nextString());
        }

        @Override
        public void write(JsonWriter out, UserSpecifier obj) throws IOException {
            out.jsonValue('"'+obj._UserSpecifier+'"');
        }
    }

}
