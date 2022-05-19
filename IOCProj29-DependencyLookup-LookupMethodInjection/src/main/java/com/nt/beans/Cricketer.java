package com.nt.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("cricketer")
@PropertySource(value = "classpath:com/nt/commons/info.properties")
public abstract class Cricketer {

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

		CricketBat bat = getBat();
		int runs = bat.scoreRuns();
		System.out.println(name + " with jersy number " + jersyNo + " has scored unbeaten '" + runs + "' runs");
	}

	@Lookup
	public abstract CricketBat getBat();
}
