package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.BankService;

public class MethodInjectionTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		BankService service = ctx.getBean("bankService", BankService.class);

		double interestAmount = service.calculateInterestAmount(100000, 12, 1);
		System.out.println("Interest Amount : " + interestAmount);
		ctx.close();
	}

}
