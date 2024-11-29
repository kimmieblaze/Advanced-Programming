import java.util.Calendar;

// Subclass of BaseTransaction for deposits
public class DepositTransaction extends BaseTransaction {

    // Constructor
    public DepositTransaction(double amount, Calendar date, String transactionID) {
        super(amount, date, transactionID);
    }

    // Override apply method to handle deposits
    @Override
    public void apply(BankAccount ba) {
        ba.deposit(getAmount());  // Add the transaction amount to the account
        System.out.println("DepositTransaction applied. New Balance: " + ba.getBalance());
    }
}