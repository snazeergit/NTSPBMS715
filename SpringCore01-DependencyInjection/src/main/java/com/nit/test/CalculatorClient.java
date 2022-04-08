package com.nit.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nit.beans.Calculator;

@SuppressWarnings("deprecation")
public class CalculatorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemResource resoucFileSystemResource = new FileSystemResource(
				"src/main/java/com/nit/cfgs/applicationContext.xml");
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resoucFileSystemResource);
		System.out.println("------------------");
		
		//One bean class configured twice with two different bean ids, in one bean ID we have one property uses setter injection and two properties uses constructor injection and in the other bean the only property is configured to use constructor injection
		//Object bean1 = xmlBeanFactory.getBean("calculator1");
		Object bean2 = xmlBeanFactory.getBean("calculator2");
		//Object bean = xmlBeanFactory.getBean("dummyBean");
		Calculator calculator = (Calculator) bean2;
		System.out.println("+++++++++++++++++++");
		System.out.println("Sum : " + calculator.performCalculation());
	}

}
