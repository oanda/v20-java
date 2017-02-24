package com.oanda.v20;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

public class Context {
    public AccountContext account;
    public UserContext user;
    public PositionContext position;
    public OrderContext order;
    public TransactionContext transaction;
    public TradeContext trade;
    public PricingContext pricing;
    public InstrumentContext instrument;

    private Gson gson;
    CloseableHttpClient httpclient = HttpClients.createDefault();
    private String uri;
    private String token;

    public Context(String uri, String token) {
        this.uri = uri;
        this.token = token;
        gson = new GsonBuilder()
            .setPrettyPrinting()
            .registerTypeAdapter(Order.class, new OrderAdapter())
            .registerTypeAdapter(Transaction.class, new TransactionAdapter())
            .create();

        account = new AccountContext();
        user = new UserContext();
        position = new PositionContext();
        order = new OrderContext();
        transaction = new TransactionContext();
        trade = new TradeContext();
        pricing = new PricingContext();
        instrument = new InstrumentContext();
    }

    public class AccountContext {
        /**
         * List Accounts
         * <p>
         * Get a list of all Accounts authorized for the provided token.
         * <p>
         * @return {@link ListRequest ListRequest}
         */
        public ListRequest list()
        {
            ListRequest request = new ListRequest();
            return request;
        }

        /**
         * The list of authorized Accounts has been provided.
         */
        public class ListResponse {

            @SerializedName("accounts") private AccountProperties[] accounts;

            /**
             * Get the accounts
             * <p>
             * The list of Accounts the client is authorized to access and
             * their associated properties.
             * <p>
             * @return the accounts
             * @see AccountProperties
             */
            public AccountProperties[] getAccounts() {
                return this.accounts;
            }
        }

        public class ListRequest extends Request {
            private ListRequest() {
                super("GET",
                    "/v3/accounts");
            }
            public ListResponse execute() throws ClientProtocolException,
                    IOException,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, ListResponse.class);
            }

        }
        /**
         * Account Details
         * <p>
         * Get the full details for a single Account that a client has access
         * to. Full pending Order, open Trade and open Position representations
         * are provided.
         * <p>
         * @param accountID Account Identifier
         * @return {@link GetRequest GetRequest}
         * @see AccountID
         */
        public GetRequest get(String accountID)
        {
            GetRequest request = new GetRequest();
            request.set_path_param("accountID", accountID);
            return request;
        }

        /**
         * The full Account details are provided
         */
        public class GetResponse {

            @SerializedName("account") private Account account;

            /**
             * Get the account
             * <p>
             * The full details of the requested Account.
             * <p>
             * @return the account
             * @see Account
             */
            public Account getAccount() {
                return this.account;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account.
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
        }

        public class GetRequest extends Request {
            private GetRequest() {
                super("GET",
                    "/v3/accounts/{accountID}");
            }
            public GetResponse execute() throws ClientProtocolException,
                    IOException,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, GetResponse.class);
            }

        }
        /**
         * Account Summary
         * <p>
         * Get a summary for a single Account that a client has access to.
         * <p>
         * @param accountID Account Identifier
         * @return {@link SummaryRequest SummaryRequest}
         * @see AccountID
         */
        public SummaryRequest summary(String accountID)
        {
            SummaryRequest request = new SummaryRequest();
            request.set_path_param("accountID", accountID);
            return request;
        }

        /**
         * The Account summary  are provided
         */
        public class SummaryResponse {

            @SerializedName("account") private AccountSummary account;

            /**
             * Get the account
             * <p>
             * The summary of the requested Account.
             * <p>
             * @return the account
             * @see AccountSummary
             */
            public AccountSummary getAccount() {
                return this.account;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account.
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
        }

        public class SummaryRequest extends Request {
            private SummaryRequest() {
                super("GET",
                    "/v3/accounts/{accountID}/summary");
            }
            public SummaryResponse execute() throws ClientProtocolException,
                    IOException,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, SummaryResponse.class);
            }

        }
        /**
         * Account Instruments
         * <p>
         * Get the list of tradeable instruments for the given Account. The
         * list of tradeable instruments is dependent on the regulatory
         * division that the Account is located in, thus should be the same for
         * all Accounts owned by a single user.
         * <p>
         * @param accountID Account Identifier
         * @return {@link InstrumentsRequest InstrumentsRequest}
         * @see AccountID
         */
        public InstrumentsRequest instruments(String accountID)
        {
            InstrumentsRequest request = new InstrumentsRequest();
            request.set_path_param("accountID", accountID);
            return request;
        }

        /**
         * The list of tradeable instruments for the Account has been provided.
         */
        public class InstrumentsResponse {

            @SerializedName("instruments") private Instrument[] instruments;

            /**
             * Get the instruments
             * <p>
             * The requested list of instruments.
             * <p>
             * @return the instruments
             * @see Instrument
             */
            public Instrument[] getInstruments() {
                return this.instruments;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account.
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
        }

        public class InstrumentsRequest extends Request {
            private InstrumentsRequest() {
                super("GET",
                    "/v3/accounts/{accountID}/instruments");
            }
            public InstrumentsResponse execute() throws ClientProtocolException,
                    IOException,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                if (this.instruments != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "instruments=";
                    boolean first = true;
                    for (String itr : this.instruments) {
                        if (first) {
                            first = false;
                        } else {
                            queryparamstr += ",";
                        }
                        queryparamstr += itr;
                    }
                }
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, InstrumentsResponse.class);
            }

            // Query Parameters

            private String[] instruments = null;

            /**
             * Set the instruments
             * <p>
             * List of instruments to query specifically.
             * <p>
             * @param instruments the instruments
             * @return {@link InstrumentsRequest InstrumentsRequest}
             * @see InstrumentName
             */
            public InstrumentsRequest instruments(String[] instruments)
            {
                this.instruments = instruments;
                return this;
            }

        }
        /**
         * Configure Account
         * <p>
         * Set the client-configurable portions of an Account.
         * <p>
         * @param accountID Account Identifier
         * @return {@link ConfigureRequest ConfigureRequest}
         * @see AccountID
         */
        public ConfigureRequest configure(String accountID)
        {
            ConfigureRequest request = new ConfigureRequest();
            request.set_path_param("accountID", accountID);
            return request;
        }

        private class ConfigureRequestBody {
            @SuppressWarnings("unused")
            @SerializedName("alias") private String alias;
            @SuppressWarnings("unused")
            @SerializedName("marginRate") private DecimalNumber marginRate;
        }

        /**
         * The configuration operation was forbidden on the Account.
         */
        @SuppressWarnings("serial")
        public class ConfigureRequestException403 extends RequestException {

            @SerializedName("clientConfigureRejectTransaction") private ClientConfigureRejectTransaction clientConfigureRejectTransaction;

            /**
             * Get the clientConfigureRejectTransaction
             * <p>
             * The transaction that rejects the configuration of the Account.
             * <p>
             * @return the clientConfigureRejectTransaction
             * @see ClientConfigureRejectTransaction
             */
            public ClientConfigureRejectTransaction getClientConfigureRejectTransaction() {
                return this.clientConfigureRejectTransaction;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the last Transaction created for the Account.
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }

        /**
         * The configuration specification was invalid.
         */
        @SuppressWarnings("serial")
        public class ConfigureRequestException400 extends RequestException {

            @SerializedName("clientConfigureRejectTransaction") private ClientConfigureRejectTransaction clientConfigureRejectTransaction;

            /**
             * Get the clientConfigureRejectTransaction
             * <p>
             * The transaction that rejects the configuration of the Account.
             * <p>
             * @return the clientConfigureRejectTransaction
             * @see ClientConfigureRejectTransaction
             */
            public ClientConfigureRejectTransaction getClientConfigureRejectTransaction() {
                return this.clientConfigureRejectTransaction;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the last Transaction created for the Account.
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }

        /**
         * The Account was configured successfully.
         */
        public class ConfigureResponse {

            @SerializedName("clientConfigureTransaction") private ClientConfigureTransaction clientConfigureTransaction;

            /**
             * Get the clientConfigureTransaction
             * <p>
             * The transaction that configures the Account.
             * <p>
             * @return the clientConfigureTransaction
             * @see ClientConfigureTransaction
             */
            public ClientConfigureTransaction getClientConfigureTransaction() {
                return this.clientConfigureTransaction;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the last Transaction created for the Account.
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
        }

        public class ConfigureRequest extends Request {
            private ConfigureRequest() {
                super("PATCH",
                    "/v3/accounts/{accountID}/configuration");
            }
            public ConfigureResponse execute() throws ClientProtocolException,
                    IOException,
                    ConfigureRequestException403,
                    ConfigureRequestException400,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                String bodystr = "";
                bodystr = gson.toJson(body);
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpPatch httpreq = new HttpPatch(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                httpreq.setEntity(new ByteArrayEntity(bodystr.getBytes("UTF-8")));
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else if (status == 403) {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0)
                        {
                            e = gson.fromJson(responsebody, ConfigureRequestException403.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    } else if (status == 400) {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0)
                        {
                            e = gson.fromJson(responsebody, ConfigureRequestException400.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, ConfigureResponse.class);
            }

            // Body Parameters
            private ConfigureRequestBody body = new ConfigureRequestBody();

            /**
             * Set the alias
             * <p>
             * Client-defined alias (name) for the Account
             * <p>
             * @param alias the alias
             * @return {@link ConfigureRequest ConfigureRequest}
             */
            public ConfigureRequest alias(String alias)
            {
                body.alias = new String(alias);
                return this;
            }

            /**
             * Set the marginRate
             * <p>
             * The string representation of a decimal number.
             * <p>
             * @param marginRate the marginRate
             * @return {@link ConfigureRequest ConfigureRequest}
             * @see DecimalNumber
             */
            public ConfigureRequest marginRate(double marginRate)
            {
                body.marginRate = new DecimalNumber(marginRate);
                return this;
            }
        }
        /**
         * Poll Account Updates
         * <p>
         * Endpoint used to poll an Account for its current state and changes
         * since a specified TransactionID.
         * <p>
         * @param accountID Account Identifier
         * @return {@link ChangesRequest ChangesRequest}
         * @see AccountID
         */
        public ChangesRequest changes(String accountID)
        {
            ChangesRequest request = new ChangesRequest();
            request.set_path_param("accountID", accountID);
            return request;
        }

        /**
         * The Account state and changes are provided.
         */
        public class ChangesResponse {

            @SerializedName("changes") private AccountChanges changes;

            /**
             * Get the changes
             * <p>
             * The changes to the Account's Orders, Trades and Positions since
             * the specified Transaction ID. Only provided if the
             * sinceTransactionID is supplied to the poll request.
             * <p>
             * @return the changes
             * @see AccountChanges
             */
            public AccountChanges getChanges() {
                return this.changes;
            }

            @SerializedName("state") private AccountChangesState state;

            /**
             * Get the state
             * <p>
             * The Account's current price-dependent state.
             * <p>
             * @return the state
             * @see AccountChangesState
             */
            public AccountChangesState getState() {
                return this.state;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the last Transaction created for the Account.  This
             * Transaction ID should be used for future poll requests, as the
             * client has already observed all changes up to and including it.
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
        }

        public class ChangesRequest extends Request {
            private ChangesRequest() {
                super("GET",
                    "/v3/accounts/{accountID}/changes");
            }
            public ChangesResponse execute() throws ClientProtocolException,
                    IOException,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                if (this.sinceTransactionID != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "sinceTransactionID=";
                    queryparamstr += this.sinceTransactionID;
                }
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, ChangesResponse.class);
            }

            // Query Parameters

            private String sinceTransactionID = null;

            /**
             * Set the sinceTransactionID
             * <p>
             * ID of the Transaction to get Account changes since.
             * <p>
             * @param sinceTransactionID the sinceTransactionID
             * @return {@link ChangesRequest ChangesRequest}
             * @see TransactionID
             */
            public ChangesRequest sinceTransactionID(String sinceTransactionID)
            {
                this.sinceTransactionID = sinceTransactionID;
                return this;
            }

        }
    }

    public class UserContext {
        /**
         * User Info
         * <p>
         * Fetch the user information for the specified user. This endpoint is
         * intended to be used by the user themself to obtain their own
         * information.
         * <p>
         * @param userSpecifier The User Specifier
         * @return {@link GetinfoRequest GetinfoRequest}
         * @see UserSpecifier
         */
        public GetinfoRequest getInfo(String userSpecifier)
        {
            GetinfoRequest request = new GetinfoRequest();
            request.set_path_param("userSpecifier", userSpecifier);
            return request;
        }

        /**
         * The user information has been provided
         */
        public class GetinfoResponse {

            @SerializedName("userInfo") private UserInfo userInfo;

            /**
             * Get the userInfo
             * <p>
             * The user information for the specifier user.
             * <p>
             * @return the userInfo
             * @see UserInfo
             */
            public UserInfo getUserInfo() {
                return this.userInfo;
            }
        }

        public class GetinfoRequest extends Request {
            private GetinfoRequest() {
                super("GET",
                    "/v3/users/{userSpecifier}");
            }
            public GetinfoResponse execute() throws ClientProtocolException,
                    IOException,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, GetinfoResponse.class);
            }

        }
        /**
         * External User Info
         * <p>
         * Fetch the externally-available user information for the specified
         * user. This endpoint is intended to be used by 3rd parties that have
         * been authorized by a user to view their personal information.
         * <p>
         * @param userSpecifier The User Specifier
         * @return {@link GetexternalinfoRequest GetexternalinfoRequest}
         * @see UserSpecifier
         */
        public GetexternalinfoRequest getExternalInfo(String userSpecifier)
        {
            GetexternalinfoRequest request = new GetexternalinfoRequest();
            request.set_path_param("userSpecifier", userSpecifier);
            return request;
        }

        /**
         * The external user information has been provided
         */
        public class GetexternalinfoResponse {

            @SerializedName("userInfo") private UserInfoExternal userInfo;

            /**
             * Get the userInfo
             * <p>
             * The user information for the specifier user.
             * <p>
             * @return the userInfo
             * @see UserInfoExternal
             */
            public UserInfoExternal getUserInfo() {
                return this.userInfo;
            }
        }

        public class GetexternalinfoRequest extends Request {
            private GetexternalinfoRequest() {
                super("GET",
                    "/v3/users/{userSpecifier}/externalInfo");
            }
            public GetexternalinfoResponse execute() throws ClientProtocolException,
                    IOException,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, GetexternalinfoResponse.class);
            }

        }
    }

    public class PositionContext {
        /**
         * List Positions
         * <p>
         * List all Positions for an Account. The Positions returned are for
         * every instrument that has had a position during the lifetime of an
         * the Account.
         * <p>
         * @param accountID Account Identifier
         * @return {@link ListRequest ListRequest}
         * @see AccountID
         */
        public ListRequest list(String accountID)
        {
            ListRequest request = new ListRequest();
            request.set_path_param("accountID", accountID);
            return request;
        }

        /**
         * The Account's Positions are provided.
         */
        public class ListResponse {

            @SerializedName("positions") private Position[] positions;

            /**
             * Get the positions
             * <p>
             * The list of Account Positions.
             * <p>
             * @return the positions
             * @see Position
             */
            public Position[] getPositions() {
                return this.positions;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
        }

        public class ListRequest extends Request {
            private ListRequest() {
                super("GET",
                    "/v3/accounts/{accountID}/positions");
            }
            public ListResponse execute() throws ClientProtocolException,
                    IOException,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, ListResponse.class);
            }

        }
        /**
         * Open Positions
         * <p>
         * List all open Positions for an Account. An open Position is a
         * Position in an Account that currently has a Trade opened for it.
         * <p>
         * @param accountID Account Identifier
         * @return {@link ListopenRequest ListopenRequest}
         * @see AccountID
         */
        public ListopenRequest listOpen(String accountID)
        {
            ListopenRequest request = new ListopenRequest();
            request.set_path_param("accountID", accountID);
            return request;
        }

        /**
         * The Account's open Positions are provided.
         */
        public class ListopenResponse {

            @SerializedName("positions") private Position[] positions;

            /**
             * Get the positions
             * <p>
             * The list of open Positions in the Account.
             * <p>
             * @return the positions
             * @see Position
             */
            public Position[] getPositions() {
                return this.positions;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
        }

        public class ListopenRequest extends Request {
            private ListopenRequest() {
                super("GET",
                    "/v3/accounts/{accountID}/openPositions");
            }
            public ListopenResponse execute() throws ClientProtocolException,
                    IOException,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, ListopenResponse.class);
            }

        }
        /**
         * Instrument Position
         * <p>
         * Get the details of a single Instrument's Position in an Account. The
         * Position may by open or not.
         * <p>
         * @param accountID Account Identifier
         * @param instrument Name of the Instrument
         * @return {@link GetRequest GetRequest}
         * @see AccountID
         * @see InstrumentName
         */
        public GetRequest get(String accountID, String instrument)
        {
            GetRequest request = new GetRequest();
            request.set_path_param("accountID", accountID);
            request.set_path_param("instrument", instrument);
            return request;
        }

        /**
         * The Position is provided.
         */
        public class GetResponse {

            @SerializedName("position") private Position position;

            /**
             * Get the position
             * <p>
             * The requested Position.
             * <p>
             * @return the position
             * @see Position
             */
            public Position getPosition() {
                return this.position;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
        }

        public class GetRequest extends Request {
            private GetRequest() {
                super("GET",
                    "/v3/accounts/{accountID}/positions/{instrument}");
            }
            public GetResponse execute() throws ClientProtocolException,
                    IOException,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, GetResponse.class);
            }

        }
        /**
         * Close Position
         * <p>
         * Closeout the open Position for a specific instrument in an Account.
         * <p>
         * @param accountID Account Identifier
         * @param instrument Name of the Instrument
         * @return {@link CloseRequest CloseRequest}
         * @see AccountID
         * @see InstrumentName
         */
        public CloseRequest close(String accountID, String instrument)
        {
            CloseRequest request = new CloseRequest();
            request.set_path_param("accountID", accountID);
            request.set_path_param("instrument", instrument);
            return request;
        }

        private class CloseRequestBody {
            @SuppressWarnings("unused")
            @SerializedName("longUnits") private String longUnits;
            @SuppressWarnings("unused")
            @SerializedName("longClientExtensions") private ClientExtensions longClientExtensions;
            @SuppressWarnings("unused")
            @SerializedName("shortUnits") private String shortUnits;
            @SuppressWarnings("unused")
            @SerializedName("shortClientExtensions") private ClientExtensions shortClientExtensions;
        }

        /**
         * The Account or one or more of the Positions specified does not
         * exist.
         */
        @SuppressWarnings("serial")
        public class CloseRequestException404 extends RequestException {

            @SerializedName("longOrderRejectTransaction") private MarketOrderRejectTransaction longOrderRejectTransaction;

            /**
             * Get the longOrderRejectTransaction
             * <p>
             * The Transaction created that rejects the creation of a
             * MarketOrder to close the long Position. Only present if the
             * Account exists and a long Position was specified.
             * <p>
             * @return the longOrderRejectTransaction
             * @see MarketOrderRejectTransaction
             */
            public MarketOrderRejectTransaction getLongOrderRejectTransaction() {
                return this.longOrderRejectTransaction;
            }

            @SerializedName("shortOrderRejectTransaction") private MarketOrderRejectTransaction shortOrderRejectTransaction;

            /**
             * Get the shortOrderRejectTransaction
             * <p>
             * The Transaction created that rejects the creation of a
             * MarketOrder to close the short Position. Only present if the
             * Account exists and a short Position was specified.
             * <p>
             * @return the shortOrderRejectTransaction
             * @see MarketOrderRejectTransaction
             */
            public MarketOrderRejectTransaction getShortOrderRejectTransaction() {
                return this.shortOrderRejectTransaction;
            }

            @SerializedName("relatedTransactionIDs") private TransactionID[] relatedTransactionIDs;

            /**
             * Get the relatedTransactionIDs
             * <p>
             * The IDs of all Transactions that were created while satisfying
             * the request. Only present if the Account exists.
             * <p>
             * @return the relatedTransactionIDs
             * @see TransactionID
             */
            public TransactionID[] getRelatedTransactionIDs() {
                return this.relatedTransactionIDs;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account.
             * Only present if the Account exists.
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }

        /**
         * The Parameters provided that describe the Position closeout are
         * invalid.
         */
        @SuppressWarnings("serial")
        public class CloseRequestException400 extends RequestException {

            @SerializedName("longOrderRejectTransaction") private MarketOrderRejectTransaction longOrderRejectTransaction;

            /**
             * Get the longOrderRejectTransaction
             * <p>
             * The Transaction created that rejects the creation of a
             * MarketOrder to close the long Position.
             * <p>
             * @return the longOrderRejectTransaction
             * @see MarketOrderRejectTransaction
             */
            public MarketOrderRejectTransaction getLongOrderRejectTransaction() {
                return this.longOrderRejectTransaction;
            }

            @SerializedName("shortOrderRejectTransaction") private MarketOrderRejectTransaction shortOrderRejectTransaction;

            /**
             * Get the shortOrderRejectTransaction
             * <p>
             * The Transaction created that rejects the creation of a
             * MarketOrder to close the short Position.
             * <p>
             * @return the shortOrderRejectTransaction
             * @see MarketOrderRejectTransaction
             */
            public MarketOrderRejectTransaction getShortOrderRejectTransaction() {
                return this.shortOrderRejectTransaction;
            }

            @SerializedName("relatedTransactionIDs") private TransactionID[] relatedTransactionIDs;

            /**
             * Get the relatedTransactionIDs
             * <p>
             * The IDs of all Transactions that were created while satisfying
             * the request.
             * <p>
             * @return the relatedTransactionIDs
             * @see TransactionID
             */
            public TransactionID[] getRelatedTransactionIDs() {
                return this.relatedTransactionIDs;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }

        /**
         * The Position closeout request has been successfully processed.
         */
        public class CloseResponse {

            @SerializedName("longOrderCreateTransaction") private MarketOrderTransaction longOrderCreateTransaction;

            /**
             * Get the longOrderCreateTransaction
             * <p>
             * The MarketOrderTransaction created to close the long Position.
             * <p>
             * @return the longOrderCreateTransaction
             * @see MarketOrderTransaction
             */
            public MarketOrderTransaction getLongOrderCreateTransaction() {
                return this.longOrderCreateTransaction;
            }

            @SerializedName("longOrderFillTransaction") private OrderFillTransaction longOrderFillTransaction;

            /**
             * Get the longOrderFillTransaction
             * <p>
             * OrderFill Transaction that closes the long Position
             * <p>
             * @return the longOrderFillTransaction
             * @see OrderFillTransaction
             */
            public OrderFillTransaction getLongOrderFillTransaction() {
                return this.longOrderFillTransaction;
            }

            @SerializedName("longOrderCancelTransaction") private OrderCancelTransaction longOrderCancelTransaction;

            /**
             * Get the longOrderCancelTransaction
             * <p>
             * OrderCancel Transaction that cancels the MarketOrder created to
             * close the long Position
             * <p>
             * @return the longOrderCancelTransaction
             * @see OrderCancelTransaction
             */
            public OrderCancelTransaction getLongOrderCancelTransaction() {
                return this.longOrderCancelTransaction;
            }

            @SerializedName("shortOrderCreateTransaction") private MarketOrderTransaction shortOrderCreateTransaction;

            /**
             * Get the shortOrderCreateTransaction
             * <p>
             * The MarketOrderTransaction created to close the short Position.
             * <p>
             * @return the shortOrderCreateTransaction
             * @see MarketOrderTransaction
             */
            public MarketOrderTransaction getShortOrderCreateTransaction() {
                return this.shortOrderCreateTransaction;
            }

            @SerializedName("shortOrderFillTransaction") private OrderFillTransaction shortOrderFillTransaction;

            /**
             * Get the shortOrderFillTransaction
             * <p>
             * OrderFill Transaction that closes the short Position
             * <p>
             * @return the shortOrderFillTransaction
             * @see OrderFillTransaction
             */
            public OrderFillTransaction getShortOrderFillTransaction() {
                return this.shortOrderFillTransaction;
            }

            @SerializedName("shortOrderCancelTransaction") private OrderCancelTransaction shortOrderCancelTransaction;

            /**
             * Get the shortOrderCancelTransaction
             * <p>
             * OrderCancel Transaction that cancels the MarketOrder created to
             * close the short Position
             * <p>
             * @return the shortOrderCancelTransaction
             * @see OrderCancelTransaction
             */
            public OrderCancelTransaction getShortOrderCancelTransaction() {
                return this.shortOrderCancelTransaction;
            }

            @SerializedName("relatedTransactionIDs") private TransactionID[] relatedTransactionIDs;

            /**
             * Get the relatedTransactionIDs
             * <p>
             * The IDs of all Transactions that were created while satisfying
             * the request.
             * <p>
             * @return the relatedTransactionIDs
             * @see TransactionID
             */
            public TransactionID[] getRelatedTransactionIDs() {
                return this.relatedTransactionIDs;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
        }

        public class CloseRequest extends Request {
            private CloseRequest() {
                super("PUT",
                    "/v3/accounts/{accountID}/positions/{instrument}/close");
            }
            public CloseResponse execute() throws ClientProtocolException,
                    IOException,
                    CloseRequestException404,
                    CloseRequestException400,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                String bodystr = "";
                bodystr = gson.toJson(body);
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpPut httpreq = new HttpPut(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                httpreq.setEntity(new ByteArrayEntity(bodystr.getBytes("UTF-8")));
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else if (status == 404) {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0)
                        {
                            e = gson.fromJson(responsebody, CloseRequestException404.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    } else if (status == 400) {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0)
                        {
                            e = gson.fromJson(responsebody, CloseRequestException400.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, CloseResponse.class);
            }

            // Body Parameters
            private CloseRequestBody body = new CloseRequestBody();

            /**
             * Set the longUnits
             * <p>
             * Indication of how much of the long Position to closeout. Either
             * the string "ALL", the string "NONE", or a DecimalNumber
             * representing how many units of the long position to close using
             * a PositionCloseout MarketOrder. The units specified must always
             * be positive.
             * <p>
             * @param longUnits the longUnits
             * @return {@link CloseRequest CloseRequest}
             */
            public CloseRequest longUnits(String longUnits)
            {
                body.longUnits = new String(longUnits);
                return this;
            }

            /**
             * Set the longClientExtensions
             * <p>
             * The client extensions to add to the MarketOrder used to close
             * the long position.
             * <p>
             * @param longClientExtensions the longClientExtensions
             * @return {@link CloseRequest CloseRequest}
             * @see ClientExtensions
             */
            public CloseRequest longClientExtensions(ClientExtensions longClientExtensions)
            {
                body.longClientExtensions = longClientExtensions;
                return this;
            }

            /**
             * Set the shortUnits
             * <p>
             * Indication of how much of the short Position to closeout. Either
             * the string "ALL", the string "NONE", or a DecimalNumber
             * representing how many units of the short position to close using
             * a PositionCloseout MarketOrder. The units specified must always
             * be positive.
             * <p>
             * @param shortUnits the shortUnits
             * @return {@link CloseRequest CloseRequest}
             */
            public CloseRequest shortUnits(String shortUnits)
            {
                body.shortUnits = new String(shortUnits);
                return this;
            }

            /**
             * Set the shortClientExtensions
             * <p>
             * The client extensions to add to the MarketOrder used to close
             * the short position.
             * <p>
             * @param shortClientExtensions the shortClientExtensions
             * @return {@link CloseRequest CloseRequest}
             * @see ClientExtensions
             */
            public CloseRequest shortClientExtensions(ClientExtensions shortClientExtensions)
            {
                body.shortClientExtensions = shortClientExtensions;
                return this;
            }
        }
    }

    public class OrderContext {
        /**
         * Create Order
         * <p>
         * Create an Order for an Account
         * <p>
         * @param accountID Account Identifier
         * @return {@link CreateRequest CreateRequest}
         * @see AccountID
         */
        public CreateRequest create(String accountID)
        {
            CreateRequest request = new CreateRequest();
            request.set_path_param("accountID", accountID);
            return request;
        }

        private class CreateRequestBody {
            @SuppressWarnings("unused")
            @SerializedName("order") private OrderRequest order;
        }

        /**
         * The Order or Account specified does not exist.
         */
        @SuppressWarnings("serial")
        public class CreateRequestException404 extends RequestException {

            @SerializedName("orderRejectTransaction") private Transaction orderRejectTransaction;

            /**
             * Get the orderRejectTransaction
             * <p>
             * The Transaction that rejected the creation of the Order as
             * requested. Only present if the Account exists.
             * <p>
             * @return the orderRejectTransaction
             * @see Transaction
             */
            public Transaction getOrderRejectTransaction() {
                return this.orderRejectTransaction;
            }

            @SerializedName("relatedTransactionIDs") private TransactionID[] relatedTransactionIDs;

            /**
             * Get the relatedTransactionIDs
             * <p>
             * The IDs of all Transactions that were created while satisfying
             * the request. Only present if the Account exists.
             * <p>
             * @return the relatedTransactionIDs
             * @see TransactionID
             */
            public TransactionID[] getRelatedTransactionIDs() {
                return this.relatedTransactionIDs;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account.
             * Only present if the Account exists.
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }

        /**
         * The Order specification was invalid
         */
        @SuppressWarnings("serial")
        public class CreateRequestException400 extends RequestException {

            @SerializedName("orderRejectTransaction") private Transaction orderRejectTransaction;

            /**
             * Get the orderRejectTransaction
             * <p>
             * The Transaction that rejected the creation of the Order as
             * requested
             * <p>
             * @return the orderRejectTransaction
             * @see Transaction
             */
            public Transaction getOrderRejectTransaction() {
                return this.orderRejectTransaction;
            }

            @SerializedName("relatedTransactionIDs") private TransactionID[] relatedTransactionIDs;

            /**
             * Get the relatedTransactionIDs
             * <p>
             * The IDs of all Transactions that were created while satisfying
             * the request.
             * <p>
             * @return the relatedTransactionIDs
             * @see TransactionID
             */
            public TransactionID[] getRelatedTransactionIDs() {
                return this.relatedTransactionIDs;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }

        /**
         * The Order was created as specified
         */
        public class CreateResponse {

            @SerializedName("orderCreateTransaction") private Transaction orderCreateTransaction;

            /**
             * Get the orderCreateTransaction
             * <p>
             * The Transaction that created the Order specified by the request.
             * <p>
             * @return the orderCreateTransaction
             * @see Transaction
             */
            public Transaction getOrderCreateTransaction() {
                return this.orderCreateTransaction;
            }

            @SerializedName("orderFillTransaction") private OrderFillTransaction orderFillTransaction;

            /**
             * Get the orderFillTransaction
             * <p>
             * The Transaction that filled the newly created Order. Only
             * provided when the Order was immediately filled.
             * <p>
             * @return the orderFillTransaction
             * @see OrderFillTransaction
             */
            public OrderFillTransaction getOrderFillTransaction() {
                return this.orderFillTransaction;
            }

            @SerializedName("orderCancelTransaction") private OrderCancelTransaction orderCancelTransaction;

            /**
             * Get the orderCancelTransaction
             * <p>
             * The Transaction that cancelled the newly created Order. Only
             * provided when the Order was immediately cancelled.
             * <p>
             * @return the orderCancelTransaction
             * @see OrderCancelTransaction
             */
            public OrderCancelTransaction getOrderCancelTransaction() {
                return this.orderCancelTransaction;
            }

            @SerializedName("orderReissueTransaction") private Transaction orderReissueTransaction;

            /**
             * Get the orderReissueTransaction
             * <p>
             * The Transaction that reissues the Order. Only provided when the
             * Order is configured to be reissued for its remaining units after
             * a partial fill and the reissue was successful.
             * <p>
             * @return the orderReissueTransaction
             * @see Transaction
             */
            public Transaction getOrderReissueTransaction() {
                return this.orderReissueTransaction;
            }

            @SerializedName("orderReissueRejectTransaction") private Transaction orderReissueRejectTransaction;

            /**
             * Get the orderReissueRejectTransaction
             * <p>
             * The Transaction that rejects the reissue of the Order. Only
             * provided when the Order is configured to be reissued for its
             * remaining units after a partial fill and the reissue was
             * rejected.
             * <p>
             * @return the orderReissueRejectTransaction
             * @see Transaction
             */
            public Transaction getOrderReissueRejectTransaction() {
                return this.orderReissueRejectTransaction;
            }

            @SerializedName("relatedTransactionIDs") private TransactionID[] relatedTransactionIDs;

            /**
             * Get the relatedTransactionIDs
             * <p>
             * The IDs of all Transactions that were created while satisfying
             * the request.
             * <p>
             * @return the relatedTransactionIDs
             * @see TransactionID
             */
            public TransactionID[] getRelatedTransactionIDs() {
                return this.relatedTransactionIDs;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
        }

        public class CreateRequest extends Request {
            private CreateRequest() {
                super("POST",
                    "/v3/accounts/{accountID}/orders");
            }
            public CreateResponse execute() throws ClientProtocolException,
                    IOException,
                    CreateRequestException404,
                    CreateRequestException400,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                String bodystr = "";
                bodystr = gson.toJson(body);
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpPost httpreq = new HttpPost(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                httpreq.setEntity(new ByteArrayEntity(bodystr.getBytes("UTF-8")));
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 201) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else if (status == 404) {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0)
                        {
                            e = gson.fromJson(responsebody, CreateRequestException404.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    } else if (status == 400) {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0)
                        {
                            e = gson.fromJson(responsebody, CreateRequestException400.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, CreateResponse.class);
            }

            // Body Parameters
            private CreateRequestBody body = new CreateRequestBody();

            /**
             * Set the order
             * <p>
             * Specification of the Order to create
             * <p>
             * @param order the order
             * @return {@link CreateRequest CreateRequest}
             * @see OrderRequest
             */
            public CreateRequest order(OrderRequest order)
            {
                body.order = order;
                return this;
            }
        }
        /**
         * List Orders
         * <p>
         * Get a list of Orders for an Account
         * <p>
         * @param accountID Account Identifier
         * @return {@link ListRequest ListRequest}
         * @see AccountID
         */
        public ListRequest list(String accountID)
        {
            ListRequest request = new ListRequest();
            request.set_path_param("accountID", accountID);
            return request;
        }

        /**
         * The list of Orders requested
         */
        public class ListResponse {

            @SerializedName("orders") private Order[] orders;

            /**
             * Get the orders
             * <p>
             * The list of Order detail objects
             * <p>
             * @return the orders
             * @see Order
             */
            public Order[] getOrders() {
                return this.orders;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
        }

        public class ListRequest extends Request {
            private ListRequest() {
                super("GET",
                    "/v3/accounts/{accountID}/orders");
            }
            public ListResponse execute() throws ClientProtocolException,
                    IOException,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                if (this.ids != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "ids=";
                    boolean first = true;
                    for (String itr : this.ids) {
                        if (first) {
                            first = false;
                        } else {
                            queryparamstr += ",";
                        }
                        queryparamstr += itr;
                    }
                }
                if (this.state != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "state=";
                    queryparamstr += this.state;
                }
                if (this.instrument != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "instrument=";
                    queryparamstr += this.instrument;
                }
                if (this.count != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "count=";
                    queryparamstr += this.count;
                }
                if (this.beforeID != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "beforeID=";
                    queryparamstr += this.beforeID;
                }
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, ListResponse.class);
            }

            // Query Parameters

            private String[] ids = null;

            /**
             * Set the ids
             * <p>
             * List of Order IDs to retrieve
             * <p>
             * @param ids the ids
             * @return {@link ListRequest ListRequest}
             * @see OrderID
             */
            public ListRequest ids(String[] ids)
            {
                this.ids = ids;
                return this;
            }

            // Query Parameters

            private OrderState state = null;

            /**
             * Set the state
             * <p>
             * The state to filter the requested Orders by
             * <p>
             * @param state the state
             * @return {@link ListRequest ListRequest}
             * @see OrderState
             */
            public ListRequest state(OrderState state)
            {
                this.state = state;
                return this;
            }

            // Query Parameters

            private String instrument = null;

            /**
             * Set the instrument
             * <p>
             * The instrument to filter the requested orders by
             * <p>
             * @param instrument the instrument
             * @return {@link ListRequest ListRequest}
             * @see InstrumentName
             */
            public ListRequest instrument(String instrument)
            {
                this.instrument = instrument;
                return this;
            }

            // Query Parameters

            private Integer count = null;

            /**
             * Set the count
             * <p>
             * The maximum number of Orders to return
             * <p>
             * @param count the count
             * @return {@link ListRequest ListRequest}
             */
            public ListRequest count(Integer count)
            {
                this.count = count;
                return this;
            }

            // Query Parameters

            private String beforeID = null;

            /**
             * Set the beforeID
             * <p>
             * The maximum Order ID to return. If not provided the most recent
             * Orders in the Account are returned
             * <p>
             * @param beforeID the beforeID
             * @return {@link ListRequest ListRequest}
             * @see OrderID
             */
            public ListRequest beforeID(String beforeID)
            {
                this.beforeID = beforeID;
                return this;
            }

        }
        /**
         * Pending Orders
         * <p>
         * List all pending Orders in an Account
         * <p>
         * @param accountID Account Identifier
         * @return {@link ListpendingRequest ListpendingRequest}
         * @see AccountID
         */
        public ListpendingRequest listPending(String accountID)
        {
            ListpendingRequest request = new ListpendingRequest();
            request.set_path_param("accountID", accountID);
            return request;
        }

        /**
         * List of pending Orders for the Account
         */
        public class ListpendingResponse {

            @SerializedName("orders") private Order[] orders;

            /**
             * Get the orders
             * <p>
             * The list of pending Order details
             * <p>
             * @return the orders
             * @see Order
             */
            public Order[] getOrders() {
                return this.orders;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
        }

        public class ListpendingRequest extends Request {
            private ListpendingRequest() {
                super("GET",
                    "/v3/accounts/{accountID}/pendingOrders");
            }
            public ListpendingResponse execute() throws ClientProtocolException,
                    IOException,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, ListpendingResponse.class);
            }

        }
        /**
         * Get Order
         * <p>
         * Get details for a single Order in an Account
         * <p>
         * @param accountID Account Identifier
         * @param orderSpecifier The Order Specifier
         * @return {@link GetRequest GetRequest}
         * @see AccountID
         * @see OrderSpecifier
         */
        public GetRequest get(String accountID, String orderSpecifier)
        {
            GetRequest request = new GetRequest();
            request.set_path_param("accountID", accountID);
            request.set_path_param("orderSpecifier", orderSpecifier);
            return request;
        }

        /**
         * The details of the Order requested
         */
        public class GetResponse {

            @SerializedName("order") private Order order;

            /**
             * Get the order
             * <p>
             * The details of the Order requested
             * <p>
             * @return the order
             * @see Order
             */
            public Order getOrder() {
                return this.order;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
        }

        public class GetRequest extends Request {
            private GetRequest() {
                super("GET",
                    "/v3/accounts/{accountID}/orders/{orderSpecifier}");
            }
            public GetResponse execute() throws ClientProtocolException,
                    IOException,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, GetResponse.class);
            }

        }
        /**
         * Replace Order
         * <p>
         * Replace an Order in an Account by simultaneously cancelling it and
         * creating a replacement Order
         * <p>
         * @param accountID Account Identifier
         * @param orderSpecifier The Order Specifier
         * @return {@link ReplaceRequest ReplaceRequest}
         * @see AccountID
         * @see OrderSpecifier
         */
        public ReplaceRequest replace(String accountID, String orderSpecifier)
        {
            ReplaceRequest request = new ReplaceRequest();
            request.set_path_param("accountID", accountID);
            request.set_path_param("orderSpecifier", orderSpecifier);
            return request;
        }

        private class ReplaceRequestBody {
            @SuppressWarnings("unused")
            @SerializedName("order") private OrderRequest order;
        }

        /**
         * The Account or Order specified does not exist.
         */
        @SuppressWarnings("serial")
        public class ReplaceRequestException404 extends RequestException {

            @SerializedName("orderCancelRejectTransaction") private Transaction orderCancelRejectTransaction;

            /**
             * Get the orderCancelRejectTransaction
             * <p>
             * The Transaction that rejected the cancellation of the Order to
             * be replaced. Only present if the Account exists.
             * <p>
             * @return the orderCancelRejectTransaction
             * @see Transaction
             */
            public Transaction getOrderCancelRejectTransaction() {
                return this.orderCancelRejectTransaction;
            }

            @SerializedName("relatedTransactionIDs") private TransactionID[] relatedTransactionIDs;

            /**
             * Get the relatedTransactionIDs
             * <p>
             * The IDs of all Transactions that were created while satisfying
             * the request. Only present if the Account exists.
             * <p>
             * @return the relatedTransactionIDs
             * @see TransactionID
             */
            public TransactionID[] getRelatedTransactionIDs() {
                return this.relatedTransactionIDs;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account.
             * Only present if the Account exists.
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }

        /**
         * The Order specification was invalid
         */
        @SuppressWarnings("serial")
        public class ReplaceRequestException400 extends RequestException {

            @SerializedName("orderRejectTransaction") private Transaction orderRejectTransaction;

            /**
             * Get the orderRejectTransaction
             * <p>
             * The Transaction that rejected the creation of the replacing
             * Order
             * <p>
             * @return the orderRejectTransaction
             * @see Transaction
             */
            public Transaction getOrderRejectTransaction() {
                return this.orderRejectTransaction;
            }

            @SerializedName("relatedTransactionIDs") private TransactionID[] relatedTransactionIDs;

            /**
             * Get the relatedTransactionIDs
             * <p>
             * The IDs of all Transactions that were created while satisfying
             * the request.
             * <p>
             * @return the relatedTransactionIDs
             * @see TransactionID
             */
            public TransactionID[] getRelatedTransactionIDs() {
                return this.relatedTransactionIDs;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account.
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }

        /**
         * The Order was successfully cancelled and replaced
         */
        public class ReplaceResponse {

            @SerializedName("orderCancelTransaction") private OrderCancelTransaction orderCancelTransaction;

            /**
             * Get the orderCancelTransaction
             * <p>
             * The Transaction that cancelled the Order to be replaced.
             * <p>
             * @return the orderCancelTransaction
             * @see OrderCancelTransaction
             */
            public OrderCancelTransaction getOrderCancelTransaction() {
                return this.orderCancelTransaction;
            }

            @SerializedName("orderCreateTransaction") private Transaction orderCreateTransaction;

            /**
             * Get the orderCreateTransaction
             * <p>
             * The Transaction that created the replacing Order as requested.
             * <p>
             * @return the orderCreateTransaction
             * @see Transaction
             */
            public Transaction getOrderCreateTransaction() {
                return this.orderCreateTransaction;
            }

            @SerializedName("orderFillTransaction") private OrderFillTransaction orderFillTransaction;

            /**
             * Get the orderFillTransaction
             * <p>
             * The Transaction that filled the replacing Order. This is only
             * provided when the replacing Order was immediately filled.
             * <p>
             * @return the orderFillTransaction
             * @see OrderFillTransaction
             */
            public OrderFillTransaction getOrderFillTransaction() {
                return this.orderFillTransaction;
            }

            @SerializedName("orderReissueTransaction") private Transaction orderReissueTransaction;

            /**
             * Get the orderReissueTransaction
             * <p>
             * The Transaction that reissues the replacing Order. Only provided
             * when the replacing Order was partially filled immediately and is
             * configured to be reissued for its remaining units.
             * <p>
             * @return the orderReissueTransaction
             * @see Transaction
             */
            public Transaction getOrderReissueTransaction() {
                return this.orderReissueTransaction;
            }

            @SerializedName("orderReissueRejectTransaction") private Transaction orderReissueRejectTransaction;

            /**
             * Get the orderReissueRejectTransaction
             * <p>
             * The Transaction that rejects the reissue of the Order. Only
             * provided when the replacing Order was paritially filled
             * immediately and was configured to be reissued, however the
             * reissue was rejected.
             * <p>
             * @return the orderReissueRejectTransaction
             * @see Transaction
             */
            public Transaction getOrderReissueRejectTransaction() {
                return this.orderReissueRejectTransaction;
            }

            @SerializedName("replacingOrderCancelTransaction") private OrderCancelTransaction replacingOrderCancelTransaction;

            /**
             * Get the replacingOrderCancelTransaction
             * <p>
             * The Transaction that cancelled the replacing Order. Only
             * provided when the replacing Order was immediately cancelled.
             * <p>
             * @return the replacingOrderCancelTransaction
             * @see OrderCancelTransaction
             */
            public OrderCancelTransaction getReplacingOrderCancelTransaction() {
                return this.replacingOrderCancelTransaction;
            }

            @SerializedName("relatedTransactionIDs") private TransactionID[] relatedTransactionIDs;

            /**
             * Get the relatedTransactionIDs
             * <p>
             * The IDs of all Transactions that were created while satisfying
             * the request.
             * <p>
             * @return the relatedTransactionIDs
             * @see TransactionID
             */
            public TransactionID[] getRelatedTransactionIDs() {
                return this.relatedTransactionIDs;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
        }

        public class ReplaceRequest extends Request {
            private ReplaceRequest() {
                super("PUT",
                    "/v3/accounts/{accountID}/orders/{orderSpecifier}");
            }
            public ReplaceResponse execute() throws ClientProtocolException,
                    IOException,
                    ReplaceRequestException404,
                    ReplaceRequestException400,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                String bodystr = "";
                bodystr = gson.toJson(body);
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpPut httpreq = new HttpPut(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                httpreq.setEntity(new ByteArrayEntity(bodystr.getBytes("UTF-8")));
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 201) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else if (status == 404) {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0)
                        {
                            e = gson.fromJson(responsebody, ReplaceRequestException404.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    } else if (status == 400) {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0)
                        {
                            e = gson.fromJson(responsebody, ReplaceRequestException400.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, ReplaceResponse.class);
            }

            // Body Parameters
            private ReplaceRequestBody body = new ReplaceRequestBody();

            /**
             * Set the order
             * <p>
             * Specification of the replacing Order
             * <p>
             * @param order the order
             * @return {@link ReplaceRequest ReplaceRequest}
             * @see OrderRequest
             */
            public ReplaceRequest order(OrderRequest order)
            {
                body.order = order;
                return this;
            }
        }
        /**
         * Cancel Order
         * <p>
         * Cancel a pending Order in an Account
         * <p>
         * @param accountID Account Identifier
         * @param orderSpecifier The Order Specifier
         * @return {@link CancelRequest CancelRequest}
         * @see AccountID
         * @see OrderSpecifier
         */
        public CancelRequest cancel(String accountID, String orderSpecifier)
        {
            CancelRequest request = new CancelRequest();
            request.set_path_param("accountID", accountID);
            request.set_path_param("orderSpecifier", orderSpecifier);
            return request;
        }

        /**
         * The Account or Order specified does not exist.
         */
        @SuppressWarnings("serial")
        public class CancelRequestException404 extends RequestException {

            @SerializedName("orderCancelRejectTransaction") private OrderCancelRejectTransaction orderCancelRejectTransaction;

            /**
             * Get the orderCancelRejectTransaction
             * <p>
             * The Transaction that rejected the cancellation of the Order.
             * Only present if the Account exists.
             * <p>
             * @return the orderCancelRejectTransaction
             * @see OrderCancelRejectTransaction
             */
            public OrderCancelRejectTransaction getOrderCancelRejectTransaction() {
                return this.orderCancelRejectTransaction;
            }

            @SerializedName("relatedTransactionIDs") private TransactionID[] relatedTransactionIDs;

            /**
             * Get the relatedTransactionIDs
             * <p>
             * The IDs of all Transactions that were created while satisfying
             * the request. Only present if the Account exists.
             * <p>
             * @return the relatedTransactionIDs
             * @see TransactionID
             */
            public TransactionID[] getRelatedTransactionIDs() {
                return this.relatedTransactionIDs;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account.
             * Only present if the Account exists.
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }

        /**
         * The Order was cancelled as specified
         */
        public class CancelResponse {

            @SerializedName("orderCancelTransaction") private OrderCancelTransaction orderCancelTransaction;

            /**
             * Get the orderCancelTransaction
             * <p>
             * The Transaction that cancelled the Order
             * <p>
             * @return the orderCancelTransaction
             * @see OrderCancelTransaction
             */
            public OrderCancelTransaction getOrderCancelTransaction() {
                return this.orderCancelTransaction;
            }

            @SerializedName("relatedTransactionIDs") private TransactionID[] relatedTransactionIDs;

            /**
             * Get the relatedTransactionIDs
             * <p>
             * The IDs of all Transactions that were created while satisfying
             * the request.
             * <p>
             * @return the relatedTransactionIDs
             * @see TransactionID
             */
            public TransactionID[] getRelatedTransactionIDs() {
                return this.relatedTransactionIDs;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
        }

        public class CancelRequest extends Request {
            private CancelRequest() {
                super("PUT",
                    "/v3/accounts/{accountID}/orders/{orderSpecifier}/cancel");
            }
            public CancelResponse execute() throws ClientProtocolException,
                    IOException,
                    CancelRequestException404,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpPut httpreq = new HttpPut(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else if (status == 404) {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0)
                        {
                            e = gson.fromJson(responsebody, CancelRequestException404.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, CancelResponse.class);
            }

        }
        /**
         * Set Order Extensions
         * <p>
         * Update the Client Extensions for an Order in an Account. Do not set,
         * modify, or delete clientExtensions if your account is associated
         * with MT4.
         * <p>
         * @param accountID Account Identifier
         * @param orderSpecifier The Order Specifier
         * @return {@link SetclientextensionsRequest
         * SetclientextensionsRequest}
         * @see AccountID
         * @see OrderSpecifier
         */
        public SetclientextensionsRequest setClientExtensions(String accountID, String orderSpecifier)
        {
            SetclientextensionsRequest request = new SetclientextensionsRequest();
            request.set_path_param("accountID", accountID);
            request.set_path_param("orderSpecifier", orderSpecifier);
            return request;
        }

        private class SetclientextensionsRequestBody {
            @SuppressWarnings("unused")
            @SerializedName("clientExtensions") private ClientExtensions clientExtensions;
            @SuppressWarnings("unused")
            @SerializedName("tradeClientExtensions") private ClientExtensions tradeClientExtensions;
        }

        /**
         * The Account or Order specified does not exist.
         */
        @SuppressWarnings("serial")
        public class SetclientextensionsRequestException404 extends RequestException {

            @SerializedName("orderClientExtensionsModifyRejectTransaction") private OrderClientExtensionsModifyRejectTransaction orderClientExtensionsModifyRejectTransaction;

            /**
             * Get the orderClientExtensionsModifyRejectTransaction
             * <p>
             * The Transaction that rejected the modification of the Client
             * Extensions for the Order. Only present if the Account exists.
             * <p>
             * @return the orderClientExtensionsModifyRejectTransaction
             * @see OrderClientExtensionsModifyRejectTransaction
             */
            public OrderClientExtensionsModifyRejectTransaction getOrderClientExtensionsModifyRejectTransaction() {
                return this.orderClientExtensionsModifyRejectTransaction;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account.
             * Only present if the Account exists.
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }

            @SerializedName("relatedTransactionIDs") private TransactionID[] relatedTransactionIDs;

            /**
             * Get the relatedTransactionIDs
             * <p>
             * The IDs of all Transactions that were created while satisfying
             * the request. Only present if the Account exists.
             * <p>
             * @return the relatedTransactionIDs
             * @see TransactionID
             */
            public TransactionID[] getRelatedTransactionIDs() {
                return this.relatedTransactionIDs;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }

        /**
         * The Order Client Extensions specification was invalid
         */
        @SuppressWarnings("serial")
        public class SetclientextensionsRequestException400 extends RequestException {

            @SerializedName("orderClientExtensionsModifyRejectTransaction") private OrderClientExtensionsModifyRejectTransaction orderClientExtensionsModifyRejectTransaction;

            /**
             * Get the orderClientExtensionsModifyRejectTransaction
             * <p>
             * The Transaction that rejected the modification of the Client
             * Extensions for the Order
             * <p>
             * @return the orderClientExtensionsModifyRejectTransaction
             * @see OrderClientExtensionsModifyRejectTransaction
             */
            public OrderClientExtensionsModifyRejectTransaction getOrderClientExtensionsModifyRejectTransaction() {
                return this.orderClientExtensionsModifyRejectTransaction;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }

            @SerializedName("relatedTransactionIDs") private TransactionID[] relatedTransactionIDs;

            /**
             * Get the relatedTransactionIDs
             * <p>
             * The IDs of all Transactions that were created while satisfying
             * the request.
             * <p>
             * @return the relatedTransactionIDs
             * @see TransactionID
             */
            public TransactionID[] getRelatedTransactionIDs() {
                return this.relatedTransactionIDs;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }

        /**
         * The Order's Client Extensions were successfully modified
         */
        public class SetclientextensionsResponse {

            @SerializedName("orderClientExtensionsModifyTransaction") private OrderClientExtensionsModifyTransaction orderClientExtensionsModifyTransaction;

            /**
             * Get the orderClientExtensionsModifyTransaction
             * <p>
             * The Transaction that modified the Client Extensions for the
             * Order
             * <p>
             * @return the orderClientExtensionsModifyTransaction
             * @see OrderClientExtensionsModifyTransaction
             */
            public OrderClientExtensionsModifyTransaction getOrderClientExtensionsModifyTransaction() {
                return this.orderClientExtensionsModifyTransaction;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }

            @SerializedName("relatedTransactionIDs") private TransactionID[] relatedTransactionIDs;

            /**
             * Get the relatedTransactionIDs
             * <p>
             * The IDs of all Transactions that were created while satisfying
             * the request.
             * <p>
             * @return the relatedTransactionIDs
             * @see TransactionID
             */
            public TransactionID[] getRelatedTransactionIDs() {
                return this.relatedTransactionIDs;
            }
        }

        public class SetclientextensionsRequest extends Request {
            private SetclientextensionsRequest() {
                super("PUT",
                    "/v3/accounts/{accountID}/orders/{orderSpecifier}/clientExtensions");
            }
            public SetclientextensionsResponse execute() throws ClientProtocolException,
                    IOException,
                    SetclientextensionsRequestException404,
                    SetclientextensionsRequestException400,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                String bodystr = "";
                bodystr = gson.toJson(body);
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpPut httpreq = new HttpPut(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                httpreq.setEntity(new ByteArrayEntity(bodystr.getBytes("UTF-8")));
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else if (status == 404) {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0)
                        {
                            e = gson.fromJson(responsebody, SetclientextensionsRequestException404.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    } else if (status == 400) {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0)
                        {
                            e = gson.fromJson(responsebody, SetclientextensionsRequestException400.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, SetclientextensionsResponse.class);
            }

            // Body Parameters
            private SetclientextensionsRequestBody body = new SetclientextensionsRequestBody();

            /**
             * Set the clientExtensions
             * <p>
             * The Client Extensions to update for the Order. Do not set,
             * modify, or delete clientExtensions if your account is associated
             * with MT4.
             * <p>
             * @param clientExtensions the clientExtensions
             * @return {@link SetclientextensionsRequest
             * SetclientextensionsRequest}
             * @see ClientExtensions
             */
            public SetclientextensionsRequest clientExtensions(ClientExtensions clientExtensions)
            {
                body.clientExtensions = clientExtensions;
                return this;
            }

            /**
             * Set the tradeClientExtensions
             * <p>
             * The Client Extensions to update for the Trade created when the
             * Order is filled. Do not set, modify, or delete clientExtensions
             * if your account is associated with MT4.
             * <p>
             * @param tradeClientExtensions the tradeClientExtensions
             * @return {@link SetclientextensionsRequest
             * SetclientextensionsRequest}
             * @see ClientExtensions
             */
            public SetclientextensionsRequest tradeClientExtensions(ClientExtensions tradeClientExtensions)
            {
                body.tradeClientExtensions = tradeClientExtensions;
                return this;
            }
        }
    }

    public class TransactionContext {
        /**
         * List Transactions
         * <p>
         * Get a list of Transactions pages that satisfy a time-based
         * Transaction query.
         * <p>
         * @param accountID Account Identifier
         * @return {@link ListRequest ListRequest}
         * @see AccountID
         */
        public ListRequest list(String accountID)
        {
            ListRequest request = new ListRequest();
            request.set_path_param("accountID", accountID);
            return request;
        }

        /**
         * The requested time range of Transaction pages are provided.
         */
        public class ListResponse {

            @SerializedName("from") private DateTime from;

            /**
             * Get the from
             * <p>
             * The starting time provided in the request.
             * <p>
             * @return the from
             * @see DateTime
             */
            public DateTime getFrom() {
                return this.from;
            }

            @SerializedName("to") private DateTime to;

            /**
             * Get the to
             * <p>
             * The ending time provided in the request.
             * <p>
             * @return the to
             * @see DateTime
             */
            public DateTime getTo() {
                return this.to;
            }

            @SerializedName("pageSize") private Integer pageSize;

            /**
             * Get the pageSize
             * <p>
             * The pageSize provided in the request
             * <p>
             * @return the pageSize
             */
            public Integer getPageSize() {
                return this.pageSize;
            }

            @SerializedName("type") private TransactionFilter[] type;

            /**
             * Get the type
             * <p>
             * The Transaction-type filter provided in the request
             * <p>
             * @return the type
             * @see TransactionFilter
             */
            public TransactionFilter[] getType() {
                return this.type;
            }

            @SerializedName("count") private Integer count;

            /**
             * Get the count
             * <p>
             * The number of Transactions that are contained in the pages
             * returned
             * <p>
             * @return the count
             */
            public Integer getCount() {
                return this.count;
            }

            @SerializedName("pages") private String[] pages;

            /**
             * Get the pages
             * <p>
             * The list of URLs that represent idrange queries providing the
             * data for each page in the query results
             * <p>
             * @return the pages
             */
            public String[] getPages() {
                return this.pages;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
        }

        public class ListRequest extends Request {
            private ListRequest() {
                super("GET",
                    "/v3/accounts/{accountID}/transactions");
            }
            public ListResponse execute() throws ClientProtocolException,
                    IOException,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                if (this.from != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "from=";
                    queryparamstr += this.from;
                }
                if (this.to != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "to=";
                    queryparamstr += this.to;
                }
                if (this.pageSize != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "pageSize=";
                    queryparamstr += this.pageSize;
                }
                if (this.type != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "type=";
                    boolean first = true;
                    for (String itr : this.type) {
                        if (first) {
                            first = false;
                        } else {
                            queryparamstr += ",";
                        }
                        queryparamstr += itr;
                    }
                }
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, ListResponse.class);
            }

            // Query Parameters

            private String from = null;

            /**
             * Set the from
             * <p>
             * The starting time (inclusive) of the time range for the
             * Transactions being queried.
             * <p>
             * @param from the from
             * @return {@link ListRequest ListRequest}
             * @see DateTime
             */
            public ListRequest fromTime(String from)
            {
                this.from = from;
                return this;
            }

            // Query Parameters

            private String to = null;

            /**
             * Set the to
             * <p>
             * The ending time (inclusive) of the time range for the
             * Transactions being queried.
             * <p>
             * @param to the to
             * @return {@link ListRequest ListRequest}
             * @see DateTime
             */
            public ListRequest toTime(String to)
            {
                this.to = to;
                return this;
            }

            // Query Parameters

            private Integer pageSize = null;

            /**
             * Set the pageSize
             * <p>
             * The number of Transactions to include in each page of the
             * results.
             * <p>
             * @param pageSize the pageSize
             * @return {@link ListRequest ListRequest}
             */
            public ListRequest pageSize(Integer pageSize)
            {
                this.pageSize = pageSize;
                return this;
            }

            // Query Parameters

            private String[] type = null;

            /**
             * Set the type
             * <p>
             * A filter for restricting the types of Transactions to retreive.
             * <p>
             * @param type the type
             * @return {@link ListRequest ListRequest}
             * @see TransactionFilter
             */
            public ListRequest type(String[] type)
            {
                this.type = type;
                return this;
            }

        }
        /**
         * Transaction Details
         * <p>
         * Get the details of a single Account Transaction.
         * <p>
         * @param accountID Account Identifier
         * @param transactionID A Transaction ID
         * @return {@link GetRequest GetRequest}
         * @see AccountID
         * @see TransactionID
         */
        public GetRequest get(String accountID, String transactionID)
        {
            GetRequest request = new GetRequest();
            request.set_path_param("accountID", accountID);
            request.set_path_param("transactionID", transactionID);
            return request;
        }

        /**
         * The details of the requested Transaction are provided.
         */
        public class GetResponse {

            @SerializedName("transaction") private Transaction transaction;

            /**
             * Get the transaction
             * <p>
             * The details of the Transaction requested
             * <p>
             * @return the transaction
             * @see Transaction
             */
            public Transaction getTransaction() {
                return this.transaction;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
        }

        public class GetRequest extends Request {
            private GetRequest() {
                super("GET",
                    "/v3/accounts/{accountID}/transactions/{transactionID}");
            }
            public GetResponse execute() throws ClientProtocolException,
                    IOException,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, GetResponse.class);
            }

        }
        /**
         * Transaction ID Range
         * <p>
         * Get a range of Transactions for an Account based on the Transaction
         * IDs.
         * <p>
         * @param accountID Account Identifier
         * @return {@link RangeRequest RangeRequest}
         * @see AccountID
         */
        public RangeRequest range(String accountID)
        {
            RangeRequest request = new RangeRequest();
            request.set_path_param("accountID", accountID);
            return request;
        }

        /**
         * The requested time range of Transactions are provided.
         */
        public class RangeResponse {

            @SerializedName("transactions") private Transaction[] transactions;

            /**
             * Get the transactions
             * <p>
             * The list of Transactions that satisfy the request.
             * <p>
             * @return the transactions
             * @see Transaction
             */
            public Transaction[] getTransactions() {
                return this.transactions;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
        }

        public class RangeRequest extends Request {
            private RangeRequest() {
                super("GET",
                    "/v3/accounts/{accountID}/transactions/idrange");
            }
            public RangeResponse execute() throws ClientProtocolException,
                    IOException,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                if (this.from != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "from=";
                    queryparamstr += this.from;
                }
                if (this.to != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "to=";
                    queryparamstr += this.to;
                }
                if (this.type != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "type=";
                    boolean first = true;
                    for (String itr : this.type) {
                        if (first) {
                            first = false;
                        } else {
                            queryparamstr += ",";
                        }
                        queryparamstr += itr;
                    }
                }
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, RangeResponse.class);
            }

            // Query Parameters

            private String from = null;

            /**
             * Set the from
             * <p>
             * The starting Transacion ID (inclusive) to fetch.
             * <p>
             * @param from the from
             * @return {@link RangeRequest RangeRequest}
             * @see TransactionID
             */
            public RangeRequest fromID(String from)
            {
                this.from = from;
                return this;
            }

            // Query Parameters

            private String to = null;

            /**
             * Set the to
             * <p>
             * The ending Transaction ID (inclusive) to fetch.
             * <p>
             * @param to the to
             * @return {@link RangeRequest RangeRequest}
             * @see TransactionID
             */
            public RangeRequest toID(String to)
            {
                this.to = to;
                return this;
            }

            // Query Parameters

            private String[] type = null;

            /**
             * Set the type
             * <p>
             * The filter that restricts the types of Transactions to retreive.
             * <p>
             * @param type the type
             * @return {@link RangeRequest RangeRequest}
             * @see TransactionFilter
             */
            public RangeRequest type(String[] type)
            {
                this.type = type;
                return this;
            }

        }
        /**
         * Transactions Since ID
         * <p>
         * Get a range of Transactions for an Account starting at (but not
         * including) a provided Transaction ID.
         * <p>
         * @param accountID Account Identifier
         * @return {@link SinceRequest SinceRequest}
         * @see AccountID
         */
        public SinceRequest since(String accountID)
        {
            SinceRequest request = new SinceRequest();
            request.set_path_param("accountID", accountID);
            return request;
        }

        /**
         * The requested time range of Transactions are provided.
         */
        public class SinceResponse {

            @SerializedName("transactions") private Transaction[] transactions;

            /**
             * Get the transactions
             * <p>
             * The list of Transactions that satisfy the request.
             * <p>
             * @return the transactions
             * @see Transaction
             */
            public Transaction[] getTransactions() {
                return this.transactions;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
        }

        public class SinceRequest extends Request {
            private SinceRequest() {
                super("GET",
                    "/v3/accounts/{accountID}/transactions/sinceid");
            }
            public SinceResponse execute() throws ClientProtocolException,
                    IOException,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                if (this.id != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "id=";
                    queryparamstr += this.id;
                }
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, SinceResponse.class);
            }

            // Query Parameters

            private String id = null;

            /**
             * Set the id
             * <p>
             * The ID of the last Transacion fetched. This query will return
             * all Transactions newer than the TransactionID.
             * <p>
             * @param id the id
             * @return {@link SinceRequest SinceRequest}
             * @see TransactionID
             */
            public SinceRequest id(String id)
            {
                this.id = id;
                return this;
            }

        }
    }

    public class TradeContext {
        /**
         * List Trades
         * <p>
         * Get a list of Trades for an Account
         * <p>
         * @param accountID Account Identifier
         * @return {@link ListRequest ListRequest}
         * @see AccountID
         */
        public ListRequest list(String accountID)
        {
            ListRequest request = new ListRequest();
            request.set_path_param("accountID", accountID);
            return request;
        }

        /**
         * The list of Trades requested
         */
        public class ListResponse {

            @SerializedName("trades") private Trade[] trades;

            /**
             * Get the trades
             * <p>
             * The list of Trade detail objects
             * <p>
             * @return the trades
             * @see Trade
             */
            public Trade[] getTrades() {
                return this.trades;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
        }

        public class ListRequest extends Request {
            private ListRequest() {
                super("GET",
                    "/v3/accounts/{accountID}/trades");
            }
            public ListResponse execute() throws ClientProtocolException,
                    IOException,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                if (this.ids != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "ids=";
                    boolean first = true;
                    for (String itr : this.ids) {
                        if (first) {
                            first = false;
                        } else {
                            queryparamstr += ",";
                        }
                        queryparamstr += itr;
                    }
                }
                if (this.state != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "state=";
                    queryparamstr += this.state;
                }
                if (this.instrument != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "instrument=";
                    queryparamstr += this.instrument;
                }
                if (this.count != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "count=";
                    queryparamstr += this.count;
                }
                if (this.beforeID != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "beforeID=";
                    queryparamstr += this.beforeID;
                }
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, ListResponse.class);
            }

            // Query Parameters

            private String[] ids = null;

            /**
             * Set the ids
             * <p>
             * List of Trade IDs to retrieve.
             * <p>
             * @param ids the ids
             * @return {@link ListRequest ListRequest}
             * @see TradeID
             */
            public ListRequest ids(String[] ids)
            {
                this.ids = ids;
                return this;
            }

            // Query Parameters

            private TradeState state = null;

            /**
             * Set the state
             * <p>
             * The state to filter the requested Trades by.
             * <p>
             * @param state the state
             * @return {@link ListRequest ListRequest}
             * @see TradeState
             */
            public ListRequest state(TradeState state)
            {
                this.state = state;
                return this;
            }

            // Query Parameters

            private String instrument = null;

            /**
             * Set the instrument
             * <p>
             * The instrument to filter the requested Trades by.
             * <p>
             * @param instrument the instrument
             * @return {@link ListRequest ListRequest}
             * @see InstrumentName
             */
            public ListRequest instrument(String instrument)
            {
                this.instrument = instrument;
                return this;
            }

            // Query Parameters

            private Integer count = null;

            /**
             * Set the count
             * <p>
             * The maximum number of Trades to return.
             * <p>
             * @param count the count
             * @return {@link ListRequest ListRequest}
             */
            public ListRequest count(Integer count)
            {
                this.count = count;
                return this;
            }

            // Query Parameters

            private String beforeID = null;

            /**
             * Set the beforeID
             * <p>
             * The maximum Trade ID to return. If not provided the most recent
             * Trades in the Account are returned.
             * <p>
             * @param beforeID the beforeID
             * @return {@link ListRequest ListRequest}
             * @see TradeID
             */
            public ListRequest beforeID(String beforeID)
            {
                this.beforeID = beforeID;
                return this;
            }

        }
        /**
         * List Open Trades
         * <p>
         * Get the list of open Trades for an Account
         * <p>
         * @param accountID Account Identifier
         * @return {@link ListopenRequest ListopenRequest}
         * @see AccountID
         */
        public ListopenRequest listOpen(String accountID)
        {
            ListopenRequest request = new ListopenRequest();
            request.set_path_param("accountID", accountID);
            return request;
        }

        /**
         * The Account's list of open Trades is provided
         */
        public class ListopenResponse {

            @SerializedName("trades") private Trade[] trades;

            /**
             * Get the trades
             * <p>
             * The Account's list of open Trades
             * <p>
             * @return the trades
             * @see Trade
             */
            public Trade[] getTrades() {
                return this.trades;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
        }

        public class ListopenRequest extends Request {
            private ListopenRequest() {
                super("GET",
                    "/v3/accounts/{accountID}/openTrades");
            }
            public ListopenResponse execute() throws ClientProtocolException,
                    IOException,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, ListopenResponse.class);
            }

        }
        /**
         * Trade Details
         * <p>
         * Get the details of a specific Trade in an Account
         * <p>
         * @param accountID Account Identifier
         * @param tradeSpecifier Specifier for the Trade
         * @return {@link GetRequest GetRequest}
         * @see AccountID
         * @see TradeSpecifier
         */
        public GetRequest get(String accountID, String tradeSpecifier)
        {
            GetRequest request = new GetRequest();
            request.set_path_param("accountID", accountID);
            request.set_path_param("tradeSpecifier", tradeSpecifier);
            return request;
        }

        /**
         * The details for the requested Trade is provided
         */
        public class GetResponse {

            @SerializedName("trade") private Trade trade;

            /**
             * Get the trade
             * <p>
             * The Account's list of open Trades
             * <p>
             * @return the trade
             * @see Trade
             */
            public Trade getTrade() {
                return this.trade;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
        }

        public class GetRequest extends Request {
            private GetRequest() {
                super("GET",
                    "/v3/accounts/{accountID}/trades/{tradeSpecifier}");
            }
            public GetResponse execute() throws ClientProtocolException,
                    IOException,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, GetResponse.class);
            }

        }
        /**
         * Close Trade
         * <p>
         * Close (partially or fully) a specific open Trade in an Account
         * <p>
         * @param accountID Account Identifier
         * @param tradeSpecifier Specifier for the Trade
         * @return {@link CloseRequest CloseRequest}
         * @see AccountID
         * @see TradeSpecifier
         */
        public CloseRequest close(String accountID, String tradeSpecifier)
        {
            CloseRequest request = new CloseRequest();
            request.set_path_param("accountID", accountID);
            request.set_path_param("tradeSpecifier", tradeSpecifier);
            return request;
        }

        private class CloseRequestBody {
            @SuppressWarnings("unused")
            @SerializedName("units") private String units;
        }

        /**
         * The Account or Trade specified does not exist.
         */
        @SuppressWarnings("serial")
        public class CloseRequestException404 extends RequestException {

            @SerializedName("orderRejectTransaction") private MarketOrderRejectTransaction orderRejectTransaction;

            /**
             * Get the orderRejectTransaction
             * <p>
             * The MarketOrderReject Transaction that rejects the creation of
             * the Trade-closing MarketOrder. Only present if the Account
             * exists.
             * <p>
             * @return the orderRejectTransaction
             * @see MarketOrderRejectTransaction
             */
            public MarketOrderRejectTransaction getOrderRejectTransaction() {
                return this.orderRejectTransaction;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account.
             * Only present if the Account exists.
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }

            @SerializedName("relatedTransactionIDs") private TransactionID[] relatedTransactionIDs;

            /**
             * Get the relatedTransactionIDs
             * <p>
             * The IDs of all Transactions that were created while satisfying
             * the request. Only present if the Account exists.
             * <p>
             * @return the relatedTransactionIDs
             * @see TransactionID
             */
            public TransactionID[] getRelatedTransactionIDs() {
                return this.relatedTransactionIDs;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }

        /**
         * The Trade cannot be closed as requested.
         */
        @SuppressWarnings("serial")
        public class CloseRequestException400 extends RequestException {

            @SerializedName("orderRejectTransaction") private MarketOrderRejectTransaction orderRejectTransaction;

            /**
             * Get the orderRejectTransaction
             * <p>
             * The MarketOrderReject Transaction that rejects the creation of
             * the Trade-closing MarketOrder.
             * <p>
             * @return the orderRejectTransaction
             * @see MarketOrderRejectTransaction
             */
            public MarketOrderRejectTransaction getOrderRejectTransaction() {
                return this.orderRejectTransaction;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }

        /**
         * The Trade has been closed as requested
         */
        public class CloseResponse {

            @SerializedName("orderCreateTransaction") private MarketOrderTransaction orderCreateTransaction;

            /**
             * Get the orderCreateTransaction
             * <p>
             * The MarketOrder Transaction created to close the Trade.
             * <p>
             * @return the orderCreateTransaction
             * @see MarketOrderTransaction
             */
            public MarketOrderTransaction getOrderCreateTransaction() {
                return this.orderCreateTransaction;
            }

            @SerializedName("orderFillTransaction") private OrderFillTransaction orderFillTransaction;

            /**
             * Get the orderFillTransaction
             * <p>
             * The OrderFill Transaction that fills the Trade-closing
             * MarketOrder and closes the Trade.
             * <p>
             * @return the orderFillTransaction
             * @see OrderFillTransaction
             */
            public OrderFillTransaction getOrderFillTransaction() {
                return this.orderFillTransaction;
            }

            @SerializedName("orderCancelTransaction") private OrderCancelTransaction orderCancelTransaction;

            /**
             * Get the orderCancelTransaction
             * <p>
             * The OrderCancel Transaction that immediately cancelled the
             * Trade-closing MarketOrder.
             * <p>
             * @return the orderCancelTransaction
             * @see OrderCancelTransaction
             */
            public OrderCancelTransaction getOrderCancelTransaction() {
                return this.orderCancelTransaction;
            }

            @SerializedName("relatedTransactionIDs") private TransactionID[] relatedTransactionIDs;

            /**
             * Get the relatedTransactionIDs
             * <p>
             * The IDs of all Transactions that were created while satisfying
             * the request.
             * <p>
             * @return the relatedTransactionIDs
             * @see TransactionID
             */
            public TransactionID[] getRelatedTransactionIDs() {
                return this.relatedTransactionIDs;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
        }

        public class CloseRequest extends Request {
            private CloseRequest() {
                super("PUT",
                    "/v3/accounts/{accountID}/trades/{tradeSpecifier}/close");
            }
            public CloseResponse execute() throws ClientProtocolException,
                    IOException,
                    CloseRequestException404,
                    CloseRequestException400,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                String bodystr = "";
                bodystr = gson.toJson(body);
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpPut httpreq = new HttpPut(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                httpreq.setEntity(new ByteArrayEntity(bodystr.getBytes("UTF-8")));
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else if (status == 404) {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0)
                        {
                            e = gson.fromJson(responsebody, CloseRequestException404.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    } else if (status == 400) {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0)
                        {
                            e = gson.fromJson(responsebody, CloseRequestException400.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, CloseResponse.class);
            }

            // Body Parameters
            private CloseRequestBody body = new CloseRequestBody();

            /**
             * Set the units
             * <p>
             * Indication of how much of the Trade to close. Either the string
             * "ALL" (indicating that all of the Trade should be closed), or a
             * DecimalNumber representing the number of units of the open Trade
             * to Close using a TradeClose MarketOrder. The units specified
             * must always be positive, and the magnitude of the value cannot
             * exceed the magnitude of the Trade's open units.
             * <p>
             * @param units the units
             * @return {@link CloseRequest CloseRequest}
             */
            public CloseRequest units(String units)
            {
                body.units = new String(units);
                return this;
            }
        }
        /**
         * Set Trade Client Extensions
         * <p>
         * Update the Client Extensions for a Trade. Do not add, update, or
         * delete the Client Extensions if your account is associated with MT4.
         * <p>
         * @param accountID Account Identifier
         * @param tradeSpecifier Specifier for the Trade
         * @return {@link SetclientextensionsRequest
         * SetclientextensionsRequest}
         * @see AccountID
         * @see TradeSpecifier
         */
        public SetclientextensionsRequest setClientExtensions(String accountID, String tradeSpecifier)
        {
            SetclientextensionsRequest request = new SetclientextensionsRequest();
            request.set_path_param("accountID", accountID);
            request.set_path_param("tradeSpecifier", tradeSpecifier);
            return request;
        }

        private class SetclientextensionsRequestBody {
            @SuppressWarnings("unused")
            @SerializedName("clientExtensions") private ClientExtensions clientExtensions;
        }

        /**
         * The Account or Trade specified does not exist.
         */
        @SuppressWarnings("serial")
        public class SetclientextensionsRequestException404 extends RequestException {

            @SerializedName("tradeClientExtensionsModifyRejectTransaction") private TradeClientExtensionsModifyRejectTransaction tradeClientExtensionsModifyRejectTransaction;

            /**
             * Get the tradeClientExtensionsModifyRejectTransaction
             * <p>
             * The Transaction that rejects the modification of the Trade's
             * Client Extensions. Only present if the Account exists.
             * <p>
             * @return the tradeClientExtensionsModifyRejectTransaction
             * @see TradeClientExtensionsModifyRejectTransaction
             */
            public TradeClientExtensionsModifyRejectTransaction getTradeClientExtensionsModifyRejectTransaction() {
                return this.tradeClientExtensionsModifyRejectTransaction;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account.
             * Only present if the Account exists.
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }

            @SerializedName("relatedTransactionIDs") private TransactionID[] relatedTransactionIDs;

            /**
             * Get the relatedTransactionIDs
             * <p>
             * The IDs of all Transactions that were created while satisfying
             * the request. Only present if the Account exists.
             * <p>
             * @return the relatedTransactionIDs
             * @see TransactionID
             */
            public TransactionID[] getRelatedTransactionIDs() {
                return this.relatedTransactionIDs;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }

        /**
         * The Trade's Client Extensions cannot be modified as requested.
         */
        @SuppressWarnings("serial")
        public class SetclientextensionsRequestException400 extends RequestException {

            @SerializedName("tradeClientExtensionsModifyRejectTransaction") private TradeClientExtensionsModifyRejectTransaction tradeClientExtensionsModifyRejectTransaction;

            /**
             * Get the tradeClientExtensionsModifyRejectTransaction
             * <p>
             * The Transaction that rejects the modification of the Trade's
             * Client Extensions.
             * <p>
             * @return the tradeClientExtensionsModifyRejectTransaction
             * @see TradeClientExtensionsModifyRejectTransaction
             */
            public TradeClientExtensionsModifyRejectTransaction getTradeClientExtensionsModifyRejectTransaction() {
                return this.tradeClientExtensionsModifyRejectTransaction;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account.
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }

            @SerializedName("relatedTransactionIDs") private TransactionID[] relatedTransactionIDs;

            /**
             * Get the relatedTransactionIDs
             * <p>
             * The IDs of all Transactions that were created while satisfying
             * the request.
             * <p>
             * @return the relatedTransactionIDs
             * @see TransactionID
             */
            public TransactionID[] getRelatedTransactionIDs() {
                return this.relatedTransactionIDs;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }

        /**
         * The Trade's Client Extensions have been updated as requested.
         */
        public class SetclientextensionsResponse {

            @SerializedName("tradeClientExtensionsModifyTransaction") private TradeClientExtensionsModifyTransaction tradeClientExtensionsModifyTransaction;

            /**
             * Get the tradeClientExtensionsModifyTransaction
             * <p>
             * The Transaction that updates the Trade's Client Extensions.
             * <p>
             * @return the tradeClientExtensionsModifyTransaction
             * @see TradeClientExtensionsModifyTransaction
             */
            public TradeClientExtensionsModifyTransaction getTradeClientExtensionsModifyTransaction() {
                return this.tradeClientExtensionsModifyTransaction;
            }

            @SerializedName("relatedTransactionIDs") private TransactionID[] relatedTransactionIDs;

            /**
             * Get the relatedTransactionIDs
             * <p>
             * The IDs of all Transactions that were created while satisfying
             * the request.
             * <p>
             * @return the relatedTransactionIDs
             * @see TransactionID
             */
            public TransactionID[] getRelatedTransactionIDs() {
                return this.relatedTransactionIDs;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
        }

        public class SetclientextensionsRequest extends Request {
            private SetclientextensionsRequest() {
                super("PUT",
                    "/v3/accounts/{accountID}/trades/{tradeSpecifier}/clientExtensions");
            }
            public SetclientextensionsResponse execute() throws ClientProtocolException,
                    IOException,
                    SetclientextensionsRequestException404,
                    SetclientextensionsRequestException400,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                String bodystr = "";
                bodystr = gson.toJson(body);
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpPut httpreq = new HttpPut(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                httpreq.setEntity(new ByteArrayEntity(bodystr.getBytes("UTF-8")));
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else if (status == 404) {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0)
                        {
                            e = gson.fromJson(responsebody, SetclientextensionsRequestException404.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    } else if (status == 400) {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0)
                        {
                            e = gson.fromJson(responsebody, SetclientextensionsRequestException400.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, SetclientextensionsResponse.class);
            }

            // Body Parameters
            private SetclientextensionsRequestBody body = new SetclientextensionsRequestBody();

            /**
             * Set the clientExtensions
             * <p>
             * The Client Extensions to update the Trade with. Do not add,
             * update, or delete the Client Extensions if your account is
             * associated with MT4.
             * <p>
             * @param clientExtensions the clientExtensions
             * @return {@link SetclientextensionsRequest
             * SetclientextensionsRequest}
             * @see ClientExtensions
             */
            public SetclientextensionsRequest clientExtensions(ClientExtensions clientExtensions)
            {
                body.clientExtensions = clientExtensions;
                return this;
            }
        }
        /**
         * Set Dependent Orders
         * <p>
         * Create, replace and cancel a Trade's dependent Orders (Take Profit,
         * Stop Loss and Trailing Stop Loss) through the Trade itself
         * <p>
         * @param accountID Account Identifier
         * @param tradeSpecifier Specifier for the Trade
         * @return {@link SetdependentordersRequest SetdependentordersRequest}
         * @see AccountID
         * @see TradeSpecifier
         */
        public SetdependentordersRequest setDependentOrders(String accountID, String tradeSpecifier)
        {
            SetdependentordersRequest request = new SetdependentordersRequest();
            request.set_path_param("accountID", accountID);
            request.set_path_param("tradeSpecifier", tradeSpecifier);
            return request;
        }

        private class SetdependentordersRequestBody {
            @SuppressWarnings("unused")
            @SerializedName("takeProfit") private TakeProfitDetails takeProfit;
            @SuppressWarnings("unused")
            @SerializedName("stopLoss") private StopLossDetails stopLoss;
            @SuppressWarnings("unused")
            @SerializedName("trailingStopLoss") private TrailingStopLossDetails trailingStopLoss;
        }

        /**
         * The Trade's dependent Orders cannot be modified as requested.
         */
        @SuppressWarnings("serial")
        public class SetdependentordersRequestException400 extends RequestException {

            @SerializedName("takeProfitOrderCancelRejectTransaction") private OrderCancelRejectTransaction takeProfitOrderCancelRejectTransaction;

            /**
             * Get the takeProfitOrderCancelRejectTransaction
             * <p>
             * An OrderCancelRejectTransaction represents the rejection of the
             * cancellation of an Order in the client's Account.
             * <p>
             * @return the takeProfitOrderCancelRejectTransaction
             * @see OrderCancelRejectTransaction
             */
            public OrderCancelRejectTransaction getTakeProfitOrderCancelRejectTransaction() {
                return this.takeProfitOrderCancelRejectTransaction;
            }

            @SerializedName("takeProfitOrderRejectTransaction") private TakeProfitOrderRejectTransaction takeProfitOrderRejectTransaction;

            /**
             * Get the takeProfitOrderRejectTransaction
             * <p>
             * A TakeProfitOrderRejectTransaction represents the rejection of
             * the creation of a TakeProfit Order.
             * <p>
             * @return the takeProfitOrderRejectTransaction
             * @see TakeProfitOrderRejectTransaction
             */
            public TakeProfitOrderRejectTransaction getTakeProfitOrderRejectTransaction() {
                return this.takeProfitOrderRejectTransaction;
            }

            @SerializedName("stopLossOrderCancelRejectTransaction") private OrderCancelRejectTransaction stopLossOrderCancelRejectTransaction;

            /**
             * Get the stopLossOrderCancelRejectTransaction
             * <p>
             * An OrderCancelRejectTransaction represents the rejection of the
             * cancellation of an Order in the client's Account.
             * <p>
             * @return the stopLossOrderCancelRejectTransaction
             * @see OrderCancelRejectTransaction
             */
            public OrderCancelRejectTransaction getStopLossOrderCancelRejectTransaction() {
                return this.stopLossOrderCancelRejectTransaction;
            }

            @SerializedName("stopLossOrderRejectTransaction") private StopLossOrderRejectTransaction stopLossOrderRejectTransaction;

            /**
             * Get the stopLossOrderRejectTransaction
             * <p>
             * A StopLossOrderRejectTransaction represents the rejection of the
             * creation of a StopLoss Order.
             * <p>
             * @return the stopLossOrderRejectTransaction
             * @see StopLossOrderRejectTransaction
             */
            public StopLossOrderRejectTransaction getStopLossOrderRejectTransaction() {
                return this.stopLossOrderRejectTransaction;
            }

            @SerializedName("trailingStopLossOrderCancelRejectTransaction") private OrderCancelRejectTransaction trailingStopLossOrderCancelRejectTransaction;

            /**
             * Get the trailingStopLossOrderCancelRejectTransaction
             * <p>
             * An OrderCancelRejectTransaction represents the rejection of the
             * cancellation of an Order in the client's Account.
             * <p>
             * @return the trailingStopLossOrderCancelRejectTransaction
             * @see OrderCancelRejectTransaction
             */
            public OrderCancelRejectTransaction getTrailingStopLossOrderCancelRejectTransaction() {
                return this.trailingStopLossOrderCancelRejectTransaction;
            }

            @SerializedName("trailingStopLossOrderRejectTransaction") private TrailingStopLossOrderRejectTransaction trailingStopLossOrderRejectTransaction;

            /**
             * Get the trailingStopLossOrderRejectTransaction
             * <p>
             * A TrailingStopLossOrderRejectTransaction represents the
             * rejection of the creation of a TrailingStopLoss Order.
             * <p>
             * @return the trailingStopLossOrderRejectTransaction
             * @see TrailingStopLossOrderRejectTransaction
             */
            public TrailingStopLossOrderRejectTransaction getTrailingStopLossOrderRejectTransaction() {
                return this.trailingStopLossOrderRejectTransaction;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account.
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }

            @SerializedName("relatedTransactionIDs") private TransactionID[] relatedTransactionIDs;

            /**
             * Get the relatedTransactionIDs
             * <p>
             * The IDs of all Transactions that were created while satisfying
             * the request.
             * <p>
             * @return the relatedTransactionIDs
             * @see TransactionID
             */
            public TransactionID[] getRelatedTransactionIDs() {
                return this.relatedTransactionIDs;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }

        /**
         * The Trade's dependent Orders have been modified as requested.
         */
        public class SetdependentordersResponse {

            @SerializedName("takeProfitOrderCancelTransaction") private OrderCancelTransaction takeProfitOrderCancelTransaction;

            /**
             * Get the takeProfitOrderCancelTransaction
             * <p>
             * The Transaction created that cancels the Trade's existing Take
             * Profit Order.
             * <p>
             * @return the takeProfitOrderCancelTransaction
             * @see OrderCancelTransaction
             */
            public OrderCancelTransaction getTakeProfitOrderCancelTransaction() {
                return this.takeProfitOrderCancelTransaction;
            }

            @SerializedName("takeProfitOrderTransaction") private TakeProfitOrderTransaction takeProfitOrderTransaction;

            /**
             * Get the takeProfitOrderTransaction
             * <p>
             * The Transaction created that creates a new Take Profit Order for
             * the Trade.
             * <p>
             * @return the takeProfitOrderTransaction
             * @see TakeProfitOrderTransaction
             */
            public TakeProfitOrderTransaction getTakeProfitOrderTransaction() {
                return this.takeProfitOrderTransaction;
            }

            @SerializedName("takeProfitOrderFillTransaction") private OrderFillTransaction takeProfitOrderFillTransaction;

            /**
             * Get the takeProfitOrderFillTransaction
             * <p>
             * The Transaction created that immediately fills the Trade's new
             * Take Profit Order. Only provided if the new Take Profit Order
             * was immediately filled.
             * <p>
             * @return the takeProfitOrderFillTransaction
             * @see OrderFillTransaction
             */
            public OrderFillTransaction getTakeProfitOrderFillTransaction() {
                return this.takeProfitOrderFillTransaction;
            }

            @SerializedName("takeProfitOrderCreatedCancelTransaction") private OrderCancelTransaction takeProfitOrderCreatedCancelTransaction;

            /**
             * Get the takeProfitOrderCreatedCancelTransaction
             * <p>
             * The Transaction created that immediately cancels the Trade's new
             * Take Profit Order. Only provided if the new Take Profit Order
             * was immediately cancelled.
             * <p>
             * @return the takeProfitOrderCreatedCancelTransaction
             * @see OrderCancelTransaction
             */
            public OrderCancelTransaction getTakeProfitOrderCreatedCancelTransaction() {
                return this.takeProfitOrderCreatedCancelTransaction;
            }

            @SerializedName("stopLossOrderCancelTransaction") private OrderCancelTransaction stopLossOrderCancelTransaction;

            /**
             * Get the stopLossOrderCancelTransaction
             * <p>
             * The Transaction created that cancels the Trade's existing Stop
             * Loss Order.
             * <p>
             * @return the stopLossOrderCancelTransaction
             * @see OrderCancelTransaction
             */
            public OrderCancelTransaction getStopLossOrderCancelTransaction() {
                return this.stopLossOrderCancelTransaction;
            }

            @SerializedName("stopLossOrderTransaction") private StopLossOrderTransaction stopLossOrderTransaction;

            /**
             * Get the stopLossOrderTransaction
             * <p>
             * The Transaction created that creates a new Stop Loss Order for
             * the Trade.
             * <p>
             * @return the stopLossOrderTransaction
             * @see StopLossOrderTransaction
             */
            public StopLossOrderTransaction getStopLossOrderTransaction() {
                return this.stopLossOrderTransaction;
            }

            @SerializedName("stopLossOrderFillTransaction") private OrderFillTransaction stopLossOrderFillTransaction;

            /**
             * Get the stopLossOrderFillTransaction
             * <p>
             * The Transaction created that immediately fills the Trade's new
             * Stop Order. Only provided if the new Stop Loss Order was
             * immediately filled.
             * <p>
             * @return the stopLossOrderFillTransaction
             * @see OrderFillTransaction
             */
            public OrderFillTransaction getStopLossOrderFillTransaction() {
                return this.stopLossOrderFillTransaction;
            }

            @SerializedName("stopLossOrderCreatedCancelTransaction") private OrderCancelTransaction stopLossOrderCreatedCancelTransaction;

            /**
             * Get the stopLossOrderCreatedCancelTransaction
             * <p>
             * The Transaction created that immediately cancels the Trade's new
             * Stop Loss Order. Only provided if the new Stop Loss Order was
             * immediately cancelled.
             * <p>
             * @return the stopLossOrderCreatedCancelTransaction
             * @see OrderCancelTransaction
             */
            public OrderCancelTransaction getStopLossOrderCreatedCancelTransaction() {
                return this.stopLossOrderCreatedCancelTransaction;
            }

            @SerializedName("trailingStopLossOrderCancelTransaction") private OrderCancelTransaction trailingStopLossOrderCancelTransaction;

            /**
             * Get the trailingStopLossOrderCancelTransaction
             * <p>
             * The Transaction created that cancels the Trade's existing
             * Trailing Stop Loss Order.
             * <p>
             * @return the trailingStopLossOrderCancelTransaction
             * @see OrderCancelTransaction
             */
            public OrderCancelTransaction getTrailingStopLossOrderCancelTransaction() {
                return this.trailingStopLossOrderCancelTransaction;
            }

            @SerializedName("trailingStopLossOrderTransaction") private TrailingStopLossOrderTransaction trailingStopLossOrderTransaction;

            /**
             * Get the trailingStopLossOrderTransaction
             * <p>
             * The Transaction created that creates a new Trailing Stop Loss
             * Order for the Trade.
             * <p>
             * @return the trailingStopLossOrderTransaction
             * @see TrailingStopLossOrderTransaction
             */
            public TrailingStopLossOrderTransaction getTrailingStopLossOrderTransaction() {
                return this.trailingStopLossOrderTransaction;
            }

            @SerializedName("relatedTransactionIDs") private TransactionID[] relatedTransactionIDs;

            /**
             * Get the relatedTransactionIDs
             * <p>
             * The IDs of all Transactions that were created while satisfying
             * the request.
             * <p>
             * @return the relatedTransactionIDs
             * @see TransactionID
             */
            public TransactionID[] getRelatedTransactionIDs() {
                return this.relatedTransactionIDs;
            }

            @SerializedName("lastTransactionID") private TransactionID lastTransactionID;

            /**
             * Get the lastTransactionID
             * <p>
             * The ID of the most recent Transaction created for the Account
             * <p>
             * @return the lastTransactionID
             * @see TransactionID
             */
            public TransactionID getLastTransactionID() {
                return this.lastTransactionID;
            }
        }

        public class SetdependentordersRequest extends Request {
            private SetdependentordersRequest() {
                super("PUT",
                    "/v3/accounts/{accountID}/trades/{tradeSpecifier}/orders");
            }
            public SetdependentordersResponse execute() throws ClientProtocolException,
                    IOException,
                    SetdependentordersRequestException400,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                String bodystr = "";
                bodystr = gson.toJson(body);
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpPut httpreq = new HttpPut(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                httpreq.setEntity(new ByteArrayEntity(bodystr.getBytes("UTF-8")));
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else if (status == 400) {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0)
                        {
                            e = gson.fromJson(responsebody, SetdependentordersRequestException400.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, SetdependentordersResponse.class);
            }

            // Body Parameters
            private SetdependentordersRequestBody body = new SetdependentordersRequestBody();

            /**
             * Set the takeProfit
             * <p>
             * The specification of the Take Profit to create/modify/cancel. If
             * takeProfit is set to null, the Take Profit Order will be
             * cancelled if it exists. If takeProfit is not provided, the
             * exisiting Take Profit Order will not be modified. If a sub-field
             * of takeProfit is not specified, that field will be set to a
             * default value on create, and be inherited by the replacing order
             * on modify.
             * <p>
             * @param takeProfit the takeProfit
             * @return {@link SetdependentordersRequest
             * SetdependentordersRequest}
             * @see TakeProfitDetails
             */
            public SetdependentordersRequest takeProfit(TakeProfitDetails takeProfit)
            {
                body.takeProfit = takeProfit;
                return this;
            }

            /**
             * Set the stopLoss
             * <p>
             * The specification of the Stop Loss to create/modify/cancel. If
             * stopLoss is set to null, the Stop Loss Order will be cancelled
             * if it exists. If stopLoss is not provided, the exisiting Stop
             * Loss Order will not be modified. If a sub-field of stopLoss is
             * not specified, that field will be set to a default value on
             * create, and be inherited by the replacing order on modify.
             * <p>
             * @param stopLoss the stopLoss
             * @return {@link SetdependentordersRequest
             * SetdependentordersRequest}
             * @see StopLossDetails
             */
            public SetdependentordersRequest stopLoss(StopLossDetails stopLoss)
            {
                body.stopLoss = stopLoss;
                return this;
            }

            /**
             * Set the trailingStopLoss
             * <p>
             * The specification of the Trailing Stop Loss to
             * create/modify/cancel. If trailingStopLoss is set to null, the
             * Trailing Stop Loss Order will be cancelled if it exists. If
             * trailingStopLoss is not provided, the exisiting Trailing Stop
             * Loss Order will not be modified. If a sub-field of
             * trailngStopLoss is not specified, that field will be set to a
             * default value on create, and be inherited by the replacing order
             * on modify.
             * <p>
             * @param trailingStopLoss the trailingStopLoss
             * @return {@link SetdependentordersRequest
             * SetdependentordersRequest}
             * @see TrailingStopLossDetails
             */
            public SetdependentordersRequest trailingStopLoss(TrailingStopLossDetails trailingStopLoss)
            {
                body.trailingStopLoss = trailingStopLoss;
                return this;
            }
        }
    }

    public class PricingContext {
        /**
         * Current Account Prices
         * <p>
         * Get pricing information for a specified list of Instruments within
         * an Account.
         * <p>
         * @param accountID Account Identifier
         * @return {@link GetRequest GetRequest}
         * @see AccountID
         */
        public GetRequest get(String accountID)
        {
            GetRequest request = new GetRequest();
            request.set_path_param("accountID", accountID);
            return request;
        }

        /**
         * Pricing information has been successfully provided.
         */
        public class GetResponse {

            @SerializedName("prices") private Price[] prices;

            /**
             * Get the prices
             * <p>
             * The list of Price objects requested
             * <p>
             * @return the prices
             * @see Price
             */
            public Price[] getPrices() {
                return this.prices;
            }
        }

        public class GetRequest extends Request {
            private GetRequest() {
                super("GET",
                    "/v3/accounts/{accountID}/pricing");
            }
            public GetResponse execute() throws ClientProtocolException,
                    IOException,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                if (this.instruments != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "instruments=";
                    boolean first = true;
                    for (String itr : this.instruments) {
                        if (first) {
                            first = false;
                        } else {
                            queryparamstr += ",";
                        }
                        queryparamstr += itr;
                    }
                }
                if (this.since != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "since=";
                    queryparamstr += this.since;
                }
                if (this.includeUnitsAvailable != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "includeUnitsAvailable=";
                    queryparamstr += this.includeUnitsAvailable;
                }
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, GetResponse.class);
            }

            // Query Parameters

            private String[] instruments = null;

            /**
             * Set the instruments
             * <p>
             * List of Instruments to get pricing for.
             * <p>
             * @param instruments the instruments
             * @return {@link GetRequest GetRequest}
             * @see InstrumentName
             */
            public GetRequest instruments(String[] instruments)
            {
                this.instruments = instruments;
                return this;
            }

            // Query Parameters

            private String since = null;

            /**
             * Set the since
             * <p>
             * Date/Time filter to apply to the returned prices. Only prices
             * with a time later than this filter will be provided.
             * <p>
             * @param since the since
             * @return {@link GetRequest GetRequest}
             * @see DateTime
             */
            public GetRequest since(String since)
            {
                this.since = since;
                return this;
            }

            // Query Parameters

            private Boolean includeUnitsAvailable = null;

            /**
             * Set the includeUnitsAvailable
             * <p>
             * Flag that enables the inclusion of the unitsAvailable field in
             * the returned Price objects.
             * <p>
             * @param includeUnitsAvailable the includeUnitsAvailable
             * @return {@link GetRequest GetRequest}
             */
            public GetRequest includeUnitsAvailable(Boolean includeUnitsAvailable)
            {
                this.includeUnitsAvailable = includeUnitsAvailable;
                return this;
            }

        }
    }

    public class InstrumentContext {
        /**
         * Get Candlesticks
         * <p>
         * Fetch candlestick data for an instrument.
         * <p>
         * @param instrument Name of the Instrument
         * @return {@link CandlesRequest CandlesRequest}
         * @see InstrumentName
         */
        public CandlesRequest candles(String instrument)
        {
            CandlesRequest request = new CandlesRequest();
            request.set_path_param("instrument", instrument);
            return request;
        }

        /**
         * Pricing information has been successfully provided.
         */
        public class CandlesResponse {

            @SerializedName("instrument") private InstrumentName instrument;

            /**
             * Get the instrument
             * <p>
             * The instrument whose Prices are represented by the candlesticks.
             * <p>
             * @return the instrument
             * @see InstrumentName
             */
            public InstrumentName getInstrument() {
                return this.instrument;
            }

            @SerializedName("granularity") private CandlestickGranularity granularity;

            /**
             * Get the granularity
             * <p>
             * The granularity of the candlesticks provided.
             * <p>
             * @return the granularity
             * @see CandlestickGranularity
             */
            public CandlestickGranularity getGranularity() {
                return this.granularity;
            }

            @SerializedName("candles") private Candlestick[] candles;

            /**
             * Get the candles
             * <p>
             * The list of candlesticks that satisfy the request.
             * <p>
             * @return the candles
             * @see Candlestick
             */
            public Candlestick[] getCandles() {
                return this.candles;
            }
        }

        public class CandlesRequest extends Request {
            private CandlesRequest() {
                super("GET",
                    "/v3/instruments/{instrument}/candles");
            }
            public CandlesResponse execute() throws ClientProtocolException,
                    IOException,
                    RequestException {
                String queryparamstr = "";
                // Query Parameters
                if (this.price != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "price=";
                    queryparamstr += this.price;
                }
                if (this.granularity != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "granularity=";
                    queryparamstr += this.granularity;
                }
                if (this.count != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "count=";
                    queryparamstr += this.count;
                }
                if (this.from != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "from=";
                    queryparamstr += this.from;
                }
                if (this.to != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "to=";
                    queryparamstr += this.to;
                }
                if (this.smooth != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "smooth=";
                    queryparamstr += this.smooth;
                }
                if (this.includeFirst != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "includeFirst=";
                    queryparamstr += this.includeFirst;
                }
                if (this.dailyAlignment != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "dailyAlignment=";
                    queryparamstr += this.dailyAlignment;
                }
                if (this.alignmentTimezone != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "alignmentTimezone=";
                    queryparamstr += this.alignmentTimezone;
                }
                if (this.weeklyAlignment != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "weeklyAlignment=";
                    queryparamstr += this.weeklyAlignment;
                }
                String pathandquery = this.path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(uri + pathandquery);
                httpreq.addHeader("Authorization","Bearer " + token);
                httpreq.addHeader("Content-Type", "application/json");
                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                        e.errorCode = String.valueOf(status);
                        e.errorMessage = response.getStatusLine().getReasonPhrase();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        if (responsebody.length() != 0) {
                            e = gson.fromJson(responsebody, RequestException.class);
                        }
                        else
                        {
                            e = new RequestException();
                            e.errorCode = String.valueOf(status);
                            e.errorMessage = response.getStatusLine().getReasonPhrase();
                        }
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, CandlesResponse.class);
            }

            // Query Parameters

            private String price = null;

            /**
             * Set the price
             * <p>
             * The Price component(s) to get candlestick data for. Can contain
             * any combination of the characters "M" (midpoint candles) "B"
             * (bid candles) and "A" (ask candles).
             * <p>
             * @param price the price
             * @return {@link CandlesRequest CandlesRequest}
             */
            public CandlesRequest price(String price)
            {
                this.price = price;
                return this;
            }

            // Query Parameters

            private CandlestickGranularity granularity = null;

            /**
             * Set the granularity
             * <p>
             * The granularity of the candlesticks to fetch
             * <p>
             * @param granularity the granularity
             * @return {@link CandlesRequest CandlesRequest}
             * @see CandlestickGranularity
             */
            public CandlesRequest granularity(CandlestickGranularity granularity)
            {
                this.granularity = granularity;
                return this;
            }

            // Query Parameters

            private Integer count = null;

            /**
             * Set the count
             * <p>
             * The number of candlesticks to return in the reponse. Count
             * should not be specified if both the start and end parameters are
             * provided, as the time range combined with the graularity will
             * determine the number of candlesticks to return.
             * <p>
             * @param count the count
             * @return {@link CandlesRequest CandlesRequest}
             */
            public CandlesRequest count(Integer count)
            {
                this.count = count;
                return this;
            }

            // Query Parameters

            private String from = null;

            /**
             * Set the from
             * <p>
             * The start of the time range to fetch candlesticks for.
             * <p>
             * @param from the from
             * @return {@link CandlesRequest CandlesRequest}
             * @see DateTime
             */
            public CandlesRequest fromTime(String from)
            {
                this.from = from;
                return this;
            }

            // Query Parameters

            private String to = null;

            /**
             * Set the to
             * <p>
             * The end of the time range to fetch candlesticks for.
             * <p>
             * @param to the to
             * @return {@link CandlesRequest CandlesRequest}
             * @see DateTime
             */
            public CandlesRequest toTime(String to)
            {
                this.to = to;
                return this;
            }

            // Query Parameters

            private Boolean smooth = null;

            /**
             * Set the smooth
             * <p>
             * A flag that controls whether the candlestick is "smoothed" or
             * not.  A smoothed candlestick uses the previous candle's close
             * price as its open price, while an unsmoothed candlestick uses
             * the first price from its time range as its open price.
             * <p>
             * @param smooth the smooth
             * @return {@link CandlesRequest CandlesRequest}
             */
            public CandlesRequest smooth(Boolean smooth)
            {
                this.smooth = smooth;
                return this;
            }

            // Query Parameters

            private Boolean includeFirst = null;

            /**
             * Set the includeFirst
             * <p>
             * A flag that controls whether the candlestick that is covered by
             * the from time should be included in the results. This flag
             * enables clients to use the timestamp of the last completed
             * candlestick received to poll for future candlesticks but avoid
             * receiving the previous candlestick repeatedly.
             * <p>
             * @param includeFirst the includeFirst
             * @return {@link CandlesRequest CandlesRequest}
             */
            public CandlesRequest includeFirst(Boolean includeFirst)
            {
                this.includeFirst = includeFirst;
                return this;
            }

            // Query Parameters

            private Integer dailyAlignment = null;

            /**
             * Set the dailyAlignment
             * <p>
             * The hour of the day (in the specified timezone) to use for
             * granularities that have daily alignments.
             * <p>
             * @param dailyAlignment the dailyAlignment
             * @return {@link CandlesRequest CandlesRequest}
             */
            public CandlesRequest dailyAlignment(Integer dailyAlignment)
            {
                this.dailyAlignment = dailyAlignment;
                return this;
            }

            // Query Parameters

            private String alignmentTimezone = null;

            /**
             * Set the alignmentTimezone
             * <p>
             * The timezone to use for the dailyAlignment parameter.
             * Candlesticks with daily alignment will be aligned to the
             * dailyAlignment hour within the alignmentTimezone.
             * <p>
             * @param alignmentTimezone the alignmentTimezone
             * @return {@link CandlesRequest CandlesRequest}
             */
            public CandlesRequest alignmentTimezone(String alignmentTimezone)
            {
                this.alignmentTimezone = alignmentTimezone;
                return this;
            }

            // Query Parameters

            private WeeklyAlignment weeklyAlignment = null;

            /**
             * Set the weeklyAlignment
             * <p>
             * The day of the week used for granularities that have weekly
             * alignment.
             * <p>
             * @param weeklyAlignment the weeklyAlignment
             * @return {@link CandlesRequest CandlesRequest}
             * @see WeeklyAlignment
             */
            public CandlesRequest weeklyAlignment(WeeklyAlignment weeklyAlignment)
            {
                this.weeklyAlignment = weeklyAlignment;
                return this;
            }

        }
    }

    private abstract class Request {
        @SuppressWarnings("unused")
        protected String method;
        protected String path;
        private Request (String method, String path) {
            this.method = method;
            this.path = path;
        }

        protected void set_path_param(String key, String value) {
            String keyname = '{' + key + '}';
            if (!this.path.contains(keyname))
                throw new RuntimeException("No key " + keyname + " found in path '" + this.path + "'");
            this.path = this.path.replace(keyname, value);
        }
    }

    @SuppressWarnings("serial")
    public class RequestException extends Exception {
        protected RequestException() { }

        protected int status;
        protected String errorCode;
        protected String errorMessage;

        public int getStatus() {
            return status;
        }

        public String getErrorCode() {
            return errorCode;
        }

        public String getErrorMessage() {
            return errorMessage;
        }

        public String toString() {
            String str = "";
            str += status;
            str += " : ";
            str += errorCode;
            str += " : ";
            str += errorMessage;
            return str;
        }
    }
}
