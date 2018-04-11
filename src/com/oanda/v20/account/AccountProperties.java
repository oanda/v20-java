package com.oanda.v20.account;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

import com.google.gson.annotations.SerializedName;

/**
 * Properties related to an Account.
 */
public class AccountProperties {

    /**
     * Default constructor.
     */
    public AccountProperties() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the AccountProperties to copy
     */
    public AccountProperties(AccountProperties other) {
        this.id = other.id;
        if (other.mt4AccountID != null)
        {
            this.mt4AccountID = new Long(other.mt4AccountID);
        }
        if (other.tags != null)
        {
            this.tags = new ArrayList<String>(other.tags);
        }
    }

    @SerializedName("id") private AccountID id;

    /**
     * Get the ID
     * <p>
     * The Account's identifier
     * <p>
     * @return the ID
     * @see AccountID
     */
    public AccountID getId() {
        return this.id;
    }

    /**
     * Set the ID
     * <p>
     * The Account's identifier
     * <p>
     * @param id the ID as an AccountID
     * @return {@link AccountProperties AccountProperties}
     * @see AccountID
     */
    public AccountProperties setId(AccountID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the ID
     * <p>
     * The Account's identifier
     * <p>
     * @param id the ID as a String
     * @return {@link AccountProperties AccountProperties}
     * @see AccountID
     */
    public AccountProperties setId(String id) {
        this.id = new AccountID(id);
        return this;
    }

    @SerializedName("mt4AccountID") private Long mt4AccountID;

    /**
     * Get the MT4 Account ID
     * <p>
     * The Account's associated MT4 Account ID. This field will not be present
     * if the Account is not an MT4 account.
     * <p>
     * @return the MT4 Account ID
     */
    public Long getMt4AccountID() {
        return this.mt4AccountID;
    }

    /**
     * Set the MT4 Account ID
     * <p>
     * The Account's associated MT4 Account ID. This field will not be present
     * if the Account is not an MT4 account.
     * <p>
     * @param mt4AccountID the MT4 Account ID as a Long
     * @return {@link AccountProperties AccountProperties}
     */
    public AccountProperties setMt4AccountID(Long mt4AccountID) {
        this.mt4AccountID = mt4AccountID;
        return this;
    }

    @SerializedName("tags") private ArrayList<String> tags;

    /**
     * Get the Account Tags
     * <p>
     * The Account's tags
     * <p>
     * @return the Account Tags
     */
    public List<String> getTags() {
        return this.tags;
    }

    /**
     * Set the Account Tags
     * <p>
     * The Account's tags
     * <p>
     * @param tags the Account Tags
     * @return {@link AccountProperties AccountProperties}
     */
    public AccountProperties setTags(Collection<?> tags) {
        ArrayList<String> newTags = new ArrayList<String>(tags.size());
        tags.forEach((item) -> {
            if (item instanceof String)
            {
                newTags.add((String) item);
            }
            else
            {
                throw new IllegalArgumentException(
                    item.getClass().getName() + " cannot be converted to a String"
                );
            }
        });
        this.tags = newTags;
        return this;
    }

    @Override
    public String toString() {
        return "AccountProperties(" +
            "id=" +
                (id == null ? "null" : id.toString()) + ", " +
            "mt4AccountID=" +
                (mt4AccountID == null ? "null" : mt4AccountID.toString()) + ", " +
            "tags=" +
                (tags == null ? "null" : tags.toString()) +
            ")";
    }
}
