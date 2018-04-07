package com.xycy.web.beans;

import java.io.Serializable;
import java.sql.Timestamp;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class UserLogin implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String phone;
	private String passwod;
	private String token;
	private Timestamp tokenExpireAt;
	private Timestamp updAt;
	private Integer hasIdentityAuth;
	private Integer hasCommunityAuth;

	/**
	 * 微信授权获取的信息
	 */
	private String wx;
	private String nick;
	private String logo;

	public UserLogin() {
		super();
	}

	public UserLogin(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPasswod() {
		return passwod;
	}

	public void setPasswod(String passwod) {
		this.passwod = passwod;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Timestamp getTokenExpireAt() {
		return tokenExpireAt;
	}

	public void setTokenExpireAt(Timestamp tokenExpireAt) {
		this.tokenExpireAt = tokenExpireAt;
	}

	public Timestamp getUpdAt() {
		return updAt;
	}

	public void setUpdAt(Timestamp updAt) {
		this.updAt = updAt;
	}

	public Integer getHasIdentityAuth() {
		return hasIdentityAuth;
	}

	public void setHasIdentityAuth(Integer hasIdentityAuth) {
		this.hasIdentityAuth = hasIdentityAuth;
	}

	public Integer getHasCommunityAuth() {
		return hasCommunityAuth;
	}

	public void setHasCommunityAuth(Integer hasCommunityAuth) {
		this.hasCommunityAuth = hasCommunityAuth;
	}

	public String getWx() {
		return wx;
	}

	public void setWx(String wx) {
		this.wx = wx;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
}
