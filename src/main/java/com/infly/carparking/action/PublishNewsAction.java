package com.infly.carparking.action;

import java.util.Date;

import com.infly.carparking.dao.InsertDataDao;
import com.infly.carparking.dao.entity.CpaNewsBean;
import com.opensymphony.xwork2.ActionSupport;

public class PublishNewsAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1354397839629076974L;
	private String title;
	private String msg;
	private String atatach;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getAtatach() {
		return atatach;
	}

	public void setAtatach(String atatach) {
		this.atatach = atatach;
	}

	public String execute() {
		CpaNewsBean cnb = new CpaNewsBean();
		cnb.setAtatach(atatach);
		cnb.setContent(msg);
		cnb.setDate(new Date());
		cnb.setTitle(title);
		
		InsertDataDao.publishNew(cnb);
		System.out.println(title);
		System.out.println(msg);
		System.out.println(atatach);
		
		return SUCCESS;
	}
}
