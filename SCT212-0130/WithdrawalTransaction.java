import java.util.Calendar;

// Subclass of BaseTransaction for withdrawals
public class WithdrawalTransaction extends BaseTransaction {

    // Constructor
    public WithdrawalTransaction(double amount, Calendar date, String transactionID) {
        super(amount, date, transactionID);
    }

    // Override apply method to handle withdrawals
    @Override
    public void apply(BankAccount ba) throws InsufficientFundsException {
        if (ba.getBalance() < getAmount()) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
        }
        ba.withdraw(getAmount());  // Deduct the transaction amount from the account
        System.out.println("Withdrawal successful. New Balance: " + ba.getBalance());
    }

    // Method to reverse a withdrawal
    public boolean reverse(BankAccount ba) {
        ba.deposit(getAmount());  // Restore the transaction amount to the account
        System.out.println("Reversal successful. Balance restored to: " + ba.getBalance());
        return true;
    }
}