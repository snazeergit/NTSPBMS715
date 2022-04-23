package com.nt.vo;

import java.io.Serializable;

public class EmployeeVO implements Serializable {

	private String eName;
	private String eAddrs;
	private String basicSal;

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

	public String getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(String basicSal) {
		this.basicSal = basicSal;
	}

}
