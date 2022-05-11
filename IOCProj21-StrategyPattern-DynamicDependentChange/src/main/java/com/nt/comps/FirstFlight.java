package com.nt.comps;

import org.springframework.stereotype.Component;

@Component("fFlight")
public final class FirstFlight implements Courier {
	public FirstFlight() {
		System.out.println("FirstFlight:: Zero-param constructor");
	}

	@Override
	public String deliver(int orderId) {
		// TODO Auto-generated method stub
		return orderId+" order has been assigned to FirstFlight for Delivery";
	}

}