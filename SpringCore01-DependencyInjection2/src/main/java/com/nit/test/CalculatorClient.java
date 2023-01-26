package com.nit.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nit.beans.Calculator;

@SuppressWarnings("deprecation")
public class CalculatorClient {

	public static void main(String[] args) {
		FileSystemResource resoucFileSystemResource = new FileSystemResource(
				"src/main/java/com/nit/cfgs/applicationContext.xml");
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resoucFileSystemResource);
		xmlBeanFactory.getBean("db");
		Object bean = xmlBeanFactory.getBean("calculator");
		Calculator calculator1 = (Calculator) bean;
		calculator1.printProperties();
	}

}
