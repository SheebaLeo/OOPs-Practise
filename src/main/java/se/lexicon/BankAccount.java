package se.lexicon;

public class BankAccount {

    private String accountNumber;

    private static int accountNumberCounter = 0;

    private double balance;

    private String customerName;

    private String email;

    private String phoneNumber;

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = String.valueOf(++accountNumberCounter);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double deposit(double amountToBeDeposited) {

        if(amountToBeDeposited <= 0) {
            throw new IllegalArgumentException("Amount cannot be 0");
        }

        balance += amountToBeDeposited;
        return balance;
    }

    public double withdrawAmount(double amountToBeWithdrawn) {
        if (amountToBeWithdrawn <= 0) {
            throw new IllegalArgumentException("Amount cannot be 0");
        }

        if (balance >= amountToBeWithdrawn) {
            balance -= amountToBeWithdrawn;
        } else {
            throw new IllegalArgumentException("Insufficient balance");
        }

        return balance;
    }
}
