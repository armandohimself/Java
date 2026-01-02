package com.armando.SocialMedia.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.armando.SocialMedia.Model.Account;
import com.armando.SocialMedia.Util.ConnectionUtil;

public class AccountDAO {

    public Account insertAccount(Account account) {
        // Establish a connection to the DB
        Connection connection = ConnectionUtil.getConnection();

        try {
            String sql = "INSERT INTO account (username, password) VALUES (?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, account.getUsername());
            ps.setString(2, account.getPassword());

            int rowsAffected = ps.executeUpdate();
            // Insert into DB - rowsAffected = a # for number of rows affected 0 to many.

            if(rowsAffected > 0) { // Ensures the insert was successful
                ResultSet pkeyResultSet = ps.getGeneratedKeys();
                // After insertion DB automtically assigns a SERIAL (or AUTO_INCREMENT) to account_id.
                // ps.getGeneratedKeys() fetches account_id value, allowing us to return a complete Account object

                if(pkeyResultSet.next()) {
                    int generated_account_id = (int) pkeyResultSet.getLong(1);
                    return new Account(generated_account_id, account.getUsername(), account.getPassword());
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}