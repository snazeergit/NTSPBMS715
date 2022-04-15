package com.nt.test;

public class Test2 {
	private int a, b, c;

	public void test2(){
		throw new NullPointerException();
	}

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.test2();
	}
}