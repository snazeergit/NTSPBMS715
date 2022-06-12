package com.nt.test;

import com.nt.comp.AadharDetails;
import com.nt.comp.Customer;
import com.nt.comp.Employee;
import com.nt.comp.Student;

public class FactoryPatternProblemTest {

	public static void main(String[] args) {

		AadharDetails aadhar1 = new AadharDetails(12312L, 32, 7829930782L);
		Employee e1 = new Employee("Nazeer", "Nellore", aadhar1, "Dell", 75000.0);
		System.out.println(e1);

		AadharDetails aadhar2 = new AadharDetails(7896L, 23, 9823782L);
		Student s1 = new Student("Sridhar", "Guntur", aadhar2, "Java", 1220336);
		System.out.println(s1);
		
		AadharDetails aadhar3 =  new AadharDetails(4512L, 90, 8829930782L);
		Customer c1=new Customer("Ravi", "Bglr", aadhar3, 123, 1450.00);
		System.out.println(c1);

	}

}
