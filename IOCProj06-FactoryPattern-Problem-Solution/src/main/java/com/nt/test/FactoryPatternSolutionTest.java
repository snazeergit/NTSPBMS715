package com.nt.test;

import com.nt.comp.Person;
import com.nt.factory.PersonFactory;

public class FactoryPatternSolutionTest {

	public static void main(String[] args) {
		Person person = PersonFactory.getPerson("emp");
		System.out.println(person);
		Person person2 = PersonFactory.getPerson("cust");
		System.out.println(person2);
		Person person3 = PersonFactory.getPerson("stud");
		System.out.println(person3);
	}

}
