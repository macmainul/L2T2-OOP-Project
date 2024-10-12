public class Account {
    private String accountId;
    private String accountType;
    private double balance;

    public Account(String accountId, String accountType, double balance) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void createAccount() {
        System.out.println("Account " + accountId + " created.");
    }

    public void closeAccount() {
        System.out.println("Account " + accountId + " closed.");
    }

    public void updateDetails() {
        System.out.println("Account " + accountId + " details updated.");
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
