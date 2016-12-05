package com.infly.carparking.action;

import com.opensymphony.xwork2.ActionSupport;

import com.infly.carparking.dao.InsertDataDao;
import com.infly.carparking.dao.entity.AdminBean;

public class AddAdminAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -351733498711470908L;
	private String name;
	private String rname;
	private String password;
	private String pin;
	private String cpaname;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
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

	public String getCpaname() {
		return cpaname;
	}

	public void setCpaname(String cpaname) {
		this.cpaname = cpaname;
	}

	public String execute() {
		AdminBean ab = new AdminBean();
		ab.setAdminCpaname(cpaname);
		ab.setAdminName(name);
		ab.setAdminPassword(password);
		ab.setAdminRname(rname);
		ab.setAdminStatus("成功");

		InsertDataDao.adminInsert(ab);
		return SUCCESS;
	}
}
