package com.infly.carparking.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.infly.carparking.dao.QueryDao;
import com.infly.carparking.dao.entity.CpaRecordBean;
import com.infly.carparking.dao.entity.UserInfoBean;
import com.opensymphony.xwork2.ActionSupport;

public class ShowMyRecord extends ActionSupport{
	private List<CpaRecordBean> cpb;

	public List<CpaRecordBean> getCpb() {
		return cpb;
	}

	public void setCpb(List<CpaRecordBean> cpb) {
		this.cpb = cpb;
	}
	
	@SuppressWarnings("unchecked")
	public String execute(){
		HttpSession session = ServletActionContext.getRequest().getSession();
		UserInfoBean uib = (UserInfoBean)session.getAttribute("ui");
		cpb = QueryDao.queryCpb(uib.getUserInfoCarno());
		return SUCCESS;
	}
}