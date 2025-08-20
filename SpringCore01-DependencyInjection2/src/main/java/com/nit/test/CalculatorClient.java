package com.nit.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nit.beans.Calculator;

@SuppressWarnings("deprecation")
public class CalculatorClient {

	public static void main(String[] args) {
		/*
		//Using BeanFactory Container
		FileSystemResource resoucFileSystemResource = new FileSystemResource(
				"src/main/java/com/nit/cfgs/applicationContext.xml");
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resoucFileSystemResource);
		// xmlBeanFactory.getBean("db");
		// xmlBeanFactory.getBean("mb");
		Object bean = xmlBeanFactory.getBean("calculator");
		Calculator calculator1 = (Calculator) bean;
		calculator1.printProperties();

		*/	
			//Using ApplicationContext Container
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
					"com/nit/cfgs/applicationContext.xml");
			Calculator calc = context.getBean("calculator", Calculator.class);
			calc.printProperties();
		
		
	}

}
