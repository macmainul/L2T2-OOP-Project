package com.bms.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Customer extends User {
    public void createAccount() {}
    public void viewAccountDetails() {}
    public void transferFunds() {}
    public void withdrawMoney() {}
    public void depositMoney() {}
    public void applyLoan() {}
}
