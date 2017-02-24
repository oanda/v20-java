package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

/**
 * Currency name identifier. Used by clients to refer to currencies.
 * <p>
 * A string containing an ISO 4217 currency
 * (http://en.wikipedia.org/wiki/ISO_4217)
 */
@JsonAdapter(Currency.JsonAdapter.class)
public class Currency implements CharSequence {

    private String currency;

    /**
     * Currency constructor.
     * <p>
     * @param currency the Currency
     */
    public Currency(String currency) {
        this.currency = currency;
    }

    /**
     * Set the Currency
     * <p>
     * Currency name identifier. Used by clients to refer to currencies.
     * <p>
     * @param currency the Currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Get the Currency
     * <p>
     * Currency name identifier. Used by clients to refer to currencies.
     * <p>
     * @return the Currency
     */
    public String getCurrency() {
        return this.currency;
    }

    @Override
    public int length() {
        return currency.length();
    }

    @Override
    public char charAt(int index) {
        return currency.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return currency.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<Currency> {

        @Override
        public Currency read(JsonReader in) throws IOException {
            return new Currency(in.nextString());
        }

        @Override
        public void write(JsonWriter out, Currency obj) throws IOException {
            out.jsonValue('"'+obj.currency+'"');
        }
    }
}
