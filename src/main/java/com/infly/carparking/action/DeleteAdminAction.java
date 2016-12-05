package com.infly.carparking.action;

import java.util.List;

import com.infly.carparking.dao.MoveDataDao;
import com.infly.carparking.dao.QueryDao;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteAdminAction extends ActionSupport{
	private String adminName;

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	
	public String execute(){
		List list = QueryDao.queryAdmin(adminName);
		if (list.size() > 0){
			MoveDataDao.moveAdmin(adminName);
			return SUCCESS;
		}
		else{
			return "error";
		}
	}
}
