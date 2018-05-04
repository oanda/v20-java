package com.oanda.v20.primitives;

import java.io.IOException;
import java.math.BigDecimal;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The string representation of a decimal number.
 * <p>
 * A decimal number encoded as a string. The amount of precision provided
 * depends on what the number represents.
 */
@JsonAdapter(DecimalNumber.JsonAdapter.class)
public class DecimalNumber extends StringPrimitive {

    /**
     * DecimalNumber copy constructor.
     * <p>
     * @param decimalNumber the 
     */
    public DecimalNumber(DecimalNumber decimalNumber)
    {
        super(decimalNumber.toString());
    }

    /**
     * DecimalNumber constructor.
     * <p>
     * @param decimalNumber the DecimalNumber as a String
     */
    public DecimalNumber(String decimalNumber) {
        super(decimalNumber);
    }

    /**
     * DecimalNumber constructor.
     * <p>
     * @param decimalNumber the DecimalNumber as a double
     */
    public DecimalNumber(double decimalNumber) {
        super(String.valueOf(decimalNumber));
    }

    /**
     * DecimalNumber constructor.
     * <p>
     * @param decimalNumber the DecimalNumber as a BigDecimal
     */
    public DecimalNumber(BigDecimal decimalNumber) {
        super(decimalNumber.toPlainString());
    }

    /**
     * Get the DecimalNumber
     * <p>
     * The string representation of a decimal number.
     * <p>
     * @return the DecimalNumber as a double
     * @see DecimalNumber
     */
    public double doubleValue() {
        return Double.valueOf(this.string);
    }

    /**
     * Get the DecimalNumber
     * <p>
     * The string representation of a decimal number.
     * <p>
     * @return the DecimalNumber as a BigDecimal
     * @see DecimalNumber
     */
    public BigDecimal bigDecimalValue() {
        return new BigDecimal(this.string);
    }

    /**
     * JSON adapter for reading and writing DecimalNumber0
     */
    public static class JsonAdapter extends TypeAdapter<DecimalNumber> {

        @Override
        public DecimalNumber read(JsonReader in) throws IOException {
            return new DecimalNumber(in.nextString());
        }

        @Override
        public void write(JsonWriter out, DecimalNumber obj) throws IOException {
            out.value(obj.toString());
        }
    }
}
