package com.nt.beans;

public class A {

	private B b;

	public A() {
		System.out.println("A: Default Constructor");
	}

	public A(B b) {
		this.b = b;
		System.out.println("A: Constructor Injection");
	}

	public void setB(B b) {
		this.b = b;
		System.out.println("A: Setter Injection");
	}

}
