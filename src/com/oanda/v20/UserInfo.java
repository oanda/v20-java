package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * A representation of user information, as provided to the user themself.
 */
public class UserInfo {

    @SerializedName("username") private String username;

    /**
     * Set the username
     * <p>
     * The user-provided username.
     * <p>
     * @param username the username
     * @return {@link UserInfo UserInfo}
     */
    public UserInfo setUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the username
     * <p>
     * The user-provided username.
     * <p>
     * @return the username
     */
    public String getUsername() {
        return this.username;
    }

    @SerializedName("userID") private Integer userID;

    /**
     * Set the userID
     * <p>
     * The user's OANDA-assigned user ID.
     * <p>
     * @param userID the userID
     * @return {@link UserInfo UserInfo}
     */
    public UserInfo setUserID(int userID) {
        this.userID = userID;
        return this;
    }

    /**
     * Get the userID
     * <p>
     * The user's OANDA-assigned user ID.
     * <p>
     * @return the userID
     */
    public int getUserID() {
        return this.userID;
    }

    @SerializedName("country") private String country;

    /**
     * Set the country
     * <p>
     * The country that the user is based in.
     * <p>
     * @param country the country
     * @return {@link UserInfo UserInfo}
     */
    public UserInfo setCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get the country
     * <p>
     * The country that the user is based in.
     * <p>
     * @return the country
     */
    public String getCountry() {
        return this.country;
    }

    @SerializedName("emailAddress") private String emailAddress;

    /**
     * Set the emailAddress
     * <p>
     * The user's email address.
     * <p>
     * @param emailAddress the emailAddress
     * @return {@link UserInfo UserInfo}
     */
    public UserInfo setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Get the emailAddress
     * <p>
     * The user's email address.
     * <p>
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return this.emailAddress;
    }
}
