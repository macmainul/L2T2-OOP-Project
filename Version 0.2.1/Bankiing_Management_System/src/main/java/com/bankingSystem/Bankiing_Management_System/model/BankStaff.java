package com.bms.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class BankStaff extends User {
    public void approveLoan() {}
    public void rejectLoan() {}
    public void closeAccount() {}
    public void viewCustomerDetails() {}
}
