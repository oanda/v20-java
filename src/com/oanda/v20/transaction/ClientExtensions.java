package com.oanda.v20.transaction;

import com.google.gson.annotations.SerializedName;

/**
 * A ClientExtensions object allows a client to attach a clientID, tag and
 * comment to Orders and Trades in their Account.  Do not set, modify, or
 * delete this field if your account is associated with MT4.
 */
public class ClientExtensions {

    /**
     * Default constructor.
     */
    public ClientExtensions() {
    }

    /**
     * Copy constructor
     * <p>
     * @param other the ClientExtensions to copy
     */
    public ClientExtensions(ClientExtensions other) {
        this.id = other.id;
        this.tag = other.tag;
        this.comment = other.comment;
    }

    @SerializedName("id") private ClientID id;

    /**
     * Get the Client ID
     * <p>
     * The Client ID of the Order/Trade
     * <p>
     * @return the Client ID
     * @see ClientID
     */
    public ClientID getId() {
        return this.id;
    }

    /**
     * Set the Client ID
     * <p>
     * The Client ID of the Order/Trade
     * <p>
     * @param id the Client ID as a ClientID
     * @return {@link ClientExtensions ClientExtensions}
     * @see ClientID
     */
    public ClientExtensions setId(ClientID id) {
        this.id = id;
        return this;
    }
    /**
     * Set the Client ID
     * <p>
     * The Client ID of the Order/Trade
     * <p>
     * @param id the Client ID as a String
     * @return {@link ClientExtensions ClientExtensions}
     * @see ClientID
     */
    public ClientExtensions setId(String id) {
        this.id = new ClientID(id);
        return this;
    }

    @SerializedName("tag") private ClientTag tag;

    /**
     * Get the Tag
     * <p>
     * A tag associated with the Order/Trade
     * <p>
     * @return the Tag
     * @see ClientTag
     */
    public ClientTag getTag() {
        return this.tag;
    }

    /**
     * Set the Tag
     * <p>
     * A tag associated with the Order/Trade
     * <p>
     * @param tag the Tag as a ClientTag
     * @return {@link ClientExtensions ClientExtensions}
     * @see ClientTag
     */
    public ClientExtensions setTag(ClientTag tag) {
        this.tag = tag;
        return this;
    }
    /**
     * Set the Tag
     * <p>
     * A tag associated with the Order/Trade
     * <p>
     * @param tag the Tag as a String
     * @return {@link ClientExtensions ClientExtensions}
     * @see ClientTag
     */
    public ClientExtensions setTag(String tag) {
        this.tag = new ClientTag(tag);
        return this;
    }

    @SerializedName("comment") private ClientComment comment;

    /**
     * Get the Comment
     * <p>
     * A comment associated with the Order/Trade
     * <p>
     * @return the Comment
     * @see ClientComment
     */
    public ClientComment getComment() {
        return this.comment;
    }

    /**
     * Set the Comment
     * <p>
     * A comment associated with the Order/Trade
     * <p>
     * @param comment the Comment as a ClientComment
     * @return {@link ClientExtensions ClientExtensions}
     * @see ClientComment
     */
    public ClientExtensions setComment(ClientComment comment) {
        this.comment = comment;
        return this;
    }
    /**
     * Set the Comment
     * <p>
     * A comment associated with the Order/Trade
     * <p>
     * @param comment the Comment as a String
     * @return {@link ClientExtensions ClientExtensions}
     * @see ClientComment
     */
    public ClientExtensions setComment(String comment) {
        this.comment = new ClientComment(comment);
        return this;
    }

    @Override
    public String toString() {
        return "ClientExtensions(" +
            "id=" +
                (id == null ? "null" : id.toString()) + ", " +
            "tag=" +
                (tag == null ? "null" : tag.toString()) + ", " +
            "comment=" +
                (comment == null ? "null" : comment.toString()) +
            ")";
    }
}
