package com.nit.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nit.beans.WishMessageGenerator;

@SuppressWarnings("deprecation")
public class WishClientApplication {

	public static void main(String[] args) {

		//FileSystemResource resource = new FileSystemResource("src/main/java/com/nit/cfgs/applicationContext.xml");
		ClassPathResource resource=new ClassPathResource("com/nit/cfgs/applicationContext.xml");
		XmlBeanFactory beanFactory = new XmlBeanFactory(resource);
		Object bean = beanFactory.getBean("wmg");
		WishMessageGenerator generator = (WishMessageGenerator) bean;
		System.out.println(generator.generateWishMessage()+" Nazeer!");
	}
}
