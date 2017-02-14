package com.oanda.v20;

    // The base Order definition specifies the properties that are common to
    // all Orders.

public interface Order {

    public OrderType get_type();

    // The Order's identifier, unique within the Order's Account.
    public Order set_id(String __id);
    public String get_id();

    // The time when the Order was created.
    public Order set_createTime(String __createTime);
    public String get_createTime();

    // The current state of the Order.
    public Order set_state(OrderState __state);
    public OrderState get_state();

    // The client extensions of the Order. Do not set, modify, or delete
    // clientExtensions if your account is associated with MT4.
    public Order set_clientExtensions(ClientExtensions __clientExtensions);
    public ClientExtensions get_clientExtensions();
}
