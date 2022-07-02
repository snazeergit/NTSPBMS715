package com.nt.beans;

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
