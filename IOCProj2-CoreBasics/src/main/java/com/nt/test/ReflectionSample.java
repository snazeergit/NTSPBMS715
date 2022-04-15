package com.nt.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSample {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		Class<?> c = Class.forName("com.nt.test.Test");// loads the Test class dynamically
		Object object1 = c.newInstance();// default constructor
		System.out.println("Object1: " + object1);

		Constructor<?>[] constructors = c.getDeclaredConstructors();
		Object object2 = constructors[0].newInstance();// default constructor
		System.out.println("Object2: " + object2);

		Object object3 = constructors[1].newInstance(10, 20);// 2-param constructor
		System.out.println("Object3: " + object3);

		/* Please note object1,object2,object3 are objects of "java.lang.Class" containing Test class details.
		If you print the above objects it prints Test class name but it can't call Test call specific 
		methods as the object belongs to Class so we need to type cast java.lang.Class object to 
		Test class in order to call	Test call specific methods. */

		Test1 t1 = (Test1) object3;
		System.out.println(t1.printSum());

	}

}
