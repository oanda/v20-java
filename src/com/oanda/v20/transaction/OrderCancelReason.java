package com.oanda.v20.transaction;

/**
 * The reason that an Order was cancelled.
 */
public enum OrderCancelReason {

    /**
     * The Order was cancelled because at the time of filling, an unexpected
     * internal server error occurred.
     */
    INTERNAL_SERVER_ERROR,

    /**
     * The Order was cancelled because at the time of filling the account was
     * locked.
     */
    ACCOUNT_LOCKED,

    /**
     * The order was to be filled, however the account is configured to not
     * allow new positions to be created.
     */
    ACCOUNT_NEW_POSITIONS_LOCKED,

    /**
     * Filling the Order wasn't possible because it required the creation of a
     * dependent Order and the Account is locked for Order creation.
     */
    ACCOUNT_ORDER_CREATION_LOCKED,

    /**
     * Filling the Order was not possible because the Account is locked for
     * filling Orders.
     */
    ACCOUNT_ORDER_FILL_LOCKED,

    /**
     * The Order was cancelled explicitly at the request of the client.
     */
    CLIENT_REQUEST,

    /**
     * The Order cancelled because it is being migrated to another account.
     */
    MIGRATION,

    /**
     * Filling the Order wasn't possible because the Order's instrument was
     * halted.
     */
    MARKET_HALTED,

    /**
     * The Order is linked to an open Trade that was closed.
     */
    LINKED_TRADE_CLOSED,

    /**
     * The time in force specified for this order has passed.
     */
    TIME_IN_FORCE_EXPIRED,

    /**
     * Filling the Order wasn't possible because the Account had insufficient
     * margin.
     */
    INSUFFICIENT_MARGIN,

    /**
     * Filling the Order would have resulted in a a FIFO violation.
     */
    FIFO_VIOLATION,

    /**
     * Filling the Order would have violated the Order's price bound.
     */
    BOUNDS_VIOLATION,

    /**
     * The Order was cancelled for replacement at the request of the client.
     */
    CLIENT_REQUEST_REPLACED,

    /**
     * Filling the Order wasn't possible because enough liquidity available.
     */
    INSUFFICIENT_LIQUIDITY,

    /**
     * Filling the Order would have resulted in the creation of a Take Profit
     * Order with a GTD time in the past.
     */
    TAKE_PROFIT_ON_FILL_GTD_TIMESTAMP_IN_PAST,

    /**
     * Filling the Order would result in the creation of a Take Profit Order
     * that would have been filled immediately, closing the new Trade at a
     * loss.
     */
    TAKE_PROFIT_ON_FILL_LOSS,

    /**
     * Filling the Order would result in the creation of a Take Profit Loss
     * Order that would close the new Trade at a loss when filled.
     */
    LOSING_TAKE_PROFIT,

    /**
     * Filling the Order would have resulted in the creation of a Stop Loss
     * Order with a GTD time in the past.
     */
    STOP_LOSS_ON_FILL_GTD_TIMESTAMP_IN_PAST,

    /**
     * Filling the Order would result in the creation of a Stop Loss Order that
     * would have been filled immediately, closing the new Trade at a loss.
     */
    STOP_LOSS_ON_FILL_LOSS,

    /**
     * Filling the Order would result in the creation of a Stop Loss Order
     * whose price would be zero or negative due to the specified distance.
     */
    STOP_LOSS_ON_FILL_PRICE_DISTANCE_MAXIMUM_EXCEEDED,

    /**
     * Filling the Order would not result in the creation of Stop Loss Order,
     * however the Account's configuration requires that all Trades have a Stop
     * Loss Order attached to them.
     */
    STOP_LOSS_ON_FILL_REQUIRED,

    /**
     * Filling the Order would not result in the creation of a guaranteed Stop
     * Loss Order, however the Account's configuration requires that all Trades
     * have a guaranteed Stop Loss Order attached to them.
     */
    STOP_LOSS_ON_FILL_GUARANTEED_REQUIRED,

    /**
     * Filling the Order would result in the creation of a guaranteed Stop Loss
     * Order, however the Account's configuration does not allow guaranteed
     * Stop Loss Orders.
     */
    STOP_LOSS_ON_FILL_GUARANTEED_NOT_ALLOWED,

    /**
     * Filling the Order would result in the creation of a guaranteed Stop Loss
     * Order with a distance smaller than the configured mininum distance.
     */
    STOP_LOSS_ON_FILL_GUARANTEED_MINIMUM_DISTANCE_NOT_MET,

    /**
     * Filling the Order would result in the creation of a guaranteed Stop Loss
     * Order with trigger price and number of units that that violates the
     * account's guaranteed Stop Loss Order level restriction.
     */
    STOP_LOSS_ON_FILL_GUARANTEED_LEVEL_RESTRICTION_EXCEEDED,

    /**
     * Filling the Order would result in the creation of a guaranteed Stop Loss
     * Order for a hedged Trade, however the Account's configuration does not
     * allow guaranteed Stop Loss Orders for hedged Trades/Positions.
     */
    STOP_LOSS_ON_FILL_GUARANTEED_HEDGING_NOT_ALLOWED,

    /**
     * Filling the Order would result in the creation of a Stop Loss Order
     * whose TimeInForce value is invalid. A likely cause would be if the
     * Account requires guaranteed stop loss orders and the TimeInForce value
     * were not GTC.
     */
    STOP_LOSS_ON_FILL_TIME_IN_FORCE_INVALID,

    /**
     * Filling the Order would result in the creation of a Stop Loss Order
     * whose TriggerCondition value is invalid. A likely cause would be if the
     * stop loss order is guaranteed and the TimeInForce is not TRIGGER_DEFAULT
     * or TRIGGER_BID for a long trade, or not TRIGGER_DEFAULT or TRIGGER_ASK
     * for a short trade.
     */
    STOP_LOSS_ON_FILL_TRIGGER_CONDITION_INVALID,

    /**
     * Filling the Order would result in the creation of a Take Profit Order
     * whose price would be zero or negative due to the specified distance.
     */
    TAKE_PROFIT_ON_FILL_PRICE_DISTANCE_MAXIMUM_EXCEEDED,

    /**
     * Filling the Order would have resulted in the creation of a Trailing Stop
     * Loss Order with a GTD time in the past.
     */
    TRAILING_STOP_LOSS_ON_FILL_GTD_TIMESTAMP_IN_PAST,

    /**
     * Filling the Order would result in the creation of a new Open Trade with
     * a client Trade ID already in use.
     */
    CLIENT_TRADE_ID_ALREADY_EXISTS,

    /**
     * Closing out a position wasn't fully possible.
     */
    POSITION_CLOSEOUT_FAILED,

    /**
     * Filling the Order would cause the maximum open trades allowed for the
     * Account to be exceeded.
     */
    OPEN_TRADES_ALLOWED_EXCEEDED,

    /**
     * Filling the Order would have resulted in exceeding the number of pending
     * Orders allowed for the Account.
     */
    PENDING_ORDERS_ALLOWED_EXCEEDED,

    /**
     * Filling the Order would have resulted in the creation of a Take Profit
     * Order with a client Order ID that is already in use.
     */
    TAKE_PROFIT_ON_FILL_CLIENT_ORDER_ID_ALREADY_EXISTS,

    /**
     * Filling the Order would have resulted in the creation of a Stop Loss
     * Order with a client Order ID that is already in use.
     */
    STOP_LOSS_ON_FILL_CLIENT_ORDER_ID_ALREADY_EXISTS,

    /**
     * Filling the Order would have resulted in the creation of a Trailing Stop
     * Loss Order with a client Order ID that is already in use.
     */
    TRAILING_STOP_LOSS_ON_FILL_CLIENT_ORDER_ID_ALREADY_EXISTS,

    /**
     * Filling the Order would have resulted in the Account's maximum position
     * size limit being exceeded for the Order's instrument.
     */
    POSITION_SIZE_EXCEEDED,

    /**
     * Filling the Order would result in the creation of a Trade, however there
     * already exists an opposing (hedged) Trade that has a guaranteed Stop
     * Loss Order attached to it. Guaranteed Stop Loss Orders cannot be
     * combined with hedged positions.
     */
    HEDGING_GSLO_VIOLATION,

    /**
     * Filling the order would cause the maximum position value allowed for the
     * account to be exceeded. The Order has been cancelled as a result.
     */
    ACCOUNT_POSITION_VALUE_LIMIT_EXCEEDED,

    /**
     * Filling the order would require the creation of a short trade, however
     * the instrument is configured such that orders being filled using bid
     * prices can only reduce existing positions. New short positions cannot be
     * created, but existing long positions may be reduced or closed.
     */
    INSTRUMENT_BID_REDUCE_ONLY,

    /**
     * Filling the order would require the creation of a long trade, however
     * the instrument is configured such that orders being filled using ask
     * prices can only reduce existing positions. New long positions cannot be
     * created, but existing short positions may be reduced or closed.
     */
    INSTRUMENT_ASK_REDUCE_ONLY,

    /**
     * Filling the order would require using the bid, however the instrument is
     * configured such that the bids are halted, and so no short orders may be
     * filled.
     */
    INSTRUMENT_BID_HALTED,

    /**
     * Filling the order would require using the ask, however the instrument is
     * configured such that the asks are halted, and so no long orders may be
     * filled.
     */
    INSTRUMENT_ASK_HALTED,

    /**
     * Filling the Order would result in the creation of a Guaranteed Stop Loss
     * Order (GSLO). Since the trade is long the GSLO would be short, however
     * the bid side is currently halted. GSLOs cannot be created in this
     * situation.
     */
    STOP_LOSS_ON_FILL_GUARANTEED_BID_HALTED,

    /**
     * Filling the Order would result in the creation of a Guaranteed Stop Loss
     * Order (GSLO). Since the trade is short the GSLO would be long, however
     * the ask side is currently halted. GSLOs cannot be created in this
     * situation.
     */
    STOP_LOSS_ON_FILL_GUARANTEED_ASK_HALTED
}
