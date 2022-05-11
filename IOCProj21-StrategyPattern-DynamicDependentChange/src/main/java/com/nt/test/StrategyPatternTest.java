package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comps.Flipkart;

public class StrategyPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/nt/config/applicationContext.xml");
		Flipkart flipkart2 = context.getBean("fkrt", Flipkart.class);
		String resultMsg = flipkart2.shopping(new String[] { "candles", "flowers", "cake", "wine" },
				new double[] { 1000.0, 2000.0, 3000.0, 7000.0 });
		System.out.println(resultMsg);
	}
}
