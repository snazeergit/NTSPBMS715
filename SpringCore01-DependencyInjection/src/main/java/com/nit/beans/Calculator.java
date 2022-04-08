package com.nit.beans;

public class Calculator {

	private int a, b,d;
	private String c;
	private DummyBean dummy;

	public void setDummy(DummyBean dummy) {
		this.dummy = dummy;
		System.out.println("Calculator:: Setter for dummy property");
	}
	
	public Calculator() {
		System.out.println("Calculator:: Default constructor");
	}
	public Calculator(int d) {
		this.d=d;
		System.out.println("Calculator:: Constructor d");
	}
	
	

	public Calculator(int a, String c) {
		this.a = a;
		this.c = c;
		System.out.println("Calculator:: Two-param Constructor");
	}

	public void setB(int b) {
		this.b = b;
		System.out.println("Calculator:: Setter method b");
	}

	public int performCalculation() {
		System.out.println("Calculator.performCalculation()");

		return a + b;
	}

}
