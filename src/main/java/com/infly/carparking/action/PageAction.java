package com.infly.carparking.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.infly.carparking.dao.QueryDao;
import com.infly.carparking.dao.entity.AdminBean;
import com.infly.carparking.dao.entity.CpaEnterBean;
import com.infly.carparking.dao.entity.CpaParamBean;
import com.opensymphony.xwork2.ActionSupport;

public class PageAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	int i = 1;// �м����
	private int k;// �������ҳ����
	private int pageNow = 1; // ҳ����,��ʼΪ1
	private int pageSize = 10; // ҳ������
	private int intRowCount;// ������
	private int intPageCount;// ��ҳ��
	private List<CpaEnterBean> ceb;
	private int id;
	private int aid;
	private int SurplusNo;

	public int getSurplusNo() {
		return SurplusNo;
	}

	public void setSurplusNo(int surplusNo) {
		SurplusNo = surplusNo;
	}

	public List<CpaEnterBean> getCeb() {
		return ceb;
	}

	public void setCeb(List<CpaEnterBean> ceb) {
		this.ceb = ceb;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getPageNow() {
		return pageNow;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getIntRowCount() {
		return intRowCount;
	}

	public void setIntRowCount(int intRowCount) {
		this.intRowCount = intRowCount;
	}

	public int getIntPageCount() {
		return intPageCount;
	}

	public void setIntPageCount(int intPageCount) {
		this.intPageCount = intPageCount;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	@SuppressWarnings("unchecked")
	@Override
	// ��ʾ��ͣ�����б�
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		AdminBean ab = (AdminBean) session.getAttribute("obj");
		
		CpaParamBean cpb = (CpaParamBean)QueryDao.queryCpaParam(ab.getAdminCpaname()).iterator().next();
		SurplusNo = cpb.getCpaParamPcn() - QueryDao.count(ab.getAdminCpaname());
		session.setAttribute("sn", SurplusNo);
		
		intRowCount = QueryDao.count(ab.getAdminCpaname());
		k = (intRowCount + pageSize - 1) / pageSize;
		intPageCount = (intRowCount + pageSize - 1) / pageSize;// �������ҳ��
		if (pageNow <= 1) {
			pageNow = 1;
		}
		if (pageNow > intPageCount) {
			pageNow = intPageCount;
		}
		i = (pageNow - 1) * pageSize;
		if (null == QueryDao.queryByPage(i, pageSize, ab.getAdminCpaname()))		{
			ceb = null;
		}
		else {
			ceb = QueryDao.queryByPage(pageSize, pageNow, ab.getAdminCpaname());			
		} 
		return SUCCESS;
	}
}
