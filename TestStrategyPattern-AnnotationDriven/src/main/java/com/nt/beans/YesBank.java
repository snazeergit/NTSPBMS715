package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("yesBank")
public class YesBank implements RBI {
	
	public YesBank() {
		System.out.println("YesBank.YesBank()");
	}

	@Override
	public String depositMoney(Double amount) {
		System.out.println("YesBank.depositMoney()");
		return "Money Deposited in Yes Bank";
	}

}
