package com.oanda.v20;
    // The reason that an Order was cancelled.
public enum OrderCancelReason {
    // The Order was cancelled because at the time of filling, an unexpected
    // internal server error occurred.
    INTERNAL_SERVER_ERROR,
    // The Order was cancelled because at the time of filling the account was
    // locked.
    ACCOUNT_LOCKED,
    // The order was to be filled, however the account is configured to not
    // allow new positions to be created.
    ACCOUNT_NEW_POSITIONS_LOCKED,
    // Filling the Order wasn't possible because it required the creation of a
    // dependent Order and the Account is locked for Order creation.
    ACCOUNT_ORDER_CREATION_LOCKED,
    // Filling the Order was not possible because the Account is locked for
    // filling Orders.
    ACCOUNT_ORDER_FILL_LOCKED,
    // The Order was cancelled explicitly at the request of the client.
    CLIENT_REQUEST,
    // The Order cancelled because it is being migrated to another account.
    MIGRATION,
    // Filling the Order wasn't possible because the Order's instrument was
    // halted.
    MARKET_HALTED,
    // The Order is linked to an open Trade that was closed.
    LINKED_TRADE_CLOSED,
    // The time in force specified for this order has passed.
    TIME_IN_FORCE_EXPIRED,
    // Filling the Order wasn't possible because the Account had insufficient
    // margin.
    INSUFFICIENT_MARGIN,
    // Filling the Order would have resulted in a a FIFO violation.
    FIFO_VIOLATION,
    // Filling the Order would have violated the Order's price bound.
    BOUNDS_VIOLATION,
    // The Order was cancelled for replacement at the request of the client.
    CLIENT_REQUEST_REPLACED,
    // Filling the Order wasn't possible because enough liquidity available.
    INSUFFICIENT_LIQUIDITY,
    // Filling the Order would have resulted in the creation of a Take Profit
    // Order with a GTD time in the past.
    TAKE_PROFIT_ON_FILL_GTD_TIMESTAMP_IN_PAST,
    // Filling the Order would result in the creation of a Take Profit Order
    // that would have been filled immediately, closing the new Trade at a
    // loss.
    TAKE_PROFIT_ON_FILL_LOSS,
    // Filling the Order would result in the creation of a Take Profit Loss
    // Order that would close the new Trade at a loss when filled.
    LOSING_TAKE_PROFIT,
    // Filling the Order would have resulted in the creation of a Stop Loss
    // Order with a GTD time in the past.
    STOP_LOSS_ON_FILL_GTD_TIMESTAMP_IN_PAST,
    // Filling the Order would result in the creation of a Stop Loss Order that
    // would have been filled immediately, closing the new Trade at a loss.
    STOP_LOSS_ON_FILL_LOSS,
    // Filling the Order would have resulted in the creation of a Trailing Stop
    // Loss Order with a GTD time in the past.
    TRAILING_STOP_LOSS_ON_FILL_GTD_TIMESTAMP_IN_PAST,
    // Filling the Order would result in the creation of a new Open Trade with
    // a client Trade ID already in use.
    CLIENT_TRADE_ID_ALREADY_EXISTS,
    // Closing out a position wasn't fully possible.
    POSITION_CLOSEOUT_FAILED,
    // Filling the Order would cause the maximum open trades allowed for the
    // Account to be exceeded.
    OPEN_TRADES_ALLOWED_EXCEEDED,
    // Filling the Order would have resulted in exceeding the number of pending
    // Orders allowed for the Account.
    PENDING_ORDERS_ALLOWED_EXCEEDED,
    // Filling the Order would have resulted in the creation of a Take Profit
    // Order with a client Order ID that is already in use.
    TAKE_PROFIT_ON_FILL_CLIENT_ORDER_ID_ALREADY_EXISTS,
    // Filling the Order would have resulted in the creation of a Stop Loss
    // Order with a client Order ID that is already in use.
    STOP_LOSS_ON_FILL_CLIENT_ORDER_ID_ALREADY_EXISTS,
    // Filling the Order would have resulted in the creation of a Trailing Stop
    // Loss Order with a client Order ID that is already in use.
    TRAILING_STOP_LOSS_ON_FILL_CLIENT_ORDER_ID_ALREADY_EXISTS,
    // Filling the Order would have resulted in the Account's maximum position
    // size limit being exceeded for the Order's instrument.
    POSITION_SIZE_EXCEEDED
}
