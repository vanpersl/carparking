package com.infly.carparking.dao;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;

import com.infly.carparking.dao.entity.AdminBean;
import com.infly.carparking.dao.entity.CashBean;
import com.infly.carparking.dao.entity.UserCardBean;
import com.infly.carparking.dao.entity.UserInfoBean;
import com.infly.carparking.util.HibernateUtil;

public class QueryDao {

	public static List queryAdmin(String adminName) {
		AdminBean ab = new AdminBean();
		Session session = null;
		List list;
		session = HibernateUtil.getSession();
		Query query = session
				.createQuery("from AdminBean where adminName = ?");
		query.setString(0, adminName);
		list = query.list();
		session.close();
		return list;
	}
	
	public static List queryCash(String name) {
		AdminBean ab = new AdminBean();
		Session session = null;
		List list;
		session = HibernateUtil.getSession();
		Query query = session
				.createQuery("from CashBean where name = ?");
		query.setString(0, name);
		list = query.list();
		session.close();
		return list;
	}
	
	public static List queryCashBean() {
		CashBean ab = new CashBean();
		Session session = null;
		List list;
		session = HibernateUtil.getSession();
		Query query = session
				.createQuery("from CashBean");
		list = query.list();
		session.close();
		return list;
	}
	
	public static UserInfoBean queryUser(String name, String password) {
		Session session = null;
		session = HibernateUtil.getSession();
		UserInfoBean uib = new UserInfoBean();
		Query query = session
				.createQuery("from UserInfoBean where userInfoName = ? and userInfoPassword = ?");
		query.setString(0, name);
		query.setString(1, password);
		while (query.list().size() != 0) {
			uib =  (UserInfoBean)query.list().iterator().next();
			session.close();
			return uib;
		}
		session.close();
		return null;
	}

	public static List queryByPage(int pageSize, int pageNow, String cpaName) {		
		Session session = null;
		List list = null;

		try {

			session = HibernateUtil.getSession();
			Query query = session.createQuery("from CpaEnterBean where cpaEnterCpaname = ?");
			query.setString(0, cpaName);

			query.setFirstResult(pageSize * pageNow - pageSize);
			query.setMaxResults(pageSize);
			list = query.list();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
		}

		return list;
	}
	
	public static List queryCebByPage(int pageSize, int pageNow) {
		HttpSession ses = ServletActionContext.getRequest().getSession();
		AdminBean ab = (AdminBean)ses.getAttribute("obj");
		
		Session session = null;
		List list = null;

		try {

			session = HibernateUtil.getSession();
			Query query = session.createQuery("from CpaEnterBean");

			query.setFirstResult(pageSize * pageNow - pageSize);
			query.setMaxResults(pageSize);
			list = query.list();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
		}

		return list;
	}
	
	public static List queryBeanByPage(int pageSize, int pageNow, String bean) {
		
		Session session = null;
		List list = null;

		try {

			session = HibernateUtil.getSession();
			String HQL = " from " + " " + bean;
			Query query = session.createQuery(HQL);
			
			query.setFirstResult(pageSize * pageNow - pageSize);
			query.setMaxResults(pageSize);
			list = query.list();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
		}

		return list;
	}

	public static List queryCpaRecordByPage(int pageSize, int pageNow) {

		Session session = null;

		List list = null;

		try {

			session = HibernateUtil.getSession();
			Query query = session.createQuery("from CpaRecordBean");

			query.setFirstResult(pageSize * pageNow - pageSize);
			query.setMaxResults(pageSize);
			list = query.list();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
		}

		return list;
	}

	public static int count(String cpaName) {
		int intRowCount = 0;// ������
		Session session = null;
		session = HibernateUtil.getSession();
		Query q = session.createQuery("from CpaEnterBean where cpaEnterCpaname = ?");// ִ�в�ѯ����
		q.setString(0, cpaName);
		intRowCount = q.list().size();// ��ü�¼����
		session.close();
		
		return intRowCount;
	}
	
	public static int countAll(String bean) {
		int intRowCount = 0;
		Session session = null;
		session = HibernateUtil.getSession();
		String hql = "from " +bean;
		Query q = session.createQuery(hql);
		intRowCount = q.list().size();
		
		session.close();
		return intRowCount;
	}

	public static List queryCebByCarno(String carno) {
		List list = null;

		Session session = HibernateUtil.getSession();
		Query query = session
				.createQuery("from CpaEnterBean where cpaEnterCarno = ?");
		query.setString(0, carno);
		list = query.list();
		session.close();

		return list;
	}

	public static List queryCpaParam(String cpaName) {
		List list = null;

		Session session = HibernateUtil.getSession();
		Query query = session
				.createQuery("from CpaParamBean where cpaParamName = ?");
		query.setString(0, cpaName);
		list = query.list();
		session.close();

		return list;
	}
	
	public static List queryAllCpaParam() {
		List list = null;

		Session session = HibernateUtil.getSession();
		Query query = session
				.createQuery("from CpaParamBean");
		list = query.list();
		session.close();

		return list;
	}

	public static UserCardBean queryOneRecord(int value) {
		UserCardBean obj = null;
		Session session = HibernateUtil.getSession();
		Query query = session
				.createQuery("from UserCardBean where userCardNo = ?");
		query.setInteger(0, value);
		List l = query.list();
		Iterator ite = l.iterator();
		if (ite.hasNext()) {
			obj = (UserCardBean) ite.next();
		}
		
		session.close();
		return obj;
	}
	
	public static List queryCrb(int value) {
		Session session = HibernateUtil.getSession();
		Query query = session
				.createQuery("from CardRechargeBean where cardRechargeNo = ?");
		query.setInteger(0, value);
		List l = query.list();;	
		
		session.close();
		return l;
	}
	
	public static List queryCpb(String carNo) {
		Session session = HibernateUtil.getSession();
		Query query = session
				.createQuery("from CpaRecordBean where cpaRecordCarno = ?");
		query.setString(0, carNo);
		List l = query.list();;	
		
		session.close();
		return l;
	}
	
	public static List queryCnb() {
		Session session = HibernateUtil.getSession();
		Query query = session
				.createQuery("from CpaNewsBean ");
		List l = query.list();;	
		
		session.close();
		return l;
	}
	
	public static List queryCnbById(int id) {
		Session session = HibernateUtil.getSession();
		Query query = session
				.createQuery("from CpaNewsBean where id = ?");
		query.setInteger(0, id);
		List l = query.list();;	
		
		session.close();
		return l;
	}
	
	public static int queryEnterCarNum(String cpaName){
		int num;
		Session session = HibernateUtil.getSession();
		Query query = session
				.createQuery("from CpaEnterBean where cpaEnterCpaname = ?");
		query.setString(0, cpaName);
		List l = query.list();
		num = l.size();
		session.close();
		
		return num;
	}
}
