package com.nt.comps;

import org.springframework.stereotype.Component;

@Component("bDart")
public final class BlueDart implements Courier {
	public BlueDart() {
		System.out.println("BlueDart:: Zero-param constructor");
	}

	@Override
	public String deliver(int orderId) {
		return orderId + " order has been assigned to BlueDart for Delivery";
	}

}
