package com.infly.carparking.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.infly.carparking.dao.QueryDao;
import com.infly.carparking.dao.entity.CpaParamBean;
import com.infly.carparking.dao.entity.SurpNumBean;
import com.opensymphony.xwork2.ActionSupport;

public class ShowSpNoAction extends ActionSupport{
	private List<SurpNumBean> list;

	public List<SurpNumBean> getList() {
		return list;
	}

	public void setList(List<SurpNumBean> list) {
		this.list = list;
	}
	
	public String execute(){
		List<SurpNumBean> list1 = new ArrayList<SurpNumBean>();
		List lstCpb = QueryDao.queryAllCpaParam();
		CpaParamBean cpb;
		for (Iterator it = lstCpb.iterator(); it.hasNext();) {
			SurpNumBean snb = new SurpNumBean();
			cpb = (CpaParamBean) it.next();
			snb.setName(cpb.getCpaParamName());
			snb.setNum(cpb.getCpaParamPcn() - QueryDao.count(cpb.getCpaParamName()));
			list1.add(snb);
		}
		list = list1;
		return SUCCESS;
	}
}
