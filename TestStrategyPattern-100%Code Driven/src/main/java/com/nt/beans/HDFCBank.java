package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("hdfcBank")
public class HDFCBank implements RBI {

	public HDFCBank() {
		System.out.println("HDFCBank.HDFCBank()");
	}

	@Override
	public String depositMoney(Double amount) {

		System.out.println("HDFCBank.depositMoney()");

		return "Money Deopisited in HDFC Bank";
	}

}
