package nit.java.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import nit.java.beans.Calculator;

public class CalculatorClient {
	public static void main(String[] args) {
		ClassPathResource classpath = new ClassPathResource("nit/java/cfgs/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(classpath);
		Object bean = factory.getBean("calc");
		Calculator cal = (Calculator) bean;
		cal.addition(20, 50);
	}
}