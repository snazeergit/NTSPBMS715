package com.nt.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;

public class FlipkartFactory {

	private static Properties props;

	static {
		System.out.println("FlipkartFactory:: static block");
		try {
			props = new Properties();
			props.load(new FileInputStream("src/main/java/com/nt/commons/info.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Flipkart getInstance() throws Exception {

		System.out.println("FlipkartFactory::getInstance()");

		String courierClassName = props.getProperty("courier.classname");
		Class class1 = Class.forName(courierClassName);
		Constructor<Courier>[] constructors = class1.getDeclaredConstructors();
		Courier courier = constructors[0].newInstance();
		Flipkart flipkart = new Flipkart();
		flipkart.setCourier(courier);
		return flipkart;
	}
}
