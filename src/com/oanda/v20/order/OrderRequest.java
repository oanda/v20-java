package com.oanda.v20.order;



/**
 * The base Order specification used when requesting that an Order be created.
 * Each specific Order-type extends this definition.
 */
public interface OrderRequest {

    /**
     * Get the Order type.
     * <p>
     * The type of the Order
     * <p>
     * @return the Order type
     * @see OrderType
     */
    public OrderType getType();
}
