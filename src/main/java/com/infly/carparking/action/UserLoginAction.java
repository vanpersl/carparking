package com.infly.carparking.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.infly.carparking.dao.QueryDao;
import com.infly.carparking.dao.entity.UserCardBean;
import com.infly.carparking.dao.entity.UserInfoBean;
import com.opensymphony.xwork2.ActionSupport;

public class UserLoginAction extends ActionSupport{
	private String name;
	private String password;
	private UserInfoBean uib;
	private UserCardBean ucb;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserCardBean getUcb() {
		return ucb;
	}

	public void setUcb(UserCardBean ucb) {
		this.ucb = ucb;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public UserInfoBean getUib() {
		return uib;
	}

	public void setUib(UserInfoBean uib) {
		this.uib = uib;
	}

	public String execute(){
		HttpSession session = ServletActionContext.getRequest().getSession();
		
		uib = QueryDao.queryUser(name, password);
		if (uib == null){
			return "error";
		}
		else {
			session.setAttribute("ui", uib);
			ucb = QueryDao.queryOneRecord(uib.getUserInfoNo());
			session.setAttribute("uc", ucb);
			return SUCCESS;
		}
	}
}