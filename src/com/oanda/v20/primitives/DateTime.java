package com.oanda.v20.primitives;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

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
public class DateTime extends StringPrimitive {

    /**
     * DateTime copy constructor.
     * <p>
     * @param dateTime the 
     */
    public DateTime(DateTime dateTime)
    {
        super(dateTime.toString());
    }

    /**
     * DateTime constructor.
     * <p>
     * @param dateTime the DateTime as a String
     */
    public DateTime(String dateTime) {
        super(dateTime);
    }

    /**
     * JSON adapter for reading and writing DateTime0
     */
    public static class JsonAdapter extends TypeAdapter<DateTime> {

        @Override
        public DateTime read(JsonReader in) throws IOException {
            return new DateTime(in.nextString());
        }

        @Override
        public void write(JsonWriter out, DateTime obj) throws IOException {
            out.value(obj.toString());
        }
    }
}
