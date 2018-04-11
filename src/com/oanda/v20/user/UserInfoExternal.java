package com.oanda.v20.user;

import com.google.gson.annotations.SerializedName;

/**
 * A representation of user information, as available to external (3rd party)
 * clients.
 */
public class UserInfoExternal {

    /**
     * Default constructor.
     */
    public UserInfoExternal() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the UserInfoExternal to copy
     */
    public UserInfoExternal(UserInfoExternal other) {
        if (other.userID != null)
        {
            this.userID = new Long(other.userID);
        }
        this.country = other.country;
        if (other.fIFO != null)
        {
            this.fIFO = new Boolean(other.fIFO);
        }
    }

    @SerializedName("userID") private Long userID;

    /**
     * Get the userID
     * <p>
     * The user's OANDA-assigned user ID.
     * <p>
     * @return the userID
     */
    public Long getUserID() {
        return this.userID;
    }

    /**
     * Set the userID
     * <p>
     * The user's OANDA-assigned user ID.
     * <p>
     * @param userID the userID as a Long
     * @return {@link UserInfoExternal UserInfoExternal}
     */
    public UserInfoExternal setUserID(Long userID) {
        this.userID = userID;
        return this;
    }

    @SerializedName("country") private String country;

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

    /**
     * Set the country
     * <p>
     * The country that the user is based in.
     * <p>
     * @param country the country as a String
     * @return {@link UserInfoExternal UserInfoExternal}
     */
    public UserInfoExternal setCountry(String country) {
        this.country = country;
        return this;
    }

    @SerializedName("FIFO") private Boolean fIFO;

    /**
     * Get the FIFO
     * <p>
     * Flag indicating if the the user's Accounts adhere to FIFO execution
     * rules.
     * <p>
     * @return the FIFO
     */
    public Boolean getFIFO() {
        return this.fIFO;
    }

    /**
     * Set the FIFO
     * <p>
     * Flag indicating if the the user's Accounts adhere to FIFO execution
     * rules.
     * <p>
     * @param fIFO the FIFO as a Boolean
     * @return {@link UserInfoExternal UserInfoExternal}
     */
    public UserInfoExternal setFIFO(Boolean fIFO) {
        this.fIFO = fIFO;
        return this;
    }

    @Override
    public String toString() {
        return "UserInfoExternal(" +
            "userID=" +
                (userID == null ? "null" : userID.toString()) + ", " +
            "country=" +
                (country == null ? "null" : country.toString()) + ", " +
            "FIFO=" +
                (fIFO == null ? "null" : fIFO.toString()) +
            ")";
    }
}
