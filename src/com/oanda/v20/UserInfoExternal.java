package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * A representation of user information, as available to external (3rd party)
 * clients.
 */
public class UserInfoExternal {

    @SerializedName("userID") private Integer userID;

    /**
     * Set the userID
     * <p>
     * The user's OANDA-assigned user ID.
     * <p>
     * @param userID the userID
     * @return {@link UserInfoExternal UserInfoExternal}
     */
    public UserInfoExternal setUserID(int userID) {
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
     * @return {@link UserInfoExternal UserInfoExternal}
     */
    public UserInfoExternal setCountry(String country) {
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

    @SerializedName("FIFO") private Boolean fIFO;

    /**
     * Set the FIFO
     * <p>
     * Flag indicating if the the user's Accounts adhere to FIFO execution
     * rules.
     * <p>
     * @param fIFO the FIFO
     * @return {@link UserInfoExternal UserInfoExternal}
     */
    public UserInfoExternal setFIFO(boolean fIFO) {
        this.fIFO = fIFO;
        return this;
    }

    /**
     * Get the FIFO
     * <p>
     * Flag indicating if the the user's Accounts adhere to FIFO execution
     * rules.
     * <p>
     * @return the FIFO
     */
    public boolean getFIFO() {
        return this.fIFO;
    }
}
