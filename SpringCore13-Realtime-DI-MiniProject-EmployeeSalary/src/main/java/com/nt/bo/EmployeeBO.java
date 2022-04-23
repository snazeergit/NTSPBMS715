package com.nt.bo;

import java.io.Serializable;

public class EmployeeBO implements Serializable {
	
	private Integer eNo;
	private String eName;
	private String eAddrs;
	private Double basicSal;
	private Double grossSal;
	private Double netSal;

	public Integer geteNo() {
		return eNo;
	}

	public void seteNo(Integer eNo) {
		this.eNo = eNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteAddrs() {
		return eAddrs;
	}

	public void seteAddrs(String eAddrs) {
		this.eAddrs = eAddrs;
	}

	public Double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(Double basicSal) {
		this.basicSal = basicSal;
	}

	public Double getGrossSal() {
		return grossSal;
	}

	public void setGrossSal(Double grossSal) {
		this.grossSal = grossSal;
	}

	public Double getNetSal() {
		return netSal;
	}

	public void setNetSal(Double netSal) {
		this.netSal = netSal;
	}

}
