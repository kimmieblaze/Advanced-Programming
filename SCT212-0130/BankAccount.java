public class BankAccount {
    private String accountNumber; // Unique account number
    private double balance;       // Current account balance

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        balance -= amount;
    }

    // Get current balance
    public double getBalance() {
        return balance;
    }
}