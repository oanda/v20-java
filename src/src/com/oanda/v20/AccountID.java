package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

    // The string representation of an Account Identifier.
@JsonAdapter(AccountID.JsonAdapter.class)
public class AccountID implements CharSequence {

    private String _AccountID;

    public AccountID(String _AccountID) {
        this._AccountID = _AccountID;
    }

    public void set_AccountID(String _AccountID) {
        this._AccountID = _AccountID;
    }

    public String get_AccountID() {
        return this._AccountID;
    }

    @Override
    public int length() {
        return _AccountID.length();
    }

    @Override
    public char charAt(int index) {
        return _AccountID.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return _AccountID.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<AccountID> {

        @Override
        public AccountID read(JsonReader in) throws IOException {
            return new AccountID(in.nextString());
        }

        @Override
        public void write(JsonWriter out, AccountID obj) throws IOException {
            out.jsonValue('"'+obj._AccountID+'"');
        }
    }

}
