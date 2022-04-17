package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comps.Flipkart;

public class StrategyPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/config/applicationContext.xml");
		Flipkart flipkart2 = factory.getBean("flipkart", Flipkart.class);
		String resultMsg = flipkart2.shopping(new String[] { "candles", "flowers", "cake", "wine" },
				new double[] { 1000.0, 2000.0, 3000.0, 7000.0 });
		System.out.println(resultMsg);
	}
}
