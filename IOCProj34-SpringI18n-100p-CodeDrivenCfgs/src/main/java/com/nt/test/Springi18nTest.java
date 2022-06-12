package com.nt.test;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;

public class Springi18nTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter locale and Country name : ");
		String message = ctx.getMessage("wish.msg", new String[] {}, new Locale(s.nextLine(), s.nextLine()));
		System.out.println("Welcome message: " + message);
		s.close();
		ctx.close();
	}
}
