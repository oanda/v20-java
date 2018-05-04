package com.oanda.v20.primitives;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Instrument name identifier. Used by clients to refer to an Instrument.
 * <p>
 * A string containing the base currency and quote currency delimited by a "_".
 */
@JsonAdapter(InstrumentName.JsonAdapter.class)
public class InstrumentName extends StringPrimitive {

    /**
     * InstrumentName copy constructor.
     * <p>
     * @param instrumentName the 
     */
    public InstrumentName(InstrumentName instrumentName)
    {
        super(instrumentName.toString());
    }

    /**
     * InstrumentName constructor.
     * <p>
     * @param instrumentName the InstrumentName as a String
     */
    public InstrumentName(String instrumentName) {
        super(instrumentName);
    }

    /**
     * JSON adapter for reading and writing InstrumentName0
     */
    public static class JsonAdapter extends TypeAdapter<InstrumentName> {

        @Override
        public InstrumentName read(JsonReader in) throws IOException {
            return new InstrumentName(in.nextString());
        }

        @Override
        public void write(JsonWriter out, InstrumentName obj) throws IOException {
            out.value(obj.toString());
        }
    }
}
