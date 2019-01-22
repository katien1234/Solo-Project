package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long accountId;
	private String username;
	private String password;
	
	public Account() {

	}
	
	public Account(Long accountId, String username, String password) {
		this.accountId = accountId;
		this.username = username;
		this.password = password;
	}

	public Long getAccountId() {
		return accountId;
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
	
	
	
	
	
	
}
