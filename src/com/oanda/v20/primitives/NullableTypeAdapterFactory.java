package com.oanda.v20.primitives;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/**
 * Generic Nullable type GSON TypeAdapterFactory
 *
 * @param <C> the underlying type being held by the NullableType
 */
public class NullableTypeAdapterFactory<C> implements TypeAdapterFactory {

    private final Class<C> containedClass;

    public <T> NullableTypeAdapterFactory(Class<C> containedClass) {
        this.containedClass = containedClass;
    }

    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {

        if (type.getRawType() != NullableType.class) {
            return null;
        }

        if (getBaseType(type.getType()) != this.containedClass)
        {
            return null;
        }

        final TypeAdapter<C> delegate  = gson.getDelegateAdapter(this, TypeToken.get(this.containedClass));

        return new TypeAdapter<T>() {
            @SuppressWarnings("unchecked")
            @Override
            public void write(JsonWriter out, T value) throws IOException {
                if (value == null || ! ((NullableType<C>) value).isSet()) {
                    out.nullValue();
                }
                else if (((NullableType<C>) value).getValue() == null) {
                    boolean oldSerializeNulls = out.getSerializeNulls();
                    out.setSerializeNulls(true);
                    out.nullValue();
                    out.setSerializeNulls(oldSerializeNulls);
                }
                else {
                    try {
                        delegate.write(out, (C) (((NullableType<C>) value).getValue()));
                    } catch (IllegalArgumentException e) {
                        throw new IOException(e);
                    }
                }
            }

            @SuppressWarnings("unchecked")
            @Override
            public T read(JsonReader in) throws IOException {
                if (in.peek() == JsonToken.NULL) {
                    in.nextNull();
                    return (T) new NullableType<C>();
                } else {
                    return (T) new NullableType<C>(delegate.read(in));
                }
            }
        };
    }

    final private Type getBaseType(Type type) {
        if (! (type instanceof ParameterizedType)) {
            return type;
        }

        Type[] types = ((ParameterizedType) type).getActualTypeArguments();

        if (types[0] instanceof ParameterizedType) {
            return ((ParameterizedType) types[0]).getRawType();
        }
        return types[0];
    }
}
