package com.dojo.SocialMedia.Service;

import com.dojo.SocialMedia.DAO.AccountDAO;
import com.dojo.SocialMedia.Model.Account;

public class AccountService {
    AccountDAO accountDAO; // helps delegate DB operations in Service
    
    // Constructor to create instance of AccountDAO when instance of AccountService is created
    public AccountService() {
        accountDAO = new AccountDAO();
    }

    // Helps mock behavior
    public AccountService(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    public Account createAccount(Account account) {
        //! Add business logic to make sure: 
        // * username is not blank, the password is at least 4 characters long, and an Account with that username does not already exist.

        // Pass the (transient account object AKA the data from POST) and get back a persisted account object
        Account createdAccount = this.accountDAO.insertAccount(account);
        return createdAccount;
    }
}

