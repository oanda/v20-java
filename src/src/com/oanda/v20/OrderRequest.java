package com.oanda.v20;

    // The base Order specification used when requesting that an Order be
    // created. Each specific Order-type extends this definition.

public interface OrderRequest {

    public OrderType get_type();
}
