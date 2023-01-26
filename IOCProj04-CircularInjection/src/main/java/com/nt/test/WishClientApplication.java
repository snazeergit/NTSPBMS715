package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class WishClientApplication {

	public static void main(String[] args) {
		FileSystemResource resource = new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		Object bean = factory.getBean("a1");
	}
}
