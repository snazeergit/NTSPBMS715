package com.nt.vo;

import java.io.Serializable;

public class CustomerVO implements Serializable {
	private String custName;
	private String custAdrrs;
	private String principleAmt;
	private String rateOfInterest;
	private String tenure;

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAdrs() {
		return custAdrrs;
	}

	public void setCustAdrs(String custAdrs) {
		this.custAdrrs = custAdrs;
	}

	public String getPrincipleAmt() {
		return principleAmt;
	}

	public void setPrincipleAmt(String principleAmt) {
		this.principleAmt = principleAmt;
	}

	public String getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(String rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public String getTenure() {
		return tenure;
	}

	public void setTenure(String tenure) {
		this.tenure = tenure;
	}

}
