package com.oanda.v20;

import java.util.HashMap;

public class Request {

    protected HashMap<String, Object> pathParams = new HashMap<>();
    protected HashMap<String, Object> queryParams = new HashMap<>();
    protected Object body;

    public Request() {
    }

    public HashMap<String, Object> getPathParams() {
        return this.pathParams;
    }

    public void setPathParam(String name, Object value) {
        this.pathParams.put(name, value);
    }

    public HashMap<String, Object> getQueryParams() {
        return this.queryParams;
    }

    public void setQueryParam(String name, Object value) {
        this.queryParams.put(name, value);
    }

    public Object getBody() {
        return this.body;
    }
}
