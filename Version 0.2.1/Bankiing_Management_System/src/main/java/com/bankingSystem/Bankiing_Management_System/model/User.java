package com.bms.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String password;

    public void login() {}
    public void logout() {}
}
