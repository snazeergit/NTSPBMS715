package nit.java.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import nit.java.beans.Calculator;

public class CalculatorClient1 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class clazz = Class.forName("nit.java.beans.Calculator");
		Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
		
		declaredConstructors[0].setAccessible(true);
		Object instance = declaredConstructors[0].newInstance();
		Calculator cal = (Calculator) instance;
		cal.addition(20, 50);
		
		declaredConstructors[1].setAccessible(true);
		Object instance1 = declaredConstructors[1].newInstance(10, 20);
		Calculator cal1 = (Calculator) instance1;
		cal1.addition(20, 50);
	}
}