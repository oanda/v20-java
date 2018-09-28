package com.oanda.v20.primitives;

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
}
