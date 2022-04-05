package com.nit.beans;

public class Calculator {

	private int a;
	private String c;

	public Calculator() {
		System.out.println("Calculator.Calculator()");
	}

	/*
	 * public Calculator(String c, int a) { this.c = c; this.a = a;
	 * System.out.println("Calculator.Calculator(String c, int a)"); }
	 */

	public Calculator(int a, String c) {
		this.a = a;
		this.c = c;
		System.out.println("Calculator.Calculator(int a, String c)");
	}
	
	public void printProperties() {
		System.out.println("a: "+a+" c= "+c);
	}

}
