package com.infly.carparking.action;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.infly.carparking.bis.CalcTime;
import com.infly.carparking.bis.StaffRecord;
import com.infly.carparking.dao.DataModifyDao;
import com.infly.carparking.dao.InsertDataDao;
import com.infly.carparking.dao.entity.AdminArchBean;
import com.infly.carparking.dao.entity.AdminBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport {

	public String execute() {
		HttpSession session = ServletActionContext.getRequest().getSession();
		AdminBean ab = (AdminBean) session.getAttribute("obj");
		DataModifyDao.adminStatusChange(ab, "δ��¼");
		
		CalcTime cal = new CalcTime();
		Date logoutDate = new Date();
		AdminArchBean aab = new AdminArchBean();
		aab.setAdminArchCpaname(StaffRecord.cpaname);
		aab.setAdminArchLt(StaffRecord.entertime);
		aab.setAdminArchName(StaffRecord.adminname);
		aab.setAdminArchNo(StaffRecord.dealNum);
		aab.setAdminArchFee(StaffRecord.cash);
		aab.setAdminArchWorktime(cal.calcTimeStr(StaffRecord.entertime, logoutDate));
		aab.setAdminArchOt(logoutDate);
		
		InsertDataDao.staffRecordInsert(aab);
		StaffRecord.dealNum = 0;
		StaffRecord.cash = 0;
		
		ActionContext.getContext().getSession().remove("obj");
		return "success";
	}
}
