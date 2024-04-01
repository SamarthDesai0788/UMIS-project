package com.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "adminregister")
public class Admin {
    private String name;
    private String email;
    @Id
    private String username;
    private String password;
    private String confirmPassword;
    private String head_of_the_department;
	public String getHead_of_the_department() {
		return head_of_the_department;
	}
	public void setHead_of_the_department(String head_of_the_department) {
		this.head_of_the_department = head_of_the_department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	

    // Getters and setters for all fields
    // Constructor(s)
}
