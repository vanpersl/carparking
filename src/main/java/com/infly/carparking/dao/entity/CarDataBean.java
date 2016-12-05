package com.infly.carparking.dao.entity;

public class CarDataBean {
	private int id;
	private String carDataNo;
	private String carDataType;
	private String carDataSeries;
	private String carDataColor;
	private String carDataOwner;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCarDataNo() {
		return carDataNo;
	}

	public void setCarDataNo(String carDataNo) {
		this.carDataNo = carDataNo;
	}

	public String getCarDataType() {
		return carDataType;
	}

	public void setCarDataType(String carDataType) {
		this.carDataType = carDataType;
	}

	public String getCarDataSeries() {
		return carDataSeries;
	}

	public void setCarDataSeries(String carDataSeries) {
		this.carDataSeries = carDataSeries;
	}

	public String getCarDataColor() {
		return carDataColor;
	}

	public void setCarDataColor(String carDataColor) {
		this.carDataColor = carDataColor;
	}

	public String getCarDataOwner() {
		return carDataOwner;
	}

	public void setCarDataOwner(String carDataOwner) {
		this.carDataOwner = carDataOwner;
	}
}
