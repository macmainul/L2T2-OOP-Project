package com.bms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password, Model model) {
        // Placeholder login logic
        if ("admin@example.com".equals(email) && "password".equals(password)) {
            model.addAttribute("user", email);
            return "dashboard";
        }
        return "login";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login";
    }
}
