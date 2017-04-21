package com.oanda.v20.position;

import java.util.HashMap;

import com.oanda.v20.Context;
import com.oanda.v20.ExecuteException;
import com.oanda.v20.Request;
import com.oanda.v20.RequestException;
import com.oanda.v20.account.AccountID;
import com.oanda.v20.primitives.InstrumentName;

public class PositionContext {

    private Context ctx;

    /**
     * Default constructor
     * <p>
     * @param ctx Context object
     * @see Context
     */
    public PositionContext(Context ctx) {
        this.ctx = ctx;
    }

    private HashMap<Integer, Class<?>> listResponseMap;

    /**
     * List Positions
     * <p>
     * List all Positions for an Account. The Positions returned are for every
     *     instrument that has had a position during the lifetime of an the
     *     Account.
     * <p>
     * @param accountID Account Identifier
     * @return {@link PositionListResponse PositionListResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see AccountID
     * @see RequestException
     * @see ExecuteException
     */
    public PositionListResponse list(AccountID accountID)
        throws RequestException, ExecuteException
    {
        Request request = new Request();
        request.setPathParam("accountID", accountID);

        if (listResponseMap == null) {
            listResponseMap = new HashMap<>();
            listResponseMap.put(200, PositionListResponse.class);
        }

        return (PositionListResponse) ctx.execute(
            "GET",
            "/v3/accounts/{accountID}/positions",
            request,
            listResponseMap
        );
    }

    private HashMap<Integer, Class<?>> listOpenResponseMap;

    /**
     * Open Positions
     * <p>
     * List all open Positions for an Account. An open Position is a Position
     *     in an Account that currently has a Trade opened for it.
     * <p>
     * @param accountID Account Identifier
     * @return {@link PositionListOpenResponse PositionListOpenResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see AccountID
     * @see RequestException
     * @see ExecuteException
     */
    public PositionListOpenResponse listOpen(AccountID accountID)
        throws RequestException, ExecuteException
    {
        Request request = new Request();
        request.setPathParam("accountID", accountID);

        if (listOpenResponseMap == null) {
            listOpenResponseMap = new HashMap<>();
            listOpenResponseMap.put(200, PositionListOpenResponse.class);
        }

        return (PositionListOpenResponse) ctx.execute(
            "GET",
            "/v3/accounts/{accountID}/openPositions",
            request,
            listOpenResponseMap
        );
    }

    private HashMap<Integer, Class<?>> getResponseMap;

    /**
     * Instrument Position
     * <p>
     * Get the details of a single Instrument's Position in an Account. The
     *     Position may by open or not.
     * <p>
     * @param accountID Account Identifier
     * @param instrument Name of the Instrument
     * @return {@link PositionGetResponse PositionGetResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see AccountID
     * @see InstrumentName
     * @see RequestException
     * @see ExecuteException
     */
    public PositionGetResponse get(AccountID accountID, InstrumentName instrument)
        throws RequestException, ExecuteException
    {
        Request request = new Request();
        request.setPathParam("accountID", accountID);
        request.setPathParam("instrument", instrument);

        if (getResponseMap == null) {
            getResponseMap = new HashMap<>();
            getResponseMap.put(200, PositionGetResponse.class);
        }

        return (PositionGetResponse) ctx.execute(
            "GET",
            "/v3/accounts/{accountID}/positions/{instrument}",
            request,
            getResponseMap
        );
    }

    private HashMap<Integer, Class<?>> closeResponseMap;


    /**
     * Close Position
     * <p>
     * Closeout the open Position for a specific instrument in an Account.
     * <p>
     * @param request the PositionCloseRequest
     * @return {@link PositionCloseResponse PositionCloseResponse}
     * @throws PositionClose400RequestException if the Parameters provided that
     *     describe the Position closeout are invalid.
     * @throws PositionClose404RequestException if the Account or one or more
     *     of the Positions specified does not exist.
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see PositionClose400RequestException
     * @see PositionClose404RequestException
     * @see RequestException
     * @see ExecuteException
     */
    public PositionCloseResponse close(PositionCloseRequest request)
        throws PositionClose400RequestException,
            PositionClose404RequestException, RequestException,
            ExecuteException
    {
        if (closeResponseMap == null) {
            closeResponseMap = new HashMap<>();
            closeResponseMap.put(200, PositionCloseResponse.class);
            closeResponseMap.put(400, PositionClose400RequestException.class);
            closeResponseMap.put(404, PositionClose404RequestException.class);
        }

        return (PositionCloseResponse) ctx.execute(
            "PUT",
            "/v3/accounts/{accountID}/positions/{instrument}/close",
            request,
            closeResponseMap
        );
    }
}
