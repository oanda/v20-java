package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

/**
 * A date and time value using either RFC3339 or UNIX time representation.
 * <p>
 * The RFC 3339 representation is a string conforming to
 * https://tools.ietf.org/rfc/rfc3339.txt. The Unix representation is a string
 * representing the number of seconds since the Unix Epoch (January 1st, 1970
 * at UTC). The value is a fractional number, where the fractional part
 * represents a fraction of a second (up to nine decimal places).
 */
@JsonAdapter(DateTime.JsonAdapter.class)
public class DateTime implements CharSequence {

    private String dateTime;

    /**
     * DateTime constructor.
     * <p>
     * @param dateTime the DateTime
     */
    public DateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Set the DateTime
     * <p>
     * A date and time value using either RFC3339 or UNIX time representation.
     * <p>
     * @param dateTime the DateTime
     */
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Get the DateTime
     * <p>
     * A date and time value using either RFC3339 or UNIX time representation.
     * <p>
     * @return the DateTime
     */
    public String getDateTime() {
        return this.dateTime;
    }

    @Override
    public int length() {
        return dateTime.length();
    }

    @Override
    public char charAt(int index) {
        return dateTime.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return dateTime.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<DateTime> {

        @Override
        public DateTime read(JsonReader in) throws IOException {
            return new DateTime(in.nextString());
        }

        @Override
        public void write(JsonWriter out, DateTime obj) throws IOException {
            out.jsonValue('"'+obj.dateTime+'"');
        }
    }
}
