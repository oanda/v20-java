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

public class Context {
    public AccountContext account;
    public UserContext user;
    public PositionContext position;
    public TransactionContext transaction;
    public TradeContext trade;
    public PricingContext pricing;
    public OrderContext order;
    public InstrumentContext instrument;

    private Gson gson;
    CloseableHttpClient httpclient = HttpClients.createDefault();
    private String _uri;
    private String _token;

    public Context(String uri, String token) {
        _uri = uri;
        _token = token;
        gson = new GsonBuilder()
        .setPrettyPrinting()
        .registerTypeAdapter(Order.class, new OrderAdapter())
        .registerTypeAdapter(Transaction.class, new TransactionAdapter())
        .create();

        account = new AccountContext();
        user = new UserContext();
        position = new PositionContext();
        transaction = new TransactionContext();
        trade = new TradeContext();
        pricing = new PricingContext();
        order = new OrderContext();
        instrument = new InstrumentContext();
    }

    public class AccountContext {
        /**
        * Get a list of all Accounts authorized for the provided token.
        *
        *
        * @return {@link ListResponse ListResponse}
        */

        public ListRequest list()
        {
            
            ListRequest request = new ListRequest();
            // Path Parameters
            return request;
        }

        /**
        * The list of authorized Accounts has been provided.
        */

        public class ListResponse {
            private AccountProperties[] accounts;
            public AccountProperties[] get_accounts() {
                return accounts;
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
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, ListResponse.class);
            }
            // Query Parameters
        }
        /**
        * Get the full details for a single Account that a client has access
        * to. Full pending Order, open Trade and open Position representations
        * are provided.
        *
        * @param accountID Account Identifier
        *
        * @return {@link GetResponse GetResponse}
        */

        public GetRequest get(String accountID)
        {
            
            GetRequest request = new GetRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            return request;
        }

        /**
        * The full Account details are provided
        */

        public class GetResponse {
            private Account account;
            public Account get_account() {
                return account;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
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
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, GetResponse.class);
            }
            // Query Parameters
        }
        /**
        * Get a summary for a single Account that a client has access to.
        *
        * @param accountID Account Identifier
        *
        * @return {@link SummaryResponse SummaryResponse}
        */

        public SummaryRequest summary(String accountID)
        {
            
            SummaryRequest request = new SummaryRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            return request;
        }

        /**
        * The Account summary  are provided
        */

        public class SummaryResponse {
            private AccountSummary account;
            public AccountSummary get_account() {
                return account;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
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
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, SummaryResponse.class);
            }
            // Query Parameters
        }
        /**
        * Get the list of tradeable instruments for the given Account. The list
        * of tradeable instruments is dependent on the regulatory division that
        * the Account is located in, thus should be the same for all Accounts
        * owned by a single user.
        *
        * @param accountID Account Identifier
        * @param instruments List of instruments to query specifically.
        *
        * @return {@link InstrumentsResponse InstrumentsResponse}
        */

        public InstrumentsRequest instruments(String accountID)
        {
            
            InstrumentsRequest request = new InstrumentsRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            return request;
        }

        /**
        * The list of tradeable instruments for the Account has been provided.
        */

        public class InstrumentsResponse {
            private Instrument[] instruments;
            public Instrument[] get_instruments() {
                return instruments;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
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
                if (_instruments != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "instruments=";
                    boolean first = true;
                    for (String itr : _instruments) {
                        if (first) {
                            first = false;
                        } else {
                            queryparamstr += ",";
                        }
                        queryparamstr += itr;
                    }
                }
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, InstrumentsResponse.class);
            }
            // Query Parameters
            private String[] _instruments = null;
            public InstrumentsRequest instruments(String[] instruments)
            {
                _instruments = instruments;
                return this;
            }
        }
        /**
        * Set the client-configurable portions of an Account.
        *
        * @param accountID Account Identifier
        * @param alias Client-defined alias (name) for the Account
        * @param marginRate The string representation of a decimal number.
        *
        * @return {@link ConfigureResponse ConfigureResponse}
        */

        public ConfigureRequest configure(String accountID)
        {
            
            ConfigureRequest request = new ConfigureRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            return request;
        }

        private class ConfigureRequestBody {
                @SuppressWarnings("unused")
                private String alias;
                @SuppressWarnings("unused")
                private DecimalNumber marginRate;
        }

        /**
        * The configuration operation was forbidden on the Account.
        */

        @SuppressWarnings("serial")
        public class ConfigureRequestException403 extends RequestException {
            private ClientConfigureRejectTransaction clientConfigureRejectTransaction;
            public ClientConfigureRejectTransaction get_clientConfigureRejectTransaction() {
                return clientConfigureRejectTransaction;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }
        /**
        * The configuration specification was invalid.
        */

        @SuppressWarnings("serial")
        public class ConfigureRequestException400 extends RequestException {
            private ClientConfigureRejectTransaction clientConfigureRejectTransaction;
            public ClientConfigureRejectTransaction get_clientConfigureRejectTransaction() {
                return clientConfigureRejectTransaction;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }
        /**
        * The Account was configured successfully.
        */

        public class ConfigureResponse {
            private ClientConfigureTransaction clientConfigureTransaction;
            public ClientConfigureTransaction get_clientConfigureTransaction() {
                return clientConfigureTransaction;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
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
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpPatch httpreq = new HttpPatch(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");
                httpreq.setEntity(new ByteArrayEntity(bodystr.getBytes("UTF-8")));

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else if (status == 403) {
                        String responsebody = EntityUtils.toString(entity);
                        // System.out.println(responsebody);
                        e = gson.fromJson(responsebody, ConfigureRequestException403.class);
                    } else if (status == 400) {
                        String responsebody = EntityUtils.toString(entity);
                        // System.out.println(responsebody);
                        e = gson.fromJson(responsebody, ConfigureRequestException400.class);
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, ConfigureResponse.class);
            }
            // Query Parameters
            // Body Parameters
            ConfigureRequestBody body = new ConfigureRequestBody();
            public ConfigureRequest alias(String alias)
            {
                body.alias = alias;
                return this;
            }
            public ConfigureRequest marginRate(double marginRate)
            {
                body.marginRate = new DecimalNumber(marginRate);
                return this;
            }
        }
        /**
        * Endpoint used to poll an Account for its current state and changes
        * since a specified TransactionID.
        *
        * @param accountID Account Identifier
        * @param sinceTransactionID ID of the Transaction to get Account changes since.
        *
        * @return {@link ChangesResponse ChangesResponse}
        */

        public ChangesRequest changes(String accountID)
        {
            
            ChangesRequest request = new ChangesRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            return request;
        }

        /**
        * The Account state and changes are provided.
        */

        public class ChangesResponse {
            private AccountChanges changes;
            public AccountChanges get_changes() {
                return changes;
            }
            private AccountChangesState state;
            public AccountChangesState get_state() {
                return state;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
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
                if (_sinceTransactionID != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "sinceTransactionID=";
                    queryparamstr += _sinceTransactionID;
                }
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, ChangesResponse.class);
            }
            // Query Parameters
            private String _sinceTransactionID = null;
            public ChangesRequest sinceTransactionID(String sinceTransactionID)
            {
                _sinceTransactionID = sinceTransactionID;
                return this;
            }
        }
    }
    public class UserContext {
        /**
        * Fetch the user information for the specified user. This endpoint is
        * intended to be used by the user themself to obtain their own
        * information.
        *
        * @param userSpecifier The User Specifier
        *
        * @return {@link GetinfoResponse GetinfoResponse}
        */

        public GetinfoRequest getInfo(String userSpecifier)
        {
            
            GetinfoRequest request = new GetinfoRequest();
            // Path Parameters
            request.set_path_param("userSpecifier",
                    userSpecifier);
            return request;
        }

        /**
        * The user information has been provided
        */

        public class GetinfoResponse {
            private UserInfo userInfo;
            public UserInfo get_userInfo() {
                return userInfo;
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
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, GetinfoResponse.class);
            }
            // Query Parameters
        }
        /**
        * Fetch the externally-available user information for the specified
        * user. This endpoint is intended to be used by 3rd parties that have
        * been authorized by a user to view their personal information.
        *
        * @param userSpecifier The User Specifier
        *
        * @return {@link GetexternalinfoResponse GetexternalinfoResponse}
        */

        public GetexternalinfoRequest getExternalInfo(String userSpecifier)
        {
            
            GetexternalinfoRequest request = new GetexternalinfoRequest();
            // Path Parameters
            request.set_path_param("userSpecifier",
                    userSpecifier);
            return request;
        }

        /**
        * The external user information has been provided
        */

        public class GetexternalinfoResponse {
            private UserInfoExternal userInfo;
            public UserInfoExternal get_userInfo() {
                return userInfo;
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
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, GetexternalinfoResponse.class);
            }
            // Query Parameters
        }
    }
    public class PositionContext {
        /**
        * List all Positions for an Account. The Positions returned are for
        * every instrument that has had a position during the lifetime of an
        * the Account.
        *
        * @param accountID Account Identifier
        *
        * @return {@link ListResponse ListResponse}
        */

        public ListRequest list(String accountID)
        {
            
            ListRequest request = new ListRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            return request;
        }

        /**
        * The Account's Positions are provided.
        */

        public class ListResponse {
            private Position[] positions;
            public Position[] get_positions() {
                return positions;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
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
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, ListResponse.class);
            }
            // Query Parameters
        }
        /**
        * List all open Positions for an Account. An open Position is a
        * Position in an Account that currently has a Trade opened for it.
        *
        * @param accountID Account Identifier
        *
        * @return {@link ListopenResponse ListopenResponse}
        */

        public ListopenRequest listOpen(String accountID)
        {
            
            ListopenRequest request = new ListopenRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            return request;
        }

        /**
        * The Account's open Positions are provided.
        */

        public class ListopenResponse {
            private Position[] positions;
            public Position[] get_positions() {
                return positions;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
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
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, ListopenResponse.class);
            }
            // Query Parameters
        }
        /**
        * Get the details of a single Instrument's Position in an Account. The
        * Position may by open or not.
        *
        * @param accountID Account Identifier
        * @param instrument Name of the Instrument
        *
        * @return {@link GetResponse GetResponse}
        */

        public GetRequest get(String accountID, String instrument)
        {
            
            GetRequest request = new GetRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            request.set_path_param("instrument",
                    instrument);
            return request;
        }

        /**
        * The Position is provided.
        */

        public class GetResponse {
            private Position position;
            public Position get_position() {
                return position;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
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
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, GetResponse.class);
            }
            // Query Parameters
        }
        /**
        * Closeout the open Position for a specific instrument in an Account.
        *
        * @param accountID Account Identifier
        * @param instrument Name of the Instrument
        * @param longUnits Indication of how much of the long Position to closeout. Either the string
        *        "ALL", the string "NONE", or a DecimalNumber representing how
        *        many units of the long position to close using a
        *        PositionCloseout MarketOrder. The units specified must always
        *        be positive.
        * @param longClientExtensions The client extensions to add to the MarketOrder used to close the long
        *        position.
        * @param shortUnits Indication of how much of the short Position to closeout. Either the string
        *        "ALL", the string "NONE", or a DecimalNumber representing how
        *        many units of the short position to close using a
        *        PositionCloseout MarketOrder. The units specified must always
        *        be positive.
        * @param shortClientExtensions The client extensions to add to the MarketOrder used to close the short
        *        position.
        *
        * @return {@link CloseResponse CloseResponse}
        */

        public CloseRequest close(String accountID, String instrument)
        {
            
            CloseRequest request = new CloseRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            request.set_path_param("instrument",
                    instrument);
            return request;
        }

        private class CloseRequestBody {
                @SuppressWarnings("unused")
                private String longUnits;
                @SuppressWarnings("unused")
                private ClientExtensions longClientExtensions;
                @SuppressWarnings("unused")
                private String shortUnits;
                @SuppressWarnings("unused")
                private ClientExtensions shortClientExtensions;
        }

        /**
        * The Account or one or more of the Positions specified does not exist.
        */

        @SuppressWarnings("serial")
        public class CloseRequestException404 extends RequestException {
            private MarketOrderRejectTransaction longOrderRejectTransaction;
            public MarketOrderRejectTransaction get_longOrderRejectTransaction() {
                return longOrderRejectTransaction;
            }
            private MarketOrderRejectTransaction shortOrderRejectTransaction;
            public MarketOrderRejectTransaction get_shortOrderRejectTransaction() {
                return shortOrderRejectTransaction;
            }
            private TransactionID[] relatedTransactionIDs;
            public TransactionID[] get_relatedTransactionIDs() {
                return relatedTransactionIDs;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
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
            private MarketOrderRejectTransaction longOrderRejectTransaction;
            public MarketOrderRejectTransaction get_longOrderRejectTransaction() {
                return longOrderRejectTransaction;
            }
            private MarketOrderRejectTransaction shortOrderRejectTransaction;
            public MarketOrderRejectTransaction get_shortOrderRejectTransaction() {
                return shortOrderRejectTransaction;
            }
            private TransactionID[] relatedTransactionIDs;
            public TransactionID[] get_relatedTransactionIDs() {
                return relatedTransactionIDs;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }
        /**
        * The Position closeout request has been successfully processed.
        */

        public class CloseResponse {
            private MarketOrderTransaction longOrderCreateTransaction;
            public MarketOrderTransaction get_longOrderCreateTransaction() {
                return longOrderCreateTransaction;
            }
            private OrderFillTransaction longOrderFillTransaction;
            public OrderFillTransaction get_longOrderFillTransaction() {
                return longOrderFillTransaction;
            }
            private OrderCancelTransaction longOrderCancelTransaction;
            public OrderCancelTransaction get_longOrderCancelTransaction() {
                return longOrderCancelTransaction;
            }
            private MarketOrderTransaction shortOrderCreateTransaction;
            public MarketOrderTransaction get_shortOrderCreateTransaction() {
                return shortOrderCreateTransaction;
            }
            private OrderFillTransaction shortOrderFillTransaction;
            public OrderFillTransaction get_shortOrderFillTransaction() {
                return shortOrderFillTransaction;
            }
            private OrderCancelTransaction shortOrderCancelTransaction;
            public OrderCancelTransaction get_shortOrderCancelTransaction() {
                return shortOrderCancelTransaction;
            }
            private TransactionID[] relatedTransactionIDs;
            public TransactionID[] get_relatedTransactionIDs() {
                return relatedTransactionIDs;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
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
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpPut httpreq = new HttpPut(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");
                httpreq.setEntity(new ByteArrayEntity(bodystr.getBytes("UTF-8")));

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else if (status == 404) {
                        String responsebody = EntityUtils.toString(entity);
                        // System.out.println(responsebody);
                        e = gson.fromJson(responsebody, CloseRequestException404.class);
                    } else if (status == 400) {
                        String responsebody = EntityUtils.toString(entity);
                        // System.out.println(responsebody);
                        e = gson.fromJson(responsebody, CloseRequestException400.class);
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, CloseResponse.class);
            }
            // Query Parameters
            // Body Parameters
            CloseRequestBody body = new CloseRequestBody();
            public CloseRequest longUnits(String longUnits)
            {
                body.longUnits = longUnits;
                return this;
            }
            public CloseRequest longClientExtensions(ClientExtensions longClientExtensions)
            {
                body.longClientExtensions = longClientExtensions;
                return this;
            }
            public CloseRequest shortUnits(String shortUnits)
            {
                body.shortUnits = shortUnits;
                return this;
            }
            public CloseRequest shortClientExtensions(ClientExtensions shortClientExtensions)
            {
                body.shortClientExtensions = shortClientExtensions;
                return this;
            }
        }
    }
    public class TransactionContext {
        /**
        * Get a list of Transactions pages that satisfy a time-based
        * Transaction query.
        *
        * @param accountID Account Identifier
        * @param fromTime The starting time (inclusive) of the time range for the Transactions being
        *        queried.
        * @param toTime The ending time (inclusive) of the time range for the Transactions being
        *        queried.
        * @param pageSize The number of Transactions to include in each page of the results.
        * @param type A filter for restricting the types of Transactions to retreive.
        *
        * @return {@link ListResponse ListResponse}
        */

        public ListRequest list(String accountID)
        {
            
            ListRequest request = new ListRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            return request;
        }

        /**
        * The requested time range of Transaction pages are provided.
        */

        public class ListResponse {
            private DateTime from;
            public DateTime get_from() {
                return from;
            }
            private DateTime to;
            public DateTime get_to() {
                return to;
            }
            private Integer pageSize;
            public Integer get_pageSize() {
                return pageSize;
            }
            private TransactionFilter[] type;
            public TransactionFilter[] get_type() {
                return type;
            }
            private Integer count;
            public Integer get_count() {
                return count;
            }
            private String[] pages;
            public String[] get_pages() {
                return pages;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
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
                if (_from != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "from=";
                    queryparamstr += _from;
                }
                if (_to != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "to=";
                    queryparamstr += _to;
                }
                if (_pageSize != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "pageSize=";
                    queryparamstr += _pageSize;
                }
                if (_type != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "type=";
                    boolean first = true;
                    for (String itr : _type) {
                        if (first) {
                            first = false;
                        } else {
                            queryparamstr += ",";
                        }
                        queryparamstr += itr;
                    }
                }
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, ListResponse.class);
            }
            // Query Parameters
            private String _from = null;
            public ListRequest fromTime(String from)
            {
                _from = from;
                return this;
            }
            private String _to = null;
            public ListRequest toTime(String to)
            {
                _to = to;
                return this;
            }
            private Integer _pageSize = null;
            public ListRequest pageSize(Integer pageSize)
            {
                _pageSize = pageSize;
                return this;
            }
            private String[] _type = null;
            public ListRequest type(String[] type)
            {
                _type = type;
                return this;
            }
        }
        /**
        * Get the details of a single Account Transaction.
        *
        * @param accountID Account Identifier
        * @param transactionID A Transaction ID
        *
        * @return {@link GetResponse GetResponse}
        */

        public GetRequest get(String accountID, String transactionID)
        {
            
            GetRequest request = new GetRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            request.set_path_param("transactionID",
                    transactionID);
            return request;
        }

        /**
        * The details of the requested Transaction are provided.
        */

        public class GetResponse {
            private Transaction transaction;
            public Transaction get_transaction() {
                return transaction;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
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
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, GetResponse.class);
            }
            // Query Parameters
        }
        /**
        * Get a range of Transactions for an Account based on the Transaction
        * IDs.
        *
        * @param accountID Account Identifier
        * @param fromID The starting Transacion ID (inclusive) to fetch.
        * @param toID The ending Transaction ID (inclusive) to fetch.
        * @param type The filter that restricts the types of Transactions to retreive.
        *
        * @return {@link RangeResponse RangeResponse}
        */

        public RangeRequest range(String accountID)
        {
            
            RangeRequest request = new RangeRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            return request;
        }

        /**
        * The requested time range of Transactions are provided.
        */

        public class RangeResponse {
            private Transaction[] transactions;
            public Transaction[] get_transactions() {
                return transactions;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
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
                if (_from != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "from=";
                    queryparamstr += _from;
                }
                if (_to != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "to=";
                    queryparamstr += _to;
                }
                if (_type != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "type=";
                    boolean first = true;
                    for (String itr : _type) {
                        if (first) {
                            first = false;
                        } else {
                            queryparamstr += ",";
                        }
                        queryparamstr += itr;
                    }
                }
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, RangeResponse.class);
            }
            // Query Parameters
            private String _from = null;
            public RangeRequest fromID(String from)
            {
                _from = from;
                return this;
            }
            private String _to = null;
            public RangeRequest toID(String to)
            {
                _to = to;
                return this;
            }
            private String[] _type = null;
            public RangeRequest type(String[] type)
            {
                _type = type;
                return this;
            }
        }
        /**
        * Get a range of Transactions for an Account starting at (but not
        * including) a provided Transaction ID.
        *
        * @param accountID Account Identifier
        * @param id The ID of the last Transacion fetched. This query will return all Transactions
        *        newer than the TransactionID.
        *
        * @return {@link SinceResponse SinceResponse}
        */

        public SinceRequest since(String accountID)
        {
            
            SinceRequest request = new SinceRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            return request;
        }

        /**
        * The requested time range of Transactions are provided.
        */

        public class SinceResponse {
            private Transaction[] transactions;
            public Transaction[] get_transactions() {
                return transactions;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
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
                if (_id != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "id=";
                    queryparamstr += _id;
                }
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, SinceResponse.class);
            }
            // Query Parameters
            private String _id = null;
            public SinceRequest id(String id)
            {
                _id = id;
                return this;
            }
        }
    }
    public class TradeContext {
        /**
        * Get a list of Trades for an Account
        *
        * @param accountID Account Identifier
        * @param ids List of Trade IDs to retrieve.
        * @param state The state to filter the requested Trades by.
        * @param instrument The instrument to filter the requested Trades by.
        * @param count The maximum number of Trades to return.
        * @param beforeID The maximum Trade ID to return. If not provided the most recent Trades in the
        *        Account are returned.
        *
        * @return {@link ListResponse ListResponse}
        */

        public ListRequest list(String accountID)
        {
            
            ListRequest request = new ListRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            return request;
        }

        /**
        * The list of Trades requested
        */

        public class ListResponse {
            private Trade[] trades;
            public Trade[] get_trades() {
                return trades;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
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
                if (_ids != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "ids=";
                    boolean first = true;
                    for (String itr : _ids) {
                        if (first) {
                            first = false;
                        } else {
                            queryparamstr += ",";
                        }
                        queryparamstr += itr;
                    }
                }
                if (_state != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "state=";
                    queryparamstr += _state;
                }
                if (_instrument != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "instrument=";
                    queryparamstr += _instrument;
                }
                if (_count != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "count=";
                    queryparamstr += _count;
                }
                if (_beforeID != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "beforeID=";
                    queryparamstr += _beforeID;
                }
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, ListResponse.class);
            }
            // Query Parameters
            private String[] _ids = null;
            public ListRequest ids(String[] ids)
            {
                _ids = ids;
                return this;
            }
            private String _state = null;
            public ListRequest state(String state)
            {
                _state = state;
                return this;
            }
            private String _instrument = null;
            public ListRequest instrument(String instrument)
            {
                _instrument = instrument;
                return this;
            }
            private Integer _count = null;
            public ListRequest count(Integer count)
            {
                _count = count;
                return this;
            }
            private String _beforeID = null;
            public ListRequest beforeID(String beforeID)
            {
                _beforeID = beforeID;
                return this;
            }
        }
        /**
        * Get the list of open Trades for an Account
        *
        * @param accountID Account Identifier
        *
        * @return {@link ListopenResponse ListopenResponse}
        */

        public ListopenRequest listOpen(String accountID)
        {
            
            ListopenRequest request = new ListopenRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            return request;
        }

        /**
        * The Account's list of open Trades is provided
        */

        public class ListopenResponse {
            private Trade[] trades;
            public Trade[] get_trades() {
                return trades;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
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
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, ListopenResponse.class);
            }
            // Query Parameters
        }
        /**
        * Get the details of a specific Trade in an Account
        *
        * @param accountID Account Identifier
        * @param tradeSpecifier Specifier for the Trade
        *
        * @return {@link GetResponse GetResponse}
        */

        public GetRequest get(String accountID, String tradeSpecifier)
        {
            
            GetRequest request = new GetRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            request.set_path_param("tradeSpecifier",
                    tradeSpecifier);
            return request;
        }

        /**
        * The details for the requested Trade is provided
        */

        public class GetResponse {
            private Trade trade;
            public Trade get_trade() {
                return trade;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
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
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, GetResponse.class);
            }
            // Query Parameters
        }
        /**
        * Close (partially or fully) a specific open Trade in an Account
        *
        * @param accountID Account Identifier
        * @param tradeSpecifier Specifier for the Trade
        * @param units Indication of how much of the Trade to close. Either the string "ALL"
        *        (indicating that all of the Trade should be closed), or a
        *        DecimalNumber representing the number of units of the open
        *        Trade to Close using a TradeClose MarketOrder. The units
        *        specified must always be positive, and the magnitude of the
        *        value cannot exceed the magnitude of the Trade's open units.
        *
        * @return {@link CloseResponse CloseResponse}
        */

        public CloseRequest close(String accountID, String tradeSpecifier)
        {
            
            CloseRequest request = new CloseRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            request.set_path_param("tradeSpecifier",
                    tradeSpecifier);
            return request;
        }

        private class CloseRequestBody {
                @SuppressWarnings("unused")
                private String units;
        }

        /**
        * The Account or Trade specified does not exist.
        */

        @SuppressWarnings("serial")
        public class CloseRequestException404 extends RequestException {
            private MarketOrderRejectTransaction orderRejectTransaction;
            public MarketOrderRejectTransaction get_orderRejectTransaction() {
                return orderRejectTransaction;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
            }
            private TransactionID[] relatedTransactionIDs;
            public TransactionID[] get_relatedTransactionIDs() {
                return relatedTransactionIDs;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }
        /**
        * The Trade cannot be closed as requested.
        */

        @SuppressWarnings("serial")
        public class CloseRequestException400 extends RequestException {
            private MarketOrderRejectTransaction orderRejectTransaction;
            public MarketOrderRejectTransaction get_orderRejectTransaction() {
                return orderRejectTransaction;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }
        /**
        * The Trade has been closed as requested
        */

        public class CloseResponse {
            private MarketOrderTransaction orderCreateTransaction;
            public MarketOrderTransaction get_orderCreateTransaction() {
                return orderCreateTransaction;
            }
            private OrderFillTransaction orderFillTransaction;
            public OrderFillTransaction get_orderFillTransaction() {
                return orderFillTransaction;
            }
            private OrderCancelTransaction orderCancelTransaction;
            public OrderCancelTransaction get_orderCancelTransaction() {
                return orderCancelTransaction;
            }
            private TransactionID[] relatedTransactionIDs;
            public TransactionID[] get_relatedTransactionIDs() {
                return relatedTransactionIDs;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
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
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpPut httpreq = new HttpPut(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");
                httpreq.setEntity(new ByteArrayEntity(bodystr.getBytes("UTF-8")));

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else if (status == 404) {
                        String responsebody = EntityUtils.toString(entity);
                        // System.out.println(responsebody);
                        e = gson.fromJson(responsebody, CloseRequestException404.class);
                    } else if (status == 400) {
                        String responsebody = EntityUtils.toString(entity);
                        // System.out.println(responsebody);
                        e = gson.fromJson(responsebody, CloseRequestException400.class);
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, CloseResponse.class);
            }
            // Query Parameters
            // Body Parameters
            CloseRequestBody body = new CloseRequestBody();
            public CloseRequest units(String units)
            {
                body.units = units;
                return this;
            }
        }
        /**
        * Update the Client Extensions for a Trade. Do not add, update, or
        * delete the Client Extensions if your account is associated with MT4.
        *
        * @param accountID Account Identifier
        * @param tradeSpecifier Specifier for the Trade
        * @param clientExtensions The Client Extensions to update the Trade with. Do not add, update, or delete
        *        the Client Extensions if your account is associated with MT4.
        *
        * @return {@link SetclientextensionsResponse SetclientextensionsResponse}
        */

        public SetclientextensionsRequest setClientExtensions(String accountID, String tradeSpecifier)
        {
            
            SetclientextensionsRequest request = new SetclientextensionsRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            request.set_path_param("tradeSpecifier",
                    tradeSpecifier);
            return request;
        }

        private class SetclientextensionsRequestBody {
                @SuppressWarnings("unused")
                private ClientExtensions clientExtensions;
        }

        /**
        * The Account or Trade specified does not exist.
        */

        @SuppressWarnings("serial")
        public class SetclientextensionsRequestException404 extends RequestException {
            private TradeClientExtensionsModifyRejectTransaction tradeClientExtensionsModifyRejectTransaction;
            public TradeClientExtensionsModifyRejectTransaction get_tradeClientExtensionsModifyRejectTransaction() {
                return tradeClientExtensionsModifyRejectTransaction;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
            }
            private TransactionID[] relatedTransactionIDs;
            public TransactionID[] get_relatedTransactionIDs() {
                return relatedTransactionIDs;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }
        /**
        * The Trade's Client Extensions cannot be modified as requested.
        */

        @SuppressWarnings("serial")
        public class SetclientextensionsRequestException400 extends RequestException {
            private TradeClientExtensionsModifyRejectTransaction tradeClientExtensionsModifyRejectTransaction;
            public TradeClientExtensionsModifyRejectTransaction get_tradeClientExtensionsModifyRejectTransaction() {
                return tradeClientExtensionsModifyRejectTransaction;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
            }
            private TransactionID[] relatedTransactionIDs;
            public TransactionID[] get_relatedTransactionIDs() {
                return relatedTransactionIDs;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }
        /**
        * The Trade's Client Extensions have been updated as requested.
        */

        public class SetclientextensionsResponse {
            private TradeClientExtensionsModifyTransaction tradeClientExtensionsModifyTransaction;
            public TradeClientExtensionsModifyTransaction get_tradeClientExtensionsModifyTransaction() {
                return tradeClientExtensionsModifyTransaction;
            }
            private TransactionID[] relatedTransactionIDs;
            public TransactionID[] get_relatedTransactionIDs() {
                return relatedTransactionIDs;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
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
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpPut httpreq = new HttpPut(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");
                httpreq.setEntity(new ByteArrayEntity(bodystr.getBytes("UTF-8")));

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else if (status == 404) {
                        String responsebody = EntityUtils.toString(entity);
                        // System.out.println(responsebody);
                        e = gson.fromJson(responsebody, SetclientextensionsRequestException404.class);
                    } else if (status == 400) {
                        String responsebody = EntityUtils.toString(entity);
                        // System.out.println(responsebody);
                        e = gson.fromJson(responsebody, SetclientextensionsRequestException400.class);
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, SetclientextensionsResponse.class);
            }
            // Query Parameters
            // Body Parameters
            SetclientextensionsRequestBody body = new SetclientextensionsRequestBody();
            public SetclientextensionsRequest clientExtensions(ClientExtensions clientExtensions)
            {
                body.clientExtensions = clientExtensions;
                return this;
            }
        }
        /**
        * Create, replace and cancel a Trade's dependent Orders (Take Profit,
        * Stop Loss and Trailing Stop Loss) through the Trade itself
        *
        * @param accountID Account Identifier
        * @param tradeSpecifier Specifier for the Trade
        * @param takeProfit The specification of the Take Profit to create/modify/cancel. If takeProfit is
        *        set to null, the Take Profit Order will be cancelled if it
        *        exists. If takeProfit is not provided, the exisiting Take
        *        Profit Order will not be modified. If a sub-field of
        *        takeProfit is not specified, that field will be set to a
        *        default value on create, and be inherited by the replacing
        *        order on modify.
        * @param stopLoss The specification of the Stop Loss to create/modify/cancel. If stopLoss is set
        *        to null, the Stop Loss Order will be cancelled if it exists.
        *        If stopLoss is not provided, the exisiting Stop Loss Order
        *        will not be modified. If a sub-field of stopLoss is not
        *        specified, that field will be set to a default value on
        *        create, and be inherited by the replacing order on modify.
        * @param trailingStopLoss The specification of the Trailing Stop Loss to create/modify/cancel. If
        *        trailingStopLoss is set to null, the Trailing Stop Loss Order
        *        will be cancelled if it exists. If trailingStopLoss is not
        *        provided, the exisiting Trailing Stop Loss Order will not be
        *        modified. If a sub-field of trailngStopLoss is not specified,
        *        that field will be set to a default value on create, and be
        *        inherited by the replacing order on modify.
        *
        * @return {@link SetdependentordersResponse SetdependentordersResponse}
        */

        public SetdependentordersRequest setDependentOrders(String accountID, String tradeSpecifier)
        {
            
            SetdependentordersRequest request = new SetdependentordersRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            request.set_path_param("tradeSpecifier",
                    tradeSpecifier);
            return request;
        }

        private class SetdependentordersRequestBody {
                @SuppressWarnings("unused")
                private TakeProfitDetails takeProfit;
                @SuppressWarnings("unused")
                private StopLossDetails stopLoss;
                @SuppressWarnings("unused")
                private TrailingStopLossDetails trailingStopLoss;
        }

        /**
        * The Trade's dependent Orders cannot be modified as requested.
        */

        @SuppressWarnings("serial")
        public class SetdependentordersRequestException400 extends RequestException {
            private OrderCancelRejectTransaction takeProfitOrderCancelRejectTransaction;
            public OrderCancelRejectTransaction get_takeProfitOrderCancelRejectTransaction() {
                return takeProfitOrderCancelRejectTransaction;
            }
            private TakeProfitOrderRejectTransaction takeProfitOrderRejectTransaction;
            public TakeProfitOrderRejectTransaction get_takeProfitOrderRejectTransaction() {
                return takeProfitOrderRejectTransaction;
            }
            private OrderCancelRejectTransaction stopLossOrderCancelRejectTransaction;
            public OrderCancelRejectTransaction get_stopLossOrderCancelRejectTransaction() {
                return stopLossOrderCancelRejectTransaction;
            }
            private StopLossOrderRejectTransaction stopLossOrderRejectTransaction;
            public StopLossOrderRejectTransaction get_stopLossOrderRejectTransaction() {
                return stopLossOrderRejectTransaction;
            }
            private OrderCancelRejectTransaction trailingStopLossOrderCancelRejectTransaction;
            public OrderCancelRejectTransaction get_trailingStopLossOrderCancelRejectTransaction() {
                return trailingStopLossOrderCancelRejectTransaction;
            }
            private TrailingStopLossOrderRejectTransaction trailingStopLossOrderRejectTransaction;
            public TrailingStopLossOrderRejectTransaction get_trailingStopLossOrderRejectTransaction() {
                return trailingStopLossOrderRejectTransaction;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
            }
            private TransactionID[] relatedTransactionIDs;
            public TransactionID[] get_relatedTransactionIDs() {
                return relatedTransactionIDs;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }
        /**
        * The Trade's dependent Orders have been modified as requested.
        */

        public class SetdependentordersResponse {
            private OrderCancelTransaction takeProfitOrderCancelTransaction;
            public OrderCancelTransaction get_takeProfitOrderCancelTransaction() {
                return takeProfitOrderCancelTransaction;
            }
            private TakeProfitOrderTransaction takeProfitOrderTransaction;
            public TakeProfitOrderTransaction get_takeProfitOrderTransaction() {
                return takeProfitOrderTransaction;
            }
            private OrderFillTransaction takeProfitOrderFillTransaction;
            public OrderFillTransaction get_takeProfitOrderFillTransaction() {
                return takeProfitOrderFillTransaction;
            }
            private OrderCancelTransaction takeProfitOrderCreatedCancelTransaction;
            public OrderCancelTransaction get_takeProfitOrderCreatedCancelTransaction() {
                return takeProfitOrderCreatedCancelTransaction;
            }
            private OrderCancelTransaction stopLossOrderCancelTransaction;
            public OrderCancelTransaction get_stopLossOrderCancelTransaction() {
                return stopLossOrderCancelTransaction;
            }
            private StopLossOrderTransaction stopLossOrderTransaction;
            public StopLossOrderTransaction get_stopLossOrderTransaction() {
                return stopLossOrderTransaction;
            }
            private OrderFillTransaction stopLossOrderFillTransaction;
            public OrderFillTransaction get_stopLossOrderFillTransaction() {
                return stopLossOrderFillTransaction;
            }
            private OrderCancelTransaction stopLossOrderCreatedCancelTransaction;
            public OrderCancelTransaction get_stopLossOrderCreatedCancelTransaction() {
                return stopLossOrderCreatedCancelTransaction;
            }
            private OrderCancelTransaction trailingStopLossOrderCancelTransaction;
            public OrderCancelTransaction get_trailingStopLossOrderCancelTransaction() {
                return trailingStopLossOrderCancelTransaction;
            }
            private TrailingStopLossOrderTransaction trailingStopLossOrderTransaction;
            public TrailingStopLossOrderTransaction get_trailingStopLossOrderTransaction() {
                return trailingStopLossOrderTransaction;
            }
            private TransactionID[] relatedTransactionIDs;
            public TransactionID[] get_relatedTransactionIDs() {
                return relatedTransactionIDs;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
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
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpPut httpreq = new HttpPut(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");
                httpreq.setEntity(new ByteArrayEntity(bodystr.getBytes("UTF-8")));

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else if (status == 400) {
                        String responsebody = EntityUtils.toString(entity);
                        // System.out.println(responsebody);
                        e = gson.fromJson(responsebody, SetdependentordersRequestException400.class);
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, SetdependentordersResponse.class);
            }
            // Query Parameters
            // Body Parameters
            SetdependentordersRequestBody body = new SetdependentordersRequestBody();
            public SetdependentordersRequest takeProfit(TakeProfitDetails takeProfit)
            {
                body.takeProfit = takeProfit;
                return this;
            }
            public SetdependentordersRequest stopLoss(StopLossDetails stopLoss)
            {
                body.stopLoss = stopLoss;
                return this;
            }
            public SetdependentordersRequest trailingStopLoss(TrailingStopLossDetails trailingStopLoss)
            {
                body.trailingStopLoss = trailingStopLoss;
                return this;
            }
        }
    }
    public class PricingContext {
        /**
        * Get pricing information for a specified list of Instruments within an
        * Account.
        *
        * @param accountID Account Identifier
        * @param instruments List of Instruments to get pricing for.
        * @param since Date/Time filter to apply to the returned prices. Only prices with a time later
        *        than this filter will be provided.
        * @param includeUnitsAvailable Flag that enables the inclusion of the unitsAvailable field in the returned
        *        Price objects.
        *
        * @return {@link GetResponse GetResponse}
        */

        public GetRequest get(String accountID)
        {
            
            GetRequest request = new GetRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            return request;
        }

        /**
        * Pricing information has been successfully provided.
        */

        public class GetResponse {
            private Price[] prices;
            public Price[] get_prices() {
                return prices;
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
                if (_instruments != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "instruments=";
                    boolean first = true;
                    for (String itr : _instruments) {
                        if (first) {
                            first = false;
                        } else {
                            queryparamstr += ",";
                        }
                        queryparamstr += itr;
                    }
                }
                if (_since != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "since=";
                    queryparamstr += _since;
                }
                if (_includeUnitsAvailable != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "includeUnitsAvailable=";
                    queryparamstr += _includeUnitsAvailable;
                }
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, GetResponse.class);
            }
            // Query Parameters
            private String[] _instruments = null;
            public GetRequest instruments(String[] instruments)
            {
                _instruments = instruments;
                return this;
            }
            private String _since = null;
            public GetRequest since(String since)
            {
                _since = since;
                return this;
            }
            private Boolean _includeUnitsAvailable = null;
            public GetRequest includeUnitsAvailable(Boolean includeUnitsAvailable)
            {
                _includeUnitsAvailable = includeUnitsAvailable;
                return this;
            }
        }
    }
    public class OrderContext {
        /**
        * Create an Order for an Account
        *
        * @param accountID Account Identifier
        * @param order Specification of the Order to create
        *
        * @return {@link CreateResponse CreateResponse}
        */

        public CreateRequest create(String accountID)
        {
            
            CreateRequest request = new CreateRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            return request;
        }

        private class CreateRequestBody {
                @SuppressWarnings("unused")
                private OrderRequest order;
        }

        /**
        * The Order or Account specified does not exist.
        */

        @SuppressWarnings("serial")
        public class CreateRequestException404 extends RequestException {
            private Transaction orderRejectTransaction;
            public Transaction get_orderRejectTransaction() {
                return orderRejectTransaction;
            }
            private TransactionID[] relatedTransactionIDs;
            public TransactionID[] get_relatedTransactionIDs() {
                return relatedTransactionIDs;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }
        /**
        * The Order specification was invalid
        */

        @SuppressWarnings("serial")
        public class CreateRequestException400 extends RequestException {
            private Transaction orderRejectTransaction;
            public Transaction get_orderRejectTransaction() {
                return orderRejectTransaction;
            }
            private TransactionID[] relatedTransactionIDs;
            public TransactionID[] get_relatedTransactionIDs() {
                return relatedTransactionIDs;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }
        /**
        * The Order was created as specified
        */

        public class CreateResponse {
            private Transaction orderCreateTransaction;
            public Transaction get_orderCreateTransaction() {
                return orderCreateTransaction;
            }
            private OrderFillTransaction orderFillTransaction;
            public OrderFillTransaction get_orderFillTransaction() {
                return orderFillTransaction;
            }
            private OrderCancelTransaction orderCancelTransaction;
            public OrderCancelTransaction get_orderCancelTransaction() {
                return orderCancelTransaction;
            }
            private Transaction orderReissueTransaction;
            public Transaction get_orderReissueTransaction() {
                return orderReissueTransaction;
            }
            private Transaction orderReissueRejectTransaction;
            public Transaction get_orderReissueRejectTransaction() {
                return orderReissueRejectTransaction;
            }
            private TransactionID[] relatedTransactionIDs;
            public TransactionID[] get_relatedTransactionIDs() {
                return relatedTransactionIDs;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
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
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpPost httpreq = new HttpPost(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");
                httpreq.setEntity(new ByteArrayEntity(bodystr.getBytes("UTF-8")));

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 201) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else if (status == 404) {
                        String responsebody = EntityUtils.toString(entity);
                        // System.out.println(responsebody);
                        e = gson.fromJson(responsebody, CreateRequestException404.class);
                    } else if (status == 400) {
                        String responsebody = EntityUtils.toString(entity);
                        // System.out.println(responsebody);
                        e = gson.fromJson(responsebody, CreateRequestException400.class);
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, CreateResponse.class);
            }
            // Query Parameters
            // Body Parameters
            CreateRequestBody body = new CreateRequestBody();
            public CreateRequest order(OrderRequest order)
            {
                body.order = order;
                return this;
            }
        }
        /**
        * Get a list of Orders for an Account
        *
        * @param accountID Account Identifier
        * @param ids List of Order IDs to retrieve
        * @param state The state to filter the requested Orders by
        * @param instrument The instrument to filter the requested orders by
        * @param count The maximum number of Orders to return
        * @param beforeID The maximum Order ID to return. If not provided the most recent Orders in the
        *        Account are returned
        *
        * @return {@link ListResponse ListResponse}
        */

        public ListRequest list(String accountID)
        {
            
            ListRequest request = new ListRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            return request;
        }

        /**
        * The list of Orders requested
        */

        public class ListResponse {
            private Order[] orders;
            public Order[] get_orders() {
                return orders;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
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
                if (_ids != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "ids=";
                    boolean first = true;
                    for (String itr : _ids) {
                        if (first) {
                            first = false;
                        } else {
                            queryparamstr += ",";
                        }
                        queryparamstr += itr;
                    }
                }
                if (_state != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "state=";
                    queryparamstr += _state;
                }
                if (_instrument != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "instrument=";
                    queryparamstr += _instrument;
                }
                if (_count != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "count=";
                    queryparamstr += _count;
                }
                if (_beforeID != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "beforeID=";
                    queryparamstr += _beforeID;
                }
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, ListResponse.class);
            }
            // Query Parameters
            private String[] _ids = null;
            public ListRequest ids(String[] ids)
            {
                _ids = ids;
                return this;
            }
            private String _state = null;
            public ListRequest state(String state)
            {
                _state = state;
                return this;
            }
            private String _instrument = null;
            public ListRequest instrument(String instrument)
            {
                _instrument = instrument;
                return this;
            }
            private Integer _count = null;
            public ListRequest count(Integer count)
            {
                _count = count;
                return this;
            }
            private String _beforeID = null;
            public ListRequest beforeID(String beforeID)
            {
                _beforeID = beforeID;
                return this;
            }
        }
        /**
        * List all pending Orders in an Account
        *
        * @param accountID Account Identifier
        *
        * @return {@link ListpendingResponse ListpendingResponse}
        */

        public ListpendingRequest listPending(String accountID)
        {
            
            ListpendingRequest request = new ListpendingRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            return request;
        }

        /**
        * List of pending Orders for the Account
        */

        public class ListpendingResponse {
            private Order[] orders;
            public Order[] get_orders() {
                return orders;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
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
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, ListpendingResponse.class);
            }
            // Query Parameters
        }
        /**
        * Get details for a single Order in an Account
        *
        * @param accountID Account Identifier
        * @param orderSpecifier The Order Specifier
        *
        * @return {@link GetResponse GetResponse}
        */

        public GetRequest get(String accountID, String orderSpecifier)
        {
            
            GetRequest request = new GetRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            request.set_path_param("orderSpecifier",
                    orderSpecifier);
            return request;
        }

        /**
        * The details of the Order requested
        */

        public class GetResponse {
            private Order order;
            public Order get_order() {
                return order;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
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
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, GetResponse.class);
            }
            // Query Parameters
        }
        /**
        * Replace an Order in an Account by simultaneously cancelling it and
        * creating a replacement Order
        *
        * @param accountID Account Identifier
        * @param orderSpecifier The Order Specifier
        * @param order Specification of the replacing Order
        *
        * @return {@link ReplaceResponse ReplaceResponse}
        */

        public ReplaceRequest replace(String accountID, String orderSpecifier)
        {
            
            ReplaceRequest request = new ReplaceRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            request.set_path_param("orderSpecifier",
                    orderSpecifier);
            return request;
        }

        private class ReplaceRequestBody {
                @SuppressWarnings("unused")
                private OrderRequest order;
        }

        /**
        * The Account or Order specified does not exist.
        */

        @SuppressWarnings("serial")
        public class ReplaceRequestException404 extends RequestException {
            private Transaction orderCancelRejectTransaction;
            public Transaction get_orderCancelRejectTransaction() {
                return orderCancelRejectTransaction;
            }
            private TransactionID[] relatedTransactionIDs;
            public TransactionID[] get_relatedTransactionIDs() {
                return relatedTransactionIDs;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }
        /**
        * The Order specification was invalid
        */

        @SuppressWarnings("serial")
        public class ReplaceRequestException400 extends RequestException {
            private Transaction orderRejectTransaction;
            public Transaction get_orderRejectTransaction() {
                return orderRejectTransaction;
            }
            private TransactionID[] relatedTransactionIDs;
            public TransactionID[] get_relatedTransactionIDs() {
                return relatedTransactionIDs;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }
        /**
        * The Order was successfully cancelled and replaced
        */

        public class ReplaceResponse {
            private OrderCancelTransaction orderCancelTransaction;
            public OrderCancelTransaction get_orderCancelTransaction() {
                return orderCancelTransaction;
            }
            private Transaction orderCreateTransaction;
            public Transaction get_orderCreateTransaction() {
                return orderCreateTransaction;
            }
            private OrderFillTransaction orderFillTransaction;
            public OrderFillTransaction get_orderFillTransaction() {
                return orderFillTransaction;
            }
            private Transaction orderReissueTransaction;
            public Transaction get_orderReissueTransaction() {
                return orderReissueTransaction;
            }
            private Transaction orderReissueRejectTransaction;
            public Transaction get_orderReissueRejectTransaction() {
                return orderReissueRejectTransaction;
            }
            private OrderCancelTransaction replacingOrderCancelTransaction;
            public OrderCancelTransaction get_replacingOrderCancelTransaction() {
                return replacingOrderCancelTransaction;
            }
            private TransactionID[] relatedTransactionIDs;
            public TransactionID[] get_relatedTransactionIDs() {
                return relatedTransactionIDs;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
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
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpPut httpreq = new HttpPut(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");
                httpreq.setEntity(new ByteArrayEntity(bodystr.getBytes("UTF-8")));

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 201) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else if (status == 404) {
                        String responsebody = EntityUtils.toString(entity);
                        // System.out.println(responsebody);
                        e = gson.fromJson(responsebody, ReplaceRequestException404.class);
                    } else if (status == 400) {
                        String responsebody = EntityUtils.toString(entity);
                        // System.out.println(responsebody);
                        e = gson.fromJson(responsebody, ReplaceRequestException400.class);
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, ReplaceResponse.class);
            }
            // Query Parameters
            // Body Parameters
            ReplaceRequestBody body = new ReplaceRequestBody();
            public ReplaceRequest order(OrderRequest order)
            {
                body.order = order;
                return this;
            }
        }
        /**
        * Cancel a pending Order in an Account
        *
        * @param accountID Account Identifier
        * @param orderSpecifier The Order Specifier
        *
        * @return {@link CancelResponse CancelResponse}
        */

        public CancelRequest cancel(String accountID, String orderSpecifier)
        {
            
            CancelRequest request = new CancelRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            request.set_path_param("orderSpecifier",
                    orderSpecifier);
            return request;
        }

        /**
        * The Account or Order specified does not exist.
        */

        @SuppressWarnings("serial")
        public class CancelRequestException404 extends RequestException {
            private OrderCancelRejectTransaction orderCancelRejectTransaction;
            public OrderCancelRejectTransaction get_orderCancelRejectTransaction() {
                return orderCancelRejectTransaction;
            }
            private TransactionID[] relatedTransactionIDs;
            public TransactionID[] get_relatedTransactionIDs() {
                return relatedTransactionIDs;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }
        /**
        * The Order was cancelled as specified
        */

        public class CancelResponse {
            private OrderCancelTransaction orderCancelTransaction;
            public OrderCancelTransaction get_orderCancelTransaction() {
                return orderCancelTransaction;
            }
            private TransactionID[] relatedTransactionIDs;
            public TransactionID[] get_relatedTransactionIDs() {
                return relatedTransactionIDs;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
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
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpPut httpreq = new HttpPut(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else if (status == 404) {
                        String responsebody = EntityUtils.toString(entity);
                        // System.out.println(responsebody);
                        e = gson.fromJson(responsebody, CancelRequestException404.class);
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, CancelResponse.class);
            }
            // Query Parameters
        }
        /**
        * Update the Client Extensions for an Order in an Account. Do not set,
        * modify, or delete clientExtensions if your account is associated with
        * MT4.
        *
        * @param accountID Account Identifier
        * @param orderSpecifier The Order Specifier
        * @param clientExtensions The Client Extensions to update for the Order. Do not set, modify, or delete
        *        clientExtensions if your account is associated with MT4.
        * @param tradeClientExtensions The Client Extensions to update for the Trade created when the Order is filled.
        *        Do not set, modify, or delete clientExtensions if your account
        *        is associated with MT4.
        *
        * @return {@link SetclientextensionsResponse SetclientextensionsResponse}
        */

        public SetclientextensionsRequest setClientExtensions(String accountID, String orderSpecifier)
        {
            
            SetclientextensionsRequest request = new SetclientextensionsRequest();
            // Path Parameters
            request.set_path_param("accountID",
                    accountID);
            request.set_path_param("orderSpecifier",
                    orderSpecifier);
            return request;
        }

        private class SetclientextensionsRequestBody {
                @SuppressWarnings("unused")
                private ClientExtensions clientExtensions;
                @SuppressWarnings("unused")
                private ClientExtensions tradeClientExtensions;
        }

        /**
        * The Account or Order specified does not exist.
        */

        @SuppressWarnings("serial")
        public class SetclientextensionsRequestException404 extends RequestException {
            private OrderClientExtensionsModifyRejectTransaction orderClientExtensionsModifyRejectTransaction;
            public OrderClientExtensionsModifyRejectTransaction get_orderClientExtensionsModifyRejectTransaction() {
                return orderClientExtensionsModifyRejectTransaction;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
            }
            private TransactionID[] relatedTransactionIDs;
            public TransactionID[] get_relatedTransactionIDs() {
                return relatedTransactionIDs;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }
        /**
        * The Order Client Extensions specification was invalid
        */

        @SuppressWarnings("serial")
        public class SetclientextensionsRequestException400 extends RequestException {
            private OrderClientExtensionsModifyRejectTransaction orderClientExtensionsModifyRejectTransaction;
            public OrderClientExtensionsModifyRejectTransaction get_orderClientExtensionsModifyRejectTransaction() {
                return orderClientExtensionsModifyRejectTransaction;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
            }
            private TransactionID[] relatedTransactionIDs;
            public TransactionID[] get_relatedTransactionIDs() {
                return relatedTransactionIDs;
            }
            // Inherit errorCode
            // Inherit errorMessage
        }
        /**
        * The Order's Client Extensions were successfully modified
        */

        public class SetclientextensionsResponse {
            private OrderClientExtensionsModifyTransaction orderClientExtensionsModifyTransaction;
            public OrderClientExtensionsModifyTransaction get_orderClientExtensionsModifyTransaction() {
                return orderClientExtensionsModifyTransaction;
            }
            private TransactionID lastTransactionID;
            public TransactionID get_lastTransactionID() {
                return lastTransactionID;
            }
            private TransactionID[] relatedTransactionIDs;
            public TransactionID[] get_relatedTransactionIDs() {
                return relatedTransactionIDs;
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
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpPut httpreq = new HttpPut(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");
                httpreq.setEntity(new ByteArrayEntity(bodystr.getBytes("UTF-8")));

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else if (status == 404) {
                        String responsebody = EntityUtils.toString(entity);
                        // System.out.println(responsebody);
                        e = gson.fromJson(responsebody, SetclientextensionsRequestException404.class);
                    } else if (status == 400) {
                        String responsebody = EntityUtils.toString(entity);
                        // System.out.println(responsebody);
                        e = gson.fromJson(responsebody, SetclientextensionsRequestException400.class);
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, SetclientextensionsResponse.class);
            }
            // Query Parameters
            // Body Parameters
            SetclientextensionsRequestBody body = new SetclientextensionsRequestBody();
            public SetclientextensionsRequest clientExtensions(ClientExtensions clientExtensions)
            {
                body.clientExtensions = clientExtensions;
                return this;
            }
            public SetclientextensionsRequest tradeClientExtensions(ClientExtensions tradeClientExtensions)
            {
                body.tradeClientExtensions = tradeClientExtensions;
                return this;
            }
        }
    }
    public class InstrumentContext {
        /**
        * Fetch candlestick data for an instrument.
        *
        * @param instrument Name of the Instrument
        * @param price The Price component(s) to get candlestick data for. Can contain any combination
        *        of the characters "M" (midpoint candles) "B" (bid candles) and
        *        "A" (ask candles).
        * @param granularity The granularity of the candlesticks to fetch
        * @param count The number of candlesticks to return in the reponse. Count should not be
        *        specified if both the start and end parameters are provided,
        *        as the time range combined with the graularity will determine
        *        the number of candlesticks to return.
        * @param fromTime The start of the time range to fetch candlesticks for.
        * @param toTime The end of the time range to fetch candlesticks for.
        * @param smooth A flag that controls whether the candlestick is "smoothed" or not.  A smoothed
        *        candlestick uses the previous candle's close price as its open
        *        price, while an unsmoothed candlestick uses the first price
        *        from its time range as its open price.
        * @param includeFirst A flag that controls whether the candlestick that is covered by the from time
        *        should be included in the results. This flag enables clients
        *        to use the timestamp of the last completed candlestick
        *        received to poll for future candlesticks but avoid receiving
        *        the previous candlestick repeatedly.
        * @param dailyAlignment The hour of the day (in the specified timezone) to use for granularities that
        *        have daily alignments.
        * @param alignmentTimezone The timezone to use for the dailyAlignment parameter. Candlesticks with daily
        *        alignment will be aligned to the dailyAlignment hour within
        *        the alignmentTimezone.
        * @param weeklyAlignment The day of the week used for granularities that have weekly alignment.
        *
        * @return {@link CandlesResponse CandlesResponse}
        */

        public CandlesRequest candles(String instrument)
        {
            
            CandlesRequest request = new CandlesRequest();
            // Path Parameters
            request.set_path_param("instrument",
                    instrument);
            return request;
        }

        /**
        * Pricing information has been successfully provided.
        */

        public class CandlesResponse {
            private InstrumentName instrument;
            public InstrumentName get_instrument() {
                return instrument;
            }
            private CandlestickGranularity granularity;
            public CandlestickGranularity get_granularity() {
                return granularity;
            }
            private Candlestick[] candles;
            public Candlestick[] get_candles() {
                return candles;
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
                if (_price != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "price=";
                    queryparamstr += _price;
                }
                if (_granularity != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "granularity=";
                    queryparamstr += _granularity;
                }
                if (_count != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "count=";
                    queryparamstr += _count;
                }
                if (_from != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "from=";
                    queryparamstr += _from;
                }
                if (_to != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "to=";
                    queryparamstr += _to;
                }
                if (_smooth != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "smooth=";
                    queryparamstr += _smooth;
                }
                if (_includeFirst != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "includeFirst=";
                    queryparamstr += _includeFirst;
                }
                if (_dailyAlignment != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "dailyAlignment=";
                    queryparamstr += _dailyAlignment;
                }
                if (_alignmentTimezone != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "alignmentTimezone=";
                    queryparamstr += _alignmentTimezone;
                }
                if (_weeklyAlignment != null) {
                    if (queryparamstr != "")
                        queryparamstr += "&";
                    queryparamstr += "weeklyAlignment=";
                    queryparamstr += _weeklyAlignment;
                }
                String pathandquery = _path;
                if (queryparamstr != "") {
                    pathandquery += "?" + queryparamstr;
                }

                HttpGet httpreq = new HttpGet(_uri+pathandquery);
                httpreq.addHeader("Authorization","Bearer "+_token);
                httpreq.addHeader("Content-Type", "application/json");

                CloseableHttpResponse response = httpclient.execute(httpreq);
                int status = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (status != 200) {
                    RequestException e;
                    if (entity == null) {
                        e = new RequestException();
                    } else {
                        String responsebody = EntityUtils.toString(entity);
                        e = gson.fromJson(responsebody, RequestException.class);
                    }
                    e.status = status;
                    throw e;
                }
                String responsebody = EntityUtils.toString(entity);
                return gson.fromJson(responsebody, CandlesResponse.class);
            }
            // Query Parameters
            private String _price = null;
            public CandlesRequest price(String price)
            {
                _price = price;
                return this;
            }
            private String _granularity = null;
            public CandlesRequest granularity(String granularity)
            {
                _granularity = granularity;
                return this;
            }
            private Integer _count = null;
            public CandlesRequest count(Integer count)
            {
                _count = count;
                return this;
            }
            private String _from = null;
            public CandlesRequest fromTime(String from)
            {
                _from = from;
                return this;
            }
            private String _to = null;
            public CandlesRequest toTime(String to)
            {
                _to = to;
                return this;
            }
            private Boolean _smooth = null;
            public CandlesRequest smooth(Boolean smooth)
            {
                _smooth = smooth;
                return this;
            }
            private Boolean _includeFirst = null;
            public CandlesRequest includeFirst(Boolean includeFirst)
            {
                _includeFirst = includeFirst;
                return this;
            }
            private Integer _dailyAlignment = null;
            public CandlesRequest dailyAlignment(Integer dailyAlignment)
            {
                _dailyAlignment = dailyAlignment;
                return this;
            }
            private String _alignmentTimezone = null;
            public CandlesRequest alignmentTimezone(String alignmentTimezone)
            {
                _alignmentTimezone = alignmentTimezone;
                return this;
            }
            private String _weeklyAlignment = null;
            public CandlesRequest weeklyAlignment(String weeklyAlignment)
            {
                _weeklyAlignment = weeklyAlignment;
                return this;
            }
        }
    }
    private abstract class Request {
        @SuppressWarnings("unused")
        protected String _method;
        protected String _path;
        private Request (String method, String path) {
            _method = method;
            _path = path;
        }
        
        protected void set_path_param(String key, String value) {
            String _keyname = '{'+key+'}';
            if (!_path.contains(_keyname))
            throw new RuntimeException("No key "+_keyname+" found in path '"+_path+"'");
            _path = _path.replace('{'+key+'}', value);

        }
    }

    @SuppressWarnings("serial")
    public class RequestException extends Exception {
        protected RequestException() { }
        protected int status;
        protected String errorCode;
        protected String errorMessage;
        public int get_status() {
            return status;
        }
        public String get_errorCode() {
            return errorCode;
        }
        public String get_errorMessage() {
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
