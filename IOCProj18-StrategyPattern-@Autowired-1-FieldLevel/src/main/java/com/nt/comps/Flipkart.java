package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public final class Flipkart {

	@Autowired
	@Qualifier("dtdc")
	private Courier courier;

	public Flipkart() {
		System.out.println("Flipkart:: Zero param Constructor:: @Autowired at Field level");
	}

	//Business method
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
