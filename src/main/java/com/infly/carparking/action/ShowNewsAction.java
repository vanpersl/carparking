package com.infly.carparking.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.infly.carparking.dao.QueryDao;
import com.infly.carparking.dao.entity.CpaNewsBean;
import com.opensymphony.xwork2.ActionSupport;

public class ShowNewsAction extends ActionSupport{
	private String flag;
	private List<CpaNewsBean> cnb;
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public List<CpaNewsBean> getCnb() {
		return cnb;
	}
	public void setCnb(List<CpaNewsBean> cnb) {
		this.cnb = cnb;
	}
	public String execute(){
		HttpSession session = ServletActionContext.getRequest().getSession();
		flag = "nonull";
		session.setAttribute("newsList", QueryDao.queryCnb());
		return SUCCESS;
	}
}
