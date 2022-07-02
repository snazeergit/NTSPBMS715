package com.nt.beans;

import java.util.Date;

public class WestronUnionMoneyTransfer {

	private RBI bank;
	private Date date;

	public RBI getBank() {
		return bank;
	}

	public void setBank(RBI bank) {
		this.bank = bank;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String initiateFundTransfer(Double funds) {
		System.out.println("WestronUnionMoneyTransfer.initiateFundTransfer()");
		bank.depositMoney(funds);
		System.out.print(date);
		return "Congratulations!! Rs " + funds + " INR funds tranfered to your " + bank.getClass().getSimpleName()
				+ " account.";
	}

}
