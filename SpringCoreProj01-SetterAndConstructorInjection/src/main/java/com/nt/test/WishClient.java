package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

@SuppressWarnings("deprecation")
public class WishClient {

	public static void main(String[] args) {
		FileSystemResource resource = new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);
		Object bean = xmlBeanFactory.getBean("wmg");
		WishMessageGenerator generator = (WishMessageGenerator) bean;
		System.out.println(generator.generateWishMessage() + " Nazeer!");
	}
}
