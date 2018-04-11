package com.oanda.v20.transaction;

/**
 * The reason that a Transaction was rejected.
 */
public enum TransactionRejectReason {

    /**
     * An unexpected internal server error has occurred
     */
    INTERNAL_SERVER_ERROR,

    /**
     * The system was unable to determine the current price for the Order's
     * instrument
     */
    INSTRUMENT_PRICE_UNKNOWN,

    /**
     * The Account is not active
     */
    ACCOUNT_NOT_ACTIVE,

    /**
     * The Account is locked
     */
    ACCOUNT_LOCKED,

    /**
     * The Account is locked for Order creation
     */
    ACCOUNT_ORDER_CREATION_LOCKED,

    /**
     * The Account is locked for configuration
     */
    ACCOUNT_CONFIGURATION_LOCKED,

    /**
     * The Account is locked for deposits
     */
    ACCOUNT_DEPOSIT_LOCKED,

    /**
     * The Account is locked for withdrawals
     */
    ACCOUNT_WITHDRAWAL_LOCKED,

    /**
     * The Account is locked for Order cancellation
     */
    ACCOUNT_ORDER_CANCEL_LOCKED,

    /**
     * The instrument specified is not tradeable by the Account
     */
    INSTRUMENT_NOT_TRADEABLE,

    /**
     * Creating the Order would result in the maximum number of allowed pending
     * Orders being exceeded
     */
    PENDING_ORDERS_ALLOWED_EXCEEDED,

    /**
     * Neither the Order ID nor client Order ID are specified
     */
    ORDER_ID_UNSPECIFIED,

    /**
     * The Order specified does not exist
     */
    ORDER_DOESNT_EXIST,

    /**
     * The Order ID and client Order ID specified do not identify the same
     * Order
     */
    ORDER_IDENTIFIER_INCONSISTENCY,

    /**
     * Neither the Trade ID nor client Trade ID are specified
     */
    TRADE_ID_UNSPECIFIED,

    /**
     * The Trade specified does not exist
     */
    TRADE_DOESNT_EXIST,

    /**
     * The Trade ID and client Trade ID specified do not identify the same
     * Trade
     */
    TRADE_IDENTIFIER_INCONSISTENCY,

    /**
     * The Account had insufficient margin to perform the action specified. One
     * possible reason for this is due to the creation or modification of a
     * guaranteed StopLoss Order.
     */
    INSUFFICIENT_MARGIN,

    /**
     * Order instrument has not been specified
     */
    INSTRUMENT_MISSING,

    /**
     * The instrument specified is unknown
     */
    INSTRUMENT_UNKNOWN,

    /**
     * Order units have not been not specified
     */
    UNITS_MISSING,

    /**
     * Order units specified are invalid
     */
    UNITS_INVALID,

    /**
     * The units specified contain more precision than is allowed for the
     * Order's instrument
     */
    UNITS_PRECISION_EXCEEDED,

    /**
     * The units specified exceeds the maximum number of units allowed
     */
    UNITS_LIMIT_EXCEEDED,

    /**
     * The units specified is less than the minimum number of units required
     */
    UNITS_MIMIMUM_NOT_MET,

    /**
     * The price has not been specified
     */
    PRICE_MISSING,

    /**
     * The price specifed is invalid
     */
    PRICE_INVALID,

    /**
     * The price specified contains more precision than is allowed for the
     * instrument
     */
    PRICE_PRECISION_EXCEEDED,

    /**
     * The price distance has not been specified
     */
    PRICE_DISTANCE_MISSING,

    /**
     * The price distance specifed is invalid
     */
    PRICE_DISTANCE_INVALID,

    /**
     * The price distance specified contains more precision than is allowed for
     * the instrument
     */
    PRICE_DISTANCE_PRECISION_EXCEEDED,

    /**
     * The price distance exceeds that maximum allowed amount
     */
    PRICE_DISTANCE_MAXIMUM_EXCEEDED,

    /**
     * The price distance does not meet the minimum allowed amount
     */
    PRICE_DISTANCE_MINIMUM_NOT_MET,

    /**
     * The TimeInForce field has not been specified
     */
    TIME_IN_FORCE_MISSING,

    /**
     * The TimeInForce specified is invalid
     */
    TIME_IN_FORCE_INVALID,

    /**
     * The TimeInForce is GTD but no GTD timestamp is provided
     */
    TIME_IN_FORCE_GTD_TIMESTAMP_MISSING,

    /**
     * The TimeInForce is GTD but the GTD timestamp is in the past
     */
    TIME_IN_FORCE_GTD_TIMESTAMP_IN_PAST,

    /**
     * The price bound specified is invalid
     */
    PRICE_BOUND_INVALID,

    /**
     * The price bound specified contains more precision than is allowed for
     * the Order's instrument
     */
    PRICE_BOUND_PRECISION_EXCEEDED,

    /**
     * Multiple Orders on fill share the same client Order ID
     */
    ORDERS_ON_FILL_DUPLICATE_CLIENT_ORDER_IDS,

    /**
     * The Order does not support Trade on fill client extensions because it
     * cannot create a new Trade
     */
    TRADE_ON_FILL_CLIENT_EXTENSIONS_NOT_SUPPORTED,

    /**
     * The client Order ID specified is invalid
     */
    CLIENT_ORDER_ID_INVALID,

    /**
     * The client Order ID specified is already assigned to another pending
     * Order
     */
    CLIENT_ORDER_ID_ALREADY_EXISTS,

    /**
     * The client Order tag specified is invalid
     */
    CLIENT_ORDER_TAG_INVALID,

    /**
     * The client Order comment specified is invalid
     */
    CLIENT_ORDER_COMMENT_INVALID,

    /**
     * The client Trade ID specified is invalid
     */
    CLIENT_TRADE_ID_INVALID,

    /**
     * The client Trade ID specifed is already assigned to another open Trade
     */
    CLIENT_TRADE_ID_ALREADY_EXISTS,

    /**
     * The client Trade tag specified is invalid
     */
    CLIENT_TRADE_TAG_INVALID,

    /**
     * The client Trade comment is invalid
     */
    CLIENT_TRADE_COMMENT_INVALID,

    /**
     * The OrderFillPositionAction field has not been specified
     */
    ORDER_FILL_POSITION_ACTION_MISSING,

    /**
     * The OrderFillPositionAction specified is invalid
     */
    ORDER_FILL_POSITION_ACTION_INVALID,

    /**
     * The TriggerCondition field has not been specified
     */
    TRIGGER_CONDITION_MISSING,

    /**
     * The TriggerCondition specified is invalid
     */
    TRIGGER_CONDITION_INVALID,

    /**
     * The OrderFillPositionAction field has not been specified
     */
    ORDER_PARTIAL_FILL_OPTION_MISSING,

    /**
     * The OrderFillPositionAction specified is invalid.
     */
    ORDER_PARTIAL_FILL_OPTION_INVALID,

    /**
     * When attempting to reissue an order (currently only a MarketIfTouched)
     * that was immediately partially filled, it is not possible to create a
     * correct pending Order.
     */
    INVALID_REISSUE_IMMEDIATE_PARTIAL_FILL,

    /**
     * A Take Profit Order for the specified Trade already exists
     */
    TAKE_PROFIT_ORDER_ALREADY_EXISTS,

    /**
     * The Take Profit on fill specified does not provide a price
     */
    TAKE_PROFIT_ON_FILL_PRICE_MISSING,

    /**
     * The Take Profit on fill specified contains an invalid price
     */
    TAKE_PROFIT_ON_FILL_PRICE_INVALID,

    /**
     * The Take Profit on fill specified contains a price with more precision
     * than is allowed by the Order's instrument
     */
    TAKE_PROFIT_ON_FILL_PRICE_PRECISION_EXCEEDED,

    /**
     * The Take Profit on fill specified does not provide a TimeInForce
     */
    TAKE_PROFIT_ON_FILL_TIME_IN_FORCE_MISSING,

    /**
     * The Take Profit on fill specifies an invalid TimeInForce
     */
    TAKE_PROFIT_ON_FILL_TIME_IN_FORCE_INVALID,

    /**
     * The Take Profit on fill specifies a GTD TimeInForce but does not provide
     * a GTD timestamp
     */
    TAKE_PROFIT_ON_FILL_GTD_TIMESTAMP_MISSING,

    /**
     * The Take Profit on fill specifies a GTD timestamp that is in the past
     */
    TAKE_PROFIT_ON_FILL_GTD_TIMESTAMP_IN_PAST,

    /**
     * The Take Profit on fill client Order ID specified is invalid
     */
    TAKE_PROFIT_ON_FILL_CLIENT_ORDER_ID_INVALID,

    /**
     * The Take Profit on fill client Order tag specified is invalid
     */
    TAKE_PROFIT_ON_FILL_CLIENT_ORDER_TAG_INVALID,

    /**
     * The Take Profit on fill client Order comment specified is invalid
     */
    TAKE_PROFIT_ON_FILL_CLIENT_ORDER_COMMENT_INVALID,

    /**
     * The Take Profit on fill specified does not provide a TriggerCondition
     */
    TAKE_PROFIT_ON_FILL_TRIGGER_CONDITION_MISSING,

    /**
     * The Take Profit on fill specifies an invalid TriggerCondition
     */
    TAKE_PROFIT_ON_FILL_TRIGGER_CONDITION_INVALID,

    /**
     * A Stop Loss Order for the specified Trade already exists
     */
    STOP_LOSS_ORDER_ALREADY_EXISTS,

    /**
     * An attempt was made to to create a non-guaranteed stop loss order in an
     * account that requires all stop loss orders to be guaranteed.
     */
    STOP_LOSS_ORDER_GUARANTEED_REQUIRED,

    /**
     * An attempt to create a guaranteed stop loss order with a price that is
     * within the current tradeable spread.
     */
    STOP_LOSS_ORDER_GUARANTEED_PRICE_WITHIN_SPREAD,

    /**
     * An attempt was made to create a guaranteed Stop Loss Order, however the
     * Account's configuration does not allow guaranteed Stop Loss Orders.
     */
    STOP_LOSS_ORDER_GUARANTEED_NOT_ALLOWED,

    /**
     * An attempt was made to create a guaranteed Stop Loss Order when the
     * market was halted.
     */
    STOP_LOSS_ORDER_GUARANTEED_HALTED_CREATE_VIOLATION,

    /**
     * An attempt was made to re-create a guaranteed Stop Loss Order with a
     * tighter fill price when the market was halted.
     */
    STOP_LOSS_ORDER_GUARANTEED_HALTED_TIGHTEN_VIOLATION,

    /**
     * An attempt was made to create a guaranteed Stop Loss Order on a hedged
     * Trade (ie there is an existing open Trade in the opposing direction),
     * however the Account's configuration does not allow guaranteed Stop Loss
     * Orders for hedged Trades/Positions.
     */
    STOP_LOSS_ORDER_GUARANTEED_HEDGING_NOT_ALLOWED,

    /**
     * An attempt was made to create a guaranteed Stop Loss Order, however the
     * distance between the current price and the trigger price does not meet
     * the Account's configured minimumGuaranteedStopLossDistance.
     */
    STOP_LOSS_ORDER_GUARANTEED_MINIMUM_DISTANCE_NOT_MET,

    /**
     * An attempt was made to cancel a Stop Loss Order, however the Account's
     * configuration requires every Trade have an associated Stop Loss Order.
     */
    STOP_LOSS_ORDER_NOT_CANCELABLE,

    /**
     * An attempt was made to cancel and replace a Stop Loss Order, however the
     * Account's configuration prevents the modification of Stop Loss Orders.
     */
    STOP_LOSS_ORDER_NOT_REPLACEABLE,

    /**
     * An attempt was made to create a guaranteed Stop Loss Order, however
     * doing so would exceed the Account's configured guaranteed StopLoss Order
     * level restriction volume.
     */
    STOP_LOSS_ORDER_GUARANTEED_LEVEL_RESTRICTION_EXCEEDED,

    /**
     * The Stop Loss Order request contains both the price and distance fields.
     */
    STOP_LOSS_ORDER_PRICE_AND_DISTANCE_BOTH_SPECIFIED,

    /**
     * The Stop Loss Order request contains neither the price nor distance
     * fields.
     */
    STOP_LOSS_ORDER_PRICE_AND_DISTANCE_BOTH_MISSING,

    /**
     * An attempt to create a pending Order was made with no Stop Loss Order on
     * fill specified and the Account's configuration requires that every Trade
     * have an associated Stop Loss Order.
     */
    STOP_LOSS_ON_FILL_REQUIRED_FOR_PENDING_ORDER,

    /**
     * An attempt to create a pending Order was made with a Stop Loss Order on
     * fill that was explicitly configured to be guaranteed, however the
     * Account's configuration does not allow guaranteed Stop Loss Orders.
     */
    STOP_LOSS_ON_FILL_GUARANTEED_NOT_ALLOWED,

    /**
     * An attempt to create a pending Order was made with a Stop Loss Order on
     * fill that was explicitly configured to be not guaranteed, however the
     * Account's configuration requires guaranteed Stop Loss Orders.
     */
    STOP_LOSS_ON_FILL_GUARANTEED_REQUIRED,

    /**
     * The Stop Loss on fill specified does not provide a price
     */
    STOP_LOSS_ON_FILL_PRICE_MISSING,

    /**
     * The Stop Loss on fill specifies an invalid price
     */
    STOP_LOSS_ON_FILL_PRICE_INVALID,

    /**
     * The Stop Loss on fill specifies a price with more precision than is
     * allowed by the Order's instrument
     */
    STOP_LOSS_ON_FILL_PRICE_PRECISION_EXCEEDED,

    /**
     * An attempt to create a pending Order was made with the distance between
     * the guaranteed Stop Loss Order on fill's price and the pending Order's
     * price is less than the Account's configured minimum guaranteed stop loss
     * distance.
     */
    STOP_LOSS_ON_FILL_GUARANTEED_MINIMUM_DISTANCE_NOT_MET,

    /**
     * An attempt to create a pending Order was made with a guaranteed Stop
     * Loss Order on fill configured, and the Order's units exceed the
     * Account's configured guaranteed StopLoss Order level restriction volume.
     */
    STOP_LOSS_ON_FILL_GUARANTEED_LEVEL_RESTRICTION_EXCEEDED,

    /**
     * The Stop Loss on fill distance is invalid
     */
    STOP_LOSS_ON_FILL_DISTANCE_INVALID,

    /**
     * The Stop Loss on fill price distance exceeds the maximum allowed amount
     */
    STOP_LOSS_ON_FILL_PRICE_DISTANCE_MAXIMUM_EXCEEDED,

    /**
     * The Stop Loss on fill distance contains more precision than is allowed
     * by the instrument
     */
    STOP_LOSS_ON_FILL_DISTANCE_PRECISION_EXCEEDED,

    /**
     * The Stop Loss on fill contains both the price and distance fields.
     */
    STOP_LOSS_ON_FILL_PRICE_AND_DISTANCE_BOTH_SPECIFIED,

    /**
     * The Stop Loss on fill contains neither the price nor distance fields.
     */
    STOP_LOSS_ON_FILL_PRICE_AND_DISTANCE_BOTH_MISSING,

    /**
     * The Stop Loss on fill specified does not provide a TimeInForce
     */
    STOP_LOSS_ON_FILL_TIME_IN_FORCE_MISSING,

    /**
     * The Stop Loss on fill specifies an invalid TimeInForce
     */
    STOP_LOSS_ON_FILL_TIME_IN_FORCE_INVALID,

    /**
     * The Stop Loss on fill specifies a GTD TimeInForce but does not provide a
     * GTD timestamp
     */
    STOP_LOSS_ON_FILL_GTD_TIMESTAMP_MISSING,

    /**
     * The Stop Loss on fill specifies a GTD timestamp that is in the past
     */
    STOP_LOSS_ON_FILL_GTD_TIMESTAMP_IN_PAST,

    /**
     * The Stop Loss on fill client Order ID specified is invalid
     */
    STOP_LOSS_ON_FILL_CLIENT_ORDER_ID_INVALID,

    /**
     * The Stop Loss on fill client Order tag specified is invalid
     */
    STOP_LOSS_ON_FILL_CLIENT_ORDER_TAG_INVALID,

    /**
     * The Stop Loss on fill client Order comment specified is invalid
     */
    STOP_LOSS_ON_FILL_CLIENT_ORDER_COMMENT_INVALID,

    /**
     * The Stop Loss on fill specified does not provide a TriggerCondition
     */
    STOP_LOSS_ON_FILL_TRIGGER_CONDITION_MISSING,

    /**
     * The Stop Loss on fill specifies an invalid TriggerCondition
     */
    STOP_LOSS_ON_FILL_TRIGGER_CONDITION_INVALID,

    /**
     * A Trailing Stop Loss Order for the specified Trade already exists
     */
    TRAILING_STOP_LOSS_ORDER_ALREADY_EXISTS,

    /**
     * The Trailing Stop Loss on fill specified does not provide a distance
     */
    TRAILING_STOP_LOSS_ON_FILL_PRICE_DISTANCE_MISSING,

    /**
     * The Trailing Stop Loss on fill distance is invalid
     */
    TRAILING_STOP_LOSS_ON_FILL_PRICE_DISTANCE_INVALID,

    /**
     * The Trailing Stop Loss on fill distance contains more precision than is
     * allowed by the instrument
     */
    TRAILING_STOP_LOSS_ON_FILL_PRICE_DISTANCE_PRECISION_EXCEEDED,

    /**
     * The Trailing Stop Loss on fill price distance exceeds the maximum
     * allowed amount
     */
    TRAILING_STOP_LOSS_ON_FILL_PRICE_DISTANCE_MAXIMUM_EXCEEDED,

    /**
     * The Trailing Stop Loss on fill price distance does not meet the minimum
     * allowed amount
     */
    TRAILING_STOP_LOSS_ON_FILL_PRICE_DISTANCE_MINIMUM_NOT_MET,

    /**
     * The Trailing Stop Loss on fill specified does not provide a TimeInForce
     */
    TRAILING_STOP_LOSS_ON_FILL_TIME_IN_FORCE_MISSING,

    /**
     * The Trailing Stop Loss on fill specifies an invalid TimeInForce
     */
    TRAILING_STOP_LOSS_ON_FILL_TIME_IN_FORCE_INVALID,

    /**
     * The Trailing Stop Loss on fill TimeInForce is specified as GTD but no
     * GTD timestamp is provided
     */
    TRAILING_STOP_LOSS_ON_FILL_GTD_TIMESTAMP_MISSING,

    /**
     * The Trailing Stop Loss on fill GTD timestamp is in the past
     */
    TRAILING_STOP_LOSS_ON_FILL_GTD_TIMESTAMP_IN_PAST,

    /**
     * The Trailing Stop Loss on fill client Order ID specified is invalid
     */
    TRAILING_STOP_LOSS_ON_FILL_CLIENT_ORDER_ID_INVALID,

    /**
     * The Trailing Stop Loss on fill client Order tag specified is invalid
     */
    TRAILING_STOP_LOSS_ON_FILL_CLIENT_ORDER_TAG_INVALID,

    /**
     * The Trailing Stop Loss on fill client Order comment specified is invalid
     */
    TRAILING_STOP_LOSS_ON_FILL_CLIENT_ORDER_COMMENT_INVALID,

    /**
     * A client attempted to create either a Trailing Stop Loss order or an
     * order with a Trailing Stop Loss On Fill specified, which may not yet be
     * supported.
     */
    TRAILING_STOP_LOSS_ORDERS_NOT_SUPPORTED,

    /**
     * The Trailing Stop Loss on fill specified does not provide a
     * TriggerCondition
     */
    TRAILING_STOP_LOSS_ON_FILL_TRIGGER_CONDITION_MISSING,

    /**
     * The Tailing Stop Loss on fill specifies an invalid TriggerCondition
     */
    TRAILING_STOP_LOSS_ON_FILL_TRIGGER_CONDITION_INVALID,

    /**
     * The request to close a Trade does not specify a full or partial close
     */
    CLOSE_TRADE_TYPE_MISSING,

    /**
     * The request to close a Trade partially did not specify the number of
     * units to close
     */
    CLOSE_TRADE_PARTIAL_UNITS_MISSING,

    /**
     * The request to partially close a Trade specifies a number of units that
     * exceeds the current size of the given Trade
     */
    CLOSE_TRADE_UNITS_EXCEED_TRADE_SIZE,

    /**
     * The Position requested to be closed out does not exist
     */
    CLOSEOUT_POSITION_DOESNT_EXIST,

    /**
     * The request to closeout a Position was specified incompletely
     */
    CLOSEOUT_POSITION_INCOMPLETE_SPECIFICATION,

    /**
     * A partial Position closeout request specifies a number of units that
     * exceeds the current Position
     */
    CLOSEOUT_POSITION_UNITS_EXCEED_POSITION_SIZE,

    /**
     * The request to closeout a Position could not be fully satisfied
     */
    CLOSEOUT_POSITION_REJECT,

    /**
     * The request to partially closeout a Position did not specify the number
     * of units to close.
     */
    CLOSEOUT_POSITION_PARTIAL_UNITS_MISSING,

    /**
     * The markup group ID provided is invalid
     */
    MARKUP_GROUP_ID_INVALID,

    /**
     * The PositionAggregationMode provided is not supported/valid.
     */
    POSITION_AGGREGATION_MODE_INVALID,

    /**
     * No configuration parameters provided
     */
    ADMIN_CONFIGURE_DATA_MISSING,

    /**
     * The margin rate provided is invalid
     */
    MARGIN_RATE_INVALID,

    /**
     * The margin rate provided would cause an immediate margin closeout
     */
    MARGIN_RATE_WOULD_TRIGGER_CLOSEOUT,

    /**
     * The account alias string provided is invalid
     */
    ALIAS_INVALID,

    /**
     * No configuration parameters provided
     */
    CLIENT_CONFIGURE_DATA_MISSING,

    /**
     * The margin rate provided would cause the Account to enter a margin call
     * state.
     */
    MARGIN_RATE_WOULD_TRIGGER_MARGIN_CALL,

    /**
     * Funding is not possible because the requested transfer amount is invalid
     */
    AMOUNT_INVALID,

    /**
     * The Account does not have sufficient balance to complete the funding
     * request
     */
    INSUFFICIENT_FUNDS,

    /**
     * Funding amount has not been specified
     */
    AMOUNT_MISSING,

    /**
     * Funding reason has not been specified
     */
    FUNDING_REASON_MISSING,

    /**
     * Neither Order nor Trade on Fill client extensions were provided for
     * modification
     */
    CLIENT_EXTENSIONS_DATA_MISSING,

    /**
     * The Order to be replaced has a different type than the replacing Order.
     */
    REPLACING_ORDER_INVALID,

    /**
     * The replacing Order refers to a different Trade than the Order that is
     * being replaced.
     */
    REPLACING_TRADE_ID_INVALID
}
