package com.armando.SocialMedia.Controller;

import com.armando.SocialMedia.Model.Account;
import com.armando.SocialMedia.Service.AccountService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.javalin.Javalin;
import io.javalin.http.Context;

public class SocialMediaController {

    // Create empty object of AccountService to use throughout SocialMediaController
    AccountService accountService;
    
    // Initialize instance of AccountService because constructor was called in main for SocialMediaController
    public SocialMediaController() {
        accountService = new AccountService();
    }

    public Javalin startAPI() {
        // SocialMediaController - middle layer that processes incoming requests & coordinates with other layers
        Javalin app = Javalin.create();

        app.get("/", this::exampleHandler);
        app.post("/register", this::createAccount);


        app.get("/h2-console", ctx -> {
            ctx.redirect("/h2-console");
        });
        return app;
    }

    private void exampleHandler(Context context) {
        context.json("yeah?!");
    }

    //! Make sure you we pass the JsonProcessingException up because we could throw
    private void createAccount(Context ctx) throws JsonProcessingException {
        // We want the ObjectMapper for the JSON
        ObjectMapper om = new ObjectMapper();

        // Because it's a POST we want to read what's in the body and encapsulate in the Account Model
        Account account = om.readValue(ctx.body(), Account.class);

        // Use the AccountService for the business logic to pass the account info from body to then pass to DAO
        Account createdAccount = accountService.createAccount(account);

        // Guard Clause - createdAccount didn't return null
        if (createdAccount != null) {
            ctx.json(createdAccount).status(200);
        } else {
            ctx.status(400); // Bad Request
            ctx.result("Failed to create account. Username may already exist or data is invalid.");
        }
    }
}

/*
 * 1: Our API should be able to process new User registrations.
As a user, I should be able to create a new Account on the endpoint POST localhost:8080/register. The body will contain a representation of a JSON Account, but will not contain an account_id.

The registration will be successful if and only if the username is not blank, the password is at least 4 characters long, and an Account with that username does not already exist. If all these conditions are met, the response body should contain a JSON of the Account, including its account_id. The response status should be 200 OK, which is the default. The new account should be persisted to the database.
If the registration is not successful, the response status should be 400. (Client error)
 */