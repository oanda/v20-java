package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

    // The specification of an Order as referred to by clients
@JsonAdapter(OrderSpecifier.JsonAdapter.class)
public class OrderSpecifier implements CharSequence {

    private String _OrderSpecifier;

    public OrderSpecifier(String _OrderSpecifier) {
        this._OrderSpecifier = _OrderSpecifier;
    }

    public void set_OrderSpecifier(String _OrderSpecifier) {
        this._OrderSpecifier = _OrderSpecifier;
    }

    public String get_OrderSpecifier() {
        return this._OrderSpecifier;
    }

    @Override
    public int length() {
        return _OrderSpecifier.length();
    }

    @Override
    public char charAt(int index) {
        return _OrderSpecifier.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return _OrderSpecifier.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<OrderSpecifier> {

        @Override
        public OrderSpecifier read(JsonReader in) throws IOException {
            return new OrderSpecifier(in.nextString());
        }

        @Override
        public void write(JsonWriter out, OrderSpecifier obj) throws IOException {
            out.jsonValue('"'+obj._OrderSpecifier+'"');
        }
    }

}
