package com.oanda.v20;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;

import com.oanda.v20.primitives.AcceptDatetimeFormat;
import com.oanda.v20.Context;

/**
 * Builder class for Context objects
 */
public class ContextBuilder {
    private String uri;
    private String token;
    private String application;
    private AcceptDatetimeFormat datetimeFormat = AcceptDatetimeFormat.RFC3339;
    private HttpClient httpClient;

    /**
     * Constructs the builder object.
     *
     * @param      uri   the uri
     */
    public ContextBuilder(String uri) {
        this.uri = uri;
    }

    /**
     * Sets the uri.
     *
     * @param      uri   the uri
     *
     * @return     The ContextBuilder
     */
    public ContextBuilder setUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Sets the token.
     *
     * @param      token  The token
     *
     * @return     The ContextBuilder
     */
    public ContextBuilder setToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Sets the application.
     *
     * @param      application  The application
     *
     * @return     The ContextBuilder
     */
    public ContextBuilder setApplication(String application) {
        this.application = application;
        return this;
    }

    /**
     * Sets the datetime format.
     *
     * @param      datetimeFormat  The datetime format
     *
     * @return     The ContextBuilder
     */
    public ContextBuilder setDatetimeFormat(AcceptDatetimeFormat datetimeFormat) {
        this.datetimeFormat = datetimeFormat;
        return this;
    }

    /**
     * Sets the http client.
     *
     * @param      httpClient  The http client
     *
     * @return     The ContextBuilder
     */
    public ContextBuilder setHttpClient(HttpClient httpClient)
    {
        this.httpClient = httpClient;
        return this;
    }

    /**
     * Build the Context object.
     *
     * @return     The new Context object
     */
    public Context build() {
        if (httpClient == null)
        {
            httpClient = HttpClients.createDefault();
        }

        return new Context(uri, token, application, datetimeFormat, httpClient);
    }
}
