package com.oanda.v20.account;

import java.util.HashMap;

import com.oanda.v20.Context;
import com.oanda.v20.ExecuteException;
import com.oanda.v20.Request;
import com.oanda.v20.RequestException;

public class AccountContext {

    private Context ctx;

    /**
     * Default constructor
     * <p>
     * @param ctx Context object
     * @see Context
     */
    public AccountContext(Context ctx) {
        this.ctx = ctx;
    }

    private HashMap<Integer, Class<?>> listResponseMap;

    /**
     * List Accounts
     * <p>
     * Get a list of all Accounts authorized for the provided token.
     * <p>
     * @return {@link AccountListResponse AccountListResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see RequestException
     * @see ExecuteException
     */
    public AccountListResponse list()
        throws RequestException, ExecuteException
    {
        Request request = new Request();

        if (listResponseMap == null) {
            listResponseMap = new HashMap<>();
            listResponseMap.put(200, AccountListResponse.class);
        }

        return (AccountListResponse) ctx.execute(
            "GET",
            "/v3/accounts",
            request,
            listResponseMap
        );
    }

    private HashMap<Integer, Class<?>> getResponseMap;

    /**
     * Account Details
     * <p>
     * Get the full details for a single Account that a client has access to.
     *     Full pending Order, open Trade and open Position representations are
     *     provided.
     * <p>
     * @param accountID Account Identifier
     * @return {@link AccountGetResponse AccountGetResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see AccountID
     * @see RequestException
     * @see ExecuteException
     */
    public AccountGetResponse get(AccountID accountID)
        throws RequestException, ExecuteException
    {
        Request request = new Request();
        request.setPathParam("accountID", accountID);

        if (getResponseMap == null) {
            getResponseMap = new HashMap<>();
            getResponseMap.put(200, AccountGetResponse.class);
        }

        return (AccountGetResponse) ctx.execute(
            "GET",
            "/v3/accounts/{accountID}",
            request,
            getResponseMap
        );
    }

    private HashMap<Integer, Class<?>> summaryResponseMap;

    /**
     * Account Summary
     * <p>
     * Get a summary for a single Account that a client has access to.
     * <p>
     * @param accountID Account Identifier
     * @return {@link AccountSummaryResponse AccountSummaryResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see AccountID
     * @see RequestException
     * @see ExecuteException
     */
    public AccountSummaryResponse summary(AccountID accountID)
        throws RequestException, ExecuteException
    {
        Request request = new Request();
        request.setPathParam("accountID", accountID);

        if (summaryResponseMap == null) {
            summaryResponseMap = new HashMap<>();
            summaryResponseMap.put(200, AccountSummaryResponse.class);
        }

        return (AccountSummaryResponse) ctx.execute(
            "GET",
            "/v3/accounts/{accountID}/summary",
            request,
            summaryResponseMap
        );
    }

    private HashMap<Integer, Class<?>> instrumentsResponseMap;

    /**
     * Account Instruments
     * <p>
     * Get the list of tradeable instruments for the given Account. The list of
     *     tradeable instruments is dependent on the regulatory division that
     *     the Account is located in, thus should be the same for all Accounts
     *     owned by a single user.
     * <p>
     * @param accountID Account Identifier
     * @return {@link AccountInstrumentsResponse AccountInstrumentsResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see AccountID
     * @see RequestException
     * @see ExecuteException
     */
    public AccountInstrumentsResponse instruments(AccountID accountID)
        throws RequestException, ExecuteException
    {
        AccountInstrumentsRequest request = new AccountInstrumentsRequest(accountID);
        return instruments(request);
    }

    /**
     * Account Instruments
     * <p>
     * Get the list of tradeable instruments for the given Account. The list of
     *     tradeable instruments is dependent on the regulatory division that
     *     the Account is located in, thus should be the same for all Accounts
     *     owned by a single user.
     * <p>
     * @param request the AccountInstrumentsRequest
     * @return {@link AccountInstrumentsResponse AccountInstrumentsResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see RequestException
     * @see ExecuteException
     */
    public AccountInstrumentsResponse instruments(AccountInstrumentsRequest request)
        throws RequestException, ExecuteException
    {
        if (instrumentsResponseMap == null) {
            instrumentsResponseMap = new HashMap<>();
            instrumentsResponseMap.put(200, AccountInstrumentsResponse.class);
        }

        return (AccountInstrumentsResponse) ctx.execute(
            "GET",
            "/v3/accounts/{accountID}/instruments",
            request,
            instrumentsResponseMap
        );
    }

    private HashMap<Integer, Class<?>> configureResponseMap;

    /**
     * Configure Account
     * <p>
     * Set the client-configurable portions of an Account.
     * <p>
     * @param accountID Account Identifier
     * @return {@link AccountConfigureResponse AccountConfigureResponse}
     * @throws AccountConfigure400RequestException if the configuration
     *     specification was invalid.
     * @throws AccountConfigure403RequestException if the configuration
     *     operation was forbidden on the Account.
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see AccountID
     * @see AccountConfigure400RequestException
     * @see AccountConfigure403RequestException
     * @see RequestException
     * @see ExecuteException
     */
    public AccountConfigureResponse configure(AccountID accountID)
        throws AccountConfigure400RequestException,
            AccountConfigure403RequestException, RequestException,
            ExecuteException
    {
        AccountConfigureRequest request = new AccountConfigureRequest(accountID);
        return configure(request);
    }

    /**
     * Configure Account
     * <p>
     * Set the client-configurable portions of an Account.
     * <p>
     * @param request the AccountConfigureRequest
     * @return {@link AccountConfigureResponse AccountConfigureResponse}
     * @throws AccountConfigure400RequestException if the configuration
     *     specification was invalid.
     * @throws AccountConfigure403RequestException if the configuration
     *     operation was forbidden on the Account.
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see AccountConfigure400RequestException
     * @see AccountConfigure403RequestException
     * @see RequestException
     * @see ExecuteException
     */
    public AccountConfigureResponse configure(AccountConfigureRequest request)
        throws AccountConfigure400RequestException,
            AccountConfigure403RequestException, RequestException,
            ExecuteException
    {
        if (configureResponseMap == null) {
            configureResponseMap = new HashMap<>();
            configureResponseMap.put(200, AccountConfigureResponse.class);
            configureResponseMap.put(400, AccountConfigure400RequestException.class);
            configureResponseMap.put(403, AccountConfigure403RequestException.class);
        }

        return (AccountConfigureResponse) ctx.execute(
            "PATCH",
            "/v3/accounts/{accountID}/configuration",
            request,
            configureResponseMap
        );
    }

    private HashMap<Integer, Class<?>> changesResponseMap;

    /**
     * Poll Account Updates
     * <p>
     * Endpoint used to poll an Account for its current state and changes since
     *     a specified TransactionID.
     * <p>
     * @param accountID Account Identifier
     * @return {@link AccountChangesResponse AccountChangesResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see AccountID
     * @see RequestException
     * @see ExecuteException
     */
    public AccountChangesResponse changes(AccountID accountID)
        throws RequestException, ExecuteException
    {
        AccountChangesRequest request = new AccountChangesRequest(accountID);
        return changes(request);
    }

    /**
     * Poll Account Updates
     * <p>
     * Endpoint used to poll an Account for its current state and changes since
     *     a specified TransactionID.
     * <p>
     * @param request the AccountChangesRequest
     * @return {@link AccountChangesResponse AccountChangesResponse}
     * @throws RequestException if the request failed
     * @throws ExecuteException if the request could not be executed
     * @see RequestException
     * @see ExecuteException
     */
    public AccountChangesResponse changes(AccountChangesRequest request)
        throws RequestException, ExecuteException
    {
        if (changesResponseMap == null) {
            changesResponseMap = new HashMap<>();
            changesResponseMap.put(200, AccountChangesResponse.class);
        }

        return (AccountChangesResponse) ctx.execute(
            "GET",
            "/v3/accounts/{accountID}/changes",
            request,
            changesResponseMap
        );
    }
}
