package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("moneyTransfer")
public class WestronUnionMoneyTransfer {

	@Autowired
	@Qualifier("hdfcBank")
	private RBI bank;

	@Autowired
	private Date date;

	public RBI getBank() {
		return bank;
	}

	public void setBank(RBI bank) {
		this.bank = bank;
	}

	public String initiateFundTransfer(Double funds) {
		System.out.println("WestronUnionMoneyTransfer.initiateFundTransfer()");
		bank.depositMoney(funds);
		System.out.print(date);
		return " IST : Congratulations!! Rs " + funds + " INR funds tranfered to your "
				+ bank.getClass().getSimpleName() + " account.";
	}

}
