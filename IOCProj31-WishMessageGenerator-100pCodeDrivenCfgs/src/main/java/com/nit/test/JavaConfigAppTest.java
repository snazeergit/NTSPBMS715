package com.nit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.WishMessageGenerator;
import com.nit.config.AppConfig;

public class JavaConfigAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);
		System.out.println(generator.generateWishMessage("Nazeer!"));
		ctx.close();
	}
}
