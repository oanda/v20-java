package com.oanda.v20;

import java.io.IOException;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.TypeAdapter;

/**
 * The Order's identifier, unique within the Order's Account.
 * <p>
 * The string representation of the OANDA-assigned OrderID. OANDA-assigned
 * OrderIDs are positive integers, and are derived from the TransactionID of
 * the Transaction that created the Order.
 */
@JsonAdapter(OrderID.JsonAdapter.class)
public class OrderID implements CharSequence {

    private String orderID;

    /**
     * OrderID constructor.
     * <p>
     * @param orderID the OrderID
     */
    public OrderID(String orderID) {
        this.orderID = orderID;
    }

    /**
     * Set the OrderID
     * <p>
     * The Order's identifier, unique within the Order's Account.
     * <p>
     * @param orderID the OrderID
     */
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    /**
     * Get the OrderID
     * <p>
     * The Order's identifier, unique within the Order's Account.
     * <p>
     * @return the OrderID
     */
    public String getOrderID() {
        return this.orderID;
    }

    @Override
    public int length() {
        return orderID.length();
    }

    @Override
    public char charAt(int index) {
        return orderID.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return orderID.subSequence(start, end);
    }

    public class JsonAdapter extends TypeAdapter<OrderID> {

        @Override
        public OrderID read(JsonReader in) throws IOException {
            return new OrderID(in.nextString());
        }

        @Override
        public void write(JsonWriter out, OrderID obj) throws IOException {
            out.jsonValue('"'+obj.orderID+'"');
        }
    }
}
