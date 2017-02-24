package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * Properties related to an Account.
 */
public class AccountProperties {

    @SerializedName("id") private AccountID id;

    /**
     * Set the ID
     * <p>
     * The Account's identifier
     * <p>
     * @param id the ID
     * @return {@link AccountProperties AccountProperties}
     * @see AccountID
     */
    public AccountProperties setId(String id) {
        this.id = new AccountID(id);
        return this;
    }

    /**
     * Get the ID
     * <p>
     * The Account's identifier
     * <p>
     * @return the ID
     * @see AccountID
     */
    public String getId() {
        return this.id.getAccountID();
    }

    @SerializedName("mt4AccountID") private Integer mt4AccountID;

    /**
     * Set the MT4 Account ID
     * <p>
     * The Account's associated MT4 Account ID. This field will not be present
     * if the Account is not an MT4 account.
     * <p>
     * @param mt4AccountID the MT4 Account ID
     * @return {@link AccountProperties AccountProperties}
     */
    public AccountProperties setMt4AccountID(int mt4AccountID) {
        this.mt4AccountID = mt4AccountID;
        return this;
    }

    /**
     * Get the MT4 Account ID
     * <p>
     * The Account's associated MT4 Account ID. This field will not be present
     * if the Account is not an MT4 account.
     * <p>
     * @return the MT4 Account ID
     */
    public int getMt4AccountID() {
        return this.mt4AccountID;
    }

    @SerializedName("tags") private String[] tags;

    /**
     * Set the Account Tags
     * <p>
     * The Account's tags
     * <p>
     * @param tags the Account Tags
     * @return {@link AccountProperties AccountProperties}
     */
    public AccountProperties setTags(String[] tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the Account Tags
     * <p>
     * The Account's tags
     * <p>
     * @return the Account Tags
     */
    public String[] getTags() {
        return this.tags;
    }
}
