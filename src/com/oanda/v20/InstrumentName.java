package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

/**
 * Instrument name identifier. Used by clients to refer to an Instrument.
 * <p>
 * A string containing the base currency and quote currency delimited by a "_".
 */
@JsonAdapter(InstrumentName.JsonAdapter.class)
public class InstrumentName implements CharSequence {

    private String instrumentName;

    /**
     * InstrumentName constructor.
     * <p>
     * @param instrumentName the InstrumentName
     */
    public InstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    /**
     * Set the InstrumentName
     * <p>
     * Instrument name identifier. Used by clients to refer to an Instrument.
     * <p>
     * @param instrumentName the InstrumentName
     */
    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    /**
     * Get the InstrumentName
     * <p>
     * Instrument name identifier. Used by clients to refer to an Instrument.
     * <p>
     * @return the InstrumentName
     */
    public String getInstrumentName() {
        return this.instrumentName;
    }

    @Override
    public int length() {
        return instrumentName.length();
    }

    @Override
    public char charAt(int index) {
        return instrumentName.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return instrumentName.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<InstrumentName> {

        @Override
        public InstrumentName read(JsonReader in) throws IOException {
            return new InstrumentName(in.nextString());
        }

        @Override
        public void write(JsonWriter out, InstrumentName obj) throws IOException {
            out.jsonValue('"'+obj.instrumentName+'"');
        }
    }
}
