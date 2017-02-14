package com.oanda.v20;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;

// GSON Deserializer for OrderRequest implementors
public class OrderRequestAdapter implements JsonDeserializer<OrderRequest> {
        @Override
        public OrderRequest deserialize(JsonElement json, Type arg1,
                JsonDeserializationContext context) throws JsonParseException { 
            JsonObject jsonObject =  json.getAsJsonObject();
            JsonPrimitive prim = (JsonPrimitive) jsonObject.get("type");
            String typestring = prim.getAsString();
            OrderType type = OrderType.valueOf(typestring);

            switch (type) {
            case MARKET:
                return context.deserialize(json, MarketOrderRequest.class);
            case LIMIT:
                return context.deserialize(json, LimitOrderRequest.class);
            case STOP:
                return context.deserialize(json, StopOrderRequest.class);
            case MARKET_IF_TOUCHED:
                return context.deserialize(json, MarketIfTouchedOrderRequest.class);
            case TAKE_PROFIT:
                return context.deserialize(json, TakeProfitOrderRequest.class);
            case STOP_LOSS:
                return context.deserialize(json, StopLossOrderRequest.class);
            case TRAILING_STOP_LOSS:
                return context.deserialize(json, TrailingStopLossOrderRequest.class);
            }
            return null; 
        }
}
