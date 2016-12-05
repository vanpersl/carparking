package com.infly.carparking.action;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.infly.carparking.bis.StaffRecord;
import com.infly.carparking.bis.SurplusNum;
import com.infly.carparking.dao.InsertDataDao;
import com.infly.carparking.dao.entity.AdminBean;
import com.infly.carparking.dao.entity.CpaEnterBean;
import com.opensymphony.xwork2.ActionSupport;

public class CarEnterAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5668005285275980009L;
	private String carNo;
	private String head;
	private String scnd;
	private String lastFive;
	private String carType;
	private String carBt;
	private String carEn;
	private String carStatus;
	private String carOpt;
	private String carBz; 

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getScnd() {
		return scnd;
	}

	public void setScnd(String scnd) {
		this.scnd = scnd;
	}

	public String getLastFive() {
		return lastFive;
	}

	public void setLastFive(String lastFive) {
		this.lastFive = lastFive;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCarBt() {
		return carBt;
	}

	public void setCarBt(String carBt) {
		this.carBt = carBt;
	}

	public String getCarEn() {
		return carEn;
	}

	public void setCarEn(String carEn) {
		this.carEn = carEn;
	}

	public String getCarStatus() {
		return carStatus;
	}

	public void setCarStatus(String carStatus) {
		this.carStatus = carStatus;
	}

	public String getCarOpt() {
		return carOpt;
	}

	public void setCarOpt(String carOpt) {
		this.carOpt = carOpt;
	}

	public String getCarBz() {
		return carBz;
	}

	public void setCarBz(String carBz) {
		this.carBz = carBz;
	}

	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		AdminBean ab = new AdminBean();
		ab = (AdminBean) session.getAttribute("obj");

		carNo = head + scnd + lastFive.toUpperCase();

		CpaEnterBean ceb = new CpaEnterBean();
		// ��һ������ʱ����Ĵ��󣬱����������ʱ���Ƿ���ȣ���������ˢ�´����Ĳ��롣
		try {
			ceb.setCpaEnterBt(carBt);
			ceb.setCpaEnterCarbz(carBz);
			ceb.setCpaEnterEn(new SurplusNum().getUUID());
			ceb.setCpaEnterCarno(carNo);
			ceb.setCpaEnterOpt(ab.getAdminRname());
			ceb.setCpaEnterStatus("ͣ��");
			ceb.setCpaEnterTime(new Date());
			ceb.setCpaEnterType(carType);
			ceb.setCpaEnterCpaname(ab.getAdminCpaname());

			InsertDataDao.carEnterCpa(ceb);

			StaffRecord.dealNum++;

			return SUCCESS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "failure";
		}
	}
}