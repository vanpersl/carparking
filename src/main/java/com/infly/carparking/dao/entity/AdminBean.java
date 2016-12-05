package com.infly.carparking.dao.entity;

public class AdminBean {
	private int id;
	private String adminName;
	private String adminPassword;
	private String adminRname;
	private String adminStatus;
	private String adminCpaname;

	public String getAdminCpaname() {
		return adminCpaname;
	}

	public void setAdminCpaname(String adminCpaname) {
		this.adminCpaname = adminCpaname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminRname() {
		return adminRname;
	}

	public void setAdminRname(String adminRname) {
		this.adminRname = adminRname;
	}

	public String getAdminStatus() {
		return adminStatus;
	}

	public void setAdminStatus(String adminStatus) {
		this.adminStatus = adminStatus;
	}
}