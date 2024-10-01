package CodingExercises.POJOs;

public class ObjectOrientedBankAccount {

    private double accountNumber = 0;
    private double accountBalance = 0;
    private String fullName = "";
    private String email = "";
    private int phoneNum = 0;

    //! Account Number
    public double getAccountNumber () {
        return accountNumber;
    }

    public void setAccountNumber (double accountNumber) {
        this.accountNumber = accountNumber;
    }


    //! Account Balance
    public double getAccountBalance () {
        return accountNumber;
    }

    public void setAccountBalance (double accountBalance) {
        this.accountBalance = accountBalance;
    }


    //! Banking Actions (Deposit & Withdraw)
    public void depositIntoAccount (double depositAmount) {
        this.accountBalance += depositAmount;
        System.out.println("Congrgulations! Deposit Successful");
        System.out.println("Deposit amount: " + depositAmount);
        System.out.println("Present balance: " + this.accountBalance);
    }

    public void withdrawFromAccount (double withdrawAmount) {
        //Guard Clause
        if (accountDrawnNegative(withdrawAmount)) System.out.println("Can't draw out negative amount");
        else {
            this.accountBalance -= withdrawAmount;
            System.out.println("Congrgulations! Withdraw Successful");
            System.out.println("Deposit amount: " + withdrawAmount);
            System.out.println("Present balance is now: " + this.accountBalance);
        }
    }

    public boolean accountDrawnNegative (double withdrawAmount) {
        double accountAmount = this.accountBalance - withdrawAmount;

        if (accountAmount < 0) return true;
        else return false;
    }

    //! Full Name
    public String getFullName () {
        return fullName;
    }

    public void setFullName (String fullName) {
        this.fullName = fullName;
    }


    //! Email
    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }


    //! Phone Number
    public int getPhoneNum () {
        return phoneNum;
    }

    public void setPhoneNum (int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public static void main(String[] args) {
        ObjectOrientedBankAccount ba = new ObjectOrientedBankAccount();

        ba.setFullName("Armando Arteaga");
        System.out.println(ba.getFullName());

        ba.setAccountBalance(250);
        ba.getAccountBalance();

        ba.depositIntoAccount(5);
        ba.withdrawFromAccount(50);
        ba.withdrawFromAccount(5000);
    }
}