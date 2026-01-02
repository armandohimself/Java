import static org.junit.jupiter.api.Assertions.assertEquals;

import com.armando.sandbox.CodingExercises.TDD.AccountExample.Account;

import org.junit.jupiter.api.Test;

public class AccountTest {
    //public static void main(String[] args) {}

    Account acc = new Account();

    @Test
    public void newAccountHasZeroBalance() {
        assertEquals(0.0, acc.getBalance(), "new accounts should have a zero balance.");
    }

    //! Deposit Testing
    // Testing Deposit Functionality
    @Test
    public void depositIncreasesMemberBalance() {
        acc.deposit(100.00);
        assertEquals(100.00, acc.getBalance(), "depositing money should increase balance");
    }

    // Testing Fractional Deposit
    @Test
    public void depositFractionalIncreasesMemberBalance() {
        acc.deposit(.5);
        assertEquals(.5, acc.getBalance(), "depositing fractional money should increase balance");
    }

    //Negative Deposit
    @Test
    public void depositNegativeAmountShouldNotBeAccepted() {
        acc.deposit(-150);
        assertEquals(0, acc.getBalance(), "deposit negative money should do nothing");
    }
}