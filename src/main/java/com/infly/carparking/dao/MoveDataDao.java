package com.infly.carparking.dao;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.infly.carparking.util.HibernateUtil;

public class MoveDataDao {
	public static void moveCpaEnterCar(String carNo) {
		Session session = HibernateUtil.getSession();
		Transaction tr = session.beginTransaction();
		Query query = session
				.createQuery("Delete CpaEnterBean where cpaEnterCarno = ? ");
		query.setString(0, carNo);
		query.executeUpdate();
		tr.commit();
		session.flush();
		session.close();
	}
	
	public static void moveAdmin(String adminName) {
		Session session = HibernateUtil.getSession();
		Transaction tr = session.beginTransaction();
		Query query = session
				.createQuery("Delete AdminBean where adminName = ? ");
		query.setString(0, adminName);
		query.executeUpdate();
		tr.commit();
		session.flush();
		session.close();
	}
}
