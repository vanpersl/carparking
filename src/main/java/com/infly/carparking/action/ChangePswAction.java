package com.infly.carparking.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.infly.carparking.dao.DataModifyDao;
import com.infly.carparking.dao.entity.UserInfoBean;
import com.opensymphony.xwork2.ActionSupport;

public class ChangePswAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8205221345976307188L;
	private String psw;
	private String pin;
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	public String execute(){
		HttpSession session = ServletActionContext.getRequest().getSession();
		DataModifyDao.userChangePsw((UserInfoBean)session.getAttribute("ui"), psw);
		return SUCCESS;
	}
}
