public class BankStaff extends User {    // Inherits User

    public BankStaff(String userId, String name, String email, String phoneNumber, String address, String password) {
        super(userId, name, email, phoneNumber, address, password);
    }

    public void approveLoan(Loan loan) {
        loan.setLoanStatus("Approved");
        System.out.println("Loan " + loan.getLoanId() + " approved.");
    }

    public void rejectLoan(Loan loan) {
        loan.setLoanStatus("Rejected");
        System.out.println("Loan " + loan.getLoanId() + " rejected.");
    }

    public void closeAccount(Account account) {
        System.out.println("Account " + account.getAccountId() + " closed.");
    }

    public void viewCustomerDetails(Customer customer) {
        System.out.println("Customer Details: " + customer.name + ", Email: " + customer.email);
    }
}

