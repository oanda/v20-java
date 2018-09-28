package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

public class RequestException extends Exception {

    private static final long serialVersionUID = 5034421099988970354L;

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
        String str = "HTTP " + status;

        if (errorCode != null) {
            str += " : ";
            str += errorCode;
        }
        if (errorMessage != null) {
            str += " : ";
            str += errorMessage;
        }

        return str;
    }
}
