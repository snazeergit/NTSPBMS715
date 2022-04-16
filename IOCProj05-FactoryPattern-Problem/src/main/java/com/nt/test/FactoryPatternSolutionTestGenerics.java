package com.nt.test;

import java.lang.reflect.InvocationTargetException;

import com.nt.comp.Customer;
import com.nt.comp.Employee;
import com.nt.comp.Student;
import com.nt.factory.PersonFactoryGenerics;

public class FactoryPatternSolutionTestGenerics {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Employee emp = PersonFactoryGenerics.getPerson(Employee.class);
		Student student = PersonFactoryGenerics.getPerson(Student.class);
		Customer customer = PersonFactoryGenerics.getPerson(Customer.class);
		System.out.println(emp);
		System.out.println(student);
		System.out.println(customer);
	}

}
