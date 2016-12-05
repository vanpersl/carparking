package com.infly.carparking.bis;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.infly.carparking.dao.QueryDao;
import com.infly.carparking.dao.entity.CpaEnterBean;
import com.infly.carparking.dao.entity.CpaParamBean;

public class CalcFee {
	public static long day;
	public static long min;
	public static long hour;
	public static long second;
	public static Date outDate;
	public static Date enterTime;
	public static List listCeb;
	public static CpaEnterBean ceb;
	public static CpaParamBean cpb;
	public static String ot;
	List listCpb;

	public float totalFee(String carNo) {
		float fee = 1;
		listCeb = QueryDao.queryCebByCarno(carNo);
		outDate = new Date();
		ceb = new CpaEnterBean();
		cpb = new CpaParamBean();
		
		for (Iterator it = listCeb.iterator(); it.hasNext();) {
			ceb = (CpaEnterBean) it.next();
			enterTime = ceb.getCpaEnterTime();
		}
		listCpb = QueryDao.queryCpaParam(ceb.getCpaEnterCpaname());
		for (Iterator it2 = listCpb.iterator(); it2.hasNext();) {
			cpb = (CpaParamBean) it2.next();
		}		
		calcDayHourSecond(outDate, enterTime);
		
		if (ceb.getCpaEnterType().equals("���ͳ�")) {
			if (day < 1){
				if (hour <= 1){
					fee = cpb.getCpaParamOneBig();
				}
				else {
					fee = cpb.getCpaParamOneBig() + (hour - 1) * 2 * cpb.getCpaParamOverBig();
					if (min <= 30){
						fee += cpb.getCpaParamOverBig();
					}
					else{
						fee += (cpb.getCpaParamOverBig() * 2);
					}
				}
				if (fee >= cpb.getCpaParamMaxfeeBig()) {
					fee = cpb.getCpaParamMaxfeeBig();
				}
			}
			else{
				fee = cpb.getCpaParamOneBig() + (day * 24 + hour - 1) * 2 * cpb.getCpaParamOverBig();
				if (min <= 30){
					fee += cpb.getCpaParamOverBig();
				}
				else{
					fee += (cpb.getCpaParamOverBig() * 2);
				}
				if (fee >= cpb.getCpaParamMaxfeeBig()) {
					fee = cpb.getCpaParamMaxfeeBig();
				}
			}
		} 
		else {
			if (day < 1){
				if (hour <= 1){
					fee = cpb.getCpaParamOneSmall();
				}
				else {
					fee = cpb.getCpaParamOneSmall() + (hour - 1) * 2 * cpb.getCpaParamOverSmall();
					if (min <= 30){
						fee += cpb.getCpaParamOverSmall();
					}
					else{
						fee += (cpb.getCpaParamOverSmall() * 2);
					}
				}
				if (fee >= cpb.getCpaParamMaxfeeSmall()) {
					fee = cpb.getCpaParamMaxfeeSmall();
				}
			}
			else{
				fee = cpb.getCpaParamOneSmall() + (day * 24 + hour - 1) * 2 * cpb.getCpaParamOverSmall();
				if (min <= 30){
					fee += cpb.getCpaParamOverSmall();
				}
				else{
					fee += (cpb.getCpaParamOverSmall() * 2);
				}
				if (fee >= cpb.getCpaParamMaxfeeSmall()) {
					fee = cpb.getCpaParamMaxfeeSmall();
				}
			}
		}
		if (ceb.getCpaEnterBt().equals("��Ա��")){
			fee = fee * 8 / 10;
		}
		System.out.println("�ܹ���Ҫ����:"+ fee + " Ԫͣ���ѡ�");
		return fee;
	}

	public void calcDayHourSecond(Date date1, Date date2) {
		long l = Math.abs(new Date().getTime() - date2.getTime());
		day = l / (24 * 60 * 60 * 1000);
		hour = (l / (60 * 60 * 1000) - day * 24);
		min = ((l / (60 * 1000)) - day * 24 * 60 - hour * 60);
		second = (l / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
		
		if (day != 0) {
			ot = "" + day + "��" + hour + "ʱ" + min + "��" + second+"��";
		}
		else {
			ot = "" + hour + "ʱ" + min + "��" + second+"��";
		}
		System.out.println(ot);
	}
}
