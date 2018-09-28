package com.oanda.v20.order;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;

// GSON Deserializer for Order implementors
public class OrderAdapter implements JsonDeserializer<Order> {
    @Override
    public Order deserialize(JsonElement json, Type arg1,
            JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject =  json.getAsJsonObject();
        JsonPrimitive prim = (JsonPrimitive) jsonObject.get("type");
        String typestring = prim.getAsString();
        OrderType type = OrderType.valueOf(typestring);

        switch (type) {
        case TAKE_PROFIT:
            return context.deserialize(json, TakeProfitOrder.class);
        case STOP_LOSS:
            return context.deserialize(json, StopLossOrder.class);
        case TRAILING_STOP_LOSS:
            return context.deserialize(json, TrailingStopLossOrder.class);
        case MARKET:
            return context.deserialize(json, MarketOrder.class);
        case FIXED_PRICE:
            return context.deserialize(json, FixedPriceOrder.class);
        case LIMIT:
            return context.deserialize(json, LimitOrder.class);
        case STOP:
            return context.deserialize(json, StopOrder.class);
        case MARKET_IF_TOUCHED:
            return context.deserialize(json, MarketIfTouchedOrder.class);
        }
        return null;
    }
}
