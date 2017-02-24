package com.oanda.v20;

import com.google.gson.annotations.SerializedName;

/**
 * A ClientExtensions object allows a client to attach a clientID, tag and
 * comment to Orders and Trades in their Account.  Do not set, modify, or
 * delete this field if your account is associated with MT4.
 */
public class ClientExtensions {

    @SerializedName("id") private ClientID id;

    /**
     * Set the Client ID
     * <p>
     * The Client ID of the Order/Trade
     * <p>
     * @param id the Client ID
     * @return {@link ClientExtensions ClientExtensions}
     * @see ClientID
     */
    public ClientExtensions setId(String id) {
        this.id = new ClientID(id);
        return this;
    }

    /**
     * Get the Client ID
     * <p>
     * The Client ID of the Order/Trade
     * <p>
     * @return the Client ID
     * @see ClientID
     */
    public String getId() {
        return this.id.getClientID();
    }

    @SerializedName("tag") private ClientTag tag;

    /**
     * Set the Tag
     * <p>
     * A tag associated with the Order/Trade
     * <p>
     * @param tag the Tag
     * @return {@link ClientExtensions ClientExtensions}
     * @see ClientTag
     */
    public ClientExtensions setTag(String tag) {
        this.tag = new ClientTag(tag);
        return this;
    }

    /**
     * Get the Tag
     * <p>
     * A tag associated with the Order/Trade
     * <p>
     * @return the Tag
     * @see ClientTag
     */
    public String getTag() {
        return this.tag.getClientTag();
    }

    @SerializedName("comment") private ClientComment comment;

    /**
     * Set the Comment
     * <p>
     * A comment associated with the Order/Trade
     * <p>
     * @param comment the Comment
     * @return {@link ClientExtensions ClientExtensions}
     * @see ClientComment
     */
    public ClientExtensions setComment(String comment) {
        this.comment = new ClientComment(comment);
        return this;
    }

    /**
     * Get the Comment
     * <p>
     * A comment associated with the Order/Trade
     * <p>
     * @return the Comment
     * @see ClientComment
     */
    public String getComment() {
        return this.comment.getClientComment();
    }
}
