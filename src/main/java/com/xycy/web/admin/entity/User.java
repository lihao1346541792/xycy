package com.xycy.web.admin.entity;


import java.io.Serializable;
import java.util.List;

public class User implements Serializable{
	private Long userId;
	private String userName;
	private String password;
	private String passwordSalt;
	private List<String> powers;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordSalt() {
		return passwordSalt;
	}
	public void setPasswordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
	}
	public List<String> getPowers() {
		return powers;
	}
	public void setPowers(List<String> powers) {
		this.powers = powers;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", passwordSalt="
				+ passwordSalt + ", powers=" + powers + "]";
	}
	
	
}
