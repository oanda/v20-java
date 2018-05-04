package com.oanda.v20.primitives;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Currency name identifier. Used by clients to refer to currencies.
 * <p>
 * A string containing an ISO 4217 currency
 * (http://en.wikipedia.org/wiki/ISO_4217)
 */
@JsonAdapter(Currency.JsonAdapter.class)
public class Currency extends StringPrimitive {

    /**
     * Currency copy constructor.
     * <p>
     * @param currency the 
     */
    public Currency(Currency currency)
    {
        super(currency.toString());
    }

    /**
     * Currency constructor.
     * <p>
     * @param currency the Currency as a String
     */
    public Currency(String currency) {
        super(currency);
    }

    /**
     * JSON adapter for reading and writing Currency0
     */
    public static class JsonAdapter extends TypeAdapter<Currency> {

        @Override
        public Currency read(JsonReader in) throws IOException {
            return new Currency(in.nextString());
        }

        @Override
        public void write(JsonWriter out, Currency obj) throws IOException {
            out.value(obj.toString());
        }
    }
}
