package com.infly.carparking.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.infly.carparking.dao.entity.AdminArchBean;
import com.infly.carparking.dao.entity.AdminBean;
import com.infly.carparking.dao.entity.CardRechargeBean;
import com.infly.carparking.dao.entity.CpaEnterBean;
import com.infly.carparking.dao.entity.CpaNewsBean;
import com.infly.carparking.dao.entity.CpaParamBean;
import com.infly.carparking.dao.entity.CpaRecordBean;
import com.infly.carparking.dao.entity.UserCardBean;
import com.infly.carparking.dao.entity.UserInfoBean;
import com.infly.carparking.util.HibernateUtil;

public class InsertDataDao {
	public static void publishNew(CpaNewsBean cnb) {
		Session session = null;
		session = HibernateUtil.getSession();
		Transaction tran = session.beginTransaction();
		session.save(cnb);
		tran.commit();
		session.flush();
		session.close();
	}
	
	public static void carEnterCpa(CpaEnterBean obj) {
		Session session = null;
		session = HibernateUtil.getSession();
		Transaction tran = session.beginTransaction();
		session.save(obj);
		tran.commit();
		session.flush();
		session.close();
	}

	public static void cpaRecordInsert(CpaRecordBean cpb) {
		Session session = null;
		session = HibernateUtil.getSession();
		Transaction tran = session.beginTransaction();
		session.save(cpb);
		tran.commit();
		session.flush();
		session.close();
	}

	public static void cpaParamInsert(CpaParamBean cpb) {
		Session session = null;
		session = HibernateUtil.getSession();
		Transaction tran = session.beginTransaction();
		session.save(cpb);
		tran.commit();
		session.flush();
		session.close();
	}
	
	public static void adminInsert(AdminBean ab) {
		Session session = null;
		session = HibernateUtil.getSession();
		Transaction tran = session.beginTransaction();
		session.save(ab);
		tran.commit();
		session.flush();
		session.close();
	}
	
	public static void userInfoInsert(UserInfoBean uib) {
		Session session = null;
		session = HibernateUtil.getSession();
		Transaction tran = session.beginTransaction();
		session.save(uib);
		tran.commit();
		session.flush();
		session.close();
	}
	
	public static void userCardInsert(UserCardBean ucb) {
		Session session = null;
		session = HibernateUtil.getSession();
		Transaction tran = session.beginTransaction();
		session.save(ucb);
		tran.commit();
		session.flush();
		session.close();
	}
	
	public static void cardRechargeInsert(CardRechargeBean crb) {
		Session session = null;
		session = HibernateUtil.getSession();
		Transaction tran = session.beginTransaction();
		session.save(crb);
		tran.commit();
		session.flush();
		session.close();
	}
	
	public static void staffRecordInsert(AdminArchBean aab) {
		Session session = null;
		session = HibernateUtil.getSession();
		Transaction tran = session.beginTransaction();
		session.save(aab);
		tran.commit();
		session.flush();
		session.close();
	}
}
