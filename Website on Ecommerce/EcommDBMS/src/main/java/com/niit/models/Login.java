package com.niit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Login {
	@Id  // - property id unique and not null
	@GeneratedValue(strategy=GenerationType.AUTO) //auto generation - automatically generate the value for id
private int id;
private int cust_ID;
private String Username;
private String password;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int cust_ID() {
	return cust_ID;
}
public void setcust_ID(int cust_ID) {
	cust_ID = cust_ID;
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
