package com.nt.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable{

	private String custName;
	private String custAdrs;
	private Long principleAmt;
	private Float rateOfInterest;
	private Integer tenure;

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAdrs() {
		return custAdrs;
	}

	public void setCustAdrs(String custAdrs) {
		this.custAdrs = custAdrs;
	}

	public Long getPrincipleAmt() {
		return principleAmt;
	}

	public void setPrincipleAmt(Long principleAmt) {
		this.principleAmt = principleAmt;
	}

	public Float getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(Float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public Integer getTenure() {
		return tenure;
	}

	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}

}
