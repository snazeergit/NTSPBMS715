package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WestronUnionMoneyTransfer;

/**
 * Hello world!
 *
 */
public class BankingClient {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/nt/cfgs/applicationContext.xml");
		WestronUnionMoneyTransfer moneyTransfer = context.getBean("moneyTransfer", WestronUnionMoneyTransfer.class);
		System.out.println(moneyTransfer.initiateFundTransfer(1000000.0));
		context.close();
	}
}
