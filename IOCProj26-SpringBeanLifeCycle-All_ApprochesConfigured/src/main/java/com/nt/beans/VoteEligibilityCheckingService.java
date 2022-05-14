package com.nt.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("voting")
@PropertySource("com/nt/commons/info.properties")
public class VoteEligibilityCheckingService implements InitializingBean, DisposableBean {

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

	//Approch-1--------------------------------------------------
	public void myInit() {
		System.out.println("init()Approch-1--------");
		System.out.println("name: " + name + " age: " + age);
		verifiedOn = new Date();
		if (name == null || age <= 0)
			throw new IllegalArgumentException("Oops!...Invalid input Name or Age....!");
	}

	//Configured as destroy life cycle method
	public void myDestroy() {
		System.out.println("destroy()Approch-1--------");
		name = null;
		age = 0;
		verifiedOn = null;
		System.out.println("name: " + name + " age: " + age);
	}

	//Approch-2--------------------------------------------------
	//init life cycle method
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init()Approch-2---------");
		System.out.println("name: " + name + " age: " + age);
		verifiedOn = new Date();
		if (name == null || age <= 0)
			throw new IllegalArgumentException("Oops!...Invalid input Name or Age....!");

	}

	//destroy life cycle method
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy()Approch-2--------");
		name = null;
		age = 0;
		verifiedOn = null;
		System.out.println("name: " + name + " age: " + age);
	}

	//Approch-3--------------------------------------------------
	//Configured as init life cycle method
	@PostConstruct
	public void myInit1() {
		System.out.println("init()Approch-3---------");
		System.out.println("name: " + name + " age: " + age);
		verifiedOn = new Date();
		if (name == null || age <= 0)
			throw new IllegalArgumentException("Oops!...Invalid input Name or Age....!");
	}

	//Configured as destroy life cycle method
	@PreDestroy
	public void myDestroy1() {
		System.out.println("destroy()Approch-3--------");
		name = null;
		age = 0;
		verifiedOn = null;
		System.out.println("name: " + name + " age: " + age);
	}

	//Business method 
	public String voteCheckEligibility() {
		System.out.println("Vote eligibility verified on " + verifiedOn);
		if (age >= 18)
			return "Mr./Ms./Mrs. " + name + " is eligible for voting";
		return "Mr./Ms./Mrs. " + name + " is not eligible for voting";
	}
}
