package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

/**
 * The string representation of a Price for an Instrument.
 * <p>
 * A decimal number encodes as a string. The amount of precision provided
 * depends on the Price's Instrument.
 */
@JsonAdapter(PriceValue.JsonAdapter.class)
public class PriceValue implements CharSequence {

    private String priceValue;

    /**
     * PriceValue constructor.
     * <p>
     * @param priceValue the PriceValue
     */
    public PriceValue(String priceValue) {
        this.priceValue = priceValue;
    }

    /**
     * PriceValue constructor.
     * <p>
     * @param priceValue the PriceValue as a double
     */
    public PriceValue(double priceValue) {
        this.priceValue = String.valueOf(priceValue);
    }

    /**
     * Set the PriceValue
     * <p>
     * The string representation of a Price for an Instrument.
     * <p>
     * @param priceValue the PriceValue
     */
    public void setPriceValue(double priceValue) {
        this.priceValue = String.valueOf(priceValue);
    }

    /**
     * Get the PriceValue
     * <p>
     * The string representation of a Price for an Instrument.
     * <p>
     * @return the PriceValue
     */
    public double getPriceValue() {
        return Double.valueOf(this.priceValue);
    }

    @Override
    public int length() {
        return priceValue.length();
    }

    @Override
    public char charAt(int index) {
        return priceValue.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return priceValue.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<PriceValue> {

        @Override
        public PriceValue read(JsonReader in) throws IOException {
            return new PriceValue(in.nextString());
        }

        @Override
        public void write(JsonWriter out, PriceValue obj) throws IOException {
            out.jsonValue('"'+obj.priceValue+'"');
        }
    }
}
