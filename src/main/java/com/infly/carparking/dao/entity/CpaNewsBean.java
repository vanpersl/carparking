package com.infly.carparking.dao.entity;

import java.util.Date;

public class CpaNewsBean {
	private int id;
	private String title;
	private String content;
	private Date date;
	private String atatach;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAtatach() {
		return atatach;
	}

	public void setAtatach(String atatach) {
		this.atatach = atatach;
	}
}
