package com.oanda.v20.primitives;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/**
 * Generic Nullable type
 *
 * @param <T> the underlying type being held
 */
public class NullableType<T> {

    private T value;
    private boolean set = false;

    /**
     * NullableType default constructor.
     */
    public NullableType() {
    }

    /**
     * NullableType constructor.
     *
     * @param      value  the value to store
     */
    public NullableType(T value) {
        this.value = value;
        this.set = true;
    }

    /**
     * Constructs the object.
     *
     * @param      other  The other object
     */
    public NullableType(NullableType<T> other) {
        this.value = other.value;
        this.set = other.set;
    }

    /**
     * Gets the value.
     *
     * @return     The value.
     */
    public T getValue() {
        return this.value;
    }

    /**
     * Determines if the value has been set.
     *
     * @return     True if set, False otherwise.
     */
    public boolean isSet() {
        return this.set;
    }

    /**
     * Sets the value.
     *
     * @param      value  The value
     */
    public void setValue(T value) {
        this.value = value;
        this.set = true;
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof NullableType)
        {
            if (value == ((NullableType<?>) obj).value) {
                return true;
            }
            if (value == null || ((NullableType<?>) obj).value == null) {
                return false;
            }
            if (this.value.getClass().isAssignableFrom(
                ((NullableType<?>) obj).value.getClass())) {
                return value.equals((T) ((NullableType<?>) obj).value);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        if (value == null) {
            return "<null>";
        } else {
            return value.toString();
        }
    }

    public static class NullableTypeAdapterFactory implements TypeAdapterFactory {

        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {

            @SuppressWarnings("unchecked")
            Class<T> rawType = (Class<T>) type.getRawType();
            if (!rawType.equals(NullableType.class)) {
                return null;
            }

            Class<?> containedClass = getActualClass((ParameterizedType) type.getType());
            final TypeAdapter<?> delegate  = gson.getAdapter(containedClass);
            final Method delegateWrite = getDelegateWriter(delegate);
            final Constructor<?> constructor = getConstructor(rawType, containedClass);

            return new TypeAdapter<T>() {
                @Override
                public void write(JsonWriter out, T value) throws IOException {
                    if (value == null) {
                        out.nullValue();
                    }
                    else if (((NullableType<?>) value).set &&
                        ((NullableType<?>) value).value == null) {
                        boolean oldSerializeNulls = out.getSerializeNulls();
                        out.setSerializeNulls(true);
                        out.nullValue();
                        out.setSerializeNulls(oldSerializeNulls);
                    }
                    else {
                        try {
                            delegateWrite.invoke(
                                delegate,
                                out,
                                ((NullableType<?>) value).value
                            );
                        } catch (IllegalAccessException | IllegalArgumentException
                                    | InvocationTargetException e) {
                            throw new IOException(e);
                        }
                    }
                }

                @SuppressWarnings("unchecked")
                @Override
                public T read(JsonReader in) throws IOException {
                    try {
                        if (in.peek() == JsonToken.NULL) {
                            in.nextNull();
                            return (T) constructor.newInstance((Object) null);
                        } else {
                            return (T) constructor.newInstance(delegate.read(in));
                        }
                    } catch (InvocationTargetException | IllegalAccessException
                                | InstantiationException e) {
                        throw new IOException(e);
                    }
                }
            };
        }

        private static Class<?> getActualClass(ParameterizedType type)
        {
            try {
                return Class.forName(
                    type.getActualTypeArguments()[0]
                        .getTypeName()
                );
            } catch (ClassNotFoundException e) {
                return null;
            }
        }

        private static Method getDelegateWriter(TypeAdapter<?> delegate)
        {
            try {
                for (Method method : delegate.getClass().getMethods())
                {
                    if (method.getName().equals("write"))
                    {
                        return method;
                    }
                }
                return null;
            } catch (IllegalArgumentException e) {
                return null;
            }
        }

        private static Constructor<?> getConstructor(Class<?> type, Class<?> containedClass)
        {
            try {
                return type.getDeclaredConstructor(containedClass);
            } catch (NoSuchMethodException | SecurityException e)
            {
                return null;
            }
        }
    }
}
