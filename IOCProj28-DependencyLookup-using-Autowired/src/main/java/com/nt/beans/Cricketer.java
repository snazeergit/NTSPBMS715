package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("cricketer")
@PropertySource(value = "classpath:com/nt/commons/info.properties")
public class Cricketer {//implements ApplicationContextAware {
	@Autowired
	private ApplicationContext applicationContext;// This will be injected with ApplicationContext container that is created as part of DependencyLookupTest Client application

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

		//Lookup with bean id
		//CricketBat bat = applicationContext.getBean("bat", CricketBat.class);

		//Lookup with bean class name
		CricketBat bat = applicationContext.getBean(CricketBat.class);
		int runs = bat.scoreRuns();
		System.out.println(name + " with jersy number " + jersyNo + " has scored unbeaten '" + runs + "' runs");
	}
	/*
		@Override
		public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
			System.out.println("Cricketer.setApplicationContext()");
			this.applicationContext = applicationContext;
		}*/
}
