package com.oanda.v20.transaction;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;

// GSON Deserializer for Transaction implementors
public class TransactionAdapter implements JsonDeserializer<Transaction> {
    @Override
    public Transaction deserialize(JsonElement json, Type arg1,
            JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject =  json.getAsJsonObject();
        JsonPrimitive prim = (JsonPrimitive) jsonObject.get("type");
        String typestring = prim.getAsString();
        TransactionType type = TransactionType.valueOf(typestring);

        switch (type) {
        case MARKET_ORDER:
            return context.deserialize(json, MarketOrderTransaction.class);
        case ORDER_FILL:
            return context.deserialize(json, OrderFillTransaction.class);
        case ORDER_CANCEL:
            return context.deserialize(json, OrderCancelTransaction.class);
        case MARKET_ORDER_REJECT:
            return context.deserialize(json, MarketOrderRejectTransaction.class);
        case TRADE_CLIENT_EXTENSIONS_MODIFY:
            return context.deserialize(json, TradeClientExtensionsModifyTransaction.class);
        case TRADE_CLIENT_EXTENSIONS_MODIFY_REJECT:
            return context.deserialize(json, TradeClientExtensionsModifyRejectTransaction.class);
        case TAKE_PROFIT_ORDER:
            return context.deserialize(json, TakeProfitOrderTransaction.class);
        case STOP_LOSS_ORDER:
            return context.deserialize(json, StopLossOrderTransaction.class);
        case TRAILING_STOP_LOSS_ORDER:
            return context.deserialize(json, TrailingStopLossOrderTransaction.class);
        case ORDER_CANCEL_REJECT:
            return context.deserialize(json, OrderCancelRejectTransaction.class);
        case TAKE_PROFIT_ORDER_REJECT:
            return context.deserialize(json, TakeProfitOrderRejectTransaction.class);
        case STOP_LOSS_ORDER_REJECT:
            return context.deserialize(json, StopLossOrderRejectTransaction.class);
        case TRAILING_STOP_LOSS_ORDER_REJECT:
            return context.deserialize(json, TrailingStopLossOrderRejectTransaction.class);
        case CLIENT_CONFIGURE:
            return context.deserialize(json, ClientConfigureTransaction.class);
        case CLIENT_CONFIGURE_REJECT:
            return context.deserialize(json, ClientConfigureRejectTransaction.class);
        case CREATE:
            return context.deserialize(json, CreateTransaction.class);
        case CLOSE:
            return context.deserialize(json, CloseTransaction.class);
        case REOPEN:
            return context.deserialize(json, ReopenTransaction.class);
        case TRANSFER_FUNDS:
            return context.deserialize(json, TransferFundsTransaction.class);
        case TRANSFER_FUNDS_REJECT:
            return context.deserialize(json, TransferFundsRejectTransaction.class);
        case FIXED_PRICE_ORDER:
            return context.deserialize(json, FixedPriceOrderTransaction.class);
        case LIMIT_ORDER:
            return context.deserialize(json, LimitOrderTransaction.class);
        case LIMIT_ORDER_REJECT:
            return context.deserialize(json, LimitOrderRejectTransaction.class);
        case STOP_ORDER:
            return context.deserialize(json, StopOrderTransaction.class);
        case STOP_ORDER_REJECT:
            return context.deserialize(json, StopOrderRejectTransaction.class);
        case MARKET_IF_TOUCHED_ORDER:
            return context.deserialize(json, MarketIfTouchedOrderTransaction.class);
        case MARKET_IF_TOUCHED_ORDER_REJECT:
            return context.deserialize(json, MarketIfTouchedOrderRejectTransaction.class);
        case ORDER_CLIENT_EXTENSIONS_MODIFY:
            return context.deserialize(json, OrderClientExtensionsModifyTransaction.class);
        case ORDER_CLIENT_EXTENSIONS_MODIFY_REJECT:
            return context.deserialize(json, OrderClientExtensionsModifyRejectTransaction.class);
        case MARGIN_CALL_ENTER:
            return context.deserialize(json, MarginCallEnterTransaction.class);
        case MARGIN_CALL_EXTEND:
            return context.deserialize(json, MarginCallExtendTransaction.class);
        case MARGIN_CALL_EXIT:
            return context.deserialize(json, MarginCallExitTransaction.class);
        case DELAYED_TRADE_CLOSURE:
            return context.deserialize(json, DelayedTradeClosureTransaction.class);
        case DAILY_FINANCING:
            return context.deserialize(json, DailyFinancingTransaction.class);
        case RESET_RESETTABLE_PL:
            return context.deserialize(json, ResetResettablePLTransaction.class);
        }
        return null;
    }
}
