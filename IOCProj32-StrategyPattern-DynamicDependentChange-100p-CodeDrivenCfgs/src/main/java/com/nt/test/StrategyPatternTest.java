package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.comps.Flipkart;
import com.nt.config.AppConfig;

public class StrategyPatternTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Flipkart flipkart2 = context.getBean("fkrt", Flipkart.class);
		String resultMsg = flipkart2.shopping(new String[] { "candles", "flowers", "cake", "wine" },
				new double[] { 1000.0, 2000.0, 3000.0, 7000.0 });
		System.out.println(resultMsg);
		context.close();
	}
}
