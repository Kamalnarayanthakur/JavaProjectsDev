package com.dev.Entity;

import jakarta.persistence.Entity;

@Entity
public class User {

	private Long id;
	private String name;
	private String username;
	private String email;
	private String password;
	private int contactnumber;
	
//	getter and setter
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(int contactnumber) {
		this.contactnumber = contactnumber;
	}
	public User(Long id, String name, String username, String email, String password, int contactnumber) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
		this.contactnumber = contactnumber;
	}
	
	
}
