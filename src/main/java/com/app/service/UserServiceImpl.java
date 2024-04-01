package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Admin;
import com.app.entity.User;
import com.app.repo.AdminRepo;
import com.app.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;
    
    @Autowired
    private AdminRepo adminRepo;
    
    @Override
    public void registerUser(User user) {
        userRepo.save(user);
    }

    @Override
    public void adminRegister(Admin admin) {
        adminRepo.save(admin);
    }
}
