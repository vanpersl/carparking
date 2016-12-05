package com.infly.carparking.dao.entity;

import java.util.Date;

public class UserCardBean {
	private int id;
	private int userCardNo;
	private String userCardDiscount;
	private float userCardBalance;
	private float userCardCost;
	private Date userCardHt;
	private String userCardStatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserCardNo() {
		return userCardNo;
	}

	public void setUserCardNo(int userCardNo) {
		this.userCardNo = userCardNo;
	}

	public String getUserCardDiscount() {
		return userCardDiscount;
	}
	

	public float getUserCardCost() {
		return userCardCost;
	}

	public void setUserCardCost(float userCardCost) {
		this.userCardCost = userCardCost;
	}

	public void setUserCardDiscount(String userCardDiscount) {
		this.userCardDiscount = userCardDiscount;
	}

	public float getUserCardBalance() {
		return userCardBalance;
	}

	public void setUserCardBalance(float userCardBalance) {
		this.userCardBalance = userCardBalance;
	}

	public Date getUserCardHt() {
		return userCardHt;
	}

	public void setUserCardHt(Date userCardHt) {
		this.userCardHt = userCardHt;
	}

	public String getUserCardStatus() {
		return userCardStatus;
	}

	public void setUserCardStatus(String userCardStatus) {
		this.userCardStatus = userCardStatus;
	}
}
