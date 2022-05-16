package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cricketer")
@PropertySource(value = "classpath:com/nt/commons/info.properties")
public class Cricketer {
	
	@Value("${cktr.name}")
	private String name;
	
	@Value("${cktr.jersyNo}")
	private int jersyNo;

	public Cricketer() {
		System.out.println("Cricketer::0-param constructor");
	}

	public void fielding() {
		System.out.println(name + " with jersy number " + jersyNo + " is fielding");
	}

	public void bowling() {
		System.out.println(name + " with jersy number " + jersyNo + " is bowling");
	}

	public void wicketKeeping() {
		System.out.println(name + " with jersy number " + jersyNo + " is doing wicketKeeping");
	}

	public void batting() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//Lookup with bean id
		//CricketBat bat = ctx.getBean("bat", CricketBat.class);
		
		//Lookup with bean class name
		CricketBat bat = ctx.getBean(CricketBat.class);
		
		int runs = bat.scoreRuns();
		System.out.println(name + " with jersy number " + jersyNo + " has scored unbeaten '" + runs+"' runs");
		ctx.close();
	}
}
