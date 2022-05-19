package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

// Please refer Nataraj sir notes on the date Class 39: 2nd May 2022
public final class Flipkart {

	private Courier courier; //This property is configured using all 3 techniques @Qualifier, Primary=true, byName matching(bean id matching) but @Qualifier will take effect  

	public Flipkart() {
		System.out.println("Flipkart:: Zero-param constructor");
	}

	//Constructor level
	@Autowired
	public Flipkart(@Qualifier("fflight") Courier courier) {
		System.out.println("Flipkart:: 1-param constructor::@Autowired at Constructor level");
		this.courier = courier;
	}

	public String shopping(String[] items, double[] prices) {
		System.out.println("FLipkart.shopping(--)");
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
