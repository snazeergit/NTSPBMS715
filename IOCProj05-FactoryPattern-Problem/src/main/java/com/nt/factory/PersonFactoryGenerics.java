package com.nt.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.nt.comp.AadharDetails;
import com.nt.comp.Customer;
import com.nt.comp.Employee;
import com.nt.comp.Person;
import com.nt.comp.Student;

public class PersonFactoryGenerics {

	public static <T extends Person> T getPerson(Class<T> clazz)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Object obj = null;
		AadharDetails aadhar = null;
		Constructor[] constructors = clazz.getDeclaredConstructors();
		if (clazz == Employee.class) {
			aadhar = new AadharDetails(12312L, 32, 7829930782L);
			obj = constructors[0].newInstance("Nazeer", "Nellore", aadhar, "Dell", 75000.0);
		} else if (clazz == Student.class) {
			aadhar = new AadharDetails(7896L, 23, 9823782L);
			obj = constructors[0].newInstance("Sridhar", "Guntur", aadhar, "Java", 1220336);
		} else if (clazz == Customer.class) {
			aadhar = new AadharDetails(4512L, 90, 8829930782L);
			obj = constructors[0].newInstance("Ravi", "Bglr", aadhar, 123, 1450.00);
		} else {
			throw new IllegalArgumentException("Invalid Person Type");
		}
		return (T) obj;

	}
}
