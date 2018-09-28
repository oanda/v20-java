package com.oanda.v20;

public class ExecuteException extends Exception {

    private static final long serialVersionUID = -9108619579059959148L;

    public ExecuteException(Throwable cause) {
        super(cause);
    }

    public ExecuteException(String message, Throwable cause) {
        super(message, cause);
    }
}
