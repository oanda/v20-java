package com.oanda.v20.user;

import java.util.HashMap;

import com.oanda.v20.Context;
import com.oanda.v20.ExecuteException;
import com.oanda.v20.Request;
import com.oanda.v20.RequestException;

public class UserContext {

    private Context ctx;

    /**
     * Default constructor
     * <p>
     * @param ctx Context object
     * @see Context
     */
    public UserContext(Context ctx) {
        this.ctx = ctx;
    }

    private HashMap<Integer, Class<?>> getInfoResponseMap;

    /**
     * User Info
     * <p>
     * Fetch the user information for the specified user. This endpoint is
     *     intended to be used by the user themself to obtain their own
     *     information.
     * <p>
     * @param userSpecifier The User Specifier
     * @return {@link UserGetInfoResponse UserGetInfoResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see UserSpecifier
     * @see RequestException
     * @see ExecuteException
     */
    public UserGetInfoResponse getInfo(UserSpecifier userSpecifier)
        throws RequestException, ExecuteException
    {
        Request request = new Request();
        request.setPathParam("userSpecifier", userSpecifier);

        if (getInfoResponseMap == null) {
            getInfoResponseMap = new HashMap<>();
            getInfoResponseMap.put(200, UserGetInfoResponse.class);
        }

        return (UserGetInfoResponse) ctx.execute(
            "GET",
            "/v3/users/{userSpecifier}",
            request,
            getInfoResponseMap
        );
    }

    private HashMap<Integer, Class<?>> getExternalInfoResponseMap;

    /**
     * External User Info
     * <p>
     * Fetch the externally-available user information for the specified user.
     *     This endpoint is intended to be used by 3rd parties that have been
     *     authorized by a user to view their personal information.
     * <p>
     * @param userSpecifier The User Specifier
     * @return {@link UserGetExternalInfoResponse UserGetExternalInfoResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see UserSpecifier
     * @see RequestException
     * @see ExecuteException
     */
    public UserGetExternalInfoResponse getExternalInfo(UserSpecifier userSpecifier)
        throws RequestException, ExecuteException
    {
        Request request = new Request();
        request.setPathParam("userSpecifier", userSpecifier);

        if (getExternalInfoResponseMap == null) {
            getExternalInfoResponseMap = new HashMap<>();
            getExternalInfoResponseMap.put(200, UserGetExternalInfoResponse.class);
        }

        return (UserGetExternalInfoResponse) ctx.execute(
            "GET",
            "/v3/users/{userSpecifier}/externalInfo",
            request,
            getExternalInfoResponseMap
        );
    }
}
