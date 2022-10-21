package com.example.entity;

public class Contact {
	
	private Long cId;
	private String contactName;
	private String  email;
	private Long UserId;
	public Contact(Long cId, String contactName, String email, Long userId) {
		super();
		this.cId = cId;
		this.contactName = contactName;
		this.email = email;
		UserId = userId;
	}
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getUserId() {
		return UserId;
	}
	public void setUserId(Long userId) {
		UserId = userId;
	}
	

}
