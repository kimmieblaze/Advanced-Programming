// Custom exception class for insufficient funds
public class InsufficientFundsException extends Exception {
    
    // Constructor with a message
    public InsufficientFundsException(String message) {
        super(message);
    }
}