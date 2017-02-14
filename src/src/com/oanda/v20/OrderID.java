package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

    // The Order's identifier, unique within the Order's Account.
@JsonAdapter(OrderID.JsonAdapter.class)
public class OrderID implements CharSequence {

    private String _OrderID;

    public OrderID(String _OrderID) {
        this._OrderID = _OrderID;
    }

    public void set_OrderID(String _OrderID) {
        this._OrderID = _OrderID;
    }

    public String get_OrderID() {
        return this._OrderID;
    }

    @Override
    public int length() {
        return _OrderID.length();
    }

    @Override
    public char charAt(int index) {
        return _OrderID.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return _OrderID.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<OrderID> {

        @Override
        public OrderID read(JsonReader in) throws IOException {
            return new OrderID(in.nextString());
        }

        @Override
        public void write(JsonWriter out, OrderID obj) throws IOException {
            out.jsonValue('"'+obj._OrderID+'"');
        }
    }

}
