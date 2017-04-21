package com.oanda.v20;

public class ExecuteException extends Exception {

    private static final long serialVersionUID = 7594856474065153336L;

    public ExecuteException(Throwable cause) {
        super(cause);
    }

    public ExecuteException(String message, Throwable cause) {
        super(message, cause);
    }
}
