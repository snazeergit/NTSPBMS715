package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VoteEligibilityCheckingService;

public class BeanLifeCycleTest_Approach1 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		VoteEligibilityCheckingService bean = ctx.getBean("voting", VoteEligibilityCheckingService.class);
		String voteCheckEligibility = bean.voteCheckEligibility();
		System.out.println(voteCheckEligibility);
		ctx.close();
	}
}
