package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VoteEligibilityCheckingService;

public class BeanLifeCycleTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

		//Aprroach-1
		System.out.println("========================================");
		VoteEligibilityCheckingService bean1 = ctx.getBean("voting", VoteEligibilityCheckingService.class);
		String voteCheckEligibility1 = bean1.voteCheckEligibility();
		System.out.println("Approach:1 :" + voteCheckEligibility1);
		System.out.println("========================================");

		/*//Approah-2
		VoteEligibilityCheckingService bean2 = ctx.getBean("voting2", VoteEligibilityCheckingService.class);
		String voteCheckEligibility2 = bean2.voteCheckEligibility();
		System.out.println("Approach:2 :" + voteCheckEligibility2);
		System.out.println("========================================");
		
		//Approach-3
		VoteEligibilityCheckingService bean3 = ctx.getBean("voting3", VoteEligibilityCheckingService.class);
		String voteCheckEligibility3 = bean3.voteCheckEligibility();
		System.out.println("Approach:3 :" + voteCheckEligibility3);
		System.out.println("========================================");*/

		ctx.close();
	}
}
