package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import com.nt.beans.WestronUnionMoneyTransfer;

@ComponentScan(basePackages = "com/nt")
@ImportResource(value = "com/nt/cfgs/applicationContext.xml")
public class BankingClient {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BankingClient.class);
		WestronUnionMoneyTransfer moneyTransfer = context.getBean("moneyTransfer", WestronUnionMoneyTransfer.class);
		System.out.println(moneyTransfer.initiateFundTransfer(1000000.0));
		context.close();
	}
}
