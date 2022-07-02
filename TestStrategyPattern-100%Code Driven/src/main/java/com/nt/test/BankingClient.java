package com.nt.test;

import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nt.beans.WestronUnionMoneyTransfer;

@Configuration
@ComponentScan(basePackages = "com/nt")
public class BankingClient {
	
	@Bean()
	public Date getDate() {
		return new Date();
	}
		
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BankingClient.class);
		WestronUnionMoneyTransfer moneyTransfer = context.getBean("moneyTransfer", WestronUnionMoneyTransfer.class);
		System.out.println(moneyTransfer.initiateFundTransfer(1000000.0));
		context.close();
	}
}
