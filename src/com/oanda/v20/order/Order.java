package com.oanda.v20.order;

import com.oanda.v20.primitives.DateTime;
import com.oanda.v20.transaction.ClientExtensions;

/**
 * The base Order definition specifies the properties that are common to all
 * Orders.
 */
public interface Order {

    /**
     * Get the Order type.
     * <p>
     * The type of the Order
     * <p>
     * @return the Order type
     * @see OrderType
     */
    public OrderType getType();

    /**
     * Get the Order ID
     * <p>
     * The Order's identifier, unique within the Order's Account.
     * <p>
     * @return the Order ID
     * @see OrderID
     */
    public OrderID getId();

    /**
     * Set the Order ID
     * <p>
     * The Order's identifier, unique within the Order's Account.
     * <p>
     * @param id the Order ID as an OrderID
     * @return {@link Order Order}
     * @see OrderID
     */
    public Order setId(OrderID id);
    /**
     * Set the Order ID
     * <p>
     * The Order's identifier, unique within the Order's Account.
     * <p>
     * @param id the Order ID as a String
     * @return {@link Order Order}
     * @see OrderID
     */
    public Order setId(String id);

    /**
     * Get the Create Time
     * <p>
     * The time when the Order was created.
     * <p>
     * @return the Create Time
     * @see DateTime
     */
    public DateTime getCreateTime();

    /**
     * Set the Create Time
     * <p>
     * The time when the Order was created.
     * <p>
     * @param createTime the Create Time as a DateTime
     * @return {@link Order Order}
     * @see DateTime
     */
    public Order setCreateTime(DateTime createTime);
    /**
     * Set the Create Time
     * <p>
     * The time when the Order was created.
     * <p>
     * @param createTime the Create Time as a String
     * @return {@link Order Order}
     * @see DateTime
     */
    public Order setCreateTime(String createTime);

    /**
     * Get the State
     * <p>
     * The current state of the Order.
     * <p>
     * @return the State
     * @see OrderState
     */
    public OrderState getState();

    /**
     * Set the State
     * <p>
     * The current state of the Order.
     * <p>
     * @param state the State as an OrderState
     * @return {@link Order Order}
     * @see OrderState
     */
    public Order setState(OrderState state);

    /**
     * Get the Client Extensions
     * <p>
     * The client extensions of the Order. Do not set, modify, or delete
     * clientExtensions if your account is associated with MT4.
     * <p>
     * @return the Client Extensions
     * @see ClientExtensions
     */
    public ClientExtensions getClientExtensions();

    /**
     * Set the Client Extensions
     * <p>
     * The client extensions of the Order. Do not set, modify, or delete
     * clientExtensions if your account is associated with MT4.
     * <p>
     * @param clientExtensions the Client Extensions as a ClientExtensions
     * @return {@link Order Order}
     * @see ClientExtensions
     */
    public Order setClientExtensions(ClientExtensions clientExtensions);
}
