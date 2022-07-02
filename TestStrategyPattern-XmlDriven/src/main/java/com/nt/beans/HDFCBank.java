package com.nt.beans;

public class HDFCBank implements RBI {
	
	public HDFCBank() {
		System.out.println("HDFCBank.HDFCBank()");
	}

	@Override
	public String depositMoney(Double amount) {

		System.out.println("HDFCBank.depositMoney()");

		return "MOney Deopisited in HDFC Bank";
	}

}
