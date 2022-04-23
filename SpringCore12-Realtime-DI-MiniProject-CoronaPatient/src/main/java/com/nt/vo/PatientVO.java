package com.nt.vo;

import java.io.Serializable;

public class PatientVO implements Serializable {
	private String pName;
	private String pAddrs;
	private String perDayCharge;
	private String totalDaysStayed;

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

	public String getPerDayCharge() {
		return perDayCharge;
	}

	public void setPerDayCharge(String perDayCharge) {
		this.perDayCharge = perDayCharge;
	}

	public String getTotalDaysStayed() {
		return totalDaysStayed;
	}

	public void setTotalDaysStayed(String totalDaysStayed) {
		this.totalDaysStayed = totalDaysStayed;
	}

}
