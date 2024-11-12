package com.bms.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanId;
    private double amount;
    private double interestRate;
    private String loanStatus;

    public void applyLoan() {}
    public void approveLoan() {}
    public void rejectLoan() {}
    public void makeRepayment() {}
    public void viewLoanDetails() {}
}
