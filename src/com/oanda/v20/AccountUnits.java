package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

/**
 * The string representation of a quantity of an Account's home currency.
 * <p>
 * A decimal number encoded as a string. The amount of precision provided
 * depends on the Account's home currency.
 */
@JsonAdapter(AccountUnits.JsonAdapter.class)
public class AccountUnits implements CharSequence {

    private String accountUnits;

    /**
     * AccountUnits constructor.
     * <p>
     * @param accountUnits the AccountUnits
     */
    public AccountUnits(String accountUnits) {
        this.accountUnits = accountUnits;
    }

    /**
     * AccountUnits constructor.
     * <p>
     * @param accountUnits the AccountUnits as a double
     */
    public AccountUnits(double accountUnits) {
        this.accountUnits = String.valueOf(accountUnits);
    }

    /**
     * Set the AccountUnits
     * <p>
     * The string representation of a quantity of an Account's home currency.
     * <p>
     * @param accountUnits the AccountUnits
     */
    public void setAccountUnits(double accountUnits) {
        this.accountUnits = String.valueOf(accountUnits);
    }

    /**
     * Get the AccountUnits
     * <p>
     * The string representation of a quantity of an Account's home currency.
     * <p>
     * @return the AccountUnits
     */
    public double getAccountUnits() {
        return Double.valueOf(this.accountUnits);
    }

    @Override
    public int length() {
        return accountUnits.length();
    }

    @Override
    public char charAt(int index) {
        return accountUnits.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return accountUnits.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<AccountUnits> {

        @Override
        public AccountUnits read(JsonReader in) throws IOException {
            return new AccountUnits(in.nextString());
        }

        @Override
        public void write(JsonWriter out, AccountUnits obj) throws IOException {
            out.jsonValue('"'+obj.accountUnits+'"');
        }
    }
}
