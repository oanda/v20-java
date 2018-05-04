package com.oanda.v20.pricing_common;

import java.io.IOException;
import java.math.BigDecimal;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import com.oanda.v20.primitives.StringPrimitive;

/**
 * The string representation of a Price for a Bucket.
 * <p>
 * A decimal number encodes as a string. The amount of precision provided
 * depends on the Instrument.
 */
@JsonAdapter(PriceValue.JsonAdapter.class)
public class PriceValue extends StringPrimitive {

    /**
     * PriceValue copy constructor.
     * <p>
     * @param priceValue the 
     */
    public PriceValue(PriceValue priceValue)
    {
        super(priceValue.toString());
    }

    /**
     * PriceValue constructor.
     * <p>
     * @param priceValue the PriceValue as a String
     */
    public PriceValue(String priceValue) {
        super(priceValue);
    }

    /**
     * PriceValue constructor.
     * <p>
     * @param priceValue the PriceValue as a double
     */
    public PriceValue(double priceValue) {
        super(String.valueOf(priceValue));
    }

    /**
     * PriceValue constructor.
     * <p>
     * @param priceValue the PriceValue as a BigDecimal
     */
    public PriceValue(BigDecimal priceValue) {
        super(priceValue.toPlainString());
    }

    /**
     * Get the PriceValue
     * <p>
     * The string representation of a Price for a Bucket.
     * <p>
     * @return the PriceValue as a double
     * @see PriceValue
     */
    public double doubleValue() {
        return Double.valueOf(this.string);
    }

    /**
     * Get the PriceValue
     * <p>
     * The string representation of a Price for a Bucket.
     * <p>
     * @return the PriceValue as a BigDecimal
     * @see PriceValue
     */
    public BigDecimal bigDecimalValue() {
        return new BigDecimal(this.string);
    }

    /**
     * JSON adapter for reading and writing PriceValue0
     */
    public static class JsonAdapter extends TypeAdapter<PriceValue> {

        @Override
        public PriceValue read(JsonReader in) throws IOException {
            return new PriceValue(in.nextString());
        }

        @Override
        public void write(JsonWriter out, PriceValue obj) throws IOException {
            out.value(obj.toString());
        }
    }
}
