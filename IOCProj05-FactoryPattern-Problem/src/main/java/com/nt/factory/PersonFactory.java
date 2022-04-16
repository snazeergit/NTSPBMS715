package com.nt.factory;

import com.nt.comp.AadharDetails;
import com.nt.comp.Customer;
import com.nt.comp.Employee;
import com.nt.comp.Person;
import com.nt.comp.Student;

public class PersonFactory {

	public static Person getPerson(String type) {
		Person per=null;
		AadharDetails aadhar=null;
		if(type.equalsIgnoreCase("emp")) {
			aadhar= new AadharDetails(12312L, 32, 7829930782L);
			per= new Employee("Nazeer", "Nellore", aadhar, "Dell", 75000.0);
		}
		else if(type.equalsIgnoreCase("stud")) {
			aadhar=  new AadharDetails(7896L, 23, 9823782L);
			per=new Student("Sridhar", "Guntur", aadhar, "Java", 1220336);
		}
		else if(type.equalsIgnoreCase("cust")) {
			aadhar= new AadharDetails(4512L, 90, 8829930782L);
			per= new Customer("Ravi", "Bglr", aadhar, 123, 1450.00);
		}
		else {
			throw new IllegalArgumentException("Invalid Person Type");
		}
		return per;
		
	}
}
