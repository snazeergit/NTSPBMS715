package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Cricketer;

public class DependencyLookupTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		Cricketer cricketer = ctx.getBean("cricketer", Cricketer.class);
		cricketer.batting();
		cricketer.bowling();
		cricketer.fielding();
		cricketer.wicketKeeping();
		ctx.close();
	}

}
