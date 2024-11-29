package CustomException;

public class InsufficientFundsException extends Exception {
    private final double amount;

    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "You don't have enough funds to perform this operation";
    }
}
