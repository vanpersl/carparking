package com.infly.carparking.action;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.infly.carparking.bis.StaffRecord;
import com.infly.carparking.dao.DataModifyDao;
import com.infly.carparking.dao.InsertDataDao;
import com.infly.carparking.dao.entity.AdminBean;
import com.infly.carparking.dao.entity.CardRechargeBean;
import com.opensymphony.xwork2.ActionSupport;

public class RechargeAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 594424609095020179L;
	private int cardno;
	private float num;

	public int getCardno() {
		return cardno;
	}

	public void setCardno(int cardno) {
		this.cardno = cardno;
	}

	public float getNum() {
		return num;
	}

	public void setNum(float num) {
		this.num = num;
	}

	public String execute() {
		HttpSession session = ServletActionContext.getRequest().getSession();
		AdminBean ab = (AdminBean) session.getAttribute("obj");
		
		
		System.out.println(cardno);
		System.out.println(num);
		CardRechargeBean crb = new CardRechargeBean();
		crb.setCardRechargeNo(cardno);
		crb.setCardRechargeNum(num);
		crb.setCardRechargeOpt(ab.getAdminRname());
		crb.setCardRechargeTime(new Date());

		InsertDataDao.cardRechargeInsert(crb);
		DataModifyDao.userRecharge(cardno, num);
		DataModifyDao.optGetCash(ab.getAdminRname(), num);
		
		StaffRecord.cash += num;
		StaffRecord.dealNum++;
		
		return SUCCESS;
	}
}
