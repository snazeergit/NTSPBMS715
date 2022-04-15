package com.nt.test;

public class Test1 {
	private int a, b;

	public Test1() {
		System.out.println("Test::Default Constructor");
	}

	public Test1(int a, int b) {
		System.out.println("Test:: 2-param constructor");
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		System.out.println("ToString method");
		return "Test [a=" + a + ", b=" + b + "]";
	}

	public int printSum() {
		return a + b;
	}

}
