package com.infly.carparking.action;

import com.infly.carparking.dao.DataModifyDao;
import com.infly.carparking.dao.QueryDao;
import com.infly.carparking.dao.entity.AdminBean;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAdmAction extends ActionSupport{
	
	public String execute(){
		DataModifyDao.adminStatusChange((AdminBean)QueryDao.queryAdmin("superman").iterator().next(), "启用");
		return SUCCESS;
	}
}
