package com.infly.carparking.bis;

import java.util.Date;

public class CalcTime {
	public static long day;
	public static long min;
	public static long hour;
	public static long second;
	
	public String calcTimeStr(Date date1, Date date2) {
		String ot = "";
		long l = Math.abs(date1.getTime() - date2.getTime());
		day = l / (24 * 60 * 60 * 1000);
		hour = (l / (60 * 60 * 1000) - day * 24);
		min = ((l / (60 * 1000)) - day * 24 * 60 - hour * 60);
		second = (l / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
		
		if (day != 0) {
			ot = "" + day + "天" + hour + "小时" + min + "分钟" + second+"秒";
		}
		else {
			ot = "" + hour + "ʱ" + min + "分钟" + second+"秒";
		}
		System.out.println(ot);
		return ot;
	}
}
