package com.infly.carparking.action;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.infly.carparking.bis.LoginIdentity;
import com.infly.carparking.dao.QueryDao;
import com.infly.carparking.dao.entity.CpaNewsBean;
import com.infly.carparking.dao.entity.CpaParamBean;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String name;
	private String password;
	private String loginStatus;
	private List<CpaParamBean> cpb;

	public List<CpaParamBean> getCpb() {
		return cpb;
	}

	public void setCpb(List<CpaParamBean> cpb) {
		this.cpb = cpb;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}

	@SuppressWarnings("unchecked")
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		List cnbList =  QueryDao.queryCnb();
		CpaNewsBean cnb = new CpaNewsBean();
		if (session.getAttribute("newsList") == null){/*
			for (Iterator it = cnbList.iterator(); it.hasNext();) {
				MiddleNewsBean mnb = new MiddleNewsBean();
				cnb = (CpaNewsBean) it.next();
				mnb.setId(cnb.getId());
				mnb.setTitle(cnb.getTitle());
				cnbList.add(mnb);
			}*/
			session.setAttribute("newsList", cnbList);
		}		
		cpb = QueryDao.queryAllCpaParam();
		session.setAttribute("cpaname", cpb);
		System.out.println(name);
		System.out.println(password);
		System.out.println(loginStatus);
		LoginIdentity li = new LoginIdentity(); 
		return li.ident(name, password, loginStatus);
	}
}
