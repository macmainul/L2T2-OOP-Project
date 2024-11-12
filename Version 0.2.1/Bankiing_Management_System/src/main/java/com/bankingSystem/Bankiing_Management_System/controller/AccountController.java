package com.bms.controller;

import com.bms.model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AccountController {

    @GetMapping("/account/details")
    public String viewAccountDetails(Model model) {
        Account account = new Account();
        account.setAccountId(1L);
        account.setAccountType("Savings");
        account.setBalance(5000.00);
        model.addAttribute("account", account);
        return "accountDetails";
    }
}
