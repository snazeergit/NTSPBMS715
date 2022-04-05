package com.nit.beans;

public class Calculator {

	int a, b,d;
	String c;

	public Calculator() {
		System.out.println("Calculator.Calculator()");
	}
	public Calculator(int d) {
		this.d=d;
		System.out.println("Calculator.Calculator(int d)");
	}

	public Calculator(int a, String c) {
		this.a = a;
		this.c = c;
		System.out.println("Calculator.Calculator(int a, String c)");
	}

	public void setB(int b) {
		this.b = b;
		System.out.println("Calculator.setB(int b)");
	}

	public int performCalculation() {
		System.out.println("Calculator.performCalculation()");

		return a + b;
	}

}
