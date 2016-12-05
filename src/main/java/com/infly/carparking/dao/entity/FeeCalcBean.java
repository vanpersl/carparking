package com.infly.carparking.dao.entity;

public class FeeCalcBean {
	private int id;
	private String feeCalcType;
	private String feeCalcDiscount;
	private float feeCalcTotalfee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFeeCalcType() {
		return feeCalcType;
	}

	public void setFeeCalcType(String feeCalcType) {
		this.feeCalcType = feeCalcType;
	}

	public String getFeeCalcDiscount() {
		return feeCalcDiscount;
	}

	public void setFeeCalcDiscount(String feeCalcDiscount) {
		this.feeCalcDiscount = feeCalcDiscount;
	}

	public float getFeeCalcTotalfee() {
		return feeCalcTotalfee;
	}

	public void setFeeCalcTotalfee(float feeCalcTotalfee) {
		this.feeCalcTotalfee = feeCalcTotalfee;
	}
}