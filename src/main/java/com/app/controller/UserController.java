package com.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.entity.User;
import com.app.entity.Admin;
import com.app.service.UserService;

@Controller
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String unified() {
        return "unified";
    }
    
    @GetMapping("/register")
    public String register(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "register";
    }
    
    @PostMapping("/registerUser")
    public String registerUser(@ModelAttribute("user") User user) {
        System.out.println(user);
        userService.registerUser(user);
        return "home";
    }
    
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }
    
    @GetMapping("/admin")
    public String showAdminRegisterPage(Model model) {
        Admin admin = new Admin();
        model.addAttribute("admin", admin);
        return "admin";
    }
    
    @PostMapping("/adminregister")
    public String adminRegister(@ModelAttribute("admin") Admin admin) {
        System.out.println(admin);
        userService.adminRegister(admin);
        return "home";
    }
    

    @GetMapping("/overview")
    public String showOverviewPage() {
        return "overview";
    }
}
