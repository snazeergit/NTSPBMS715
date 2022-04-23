package com.nt.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {
	private String eName;
	private String eAddrs;
	private Double basicSal;

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

}
