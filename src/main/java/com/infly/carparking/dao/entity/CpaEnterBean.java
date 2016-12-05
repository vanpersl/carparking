package com.infly.carparking.dao.entity;

import java.util.Date;

public class CpaEnterBean {
	private int id;
	private Date cpaEnterTime;
	private String cpaEnterCarno;
	private String cpaEnterBt;
	private String cpaEnterEn;
	private String cpaEnterStatus;
	private String cpaEnterOpt;
	private String cpaEnterCarbz;
	private String cpaEnterType;
	private String cpaEnterCpaname;

	public String getCpaEnterCarbz() {
		return cpaEnterCarbz;
	}

	public void setCpaEnterCarbz(String cpaEnterCarbz) {
		this.cpaEnterCarbz = cpaEnterCarbz;
	}

	public String getCpaEnterType() {
		return cpaEnterType;
	}

	public void setCpaEnterType(String cpaEnterType) {
		this.cpaEnterType = cpaEnterType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCpaEnterTime() {
		return cpaEnterTime;
	}

	public void setCpaEnterTime(Date cpaEnterTime) {
		this.cpaEnterTime = cpaEnterTime;
	}

	public String getCpaEnterCarno() {
		return cpaEnterCarno;
	}

	public void setCpaEnterCarno(String cpaEnterCarno) {
		this.cpaEnterCarno = cpaEnterCarno;
	}

	public String getCpaEnterBt() {
		return cpaEnterBt;
	}

	public void setCpaEnterBt(String cpaEnterBt) {
		this.cpaEnterBt = cpaEnterBt;
	}

	public String getCpaEnterEn() {
		return cpaEnterEn;
	}

	public void setCpaEnterEn(String cpaEnterEn) {
		this.cpaEnterEn = cpaEnterEn;
	}

	public String getCpaEnterStatus() {
		return cpaEnterStatus;
	}

	public void setCpaEnterStatus(String cpaEnterStatus) {
		this.cpaEnterStatus = cpaEnterStatus;
	}

	public String getCpaEnterOpt() {
		return cpaEnterOpt;
	}

	public void setCpaEnterOpt(String cpaEnterOpt) {
		this.cpaEnterOpt = cpaEnterOpt;
	}

	public String getCpaEnterCpaname() {
		return cpaEnterCpaname;
	}

	public void setCpaEnterCpaname(String cpaEnterCpaname) {
		this.cpaEnterCpaname = cpaEnterCpaname;
	}
}
