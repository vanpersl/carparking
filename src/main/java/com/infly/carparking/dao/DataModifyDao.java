package com.infly.carparking.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.infly.carparking.dao.entity.AdminBean;
import com.infly.carparking.dao.entity.CashBean;
import com.infly.carparking.dao.entity.UserCardBean;
import com.infly.carparking.dao.entity.UserInfoBean;
import com.infly.carparking.util.HibernateUtil;

public class DataModifyDao {
	
	public static void userRecharge(int cardNo, float num){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction(); 
		 
		UserCardBean ucb=new UserCardBean();
		UserCardBean ucb1 = QueryDao.queryOneRecord(cardNo);
		session.load(ucb,ucb1.getId()); 
		ucb.setUserCardCost(ucb1.getUserCardCost());
		ucb.setUserCardDiscount(ucb.getUserCardDiscount());
		ucb.setUserCardHt(ucb1.getUserCardHt());
		ucb.setUserCardNo(ucb1.getUserCardNo());
		ucb.setId(ucb1.getId());
		ucb.setUserCardStatus(ucb1.getUserCardStatus());
		ucb.setUserCardBalance(ucb1.getUserCardBalance() + num);
		tx.commit(); 
		session.flush();
		session.close();
	}
	
	public static void adminStatusChange(AdminBean ab, String status){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction(); 
		 
		AdminBean nab = new AdminBean();
		session.load(nab,ab.getId()); 
		nab.setAdminCpaname(ab.getAdminCpaname());
		nab.setAdminName(ab.getAdminName());
		nab.setAdminPassword(ab.getAdminPassword());
		nab.setAdminRname(ab.getAdminRname());
		nab.setAdminStatus(status);
		nab.setId(ab.getId());
		tx.commit(); 
		session.flush();
		session.close();
	}
	
	public static void userChangePsw(UserInfoBean uib, String psw){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction(); 
		 
		UserInfoBean nui = new UserInfoBean();
		session.load(nui,uib.getId()); 
		nui.setId(uib.getId());
		nui.setUserInfoAddress(uib.getUserInfoAddress());
		nui.setUserInfoCarno(uib.getUserInfoCarno());
		nui.setUserInfoName(uib.getUserInfoName());
		nui.setUserInfoNo(uib.getUserInfoNo());
		nui.setUserInfoPassword(psw);
		nui.setUserInfoSex(uib.getUserInfoSex());
		nui.setUserInfoTel(uib.getUserInfoTel());
		tx.commit(); 
		session.flush();
		session.close();
	}
	
	public static void userCardModify(UserCardBean ucb, String row, String value){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction(); 
		 
		UserCardBean nucb = new UserCardBean();
		session.load(nucb,ucb.getId()); 
		if (row.equals("status")){
			nucb.setUserCardStatus(value);
			nucb.setUserCardCost(ucb.getUserCardCost());
			nucb.setUserCardBalance(ucb.getUserCardBalance());
		}
		else {
			nucb.setUserCardStatus(ucb.getUserCardStatus());
			nucb.setUserCardBalance(ucb.getUserCardBalance() - Float.parseFloat(value));
			nucb.setUserCardCost(Float.parseFloat(value) + ucb.getUserCardCost());
		}
		nucb.setId(ucb.getId());
		nucb.setUserCardDiscount(ucb.getUserCardDiscount());
		nucb.setUserCardNo(ucb.getUserCardNo());
		nucb.setUserCardHt(ucb.getUserCardHt());
		tx.commit(); 
		session.flush();
		session.close();
	}
	
	public static void optGetCash(String name, float num){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction(); 
		
		CashBean cb = new CashBean();
		if (QueryDao.queryCash(name).size() > 0){
			CashBean cbo = (CashBean)QueryDao.queryCash(name).iterator().next();
			session.load(cb,cbo.getId()); 
			cb.setName(cbo.getName());
			cb.setId(cbo.getId());
			cb.setNum(cbo.getNum() + num);
		}
		else{
			cb.setName(name);
			cb.setNum(num);
			session.save(cb);
		}
		tx.commit();
		session.flush();
	}
}
