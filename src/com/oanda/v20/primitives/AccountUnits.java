package com.oanda.v20.primitives;

import java.io.IOException;
import java.math.BigDecimal;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The string representation of a quantity of an Account's home currency.
 * <p>
 * A decimal number encoded as a string. The amount of precision provided
 * depends on the Account's home currency.
 */
@JsonAdapter(AccountUnits.JsonAdapter.class)
public class AccountUnits extends StringPrimitive {

    /**
     * AccountUnits copy constructor.
     * <p>
     * @param accountUnits the 
     */
    public AccountUnits(AccountUnits accountUnits)
    {
        super(accountUnits.toString());
    }

    /**
     * AccountUnits constructor.
     * <p>
     * @param accountUnits the AccountUnits as a String
     */
    public AccountUnits(String accountUnits) {
        super(accountUnits);
    }

    /**
     * AccountUnits constructor.
     * <p>
     * @param accountUnits the AccountUnits as a double
     */
    public AccountUnits(double accountUnits) {
        super(String.valueOf(accountUnits));
    }

    /**
     * AccountUnits constructor.
     * <p>
     * @param accountUnits the AccountUnits as a BigDecimal
     */
    public AccountUnits(BigDecimal accountUnits) {
        super(accountUnits.toPlainString());
    }

    /**
     * Get the AccountUnits
     * <p>
     * The string representation of a quantity of an Account's home currency.
     * <p>
     * @return the AccountUnits as a double
     * @see AccountUnits
     */
    public double doubleValue() {
        return Double.valueOf(this.string);
    }

    /**
     * Get the AccountUnits
     * <p>
     * The string representation of a quantity of an Account's home currency.
     * <p>
     * @return the AccountUnits as a BigDecimal
     * @see AccountUnits
     */
    public BigDecimal bigDecimalValue() {
        return new BigDecimal(this.string);
    }

    /**
     * JSON adapter for reading and writing AccountUnits0
     */
    public static class JsonAdapter extends TypeAdapter<AccountUnits> {

        @Override
        public AccountUnits read(JsonReader in) throws IOException {
            return new AccountUnits(in.nextString());
        }

        @Override
        public void write(JsonWriter out, AccountUnits obj) throws IOException {
            out.value(obj.toString());
        }
    }
}
