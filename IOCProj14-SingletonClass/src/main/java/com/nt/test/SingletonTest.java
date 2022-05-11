package com.nt.test;

import com.nt.singleton.Printer;

public class SingletonTest {

	public static void main(String[] args) {
		Printer p1 = Printer.instance();
		p1.print("Nazeer");

		Printer p2 = Printer.instance();
		p2.print("Syed");
		
		if (p1.hashCode() == p2.hashCode()) {
			System.out.println("p1 and p2 are pointing to same reference, i.e single object");
		}
		
		System.out.println("P1 obj hascode : " + p1.hashCode() + "   P2 object hashcode:" + p2.hashCode());
	}
}
