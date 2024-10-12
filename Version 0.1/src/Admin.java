public class Admin extends User {      //  Inherits User

    public Admin(String userId, String name, String email, String phoneNumber, String address, String password) {
        super(userId, name, email, phoneNumber, address, password);
    }

    public void approveLoan(Loan loan) {
        loan.setLoanStatus("Approved");
        System.out.println("Admin approved loan " + loan.getLoanId());
    }

    public void rejectLoan(Loan loan) {
        loan.setLoanStatus("Rejected");
        System.out.println("Admin rejected loan " + loan.getLoanId());
    }

    public void generateReport() {
        System.out.println("Generating report...");
    }

    public void manageUsers() {
        System.out.println("Managing users...");
    }
}
