package com.oanda.v20.account;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import com.oanda.v20.primitives.StringPrimitive;

/**
 * The string representation of an Account Identifier.
 * <p>
 * "-"-delimited string with format
 * "{siteID}-{divisionID}-{userID}-{accountNumber}"
 */
@JsonAdapter(AccountID.JsonAdapter.class)
public class AccountID extends StringPrimitive {

    /**
     * AccountID copy constructor.
     * <p>
     * @param accountID the 
     */
    public AccountID(AccountID accountID)
    {
        super(accountID.toString());
    }

    /**
     * AccountID constructor.
     * <p>
     * @param accountID the AccountID as a String
     */
    public AccountID(String accountID) {
        super(accountID);
    }

    /**
     * JSON adapter for reading and writing AccountID0
     */
    public static class JsonAdapter extends TypeAdapter<AccountID> {

        @Override
        public AccountID read(JsonReader in) throws IOException {
            return new AccountID(in.nextString());
        }

        @Override
        public void write(JsonWriter out, AccountID obj) throws IOException {
            out.value(obj.toString());
        }
    }
}
