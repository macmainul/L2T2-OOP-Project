package com.bms.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;
    private double amount;
    private Date date;
    private String type;

    @ManyToOne
    private Account account;

    public void performTransaction() {}
    public void viewTransactionHistory() {}
}
