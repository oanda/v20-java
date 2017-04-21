package com.oanda.v20.position;

import com.google.gson.annotations.SerializedName;

import com.oanda.v20.Request;
import com.oanda.v20.account.AccountID;
import com.oanda.v20.primitives.InstrumentName;
import com.oanda.v20.transaction.ClientExtensions;

/**
 * PositionCloseRequest
 */
public class PositionCloseRequest extends Request {

    private static class Body {
        @SerializedName("longUnits") private String longUnits;
        @SerializedName("longClientExtensions") private ClientExtensions longClientExtensions;
        @SerializedName("shortUnits") private String shortUnits;
        @SerializedName("shortClientExtensions") private ClientExtensions shortClientExtensions;
    }

    /**
     * PositionCloseRequest Constructor
     * <p>
     * Construct a new PositionCloseRequest
     * <p>
     * @param accountID Account Identifier
     * @param instrument Name of the Instrument
     */
    public PositionCloseRequest(AccountID accountID, InstrumentName instrument) {
        this.body = new Body();
        this.setPathParam("accountID", accountID);
        this.setPathParam("instrument", instrument);

    }

    /**
     * Set the longUnits
     * <p>
     * Indication of how much of the long Position to closeout. Either the
     * string "ALL", the string "NONE", or a DecimalNumber representing how
     * many units of the long position to close using a PositionCloseout
     * MarketOrder. The units specified must always be positive.
     * <p>
     * @param longUnits the longUnits as a String
     * @return {@link PositionCloseRequest PositionCloseRequest}
     */
    public PositionCloseRequest setLongUnits(String longUnits)
    {
        ((Body) this.body).longUnits = longUnits;
        return this;
    }

    /**
     * Set the longClientExtensions
     * <p>
     * The client extensions to add to the MarketOrder used to close the long
     * position.
     * <p>
     * @param longClientExtensions the longClientExtensions as a
     * ClientExtensions
     * @return {@link PositionCloseRequest PositionCloseRequest}
     * @see ClientExtensions
     */
    public PositionCloseRequest setLongClientExtensions(ClientExtensions longClientExtensions)
    {
        ((Body) this.body).longClientExtensions = longClientExtensions;
        return this;
    }

    /**
     * Set the shortUnits
     * <p>
     * Indication of how much of the short Position to closeout. Either the
     * string "ALL", the string "NONE", or a DecimalNumber representing how
     * many units of the short position to close using a PositionCloseout
     * MarketOrder. The units specified must always be positive.
     * <p>
     * @param shortUnits the shortUnits as a String
     * @return {@link PositionCloseRequest PositionCloseRequest}
     */
    public PositionCloseRequest setShortUnits(String shortUnits)
    {
        ((Body) this.body).shortUnits = shortUnits;
        return this;
    }

    /**
     * Set the shortClientExtensions
     * <p>
     * The client extensions to add to the MarketOrder used to close the short
     * position.
     * <p>
     * @param shortClientExtensions the shortClientExtensions as a
     * ClientExtensions
     * @return {@link PositionCloseRequest PositionCloseRequest}
     * @see ClientExtensions
     */
    public PositionCloseRequest setShortClientExtensions(ClientExtensions shortClientExtensions)
    {
        ((Body) this.body).shortClientExtensions = shortClientExtensions;
        return this;
    }
}
