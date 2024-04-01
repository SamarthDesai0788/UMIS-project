package com.app.service;

import com.app.entity.User;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.entity.Admin; // Assuming Admin entity is imported

public interface UserService {
	@Autowired
    public void registerUser(User user);
    public void adminRegister(Admin admin); // Renamed method to follow Java naming conventions
}
