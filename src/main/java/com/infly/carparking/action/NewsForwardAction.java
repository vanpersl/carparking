package com.infly.carparking.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.infly.carparking.dao.QueryDao;
import com.infly.carparking.dao.entity.CpaNewsBean;
import com.opensymphony.xwork2.ActionSupport;

public class NewsForwardAction extends ActionSupport{
	private CpaNewsBean cnb;

	public CpaNewsBean getCnb() {
		return cnb;
	}

	public void setCnb(CpaNewsBean cnb) {
		this.cnb = cnb;
	}
	
	public String execute(){
		String str = ServletActionContext.getRequest().getParameter("uid");
		List cnbList =  QueryDao.queryCnbById(Integer.parseInt(str));
		cnb = (CpaNewsBean)cnbList.iterator().next();		
		return SUCCESS;
	}
}
