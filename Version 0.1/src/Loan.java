public class Loan {
    private String loanId;
    private double amount;
    private double interestRate;
    private String loanStatus;

    public Loan(String loanId, double amount, double interestRate) {
        this.loanId = loanId;
        this.amount = amount;
        this.interestRate = interestRate;
        this.loanStatus = "Pending";
    }

    public String getLoanId() {
        return loanId;
    }

    public double getAmount() {
        return amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    public void applyLoan() {
        System.out.println("Loan " + loanId + " applied. Amount: " + amount);
    }

    public void approveLoan() {
        this.loanStatus = "Approved";
        System.out.println("Loan " + loanId + " approved.");
    }

    public void rejectLoan() {
        this.loanStatus = "Rejected";
        System.out.println("Loan " + loanId + " rejected.");
    }

    public void makeRepayment(double repaymentAmount) {
        this.amount -= repaymentAmount;
        System.out.println("Repayment made. Remaining amount: " + amount);
    }

    public void viewLoanDetails() {
        System.out.println("Loan Details: ID - " + loanId + ", Amount - " + amount + ", Interest Rate - " + interestRate);
    }
}

