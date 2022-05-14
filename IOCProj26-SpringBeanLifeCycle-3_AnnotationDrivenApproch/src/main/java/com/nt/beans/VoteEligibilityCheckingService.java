package com.nt.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("voting")
@PropertySource("/com/nt/commons/info.properties")
public class VoteEligibilityCheckingService {

	@Value("${name}")
	private String name;
	@Value("${age}")
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
	@PostConstruct
	public void myInit() {
		System.out.println("init()---------");
		verifiedOn = new Date();
		if (name == null & age <= 0)
			System.err.println("Either name or Age is invalid values");
	}

	//Configured as destroy life cycle method
	@PreDestroy
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
