package com.nt.beans;

import java.util.Date;

public class VoteEligibilityCheckingService {

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

	//Configured as init life cycle method
	public void myInit() {
		System.out.println("init()---------");
		verifiedOn = new Date();
		if (name == null || age <= 0)
			throw new IllegalArgumentException("Oops!...Invalid input Name or Age....!");
	}

	//Configured as destroy life cycle method
	public void myDestroy() {
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
