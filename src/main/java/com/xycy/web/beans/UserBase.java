package com.xycy.web.beans;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class UserBase {
	private Integer id;
	private String nick;
	private String logo;
	private Integer communityId;
	private Timestamp newAt;
	private Timestamp updAt;
	private Integer sex;
	private BigDecimal balance;
	private Integer integral;
	private Integer status;
	private Integer identityId;
	private Integer userId;

	public UserBase() {
		super();
	}

	public UserBase(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getCommunityId() {
		return communityId;
	}

	public void setCommunityId(Integer communityId) {
		this.communityId = communityId;
	}

	public Timestamp getNewAt() {
		return newAt;
	}

	public void setNewAt(Timestamp newAt) {
		this.newAt = newAt;
	}

	public Timestamp getUpdAt() {
		return updAt;
	}

	public void setUpdAt(Timestamp updAt) {
		this.updAt = updAt;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getIntegral() {
		return integral;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIdentityId() {
		return identityId;
	}

	public void setIdentityId(Integer identityId) {
		this.identityId = identityId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

}
