package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.BankService;
import com.nt.config.AppConfig;

public class MethodInjectionTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		BankService service = ctx.getBean("bankService", BankService.class);

		double interestAmount = service.calculateInterestAmount(100000, 12, 1);
		System.out.println("Interest Amount : " + interestAmount);
		ctx.close();
	}

}