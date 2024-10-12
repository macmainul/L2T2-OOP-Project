import java.util.Date;

public class Transaction {
    private String transactionId;
    private double amount;
    private Date date;
    private String type;

    public Transaction(String transactionId, double amount, String type) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.date = new Date();
        this.type = type;
    }

    public void performTransaction() {
        System.out.println("Transaction " + transactionId + " performed. Amount: " + amount);
    }

    public void viewTransactionHistory() {
        System.out.println("Transaction history for " + transactionId);
    }
}
