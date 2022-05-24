package com.nt.beans;

public class BankService {

	public double calculateInterestAmount(double pamt, double rate, double time) {
		System.out.println("BankService.calculateInterestAmount()");
		return (pamt * Math.pow(1 + rate / 100, time)) - pamt;
	}

}
