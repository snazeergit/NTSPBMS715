//Client App
package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comps.Flipkart;

public class  AC_Container_Test1{

	public static void main(String[] args) {
		//create ApplicationContext Container
		 ClassPathXmlApplicationContext ctx=
				    new ClassPathXmlApplicationContext("com/nt/config/applicationContext.xml");
		System.out.println("_________________");
				//get Target spring bean class obj
		Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		//invoke b.method
		String msg=fpkt.shopping(new String[] {"shirt","trouser","belt"},
				                                             new double[] {1000.0,3000.0 ,500.0});
		System.out.println(msg);		
		
		ctx.close();
	}//main
}//class
