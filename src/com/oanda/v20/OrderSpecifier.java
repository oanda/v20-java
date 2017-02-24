package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

/**
 * The specification of an Order as referred to by clients
 * <p>
 * Either the Order's OANDA-assigned OrderID or the Order's client-provided
 * ClientID prefixed by the "@" symbol
 */
@JsonAdapter(OrderSpecifier.JsonAdapter.class)
public class OrderSpecifier implements CharSequence {

    private String orderSpecifier;

    /**
     * OrderSpecifier constructor.
     * <p>
     * @param orderSpecifier the OrderSpecifier
     */
    public OrderSpecifier(String orderSpecifier) {
        this.orderSpecifier = orderSpecifier;
    }

    /**
     * Set the OrderSpecifier
     * <p>
     * The specification of an Order as referred to by clients
     * <p>
     * @param orderSpecifier the OrderSpecifier
     */
    public void setOrderSpecifier(String orderSpecifier) {
        this.orderSpecifier = orderSpecifier;
    }

    /**
     * Get the OrderSpecifier
     * <p>
     * The specification of an Order as referred to by clients
     * <p>
     * @return the OrderSpecifier
     */
    public String getOrderSpecifier() {
        return this.orderSpecifier;
    }

    @Override
    public int length() {
        return orderSpecifier.length();
    }

    @Override
    public char charAt(int index) {
        return orderSpecifier.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return orderSpecifier.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<OrderSpecifier> {

        @Override
        public OrderSpecifier read(JsonReader in) throws IOException {
            return new OrderSpecifier(in.nextString());
        }

        @Override
        public void write(JsonWriter out, OrderSpecifier obj) throws IOException {
            out.jsonValue('"'+obj.orderSpecifier+'"');
        }
    }
}
