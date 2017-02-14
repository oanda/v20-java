package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

    // The string representation of a quantity of an Account's home currency.
@JsonAdapter(AccountUnits.JsonAdapter.class)
public class AccountUnits implements CharSequence {

    private String _AccountUnits;

    // This is a number stored as a string
    public AccountUnits(double _AccountUnits) {
        this._AccountUnits = String.valueOf(_AccountUnits);
    }
    private AccountUnits(String _AccountUnits) {
        this._AccountUnits = _AccountUnits;
    }
    public void set_AccountUnits(double _AccountUnits) {
        this._AccountUnits = String.valueOf(_AccountUnits);
    }

    public double get_AccountUnits() {
        return Double.valueOf(this._AccountUnits);
    }


    @Override
    public int length() {
        return _AccountUnits.length();
    }

    @Override
    public char charAt(int index) {
        return _AccountUnits.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return _AccountUnits.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<AccountUnits> {

        @Override
        public AccountUnits read(JsonReader in) throws IOException {
            return new AccountUnits(in.nextString());
        }

        @Override
        public void write(JsonWriter out, AccountUnits obj) throws IOException {
            out.jsonValue('"'+obj._AccountUnits+'"');
        }
    }

}
