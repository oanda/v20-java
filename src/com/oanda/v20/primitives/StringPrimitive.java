package com.oanda.v20.primitives;

public class StringPrimitive implements CharSequence {

    protected String string;

    /**
     * StringPrimitive constructor.
     * <p>
     * @param string the contained string
     */
    public StringPrimitive(String string) {
        this.string = string;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof StringPrimitive)
        {
            return string.equals(((StringPrimitive) obj).string);
        }
        return string.equals(obj.toString());
    }

    @Override
    public int hashCode() {
        return string.hashCode();
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        return string.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return string.subSequence(start, end);
    }

    @Override
    public String toString() {
        return string;
    }
}
