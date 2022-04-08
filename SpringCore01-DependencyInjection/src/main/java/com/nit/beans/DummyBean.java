package com.nit.beans;

public class DummyBean {
	//defined both constructor to see which one it uses if this bean is having no property configured to use dependency injection. 
	public DummyBean() {
		System.out.println("DummyBean:: Default Constructor");
	}
	
	public DummyBean(int a) {
		System.out.println("DummyBean:: One param Constructor");
	}

}
