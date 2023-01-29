package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public final class Flipkart {
	/*Here we have configured courier property of FLipkart spring bean with setter and constructor injection and @Autowired(field level), 
	 then dependent bean that is configured with setter injection will take effect. 
	*/

	@Autowired
	@Qualifier("dtdc")
	private Courier courier;

	public Flipkart() {
		System.out.println("Flipkart:: Zero param Constructor");
	}

	//To support Constructor Injection
	public Flipkart(Courier courier) {
		System.out.println("Flipkart:: 1-Param Constructor:: Constructor Injection");
		this.courier = courier;
	}

	//To support Setter Injection
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier(-):: Setter Injection");
		this.courier = courier;
	}

	//Business method
	public String shopping(String[] items, double[] prices) {
		System.out.println("Flipkart.shopping(--)");
		double billAmt = 0.0;
		for (double d : prices) {
			billAmt += d;
			//billAmt=billAmt+d;
		}
		int orderId = new Random().nextInt(1000000);
		String deliveryMsg = courier.deliver(orderId);
		return Arrays.toString(items) + " are purchased having bill amount " + billAmt + " --> " + deliveryMsg;
	}

}
