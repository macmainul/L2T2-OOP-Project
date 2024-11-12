package com.bms.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Admin extends User {
    public void approveLoan() {}
    public void rejectLoan() {}
    public void generateReport() {}
    public void manageUsers() {}
}
