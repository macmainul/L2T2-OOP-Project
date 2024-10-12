public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("C001", "John Doe", "john@example.com", "1234567890", "123 Main St", "password");
        BankStaff staff = new BankStaff("B001", "Jane Smith", "jane@example.com", "0987654321", "456 Market St", "password");
        Admin admin = new Admin("A001", "Admin", "admin@example.com", "admin", "789 Admin St", "admin");

        Account account = new Account("A123", "Savings", 1000.0);
        Loan loan = new Loan("L001", 5000, 5.5);

        customer.login();
        customer.createAccount();
        customer.viewAccountDetails(account);
        customer.depositMoney(account, 500);
        customer.withdrawMoney(account, 200);
        customer.applyLoan(loan);

        staff.viewCustomerDetails(customer);
        staff.approveLoan(loan);

        admin.generateReport();
        admin.approveLoan(loan);

        customer.logout();
    }
}
