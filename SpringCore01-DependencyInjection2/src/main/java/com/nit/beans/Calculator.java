package com.nit.beans;

public class Calculator {

	private int a;
	private String c;

	public Calculator() {
		System.out.println("Calculator.Calculator()");
	}

	public Calculator(String c, int a) {
		this.c = c;
		this.a = a;
		System.out.println("Calculator.Calculator(String c, int a)");
	}

	public Calculator(int a, String c) {
		this.a = a;
		this.c = c;
		System.out.println("Calculator.Calculator(int a, String c)");
	}

	public void printProperties() {
		System.out.println("a: " + a + " c= " + c);
	}

}

/*When a Spring bean is configured for Constructor injection for its bean properties and multiple constructors are placed to support this injection 
then IOC container prefer to choose the Constructor with the parameter order same as the spring bean configuration file. 
That means this Spring bean class is having Calculator(int a , String c) and Calculator(String c, int a) to inject values to a and c properties now
Constructor Calculator(int a, String c) will be used for injection as it follows order of arguments however if there is only one constructor with 
different order of parameters than the spring bean config file then it will use the one that is available.
*/