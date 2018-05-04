package com.oanda.v20.order;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import com.oanda.v20.primitives.StringPrimitive;
import com.oanda.v20.transaction.TransactionID;

/**
 * The specification of an Order as referred to by clients
 * <p>
 * Either the Order's OANDA-assigned OrderID or the Order's client-provided
 * ClientID prefixed by the "@" symbol
 */
@JsonAdapter(OrderSpecifier.JsonAdapter.class)
public class OrderSpecifier extends StringPrimitive {

    /**
     * OrderSpecifier copy constructor.
     * <p>
     * @param orderSpecifier the 
     */
    public OrderSpecifier(OrderSpecifier orderSpecifier)
    {
        super(orderSpecifier.toString());
    }

    /**
     * OrderSpecifier constructor.
     * <p>
     * @param orderSpecifier the OrderSpecifier as a String
     */
    public OrderSpecifier(String orderSpecifier) {
        super(orderSpecifier);
    }

    /**
     * Construct an OrderSpecifier from an OrderID
     * <p>
     * @param orderID the OrderID to convert
     */
    public OrderSpecifier(OrderID orderID) {
        super(orderID.toString());
    }

    /**
     * Construct an OrderSpecifier from a TransactionID
     * <p>
     * @param transactionID the TransactionID to convert
     */
    public OrderSpecifier(TransactionID transactionID) {
        super(transactionID.toString());
    }

    /**
     * JSON adapter for reading and writing OrderSpecifier0
     */
    public static class JsonAdapter extends TypeAdapter<OrderSpecifier> {

        @Override
        public OrderSpecifier read(JsonReader in) throws IOException {
            return new OrderSpecifier(in.nextString());
        }

        @Override
        public void write(JsonWriter out, OrderSpecifier obj) throws IOException {
            out.value(obj.toString());
        }
    }
}
