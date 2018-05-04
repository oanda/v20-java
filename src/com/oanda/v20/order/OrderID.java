package com.oanda.v20.order;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import com.oanda.v20.primitives.StringPrimitive;
import com.oanda.v20.transaction.TransactionID;

/**
 * The Order's identifier, unique within the Order's Account.
 * <p>
 * The string representation of the OANDA-assigned OrderID. OANDA-assigned
 * OrderIDs are positive integers, and are derived from the TransactionID of
 * the Transaction that created the Order.
 */
@JsonAdapter(OrderID.JsonAdapter.class)
public class OrderID extends StringPrimitive {

    /**
     * OrderID copy constructor.
     * <p>
     * @param orderID the 
     */
    public OrderID(OrderID orderID)
    {
        super(orderID.toString());
    }

    /**
     * OrderID constructor.
     * <p>
     * @param orderID the OrderID as a String
     */
    public OrderID(String orderID) {
        super(orderID);
    }

    /**
     * Construct an OrderID from a TransactionID
     * <p>
     * @param transactionID the TransactionID to convert
     */
    public OrderID(TransactionID transactionID) {
        super(transactionID.toString());
    }

    /**
     * JSON adapter for reading and writing OrderID0
     */
    public static class JsonAdapter extends TypeAdapter<OrderID> {

        @Override
        public OrderID read(JsonReader in) throws IOException {
            return new OrderID(in.nextString());
        }

        @Override
        public void write(JsonWriter out, OrderID obj) throws IOException {
            out.value(obj.toString());
        }
    }
}
