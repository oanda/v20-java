package com.oanda.v20.account;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * AccountListResponse
 */
public class AccountListResponse {

    /**
     * AccountListResponse Constructor
     * <p>
     * Construct a new AccountListResponse
     */
    private AccountListResponse() {
    }

    @SerializedName("accounts") private ArrayList<AccountProperties> accounts;

    /**
     * Get the accounts
     * <p>
     * The list of Accounts the client is authorized to access and their
     * associated properties.
     * <p>
     * @return the accounts
     * @see AccountProperties
     */
    public List<AccountProperties> getAccounts() {
        return this.accounts;
    }
}
