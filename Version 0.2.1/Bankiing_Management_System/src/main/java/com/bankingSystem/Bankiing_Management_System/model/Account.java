package com.bms.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;
    private String accountType;
    private double balance;

    public void createAccount() {}
    public void closeAccount() {}
    public void updateDetails() {}
}
