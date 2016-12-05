package com.infly.carparking.action;

import java.util.List;

import com.infly.carparking.dao.QueryDao;
import com.infly.carparking.dao.entity.CardRechargeBean;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ShowReRecordAction extends ActionSupport{
	int i = 1;
	private int k;
	private int pageNow = 1; 
	private int pageSize = 20; 
	private int intRowCount;
	private int intPageCount;
	private List<CardRechargeBean> ccb;
	private int id;
	private int aid;
	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
	}
	public int getPageNow() {
		return pageNow;
	}
	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getIntRowCount() {
		return intRowCount;
	}
	public void setIntRowCount(int intRowCount) {
		this.intRowCount = intRowCount;
	}
	public int getIntPageCount() {
		return intPageCount;
	}
	public void setIntPageCount(int intPageCount) {
		this.intPageCount = intPageCount;
	}
	public List<CardRechargeBean> getCcb() {
		return ccb;
	}
	public void setCcb(List<CardRechargeBean> ccb) {
		this.ccb = ccb;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	@SuppressWarnings("unchecked")
	public String execute(){
		intRowCount = QueryDao.countAll("CardRechargeBean");
		k = (intRowCount + pageSize - 1) / pageSize;
		intPageCount = (intRowCount + pageSize - 1) / pageSize;
		if (pageNow <= 1) {
			pageNow = 1;
		}
		if (pageNow > intPageCount) {
			pageNow = intPageCount;
		}
		i = (pageNow - 1) * pageSize;
		if (null != QueryDao.queryBeanByPage(i, pageSize, "CardRechargeBean")) {
			ccb = QueryDao.queryBeanByPage(pageSize, pageNow, "CardRechargeBean");
			return SUCCESS;
		} else {
			return "error";
		}
	}
}
