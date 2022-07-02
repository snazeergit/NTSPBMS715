package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("iciciBank")
public class ICICIBank implements RBI {

	public ICICIBank() {
		System.out.println("ICICIBank.ICICIBank()");
	}

	@Override
	public String depositMoney(Double amount) {
		System.out.println("ICICIBank.depositMoney()");
		return "Money deposited in ICICI Bank";
	}
}
