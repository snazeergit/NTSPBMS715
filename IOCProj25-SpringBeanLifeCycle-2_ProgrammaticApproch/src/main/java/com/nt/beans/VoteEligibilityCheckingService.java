package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VoteEligibilityCheckingService implements InitializingBean, DisposableBean {

	private String name;
	private int age;
	private Date verifiedOn;

	public VoteEligibilityCheckingService() {
		System.out.println("VoteEligibilityCheckingService:: 0-Param constructor");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//init life cycle method
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init()---------");
		verifiedOn = new Date();
		if (name == null & age <= 0)
			System.err.println("Either name or Age is invalid values");

	}

	//destroy life cycle method
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy()--------");
		name = null;
		age = 0;
		verifiedOn = null;

	}

	//Business method 
	public String voteCheckEligibility() {
		System.out.println("Vote eligibility verified on " + verifiedOn);
		if (age >= 18)
			return "Mr./Ms./Mrs. " + name + " is eligible for voting";
		return "Mr./Ms./Mrs. " + name + " is not eligible for voting";
	}
}
