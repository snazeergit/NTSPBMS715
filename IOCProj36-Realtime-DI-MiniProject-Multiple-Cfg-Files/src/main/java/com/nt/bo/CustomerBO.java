package com.nt.bo;

import java.io.Serializable;

public class CustomerBO implements Serializable {

	private Integer cno;
	private String cname;
	private String caddr;
	private Long pamt;
	private Float roi;
	private Float intamt;
	private Integer tenure;

	public Integer getCno() {
		return cno;
	}

	public void setCno(Integer cno) {
		this.cno = cno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCaddr() {
		return caddr;
	}

	public void setCaddr(String caddr) {
		this.caddr = caddr;
	}

	public Long getPamt() {
		return pamt;
	}

	public void setPamt(Long pamt) {
		this.pamt = pamt;
	}

	public Float getRoi() {
		return roi;
	}

	public void setRoi(Float roi) {
		this.roi = roi;
	}

	public Float getIntamt() {
		return intamt;
	}

	public void setIntamt(Float intamt) {
		this.intamt = intamt;
	}

	public Integer getTenure() {
		return tenure;
	}

	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}

}
