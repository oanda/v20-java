package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

public class RequestException extends Exception {

    private static final long serialVersionUID = -312816903998781226L;

    protected int status;

    @SerializedName("errorCode") protected String errorCode;
    @SerializedName("errorMessage") protected String errorMessage;

    protected RequestException(int status) {
        this.status = status;
    }

    protected RequestException() {
        this.status = 0;
    }

    public int getStatus() {
        return status;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String toString() {
        String str = "";
        str += status;
        str += " : ";
        str += errorCode;
        str += " : ";
        str += errorMessage;
        return str;
    }
}
