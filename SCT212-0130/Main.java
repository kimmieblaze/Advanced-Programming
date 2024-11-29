import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        // Create a sample bank account
        BankAccount account = new BankAccount("21431", 30000000.0); 

        // Create a deposit transaction
        DepositTransaction deposit = new DepositTransaction(200000.0, Calendar.getInstance(), "T1");
        deposit.apply(account); // Apply the deposit transaction
        deposit.printTransactionDetails(); // Print transaction details

        // Create a withdrawal transaction
        WithdrawalTransaction withdrawal = new WithdrawalTransaction(500000.0, Calendar.getInstance(), "T2");
        try {
            withdrawal.apply(account); // Apply the withdrawal transaction
        } catch (InsufficientFundsException e) {
            System.err.println(e.getMessage());
        }
        withdrawal.printTransactionDetails(); // Print transaction details

        // Attempt to reverse the withdrawal
        withdrawal.reverse(account);

        // Print the final balance
        System.out.println("Final Balance: " + account.getBalance());
    }
}