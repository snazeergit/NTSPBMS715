package com.nt.singleton;

public class Printer {
	
	private static Printer printer;
	
	private Printer() {
		
	}
	
	public static Printer instance() {
		if (printer==null) {
			printer= new Printer();
		}
		return printer;
	}

	public void print(String msg) {
		System.out.println(msg);
	}
}
