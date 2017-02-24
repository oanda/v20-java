package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

/**
 * The string representation of an Account Identifier.
 * <p>
 * "-"-delimited string with format
 * "{siteID}-{divisionID}-{userID}-{accountNumber}"
 */
@JsonAdapter(AccountID.JsonAdapter.class)
public class AccountID implements CharSequence {

    private String accountID;

    /**
     * AccountID constructor.
     * <p>
     * @param accountID the AccountID
     */
    public AccountID(String accountID) {
        this.accountID = accountID;
    }

    /**
     * Set the AccountID
     * <p>
     * The string representation of an Account Identifier.
     * <p>
     * @param accountID the AccountID
     */
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    /**
     * Get the AccountID
     * <p>
     * The string representation of an Account Identifier.
     * <p>
     * @return the AccountID
     */
    public String getAccountID() {
        return this.accountID;
    }

    @Override
    public int length() {
        return accountID.length();
    }

    @Override
    public char charAt(int index) {
        return accountID.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return accountID.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<AccountID> {

        @Override
        public AccountID read(JsonReader in) throws IOException {
            return new AccountID(in.nextString());
        }

        @Override
        public void write(JsonWriter out, AccountID obj) throws IOException {
            out.jsonValue('"'+obj.accountID+'"');
        }
    }
}
