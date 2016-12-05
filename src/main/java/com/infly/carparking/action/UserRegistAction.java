package com.infly.carparking.action;

import java.util.Date;

import com.infly.carparking.bis.CreateNptNum;
import com.infly.carparking.dao.InsertDataDao;
import com.infly.carparking.dao.entity.UserCardBean;
import com.infly.carparking.dao.entity.UserInfoBean;
import com.opensymphony.xwork2.ActionSupport;

public class UserRegistAction extends ActionSupport {
	private String name;
	private String password;
	private String pin;
	private String carno;
	private String tel;
	private String address;
	private String sex;
	private int cardNo;

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getCarno() {
		return carno;
	}

	public void setCarno(String carno) {
		this.carno = carno;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String execute() {
		cardNo = new CreateNptNum().createNum();
		carno = carno.toUpperCase();
		System.out.println("card no:" + cardNo);
		
		UserInfoBean uib = new UserInfoBean();
		uib.setUserInfoAddress(address);
		uib.setUserInfoCarno(carno);
		uib.setUserInfoName(name);
		uib.setUserInfoNo(cardNo);
		uib.setUserInfoPassword(password);
		uib.setUserInfoSex(sex);
		uib.setUserInfoTel(tel);
		
		UserCardBean ucb = new UserCardBean();
		ucb.setUserCardBalance(0);
		ucb.setUserCardDiscount("9折");
		ucb.setUserCardHt(new Date());
		ucb.setUserCardNo(cardNo);
		ucb.setUserCardStatus("启用");
		ucb.setUserCardCost(0);
		
		InsertDataDao.userInfoInsert(uib);
		InsertDataDao.userCardInsert(ucb);
		return SUCCESS;
	}
}