package com.infly.carparking.dao.entity;

import java.util.Date;

public class AdminArchBean {
	private int id;
	private String adminArchName;
	private Date adminArchLt;
	private Date adminArchOt;
	private int adminArchNo;
	private float adminArchFee;
	private String adminArchCpaname;
	private String adminArchWorktime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdminArchName() {
		return adminArchName;
	}

	public void setAdminArchName(String adminArchName) {
		this.adminArchName = adminArchName;
	}

	public Date getAdminArchLt() {
		return adminArchLt;
	}

	public void setAdminArchLt(Date adminArchLt) {
		this.adminArchLt = adminArchLt;
	}

	public Date getAdminArchOt() {
		return adminArchOt;
	}

	public void setAdminArchOt(Date adminArchOt) {
		this.adminArchOt = adminArchOt;
	}

	public int getAdminArchNo() {
		return adminArchNo;
	}

	public void setAdminArchNo(int adminArchNo) {
		this.adminArchNo = adminArchNo;
	}

	public float getAdminArchFee() {
		return adminArchFee;
	}

	public void setAdminArchFee(float adminArchFee) {
		this.adminArchFee = adminArchFee;
	}

	public String getAdminArchCpaname() {
		return adminArchCpaname;
	}

	public void setAdminArchCpaname(String adminArchCpaname) {
		this.adminArchCpaname = adminArchCpaname;
	}

	public String getAdminArchWorktime() {
		return adminArchWorktime;
	}

	public void setAdminArchWorktime(String adminArchWorktime) {
		this.adminArchWorktime = adminArchWorktime;
	}
}