public class Customer extends User {  //Customer Class (Inherits User)

    public Customer(String userId, String name, String email, String phoneNumber, String address, String password) {
        super(userId, name, email, phoneNumber, address, password);
    }

    public void createAccount() {
        System.out.println(name + " created a new account.");
    }

    public void viewAccountDetails(Account account) {
        System.out.println("Account Details: " + account.getAccountId() + ", Balance: " + account.getBalance());
    }

    public void transferFunds(Account fromAccount, Account toAccount, double amount) {
        if (fromAccount.getBalance() >= amount) {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transferred " + amount + " to account " + toAccount.getAccountId());
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void withdrawMoney(Account account, double amount) {
        account.withdraw(amount);
        System.out.println("Withdrawn " + amount + " from account " + account.getAccountId());
    }

    public void depositMoney(Account account, double amount) {
        account.deposit(amount);
        System.out.println("Deposited " + amount + " to account " + account.getAccountId());
    }

    public void applyLoan(Loan loan) {
        System.out.println("Loan application submitted: " + loan.getLoanId() + ", Amount: " + loan.getAmount());
    }
}