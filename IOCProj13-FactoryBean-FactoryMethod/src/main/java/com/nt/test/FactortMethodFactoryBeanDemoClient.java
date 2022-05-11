package com.nt.test;

import java.util.Calendar;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactortMethodFactoryBeanDemoClient {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		Class<?> clazz = factory.getBean("clazz", Class.class);
		System.out.println(clazz + "-->" + clazz.getClass());

		Calendar bean = factory.getBean("calendar", Calendar.class);
		System.out.println(bean + "-->" + bean.getClass());

		String bean2 = factory.getBean("s2", String.class);
		System.out.println(bean2 + "-->" + bean2.getClass());

		String bean3 = factory.getBean("s3", String.class);
		System.out.println(bean3 + "-->" + bean3.getClass());
	}

}
