package com.infly.carparking.bis;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import com.infly.carparking.dao.QueryDao;
import com.infly.carparking.dao.entity.CpaParamBean;

public class SurplusNum {
	public int cpaSupNum(String cpaName){
		CpaParamBean cpb = new CpaParamBean();
		int num = 0;
		List list = QueryDao.queryCpaParam(cpaName);
		for (Iterator it = list.iterator(); it.hasNext();) {
			cpb = (CpaParamBean) it.next();
		}
		num = cpb.getCpaParamPcn() - QueryDao.queryEnterCarNum(cpaName);
		return num;
	}
	public String getUUID()	{
		UUID uuid = UUID.randomUUID();
		return uuid.toString().substring(2,12);
	}
}
