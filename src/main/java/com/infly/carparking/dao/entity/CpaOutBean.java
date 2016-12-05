package com.infly.carparking.dao.entity;

import java.util.Date;

public class CpaOutBean {
	private int id;
	private Date cpaOutTime;
	private String cpaOutCarno;
	private String cpaOutBt;
	private String cpaOutEn;
	private String cpaOutOpt;
	private float cpaOutFee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCpaOutTime() {
		return cpaOutTime;
	}

	public void setCpaOutTime(Date cpaOutTime) {
		this.cpaOutTime = cpaOutTime;
	}

	public String getCpaOutCarno() {
		return cpaOutCarno;
	}

	public void setCpaOutCarno(String cpaOutCarno) {
		this.cpaOutCarno = cpaOutCarno;
	}

	public String getCpaOutBt() {
		return cpaOutBt;
	}

	public void setCpaOutBt(String cpaOutBt) {
		this.cpaOutBt = cpaOutBt;
	}

	public String getCpaOutEn() {
		return cpaOutEn;
	}

	public void setCpaOutEn(String cpaOutEn) {
		this.cpaOutEn = cpaOutEn;
	}

	public String getCpaOutOpt() {
		return cpaOutOpt;
	}

	public void setCpaOutOpt(String cpaOutOpt) {
		this.cpaOutOpt = cpaOutOpt;
	}

	public float getCpaOutFee() {
		return cpaOutFee;
	}

	public void setCpaOutFee(float cpaOutFee) {
		this.cpaOutFee = cpaOutFee;
	}
}
