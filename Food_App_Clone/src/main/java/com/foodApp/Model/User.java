package com.foodApp.Model;

import java.sql.Timestamp;

public class User {
	
	private int userId;
	private String name;
	private String username;
	private String password;
	private String email;
	private String phone;
	private String Address;
	private String Role;
	private Timestamp created_Date;
	private Timestamp last_loginDate;
	
	
	public User() {
		
	}





	public User(int userId, String name, String username, String password, String email, String phone, String address,
			String role, Timestamp created_Date, Timestamp last_loginDate) {
		super();
		this.userId = userId;
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		Address = address;
		Role = role;
		this.created_Date = created_Date;
		this.last_loginDate = last_loginDate;
	}





	public User(String name, String username, String password, String email, String phone, String address,
			String role) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		Address = address;
		Role = role;
	}





	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getRole() {
		return Role;
	}


	public void setRole(String role) {
		Role = role;
	}


	public Timestamp getCreated_Date() {
		return created_Date;
	}


	public void setCreated_Date(Timestamp created_Date) {
		this.created_Date = created_Date;
	}


	public Timestamp getLast_loginDate() {
		return last_loginDate;
	}


	public void setLast_loginDate(Timestamp last_loginDate) {
		this.last_loginDate = last_loginDate;
	}


	@Override
	public String toString() {
		return "User: ["+name + " "+ username +" "+password +" "+Address+"]";
				
	}
	
	

	














}
