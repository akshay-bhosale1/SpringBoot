package com.example.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private Long userId;
	private String name;
	private String phone;
	
	List<Contact> contats=new ArrayList<Contact>();

	public User(Long userId, String name, String phone, List<Contact> contats) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		this.contats = contats;
	}

	public User(Long userId, String name, String phone) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}

	public User() {
		super();
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Contact> getContats() {
		return contats;
	}

	public void setContats(List<Contact> contats) {
		this.contats = contats;
	}
	
	

}
