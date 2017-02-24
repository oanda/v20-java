package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

/**
 * The string representation of a decimal number.
 * <p>
 * A decimal number encoded as a string. The amount of precision provided
 * depends on what the number represents.
 */
@JsonAdapter(DecimalNumber.JsonAdapter.class)
public class DecimalNumber implements CharSequence {

    private String decimalNumber;

    /**
     * DecimalNumber constructor.
     * <p>
     * @param decimalNumber the DecimalNumber
     */
    public DecimalNumber(String decimalNumber) {
        this.decimalNumber = decimalNumber;
    }

    /**
     * DecimalNumber constructor.
     * <p>
     * @param decimalNumber the DecimalNumber as a double
     */
    public DecimalNumber(double decimalNumber) {
        this.decimalNumber = String.valueOf(decimalNumber);
    }

    /**
     * Set the DecimalNumber
     * <p>
     * The string representation of a decimal number.
     * <p>
     * @param decimalNumber the DecimalNumber
     */
    public void setDecimalNumber(double decimalNumber) {
        this.decimalNumber = String.valueOf(decimalNumber);
    }

    /**
     * Get the DecimalNumber
     * <p>
     * The string representation of a decimal number.
     * <p>
     * @return the DecimalNumber
     */
    public double getDecimalNumber() {
        return Double.valueOf(this.decimalNumber);
    }

    @Override
    public int length() {
        return decimalNumber.length();
    }

    @Override
    public char charAt(int index) {
        return decimalNumber.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return decimalNumber.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<DecimalNumber> {

        @Override
        public DecimalNumber read(JsonReader in) throws IOException {
            return new DecimalNumber(in.nextString());
        }

        @Override
        public void write(JsonWriter out, DecimalNumber obj) throws IOException {
            out.jsonValue('"'+obj.decimalNumber+'"');
        }
    }
}
