package com.infly.carparking.dao.entity;

import java.util.Date;

public class CardRechargeBean {
	private int id;
	private int cardRechargeNo;
	private float cardRechargeNum;
	private String cardRechargeOpt;
	private Date cardRechargeTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCardRechargeNo() {
		return cardRechargeNo;
	}

	public void setCardRechargeNo(int cardRechargeNo) {
		this.cardRechargeNo = cardRechargeNo;
	}

	public float getCardRechargeNum() {
		return cardRechargeNum;
	}

	public void setCardRechargeNum(float cardRechargeNum) {
		this.cardRechargeNum = cardRechargeNum;
	}

	public String getCardRechargeOpt() {
		return cardRechargeOpt;
	}

	public void setCardRechargeOpt(String cardRechargeOpt) {
		this.cardRechargeOpt = cardRechargeOpt;
	}

	public Date getCardRechargeTime() {
		return cardRechargeTime;
	}

	public void setCardRechargeTime(Date cardRechargeTime) {
		this.cardRechargeTime = cardRechargeTime;
	}
}
