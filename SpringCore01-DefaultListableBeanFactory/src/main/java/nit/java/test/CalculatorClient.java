package nit.java.test;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import nit.java.beans.Calculator;

@SuppressWarnings({ "unused", "deprecation" })
public class CalculatorClient {
	public static void main(String[] args) {
		ClassPathResource classpath = new ClassPathResource("nit/java/cfgs/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(classpath);
		Object bean = factory.getBean("calc");
		Calculator cal = (Calculator) bean;
		cal.addition(20, 50);
		
		/*DefaultListableBeanFactory factory1 = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory1);
		reader.loadBeanDefinitions("nit/java/cfgs/applicationContext.xml");*/

	}
}