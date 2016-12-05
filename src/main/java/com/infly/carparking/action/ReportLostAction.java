package com.infly.carparking.action;

import com.infly.carparking.dao.DataModifyDao;
import com.infly.carparking.dao.QueryDao;
import com.opensymphony.xwork2.ActionSupport;

public class ReportLostAction extends ActionSupport {
	private int cardno;
	private String act;

	public int getCardno() {
		return cardno;
	}

	public void setCardno(int cardno) {
		this.cardno = cardno;
	}

	public String getAct() {
		return act;
	}

	public void setAct(String act) {
		this.act = act;
	}

	public String execute() {
		System.out.println(cardno);
		System.out.println(act);
		if (act.equals("lock")) {
			DataModifyDao.userCardModify(QueryDao.queryOneRecord(cardno),
					"status", "����");
		} else {
			DataModifyDao.userCardModify(QueryDao.queryOneRecord(cardno),
					"status", "������");
		}
		return SUCCESS;
	}
}
