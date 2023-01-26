package com.nt.beans;

public class B {

	private A a;

	public B() {
		System.out.println("B: Default Constructor");
	}

	public B(A a) {
		this.a = a;
		System.out.println("B: Constructor Injection");
	}

	public void setA(A a) {
		this.a = a;
		System.out.println("B: Setter Injection");
	}

}
