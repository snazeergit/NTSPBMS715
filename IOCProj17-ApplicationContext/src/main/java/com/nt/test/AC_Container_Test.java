//Client App
package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class  AC_Container_Test{

	public static void main(String[] args) {
		//create  BeanFactory Container
		DefaultListableBeanFactory  factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/config/applicationContext.xml");
		
		/*//get Target spring bean class obj
		Flipkart fpkt=factory.getBean("fpkt",Flipkart.class);
		//invoke b.method
		String msg=fpkt.shopping(new String[] {"shirt","trouser","belt"},
				                                             new double[] {1000.0,3000.0 ,500.0});
		System.out.println(msg);*/
	}//main
}//class
