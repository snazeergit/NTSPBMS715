package com.nt.bo;

import java.io.Serializable;

public class PatientBO implements Serializable {
	private Integer pNo;
	private String pName;
	private String pAddrs;
	private Double perDayCharge;
	private Integer totalDaysStayed;
	private Double billAmt;

	public Integer getpNo() {
		return pNo;
	}

	public void setpNo(Integer pNo) {
		this.pNo = pNo;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpAddrs() {
		return pAddrs;
	}

	public void setpAddrs(String pAddrs) {
		this.pAddrs = pAddrs;
	}

	public Double getPerDayCharge() {
		return perDayCharge;
	}

	public void setPerDayCharge(Double perDayCharge) {
		this.perDayCharge = perDayCharge;
	}

	public Integer getTotalDaysStayed() {
		return totalDaysStayed;
	}

	public void setTotalDaysStayed(Integer totalDaysStayed) {
		this.totalDaysStayed = totalDaysStayed;
	}

	public Double getBillAmt() {
		return billAmt;
	}

	public void setBillAmt(Double billAmt) {
		this.billAmt = billAmt;
	}

}
