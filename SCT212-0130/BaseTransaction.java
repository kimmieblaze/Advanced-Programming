import java.util.Calendar;

// Concrete class implementing TransactionInterface
public class BaseTransaction implements TransactionInterface {
    private double amount;           
    private Calendar date;          
    private String transactionID;   

    // Constructor
    public BaseTransaction(double amount, Calendar date, String transactionID) {
        this.amount = amount;
        this.date = date;
        this.transactionID = transactionID;
    }

    // Method to get the transaction amount
    @Override
    public double getAmount() {
        return amount;
    }

    // Method to get the transaction date
    @Override
    public Calendar getDate() {
        return date;
    }

    // Method to get the transaction ID
    @Override
    public String getTransactionID() {
        return transactionID;
    }

    // Show transaction details
    public void printTransactionDetails() {
        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Amount: " + amount);
        System.out.println("Date: " + date.getTime());
    }

    // Apply transaction
    public void apply(BankAccount ba) {
        System.out.println("Base transaction applied to bank account.");
    }
}