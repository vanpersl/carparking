package com.infly.carparking.action;

import java.util.List;

import com.infly.carparking.dao.QueryDao;
import com.infly.carparking.dao.entity.AdminArchBean;
import com.opensymphony.xwork2.ActionSupport;

public class ShowAdmRecordAction extends ActionSupport {
	int i = 1;
	private int k;
	private int pageNow = 1;
	private int pageSize = 20;
	private int intRowCount;
	private int intPageCount;
	private List<AdminArchBean> aab;
	private int id;
	private int aid;

	public List<AdminArchBean> getAab() {
		return aab;
	}

	public void setAab(List<AdminArchBean> aab) {
		this.aab = aab;
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

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {

		intRowCount = QueryDao.countAll("AdminArchBean");
		k = (intRowCount + pageSize - 1) / pageSize;
		intPageCount = (intRowCount + pageSize - 1) / pageSize;
		if (pageNow <= 1) {
			pageNow = 1;
		}
		if (pageNow > intPageCount) {
			pageNow = intPageCount;
		}
		i = (pageNow - 1) * pageSize;
		if (null != QueryDao.queryBeanByPage(i, pageSize, "AdminArchBean")) {
			aab = QueryDao.queryBeanByPage(pageSize, pageNow, "AdminArchBean");
			return SUCCESS;
		} else {
			return "error";
		}
	}
}
