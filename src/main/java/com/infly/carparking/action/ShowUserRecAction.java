package com.infly.carparking.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.infly.carparking.dao.QueryDao;
import com.infly.carparking.dao.entity.CardRechargeBean;
import com.infly.carparking.dao.entity.UserInfoBean;
import com.opensymphony.xwork2.ActionSupport;

public class ShowUserRecAction extends ActionSupport{
	private List<CardRechargeBean> ccb;

	public List<CardRechargeBean> getCcb() {
		return ccb;
	}

	public void setCcb(List<CardRechargeBean> ccb) {
		this.ccb = ccb;
	}
	
	@SuppressWarnings("unchecked")
	public String execute(){
		HttpSession session = ServletActionContext.getRequest().getSession();
		UserInfoBean uib = (UserInfoBean)session.getAttribute("ui");
		ccb = QueryDao.queryCrb(uib.getUserInfoNo());
		return SUCCESS;
	}
}
