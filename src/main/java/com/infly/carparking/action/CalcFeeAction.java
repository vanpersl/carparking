package com.infly.carparking.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.infly.carparking.bis.CalcFee;
import com.infly.carparking.bis.StaffRecord;
import com.infly.carparking.dao.DataModifyDao;
import com.infly.carparking.dao.InsertDataDao;
import com.infly.carparking.dao.MoveDataDao;
import com.infly.carparking.dao.QueryDao;
import com.infly.carparking.dao.entity.AdminBean;
import com.infly.carparking.dao.entity.CpaRecordBean;
import com.infly.carparking.dao.entity.UserCardBean;
import com.opensymphony.xwork2.ActionSupport;

public class CalcFeeAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6499644712602200310L;
	private String outCarNo;
	private String cardNo;
	private String payType;
	private String parkTime;
	private float pkFee;
	private float pkUn;

	public float getPkUn() {
		return pkUn;
	}

	public void setPkUn(float pkUn) {
		this.pkUn = pkUn;
	}

	public String getParkTime() {
		return parkTime;
	}

	public void setParkTime(String parkTime) {
		this.parkTime = parkTime;
	}

	public float getPkFee() {
		return pkFee;
	}

	public void setPkFee(float pkFee) {
		this.pkFee = pkFee;
	}

	public String getOutCarNo() {
		return outCarNo;
	}

	public void setOutCarNo(String outCarNo) {
		this.outCarNo = outCarNo;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String execute() {
		String flag = "success";
		String ott = null;
		HttpSession session = ServletActionContext.getRequest().getSession();
		AdminBean ab = new AdminBean();
		ab = (AdminBean) session.getAttribute("obj");

		CpaRecordBean cpb = new CpaRecordBean();
		CalcFee clc = new CalcFee();
		float fee = clc.totalFee(outCarNo);
		ott = CalcFee.ot;
		setPkFee(fee);
		setParkTime(ott);
		cpb.setCpaRecordBt(CalcFee.ceb.getCpaEnterBt());
		if (!payType.equals("现金")) {
			UserCardBean ucb = QueryDao
					.queryOneRecord(Integer.parseInt(cardNo));
			if (ucb.getUserCardBalance() < fee) {
				flag = "error";
				pkUn = fee - ucb.getUserCardBalance();
				DataModifyDao.userCardModify(ucb, "cost", String.valueOf(ucb.getUserCardBalance()));
			} else {
				DataModifyDao.userCardModify(ucb, "cost", String.valueOf(fee));
				pkUn = 0;
			}
			cpb.setCpaRecordCardno(Integer.parseInt(cardNo));
		} else {
			pkUn = 0;
			StaffRecord.cash += fee;
			DataModifyDao.optGetCash(ab.getAdminRname(), fee);
			cpb.setCpaRecordCardno(0);
		}
		cpb.setCpaRecordCarno(outCarNo);
		cpb.setCpaRecordCpaname(CalcFee.ceb.getCpaEnterCpaname());
		cpb.setCpaRecordCpn(CalcFee.ceb.getCpaEnterEn());
		cpb.setCpaRecordEt(CalcFee.enterTime);
		cpb.setCpaRecordFee(fee);
		cpb.setCpaRecordOpte(CalcFee.ceb.getCpaEnterOpt());
		cpb.setCpaRecordType(CalcFee.ceb.getCpaEnterType());
		cpb.setCpaRecordOpto(ab.getAdminRname());
		cpb.setCpaRecordOt(CalcFee.outDate);
		cpb.setCpaRecordPft(payType);
		cpb.setCpaRecordPt(ott);
		cpb.setCpaRecordStatus("正常完成出场");
		cpb.setCpaRecordCarbz(CalcFee.ceb.getCpaEnterCarbz());
		System.out.println("************完成出场**************");

		MoveDataDao.moveCpaEnterCar(outCarNo);
		InsertDataDao.cpaRecordInsert(cpb);

		StaffRecord.dealNum++;

		return flag;
	}
}
