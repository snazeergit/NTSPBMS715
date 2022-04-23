package com.nt.dto;

import java.io.Serializable;

public class PatientDTO implements Serializable {
	private String pName;
	private String pAddrs;
	private Double perDayCharge;
	private Integer totalDaysStayed;

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

}
