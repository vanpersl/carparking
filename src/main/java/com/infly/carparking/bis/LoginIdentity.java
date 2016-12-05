package com.infly.carparking.bis;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.infly.carparking.dao.DataModifyDao;
import com.infly.carparking.dao.QueryDao;
import com.infly.carparking.dao.entity.AdminBean;

public class LoginIdentity {
	public String ident(String name, String password, String loginStatus) {
		String res = null;
		if (loginStatus.equals("operator")) {
			AdminBean ab = new AdminBean();
			List list = QueryDao.queryAdmin(name);
			if (!(list.size() > 0)) {
				res =  "failure";
			} else {
				for (Iterator it = list.iterator(); it.hasNext();) {
					ab = (AdminBean) it.next();
				}
				if (ab.getAdminPassword().equals(password)
						&& ab.getAdminStatus().equals("正常")) {
					StaffRecord.adminname = ab.getAdminRname();
					StaffRecord.entertime = new Date();
					StaffRecord.cpaname = ab.getAdminCpaname();
					HttpSession session = ServletActionContext.getRequest().getSession();
				    session.setAttribute("obj", ab);				     
					DataModifyDao.adminStatusChange(ab, "�ѵ�¼");
					res = "optsuc";
				} else {
					res = "loginedopt";
				}
			}
		}
		if (loginStatus.equals("admin")) {
			if (!name.equals("superman")) {
				res = "failure";
			} else {
				AdminBean ab = new AdminBean();
				List list = QueryDao.queryAdmin(name);
				if (!(list.size() > 0)) {
					res = "failure";
				} else {
					for (Iterator it = list.iterator(); it.hasNext();) {
						ab = (AdminBean) it.next();
					}
					if (ab.getAdminPassword().equals(password)
							&& ab.getAdminStatus().equals("正常")) {
						HttpSession session = ServletActionContext.getRequest().getSession();
					    session.setAttribute("obja", ab);					    
						DataModifyDao.adminStatusChange(ab,"正常");
						res = "admsuc";
					} else {
						res = "logined";
					}
				}
			}
		}
		return res;
	}
}
