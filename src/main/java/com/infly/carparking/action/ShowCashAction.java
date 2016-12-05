package com.infly.carparking.action;

import java.util.List;

import com.infly.carparking.dao.QueryDao;
import com.infly.carparking.dao.entity.CashBean;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ShowCashAction extends ActionSupport{
	private List<CashBean> cb;
	
	public List<CashBean> getCb() {
		return cb;
	}

	public void setCb(List<CashBean> cb) {
		this.cb = cb;
	}

	@SuppressWarnings("unchecked")
	public String execute(){
		cb = QueryDao.queryCashBean();
		return SUCCESS;
	}
}