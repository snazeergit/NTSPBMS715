package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fkrt")
public final class Flipkart {
	@Autowired
	@Qualifier("dPartner") //courier property has been injected with dtdc object as the dPartner is an alias name for ${courier.name} in bean cfg file and this place holder is having DTDC bean class id dtdc. 
	private Courier courier;   

	public Flipkart() {
		System.out.println("Flipkart:: Zero-param constructor");
	}

	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier(-)");
		this.courier = courier;
	}
	
	public String shopping(String[] items, double []prices) {
		System.out.println("FLipkart.shopping(--)");
		double billAmt=0.0;
		for (double d : prices) {
			billAmt+=d;
			//billAmt=billAmt+d;
		}
		int orderId = new Random().nextInt(1000000);
		String deliveryMsg = courier.deliver(orderId);
		return Arrays.toString(items)+" are purchased having bill amount "+billAmt+" --> "+deliveryMsg;
	}

}

