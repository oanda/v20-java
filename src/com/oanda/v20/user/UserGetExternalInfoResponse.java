package com.oanda.v20.user;

import com.google.gson.annotations.SerializedName;

/**
 * UserGetExternalInfoResponse
 */
public class UserGetExternalInfoResponse {

    /**
     * UserGetExternalInfoResponse Constructor
     * <p>
     * Construct a new UserGetExternalInfoResponse
     */
    private UserGetExternalInfoResponse() {
    }

    @SerializedName("userInfo") private UserInfoExternal userInfo;

    /**
     * Get the userInfo
     * <p>
     * The user information for the specifier user.
     * <p>
     * @return the userInfo
     * @see UserInfoExternal
     */
    public UserInfoExternal getUserInfo() {
        return this.userInfo;
    }
}
